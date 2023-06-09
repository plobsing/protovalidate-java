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

package build.buf.protovalidate.constraints;

import build.buf.validate.FieldConstraints;
import com.google.api.expr.v1alpha1.Type;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import org.projectnessie.cel.checker.Decls;

import java.util.HashMap;
import java.util.Map;

public class Lookups {
    public static final Descriptor FIELD_CONSTRAINTS_DESC = FieldConstraints.getDescriptor();
    public static final OneofDescriptor FIELD_CONSTRAINTS_ONEOF_DESC = FIELD_CONSTRAINTS_DESC.getOneofs().get(0);
    public static final FieldDescriptor MAP_FIELD_CONSTRAINTS_DESC = FIELD_CONSTRAINTS_DESC.findFieldByName("map");
    public static final FieldDescriptor REPEATED_FIELD_CONSTRAINTS_DESC = FIELD_CONSTRAINTS_DESC.findFieldByName("repeated");
    public static final Map<FieldDescriptor.Type, FieldDescriptor> EXPECTED_STANDARD_CONSTRAINTS = new HashMap<>();
    public static final Map<String, FieldDescriptor> EXPECTED_WKT_CONSTRAINTS = new HashMap<>();

    static {
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.FLOAT, FIELD_CONSTRAINTS_DESC.findFieldByName("float"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.DOUBLE, FIELD_CONSTRAINTS_DESC.findFieldByName("double"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.INT32, FIELD_CONSTRAINTS_DESC.findFieldByName("int32"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.INT64, FIELD_CONSTRAINTS_DESC.findFieldByName("int64"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.UINT32, FIELD_CONSTRAINTS_DESC.findFieldByName("uint32"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.UINT64, FIELD_CONSTRAINTS_DESC.findFieldByName("uint64"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.SINT32, FIELD_CONSTRAINTS_DESC.findFieldByName("sint32"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.SINT64, FIELD_CONSTRAINTS_DESC.findFieldByName("sint64"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.FIXED32, FIELD_CONSTRAINTS_DESC.findFieldByName("fixed32"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.FIXED64, FIELD_CONSTRAINTS_DESC.findFieldByName("fixed64"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.SFIXED32, FIELD_CONSTRAINTS_DESC.findFieldByName("sfixed32"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.SFIXED64, FIELD_CONSTRAINTS_DESC.findFieldByName("sfixed64"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.BOOL, FIELD_CONSTRAINTS_DESC.findFieldByName("bool"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.STRING, FIELD_CONSTRAINTS_DESC.findFieldByName("string"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.BYTES, FIELD_CONSTRAINTS_DESC.findFieldByName("bytes"));
        EXPECTED_STANDARD_CONSTRAINTS.put(FieldDescriptor.Type.ENUM, FIELD_CONSTRAINTS_DESC.findFieldByName("enum"));

        EXPECTED_WKT_CONSTRAINTS.put("google.protobuf.Any", FIELD_CONSTRAINTS_DESC.findFieldByName("any"));
        EXPECTED_WKT_CONSTRAINTS.put("google.protobuf.Duration", FIELD_CONSTRAINTS_DESC.findFieldByName("duration"));
        EXPECTED_WKT_CONSTRAINTS.put("google.protobuf.Timestamp", FIELD_CONSTRAINTS_DESC.findFieldByName("timestamp"));
    }

    public static FieldDescriptor expectedWrapperConstraints(String fqn) {
        switch (fqn) {
            case "google.protobuf.BoolValue":
                return EXPECTED_STANDARD_CONSTRAINTS.get(FieldDescriptor.Type.BOOL);
            case "google.protobuf.BytesValue":
                return EXPECTED_STANDARD_CONSTRAINTS.get(FieldDescriptor.Type.BYTES);
            case "google.protobuf.DoubleValue":
                return EXPECTED_STANDARD_CONSTRAINTS.get(FieldDescriptor.Type.DOUBLE);
            case "google.protobuf.FloatValue":
                return EXPECTED_STANDARD_CONSTRAINTS.get(FieldDescriptor.Type.FLOAT);
            case "google.protobuf.Int32Value":
                return EXPECTED_STANDARD_CONSTRAINTS.get(FieldDescriptor.Type.INT32);
            case "google.protobuf.Int64Value":
                return EXPECTED_STANDARD_CONSTRAINTS.get(FieldDescriptor.Type.INT64);
            case "google.protobuf.StringValue":
                return EXPECTED_STANDARD_CONSTRAINTS.get(FieldDescriptor.Type.STRING);
            case "google.protobuf.UInt32Value":
                return EXPECTED_STANDARD_CONSTRAINTS.get(FieldDescriptor.Type.UINT32);
            case "google.protobuf.UInt64Value":
                return EXPECTED_STANDARD_CONSTRAINTS.get(FieldDescriptor.Type.UINT64);
            default:
                return null;
        }
    }

    // TODO: work this out
    public static Type protoKindToCELType(FieldDescriptor.Type kind) {
        switch (kind) {
            case FLOAT:
            case DOUBLE:
                return Decls.newPrimitiveType(Type.PrimitiveType.DOUBLE);
            case INT32:
            case INT64:
            case SINT32:
            case SINT64:
            case SFIXED32:
            case SFIXED64:
            case ENUM:
                return Decls.newPrimitiveType(Type.PrimitiveType.INT64);
            case UINT32:
            case UINT64:
            case FIXED32:
            case FIXED64:
                return Decls.newPrimitiveType(Type.PrimitiveType.UINT64);
            case BOOL:
                return Decls.newPrimitiveType(Type.PrimitiveType.BOOL);
            case STRING:
                return Decls.newPrimitiveType(Type.PrimitiveType.STRING);
            case BYTES:
                return Decls.newPrimitiveType(Type.PrimitiveType.BYTES);
            case MESSAGE:
            case GROUP:
                return Type.newBuilder()
                        .setMessageType(kind.getJavaType().name())
                        .build();
            default:
                // TODO: this doesnt feel right
                return Type.newBuilder()
                        .setPrimitive(Type.PrimitiveType.PRIMITIVE_TYPE_UNSPECIFIED)
                        .build();
        }
    }
}
