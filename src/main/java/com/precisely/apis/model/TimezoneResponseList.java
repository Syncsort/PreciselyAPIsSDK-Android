/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 17.1.0
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
import com.precisely.apis.model.TimezoneResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TimezoneResponseList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T12:58:41.974187600+05:30[Asia/Calcutta]")
public class TimezoneResponseList {
  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private List<TimezoneResponse> timezone = null;

  public TimezoneResponseList() { 
  }

  public TimezoneResponseList timezone(List<TimezoneResponse> timezone) {
    
    this.timezone = timezone;
    return this;
  }

  public TimezoneResponseList addTimezoneItem(TimezoneResponse timezoneItem) {
    if (this.timezone == null) {
      this.timezone = new ArrayList<TimezoneResponse>();
    }
    this.timezone.add(timezoneItem);
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TimezoneResponse> getTimezone() {
    return timezone;
  }


  public void setTimezone(List<TimezoneResponse> timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneResponseList timezoneResponseList = (TimezoneResponseList) o;
    return Objects.equals(this.timezone, timezoneResponseList.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneResponseList {\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

