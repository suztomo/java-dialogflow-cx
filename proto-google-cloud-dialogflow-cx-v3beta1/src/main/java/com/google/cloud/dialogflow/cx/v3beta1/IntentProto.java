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
// source: google/cloud/dialogflow/cx/v3beta1/intent.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class IntentProto {
  private IntentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_Part_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_Part_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteIntentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/dialogflow/cx/v3beta1/int"
          + "ent.proto\022\"google.cloud.dialogflow.cx.v3"
          + "beta1\032\034google/api/annotations.proto\032\027goo"
          + "gle/api/client.proto\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032#google/longrunning/operations.proto\032\033g"
          + "oogle/protobuf/empty.proto\032 google/proto"
          + "buf/field_mask.proto\032\037google/protobuf/ti"
          + "mestamp.proto\"\260\006\n\006Intent\022\014\n\004name\030\001 \001(\t\022\031"
          + "\n\014display_name\030\002 \001(\tB\003\340A\002\022S\n\020training_ph"
          + "rases\030\003 \003(\01329.google.cloud.dialogflow.cx"
          + ".v3beta1.Intent.TrainingPhrase\022H\n\nparame"
          + "ters\030\004 \003(\01324.google.cloud.dialogflow.cx."
          + "v3beta1.Intent.Parameter\022\020\n\010priority\030\005 \001"
          + "(\005\022\023\n\013is_fallback\030\006 \001(\010\022F\n\006labels\030\007 \003(\0132"
          + "6.google.cloud.dialogflow.cx.v3beta1.Int"
          + "ent.LabelsEntry\022\023\n\013description\030\010 \001(\t\032\267\001\n"
          + "\016TrainingPhrase\022\n\n\002id\030\001 \001(\t\022R\n\005parts\030\002 \003"
          + "(\0132>.google.cloud.dialogflow.cx.v3beta1."
          + "Intent.TrainingPhrase.PartB\003\340A\002\022\024\n\014repea"
          + "t_count\030\003 \001(\005\032/\n\004Part\022\021\n\004text\030\001 \001(\tB\003\340A\002"
          + "\022\024\n\014parameter_id\030\002 \001(\t\032\200\001\n\tParameter\022\017\n\002"
          + "id\030\001 \001(\tB\003\340A\002\022A\n\013entity_type\030\002 \001(\tB,\340A\002\372"
          + "A&\n$dialogflow.googleapis.com/EntityType"
          + "\022\017\n\007is_list\030\003 \001(\010\022\016\n\006redact\030\004 \001(\010\032-\n\013Lab"
          + "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001"
          + ":n\352Ak\n dialogflow.googleapis.com/Intent\022"
          + "Gprojects/{project}/locations/{location}"
          + "/agents/{agent}/intents/{intent}\"\321\001\n\022Lis"
          + "tIntentsRequest\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\"\022"
          + " dialogflow.googleapis.com/Intent\022\025\n\rlan"
          + "guage_code\030\002 \001(\t\022C\n\013intent_view\030\005 \001(\0162.."
          + "google.cloud.dialogflow.cx.v3beta1.Inten"
          + "tView\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004"
          + " \001(\t\"k\n\023ListIntentsResponse\022;\n\007intents\030\001"
          + " \003(\0132*.google.cloud.dialogflow.cx.v3beta"
          + "1.Intent\022\027\n\017next_page_token\030\002 \001(\t\"a\n\020Get"
          + "IntentRequest\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n dia"
          + "logflow.googleapis.com/Intent\022\025\n\rlanguag"
          + "e_code\030\002 \001(\t\"\247\001\n\023CreateIntentRequest\0228\n\006"
          + "parent\030\001 \001(\tB(\340A\002\372A\"\022 dialogflow.googlea"
          + "pis.com/Intent\022?\n\006intent\030\002 \001(\0132*.google."
          + "cloud.dialogflow.cx.v3beta1.IntentB\003\340A\002\022"
          + "\025\n\rlanguage_code\030\003 \001(\t\"\236\001\n\023UpdateIntentR"
          + "equest\022?\n\006intent\030\001 \001(\0132*.google.cloud.di"
          + "alogflow.cx.v3beta1.IntentB\003\340A\002\022\025\n\rlangu"
          + "age_code\030\002 \001(\t\022/\n\013update_mask\030\003 \001(\0132\032.go"
          + "ogle.protobuf.FieldMask\"M\n\023DeleteIntentR"
          + "equest\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n dialogflow"
          + ".googleapis.com/Intent*X\n\nIntentView\022\033\n\027"
          + "INTENT_VIEW_UNSPECIFIED\020\000\022\027\n\023INTENT_VIEW"
          + "_PARTIAL\020\001\022\024\n\020INTENT_VIEW_FULL\020\0022\344\010\n\007Int"
          + "ents\022\312\001\n\013ListIntents\0226.google.cloud.dial"
          + "ogflow.cx.v3beta1.ListIntentsRequest\0327.g"
          + "oogle.cloud.dialogflow.cx.v3beta1.ListIn"
          + "tentsResponse\"J\202\323\344\223\002;\0229/v3beta1/{parent="
          + "projects/*/locations/*/agents/*}/intents"
          + "\332A\006parent\022\267\001\n\tGetIntent\0224.google.cloud.d"
          + "ialogflow.cx.v3beta1.GetIntentRequest\032*."
          + "google.cloud.dialogflow.cx.v3beta1.Inten"
          + "t\"H\202\323\344\223\002;\0229/v3beta1/{name=projects/*/loc"
          + "ations/*/agents/*/intents/*}\332A\004name\022\316\001\n\014"
          + "CreateIntent\0227.google.cloud.dialogflow.c"
          + "x.v3beta1.CreateIntentRequest\032*.google.c"
          + "loud.dialogflow.cx.v3beta1.Intent\"Y\202\323\344\223\002"
          + "C\"9/v3beta1/{parent=projects/*/locations"
          + "/*/agents/*}/intents:\006intent\332A\rparent,in"
          + "tent\022\332\001\n\014UpdateIntent\0227.google.cloud.dia"
          + "logflow.cx.v3beta1.UpdateIntentRequest\032*"
          + ".google.cloud.dialogflow.cx.v3beta1.Inte"
          + "nt\"e\202\323\344\223\002J2@/v3beta1/{intent.name=projec"
          + "ts/*/locations/*/agents/*/intents/*}:\006in"
          + "tent\332A\022intent,update_mask\022\251\001\n\014DeleteInte"
          + "nt\0227.google.cloud.dialogflow.cx.v3beta1."
          + "DeleteIntentRequest\032\026.google.protobuf.Em"
          + "pty\"H\202\323\344\223\002;*9/v3beta1/{name=projects/*/l"
          + "ocations/*/agents/*/intents/*}\332A\004name\032x\312"
          + "A\031dialogflow.googleapis.com\322AYhttps://ww"
          + "w.googleapis.com/auth/cloud-platform,htt"
          + "ps://www.googleapis.com/auth/dialogflowB"
          + "\252\001\n&com.google.cloud.dialogflow.cx.v3bet"
          + "a1B\013IntentProtoP\001ZDgoogle.golang.org/gen"
          + "proto/googleapis/cloud/dialogflow/cx/v3b"
          + "eta1;cx\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dialogflo"
          + "w.Cx.V3Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "TrainingPhrases",
              "Parameters",
              "Priority",
              "IsFallback",
              "Labels",
              "Description",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_descriptor,
            new java.lang.String[] {
              "Id", "Parts", "RepeatCount",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_Part_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_Part_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_Part_descriptor,
            new java.lang.String[] {
              "Text", "ParameterId",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_Parameter_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_Parameter_descriptor,
            new java.lang.String[] {
              "Id", "EntityType", "IsList", "Redact",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_LabelsEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "IntentView", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsResponse_descriptor,
            new java.lang.String[] {
              "Intents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetIntentRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateIntentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Intent", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateIntentRequest_descriptor,
            new java.lang.String[] {
              "Intent", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteIntentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
