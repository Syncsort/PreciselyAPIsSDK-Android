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
import com.precisely.apis.model.LocationTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TimezoneLocationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-02T13:39:37.494742200+05:30[Asia/Calcutta]")
public class TimezoneLocationRequest {
  public static final String SERIALIZED_NAME_LOCATION_TIME = "locationTime";
  @SerializedName(SERIALIZED_NAME_LOCATION_TIME)
  private List<LocationTime> locationTime = null;

  public TimezoneLocationRequest() { 
  }

  public TimezoneLocationRequest locationTime(List<LocationTime> locationTime) {
    
    this.locationTime = locationTime;
    return this;
  }

  public TimezoneLocationRequest addLocationTimeItem(LocationTime locationTimeItem) {
    if (this.locationTime == null) {
      this.locationTime = new ArrayList<LocationTime>();
    }
    this.locationTime.add(locationTimeItem);
    return this;
  }

   /**
   * Get locationTime
   * @return locationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LocationTime> getLocationTime() {
    return locationTime;
  }


  public void setLocationTime(List<LocationTime> locationTime) {
    this.locationTime = locationTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneLocationRequest timezoneLocationRequest = (TimezoneLocationRequest) o;
    return Objects.equals(this.locationTime, timezoneLocationRequest.locationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneLocationRequest {\n");
    sb.append("    locationTime: ").append(toIndentedString(locationTime)).append("\n");
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

