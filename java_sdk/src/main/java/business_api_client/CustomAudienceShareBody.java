/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.DmpcustomAudiencefileuploadContextInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CustomAudienceShareBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class CustomAudienceShareBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("context_info")
  private DmpcustomAudiencefileuploadContextInfo contextInfo = null;

  @JsonProperty("custom_audience_ids")
  private List<String> customAudienceIds = new ArrayList<String>();

  @JsonProperty("shared_advertiser_ids")
  private List<String> sharedAdvertiserIds = new ArrayList<String>();

  public CustomAudienceShareBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Operator advertiser ID.
   * @return advertiserId
  **/
  @Schema(required = true, description = "Operator advertiser ID.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public CustomAudienceShareBody contextInfo(DmpcustomAudiencefileuploadContextInfo contextInfo) {
    this.contextInfo = contextInfo;
    return this;
  }

   /**
   * Get contextInfo
   * @return contextInfo
  **/
  @Schema(description = "")
  public DmpcustomAudiencefileuploadContextInfo getContextInfo() {
    return contextInfo;
  }

  public void setContextInfo(DmpcustomAudiencefileuploadContextInfo contextInfo) {
    this.contextInfo = contextInfo;
  }

  public CustomAudienceShareBody customAudienceIds(List<String> customAudienceIds) {
    this.customAudienceIds = customAudienceIds;
    return this;
  }

  public CustomAudienceShareBody addCustomAudienceIdsItem(String customAudienceIdsItem) {
    this.customAudienceIds.add(customAudienceIdsItem);
    return this;
  }

   /**
   * Custom audiences that you want to share. Size: 1-10.
   * @return customAudienceIds
  **/
  @Schema(required = true, description = "Custom audiences that you want to share. Size: 1-10.")
  public List<String> getCustomAudienceIds() {
    return customAudienceIds;
  }

  public void setCustomAudienceIds(List<String> customAudienceIds) {
    this.customAudienceIds = customAudienceIds;
  }

  public CustomAudienceShareBody sharedAdvertiserIds(List<String> sharedAdvertiserIds) {
    this.sharedAdvertiserIds = sharedAdvertiserIds;
    return this;
  }

  public CustomAudienceShareBody addSharedAdvertiserIdsItem(String sharedAdvertiserIdsItem) {
    this.sharedAdvertiserIds.add(sharedAdvertiserIdsItem);
    return this;
  }

   /**
   * Advertisers that you want to share audiences with. They must be in the same Business Center as you. Size: 1-10.
   * @return sharedAdvertiserIds
  **/
  @Schema(required = true, description = "Advertisers that you want to share audiences with. They must be in the same Business Center as you. Size: 1-10.")
  public List<String> getSharedAdvertiserIds() {
    return sharedAdvertiserIds;
  }

  public void setSharedAdvertiserIds(List<String> sharedAdvertiserIds) {
    this.sharedAdvertiserIds = sharedAdvertiserIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAudienceShareBody customAudienceShareBody = (CustomAudienceShareBody) o;
    return Objects.equals(this.advertiserId, customAudienceShareBody.advertiserId) &&
        Objects.equals(this.contextInfo, customAudienceShareBody.contextInfo) &&
        Objects.equals(this.customAudienceIds, customAudienceShareBody.customAudienceIds) &&
        Objects.equals(this.sharedAdvertiserIds, customAudienceShareBody.sharedAdvertiserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, contextInfo, customAudienceIds, sharedAdvertiserIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAudienceShareBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    contextInfo: ").append(toIndentedString(contextInfo)).append("\n");
    sb.append("    customAudienceIds: ").append(toIndentedString(customAudienceIds)).append("\n");
    sb.append("    sharedAdvertiserIds: ").append(toIndentedString(sharedAdvertiserIds)).append("\n");
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
