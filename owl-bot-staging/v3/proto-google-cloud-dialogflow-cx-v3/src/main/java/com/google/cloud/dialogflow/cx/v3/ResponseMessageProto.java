// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/response_message.proto

package com.google.cloud.dialogflow.cx.v3;

public final class ResponseMessageProto {
  private ResponseMessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_Text_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_Text_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_LiveAgentHandoff_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_LiveAgentHandoff_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_ConversationSuccess_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_ConversationSuccess_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_OutputAudioText_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_OutputAudioText_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_EndInteraction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_EndInteraction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_PlayAudio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_PlayAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_MixedAudio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_MixedAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_MixedAudio_Segment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_MixedAudio_Segment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/dialogflow/cx/v3/response" +
      "_message.proto\022\035google.cloud.dialogflow." +
      "cx.v3\032\037google/api/field_behavior.proto\032\034" +
      "google/protobuf/struct.proto\032\034google/api" +
      "/annotations.proto\"\205\n\n\017ResponseMessage\022C" +
      "\n\004text\030\001 \001(\01323.google.cloud.dialogflow.c" +
      "x.v3.ResponseMessage.TextH\000\022*\n\007payload\030\002" +
      " \001(\0132\027.google.protobuf.StructH\000\022b\n\024conve" +
      "rsation_success\030\t \001(\0132B.google.cloud.dia" +
      "logflow.cx.v3.ResponseMessage.Conversati" +
      "onSuccessH\000\022[\n\021output_audio_text\030\010 \001(\0132>" +
      ".google.cloud.dialogflow.cx.v3.ResponseM" +
      "essage.OutputAudioTextH\000\022]\n\022live_agent_h" +
      "andoff\030\n \001(\0132?.google.cloud.dialogflow.c" +
      "x.v3.ResponseMessage.LiveAgentHandoffH\000\022" +
      "]\n\017end_interaction\030\013 \001(\0132=.google.cloud." +
      "dialogflow.cx.v3.ResponseMessage.EndInte" +
      "ractionB\003\340A\003H\000\022N\n\nplay_audio\030\014 \001(\01328.goo" +
      "gle.cloud.dialogflow.cx.v3.ResponseMessa" +
      "ge.PlayAudioH\000\022U\n\013mixed_audio\030\r \001(\01329.go" +
      "ogle.cloud.dialogflow.cx.v3.ResponseMess" +
      "age.MixedAudioB\003\340A\003H\000\032C\n\004Text\022\021\n\004text\030\001 " +
      "\003(\tB\003\340A\002\022(\n\033allow_playback_interruption\030" +
      "\002 \001(\010B\003\340A\003\032=\n\020LiveAgentHandoff\022)\n\010metada" +
      "ta\030\001 \001(\0132\027.google.protobuf.Struct\032@\n\023Con" +
      "versationSuccess\022)\n\010metadata\030\001 \001(\0132\027.goo" +
      "gle.protobuf.Struct\032e\n\017OutputAudioText\022\016" +
      "\n\004text\030\001 \001(\tH\000\022\016\n\004ssml\030\002 \001(\tH\000\022(\n\033allow_" +
      "playback_interruption\030\003 \001(\010B\003\340A\003B\010\n\006sour" +
      "ce\032\020\n\016EndInteraction\032M\n\tPlayAudio\022\026\n\taud" +
      "io_uri\030\001 \001(\tB\003\340A\002\022(\n\033allow_playback_inte" +
      "rruption\030\002 \001(\010B\003\340A\003\032\301\001\n\nMixedAudio\022S\n\010se" +
      "gments\030\001 \003(\0132A.google.cloud.dialogflow.c" +
      "x.v3.ResponseMessage.MixedAudio.Segment\032" +
      "^\n\007Segment\022\017\n\005audio\030\001 \001(\014H\000\022\r\n\003uri\030\002 \001(\t" +
      "H\000\022(\n\033allow_playback_interruption\030\003 \001(\010B" +
      "\003\340A\003B\t\n\007contentB\t\n\007messageB\310\001\n!com.googl" +
      "e.cloud.dialogflow.cx.v3B\024ResponseMessag" +
      "eProtoP\001Z?google.golang.org/genproto/goo" +
      "gleapis/cloud/dialogflow/cx/v3;cx\370\001\001\242\002\002D" +
      "F\252\002\035Google.Cloud.Dialogflow.Cx.V3\352\002!Goog" +
      "le::Cloud::Dialogflow::CX::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_descriptor,
        new java.lang.String[] { "Text", "Payload", "ConversationSuccess", "OutputAudioText", "LiveAgentHandoff", "EndInteraction", "PlayAudio", "MixedAudio", "Message", });
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_Text_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_Text_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_Text_descriptor,
        new java.lang.String[] { "Text", "AllowPlaybackInterruption", });
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_LiveAgentHandoff_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_LiveAgentHandoff_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_LiveAgentHandoff_descriptor,
        new java.lang.String[] { "Metadata", });
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_ConversationSuccess_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_ConversationSuccess_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_ConversationSuccess_descriptor,
        new java.lang.String[] { "Metadata", });
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_OutputAudioText_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_OutputAudioText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_OutputAudioText_descriptor,
        new java.lang.String[] { "Text", "Ssml", "AllowPlaybackInterruption", "Source", });
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_EndInteraction_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_EndInteraction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_EndInteraction_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_PlayAudio_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_PlayAudio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_PlayAudio_descriptor,
        new java.lang.String[] { "AudioUri", "AllowPlaybackInterruption", });
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_MixedAudio_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_MixedAudio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_MixedAudio_descriptor,
        new java.lang.String[] { "Segments", });
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_MixedAudio_Segment_descriptor =
      internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_MixedAudio_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_MixedAudio_Segment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ResponseMessage_MixedAudio_Segment_descriptor,
        new java.lang.String[] { "Audio", "Uri", "AllowPlaybackInterruption", "Content", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
