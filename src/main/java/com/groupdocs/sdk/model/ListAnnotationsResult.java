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
import com.groupdocs.sdk.model.AnnotationInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class ListAnnotationsResult {
  private String documentGuid = null;
  private String sessionGuid = null;
  private List<AnnotationInfo> annotations = new ArrayList<AnnotationInfo>();
  private Long serverTime = null;
  public String getDocumentGuid() {
    return documentGuid;
  }
  public void setDocumentGuid(String documentGuid) {
    this.documentGuid = documentGuid;
  }

  public String getSessionGuid() {
    return sessionGuid;
  }
  public void setSessionGuid(String sessionGuid) {
    this.sessionGuid = sessionGuid;
  }

  public List<AnnotationInfo> getAnnotations() {
    return annotations;
  }
  public void setAnnotations(List<AnnotationInfo> annotations) {
    this.annotations = annotations;
  }

  public Long getServerTime() {
    return serverTime;
  }
  public void setServerTime(Long serverTime) {
    this.serverTime = serverTime;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnnotationsResult {\n");
    sb.append("  documentGuid: ").append(documentGuid).append("\n");
    sb.append("  sessionGuid: ").append(sessionGuid).append("\n");
    sb.append("  annotations: ").append(annotations).append("\n");
    sb.append("  serverTime: ").append(serverTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

