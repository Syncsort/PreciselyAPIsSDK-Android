/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 16.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TypeaheadUnit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-02T13:39:37.494742200+05:30[Asia/Calcutta]")
public class TypeaheadUnit {
  public static final String SERIALIZED_NAME_UNIT_INFO = "unitInfo";
  @SerializedName(SERIALIZED_NAME_UNIT_INFO)
  private String unitInfo;

  public static final String SERIALIZED_NAME_FORMATTED_UNIT_ADDRESS = "formattedUnitAddress";
  @SerializedName(SERIALIZED_NAME_FORMATTED_UNIT_ADDRESS)
  private String formattedUnitAddress;

  public TypeaheadUnit() { 
  }

  public TypeaheadUnit unitInfo(String unitInfo) {
    
    this.unitInfo = unitInfo;
    return this;
  }

   /**
   * Get unitInfo
   * @return unitInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitInfo() {
    return unitInfo;
  }


  public void setUnitInfo(String unitInfo) {
    this.unitInfo = unitInfo;
  }


  public TypeaheadUnit formattedUnitAddress(String formattedUnitAddress) {
    
    this.formattedUnitAddress = formattedUnitAddress;
    return this;
  }

   /**
   * Get formattedUnitAddress
   * @return formattedUnitAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFormattedUnitAddress() {
    return formattedUnitAddress;
  }


  public void setFormattedUnitAddress(String formattedUnitAddress) {
    this.formattedUnitAddress = formattedUnitAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeaheadUnit typeaheadUnit = (TypeaheadUnit) o;
    return Objects.equals(this.unitInfo, typeaheadUnit.unitInfo) &&
        Objects.equals(this.formattedUnitAddress, typeaheadUnit.formattedUnitAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitInfo, formattedUnitAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeaheadUnit {\n");
    sb.append("    unitInfo: ").append(toIndentedString(unitInfo)).append("\n");
    sb.append("    formattedUnitAddress: ").append(toIndentedString(formattedUnitAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

