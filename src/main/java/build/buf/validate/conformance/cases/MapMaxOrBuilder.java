// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/maps.proto

package build.buf.validate.conformance.cases;

public interface MapMaxOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.MapMax)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;int64, double&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  int getValCount();
  /**
   * <code>map&lt;int64, double&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  boolean containsVal(
      long key);
  /**
   * Use {@link #getValMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, java.lang.Double>
  getVal();
  /**
   * <code>map&lt;int64, double&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  java.util.Map<java.lang.Long, java.lang.Double>
  getValMap();
  /**
   * <code>map&lt;int64, double&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  double getValOrDefault(
      long key,
      double defaultValue);
  /**
   * <code>map&lt;int64, double&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  double getValOrThrow(
      long key);
}
