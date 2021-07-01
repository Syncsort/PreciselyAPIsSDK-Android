/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Risk
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-29T16:11:29.305+05:30")
public class Risk   {
  @SerializedName("type")
  private String type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("risk50Rating")
  private Integer risk50Rating = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("nonburn")
  private String nonburn = null;

  @SerializedName("pastFires")
  private Integer pastFires = null;

  @SerializedName("severity")
  private Integer severity = null;

  @SerializedName("continuity")
  private String continuity = null;

  @SerializedName("adjustment")
  private String adjustment = null;

  @SerializedName("aspect")
  private String aspect = null;

  @SerializedName("crownFire")
  private String crownFire = null;

  @SerializedName("vegetation")
  private String vegetation = null;

  @SerializedName("foehn")
  private String foehn = null;

  @SerializedName("golfCourse")
  private String golfCourse = null;

  @SerializedName("roadDist")
  private String roadDist = null;

  @SerializedName("slope")
  private String slope = null;

  @SerializedName("waterDist")
  private String waterDist = null;

  @SerializedName("tier")
  private String tier = null;

  @SerializedName("tierDescription")
  private String tierDescription = null;

  @SerializedName("distanceToFireStation")
  private Integer distanceToFireStation = null;

  public Risk type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Risk description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Risk risk50Rating(Integer risk50Rating) {
    this.risk50Rating = risk50Rating;
    return this;
  }

