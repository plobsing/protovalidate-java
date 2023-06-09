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

package build.buf.protovalidate.errors;

public class CompilationError extends RuntimeException {

    private final Exception cause;

    public CompilationError(Exception cause) {
        super("compilation error: " + cause.getMessage());
        this.cause = cause;
    }

    public static CompilationError newCompilationError(Exception cause) {
        return new CompilationError(cause);
    }

    public static CompilationError newCompilationError(String format, Object... args) {
        return new CompilationError(new Exception(String.format(format, args)));
    }

    @Override
    public synchronized Throwable getCause() {
        return this.cause;
    }
}