/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.2
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
import com.precisely.apis.model.GeoPos;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Points
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-26T15:06:57.026+05:30")
public class Points   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("geometry")
  private GeoPos geometry = null;

  public Points objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public Points country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Points geometry(GeoPos geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public GeoPos getGeometry() {
    return geometry;
  }

  public void setGeometry(GeoPos geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Points points = (Points) o;
    return Objects.equals(this.objectId, points.objectId) &&
        Objects.equals(this.country, points.country) &&
        Objects.equals(this.geometry, points.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, country, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Points {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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

