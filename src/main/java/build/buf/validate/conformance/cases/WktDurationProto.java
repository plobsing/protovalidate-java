// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/wkt_duration.proto

package build.buf.validate.conformance.cases;

public final class WktDurationProto {
  private WktDurationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationNone_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationNone_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationRequired_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationRequired_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationConst_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationConst_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationNotIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationNotIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationLT_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationLT_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationLTE_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationLTE_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationGT_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationGT_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationGTE_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationGTE_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationGTLT_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationGTLT_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationExLTGT_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationExLTGT_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationGTELTE_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationGTELTE_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationExGTELTE_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationExGTELTE_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_DurationFieldWithOtherFields_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_DurationFieldWithOtherFields_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1buf/validate/conformance/cases/wkt_dur" +
      "ation.proto\022\036buf.validate.conformance.ca" +
      "ses\032\033buf/validate/validate.proto\032\036google" +
      "/protobuf/duration.proto\";\n\014DurationNone" +
      "\022+\n\003val\030\001 \001(\0132\031.google.protobuf.Duration" +
      "R\003val\"H\n\020DurationRequired\0224\n\003val\030\001 \001(\0132\031" +
      ".google.protobuf.DurationB\007\372\367\030\003\310\001\001R\003val\"" +
      "I\n\rDurationConst\0228\n\003val\030\001 \001(\0132\031.google.p" +
      "rotobuf.DurationB\013\372\367\030\007\252\001\004\022\002\010\003R\003val\"K\n\nDu" +
      "rationIn\022=\n\003val\030\001 \001(\0132\031.google.protobuf." +
      "DurationB\020\372\367\030\014\252\001\t:\002\010\001:\003\020\350\007R\003val\"G\n\rDurat" +
      "ionNotIn\0226\n\003val\030\001 \001(\0132\031.google.protobuf." +
      "DurationB\t\372\367\030\005\252\001\002B\000R\003val\"D\n\nDurationLT\0226" +
      "\n\003val\030\001 \001(\0132\031.google.protobuf.DurationB\t" +
      "\372\367\030\005\252\001\002\032\000R\003val\"G\n\013DurationLTE\0228\n\003val\030\001 \001" +
      "(\0132\031.google.protobuf.DurationB\013\372\367\030\007\252\001\004\"\002" +
      "\010\001R\003val\"G\n\nDurationGT\0229\n\003val\030\001 \001(\0132\031.goo" +
      "gle.protobuf.DurationB\014\372\367\030\010\252\001\005*\003\020\350\007R\003val" +
      "\"I\n\013DurationGTE\022:\n\003val\030\001 \001(\0132\031.google.pr" +
      "otobuf.DurationB\r\372\367\030\t\252\001\0062\004\020\300\204=R\003val\"J\n\014D" +
      "urationGTLT\022:\n\003val\030\001 \001(\0132\031.google.protob" +
      "uf.DurationB\r\372\367\030\t\252\001\006\032\002\010\001*\000R\003val\"L\n\016Durat" +
      "ionExLTGT\022:\n\003val\030\001 \001(\0132\031.google.protobuf" +
      ".DurationB\r\372\367\030\t\252\001\006\032\000*\002\010\001R\003val\"O\n\016Duratio" +
      "nGTELTE\022=\n\003val\030\001 \001(\0132\031.google.protobuf.D" +
      "urationB\020\372\367\030\014\252\001\t\"\003\010\220\0342\002\010<R\003val\"Q\n\020Durati" +
      "onExGTELTE\022=\n\003val\030\001 \001(\0132\031.google.protobu" +
      "f.DurationB\020\372\367\030\014\252\001\t\"\002\010<2\003\010\220\034R\003val\"\214\001\n\034Du" +
      "rationFieldWithOtherFields\022I\n\014duration_v" +
      "al\030\001 \001(\0132\031.google.protobuf.DurationB\013\372\367\030" +
      "\007\252\001\004\"\002\010\001R\013durationVal\022!\n\007int_val\030\002 \001(\005B\010" +
      "\372\367\030\004\032\002 \020R\006intValB\324\001\n$build.buf.validate." +
      "conformance.casesB\020WktDurationProtoP\001\242\002\004" +
      "BVCC\252\002\036Buf.Validate.Conformance.Cases\312\002\036" +
      "Buf\\Validate\\Conformance\\Cases\342\002*Buf\\Val" +
      "idate\\Conformance\\Cases\\GPBMetadata\352\002!Bu" +
      "f::Validate::Conformance::Casesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.ValidateProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_buf_validate_conformance_cases_DurationNone_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buf_validate_conformance_cases_DurationNone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationNone_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationRequired_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_buf_validate_conformance_cases_DurationRequired_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationRequired_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationConst_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_buf_validate_conformance_cases_DurationConst_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationConst_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationIn_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_buf_validate_conformance_cases_DurationIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationIn_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationNotIn_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_buf_validate_conformance_cases_DurationNotIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationNotIn_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationLT_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_buf_validate_conformance_cases_DurationLT_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationLT_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationLTE_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_buf_validate_conformance_cases_DurationLTE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationLTE_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationGT_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_buf_validate_conformance_cases_DurationGT_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationGT_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationGTE_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_buf_validate_conformance_cases_DurationGTE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationGTE_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationGTLT_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_buf_validate_conformance_cases_DurationGTLT_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationGTLT_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationExLTGT_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_buf_validate_conformance_cases_DurationExLTGT_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationExLTGT_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationGTELTE_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_buf_validate_conformance_cases_DurationGTELTE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationGTELTE_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationExGTELTE_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_buf_validate_conformance_cases_DurationExGTELTE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationExGTELTE_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_DurationFieldWithOtherFields_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_buf_validate_conformance_cases_DurationFieldWithOtherFields_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_DurationFieldWithOtherFields_descriptor,
        new java.lang.String[] { "DurationVal", "IntVal", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
