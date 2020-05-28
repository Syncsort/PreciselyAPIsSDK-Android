/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 9.0.0
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
import com.precisely.apis.model.Age;
import com.precisely.apis.model.Education;
import com.precisely.apis.model.Email;
import com.precisely.apis.model.Employment;
import com.precisely.apis.model.GeoIdentityName;
import com.precisely.apis.model.Interest;
import com.precisely.apis.model.Location;
import com.precisely.apis.model.Photo;
import com.precisely.apis.model.Profile;
import com.precisely.apis.model.Topic;
import com.precisely.apis.model.Url;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * IdentityDetail
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-27T18:29:18.933+05:30")
public class IdentityDetail   {
  @SerializedName("interests")
  private List<Interest> interests = new ArrayList<Interest>();

  @SerializedName("profiles")
  private Map<String, Profile> profiles = new HashMap<String, Profile>();

  @SerializedName("photos")
  private List<Photo> photos = new ArrayList<Photo>();

  @SerializedName("urls")
  private List<Url> urls = new ArrayList<Url>();

  @SerializedName("name")
  private GeoIdentityName name = null;

  @SerializedName("age")
  private Age age = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("locations")
  private List<Location> locations = new ArrayList<Location>();

  @SerializedName("education")
  private List<Education> education = new ArrayList<Education>();

  @SerializedName("emails")
  private List<Email> emails = new ArrayList<Email>();

  @SerializedName("employment")
  private List<Employment> employment = new ArrayList<Employment>();

  @SerializedName("topics")
  private List<Topic> topics = new ArrayList<Topic>();

  public IdentityDetail interests(List<Interest> interests) {
    this.interests = interests;
    return this;
  }

   /**
   * Get interests
   * @return interests
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Interest> getInterests() {
    return interests;
  }

  public void setInterests(List<Interest> interests) {
    this.interests = interests;
  }

  public IdentityDetail profiles(Map<String, Profile> profiles) {
    this.profiles = profiles;
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Profile> getProfiles() {
    return profiles;
  }

  public void setProfiles(Map<String, Profile> profiles) {
    this.profiles = profiles;
  }

  public IdentityDetail photos(List<Photo> photos) {
    this.photos = photos;
    return this;
  }

   /**
   * Get photos
   * @return photos
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Photo> getPhotos() {
    return photos;
  }

  public void setPhotos(List<Photo> photos) {
    this.photos = photos;
  }

  public IdentityDetail urls(List<Url> urls) {
    this.urls = urls;
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Url> getUrls() {
    return urls;
  }

  public void setUrls(List<Url> urls) {
    this.urls = urls;
  }

  public IdentityDetail name(GeoIdentityName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public GeoIdentityName getName() {
    return name;
  }

  public void setName(GeoIdentityName name) {
    this.name = name;
  }

  public IdentityDetail age(Age age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(example = "null", value = "")
  public Age getAge() {
    return age;
  }

  public void setAge(Age age) {
    this.age = age;
  }

  public IdentityDetail gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public IdentityDetail locations(List<Location> locations) {
    this.locations = locations;
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Location> getLocations() {
    return locations;
  }

  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }

  public IdentityDetail education(List<Education> education) {
    this.education = education;
    return this;
  }

   /**
   * Get education
   * @return education
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Education> getEducation() {
    return education;
  }

  public void setEducation(List<Education> education) {
    this.education = education;
  }

  public IdentityDetail emails(List<Email> emails) {
    this.emails = emails;
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Email> getEmails() {
    return emails;
  }

  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }

  public IdentityDetail employment(List<Employment> employment) {
    this.employment = employment;
    return this;
  }

   /**
   * Get employment
   * @return employment
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Employment> getEmployment() {
    return employment;
  }

  public void setEmployment(List<Employment> employment) {
    this.employment = employment;
  }

  public IdentityDetail topics(List<Topic> topics) {
    this.topics = topics;
    return this;
  }

   /**
   * Get topics
   * @return topics
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Topic> getTopics() {
    return topics;
  }

  public void setTopics(List<Topic> topics) {
    this.topics = topics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityDetail identityDetail = (IdentityDetail) o;
    return Objects.equals(this.interests, identityDetail.interests) &&
        Objects.equals(this.profiles, identityDetail.profiles) &&
        Objects.equals(this.photos, identityDetail.photos) &&
        Objects.equals(this.urls, identityDetail.urls) &&
        Objects.equals(this.name, identityDetail.name) &&
        Objects.equals(this.age, identityDetail.age) &&
        Objects.equals(this.gender, identityDetail.gender) &&
        Objects.equals(this.locations, identityDetail.locations) &&
        Objects.equals(this.education, identityDetail.education) &&
        Objects.equals(this.emails, identityDetail.emails) &&
        Objects.equals(this.employment, identityDetail.employment) &&
        Objects.equals(this.topics, identityDetail.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interests, profiles, photos, urls, name, age, gender, locations, education, emails, employment, topics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityDetail {\n");
    
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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

