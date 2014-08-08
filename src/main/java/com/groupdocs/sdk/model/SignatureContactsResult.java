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
import com.groupdocs.sdk.model.SignatureContactInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureContactsResult {
  private Integer count = null;
  private List<SignatureContactInfo> contacts = new ArrayList<SignatureContactInfo>();
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  public List<SignatureContactInfo> getContacts() {
    return contacts;
  }
  public void setContacts(List<SignatureContactInfo> contacts) {
    this.contacts = contacts;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureContactsResult {\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("  contacts: ").append(contacts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

