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
// source: google/cloud/dialogflow/cx/v3beta1/agent.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class AgentProto {
  private AgentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechToTextSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechToTextSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Agent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListAgentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListAgentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListAgentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListAgentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportAgentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportAgentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_RestoreAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_RestoreAgentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/dialogflow/cx/v3beta1/age"
          + "nt.proto\022\"google.cloud.dialogflow.cx.v3b"
          + "eta1\032\034google/api/annotations.proto\032\027goog"
          + "le/api/client.proto\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\032"
          + "-google/cloud/dialogflow/cx/v3beta1/flow"
          + ".proto\032#google/longrunning/operations.pr"
          + "oto\032\033google/protobuf/empty.proto\032 google"
          + "/protobuf/field_mask.proto\"8\n\024SpeechToTe"
          + "xtSettings\022 \n\030enable_speech_adaptation\030\001"
          + " \001(\010\"\317\003\n\005Agent\022\014\n\004name\030\001 \001(\t\022\031\n\014display_"
          + "name\030\002 \001(\tB\003\340A\002\022\"\n\025default_language_code"
          + "\030\003 \001(\tB\003\340A\005\022\026\n\ttime_zone\030\005 \001(\tB\003\340A\002\022\023\n\013d"
          + "escription\030\006 \001(\t\022\022\n\navatar_uri\030\007 \001(\t\022Y\n\027"
          + "speech_to_text_settings\030\r \001(\01328.google.c"
          + "loud.dialogflow.cx.v3beta1.SpeechToTextS"
          + "ettings\022:\n\nstart_flow\030\020 \001(\tB&\340A\005\372A \n\036dia"
          + "logflow.googleapis.com/Flow\022\"\n\032enable_st"
          + "ackdriver_logging\030\022 \001(\010\022\037\n\027enable_spell_"
          + "correction\030\024 \001(\010:\\\352AY\n\037dialogflow.google"
          + "apis.com/Agent\0226projects/{project}/locat"
          + "ions/{location}/agents/{agent}\"s\n\021ListAg"
          + "entsRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037dia"
          + "logflow.googleapis.com/Agent\022\021\n\tpage_siz"
          + "e\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"h\n\022ListAgent"
          + "sResponse\0229\n\006agents\030\001 \003(\0132).google.cloud"
          + ".dialogflow.cx.v3beta1.Agent\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\"H\n\017GetAgentRequest\0225\n\004name"
          + "\030\001 \001(\tB\'\340A\002\372A!\n\037dialogflow.googleapis.co"
          + "m/Agent\"\214\001\n\022CreateAgentRequest\0227\n\006parent"
          + "\030\001 \001(\tB\'\340A\002\372A!\022\037dialogflow.googleapis.co"
          + "m/Agent\022=\n\005agent\030\002 \001(\0132).google.cloud.di"
          + "alogflow.cx.v3beta1.AgentB\003\340A\002\"\204\001\n\022Updat"
          + "eAgentRequest\022=\n\005agent\030\001 \001(\0132).google.cl"
          + "oud.dialogflow.cx.v3beta1.AgentB\003\340A\002\022/\n\013"
          + "update_mask\030\002 \001(\0132\032.google.protobuf.Fiel"
          + "dMask\"K\n\022DeleteAgentRequest\0225\n\004name\030\001 \001("
          + "\tB\'\340A\002\372A!\n\037dialogflow.googleapis.com/Age"
          + "nt\"c\n\022ExportAgentRequest\0225\n\004name\030\001 \001(\tB\'"
          + "\340A\002\372A!\n\037dialogflow.googleapis.com/Agent\022"
          + "\026\n\tagent_uri\030\002 \001(\tB\003\340A\001\"L\n\023ExportAgentRe"
          + "sponse\022\023\n\tagent_uri\030\001 \001(\tH\000\022\027\n\ragent_con"
          + "tent\030\002 \001(\014H\000B\007\n\005agent\"\203\001\n\023RestoreAgentRe"
          + "quest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037dialogflow."
          + "googleapis.com/Agent\022\023\n\tagent_uri\030\002 \001(\tH"
          + "\000\022\027\n\ragent_content\030\003 \001(\014H\000B\007\n\005agent2\327\013\n\006"
          + "Agents\022\275\001\n\nListAgents\0225.google.cloud.dia"
          + "logflow.cx.v3beta1.ListAgentsRequest\0326.g"
          + "oogle.cloud.dialogflow.cx.v3beta1.ListAg"
          + "entsResponse\"@\202\323\344\223\0021\022//v3beta1/{parent=p"
          + "rojects/*/locations/*}/agents\332A\006parent\022\252"
          + "\001\n\010GetAgent\0223.google.cloud.dialogflow.cx"
          + ".v3beta1.GetAgentRequest\032).google.cloud."
          + "dialogflow.cx.v3beta1.Agent\">\202\323\344\223\0021\022//v3"
          + "beta1/{name=projects/*/locations/*/agent"
          + "s/*}\332A\004name\022\277\001\n\013CreateAgent\0226.google.clo"
          + "ud.dialogflow.cx.v3beta1.CreateAgentRequ"
          + "est\032).google.cloud.dialogflow.cx.v3beta1"
          + ".Agent\"M\202\323\344\223\0028\"//v3beta1/{parent=project"
          + "s/*/locations/*}/agents:\005agent\332A\014parent,"
          + "agent\022\312\001\n\013UpdateAgent\0226.google.cloud.dia"
          + "logflow.cx.v3beta1.UpdateAgentRequest\032)."
          + "google.cloud.dialogflow.cx.v3beta1.Agent"
          + "\"X\202\323\344\223\002>25/v3beta1/{agent.name=projects/"
          + "*/locations/*/agents/*}:\005agent\332A\021agent,u"
          + "pdate_mask\022\235\001\n\013DeleteAgent\0226.google.clou"
          + "d.dialogflow.cx.v3beta1.DeleteAgentReque"
          + "st\032\026.google.protobuf.Empty\">\202\323\344\223\0021*//v3b"
          + "eta1/{name=projects/*/locations/*/agents"
          + "/*}\332A\004name\022\327\001\n\013ExportAgent\0226.google.clou"
          + "d.dialogflow.cx.v3beta1.ExportAgentReque"
          + "st\032\035.google.longrunning.Operation\"q\202\323\344\223\002"
          + ";\"6/v3beta1/{name=projects/*/locations/*"
          + "/agents/*}:export:\001*\312A-\n\023ExportAgentResp"
          + "onse\022\026google.protobuf.Struct\022\334\001\n\014Restore"
          + "Agent\0227.google.cloud.dialogflow.cx.v3bet"
          + "a1.RestoreAgentRequest\032\035.google.longrunn"
          + "ing.Operation\"t\202\323\344\223\002<\"7/v3beta1/{name=pr"
          + "ojects/*/locations/*/agents/*}:restore:\001"
          + "*\312A/\n\025google.protobuf.Empty\022\026google.prot"
          + "obuf.Struct\032x\312A\031dialogflow.googleapis.co"
          + "m\322AYhttps://www.googleapis.com/auth/clou"
          + "d-platform,https://www.googleapis.com/au"
          + "th/dialogflowB\251\001\n&com.google.cloud.dialo"
          + "gflow.cx.v3beta1B\nAgentProtoP\001ZDgoogle.g"
          + "olang.org/genproto/googleapis/cloud/dial"
          + "ogflow/cx/v3beta1;cx\370\001\001\242\002\002DF\252\002\"Google.Cl"
          + "oud.Dialogflow.Cx.V3Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.FlowProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechToTextSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechToTextSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SpeechToTextSettings_descriptor,
            new java.lang.String[] {
              "EnableSpeechAdaptation",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Agent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Agent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Agent_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "DefaultLanguageCode",
              "TimeZone",
              "Description",
              "AvatarUri",
              "SpeechToTextSettings",
              "StartFlow",
              "EnableStackdriverLogging",
              "EnableSpellCorrection",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListAgentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListAgentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListAgentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListAgentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListAgentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListAgentsResponse_descriptor,
            new java.lang.String[] {
              "Agents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetAgentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Agent",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateAgentRequest_descriptor,
            new java.lang.String[] {
              "Agent", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteAgentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ExportAgentRequest_descriptor,
            new java.lang.String[] {
              "Name", "AgentUri",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportAgentResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportAgentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ExportAgentResponse_descriptor,
            new java.lang.String[] {
              "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_RestoreAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3beta1_RestoreAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_RestoreAgentRequest_descriptor,
            new java.lang.String[] {
              "Name", "AgentUri", "AgentContent", "Agent",
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
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.FlowProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
