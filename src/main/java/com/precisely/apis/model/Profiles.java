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
import com.precisely.apis.model.Profile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Profiles
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-26T15:06:57.026+05:30")
public class Profiles   {
  @SerializedName("twitter")
  private Profile twitter = null;

  @SerializedName("linkedin")
  private Profile linkedin = null;

  public Profiles twitter(Profile twitter) {
    this.twitter = twitter;
    return this;
  }

   /**
   * Get twitter
   * @return twitter
  **/
  @ApiModelProperty(example = "null", value = "")
  public Profile getTwitter() {
    return twitter;
  }

  public void setTwitter(Profile twitter) {
    this.twitter = twitter;
  }

  public Profiles linkedin(Profile linkedin) {
    this.linkedin = linkedin;
    return this;
  }

   /**
   * Get linkedin
   * @return linkedin
  **/
  @ApiModelProperty(example = "null", value = "")
  public Profile getLinkedin() {
    return linkedin;
  }

  public void setLinkedin(Profile linkedin) {
    this.linkedin = linkedin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profiles profiles = (Profiles) o;
    return Objects.equals(this.twitter, profiles.twitter) &&
        Objects.equals(this.linkedin, profiles.linkedin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(twitter, linkedin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profiles {\n");
    
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    linkedin: ").append(toIndentedString(linkedin)).append("\n");
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

