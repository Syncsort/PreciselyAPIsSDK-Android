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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * GeocodeCustomPreferences
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-26T15:06:57.026+05:30")
public class GeocodeCustomPreferences   {
  @SerializedName("FALLBACK_TO_WORLD")
  private Boolean FALLBACK_TO_WORLD = true;

  @SerializedName("USE_ADDRESS_POINT_INTERPOLATION")
  private Boolean USE_ADDRESS_POINT_INTERPOLATION = true;

  @SerializedName("USE_CENTERLINE_OFFSET")
  private String USE_CENTERLINE_OFFSET = null;

  @SerializedName("CENTERLINE_OFFSET")
  private String CENTERLINE_OFFSET = null;

  public GeocodeCustomPreferences FALLBACK_TO_WORLD(Boolean FALLBACK_TO_WORLD) {
    this.FALLBACK_TO_WORLD = FALLBACK_TO_WORLD;
    return this;
  }

   /**
   * Get FALLBACK_TO_WORLD
   * @return FALLBACK_TO_WORLD
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFALLBACKTOWORLD() {
    return FALLBACK_TO_WORLD;
  }

  public void setFALLBACKTOWORLD(Boolean FALLBACK_TO_WORLD) {
    this.FALLBACK_TO_WORLD = FALLBACK_TO_WORLD;
  }

  public GeocodeCustomPreferences USE_ADDRESS_POINT_INTERPOLATION(Boolean USE_ADDRESS_POINT_INTERPOLATION) {
    this.USE_ADDRESS_POINT_INTERPOLATION = USE_ADDRESS_POINT_INTERPOLATION;
    return this;
  }

   /**
   * Get USE_ADDRESS_POINT_INTERPOLATION
   * @return USE_ADDRESS_POINT_INTERPOLATION
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getUSEADDRESSPOINTINTERPOLATION() {
    return USE_ADDRESS_POINT_INTERPOLATION;
  }

  public void setUSEADDRESSPOINTINTERPOLATION(Boolean USE_ADDRESS_POINT_INTERPOLATION) {
    this.USE_ADDRESS_POINT_INTERPOLATION = USE_ADDRESS_POINT_INTERPOLATION;
  }

  public GeocodeCustomPreferences USE_CENTERLINE_OFFSET(String USE_CENTERLINE_OFFSET) {
    this.USE_CENTERLINE_OFFSET = USE_CENTERLINE_OFFSET;
    return this;
  }

   /**
   * Get USE_CENTERLINE_OFFSET
   * @return USE_CENTERLINE_OFFSET
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUSECENTERLINEOFFSET() {
    return USE_CENTERLINE_OFFSET;
  }

  public void setUSECENTERLINEOFFSET(String USE_CENTERLINE_OFFSET) {
    this.USE_CENTERLINE_OFFSET = USE_CENTERLINE_OFFSET;
  }

  public GeocodeCustomPreferences CENTERLINE_OFFSET(String CENTERLINE_OFFSET) {
    this.CENTERLINE_OFFSET = CENTERLINE_OFFSET;
    return this;
  }

   /**
   * Get CENTERLINE_OFFSET
   * @return CENTERLINE_OFFSET
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCENTERLINEOFFSET() {
    return CENTERLINE_OFFSET;
  }

  public void setCENTERLINEOFFSET(String CENTERLINE_OFFSET) {
    this.CENTERLINE_OFFSET = CENTERLINE_OFFSET;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodeCustomPreferences geocodeCustomPreferences = (GeocodeCustomPreferences) o;
    return Objects.equals(this.FALLBACK_TO_WORLD, geocodeCustomPreferences.FALLBACK_TO_WORLD) &&
        Objects.equals(this.USE_ADDRESS_POINT_INTERPOLATION, geocodeCustomPreferences.USE_ADDRESS_POINT_INTERPOLATION) &&
        Objects.equals(this.USE_CENTERLINE_OFFSET, geocodeCustomPreferences.USE_CENTERLINE_OFFSET) &&
        Objects.equals(this.CENTERLINE_OFFSET, geocodeCustomPreferences.CENTERLINE_OFFSET);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FALLBACK_TO_WORLD, USE_ADDRESS_POINT_INTERPOLATION, USE_CENTERLINE_OFFSET, CENTERLINE_OFFSET);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodeCustomPreferences {\n");
    
    sb.append("    FALLBACK_TO_WORLD: ").append(toIndentedString(FALLBACK_TO_WORLD)).append("\n");
    sb.append("    USE_ADDRESS_POINT_INTERPOLATION: ").append(toIndentedString(USE_ADDRESS_POINT_INTERPOLATION)).append("\n");
    sb.append("    USE_CENTERLINE_OFFSET: ").append(toIndentedString(USE_CENTERLINE_OFFSET)).append("\n");
    sb.append("    CENTERLINE_OFFSET: ").append(toIndentedString(CENTERLINE_OFFSET)).append("\n");
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

