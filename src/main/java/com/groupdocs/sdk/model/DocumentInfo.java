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
public class DocumentInfo {
  private String name = null;
  private Integer version = null;
  private Long size = null;
  private String type = null;
  private String type_str = null;
  private String file_type_str = null;
  private String document_path = null;
  private String access = null;
  private String url = null;
  private String file_type = null;
  private Double id = null;
  private String guid = null;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public String getType_str() {
    return type_str;
  }
  public void setType_str(String type_str) {
    this.type_str = type_str;
  }

  public String getFile_type_str() {
    return file_type_str;
  }
  public void setFile_type_str(String file_type_str) {
    this.file_type_str = file_type_str;
  }

  public String getDocument_path() {
    return document_path;
  }
  public void setDocument_path(String document_path) {
    this.document_path = document_path;
  }

  public String getAccess() {
    return access;
  }
  public void setAccess(String access) {
    this.access = access;
  }

  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  public String getFile_type() {
    return file_type;
  }
  public void setFile_type(String file_type) {
    this.file_type = file_type;
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
    sb.append("class DocumentInfo {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  type_str: ").append(type_str).append("\n");
    sb.append("  file_type_str: ").append(file_type_str).append("\n");
    sb.append("  document_path: ").append(document_path).append("\n");
    sb.append("  access: ").append(access).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  file_type: ").append(file_type).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  guid: ").append(guid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

