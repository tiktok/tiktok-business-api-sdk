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
 * FilteringCampaignGet
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class FilteringCampaignGet {
  @JsonProperty("campaign_ids")
  private List<String> campaignIds = null;

  @JsonProperty("creation_filter_end_time")
  private String creationFilterEndTime = null;

  @JsonProperty("creation_filter_start_time")
  private String creationFilterStartTime = null;

  @JsonProperty("objective_type")
  private String objectiveType = null;

  @JsonProperty("primary_status")
  private String primaryStatus = null;

  @JsonProperty("secondary_status")
  private String secondaryStatus = null;

  @JsonProperty("targeting_broaden_required")
  private Boolean targetingBroadenRequired = null;

  public FilteringCampaignGet campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilteringCampaignGet addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<String>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Filter by campaign IDs. Allowable quantity- &#x60;1-100&#x60;.
   * @return campaignIds
  **/
  @Schema(description = "Filter by campaign IDs. Allowable quantity- `1-100`.")
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public FilteringCampaignGet creationFilterEndTime(String creationFilterEndTime) {
    this.creationFilterEndTime = creationFilterEndTime;
    return this;
  }

   /**
   * Filter by higher range of campaign creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Campaigns created later than this time will be returned.Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won&#x27;t be affected.
   * @return creationFilterEndTime
  **/
  @Schema(description = "Filter by higher range of campaign creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Campaigns created later than this time will be returned.Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected.")
  public String getCreationFilterEndTime() {
    return creationFilterEndTime;
  }

  public void setCreationFilterEndTime(String creationFilterEndTime) {
    this.creationFilterEndTime = creationFilterEndTime;
  }

  public FilteringCampaignGet creationFilterStartTime(String creationFilterStartTime) {
    this.creationFilterStartTime = creationFilterStartTime;
    return this;
  }

   /**
   * Filter by lower range of campaign creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Campaigns created later than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won&#x27;t be affected
   * @return creationFilterStartTime
  **/
  @Schema(description = "Filter by lower range of campaign creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Campaigns created later than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected")
  public String getCreationFilterStartTime() {
    return creationFilterStartTime;
  }

  public void setCreationFilterStartTime(String creationFilterStartTime) {
    this.creationFilterStartTime = creationFilterStartTime;
  }

  public FilteringCampaignGet objectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Filter by  advertising objectives, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).
   * @return objectiveType
  **/
  @Schema(description = "Filter by  advertising objectives, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).")
  public String getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
  }

  public FilteringCampaignGet primaryStatus(String primaryStatus) {
    this.primaryStatus = primaryStatus;
    return this;
  }

   /**
   * Primary status. For enum values, see [Enumeration-Primary Status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).
   * @return primaryStatus
  **/
  @Schema(description = "Primary status. For enum values, see [Enumeration-Primary Status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).")
  public String getPrimaryStatus() {
    return primaryStatus;
  }

  public void setPrimaryStatus(String primaryStatus) {
    this.primaryStatus = primaryStatus;
  }

  public FilteringCampaignGet secondaryStatus(String secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
    return this;
  }

   /**
   * Filter by campaign status（Secondary status).  For enum values, see [Enumeration- Campaign Status - Secondary Status]
   * @return secondaryStatus
  **/
  @Schema(description = "Filter by campaign status（Secondary status).  For enum values, see [Enumeration- Campaign Status - Secondary Status]")
  public String getSecondaryStatus() {
    return secondaryStatus;
  }

  public void setSecondaryStatus(String secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
  }

  public FilteringCampaignGet targetingBroadenRequired(Boolean targetingBroadenRequired) {
    this.targetingBroadenRequired = targetingBroadenRequired;
    return this;
  }

   /**
   * Get targetingBroadenRequired
   * @return targetingBroadenRequired
  **/
  @Schema(description = "")
  public Boolean isTargetingBroadenRequired() {
    return targetingBroadenRequired;
  }

  public void setTargetingBroadenRequired(Boolean targetingBroadenRequired) {
    this.targetingBroadenRequired = targetingBroadenRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringCampaignGet filteringCampaignGet = (FilteringCampaignGet) o;
    return Objects.equals(this.campaignIds, filteringCampaignGet.campaignIds) &&
        Objects.equals(this.creationFilterEndTime, filteringCampaignGet.creationFilterEndTime) &&
        Objects.equals(this.creationFilterStartTime, filteringCampaignGet.creationFilterStartTime) &&
        Objects.equals(this.objectiveType, filteringCampaignGet.objectiveType) &&
        Objects.equals(this.primaryStatus, filteringCampaignGet.primaryStatus) &&
        Objects.equals(this.secondaryStatus, filteringCampaignGet.secondaryStatus) &&
        Objects.equals(this.targetingBroadenRequired, filteringCampaignGet.targetingBroadenRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignIds, creationFilterEndTime, creationFilterStartTime, objectiveType, primaryStatus, secondaryStatus, targetingBroadenRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringCampaignGet {\n");
    
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    creationFilterEndTime: ").append(toIndentedString(creationFilterEndTime)).append("\n");
    sb.append("    creationFilterStartTime: ").append(toIndentedString(creationFilterStartTime)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    primaryStatus: ").append(toIndentedString(primaryStatus)).append("\n");
    sb.append("    secondaryStatus: ").append(toIndentedString(secondaryStatus)).append("\n");
    sb.append("    targetingBroadenRequired: ").append(toIndentedString(targetingBroadenRequired)).append("\n");
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
