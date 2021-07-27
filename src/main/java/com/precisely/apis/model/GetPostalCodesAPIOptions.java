/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.2
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
 * GetPostalCodesAPIOptions
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-26T15:06:57.026+05:30")
public class GetPostalCodesAPIOptions   {
  @SerializedName("OutputCityType")
  private String outputCityType = "N";

  @SerializedName("OutputVanityCity")
  private String outputVanityCity = "N";

  public GetPostalCodesAPIOptions outputCityType(String outputCityType) {
    this.outputCityType = outputCityType;
    return this;
  }

   /**
   * Output CityType.
   * @return outputCityType
  **/
  @ApiModelProperty(example = "null", value = "Output CityType.")
  public String getOutputCityType() {
    return outputCityType;
  }

  public void setOutputCityType(String outputCityType) {
    this.outputCityType = outputCityType;
  }

  public GetPostalCodesAPIOptions outputVanityCity(String outputVanityCity) {
    this.outputVanityCity = outputVanityCity;
    return this;
  }

   /**
   * Output VanityCity.
   * @return outputVanityCity
  **/
  @ApiModelProperty(example = "null", value = "Output VanityCity.")
  public String getOutputVanityCity() {
    return outputVanityCity;
  }

  public void setOutputVanityCity(String outputVanityCity) {
    this.outputVanityCity = outputVanityCity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPostalCodesAPIOptions getPostalCodesAPIOptions = (GetPostalCodesAPIOptions) o;
    return Objects.equals(this.outputCityType, getPostalCodesAPIOptions.outputCityType) &&
        Objects.equals(this.outputVanityCity, getPostalCodesAPIOptions.outputVanityCity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputCityType, outputVanityCity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPostalCodesAPIOptions {\n");
    
    sb.append("    outputCityType: ").append(toIndentedString(outputCityType)).append("\n");
    sb.append("    outputVanityCity: ").append(toIndentedString(outputVanityCity)).append("\n");
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

