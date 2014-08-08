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
public class QuestionnaireCollectorStyleFont {
  private String fontFamily = null;
  private Integer fontSize = null;
  private String color = null;
  private Boolean isBold = null;
  private Boolean isItalic = null;
  public String getFontFamily() {
    return fontFamily;
  }
  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }

  public Integer getFontSize() {
    return fontSize;
  }
  public void setFontSize(Integer fontSize) {
    this.fontSize = fontSize;
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  public Boolean getIsBold() {
    return isBold;
  }
  public void setIsBold(Boolean isBold) {
    this.isBold = isBold;
  }

  public Boolean getIsItalic() {
    return isItalic;
  }
  public void setIsItalic(Boolean isItalic) {
    this.isItalic = isItalic;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionnaireCollectorStyleFont {\n");
    sb.append("  fontFamily: ").append(fontFamily).append("\n");
    sb.append("  fontSize: ").append(fontSize).append("\n");
    sb.append("  color: ").append(color).append("\n");
    sb.append("  isBold: ").append(isBold).append("\n");
    sb.append("  isItalic: ").append(isItalic).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

