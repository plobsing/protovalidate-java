// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tests/example/v1/validations.proto

package build.tests.example.v1;

public interface SelfRecursiveOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tests.example.v1.SelfRecursive)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 x = 1 [json_name = "x"];</code>
   * @return The x.
   */
  int getX();

  /**
   * <code>.tests.example.v1.SelfRecursive turtle = 2 [json_name = "turtle", (.buf.validate.field) = { ... }</code>
   * @return Whether the turtle field is set.
   */
  boolean hasTurtle();
  /**
   * <code>.tests.example.v1.SelfRecursive turtle = 2 [json_name = "turtle", (.buf.validate.field) = { ... }</code>
   * @return The turtle.
   */
  build.tests.example.v1.SelfRecursive getTurtle();
  /**
   * <code>.tests.example.v1.SelfRecursive turtle = 2 [json_name = "turtle", (.buf.validate.field) = { ... }</code>
   */
  build.tests.example.v1.SelfRecursiveOrBuilder getTurtleOrBuilder();
}
