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
 * FilteringBcAssetAdminGet
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")
public class FilteringBcAssetAdminGet {
  @JsonProperty("advertiser_show_status")
  private String advertiserShowStatus = null;

  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("relation_status")
  private String relationStatus = null;

  @JsonProperty("relation_type")
  private String relationType = null;

  public FilteringBcAssetAdminGet advertiserShowStatus(String advertiserShowStatus) {
    this.advertiserShowStatus = advertiserShowStatus;
    return this;
  }

   /**
   * Advertiser account show status.
   * @return advertiserShowStatus
  **/
  @Schema(description = "Advertiser account show status.")
  public String getAdvertiserShowStatus() {
    return advertiserShowStatus;
  }

  public void setAdvertiserShowStatus(String advertiserShowStatus) {
    this.advertiserShowStatus = advertiserShowStatus;
  }

  public FilteringBcAssetAdminGet keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Keyword filter for asset search.
   * @return keyword
  **/
  @Schema(description = "Keyword filter for asset search.")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public FilteringBcAssetAdminGet relationStatus(String relationStatus) {
    this.relationStatus = relationStatus;
    return this;
  }

   /**
   * Relation status of the asset.
   * @return relationStatus
  **/
  @Schema(description = "Relation status of the asset.")
  public String getRelationStatus() {
    return relationStatus;
  }

  public void setRelationStatus(String relationStatus) {
    this.relationStatus = relationStatus;
  }

  public FilteringBcAssetAdminGet relationType(String relationType) {
    this.relationType = relationType;
    return this;
  }

   /**
   * Relation type of the asset.
   * @return relationType
  **/
  @Schema(description = "Relation type of the asset.")
  public String getRelationType() {
    return relationType;
  }

  public void setRelationType(String relationType) {
    this.relationType = relationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringBcAssetAdminGet filteringBcAssetAdminGet = (FilteringBcAssetAdminGet) o;
    return Objects.equals(this.advertiserShowStatus, filteringBcAssetAdminGet.advertiserShowStatus) &&
        Objects.equals(this.keyword, filteringBcAssetAdminGet.keyword) &&
        Objects.equals(this.relationStatus, filteringBcAssetAdminGet.relationStatus) &&
        Objects.equals(this.relationType, filteringBcAssetAdminGet.relationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserShowStatus, keyword, relationStatus, relationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringBcAssetAdminGet {\n");
    
    sb.append("    advertiserShowStatus: ").append(toIndentedString(advertiserShowStatus)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    relationStatus: ").append(toIndentedString(relationStatus)).append("\n");
    sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
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
