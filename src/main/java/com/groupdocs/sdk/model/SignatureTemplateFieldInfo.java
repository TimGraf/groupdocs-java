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
import com.groupdocs.sdk.model.SignatureTemplateFieldLocationInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureTemplateFieldInfo {
  private String id = null;
  private String templateId = null;
  private String recipientId = null;
  private String name = null;
  private Boolean mandatory = null;
  private Double order = null;
  private String regularExpression = null;
  private Double signatureFieldId = null;
  private List<SignatureTemplateFieldLocationInfo> locations = new ArrayList<SignatureTemplateFieldLocationInfo>();
  private Integer fieldType = null;
  private String acceptableValues = null;
  private String defaultValue = null;
  private String tooltip = null;
  private String guidanceText = null;
  private String groupName = null;
  private String settings = null;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public String getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Boolean getMandatory() {
    return mandatory;
  }
  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public Double getOrder() {
    return order;
  }
  public void setOrder(Double order) {
    this.order = order;
  }

  public String getRegularExpression() {
    return regularExpression;
  }
  public void setRegularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
  }

  public Double getSignatureFieldId() {
    return signatureFieldId;
  }
  public void setSignatureFieldId(Double signatureFieldId) {
    this.signatureFieldId = signatureFieldId;
  }

  public List<SignatureTemplateFieldLocationInfo> getLocations() {
    return locations;
  }
  public void setLocations(List<SignatureTemplateFieldLocationInfo> locations) {
    this.locations = locations;
  }

  public Integer getFieldType() {
    return fieldType;
  }
  public void setFieldType(Integer fieldType) {
    this.fieldType = fieldType;
  }

  public String getAcceptableValues() {
    return acceptableValues;
  }
  public void setAcceptableValues(String acceptableValues) {
    this.acceptableValues = acceptableValues;
  }

  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public String getTooltip() {
    return tooltip;
  }
  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public String getGuidanceText() {
    return guidanceText;
  }
  public void setGuidanceText(String guidanceText) {
    this.guidanceText = guidanceText;
  }

  public String getGroupName() {
    return groupName;
  }
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public String getSettings() {
    return settings;
  }
  public void setSettings(String settings) {
    this.settings = settings;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureTemplateFieldInfo {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  templateId: ").append(templateId).append("\n");
    sb.append("  recipientId: ").append(recipientId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  mandatory: ").append(mandatory).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  regularExpression: ").append(regularExpression).append("\n");
    sb.append("  signatureFieldId: ").append(signatureFieldId).append("\n");
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("  fieldType: ").append(fieldType).append("\n");
    sb.append("  acceptableValues: ").append(acceptableValues).append("\n");
    sb.append("  defaultValue: ").append(defaultValue).append("\n");
    sb.append("  tooltip: ").append(tooltip).append("\n");
    sb.append("  guidanceText: ").append(guidanceText).append("\n");
    sb.append("  groupName: ").append(groupName).append("\n");
    sb.append("  settings: ").append(settings).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

