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
 * FilteringAdGet
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-05-20T12:00:30.004772-07:00[America/Los_Angeles]")
public class FilteringAdGet {
  @JsonProperty("ad_ids")
  private List<String> adIds = null;

  @JsonProperty("adgroup_ids")
  private List<String> adgroupIds = null;

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

  public FilteringAdGet adIds(List<String> adIds) {
    this.adIds = adIds;
    return this;
  }

  public FilteringAdGet addAdIdsItem(String adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<String>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * A list of Ad ID，quantity- &#x60;1-100&#x60;
   * @return adIds
  **/
  @Schema(description = "A list of Ad ID，quantity- `1-100`")
  public List<String> getAdIds() {
    return adIds;
  }

  public void setAdIds(List<String> adIds) {
    this.adIds = adIds;
  }

  public FilteringAdGet adgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
    return this;
  }

  public FilteringAdGet addAdgroupIdsItem(String adgroupIdsItem) {
    if (this.adgroupIds == null) {
      this.adgroupIds = new ArrayList<String>();
    }
    this.adgroupIds.add(adgroupIdsItem);
    return this;
  }

   /**
   * A list of Ad group ID, quantity- &#x60;1-100&#x60;
   * @return adgroupIds
  **/
  @Schema(description = "A list of Ad group ID, quantity- `1-100`")
  public List<String> getAdgroupIds() {
    return adgroupIds;
  }

  public void setAdgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
  }

  public FilteringAdGet billingEvents(List<String> billingEvents) {
    this.billingEvents = billingEvents;
    return this;
  }

  public FilteringAdGet addBillingEventsItem(String billingEventsItem) {
    if (this.billingEvents == null) {
      this.billingEvents = new ArrayList<String>();
    }
    this.billingEvents.add(billingEventsItem);
    return this;
  }

   /**
   * Billing events. For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).
   * @return billingEvents
  **/
  @Schema(description = "Billing events. For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).")
  public List<String> getBillingEvents() {
    return billingEvents;
  }

  public void setBillingEvents(List<String> billingEvents) {
    this.billingEvents = billingEvents;
  }

  public FilteringAdGet campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilteringAdGet addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<String>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * A list of Campaign IDs, quantity- &#x60;1-100&#x60;
   * @return campaignIds
  **/
  @Schema(description = "A list of Campaign IDs, quantity- `1-100`")
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public FilteringAdGet creationFilterEndTime(String creationFilterEndTime) {
    this.creationFilterEndTime = creationFilterEndTime;
    return this;
  }

   /**
   * Filter by higher range of ad creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Ads created earlier than this time will be returned.
   * @return creationFilterEndTime
  **/
  @Schema(description = "Filter by higher range of ad creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ads created earlier than this time will be returned.")
  public String getCreationFilterEndTime() {
    return creationFilterEndTime;
  }

  public void setCreationFilterEndTime(String creationFilterEndTime) {
    this.creationFilterEndTime = creationFilterEndTime;
  }

  public FilteringAdGet creationFilterStartTime(String creationFilterStartTime) {
    this.creationFilterStartTime = creationFilterStartTime;
    return this;
  }

   /**
   * Filter by lower range of ad creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Ads created later than this time will be returned. Suggestion A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won&#x27;t be affected.
   * @return creationFilterStartTime
  **/
  @Schema(description = "Filter by lower range of ad creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ads created later than this time will be returned. Suggestion A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected.")
  public String getCreationFilterStartTime() {
    return creationFilterStartTime;
  }

  public void setCreationFilterStartTime(String creationFilterStartTime) {
    this.creationFilterStartTime = creationFilterStartTime;
  }

  public FilteringAdGet objectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Advertising Objective. For enum values, see [Enumeration - Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). Note- Whether you choose &#x60;WEB_CONVERSIONS&#x60; or  &#x60;CONVERSIONS&#x60; as the objective filter, we will return data of both &#x60;WEB_CONVERSIONS&#x60; and  &#x60;CONVERSIONS&#x60;.
   * @return objectiveType
  **/
  @Schema(description = "Advertising Objective. For enum values, see [Enumeration - Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). Note- Whether you choose `WEB_CONVERSIONS` or  `CONVERSIONS` as the objective filter, we will return data of both `WEB_CONVERSIONS` and  `CONVERSIONS`.")
  public String getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
  }

  public FilteringAdGet primaryStatus(String primaryStatus) {
    this.primaryStatus = primaryStatus;
    return this;
  }

   /**
   * Primary status. For enum values, see [Enumeration -Primary status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).
   * @return primaryStatus
  **/
  @Schema(description = "Primary status. For enum values, see [Enumeration -Primary status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).")
  public String getPrimaryStatus() {
    return primaryStatus;
  }

  public void setPrimaryStatus(String primaryStatus) {
    this.primaryStatus = primaryStatus;
  }

  public FilteringAdGet secondaryStatus(String secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
    return this;
  }

   /**
   * Ad status（secondary status). For enum values, see [Enumeration - Ad Status - Secondary Status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). his field is not returned in the sandbox environment because the ad is not actually delivered. [Supported secondary statuses for a primary status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1757239620352002) to learn about the valid values you can pass in via &#x60;secondary_status&#x60; for the primary status you specify.
   * @return secondaryStatus
  **/
  @Schema(description = "Ad status（secondary status). For enum values, see [Enumeration - Ad Status - Secondary Status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). his field is not returned in the sandbox environment because the ad is not actually delivered. [Supported secondary statuses for a primary status](https://ads.tiktok.com/marketing_api/docs?id=1757239620352002) to learn about the valid values you can pass in via `secondary_status` for the primary status you specify.")
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
    FilteringAdGet filteringAdGet = (FilteringAdGet) o;
    return Objects.equals(this.adIds, filteringAdGet.adIds) &&
        Objects.equals(this.adgroupIds, filteringAdGet.adgroupIds) &&
        Objects.equals(this.billingEvents, filteringAdGet.billingEvents) &&
        Objects.equals(this.campaignIds, filteringAdGet.campaignIds) &&
        Objects.equals(this.creationFilterEndTime, filteringAdGet.creationFilterEndTime) &&
        Objects.equals(this.creationFilterStartTime, filteringAdGet.creationFilterStartTime) &&
        Objects.equals(this.objectiveType, filteringAdGet.objectiveType) &&
        Objects.equals(this.primaryStatus, filteringAdGet.primaryStatus) &&
        Objects.equals(this.secondaryStatus, filteringAdGet.secondaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, adgroupIds, billingEvents, campaignIds, creationFilterEndTime, creationFilterStartTime, objectiveType, primaryStatus, secondaryStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringAdGet {\n");
    
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
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
