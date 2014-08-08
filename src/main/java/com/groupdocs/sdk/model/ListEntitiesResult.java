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
import com.groupdocs.sdk.model.FileSystemFolder;
import com.groupdocs.sdk.model.FileSystemDocument;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class ListEntitiesResult {
  private String path = null;
  private Integer count = null;
  private List<FileSystemFolder> folders = new ArrayList<FileSystemFolder>();
  private List<FileSystemDocument> files = new ArrayList<FileSystemDocument>();
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  public List<FileSystemFolder> getFolders() {
    return folders;
  }
  public void setFolders(List<FileSystemFolder> folders) {
    this.folders = folders;
  }

  public List<FileSystemDocument> getFiles() {
    return files;
  }
  public void setFiles(List<FileSystemDocument> files) {
    this.files = files;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEntitiesResult {\n");
    sb.append("  path: ").append(path).append("\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("  folders: ").append(folders).append("\n");
    sb.append("  files: ").append(files).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

