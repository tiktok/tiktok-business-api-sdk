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
 * FilteringAdgroupGet
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-05-20T12:00:30.004772-07:00[America/Los_Angeles]")
public class FilteringAdgroupGet {
  @JsonProperty("adgroup_ids")
  private List<String> adgroupIds = null;

  @JsonProperty("adgroup_name")
  private String adgroupName = null;

  @JsonProperty("billing_events")
  private List<String> billingEvents = null;

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

  public FilteringAdgroupGet adgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
    return this;
  }

  public FilteringAdgroupGet addAdgroupIdsItem(String adgroupIdsItem) {
    if (this.adgroupIds == null) {
      this.adgroupIds = new ArrayList<String>();
    }
    this.adgroupIds.add(adgroupIdsItem);
    return this;
  }

   /**
   * List of Ad group ID. Allowed number of IDs- &#x60;1-100&#x60;
   * @return adgroupIds
  **/
  @Schema(description = "List of Ad group ID. Allowed number of IDs- `1-100`")
  public List<String> getAdgroupIds() {
    return adgroupIds;
  }

  public void setAdgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
  }

  public FilteringAdgroupGet adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

   /**
   * Ad group name.
   * @return adgroupName
  **/
  @Schema(description = "Ad group name.")
  public String getAdgroupName() {
    return adgroupName;
  }

  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }

  public FilteringAdgroupGet billingEvents(List<String> billingEvents) {
    this.billingEvents = billingEvents;
    return this;
  }

  public FilteringAdgroupGet addBillingEventsItem(String billingEventsItem) {
    if (this.billingEvents == null) {
      this.billingEvents = new ArrayList<String>();
    }
    this.billingEvents.add(billingEventsItem);
    return this;
  }

   /**
   * Events that you want to pay for.  For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).
   * @return billingEvents
  **/
  @Schema(description = "Events that you want to pay for.  For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).")
  public List<String> getBillingEvents() {
    return billingEvents;
  }

  public void setBillingEvents(List<String> billingEvents) {
    this.billingEvents = billingEvents;
  }

  public FilteringAdgroupGet campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilteringAdgroupGet addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<String>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * List of campaign IDs. Allowed number of IDs- &#x60;1-100&#x60;
   * @return campaignIds
  **/
  @Schema(description = "List of campaign IDs. Allowed number of IDs- `1-100`")
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public FilteringAdgroupGet creationFilterEndTime(String creationFilterEndTime) {
    this.creationFilterEndTime = creationFilterEndTime;
    return this;
  }

   /**
   * Filter by higher range of ad group creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Ad groups created earlier than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won&#x27;t be affected.
   * @return creationFilterEndTime
  **/
  @Schema(description = "Filter by higher range of ad group creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ad groups created earlier than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected.")
  public String getCreationFilterEndTime() {
    return creationFilterEndTime;
  }

  public void setCreationFilterEndTime(String creationFilterEndTime) {
    this.creationFilterEndTime = creationFilterEndTime;
  }

  public FilteringAdgroupGet creationFilterStartTime(String creationFilterStartTime) {
    this.creationFilterStartTime = creationFilterStartTime;
    return this;
  }

   /**
   * Filter by lower range of ad group creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Ad groups created later than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won&#x27;t be affected.
   * @return creationFilterStartTime
  **/
  @Schema(description = "Filter by lower range of ad group creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ad groups created later than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected.")
  public String getCreationFilterStartTime() {
    return creationFilterStartTime;
  }

  public void setCreationFilterStartTime(String creationFilterStartTime) {
    this.creationFilterStartTime = creationFilterStartTime;
  }

  public FilteringAdgroupGet objectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Advertising objective. For details, see [Enumeration - Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). Whether you choose &#x60;WEB_CONVERSIONS&#x60; or  &#x60;CONVERSIONS&#x60; as the objective filter, we will return data of both &#x60;WEB_CONVERSIONS&#x60; and  &#x60;CONVERSIONS&#x60;.
   * @return objectiveType
  **/
  @Schema(description = "Advertising objective. For details, see [Enumeration - Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). Whether you choose `WEB_CONVERSIONS` or  `CONVERSIONS` as the objective filter, we will return data of both `WEB_CONVERSIONS` and  `CONVERSIONS`.")
  public String getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
  }

  public FilteringAdgroupGet primaryStatus(String primaryStatus) {
    this.primaryStatus = primaryStatus;
    return this;
  }

   /**
   * Primary status. For enum values, see [Enumeration - Primary Status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). The default value is &#x60;STATUS_NOT_DELETE&#x60;, which returns ad groups in all status excluding &#x60;STATUS_DELETE&#x60;. If you want to get ad groups in all status including &#x60;STATUS_DELETE&#x60;, use &#x60;STATUS_ALL&#x60; instead.
   * @return primaryStatus
  **/
  @Schema(description = "Primary status. For enum values, see [Enumeration - Primary Status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). The default value is `STATUS_NOT_DELETE`, which returns ad groups in all status excluding `STATUS_DELETE`. If you want to get ad groups in all status including `STATUS_DELETE`, use `STATUS_ALL` instead.")
  public String getPrimaryStatus() {
    return primaryStatus;
  }

  public void setPrimaryStatus(String primaryStatus) {
    this.primaryStatus = primaryStatus;
  }

  public FilteringAdgroupGet secondaryStatus(String secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
    return this;
  }

   /**
   * Ad group status（secondary status). For enum values, see [Enumeration - Ad Group Status - Secondary Status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). his field is not returned in the sandbox environment because the ad group is not actually delivered. See [Supported secondary statuses for a primary status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1757239620352002) to learn about the valid values you can pass in via &#x60;secondary_status&#x60; for the primary status you specify.
   * @return secondaryStatus
  **/
  @Schema(description = "Ad group status（secondary status). For enum values, see [Enumeration - Ad Group Status - Secondary Status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). his field is not returned in the sandbox environment because the ad group is not actually delivered. See [Supported secondary statuses for a primary status](https://ads.tiktok.com/marketing_api/docs?id=1757239620352002) to learn about the valid values you can pass in via `secondary_status` for the primary status you specify.")
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
    FilteringAdgroupGet filteringAdgroupGet = (FilteringAdgroupGet) o;
    return Objects.equals(this.adgroupIds, filteringAdgroupGet.adgroupIds) &&
        Objects.equals(this.adgroupName, filteringAdgroupGet.adgroupName) &&
        Objects.equals(this.billingEvents, filteringAdgroupGet.billingEvents) &&
        Objects.equals(this.campaignIds, filteringAdgroupGet.campaignIds) &&
        Objects.equals(this.creationFilterEndTime, filteringAdgroupGet.creationFilterEndTime) &&
        Objects.equals(this.creationFilterStartTime, filteringAdgroupGet.creationFilterStartTime) &&
        Objects.equals(this.objectiveType, filteringAdgroupGet.objectiveType) &&
        Objects.equals(this.primaryStatus, filteringAdgroupGet.primaryStatus) &&
        Objects.equals(this.secondaryStatus, filteringAdgroupGet.secondaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupIds, adgroupName, billingEvents, campaignIds, creationFilterEndTime, creationFilterStartTime, objectiveType, primaryStatus, secondaryStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringAdgroupGet {\n");
    
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    billingEvents: ").append(toIndentedString(billingEvents)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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
