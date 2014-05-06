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
public class AnnotationReviewerRights {
  private Integer CanView = null;
  private Integer CanAnnotate = null;
  private Integer CanDownload = null;
  private Integer CanExport = null;
  private Integer CanDelete = null;
  private Integer All = null;
  public Integer getCanView() {
    return CanView;
  }
  public void setCanView(Integer CanView) {
    this.CanView = CanView;
  }

  public Integer getCanAnnotate() {
    return CanAnnotate;
  }
  public void setCanAnnotate(Integer CanAnnotate) {
    this.CanAnnotate = CanAnnotate;
  }

  public Integer getCanDownload() {
    return CanDownload;
  }
  public void setCanDownload(Integer CanDownload) {
    this.CanDownload = CanDownload;
  }

  public Integer getCanExport() {
    return CanExport;
  }
  public void setCanExport(Integer CanExport) {
    this.CanExport = CanExport;
  }

  public Integer getCanDelete() {
    return CanDelete;
  }
  public void setCanDelete(Integer CanDelete) {
    this.CanDelete = CanDelete;
  }

  public Integer getAll() {
    return All;
  }
  public void setAll(Integer All) {
    this.All = All;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationReviewerRights {\n");
    sb.append("  CanView: ").append(CanView).append("\n");
    sb.append("  CanAnnotate: ").append(CanAnnotate).append("\n");
    sb.append("  CanDownload: ").append(CanDownload).append("\n");
    sb.append("  CanExport: ").append(CanExport).append("\n");
    sb.append("  CanDelete: ").append(CanDelete).append("\n");
    sb.append("  All: ").append(All).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
