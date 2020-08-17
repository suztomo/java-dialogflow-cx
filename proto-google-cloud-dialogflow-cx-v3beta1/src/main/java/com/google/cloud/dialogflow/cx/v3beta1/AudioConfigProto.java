/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/audio_config.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class AudioConfigProto {
  private AudioConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechWordInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechWordInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_InputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SynthesizeSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_OutputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_OutputAudioConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/dialogflow/cx/v3beta1/aud"
          + "io_config.proto\022\"google.cloud.dialogflow"
          + ".cx.v3beta1\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032\036google/"
          + "protobuf/duration.proto\032\034google/api/anno"
          + "tations.proto\"\222\001\n\016SpeechWordInfo\022\014\n\004word"
          + "\030\003 \001(\t\022/\n\014start_offset\030\001 \001(\0132\031.google.pr"
          + "otobuf.Duration\022-\n\nend_offset\030\002 \001(\0132\031.go"
          + "ogle.protobuf.Duration\022\022\n\nconfidence\030\004 \001"
          + "(\002\"\245\002\n\020InputAudioConfig\022N\n\016audio_encodin"
          + "g\030\001 \001(\01621.google.cloud.dialogflow.cx.v3b"
          + "eta1.AudioEncodingB\003\340A\002\022\031\n\021sample_rate_h"
          + "ertz\030\002 \001(\005\022\030\n\020enable_word_info\030\r \001(\010\022\024\n\014"
          + "phrase_hints\030\004 \003(\t\022\r\n\005model\030\007 \001(\t\022M\n\rmod"
          + "el_variant\030\n \001(\01626.google.cloud.dialogfl"
          + "ow.cx.v3beta1.SpeechModelVariant\022\030\n\020sing"
          + "le_utterance\030\010 \001(\010\"n\n\024VoiceSelectionPara"
          + "ms\022\014\n\004name\030\001 \001(\t\022H\n\013ssml_gender\030\002 \001(\01623."
          + "google.cloud.dialogflow.cx.v3beta1.SsmlV"
          + "oiceGender\"\273\001\n\026SynthesizeSpeechConfig\022\025\n"
          + "\rspeaking_rate\030\001 \001(\001\022\r\n\005pitch\030\002 \001(\001\022\026\n\016v"
          + "olume_gain_db\030\003 \001(\001\022\032\n\022effects_profile_i"
          + "d\030\005 \003(\t\022G\n\005voice\030\004 \001(\01328.google.cloud.di"
          + "alogflow.cx.v3beta1.VoiceSelectionParams"
          + "\"\342\001\n\021OutputAudioConfig\022T\n\016audio_encoding"
          + "\030\001 \001(\01627.google.cloud.dialogflow.cx.v3be"
          + "ta1.OutputAudioEncodingB\003\340A\002\022\031\n\021sample_r"
          + "ate_hertz\030\002 \001(\005\022\\\n\030synthesize_speech_con"
          + "fig\030\003 \001(\0132:.google.cloud.dialogflow.cx.v"
          + "3beta1.SynthesizeSpeechConfig*\373\001\n\rAudioE"
          + "ncoding\022\036\n\032AUDIO_ENCODING_UNSPECIFIED\020\000\022"
          + "\034\n\030AUDIO_ENCODING_LINEAR_16\020\001\022\027\n\023AUDIO_E"
          + "NCODING_FLAC\020\002\022\030\n\024AUDIO_ENCODING_MULAW\020\003"
          + "\022\026\n\022AUDIO_ENCODING_AMR\020\004\022\031\n\025AUDIO_ENCODI"
          + "NG_AMR_WB\020\005\022\033\n\027AUDIO_ENCODING_OGG_OPUS\020\006"
          + "\022)\n%AUDIO_ENCODING_SPEEX_WITH_HEADER_BYT"
          + "E\020\007*v\n\022SpeechModelVariant\022$\n SPEECH_MODE"
          + "L_VARIANT_UNSPECIFIED\020\000\022\026\n\022USE_BEST_AVAI"
          + "LABLE\020\001\022\020\n\014USE_STANDARD\020\002\022\020\n\014USE_ENHANCE"
          + "D\020\003*\215\001\n\017SsmlVoiceGender\022!\n\035SSML_VOICE_GE"
          + "NDER_UNSPECIFIED\020\000\022\032\n\026SSML_VOICE_GENDER_"
          + "MALE\020\001\022\034\n\030SSML_VOICE_GENDER_FEMALE\020\002\022\035\n\031"
          + "SSML_VOICE_GENDER_NEUTRAL\020\003*\354\001\n\023OutputAu"
          + "dioEncoding\022%\n!OUTPUT_AUDIO_ENCODING_UNS"
          + "PECIFIED\020\000\022#\n\037OUTPUT_AUDIO_ENCODING_LINE"
          + "AR_16\020\001\022\035\n\031OUTPUT_AUDIO_ENCODING_MP3\020\002\022%"
          + "\n!OUTPUT_AUDIO_ENCODING_MP3_64_KBPS\020\004\022\"\n"
          + "\036OUTPUT_AUDIO_ENCODING_OGG_OPUS\020\003\022\037\n\033OUT"
          + "PUT_AUDIO_ENCODING_MULAW\020\005B\257\001\n&com.googl"
          + "e.cloud.dialogflow.cx.v3beta1B\020AudioConf"
          + "igProtoP\001ZDgoogle.golang.org/genproto/go"
          + "ogleapis/cloud/dialogflow/cx/v3beta1;cx\370"
          + "\001\001\242\002\002DF\252\002\"Google.Cloud.Dialogflow.Cx.V3B"
          + "eta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechWordInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechWordInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechWordInfo_descriptor,
            new java.lang.String[] {
              "Word", "StartOffset", "EndOffset", "Confidence",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_InputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_InputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_InputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SampleRateHertz",
              "EnableWordInfo",
              "PhraseHints",
              "Model",
              "ModelVariant",
              "SingleUtterance",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "Name", "SsmlGender",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SynthesizeSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SynthesizeSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SynthesizeSpeechConfig_descriptor,
            new java.lang.String[] {
              "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_OutputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_OutputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_OutputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfig",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
