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

package build.buf.protovalidate.Expression;

import build.buf.validate.Violation;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Value;
import dev.cel.common.ast.CelReference;
import dev.cel.expr.Expr;
import dev.cel.expr.ExprValue;
import dev.cel.runtime.Activation;
import dev.cel.runtime.CelRuntime;
import dev.cel.runtime.Interpreter;

class CompiledProgram {
    private CelRuntime.Program program;
    private Expression source;

    public CompiledProgram(CelRuntime.Program program, Expression source) {
        this.program = program;
        this.source = source;
    }

    public Violation eval(Activation bindings) throws Exception {
        return null;
    }
}