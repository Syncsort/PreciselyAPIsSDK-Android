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
import com.precisely.apis.model.Accuracy;
import com.precisely.apis.model.GeolocationGeometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GeoLocationAccessPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T12:58:41.974187600+05:30[Asia/Calcutta]")
public class GeoLocationAccessPoint {
  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private GeolocationGeometry geometry;

  public static final String SERIALIZED_NAME_ACCURACY = "accuracy";
  @SerializedName(SERIALIZED_NAME_ACCURACY)
  private Accuracy accuracy;

  public GeoLocationAccessPoint() { 
  }

  public GeoLocationAccessPoint geometry(GeolocationGeometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeolocationGeometry getGeometry() {
    return geometry;
  }


  public void setGeometry(GeolocationGeometry geometry) {
    this.geometry = geometry;
  }


  public GeoLocationAccessPoint accuracy(Accuracy accuracy) {
    
    this.accuracy = accuracy;
    return this;
  }

   /**
   * Get accuracy
   * @return accuracy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Accuracy getAccuracy() {
    return accuracy;
  }


  public void setAccuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocationAccessPoint geoLocationAccessPoint = (GeoLocationAccessPoint) o;
    return Objects.equals(this.geometry, geoLocationAccessPoint.geometry) &&
        Objects.equals(this.accuracy, geoLocationAccessPoint.accuracy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometry, accuracy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocationAccessPoint {\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
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

