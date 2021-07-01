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
import com.precisely.apis.model.CategoryMetadata;
import com.precisely.apis.model.SicMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * GeoEnrichMetadataResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-29T16:11:29.305+05:30")
public class GeoEnrichMetadataResponse   {
  @SerializedName("sic")
  private List<SicMetadata> sic = new ArrayList<SicMetadata>();

  @SerializedName("category")
  private List<CategoryMetadata> category = new ArrayList<CategoryMetadata>();

  public GeoEnrichMetadataResponse sic(List<SicMetadata> sic) {
    this.sic = sic;
    return this;
  }

   /**
   * Get sic
   * @return sic
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SicMetadata> getSic() {
    return sic;
  }

  public void setSic(List<SicMetadata> sic) {
    this.sic = sic;
  }

  public GeoEnrichMetadataResponse category(List<CategoryMetadata> category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CategoryMetadata> getCategory() {
    return category;
  }

  public void setCategory(List<CategoryMetadata> category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoEnrichMetadataResponse geoEnrichMetadataResponse = (GeoEnrichMetadataResponse) o;
    return Objects.equals(this.sic, geoEnrichMetadataResponse.sic) &&
        Objects.equals(this.category, geoEnrichMetadataResponse.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sic, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoEnrichMetadataResponse {\n");
    
    sb.append("    sic: ").append(toIndentedString(sic)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

