// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/wkt_any.proto

package build.buf.validate.conformance.cases;

public final class WktAnyProto {
  private WktAnyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_AnyNone_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_AnyNone_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_AnyRequired_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_AnyRequired_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_AnyIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_AnyIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_AnyNotIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_AnyNotIn_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,buf/validate/conformance/cases/wkt_any" +
      ".proto\022\036buf.validate.conformance.cases\032\033" +
      "buf/validate/validate.proto\032\031google/prot" +
      "obuf/any.proto\"1\n\007AnyNone\022&\n\003val\030\001 \001(\0132\024" +
      ".google.protobuf.AnyR\003val\">\n\013AnyRequired" +
      "\022/\n\003val\030\001 \001(\0132\024.google.protobuf.AnyB\007\372\367\030" +
      "\003\310\001\001R\003val\"f\n\005AnyIn\022]\n\003val\030\001 \001(\0132\024.google" +
      ".protobuf.AnyB5\372\367\0301\242\001.\022,type.googleapis." +
      "com/google.protobuf.DurationR\003val\"j\n\010Any" +
      "NotIn\022^\n\003val\030\001 \001(\0132\024.google.protobuf.Any" +
      "B6\372\367\0302\242\001/\032-type.googleapis.com/google.pr" +
      "otobuf.TimestampR\003valB\317\001\n$build.buf.vali" +
      "date.conformance.casesB\013WktAnyProtoP\001\242\002\004" +
      "BVCC\252\002\036Buf.Validate.Conformance.Cases\312\002\036" +
      "Buf\\Validate\\Conformance\\Cases\342\002*Buf\\Val" +
      "idate\\Conformance\\Cases\\GPBMetadata\352\002!Bu" +
      "f::Validate::Conformance::Casesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.ValidateProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_buf_validate_conformance_cases_AnyNone_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buf_validate_conformance_cases_AnyNone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_AnyNone_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_AnyRequired_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_buf_validate_conformance_cases_AnyRequired_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_AnyRequired_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_AnyIn_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_buf_validate_conformance_cases_AnyIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_AnyIn_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_AnyNotIn_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_buf_validate_conformance_cases_AnyNotIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_AnyNotIn_descriptor,
        new java.lang.String[] { "Val", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
