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
import com.groupdocs.sdk.model.DocumentCell;
import com.groupdocs.sdk.model.TemplateEditorField;
import com.groupdocs.sdk.model.DocumentWord;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class TemplateEditorFieldsResult {
  private List<TemplateEditorField> fields = new ArrayList<TemplateEditorField>();
  private List<DocumentWord> words = new ArrayList<DocumentWord>();
  private List<DocumentCell> cells = new ArrayList<DocumentCell>();
  public List<TemplateEditorField> getFields() {
    return fields;
  }
  public void setFields(List<TemplateEditorField> fields) {
    this.fields = fields;
  }

  public List<DocumentWord> getWords() {
    return words;
  }
  public void setWords(List<DocumentWord> words) {
    this.words = words;
  }

  public List<DocumentCell> getCells() {
    return cells;
  }
  public void setCells(List<DocumentCell> cells) {
    this.cells = cells;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateEditorFieldsResult {\n");
    sb.append("  fields: ").append(fields).append("\n");
    sb.append("  words: ").append(words).append("\n");
    sb.append("  cells: ").append(cells).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