   /**
   * Get risk50Rating
   * @return risk50Rating
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRisk50Rating() {
    return risk50Rating;
  }

  public void setRisk50Rating(Integer risk50Rating) {
    this.risk50Rating = risk50Rating;
  }

  public Risk frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public Risk nonburn(String nonburn) {
    this.nonburn = nonburn;
    return this;
  }

   /**
   * Get nonburn
   * @return nonburn
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNonburn() {
    return nonburn;
  }

  public void setNonburn(String nonburn) {
    this.nonburn = nonburn;
  }

  public Risk pastFires(Integer pastFires) {
    this.pastFires = pastFires;
    return this;
  }

   /**
   * Get pastFires
   * @return pastFires
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPastFires() {
    return pastFires;
  }

  public void setPastFires(Integer pastFires) {
    this.pastFires = pastFires;
  }

  public Risk severity(Integer severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSeverity() {
    return severity;
  }

  public void setSeverity(Integer severity) {
    this.severity = severity;
  }

  public Risk continuity(String continuity) {
    this.continuity = continuity;
    return this;
  }

   /**
   * Get continuity
   * @return continuity
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContinuity() {
    return continuity;
  }

  public void setContinuity(String continuity) {
    this.continuity = continuity;
  }

  public Risk adjustment(String adjustment) {
    this.adjustment = adjustment;
    return this;
  }

   /**
   * Get adjustment
   * @return adjustment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(String adjustment) {
    this.adjustment = adjustment;
  }

  public Risk aspect(String aspect) {
    this.aspect = aspect;
    return this;
  }

   /**
   * Get aspect
   * @return aspect
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAspect() {
    return aspect;
  }

  public void setAspect(String aspect) {
    this.aspect = aspect;
  }

  public Risk crownFire(String crownFire) {
    this.crownFire = crownFire;
    return this;
  }

   /**
   * Get crownFire
   * @return crownFire
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCrownFire() {
    return crownFire;
  }

  public void setCrownFire(String crownFire) {
    this.crownFire = crownFire;
  }

  public Risk vegetation(String vegetation) {
    this.vegetation = vegetation;
    return this;
  }

   /**
   * Get vegetation
   * @return vegetation
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVegetation() {
    return vegetation;
  }

  public void setVegetation(String vegetation) {
    this.vegetation = vegetation;
  }

  public Risk foehn(String foehn) {
    this.foehn = foehn;
    return this;
  }

   /**
   * Get foehn
   * @return foehn
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFoehn() {
    return foehn;
  }

  public void setFoehn(String foehn) {
    this.foehn = foehn;
  }

  public Risk golfCourse(String golfCourse) {
    this.golfCourse = golfCourse;
    return this;
  }

   /**
   * Get golfCourse
   * @return golfCourse
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGolfCourse() {
    return golfCourse;
  }

  public void setGolfCourse(String golfCourse) {
    this.golfCourse = golfCourse;
  }

  public Risk roadDist(String roadDist) {
    this.roadDist = roadDist;
    return this;
  }

   /**
   * Get roadDist
   * @return roadDist
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRoadDist() {
    return roadDist;
  }

  public void setRoadDist(String roadDist) {
    this.roadDist = roadDist;
  }

  public Risk slope(String slope) {
    this.slope = slope;
    return this;
  }

   /**
   * Get slope
   * @return slope
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSlope() {
    return slope;
  }

  public void setSlope(String slope) {
    this.slope = slope;
  }

  public Risk waterDist(String waterDist) {
    this.waterDist = waterDist;
    return this;
  }

   /**
   * Get waterDist
   * @return waterDist
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWaterDist() {
    return waterDist;
  }

  public void setWaterDist(String waterDist) {
    this.waterDist = waterDist;
  }

  public Risk tier(String tier) {
    this.tier = tier;
    return this;
  }

   /**
   * Get tier
   * @return tier
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
  }

  public Risk tierDescription(String tierDescription) {
    this.tierDescription = tierDescription;
    return this;
  }

   /**
   * Get tierDescription
   * @return tierDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTierDescription() {
    return tierDescription;
  }

  public void setTierDescription(String tierDescription) {
    this.tierDescription = tierDescription;
  }

  public Risk distanceToFireStation(Integer distanceToFireStation) {
    this.distanceToFireStation = distanceToFireStation;
    return this;
  }

   /**
   * Get distanceToFireStation
   * @return distanceToFireStation
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDistanceToFireStation() {
    return distanceToFireStation;
  }

  public void setDistanceToFireStation(Integer distanceToFireStation) {
    this.distanceToFireStation = distanceToFireStation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Risk risk = (Risk) o;
    return Objects.equals(this.type, risk.type) &&
        Objects.equals(this.description, risk.description) &&
        Objects.equals(this.risk50Rating, risk.risk50Rating) &&
        Objects.equals(this.frequency, risk.frequency) &&
        Objects.equals(this.nonburn, risk.nonburn) &&
        Objects.equals(this.pastFires, risk.pastFires) &&
        Objects.equals(this.severity, risk.severity) &&
        Objects.equals(this.continuity, risk.continuity) &&
        Objects.equals(this.adjustment, risk.adjustment) &&
        Objects.equals(this.aspect, risk.aspect) &&
        Objects.equals(this.crownFire, risk.crownFire) &&
        Objects.equals(this.vegetation, risk.vegetation) &&
        Objects.equals(this.foehn, risk.foehn) &&
        Objects.equals(this.golfCourse, risk.golfCourse) &&
        Objects.equals(this.roadDist, risk.roadDist) &&
        Objects.equals(this.slope, risk.slope) &&
        Objects.equals(this.waterDist, risk.waterDist) &&
        Objects.equals(this.tier, risk.tier) &&
        Objects.equals(this.tierDescription, risk.tierDescription) &&
        Objects.equals(this.distanceToFireStation, risk.distanceToFireStation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, risk50Rating, frequency, nonburn, pastFires, severity, continuity, adjustment, aspect, crownFire, vegetation, foehn, golfCourse, roadDist, slope, waterDist, tier, tierDescription, distanceToFireStation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Risk {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    risk50Rating: ").append(toIndentedString(risk50Rating)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    nonburn: ").append(toIndentedString(nonburn)).append("\n");
    sb.append("    pastFires: ").append(toIndentedString(pastFires)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    continuity: ").append(toIndentedString(continuity)).append("\n");
    sb.append("    adjustment: ").append(toIndentedString(adjustment)).append("\n");
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    crownFire: ").append(toIndentedString(crownFire)).append("\n");
    sb.append("    vegetation: ").append(toIndentedString(vegetation)).append("\n");
    sb.append("    foehn: ").append(toIndentedString(foehn)).append("\n");
    sb.append("    golfCourse: ").append(toIndentedString(golfCourse)).append("\n");
    sb.append("    roadDist: ").append(toIndentedString(roadDist)).append("\n");
    sb.append("    slope: ").append(toIndentedString(slope)).append("\n");
    sb.append("    waterDist: ").append(toIndentedString(waterDist)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    tierDescription: ").append(toIndentedString(tierDescription)).append("\n");
    sb.append("    distanceToFireStation: ").append(toIndentedString(distanceToFireStation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

