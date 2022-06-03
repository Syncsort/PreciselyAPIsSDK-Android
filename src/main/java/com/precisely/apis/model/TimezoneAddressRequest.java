/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3
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
import com.precisely.apis.model.AddressTime;
import com.precisely.apis.model.PreferencTimeZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TimezoneAddressRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class TimezoneAddressRequest {
  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private PreferencTimeZone preferences;

  public static final String SERIALIZED_NAME_ADDRESS_TIME = "addressTime";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TIME)
  private List<AddressTime> addressTime = null;

  public TimezoneAddressRequest() { 
  }

  public TimezoneAddressRequest preferences(PreferencTimeZone preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PreferencTimeZone getPreferences() {
    return preferences;
  }


  public void setPreferences(PreferencTimeZone preferences) {
    this.preferences = preferences;
  }


  public TimezoneAddressRequest addressTime(List<AddressTime> addressTime) {
    
    this.addressTime = addressTime;
    return this;
  }

  public TimezoneAddressRequest addAddressTimeItem(AddressTime addressTimeItem) {
    if (this.addressTime == null) {
      this.addressTime = new ArrayList<AddressTime>();
    }
    this.addressTime.add(addressTimeItem);
    return this;
  }

   /**
   * Get addressTime
   * @return addressTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AddressTime> getAddressTime() {
    return addressTime;
  }


  public void setAddressTime(List<AddressTime> addressTime) {
    this.addressTime = addressTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneAddressRequest timezoneAddressRequest = (TimezoneAddressRequest) o;
    return Objects.equals(this.preferences, timezoneAddressRequest.preferences) &&
        Objects.equals(this.addressTime, timezoneAddressRequest.addressTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, addressTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneAddressRequest {\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    addressTime: ").append(toIndentedString(addressTime)).append("\n");
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
