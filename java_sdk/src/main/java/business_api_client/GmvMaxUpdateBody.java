/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CampaigngmvMaxupdateCustomAnchorVideoList;
import business_api_client.CampaigngmvMaxupdateItemList;
import business_api_client.CampaigngmvMaxupdatePromotionDays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * GmvMaxUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class GmvMaxUpdateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("affiliate_posts_enabled")
  private Boolean affiliatePostsEnabled = null;

  @JsonProperty("auto_budget_enabled")
  private Boolean autoBudgetEnabled = null;

  @JsonProperty("budget")
  private Double budget = null;

  @JsonProperty("campaign_id")
  private String campaignId = null;

  @JsonProperty("campaign_name")
  private String campaignName = null;

  @JsonProperty("custom_anchor_video_list")
  private List<CampaigngmvMaxupdateCustomAnchorVideoList> customAnchorVideoList = null;

  @JsonProperty("item_group_ids")
  private List<String> itemGroupIds = null;

  @JsonProperty("item_list")
  private List<CampaigngmvMaxupdateItemList> itemList = null;

  @JsonProperty("promotion_days")
  private CampaigngmvMaxupdatePromotionDays promotionDays = null;

  @JsonProperty("roas_bid")
  private Double roasBid = null;

  @JsonProperty("schedule_end_time")
  private String scheduleEndTime = null;

  @JsonProperty("schedule_type")
  private String scheduleType = null;

  public GmvMaxUpdateBody advertiserId(String advertiserId) {
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

  public GmvMaxUpdateBody affiliatePostsEnabled(Boolean affiliatePostsEnabled) {
    this.affiliatePostsEnabled = affiliatePostsEnabled;
    return this;
  }

   /**
   * Get affiliatePostsEnabled
   * @return affiliatePostsEnabled
  **/
  @Schema(description = "")
  public Boolean isAffiliatePostsEnabled() {
    return affiliatePostsEnabled;
  }

  public void setAffiliatePostsEnabled(Boolean affiliatePostsEnabled) {
    this.affiliatePostsEnabled = affiliatePostsEnabled;
  }

  public GmvMaxUpdateBody autoBudgetEnabled(Boolean autoBudgetEnabled) {
    this.autoBudgetEnabled = autoBudgetEnabled;
    return this;
  }

   /**
   * Get autoBudgetEnabled
   * @return autoBudgetEnabled
  **/
  @Schema(description = "")
  public Boolean isAutoBudgetEnabled() {
    return autoBudgetEnabled;
  }

  public void setAutoBudgetEnabled(Boolean autoBudgetEnabled) {
    this.autoBudgetEnabled = autoBudgetEnabled;
  }

  public GmvMaxUpdateBody budget(Double budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @Schema(description = "")
  public Double getBudget() {
    return budget;
  }

  public void setBudget(Double budget) {
    this.budget = budget;
  }

  public GmvMaxUpdateBody campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @Schema(required = true, description = "")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public GmvMaxUpdateBody campaignName(String campaignName) {
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

  public GmvMaxUpdateBody customAnchorVideoList(List<CampaigngmvMaxupdateCustomAnchorVideoList> customAnchorVideoList) {
    this.customAnchorVideoList = customAnchorVideoList;
    return this;
  }

  public GmvMaxUpdateBody addCustomAnchorVideoListItem(CampaigngmvMaxupdateCustomAnchorVideoList customAnchorVideoListItem) {
    if (this.customAnchorVideoList == null) {
      this.customAnchorVideoList = new ArrayList<CampaigngmvMaxupdateCustomAnchorVideoList>();
    }
    this.customAnchorVideoList.add(customAnchorVideoListItem);
    return this;
  }

   /**
   * Get customAnchorVideoList
   * @return customAnchorVideoList
  **/
  @Schema(description = "")
  public List<CampaigngmvMaxupdateCustomAnchorVideoList> getCustomAnchorVideoList() {
    return customAnchorVideoList;
  }

  public void setCustomAnchorVideoList(List<CampaigngmvMaxupdateCustomAnchorVideoList> customAnchorVideoList) {
    this.customAnchorVideoList = customAnchorVideoList;
  }

  public GmvMaxUpdateBody itemGroupIds(List<String> itemGroupIds) {
    this.itemGroupIds = itemGroupIds;
    return this;
  }

  public GmvMaxUpdateBody addItemGroupIdsItem(String itemGroupIdsItem) {
    if (this.itemGroupIds == null) {
      this.itemGroupIds = new ArrayList<String>();
    }
    this.itemGroupIds.add(itemGroupIdsItem);
    return this;
  }

   /**
   * Get itemGroupIds
   * @return itemGroupIds
  **/
  @Schema(description = "")
  public List<String> getItemGroupIds() {
    return itemGroupIds;
  }

  public void setItemGroupIds(List<String> itemGroupIds) {
    this.itemGroupIds = itemGroupIds;
  }

  public GmvMaxUpdateBody itemList(List<CampaigngmvMaxupdateItemList> itemList) {
    this.itemList = itemList;
    return this;
  }

  public GmvMaxUpdateBody addItemListItem(CampaigngmvMaxupdateItemList itemListItem) {
    if (this.itemList == null) {
      this.itemList = new ArrayList<CampaigngmvMaxupdateItemList>();
    }
    this.itemList.add(itemListItem);
    return this;
  }

   /**
   * Get itemList
   * @return itemList
  **/
  @Schema(description = "")
  public List<CampaigngmvMaxupdateItemList> getItemList() {
    return itemList;
  }

  public void setItemList(List<CampaigngmvMaxupdateItemList> itemList) {
    this.itemList = itemList;
  }

  public GmvMaxUpdateBody promotionDays(CampaigngmvMaxupdatePromotionDays promotionDays) {
    this.promotionDays = promotionDays;
    return this;
  }

   /**
   * Get promotionDays
   * @return promotionDays
  **/
  @Schema(description = "")
  public CampaigngmvMaxupdatePromotionDays getPromotionDays() {
    return promotionDays;
  }

  public void setPromotionDays(CampaigngmvMaxupdatePromotionDays promotionDays) {
    this.promotionDays = promotionDays;
  }

  public GmvMaxUpdateBody roasBid(Double roasBid) {
    this.roasBid = roasBid;
    return this;
  }

   /**
   * Get roasBid
   * @return roasBid
  **/
  @Schema(description = "")
  public Double getRoasBid() {
    return roasBid;
  }

  public void setRoasBid(Double roasBid) {
    this.roasBid = roasBid;
  }

  public GmvMaxUpdateBody scheduleEndTime(String scheduleEndTime) {
    this.scheduleEndTime = scheduleEndTime;
    return this;
  }

   /**
   * Get scheduleEndTime
   * @return scheduleEndTime
  **/
  @Schema(description = "")
  public String getScheduleEndTime() {
    return scheduleEndTime;
  }

  public void setScheduleEndTime(String scheduleEndTime) {
    this.scheduleEndTime = scheduleEndTime;
  }

  public GmvMaxUpdateBody scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @Schema(description = "")
  public String getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GmvMaxUpdateBody gmvMaxUpdateBody = (GmvMaxUpdateBody) o;
    return Objects.equals(this.advertiserId, gmvMaxUpdateBody.advertiserId) &&
        Objects.equals(this.affiliatePostsEnabled, gmvMaxUpdateBody.affiliatePostsEnabled) &&
        Objects.equals(this.autoBudgetEnabled, gmvMaxUpdateBody.autoBudgetEnabled) &&
        Objects.equals(this.budget, gmvMaxUpdateBody.budget) &&
        Objects.equals(this.campaignId, gmvMaxUpdateBody.campaignId) &&
        Objects.equals(this.campaignName, gmvMaxUpdateBody.campaignName) &&
        Objects.equals(this.customAnchorVideoList, gmvMaxUpdateBody.customAnchorVideoList) &&
        Objects.equals(this.itemGroupIds, gmvMaxUpdateBody.itemGroupIds) &&
        Objects.equals(this.itemList, gmvMaxUpdateBody.itemList) &&
        Objects.equals(this.promotionDays, gmvMaxUpdateBody.promotionDays) &&
        Objects.equals(this.roasBid, gmvMaxUpdateBody.roasBid) &&
        Objects.equals(this.scheduleEndTime, gmvMaxUpdateBody.scheduleEndTime) &&
        Objects.equals(this.scheduleType, gmvMaxUpdateBody.scheduleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, affiliatePostsEnabled, autoBudgetEnabled, budget, campaignId, campaignName, customAnchorVideoList, itemGroupIds, itemList, promotionDays, roasBid, scheduleEndTime, scheduleType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GmvMaxUpdateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    affiliatePostsEnabled: ").append(toIndentedString(affiliatePostsEnabled)).append("\n");
    sb.append("    autoBudgetEnabled: ").append(toIndentedString(autoBudgetEnabled)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    customAnchorVideoList: ").append(toIndentedString(customAnchorVideoList)).append("\n");
    sb.append("    itemGroupIds: ").append(toIndentedString(itemGroupIds)).append("\n");
    sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
    sb.append("    promotionDays: ").append(toIndentedString(promotionDays)).append("\n");
    sb.append("    roasBid: ").append(toIndentedString(roasBid)).append("\n");
    sb.append("    scheduleEndTime: ").append(toIndentedString(scheduleEndTime)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
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
