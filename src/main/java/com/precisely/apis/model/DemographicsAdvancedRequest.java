/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.0
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
import com.precisely.apis.model.DemographicsAdvancedPreferences;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * DemographicsAdvancedRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-29T16:11:29.305+05:30")
public class DemographicsAdvancedRequest   {
  @SerializedName("preferences")
  private DemographicsAdvancedPreferences preferences = null;

  @SerializedName("geometry")
  private CommonGeometry geometry = null;

  @SerializedName("geometryAsText")
  private String geometryAsText = null;

  public DemographicsAdvancedRequest preferences(DemographicsAdvancedPreferences preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public DemographicsAdvancedPreferences getPreferences() {
    return preferences;
  }

  public void setPreferences(DemographicsAdvancedPreferences preferences) {
    this.preferences = preferences;
  }

  public DemographicsAdvancedRequest geometry(CommonGeometry geometry) {
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

  public DemographicsAdvancedRequest geometryAsText(String geometryAsText) {
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
    DemographicsAdvancedRequest demographicsAdvancedRequest = (DemographicsAdvancedRequest) o;
    return Objects.equals(this.preferences, demographicsAdvancedRequest.preferences) &&
        Objects.equals(this.geometry, demographicsAdvancedRequest.geometry) &&
        Objects.equals(this.geometryAsText, demographicsAdvancedRequest.geometryAsText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, geometry, geometryAsText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemographicsAdvancedRequest {\n");
    
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
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

