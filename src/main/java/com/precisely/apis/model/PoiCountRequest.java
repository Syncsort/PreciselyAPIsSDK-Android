/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 9.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.precisely.apis.model.CommonGeometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * PoiCountRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-27T18:29:18.933+05:30")
public class PoiCountRequest   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("categoryCode")
  private String categoryCode = null;

  @SerializedName("sicCode")
  private String sicCode = null;

  @SerializedName("fuzzyOnName")
  private String fuzzyOnName = null;

  @SerializedName("geometry")
  private CommonGeometry geometry = null;

  @SerializedName("geometryAsText")
  private String geometryAsText = null;

  public PoiCountRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PoiCountRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PoiCountRequest categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Get categoryCode
   * @return categoryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public PoiCountRequest sicCode(String sicCode) {
    this.sicCode = sicCode;
    return this;
  }

   /**
   * Get sicCode
   * @return sicCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSicCode() {
    return sicCode;
  }

  public void setSicCode(String sicCode) {
    this.sicCode = sicCode;
  }

  public PoiCountRequest fuzzyOnName(String fuzzyOnName) {
    this.fuzzyOnName = fuzzyOnName;
    return this;
  }

   /**
   * Get fuzzyOnName
   * @return fuzzyOnName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFuzzyOnName() {
    return fuzzyOnName;
  }

  public void setFuzzyOnName(String fuzzyOnName) {
    this.fuzzyOnName = fuzzyOnName;
  }

  public PoiCountRequest geometry(CommonGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommonGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(CommonGeometry geometry) {
    this.geometry = geometry;
  }

  public PoiCountRequest geometryAsText(String geometryAsText) {
    this.geometryAsText = geometryAsText;
    return this;
  }

   /**
   * Get geometryAsText
   * @return geometryAsText
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGeometryAsText() {
    return geometryAsText;
  }

  public void setGeometryAsText(String geometryAsText) {
    this.geometryAsText = geometryAsText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiCountRequest poiCountRequest = (PoiCountRequest) o;
    return Objects.equals(this.name, poiCountRequest.name) &&
        Objects.equals(this.type, poiCountRequest.type) &&
        Objects.equals(this.categoryCode, poiCountRequest.categoryCode) &&
        Objects.equals(this.sicCode, poiCountRequest.sicCode) &&
        Objects.equals(this.fuzzyOnName, poiCountRequest.fuzzyOnName) &&
        Objects.equals(this.geometry, poiCountRequest.geometry) &&
        Objects.equals(this.geometryAsText, poiCountRequest.geometryAsText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, categoryCode, sicCode, fuzzyOnName, geometry, geometryAsText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiCountRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    sicCode: ").append(toIndentedString(sicCode)).append("\n");
    sb.append("    fuzzyOnName: ").append(toIndentedString(fuzzyOnName)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    geometryAsText: ").append(toIndentedString(geometryAsText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

