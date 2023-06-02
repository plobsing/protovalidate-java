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

import dev.cel.common.CelAbstractSyntaxTree;
import dev.cel.common.CelOptions;
import dev.cel.runtime.CelRuntime;

public class CompiledAst {
    private CelAbstractSyntaxTree ast;
    private Expression source;

    public CompiledAst(CelAbstractSyntaxTree ast, Expression source) {
        this.ast = ast;
        this.source = source;
    }

    public CompiledProgram toProgram(CelRuntime env, CelOptions... opts) throws Exception {
        return null;
    }
}