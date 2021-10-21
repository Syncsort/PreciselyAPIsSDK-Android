/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.6.0
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
 * CustomPreferences
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-21T13:09:30.973+05:30")
public class CustomPreferences   {
  @SerializedName("FIND_ADDR_POINT_INTERP")
  private Boolean FIND_ADDR_POINT_INTERP = false;

  @SerializedName("FIND_SEARCH_AREA")
  private String FIND_SEARCH_AREA = "1";

  @SerializedName("FIND_ADDRESS_RANGE")
  private Boolean FIND_ADDRESS_RANGE = false;

  @SerializedName("FIND_EXPANDED_SEARCH_RADIUS")
  private String FIND_EXPANDED_SEARCH_RADIUS = "25";

  @SerializedName("FIND_ALTERNATE_LOOKUP")
  private String FIND_ALTERNATE_LOOKUP = "3";

  @SerializedName("FIND_STREET_CENTROID")
  private Boolean FIND_STREET_CENTROID = false;

  @SerializedName("FIND_FIRST_LETTER_EXPANDED")
  private Boolean FIND_FIRST_LETTER_EXPANDED = false;

  public CustomPreferences FIND_ADDR_POINT_INTERP(Boolean FIND_ADDR_POINT_INTERP) {
    this.FIND_ADDR_POINT_INTERP = FIND_ADDR_POINT_INTERP;
    return this;
  }

