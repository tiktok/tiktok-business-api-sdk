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
/**
 * AdgroupcreateSearchKeywords
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class AdgroupcreateSearchKeywords {
  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("keyword_bid")
  private Double keywordBid = null;

  @JsonProperty("keyword_bid_type")
  private String keywordBidType = "FOLLOW_ADGROUP";

  @JsonProperty("match_type")
  private String matchType = null;

  public AdgroupcreateSearchKeywords keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @Schema(description = "")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public AdgroupcreateSearchKeywords keywordBid(Double keywordBid) {
    this.keywordBid = keywordBid;
    return this;
  }

   /**
   * Get keywordBid
   * @return keywordBid
  **/
  @Schema(description = "")
  public Double getKeywordBid() {
    return keywordBid;
  }

  public void setKeywordBid(Double keywordBid) {
    this.keywordBid = keywordBid;
  }

  public AdgroupcreateSearchKeywords keywordBidType(String keywordBidType) {
    this.keywordBidType = keywordBidType;
    return this;
  }

   /**
   * Get keywordBidType
   * @return keywordBidType
  **/
  @Schema(description = "")
  public String getKeywordBidType() {
    return keywordBidType;
  }

  public void setKeywordBidType(String keywordBidType) {
    this.keywordBidType = keywordBidType;
  }

  public AdgroupcreateSearchKeywords matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @Schema(description = "")
  public String getMatchType() {
    return matchType;
  }

  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupcreateSearchKeywords adgroupcreateSearchKeywords = (AdgroupcreateSearchKeywords) o;
    return Objects.equals(this.keyword, adgroupcreateSearchKeywords.keyword) &&
        Objects.equals(this.keywordBid, adgroupcreateSearchKeywords.keywordBid) &&
        Objects.equals(this.keywordBidType, adgroupcreateSearchKeywords.keywordBidType) &&
        Objects.equals(this.matchType, adgroupcreateSearchKeywords.matchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, keywordBid, keywordBidType, matchType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupcreateSearchKeywords {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    keywordBid: ").append(toIndentedString(keywordBid)).append("\n");
    sb.append("    keywordBidType: ").append(toIndentedString(keywordBidType)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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
