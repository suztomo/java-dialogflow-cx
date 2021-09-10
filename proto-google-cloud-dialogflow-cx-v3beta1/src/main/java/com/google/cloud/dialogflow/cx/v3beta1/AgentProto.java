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
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetAgentValidationResultRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetAgentValidationResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_AgentValidationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_AgentValidationResult_fieldAccessorTable;

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
          + ":google/cloud/dialogflow/cx/v3beta1/adva"
          + "nced_settings.proto\032-google/cloud/dialog"
          + "flow/cx/v3beta1/flow.proto\032:google/cloud"
          + "/dialogflow/cx/v3beta1/security_settings"
          + ".proto\032#google/longrunning/operations.pr"
          + "oto\032\033google/protobuf/empty.proto\032 google"
          + "/protobuf/field_mask.proto\"8\n\024SpeechToTe"
          + "xtSettings\022 \n\030enable_speech_adaptation\030\001"
          + " \001(\010\"\225\005\n\005Agent\022\014\n\004name\030\001 \001(\t\022\031\n\014display_"
          + "name\030\002 \001(\tB\003\340A\002\022%\n\025default_language_code"
          + "\030\003 \001(\tB\006\340A\002\340A\005\022 \n\030supported_language_cod"
          + "es\030\004 \003(\t\022\026\n\ttime_zone\030\005 \001(\tB\003\340A\002\022\023\n\013desc"
          + "ription\030\006 \001(\t\022\022\n\navatar_uri\030\007 \001(\t\022Y\n\027spe"
          + "ech_to_text_settings\030\r \001(\01328.google.clou"
          + "d.dialogflow.cx.v3beta1.SpeechToTextSett"
          + "ings\022:\n\nstart_flow\030\020 \001(\tB&\340A\005\372A \n\036dialog"
          + "flow.googleapis.com/Flow\022J\n\021security_set"
          + "tings\030\021 \001(\tB/\372A,\n*dialogflow.googleapis."
          + "com/SecuritySettings\022&\n\032enable_stackdriv"
          + "er_logging\030\022 \001(\010B\002\030\001\022\037\n\027enable_spell_cor"
          + "rection\030\024 \001(\010\022O\n\021advanced_settings\030\026 \001(\013"
          + "24.google.cloud.dialogflow.cx.v3beta1.Ad"
          + "vancedSettings:\\\352AY\n\037dialogflow.googleap"
          + "is.com/Agent\0226projects/{project}/locatio"
          + "ns/{location}/agents/{agent}\"s\n\021ListAgen"
          + "tsRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037dialo"
          + "gflow.googleapis.com/Agent\022\021\n\tpage_size\030"
          + "\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"h\n\022ListAgentsR"
          + "esponse\0229\n\006agents\030\001 \003(\0132).google.cloud.d"
          + "ialogflow.cx.v3beta1.Agent\022\027\n\017next_page_"
          + "token\030\002 \001(\t\"H\n\017GetAgentRequest\0225\n\004name\030\001"
          + " \001(\tB\'\340A\002\372A!\n\037dialogflow.googleapis.com/"
          + "Agent\"\214\001\n\022CreateAgentRequest\0227\n\006parent\030\001"
          + " \001(\tB\'\340A\002\372A!\022\037dialogflow.googleapis.com/"
          + "Agent\022=\n\005agent\030\002 \001(\0132).google.cloud.dial"
          + "ogflow.cx.v3beta1.AgentB\003\340A\002\"\204\001\n\022UpdateA"
          + "gentRequest\022=\n\005agent\030\001 \001(\0132).google.clou"
          + "d.dialogflow.cx.v3beta1.AgentB\003\340A\002\022/\n\013up"
          + "date_mask\030\002 \001(\0132\032.google.protobuf.FieldM"
          + "ask\"K\n\022DeleteAgentRequest\0225\n\004name\030\001 \001(\tB"
          + "\'\340A\002\372A!\n\037dialogflow.googleapis.com/Agent"
          + "\"\247\001\n\022ExportAgentRequest\0225\n\004name\030\001 \001(\tB\'\340"
          + "A\002\372A!\n\037dialogflow.googleapis.com/Agent\022\026"
          + "\n\tagent_uri\030\002 \001(\tB\003\340A\001\022B\n\013environment\030\005 "
          + "\001(\tB-\340A\001\372A\'\n%dialogflow.googleapis.com/E"
          + "nvironment\"L\n\023ExportAgentResponse\022\023\n\tage"
          + "nt_uri\030\001 \001(\tH\000\022\027\n\ragent_content\030\002 \001(\014H\000B"
          + "\007\n\005agent\"\253\002\n\023RestoreAgentRequest\0225\n\004name"
          + "\030\001 \001(\tB\'\340A\002\372A!\n\037dialogflow.googleapis.co"
          + "m/Agent\022\023\n\tagent_uri\030\002 \001(\tH\000\022\027\n\ragent_co"
          + "ntent\030\003 \001(\014H\000\022]\n\016restore_option\030\005 \001(\0162E."
          + "google.cloud.dialogflow.cx.v3beta1.Resto"
          + "reAgentRequest.RestoreOption\"G\n\rRestoreO"
          + "ption\022\036\n\032RESTORE_OPTION_UNSPECIFIED\020\000\022\010\n"
          + "\004KEEP\020\001\022\014\n\010FALLBACK\020\002B\007\n\005agent\"d\n\024Valida"
          + "teAgentRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037di"
          + "alogflow.googleapis.com/Agent\022\025\n\rlanguag"
          + "e_code\030\002 \001(\t\"\177\n\037GetAgentValidationResult"
          + "Request\022E\n\004name\030\001 \001(\tB7\340A\002\372A1\n/dialogflo"
          + "w.googleapis.com/AgentValidationResult\022\025"
          + "\n\rlanguage_code\030\002 \001(\t\"\377\001\n\025AgentValidatio"
          + "nResult\022\014\n\004name\030\001 \001(\t\022Y\n\027flow_validation"
          + "_results\030\002 \003(\01328.google.cloud.dialogflow"
          + ".cx.v3beta1.FlowValidationResult:}\352Az\n/d"
          + "ialogflow.googleapis.com/AgentValidation"
          + "Result\022Gprojects/{project}/locations/{lo"
          + "cation}/agents/{agent}/validationResult2"
          + "\221\017\n\006Agents\022\275\001\n\nListAgents\0225.google.cloud"
          + ".dialogflow.cx.v3beta1.ListAgentsRequest"
          + "\0326.google.cloud.dialogflow.cx.v3beta1.Li"
          + "stAgentsResponse\"@\202\323\344\223\0021\022//v3beta1/{pare"
          + "nt=projects/*/locations/*}/agents\332A\006pare"
          + "nt\022\252\001\n\010GetAgent\0223.google.cloud.dialogflo"
          + "w.cx.v3beta1.GetAgentRequest\032).google.cl"
          + "oud.dialogflow.cx.v3beta1.Agent\">\202\323\344\223\0021\022"
          + "//v3beta1/{name=projects/*/locations/*/a"
          + "gents/*}\332A\004name\022\277\001\n\013CreateAgent\0226.google"
          + ".cloud.dialogflow.cx.v3beta1.CreateAgent"
          + "Request\032).google.cloud.dialogflow.cx.v3b"
          + "eta1.Agent\"M\202\323\344\223\0028\"//v3beta1/{parent=pro"
          + "jects/*/locations/*}/agents:\005agent\332A\014par"
          + "ent,agent\022\312\001\n\013UpdateAgent\0226.google.cloud"
          + ".dialogflow.cx.v3beta1.UpdateAgentReques"
          + "t\032).google.cloud.dialogflow.cx.v3beta1.A"
          + "gent\"X\202\323\344\223\002>25/v3beta1/{agent.name=proje"
          + "cts/*/locations/*/agents/*}:\005agent\332A\021age"
          + "nt,update_mask\022\235\001\n\013DeleteAgent\0226.google."
          + "cloud.dialogflow.cx.v3beta1.DeleteAgentR"
          + "equest\032\026.google.protobuf.Empty\">\202\323\344\223\0021*/"
          + "/v3beta1/{name=projects/*/locations/*/ag"
          + "ents/*}\332A\004name\022\327\001\n\013ExportAgent\0226.google."
          + "cloud.dialogflow.cx.v3beta1.ExportAgentR"
          + "equest\032\035.google.longrunning.Operation\"q\202"
          + "\323\344\223\002;\"6/v3beta1/{name=projects/*/locatio"
          + "ns/*/agents/*}:export:\001*\312A-\n\023ExportAgent"
          + "Response\022\026google.protobuf.Struct\022\334\001\n\014Res"
          + "toreAgent\0227.google.cloud.dialogflow.cx.v"
          + "3beta1.RestoreAgentRequest\032\035.google.long"
          + "running.Operation\"t\202\323\344\223\002<\"7/v3beta1/{nam"
          + "e=projects/*/locations/*/agents/*}:resto"
          + "re:\001*\312A/\n\025google.protobuf.Empty\022\026google."
          + "protobuf.Struct\022\311\001\n\rValidateAgent\0228.goog"
          + "le.cloud.dialogflow.cx.v3beta1.ValidateA"
          + "gentRequest\0329.google.cloud.dialogflow.cx"
          + ".v3beta1.AgentValidationResult\"C\202\323\344\223\002=\"8"
          + "/v3beta1/{name=projects/*/locations/*/ag"
          + "ents/*}:validate:\001*\022\353\001\n\030GetAgentValidati"
          + "onResult\022C.google.cloud.dialogflow.cx.v3"
          + "beta1.GetAgentValidationResultRequest\0329."
          + "google.cloud.dialogflow.cx.v3beta1.Agent"
          + "ValidationResult\"O\202\323\344\223\002B\022@/v3beta1/{name"
          + "=projects/*/locations/*/agents/*/validat"
          + "ionResult}\332A\004name\032x\312A\031dialogflow.googlea"
          + "pis.com\322AYhttps://www.googleapis.com/aut"
          + "h/cloud-platform,https://www.googleapis."
          + "com/auth/dialogflowB\322\001\n&com.google.cloud"
          + ".dialogflow.cx.v3beta1B\nAgentProtoP\001ZDgo"
          + "ogle.golang.org/genproto/googleapis/clou"
          + "d/dialogflow/cx/v3beta1;cx\370\001\001\242\002\002DF\252\002\"Goo"
          + "gle.Cloud.Dialogflow.Cx.V3Beta1\352\002&Google"
          + "::Cloud::Dialogflow::CX::V3beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.AdvancedSettingsProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.FlowProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsProto.getDescriptor(),
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
              "SupportedLanguageCodes",
              "TimeZone",
              "Description",
              "AvatarUri",
              "SpeechToTextSettings",
              "StartFlow",
              "SecuritySettings",
              "EnableStackdriverLogging",
              "EnableSpellCorrection",
              "AdvancedSettings",
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
              "Name", "AgentUri", "Environment",
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
              "Name", "AgentUri", "AgentContent", "RestoreOption", "Agent",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateAgentRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetAgentValidationResultRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetAgentValidationResultRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetAgentValidationResultRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_AgentValidationResult_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_cx_v3beta1_AgentValidationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_AgentValidationResult_descriptor,
            new java.lang.String[] {
              "Name", "FlowValidationResults",
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
    com.google.cloud.dialogflow.cx.v3beta1.AdvancedSettingsProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.FlowProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
