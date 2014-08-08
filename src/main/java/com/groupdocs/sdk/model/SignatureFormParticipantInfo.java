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

import java.util.*;
import com.groupdocs.sdk.model.SignatureFormParticipantSignedDocumentInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureFormParticipantInfo {
  private String id = null;
  private List<SignatureFormParticipantSignedDocumentInfo> signedDocuments = new ArrayList<SignatureFormParticipantSignedDocumentInfo>();
  private String fillDateTime = null;
  private Integer status = null;
  private String email = null;
  private String comment = null;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public List<SignatureFormParticipantSignedDocumentInfo> getSignedDocuments() {
    return signedDocuments;
  }
  public void setSignedDocuments(List<SignatureFormParticipantSignedDocumentInfo> signedDocuments) {
    this.signedDocuments = signedDocuments;
  }

  public String getFillDateTime() {
    return fillDateTime;
  }
  public void setFillDateTime(String fillDateTime) {
    this.fillDateTime = fillDateTime;
  }

  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureFormParticipantInfo {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  signedDocuments: ").append(signedDocuments).append("\n");
    sb.append("  fillDateTime: ").append(fillDateTime).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  comment: ").append(comment).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

