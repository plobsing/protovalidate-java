// Copyright 2023 Buf Technologies, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buf.protovalidate.evaluator;

import build.buf.protovalidate.ValidationResult;
import build.buf.protovalidate.errors.ValidationError;
import build.buf.validate.Violation;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DynamicMessage;

import java.util.HashMap;
import java.util.Map;

public class Any implements Evaluator {
    private final Descriptors.FieldDescriptor typeURLDescriptor;
    private final Map<String, Object> in;
    private final Map<String, Object> notIn;

    public Any(Descriptors.FieldDescriptor typeURLDescriptor, String[] in, String[] notIn) {
        this.typeURLDescriptor = typeURLDescriptor;
        this.in = stringsToMap(in);
        this.notIn = stringsToMap(notIn);
    }

    private static Map<String, Object> stringsToMap(String[] strings) {
        if (strings == null || strings.length == 0) {
            return null;
        }
        Map<String, Object> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, new Object());
        }
        return map;
    }

    @Override
    public ValidationResult evaluate(DynamicMessage val, boolean failFast) {
        String typeURL = (String) val.getField(typeURLDescriptor);

        ValidationError validationError = new ValidationError();
        if (in != null && in.size() > 0) {
            if (!in.containsKey(typeURL)) {
                Violation.Builder violation = Violation.newBuilder();
                violation.setConstraintId("any.in");
                violation.setMessage("type URL must be in the allow list");
                validationError.addViolation(violation.build());
                if (failFast) {
                    return new ValidationResult(validationError);
                }
            }
        }

        if (notIn != null && notIn.size() > 0) {
            if (notIn.containsKey(typeURL)) {
                Violation.Builder violation = Violation.newBuilder();
                violation.setConstraintId("any.not_in");
                violation.setMessage("type URL must not be in the block list");
                validationError.addViolation(violation.build());
            }
        }
        return new ValidationResult(validationError);
    }

    @Override
    public void append(Evaluator eval) {
        throw new UnsupportedOperationException("append not supported for Any");
    }

    @Override
    public boolean tautology() {
        return (in == null || in.size() == 0) && (notIn == null || notIn.size() == 0);
    }
}