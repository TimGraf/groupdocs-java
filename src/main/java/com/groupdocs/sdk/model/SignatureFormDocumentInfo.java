/**
 *  Copyright 2012 GroupDocs.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureFormDocumentInfo {
  private String id = null;
  private String name = null;
  private String formGuid = null;
  private String documentGuid = null;
  private String originalDocumentGuid = null;
  private String originalDocumentMD5 = null;
  private String assignedDateTime = null;
  private Integer order = null;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getFormGuid() {
    return formGuid;
  }
  public void setFormGuid(String formGuid) {
    this.formGuid = formGuid;
  }

  public String getDocumentGuid() {
    return documentGuid;
  }
  public void setDocumentGuid(String documentGuid) {
    this.documentGuid = documentGuid;
  }

  public String getOriginalDocumentGuid() {
    return originalDocumentGuid;
  }
  public void setOriginalDocumentGuid(String originalDocumentGuid) {
    this.originalDocumentGuid = originalDocumentGuid;
  }

  public String getOriginalDocumentMD5() {
    return originalDocumentMD5;
  }
  public void setOriginalDocumentMD5(String originalDocumentMD5) {
    this.originalDocumentMD5 = originalDocumentMD5;
  }

  public String getAssignedDateTime() {
    return assignedDateTime;
  }
  public void setAssignedDateTime(String assignedDateTime) {
    this.assignedDateTime = assignedDateTime;
  }

  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureFormDocumentInfo {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  formGuid: ").append(formGuid).append("\n");
    sb.append("  documentGuid: ").append(documentGuid).append("\n");
    sb.append("  originalDocumentGuid: ").append(originalDocumentGuid).append("\n");
    sb.append("  originalDocumentMD5: ").append(originalDocumentMD5).append("\n");
    sb.append("  assignedDateTime: ").append(assignedDateTime).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