   /**
   * Get FIND_ADDR_POINT_INTERP
   * @return FIND_ADDR_POINT_INTERP
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFINDADDRPOINTINTERP() {
    return FIND_ADDR_POINT_INTERP;
  }

  public void setFINDADDRPOINTINTERP(Boolean FIND_ADDR_POINT_INTERP) {
    this.FIND_ADDR_POINT_INTERP = FIND_ADDR_POINT_INTERP;
  }

  public CustomPreferences FIND_SEARCH_AREA(String FIND_SEARCH_AREA) {
    this.FIND_SEARCH_AREA = FIND_SEARCH_AREA;
    return this;
  }

   /**
   * Get FIND_SEARCH_AREA
   * @return FIND_SEARCH_AREA
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFINDSEARCHAREA() {
    return FIND_SEARCH_AREA;
  }

  public void setFINDSEARCHAREA(String FIND_SEARCH_AREA) {
    this.FIND_SEARCH_AREA = FIND_SEARCH_AREA;
  }

  public CustomPreferences FIND_ADDRESS_RANGE(Boolean FIND_ADDRESS_RANGE) {
    this.FIND_ADDRESS_RANGE = FIND_ADDRESS_RANGE;
    return this;
  }

   /**
   * Get FIND_ADDRESS_RANGE
   * @return FIND_ADDRESS_RANGE
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFINDADDRESSRANGE() {
    return FIND_ADDRESS_RANGE;
  }

  public void setFINDADDRESSRANGE(Boolean FIND_ADDRESS_RANGE) {
    this.FIND_ADDRESS_RANGE = FIND_ADDRESS_RANGE;
  }

  public CustomPreferences FIND_EXPANDED_SEARCH_RADIUS(String FIND_EXPANDED_SEARCH_RADIUS) {
    this.FIND_EXPANDED_SEARCH_RADIUS = FIND_EXPANDED_SEARCH_RADIUS;
    return this;
  }

   /**
   * Get FIND_EXPANDED_SEARCH_RADIUS
   * @return FIND_EXPANDED_SEARCH_RADIUS
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFINDEXPANDEDSEARCHRADIUS() {
    return FIND_EXPANDED_SEARCH_RADIUS;
  }

  public void setFINDEXPANDEDSEARCHRADIUS(String FIND_EXPANDED_SEARCH_RADIUS) {
    this.FIND_EXPANDED_SEARCH_RADIUS = FIND_EXPANDED_SEARCH_RADIUS;
  }

  public CustomPreferences FIND_ALTERNATE_LOOKUP(String FIND_ALTERNATE_LOOKUP) {
    this.FIND_ALTERNATE_LOOKUP = FIND_ALTERNATE_LOOKUP;
    return this;
  }

   /**
   * Get FIND_ALTERNATE_LOOKUP
   * @return FIND_ALTERNATE_LOOKUP
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFINDALTERNATELOOKUP() {
    return FIND_ALTERNATE_LOOKUP;
  }

  public void setFINDALTERNATELOOKUP(String FIND_ALTERNATE_LOOKUP) {
    this.FIND_ALTERNATE_LOOKUP = FIND_ALTERNATE_LOOKUP;
  }

  public CustomPreferences FIND_STREET_CENTROID(Boolean FIND_STREET_CENTROID) {
    this.FIND_STREET_CENTROID = FIND_STREET_CENTROID;
    return this;
  }

   /**
   * Get FIND_STREET_CENTROID
   * @return FIND_STREET_CENTROID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFINDSTREETCENTROID() {
    return FIND_STREET_CENTROID;
  }

  public void setFINDSTREETCENTROID(Boolean FIND_STREET_CENTROID) {
    this.FIND_STREET_CENTROID = FIND_STREET_CENTROID;
  }

  public CustomPreferences FIND_FIRST_LETTER_EXPANDED(Boolean FIND_FIRST_LETTER_EXPANDED) {
    this.FIND_FIRST_LETTER_EXPANDED = FIND_FIRST_LETTER_EXPANDED;
    return this;
  }

   /**
   * Get FIND_FIRST_LETTER_EXPANDED
   * @return FIND_FIRST_LETTER_EXPANDED
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFINDFIRSTLETTEREXPANDED() {
    return FIND_FIRST_LETTER_EXPANDED;
  }

  public void setFINDFIRSTLETTEREXPANDED(Boolean FIND_FIRST_LETTER_EXPANDED) {
    this.FIND_FIRST_LETTER_EXPANDED = FIND_FIRST_LETTER_EXPANDED;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomPreferences customPreferences = (CustomPreferences) o;
    return Objects.equals(this.FIND_ADDR_POINT_INTERP, customPreferences.FIND_ADDR_POINT_INTERP) &&
        Objects.equals(this.FIND_SEARCH_AREA, customPreferences.FIND_SEARCH_AREA) &&
        Objects.equals(this.FIND_ADDRESS_RANGE, customPreferences.FIND_ADDRESS_RANGE) &&
        Objects.equals(this.FIND_EXPANDED_SEARCH_RADIUS, customPreferences.FIND_EXPANDED_SEARCH_RADIUS) &&
        Objects.equals(this.FIND_ALTERNATE_LOOKUP, customPreferences.FIND_ALTERNATE_LOOKUP) &&
        Objects.equals(this.FIND_STREET_CENTROID, customPreferences.FIND_STREET_CENTROID) &&
        Objects.equals(this.FIND_FIRST_LETTER_EXPANDED, customPreferences.FIND_FIRST_LETTER_EXPANDED);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FIND_ADDR_POINT_INTERP, FIND_SEARCH_AREA, FIND_ADDRESS_RANGE, FIND_EXPANDED_SEARCH_RADIUS, FIND_ALTERNATE_LOOKUP, FIND_STREET_CENTROID, FIND_FIRST_LETTER_EXPANDED);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomPreferences {\n");
    
    sb.append("    FIND_ADDR_POINT_INTERP: ").append(toIndentedString(FIND_ADDR_POINT_INTERP)).append("\n");
    sb.append("    FIND_SEARCH_AREA: ").append(toIndentedString(FIND_SEARCH_AREA)).append("\n");
    sb.append("    FIND_ADDRESS_RANGE: ").append(toIndentedString(FIND_ADDRESS_RANGE)).append("\n");
    sb.append("    FIND_EXPANDED_SEARCH_RADIUS: ").append(toIndentedString(FIND_EXPANDED_SEARCH_RADIUS)).append("\n");
    sb.append("    FIND_ALTERNATE_LOOKUP: ").append(toIndentedString(FIND_ALTERNATE_LOOKUP)).append("\n");
    sb.append("    FIND_STREET_CENTROID: ").append(toIndentedString(FIND_STREET_CENTROID)).append("\n");
    sb.append("    FIND_FIRST_LETTER_EXPANDED: ").append(toIndentedString(FIND_FIRST_LETTER_EXPANDED)).append("\n");
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

