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
public class UploadRequestResult {
  private String adj_name = null;
  private String url = null;
  private String type = null;
  private String file_type = null;
  private Long size = null;
  private Integer version = null;
  private Double view_job_id = null;
  private String thumbnail = null;
  private Double id = null;
  private String guid = null;
  public String getAdj_name() {
    return adj_name;
  }
  public void setAdj_name(String adj_name) {
    this.adj_name = adj_name;
  }

  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public String getFile_type() {
    return file_type;
  }
  public void setFile_type(String file_type) {
    this.file_type = file_type;
  }

  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  public Double getView_job_id() {
    return view_job_id;
  }
  public void setView_job_id(Double view_job_id) {
    this.view_job_id = view_job_id;
  }

  public String getThumbnail() {
    return thumbnail;
  }
  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public String getGuid() {
    return guid;
  }
  public void setGuid(String guid) {
    this.guid = guid;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadRequestResult {\n");
    sb.append("  adj_name: ").append(adj_name).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  file_type: ").append(file_type).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  view_job_id: ").append(view_job_id).append("\n");
    sb.append("  thumbnail: ").append(thumbnail).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  guid: ").append(guid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

