// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/harness/results.proto

package build.buf.validate.conformance.harness;

public interface SuiteResultsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.harness.SuiteResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 successes = 2 [json_name = "successes"];</code>
   * @return The successes.
   */
  int getSuccesses();

  /**
   * <code>int32 failures = 3 [json_name = "failures"];</code>
   * @return The failures.
   */
  int getFailures();

  /**
   * <code>repeated .buf.validate.conformance.harness.CaseResult cases = 4 [json_name = "cases"];</code>
   */
  java.util.List<build.buf.validate.conformance.harness.CaseResult> 
      getCasesList();
  /**
   * <code>repeated .buf.validate.conformance.harness.CaseResult cases = 4 [json_name = "cases"];</code>
   */
  build.buf.validate.conformance.harness.CaseResult getCases(int index);
  /**
   * <code>repeated .buf.validate.conformance.harness.CaseResult cases = 4 [json_name = "cases"];</code>
   */
  int getCasesCount();
  /**
   * <code>repeated .buf.validate.conformance.harness.CaseResult cases = 4 [json_name = "cases"];</code>
   */
  java.util.List<? extends build.buf.validate.conformance.harness.CaseResultOrBuilder> 
      getCasesOrBuilderList();
  /**
   * <code>repeated .buf.validate.conformance.harness.CaseResult cases = 4 [json_name = "cases"];</code>
   */
  build.buf.validate.conformance.harness.CaseResultOrBuilder getCasesOrBuilder(
      int index);
}