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
 * AddressesCount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-02T13:39:37.494742200+05:30[Asia/Calcutta]")
public class AddressesCount {
  public static final String SERIALIZED_NAME_TOTAL_ADDRESSES_FOUND = "totalAddressesFound";
  @SerializedName(SERIALIZED_NAME_TOTAL_ADDRESSES_FOUND)
  private Integer totalAddressesFound;

  public AddressesCount() { 
  }

  public AddressesCount totalAddressesFound(Integer totalAddressesFound) {
    
    this.totalAddressesFound = totalAddressesFound;
    return this;
  }

   /**
   * Get totalAddressesFound
   * @return totalAddressesFound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalAddressesFound() {
    return totalAddressesFound;
  }


  public void setTotalAddressesFound(Integer totalAddressesFound) {
    this.totalAddressesFound = totalAddressesFound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressesCount addressesCount = (AddressesCount) o;
    return Objects.equals(this.totalAddressesFound, addressesCount.totalAddressesFound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAddressesFound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressesCount {\n");
    sb.append("    totalAddressesFound: ").append(toIndentedString(totalAddressesFound)).append("\n");
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

