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
import com.precisely.apis.model.Boundaries;
import com.precisely.apis.model.DemographicsThemesV2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Demographics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T12:58:41.974187600+05:30[Asia/Calcutta]")
public class Demographics {
  public static final String SERIALIZED_NAME_BOUNDARIES = "boundaries";
  @SerializedName(SERIALIZED_NAME_BOUNDARIES)
  private Boundaries boundaries;

  public static final String SERIALIZED_NAME_THEMES = "themes";
  @SerializedName(SERIALIZED_NAME_THEMES)
  private DemographicsThemesV2 themes;

  public static final String SERIALIZED_NAME_BOUNDARY_THEMES = "boundaryThemes";
  @SerializedName(SERIALIZED_NAME_BOUNDARY_THEMES)
  private List<DemographicsThemesV2> boundaryThemes = null;

  public Demographics() { 
  }

  public Demographics boundaries(Boundaries boundaries) {
    
    this.boundaries = boundaries;
    return this;
  }

   /**
   * Get boundaries
   * @return boundaries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boundaries getBoundaries() {
    return boundaries;
  }


  public void setBoundaries(Boundaries boundaries) {
    this.boundaries = boundaries;
  }


  public Demographics themes(DemographicsThemesV2 themes) {
    
    this.themes = themes;
    return this;
  }

   /**
   * Get themes
   * @return themes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DemographicsThemesV2 getThemes() {
    return themes;
  }


  public void setThemes(DemographicsThemesV2 themes) {
    this.themes = themes;
  }


  public Demographics boundaryThemes(List<DemographicsThemesV2> boundaryThemes) {
    
    this.boundaryThemes = boundaryThemes;
    return this;
  }

  public Demographics addBoundaryThemesItem(DemographicsThemesV2 boundaryThemesItem) {
    if (this.boundaryThemes == null) {
      this.boundaryThemes = new ArrayList<DemographicsThemesV2>();
    }
    this.boundaryThemes.add(boundaryThemesItem);
    return this;
  }

   /**
   * Get boundaryThemes
   * @return boundaryThemes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DemographicsThemesV2> getBoundaryThemes() {
    return boundaryThemes;
  }


  public void setBoundaryThemes(List<DemographicsThemesV2> boundaryThemes) {
    this.boundaryThemes = boundaryThemes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Demographics demographics = (Demographics) o;
    return Objects.equals(this.boundaries, demographics.boundaries) &&
        Objects.equals(this.themes, demographics.themes) &&
        Objects.equals(this.boundaryThemes, demographics.boundaryThemes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundaries, themes, boundaryThemes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Demographics {\n");
    sb.append("    boundaries: ").append(toIndentedString(boundaries)).append("\n");
    sb.append("    themes: ").append(toIndentedString(themes)).append("\n");
    sb.append("    boundaryThemes: ").append(toIndentedString(boundaryThemes)).append("\n");
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

