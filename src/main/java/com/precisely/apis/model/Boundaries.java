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
import com.precisely.apis.model.Boundary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Boundaries
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class Boundaries {
  public static final String SERIALIZED_NAME_BOUNDARY_TYPE = "boundaryType";
  @SerializedName(SERIALIZED_NAME_BOUNDARY_TYPE)
  private String boundaryType;

  public static final String SERIALIZED_NAME_BOUNDARY_REF = "boundaryRef";
  @SerializedName(SERIALIZED_NAME_BOUNDARY_REF)
  private String boundaryRef;

  public static final String SERIALIZED_NAME_BOUNDARY = "boundary";
  @SerializedName(SERIALIZED_NAME_BOUNDARY)
  private List<Boundary> boundary = new ArrayList<Boundary>();

  public Boundaries() { 
  }

  public Boundaries boundaryType(String boundaryType) {
    
    this.boundaryType = boundaryType;
    return this;
  }

   /**
   * Get boundaryType
   * @return boundaryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBoundaryType() {
    return boundaryType;
  }


  public void setBoundaryType(String boundaryType) {
    this.boundaryType = boundaryType;
  }


  public Boundaries boundaryRef(String boundaryRef) {
    
    this.boundaryRef = boundaryRef;
    return this;
  }

   /**
   * Get boundaryRef
   * @return boundaryRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBoundaryRef() {
    return boundaryRef;
  }


  public void setBoundaryRef(String boundaryRef) {
    this.boundaryRef = boundaryRef;
  }


  public Boundaries boundary(List<Boundary> boundary) {
    
    this.boundary = boundary;
    return this;
  }

  public Boundaries addBoundaryItem(Boundary boundaryItem) {
    this.boundary.add(boundaryItem);
    return this;
  }

   /**
   * Get boundary
   * @return boundary
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Boundary> getBoundary() {
    return boundary;
  }


  public void setBoundary(List<Boundary> boundary) {
    this.boundary = boundary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boundaries boundaries = (Boundaries) o;
    return Objects.equals(this.boundaryType, boundaries.boundaryType) &&
        Objects.equals(this.boundaryRef, boundaries.boundaryRef) &&
        Objects.equals(this.boundary, boundaries.boundary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundaryType, boundaryRef, boundary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boundaries {\n");
    sb.append("    boundaryType: ").append(toIndentedString(boundaryType)).append("\n");
    sb.append("    boundaryRef: ").append(toIndentedString(boundaryRef)).append("\n");
    sb.append("    boundary: ").append(toIndentedString(boundary)).append("\n");
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
