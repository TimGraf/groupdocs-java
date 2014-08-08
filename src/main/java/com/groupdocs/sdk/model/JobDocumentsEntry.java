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
import com.groupdocs.sdk.model.JobInputDocument;
import com.groupdocs.sdk.model.JobOutputDocument;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class JobDocumentsEntry {
  private List<JobInputDocument> inputs = new ArrayList<JobInputDocument>();
  private List<JobOutputDocument> outputs = new ArrayList<JobOutputDocument>();
  public List<JobInputDocument> getInputs() {
    return inputs;
  }
  public void setInputs(List<JobInputDocument> inputs) {
    this.inputs = inputs;
  }

  public List<JobOutputDocument> getOutputs() {
    return outputs;
  }
  public void setOutputs(List<JobOutputDocument> outputs) {
    this.outputs = outputs;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDocumentsEntry {\n");
    sb.append("  inputs: ").append(inputs).append("\n");
    sb.append("  outputs: ").append(outputs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

