/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SmartTextGenerateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class SmartTextGenerateBody {
  @JsonProperty("adgroup_id")
  private String adgroupId = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("industry_id")
  private String industryId = null;

  @JsonProperty("keywords")
  private List<String> keywords = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("limit")
  private Long limit = 10l;

  @JsonProperty("param_type")
  private String paramType = "CUSTOMIZED";

  public SmartTextGenerateBody adgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @Schema(required = true, description = "")
  public String getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
  }

  public SmartTextGenerateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @Schema(required = true, description = "")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public SmartTextGenerateBody industryId(String industryId) {
    this.industryId = industryId;
    return this;
  }

   /**
   * Get industryId
   * @return industryId
  **/
  @Schema(description = "")
  public String getIndustryId() {
    return industryId;
  }

  public void setIndustryId(String industryId) {
    this.industryId = industryId;
  }

  public SmartTextGenerateBody keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public SmartTextGenerateBody addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<String>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @Schema(description = "")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public SmartTextGenerateBody language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public SmartTextGenerateBody limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * minimum: 1
   * maximum: 20
   * @return limit
  **/
  @Schema(description = "")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public SmartTextGenerateBody paramType(String paramType) {
    this.paramType = paramType;
    return this;
  }

   /**
   * Get paramType
   * @return paramType
  **/
  @Schema(description = "")
  public String getParamType() {
    return paramType;
  }

  public void setParamType(String paramType) {
    this.paramType = paramType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTextGenerateBody smartTextGenerateBody = (SmartTextGenerateBody) o;
    return Objects.equals(this.adgroupId, smartTextGenerateBody.adgroupId) &&
        Objects.equals(this.advertiserId, smartTextGenerateBody.advertiserId) &&
        Objects.equals(this.industryId, smartTextGenerateBody.industryId) &&
        Objects.equals(this.keywords, smartTextGenerateBody.keywords) &&
        Objects.equals(this.language, smartTextGenerateBody.language) &&
        Objects.equals(this.limit, smartTextGenerateBody.limit) &&
        Objects.equals(this.paramType, smartTextGenerateBody.paramType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, advertiserId, industryId, keywords, language, limit, paramType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTextGenerateBody {\n");
    
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    industryId: ").append(toIndentedString(industryId)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    paramType: ").append(toIndentedString(paramType)).append("\n");
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
