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
// source: google/cloud/dialogflow/cx/v3/flow.proto

package com.google.cloud.dialogflow.cx.v3;

public final class FlowProto {
  private FlowProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_NluSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_NluSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Flow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Flow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_CreateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DeleteFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListFlowsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListFlowsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListFlowsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListFlowsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_TrainFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_TrainFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ValidateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ValidateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetFlowValidationResultRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetFlowValidationResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_FlowValidationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_FlowValidationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ImportFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ImportFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ImportFlowResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ImportFlowResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dialogflow/cx/v3/flow.pro"
          + "to\022\035google.cloud.dialogflow.cx.v3\032\034googl"
          + "e/api/annotations.proto\032\027google/api/clie"
          + "nt.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\0325google/clo"
          + "ud/dialogflow/cx/v3/advanced_settings.pr"
          + "oto\032(google/cloud/dialogflow/cx/v3/page."
          + "proto\0326google/cloud/dialogflow/cx/v3/val"
          + "idation_message.proto\032#google/longrunnin"
          + "g/operations.proto\032\033google/protobuf/empt"
          + "y.proto\032 google/protobuf/field_mask.prot"
          + "o\032\037google/protobuf/timestamp.proto\"\254\003\n\013N"
          + "luSettings\022H\n\nmodel_type\030\001 \001(\01624.google."
          + "cloud.dialogflow.cx.v3.NluSettings.Model"
          + "Type\022 \n\030classification_threshold\030\003 \001(\002\022Y"
          + "\n\023model_training_mode\030\004 \001(\0162<.google.clo"
          + "ud.dialogflow.cx.v3.NluSettings.ModelTra"
          + "iningMode\"Y\n\tModelType\022\032\n\026MODEL_TYPE_UNS"
          + "PECIFIED\020\000\022\027\n\023MODEL_TYPE_STANDARD\020\001\022\027\n\023M"
          + "ODEL_TYPE_ADVANCED\020\003\"{\n\021ModelTrainingMod"
          + "e\022#\n\037MODEL_TRAINING_MODE_UNSPECIFIED\020\000\022!"
          + "\n\035MODEL_TRAINING_MODE_AUTOMATIC\020\001\022\036\n\032MOD"
          + "EL_TRAINING_MODE_MANUAL\020\002\"\326\003\n\004Flow\022\014\n\004na"
          + "me\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013d"
          + "escription\030\003 \001(\t\022I\n\021transition_routes\030\004 "
          + "\003(\0132..google.cloud.dialogflow.cx.v3.Tran"
          + "sitionRoute\022C\n\016event_handlers\030\n \003(\0132+.go"
          + "ogle.cloud.dialogflow.cx.v3.EventHandler"
          + "\022T\n\027transition_route_groups\030\017 \003(\tB3\372A0\n."
          + "dialogflow.googleapis.com/TransitionRout"
          + "eGroup\022@\n\014nlu_settings\030\013 \001(\0132*.google.cl"
          + "oud.dialogflow.cx.v3.NluSettings:h\352Ae\n\036d"
          + "ialogflow.googleapis.com/Flow\022Cprojects/"
          + "{project}/locations/{location}/agents/{a"
          + "gent}/flows/{flow}\"\232\001\n\021CreateFlowRequest"
          + "\0226\n\006parent\030\001 \001(\tB&\340A\002\372A \022\036dialogflow.goo"
          + "gleapis.com/Flow\0226\n\004flow\030\002 \001(\0132#.google."
          + "cloud.dialogflow.cx.v3.FlowB\003\340A\002\022\025\n\rlang"
          + "uage_code\030\003 \001(\t\"X\n\021DeleteFlowRequest\0224\n\004"
          + "name\030\001 \001(\tB&\340A\002\372A \n\036dialogflow.googleapi"
          + "s.com/Flow\022\r\n\005force\030\002 \001(\010\"\210\001\n\020ListFlowsR"
          + "equest\0226\n\006parent\030\001 \001(\tB&\340A\002\372A \022\036dialogfl"
          + "ow.googleapis.com/Flow\022\021\n\tpage_size\030\002 \001("
          + "\005\022\022\n\npage_token\030\003 \001(\t\022\025\n\rlanguage_code\030\004"
          + " \001(\t\"`\n\021ListFlowsResponse\0222\n\005flows\030\001 \003(\013"
          + "2#.google.cloud.dialogflow.cx.v3.Flow\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"]\n\016GetFlowRequest"
          + "\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dialogflow.googl"
          + "eapis.com/Flow\022\025\n\rlanguage_code\030\002 \001(\t\"\230\001"
          + "\n\021UpdateFlowRequest\0226\n\004flow\030\001 \001(\0132#.goog"
          + "le.cloud.dialogflow.cx.v3.FlowB\003\340A\002\0224\n\013u"
          + "pdate_mask\030\002 \001(\0132\032.google.protobuf.Field"
          + "MaskB\003\340A\002\022\025\n\rlanguage_code\030\003 \001(\t\"H\n\020Trai"
          + "nFlowRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dial"
          + "ogflow.googleapis.com/Flow\"b\n\023ValidateFl"
          + "owRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dialogf"
          + "low.googleapis.com/Flow\022\025\n\rlanguage_code"
          + "\030\002 \001(\t\"}\n\036GetFlowValidationResultRequest"
          + "\022D\n\004name\030\001 \001(\tB6\340A\002\372A0\n.dialogflow.googl"
          + "eapis.com/FlowValidationResult\022\025\n\rlangua"
          + "ge_code\030\002 \001(\t\"\261\002\n\024FlowValidationResult\022\014"
          + "\n\004name\030\001 \001(\t\022M\n\023validation_messages\030\002 \003("
          + "\01320.google.cloud.dialogflow.cx.v3.Valida"
          + "tionMessage\022/\n\013update_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.Timestamp:\212\001\352A\206\001\n.dialogflow."
          + "googleapis.com/FlowValidationResult\022Tpro"
          + "jects/{project}/locations/{location}/age"
          + "nts/{agent}/flows/{flow}/validationResul"
          + "t\"\234\002\n\021ImportFlowRequest\0226\n\006parent\030\001 \001(\tB"
          + "&\340A\002\372A \022\036dialogflow.googleapis.com/Flow\022"
          + "\022\n\010flow_uri\030\002 \001(\tH\000\022\026\n\014flow_content\030\003 \001("
          + "\014H\000\022T\n\rimport_option\030\004 \001(\0162=.google.clou"
          + "d.dialogflow.cx.v3.ImportFlowRequest.Imp"
          + "ortOption\"E\n\014ImportOption\022\035\n\031IMPORT_OPTI"
          + "ON_UNSPECIFIED\020\000\022\010\n\004KEEP\020\001\022\014\n\010FALLBACK\020\002"
          + "B\006\n\004flow\"G\n\022ImportFlowResponse\0221\n\004flow\030\001"
          + " \001(\tB#\372A \n\036dialogflow.googleapis.com/Flo"
          + "w\"\207\001\n\021ExportFlowRequest\0224\n\004name\030\001 \001(\tB&\340"
          + "A\002\372A \n\036dialogflow.googleapis.com/Flow\022\025\n"
          + "\010flow_uri\030\002 \001(\tB\003\340A\001\022%\n\030include_referenc"
          + "ed_flows\030\004 \001(\010B\003\340A\001\"H\n\022ExportFlowRespons"
          + "e\022\022\n\010flow_uri\030\001 \001(\tH\000\022\026\n\014flow_content\030\002 "
          + "\001(\014H\000B\006\n\004flow2\230\020\n\005Flows\022\263\001\n\nCreateFlow\0220"
          + ".google.cloud.dialogflow.cx.v3.CreateFlo"
          + "wRequest\032#.google.cloud.dialogflow.cx.v3"
          + ".Flow\"N\202\323\344\223\002:\"2/v3/{parent=projects/*/lo"
          + "cations/*/agents/*}/flows:\004flow\332A\013parent"
          + ",flow\022\231\001\n\nDeleteFlow\0220.google.cloud.dial"
          + "ogflow.cx.v3.DeleteFlowRequest\032\026.google."
          + "protobuf.Empty\"A\202\323\344\223\0024*2/v3/{name=projec"
          + "ts/*/locations/*/agents/*/flows/*}\332A\004nam"
          + "e\022\263\001\n\tListFlows\022/.google.cloud.dialogflo"
          + "w.cx.v3.ListFlowsRequest\0320.google.cloud."
          + "dialogflow.cx.v3.ListFlowsResponse\"C\202\323\344\223"
          + "\0024\0222/v3/{parent=projects/*/locations/*/a"
          + "gents/*}/flows\332A\006parent\022\240\001\n\007GetFlow\022-.go"
          + "ogle.cloud.dialogflow.cx.v3.GetFlowReque"
          + "st\032#.google.cloud.dialogflow.cx.v3.Flow\""
          + "A\202\323\344\223\0024\0222/v3/{name=projects/*/locations/"
          + "*/agents/*/flows/*}\332A\004name\022\275\001\n\nUpdateFlo"
          + "w\0220.google.cloud.dialogflow.cx.v3.Update"
          + "FlowRequest\032#.google.cloud.dialogflow.cx"
          + ".v3.Flow\"X\202\323\344\223\002?27/v3/{flow.name=project"
          + "s/*/locations/*/agents/*/flows/*}:\004flow\332"
          + "A\020flow,update_mask\022\331\001\n\tTrainFlow\022/.googl"
          + "e.cloud.dialogflow.cx.v3.TrainFlowReques"
          + "t\032\035.google.longrunning.Operation\"|\202\323\344\223\002="
          + "\"8/v3/{name=projects/*/locations/*/agent"
          + "s/*/flows/*}:train:\001*\332A\004name\312A/\n\025google."
          + "protobuf.Empty\022\026google.protobuf.Struct\022\277"
          + "\001\n\014ValidateFlow\0222.google.cloud.dialogflo"
          + "w.cx.v3.ValidateFlowRequest\0323.google.clo"
          + "ud.dialogflow.cx.v3.FlowValidationResult"
          + "\"F\202\323\344\223\002@\";/v3/{name=projects/*/locations"
          + "/*/agents/*/flows/*}:validate:\001*\022\341\001\n\027Get"
          + "FlowValidationResult\022=.google.cloud.dial"
          + "ogflow.cx.v3.GetFlowValidationResultRequ"
          + "est\0323.google.cloud.dialogflow.cx.v3.Flow"
          + "ValidationResult\"R\202\323\344\223\002E\022C/v3/{name=proj"
          + "ects/*/locations/*/agents/*/flows/*/vali"
          + "dationResult}\332A\004name\022\322\001\n\nImportFlow\0220.go"
          + "ogle.cloud.dialogflow.cx.v3.ImportFlowRe"
          + "quest\032\035.google.longrunning.Operation\"s\202\323"
          + "\344\223\002>\"9/v3/{parent=projects/*/locations/*"
          + "/agents/*}/flows:import:\001*\312A,\n\022ImportFlo"
          + "wResponse\022\026google.protobuf.Struct\022\322\001\n\nEx"
          + "portFlow\0220.google.cloud.dialogflow.cx.v3"
          + ".ExportFlowRequest\032\035.google.longrunning."
          + "Operation\"s\202\323\344\223\002>\"9/v3/{name=projects/*/"
          + "locations/*/agents/*/flows/*}:export:\001*\312"
          + "A,\n\022ExportFlowResponse\022\026google.protobuf."
          + "Struct\032x\312A\031dialogflow.googleapis.com\322AYh"
          + "ttps://www.googleapis.com/auth/cloud-pla"
          + "tform,https://www.googleapis.com/auth/di"
          + "alogflowB\231\001\n!com.google.cloud.dialogflow"
          + ".cx.v3B\tFlowProtoP\001Z?google.golang.org/g"
          + "enproto/googleapis/cloud/dialogflow/cx/v"
          + "3;cx\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialogflow.C"
          + "x.V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.AdvancedSettingsProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.PageProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.ValidationMessageProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_NluSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_NluSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_NluSettings_descriptor,
            new java.lang.String[] {
              "ModelType", "ClassificationThreshold", "ModelTrainingMode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Flow_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Flow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Flow_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "TransitionRoutes",
              "EventHandlers",
              "TransitionRouteGroups",
              "NluSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3_CreateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_CreateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_CreateFlowRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Flow", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DeleteFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListFlowsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_ListFlowsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListFlowsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListFlowsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_ListFlowsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListFlowsResponse_descriptor,
            new java.lang.String[] {
              "Flows", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_GetFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdateFlowRequest_descriptor,
            new java.lang.String[] {
              "Flow", "UpdateMask", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_TrainFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3_TrainFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_TrainFlowRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ValidateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3_ValidateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ValidateFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetFlowValidationResultRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3_GetFlowValidationResultRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetFlowValidationResultRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_FlowValidationResult_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3_FlowValidationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_FlowValidationResult_descriptor,
            new java.lang.String[] {
              "Name", "ValidationMessages", "UpdateTime",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ImportFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3_ImportFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ImportFlowRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FlowUri", "FlowContent", "ImportOption", "Flow",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ImportFlowResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_cx_v3_ImportFlowResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ImportFlowResponse_descriptor,
            new java.lang.String[] {
              "Flow",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "FlowUri", "IncludeReferencedFlows",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportFlowResponse_descriptor,
            new java.lang.String[] {
              "FlowUri", "FlowContent", "Flow",
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
    com.google.cloud.dialogflow.cx.v3.AdvancedSettingsProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.PageProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.ValidationMessageProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
