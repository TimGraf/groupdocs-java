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
import com.groupdocs.sdk.model.UserInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class FileSystemFolder {
  private Integer folder_count = null;
  private Integer file_count = null;
  private Double id = null;
  private String guid = null;
  private String name = null;
  private String access = null;
  private UserInfo owner = null;
  private List<UserInfo> sharers = new ArrayList<UserInfo>();
  private Boolean dir = null;
  private Long modified_on = null;
  private Long created_on = null;
  public Integer getFolder_count() {
    return folder_count;
  }
  public void setFolder_count(Integer folder_count) {
    this.folder_count = folder_count;
  }

  public Integer getFile_count() {
    return file_count;
  }
  public void setFile_count(Integer file_count) {
    this.file_count = file_count;
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

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getAccess() {
    return access;
  }
  public void setAccess(String access) {
    this.access = access;
  }

  public UserInfo getOwner() {
    return owner;
  }
  public void setOwner(UserInfo owner) {
    this.owner = owner;
  }

  public List<UserInfo> getSharers() {
    return sharers;
  }
  public void setSharers(List<UserInfo> sharers) {
    this.sharers = sharers;
  }

  public Boolean getDir() {
    return dir;
  }
  public void setDir(Boolean dir) {
    this.dir = dir;
  }

  public Long getModified_on() {
    return modified_on;
  }
  public void setModified_on(Long modified_on) {
    this.modified_on = modified_on;
  }

  public Long getCreated_on() {
    return created_on;
  }
  public void setCreated_on(Long created_on) {
    this.created_on = created_on;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSystemFolder {\n");
    sb.append("  folder_count: ").append(folder_count).append("\n");
    sb.append("  file_count: ").append(file_count).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  guid: ").append(guid).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  access: ").append(access).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  sharers: ").append(sharers).append("\n");
    sb.append("  dir: ").append(dir).append("\n");
    sb.append("  modified_on: ").append(modified_on).append("\n");
    sb.append("  created_on: ").append(created_on).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

