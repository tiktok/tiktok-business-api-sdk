/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13dmpcustomAudienceapplyContextInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CustomAudienceApplyBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class CustomAudienceApplyBody {
  @JsonProperty("action_mode")
  private String actionMode = null;

  @JsonProperty("adgroup_ids")
  private List<String> adgroupIds = new ArrayList<String>();

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("context_info")
  private OpenApiv13dmpcustomAudienceapplyContextInfo contextInfo = null;

  @JsonProperty("custom_audience_id")
  private String customAudienceId = null;

  @JsonProperty("usage_mode")
  private String usageMode = null;

  public CustomAudienceApplyBody actionMode(String actionMode) {
    this.actionMode = actionMode;
    return this;
  }

   /**
   * Specific operation to be performed on the audience. Enum values: Apply, Disconnect.
   * @return actionMode
  **/
  @Schema(required = true, description = "Specific operation to be performed on the audience. Enum values: Apply, Disconnect.")
  public String getActionMode() {
    return actionMode;
  }

  public void setActionMode(String actionMode) {
    this.actionMode = actionMode;
  }

  public CustomAudienceApplyBody adgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
    return this;
  }

  public CustomAudienceApplyBody addAdgroupIdsItem(String adgroupIdsItem) {
    this.adgroupIds.add(adgroupIdsItem);
    return this;
  }

   /**
   * A list of ad group IDs. Note: adgroup_ids and custom_audience_id should be under the same advertiser account. Otherwise, an error will occur. Lookalike Audience cannot be used in Reach &amp; Frequency ads. Otherwise, an error will occur. See below for more details. 1. If the custom_audience_id is a Lookalike Audience and the adgroup_ids are Reach &amp; Frequency ad groups, an error will occur. 2. If the custom_audience_id is a Lookalike Audience with the REACH_FREQUENCY audience subtype, an error will occur.
   * @return adgroupIds
  **/
  @Schema(required = true, description = "A list of ad group IDs. Note: adgroup_ids and custom_audience_id should be under the same advertiser account. Otherwise, an error will occur. Lookalike Audience cannot be used in Reach & Frequency ads. Otherwise, an error will occur. See below for more details. 1. If the custom_audience_id is a Lookalike Audience and the adgroup_ids are Reach & Frequency ad groups, an error will occur. 2. If the custom_audience_id is a Lookalike Audience with the REACH_FREQUENCY audience subtype, an error will occur.")
  public List<String> getAdgroupIds() {
    return adgroupIds;
  }

  public void setAdgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
  }

  public CustomAudienceApplyBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID.
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public CustomAudienceApplyBody contextInfo(OpenApiv13dmpcustomAudienceapplyContextInfo contextInfo) {
    this.contextInfo = contextInfo;
    return this;
  }

   /**
   * Get contextInfo
   * @return contextInfo
  **/
  @Schema(description = "")
  public OpenApiv13dmpcustomAudienceapplyContextInfo getContextInfo() {
    return contextInfo;
  }

  public void setContextInfo(OpenApiv13dmpcustomAudienceapplyContextInfo contextInfo) {
    this.contextInfo = contextInfo;
  }

  public CustomAudienceApplyBody customAudienceId(String customAudienceId) {
    this.customAudienceId = customAudienceId;
    return this;
  }

   /**
   * Custom audience ID. You can only pass one custom audience ID.
   * @return customAudienceId
  **/
  @Schema(required = true, description = "Custom audience ID. You can only pass one custom audience ID.")
  public String getCustomAudienceId() {
    return customAudienceId;
  }

  public void setCustomAudienceId(String customAudienceId) {
    this.customAudienceId = customAudienceId;
  }

  public CustomAudienceApplyBody usageMode(String usageMode) {
    this.usageMode = usageMode;
    return this;
  }

   /**
   * Whether to include this audience in or exclude it from your ad groups. Required when action_mode is Apply. Enum values: Include, Exclude.
   * @return usageMode
  **/
  @Schema(description = "Whether to include this audience in or exclude it from your ad groups. Required when action_mode is Apply. Enum values: Include, Exclude.")
  public String getUsageMode() {
    return usageMode;
  }

  public void setUsageMode(String usageMode) {
    this.usageMode = usageMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAudienceApplyBody customAudienceApplyBody = (CustomAudienceApplyBody) o;
    return Objects.equals(this.actionMode, customAudienceApplyBody.actionMode) &&
        Objects.equals(this.adgroupIds, customAudienceApplyBody.adgroupIds) &&
        Objects.equals(this.advertiserId, customAudienceApplyBody.advertiserId) &&
        Objects.equals(this.contextInfo, customAudienceApplyBody.contextInfo) &&
        Objects.equals(this.customAudienceId, customAudienceApplyBody.customAudienceId) &&
        Objects.equals(this.usageMode, customAudienceApplyBody.usageMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionMode, adgroupIds, advertiserId, contextInfo, customAudienceId, usageMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAudienceApplyBody {\n");
    
    sb.append("    actionMode: ").append(toIndentedString(actionMode)).append("\n");
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    contextInfo: ").append(toIndentedString(contextInfo)).append("\n");
    sb.append("    customAudienceId: ").append(toIndentedString(customAudienceId)).append("\n");
    sb.append("    usageMode: ").append(toIndentedString(usageMode)).append("\n");
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
