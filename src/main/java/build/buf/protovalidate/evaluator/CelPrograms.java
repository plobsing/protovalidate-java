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
import build.buf.protovalidate.expression.ProgramSet;
import com.google.protobuf.Message;

public class CelPrograms implements Evaluator, MessageEvaluator {
    private final ProgramSet programSet;

    // assuming the equivalent of the Go `expression.ProgramSet` in Java is a List of some sort
    public CelPrograms(ProgramSet programSet) {
        // TODO: remove? or keep? used in dev
        if (programSet == null) {
            throw new IllegalArgumentException("programSet cannot be null");
        }
        this.programSet = programSet;
    }

    public boolean tautology() {
        return programSet.isEmpty();
    }

    @Override
    public ValidationResult evaluate(JavaValue val, boolean failFast) {
        ValidationError error = programSet.evalValue(val, failFast);
        return new ValidationResult(error);
    }

    @Override
    public void append(Evaluator eval) {
        throw new UnsupportedOperationException("append not supported for CelPrograms");
    }

    @Override
    public ValidationResult evaluateMessage(Message val, boolean failFast) throws ValidationError {
        ValidationError eval = programSet.evalMessage(val, failFast);
        if (eval != null) {
            return new ValidationResult(eval);
        }
        return ValidationResult.success();
    }

    @Override
    public void append(MessageEvaluator eval) {
        throw new UnsupportedOperationException("append not supported for CelPrograms");
    }
}
