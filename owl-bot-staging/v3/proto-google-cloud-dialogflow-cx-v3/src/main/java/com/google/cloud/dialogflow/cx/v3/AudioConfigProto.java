// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/audio_config.proto

package com.google.cloud.dialogflow.cx.v3;

public final class AudioConfigProto {
  private AudioConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_SpeechWordInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SpeechWordInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_InputAudioConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_VoiceSelectionParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_SynthesizeSpeechConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_OutputAudioConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_OutputAudioConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/dialogflow/cx/v3/audio_co" +
      "nfig.proto\022\035google.cloud.dialogflow.cx.v" +
      "3\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032\036google/protobuf/d" +
      "uration.proto\032\034google/api/annotations.pr" +
      "oto\"\222\001\n\016SpeechWordInfo\022\014\n\004word\030\003 \001(\t\022/\n\014" +
      "start_offset\030\001 \001(\0132\031.google.protobuf.Dur" +
      "ation\022-\n\nend_offset\030\002 \001(\0132\031.google.proto" +
      "buf.Duration\022\022\n\nconfidence\030\004 \001(\002\"\233\002\n\020Inp" +
      "utAudioConfig\022I\n\016audio_encoding\030\001 \001(\0162,." +
      "google.cloud.dialogflow.cx.v3.AudioEncod" +
      "ingB\003\340A\002\022\031\n\021sample_rate_hertz\030\002 \001(\005\022\030\n\020e" +
      "nable_word_info\030\r \001(\010\022\024\n\014phrase_hints\030\004 " +
      "\003(\t\022\r\n\005model\030\007 \001(\t\022H\n\rmodel_variant\030\n \001(" +
      "\01621.google.cloud.dialogflow.cx.v3.Speech" +
      "ModelVariant\022\030\n\020single_utterance\030\010 \001(\010\"i" +
      "\n\024VoiceSelectionParams\022\014\n\004name\030\001 \001(\t\022C\n\013" +
      "ssml_gender\030\002 \001(\0162..google.cloud.dialogf" +
      "low.cx.v3.SsmlVoiceGender\"\266\001\n\026Synthesize" +
      "SpeechConfig\022\025\n\rspeaking_rate\030\001 \001(\001\022\r\n\005p" +
      "itch\030\002 \001(\001\022\026\n\016volume_gain_db\030\003 \001(\001\022\032\n\022ef" +
      "fects_profile_id\030\005 \003(\t\022B\n\005voice\030\004 \001(\01323." +
      "google.cloud.dialogflow.cx.v3.VoiceSelec" +
      "tionParams\"\330\001\n\021OutputAudioConfig\022O\n\016audi" +
      "o_encoding\030\001 \001(\01622.google.cloud.dialogfl" +
      "ow.cx.v3.OutputAudioEncodingB\003\340A\002\022\031\n\021sam" +
      "ple_rate_hertz\030\002 \001(\005\022W\n\030synthesize_speec" +
      "h_config\030\003 \001(\01325.google.cloud.dialogflow" +
      ".cx.v3.SynthesizeSpeechConfig*\373\001\n\rAudioE" +
      "ncoding\022\036\n\032AUDIO_ENCODING_UNSPECIFIED\020\000\022" +
      "\034\n\030AUDIO_ENCODING_LINEAR_16\020\001\022\027\n\023AUDIO_E" +
      "NCODING_FLAC\020\002\022\030\n\024AUDIO_ENCODING_MULAW\020\003" +
      "\022\026\n\022AUDIO_ENCODING_AMR\020\004\022\031\n\025AUDIO_ENCODI" +
      "NG_AMR_WB\020\005\022\033\n\027AUDIO_ENCODING_OGG_OPUS\020\006" +
      "\022)\n%AUDIO_ENCODING_SPEEX_WITH_HEADER_BYT" +
      "E\020\007*v\n\022SpeechModelVariant\022$\n SPEECH_MODE" +
      "L_VARIANT_UNSPECIFIED\020\000\022\026\n\022USE_BEST_AVAI" +
      "LABLE\020\001\022\020\n\014USE_STANDARD\020\002\022\020\n\014USE_ENHANCE" +
      "D\020\003*\215\001\n\017SsmlVoiceGender\022!\n\035SSML_VOICE_GE" +
      "NDER_UNSPECIFIED\020\000\022\032\n\026SSML_VOICE_GENDER_" +
      "MALE\020\001\022\034\n\030SSML_VOICE_GENDER_FEMALE\020\002\022\035\n\031" +
      "SSML_VOICE_GENDER_NEUTRAL\020\003*\354\001\n\023OutputAu" +
      "dioEncoding\022%\n!OUTPUT_AUDIO_ENCODING_UNS" +
      "PECIFIED\020\000\022#\n\037OUTPUT_AUDIO_ENCODING_LINE" +
      "AR_16\020\001\022\035\n\031OUTPUT_AUDIO_ENCODING_MP3\020\002\022%" +
      "\n!OUTPUT_AUDIO_ENCODING_MP3_64_KBPS\020\004\022\"\n" +
      "\036OUTPUT_AUDIO_ENCODING_OGG_OPUS\020\003\022\037\n\033OUT" +
      "PUT_AUDIO_ENCODING_MULAW\020\005B\240\001\n!com.googl" +
      "e.cloud.dialogflow.cx.v3B\020AudioConfigPro" +
      "toP\001Z?google.golang.org/genproto/googlea" +
      "pis/cloud/dialogflow/cx/v3;cx\370\001\001\242\002\002DF\252\002\035" +
      "Google.Cloud.Dialogflow.Cx.V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3_SpeechWordInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_SpeechWordInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_SpeechWordInfo_descriptor,
        new java.lang.String[] { "Word", "StartOffset", "EndOffset", "Confidence", });
    internal_static_google_cloud_dialogflow_cx_v3_InputAudioConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_InputAudioConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_InputAudioConfig_descriptor,
        new java.lang.String[] { "AudioEncoding", "SampleRateHertz", "EnableWordInfo", "PhraseHints", "Model", "ModelVariant", "SingleUtterance", });
    internal_static_google_cloud_dialogflow_cx_v3_VoiceSelectionParams_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_VoiceSelectionParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_VoiceSelectionParams_descriptor,
        new java.lang.String[] { "Name", "SsmlGender", });
    internal_static_google_cloud_dialogflow_cx_v3_SynthesizeSpeechConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_SynthesizeSpeechConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_SynthesizeSpeechConfig_descriptor,
        new java.lang.String[] { "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice", });
    internal_static_google_cloud_dialogflow_cx_v3_OutputAudioConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_OutputAudioConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_OutputAudioConfig_descriptor,
        new java.lang.String[] { "AudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
