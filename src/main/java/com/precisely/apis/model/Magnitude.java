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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Magnitude
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T12:58:41.974187600+05:30[Asia/Calcutta]")
public class Magnitude {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private String scale;

  public static final String SERIALIZED_NAME_BODY_WAVE = "bodyWave";
  @SerializedName(SERIALIZED_NAME_BODY_WAVE)
  private Double bodyWave;

  public static final String SERIALIZED_NAME_SURFACE_WAVE = "surfaceWave";
  @SerializedName(SERIALIZED_NAME_SURFACE_WAVE)
  private Double surfaceWave;

  public static final String SERIALIZED_NAME_SURFACE_WAVE_VALUE = "surfaceWaveValue";
  @SerializedName(SERIALIZED_NAME_SURFACE_WAVE_VALUE)
  private Double surfaceWaveValue;

  public static final String SERIALIZED_NAME_BODY_WAVE_VALUE = "bodyWaveValue";
  @SerializedName(SERIALIZED_NAME_BODY_WAVE_VALUE)
  private Double bodyWaveValue;

  public Magnitude() { 
  }

  public Magnitude value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  public Magnitude scale(String scale) {
    
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScale() {
    return scale;
  }


  public void setScale(String scale) {
    this.scale = scale;
  }


  public Magnitude bodyWave(Double bodyWave) {
    
    this.bodyWave = bodyWave;
    return this;
  }

   /**
   * Get bodyWave
   * @return bodyWave
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBodyWave() {
    return bodyWave;
  }


  public void setBodyWave(Double bodyWave) {
    this.bodyWave = bodyWave;
  }


  public Magnitude surfaceWave(Double surfaceWave) {
    
    this.surfaceWave = surfaceWave;
    return this;
  }

   /**
   * Get surfaceWave
   * @return surfaceWave
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSurfaceWave() {
    return surfaceWave;
  }


  public void setSurfaceWave(Double surfaceWave) {
    this.surfaceWave = surfaceWave;
  }


  public Magnitude surfaceWaveValue(Double surfaceWaveValue) {
    
    this.surfaceWaveValue = surfaceWaveValue;
    return this;
  }

   /**
   * Get surfaceWaveValue
   * @return surfaceWaveValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSurfaceWaveValue() {
    return surfaceWaveValue;
  }


  public void setSurfaceWaveValue(Double surfaceWaveValue) {
    this.surfaceWaveValue = surfaceWaveValue;
  }


  public Magnitude bodyWaveValue(Double bodyWaveValue) {
    
    this.bodyWaveValue = bodyWaveValue;
    return this;
  }

   /**
   * Get bodyWaveValue
   * @return bodyWaveValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBodyWaveValue() {
    return bodyWaveValue;
  }


  public void setBodyWaveValue(Double bodyWaveValue) {
    this.bodyWaveValue = bodyWaveValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Magnitude magnitude = (Magnitude) o;
    return Objects.equals(this.value, magnitude.value) &&
        Objects.equals(this.scale, magnitude.scale) &&
        Objects.equals(this.bodyWave, magnitude.bodyWave) &&
        Objects.equals(this.surfaceWave, magnitude.surfaceWave) &&
        Objects.equals(this.surfaceWaveValue, magnitude.surfaceWaveValue) &&
        Objects.equals(this.bodyWaveValue, magnitude.bodyWaveValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, scale, bodyWave, surfaceWave, surfaceWaveValue, bodyWaveValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Magnitude {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    bodyWave: ").append(toIndentedString(bodyWave)).append("\n");
    sb.append("    surfaceWave: ").append(toIndentedString(surfaceWave)).append("\n");
    sb.append("    surfaceWaveValue: ").append(toIndentedString(surfaceWaveValue)).append("\n");
    sb.append("    bodyWaveValue: ").append(toIndentedString(bodyWaveValue)).append("\n");
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

