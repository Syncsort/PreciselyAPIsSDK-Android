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
import com.precisely.apis.model.StartEndPoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Matrix
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-02T13:39:37.494742200+05:30[Asia/Calcutta]")
public class Matrix {
  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private BigDecimal distance;

  public static final String SERIALIZED_NAME_DISTANCE_UNIT = "distanceUnit";
  @SerializedName(SERIALIZED_NAME_DISTANCE_UNIT)
  private String distanceUnit;

  public static final String SERIALIZED_NAME_END_POINT = "endPoint";
  @SerializedName(SERIALIZED_NAME_END_POINT)
  private StartEndPoint endPoint;

  public static final String SERIALIZED_NAME_START_POINT = "startPoint";
  @SerializedName(SERIALIZED_NAME_START_POINT)
  private StartEndPoint startPoint;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private BigDecimal time;

  public static final String SERIALIZED_NAME_TIME_UNIT = "timeUnit";
  @SerializedName(SERIALIZED_NAME_TIME_UNIT)
  private String timeUnit;

  public Matrix() { 
  }

  public Matrix distance(BigDecimal distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDistance() {
    return distance;
  }


  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }


  public Matrix distanceUnit(String distanceUnit) {
    
    this.distanceUnit = distanceUnit;
    return this;
  }

   /**
   * Get distanceUnit
   * @return distanceUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistanceUnit() {
    return distanceUnit;
  }


  public void setDistanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
  }


  public Matrix endPoint(StartEndPoint endPoint) {
    
    this.endPoint = endPoint;
    return this;
  }

   /**
   * Get endPoint
   * @return endPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StartEndPoint getEndPoint() {
    return endPoint;
  }


  public void setEndPoint(StartEndPoint endPoint) {
    this.endPoint = endPoint;
  }


  public Matrix startPoint(StartEndPoint startPoint) {
    
    this.startPoint = startPoint;
    return this;
  }

   /**
   * Get startPoint
   * @return startPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StartEndPoint getStartPoint() {
    return startPoint;
  }


  public void setStartPoint(StartEndPoint startPoint) {
    this.startPoint = startPoint;
  }


  public Matrix time(BigDecimal time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTime() {
    return time;
  }


  public void setTime(BigDecimal time) {
    this.time = time;
  }


  public Matrix timeUnit(String timeUnit) {
    
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimeUnit() {
    return timeUnit;
  }


  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Matrix matrix = (Matrix) o;
    return Objects.equals(this.distance, matrix.distance) &&
        Objects.equals(this.distanceUnit, matrix.distanceUnit) &&
        Objects.equals(this.endPoint, matrix.endPoint) &&
        Objects.equals(this.startPoint, matrix.startPoint) &&
        Objects.equals(this.time, matrix.time) &&
        Objects.equals(this.timeUnit, matrix.timeUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, distanceUnit, endPoint, startPoint, time, timeUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Matrix {\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    distanceUnit: ").append(toIndentedString(distanceUnit)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    startPoint: ").append(toIndentedString(startPoint)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
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

