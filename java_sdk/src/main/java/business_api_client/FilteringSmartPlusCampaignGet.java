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
 * FilteringSmartPlusCampaignGet
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class FilteringSmartPlusCampaignGet {
  @JsonProperty("campaign_ids")
  private List<String> campaignIds = null;

  @JsonProperty("campaign_name")
  private String campaignName = null;

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

  public FilteringSmartPlusCampaignGet campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilteringSmartPlusCampaignGet addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<String>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Get campaignIds
   * @return campaignIds
  **/
  @Schema(description = "")
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public FilteringSmartPlusCampaignGet campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @Schema(description = "")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public FilteringSmartPlusCampaignGet creationFilterEndTime(String creationFilterEndTime) {
    this.creationFilterEndTime = creationFilterEndTime;
    return this;
  }

   /**
   * Get creationFilterEndTime
   * @return creationFilterEndTime
  **/
  @Schema(description = "")
  public String getCreationFilterEndTime() {
    return creationFilterEndTime;
  }

  public void setCreationFilterEndTime(String creationFilterEndTime) {
    this.creationFilterEndTime = creationFilterEndTime;
  }

  public FilteringSmartPlusCampaignGet creationFilterStartTime(String creationFilterStartTime) {
    this.creationFilterStartTime = creationFilterStartTime;
    return this;
  }

   /**
   * Get creationFilterStartTime
   * @return creationFilterStartTime
  **/
  @Schema(description = "")
  public String getCreationFilterStartTime() {
    return creationFilterStartTime;
  }

  public void setCreationFilterStartTime(String creationFilterStartTime) {
    this.creationFilterStartTime = creationFilterStartTime;
  }

  public FilteringSmartPlusCampaignGet objectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Get objectiveType
   * @return objectiveType
  **/
  @Schema(description = "")
  public String getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
  }

  public FilteringSmartPlusCampaignGet primaryStatus(String primaryStatus) {
    this.primaryStatus = primaryStatus;
    return this;
  }

   /**
   * Get primaryStatus
   * @return primaryStatus
  **/
  @Schema(description = "")
  public String getPrimaryStatus() {
    return primaryStatus;
  }

  public void setPrimaryStatus(String primaryStatus) {
    this.primaryStatus = primaryStatus;
  }

  public FilteringSmartPlusCampaignGet secondaryStatus(String secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
    return this;
  }

   /**
   * Get secondaryStatus
   * @return secondaryStatus
  **/
  @Schema(description = "")
  public String getSecondaryStatus() {
    return secondaryStatus;
  }

  public void setSecondaryStatus(String secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringSmartPlusCampaignGet filteringSmartPlusCampaignGet = (FilteringSmartPlusCampaignGet) o;
    return Objects.equals(this.campaignIds, filteringSmartPlusCampaignGet.campaignIds) &&
        Objects.equals(this.campaignName, filteringSmartPlusCampaignGet.campaignName) &&
        Objects.equals(this.creationFilterEndTime, filteringSmartPlusCampaignGet.creationFilterEndTime) &&
        Objects.equals(this.creationFilterStartTime, filteringSmartPlusCampaignGet.creationFilterStartTime) &&
        Objects.equals(this.objectiveType, filteringSmartPlusCampaignGet.objectiveType) &&
        Objects.equals(this.primaryStatus, filteringSmartPlusCampaignGet.primaryStatus) &&
        Objects.equals(this.secondaryStatus, filteringSmartPlusCampaignGet.secondaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignIds, campaignName, creationFilterEndTime, creationFilterStartTime, objectiveType, primaryStatus, secondaryStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringSmartPlusCampaignGet {\n");
    
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    creationFilterEndTime: ").append(toIndentedString(creationFilterEndTime)).append("\n");
    sb.append("    creationFilterStartTime: ").append(toIndentedString(creationFilterStartTime)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    primaryStatus: ").append(toIndentedString(primaryStatus)).append("\n");
    sb.append("    secondaryStatus: ").append(toIndentedString(secondaryStatus)).append("\n");
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
