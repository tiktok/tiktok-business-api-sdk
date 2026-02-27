/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CampaigngmvMaxcreateCustomAnchorVideoList;
import business_api_client.CampaigngmvMaxcreateIdentityList;
import business_api_client.CampaigngmvMaxcreateItemList;
import business_api_client.CampaigngmvMaxcreatePromotionDays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * GmvMaxCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class GmvMaxCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("affiliate_posts_enabled")
  private Boolean affiliatePostsEnabled = null;

  @JsonProperty("auto_budget_enabled")
  private Boolean autoBudgetEnabled = null;

  @JsonProperty("budget")
  private Double budget = null;

  @JsonProperty("campaign_name")
  private String campaignName = null;

  @JsonProperty("custom_anchor_video_list")
  private List<CampaigngmvMaxcreateCustomAnchorVideoList> customAnchorVideoList = null;

  @JsonProperty("deep_bid_type")
  private String deepBidType = null;

  @JsonProperty("identity_list")
  private List<CampaigngmvMaxcreateIdentityList> identityList = null;

  @JsonProperty("item_group_ids")
  private List<String> itemGroupIds = null;

  @JsonProperty("item_list")
  private List<CampaigngmvMaxcreateItemList> itemList = null;

  @JsonProperty("optimization_goal")
  private String optimizationGoal = null;

  @JsonProperty("product_specific_type")
  private String productSpecificType = null;

  @JsonProperty("product_video_specific_type")
  private String productVideoSpecificType = null;

  @JsonProperty("promotion_days")
  private CampaigngmvMaxcreatePromotionDays promotionDays = null;

  @JsonProperty("request_id")
  private String requestId = null;

  @JsonProperty("roas_bid")
  private Double roasBid = null;

  @JsonProperty("schedule_end_time")
  private String scheduleEndTime = null;

  @JsonProperty("schedule_start_time")
  private String scheduleStartTime = null;

  @JsonProperty("schedule_type")
  private String scheduleType = null;

  @JsonProperty("shopping_ads_type")
  private String shoppingAdsType = null;

  @JsonProperty("store_authorized_bc_id")
  private String storeAuthorizedBcId = null;

  @JsonProperty("store_id")
  private String storeId = null;

  public GmvMaxCreateBody advertiserId(String advertiserId) {
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

  public GmvMaxCreateBody affiliatePostsEnabled(Boolean affiliatePostsEnabled) {
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

  public GmvMaxCreateBody autoBudgetEnabled(Boolean autoBudgetEnabled) {
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

  public GmvMaxCreateBody budget(Double budget) {
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

  public GmvMaxCreateBody campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @Schema(required = true, description = "")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public GmvMaxCreateBody customAnchorVideoList(List<CampaigngmvMaxcreateCustomAnchorVideoList> customAnchorVideoList) {
    this.customAnchorVideoList = customAnchorVideoList;
    return this;
  }

  public GmvMaxCreateBody addCustomAnchorVideoListItem(CampaigngmvMaxcreateCustomAnchorVideoList customAnchorVideoListItem) {
    if (this.customAnchorVideoList == null) {
      this.customAnchorVideoList = new ArrayList<CampaigngmvMaxcreateCustomAnchorVideoList>();
    }
    this.customAnchorVideoList.add(customAnchorVideoListItem);
    return this;
  }

   /**
   * Get customAnchorVideoList
   * @return customAnchorVideoList
  **/
  @Schema(description = "")
  public List<CampaigngmvMaxcreateCustomAnchorVideoList> getCustomAnchorVideoList() {
    return customAnchorVideoList;
  }

  public void setCustomAnchorVideoList(List<CampaigngmvMaxcreateCustomAnchorVideoList> customAnchorVideoList) {
    this.customAnchorVideoList = customAnchorVideoList;
  }

  public GmvMaxCreateBody deepBidType(String deepBidType) {
    this.deepBidType = deepBidType;
    return this;
  }

   /**
   * Get deepBidType
   * @return deepBidType
  **/
  @Schema(required = true, description = "")
  public String getDeepBidType() {
    return deepBidType;
  }

  public void setDeepBidType(String deepBidType) {
    this.deepBidType = deepBidType;
  }

  public GmvMaxCreateBody identityList(List<CampaigngmvMaxcreateIdentityList> identityList) {
    this.identityList = identityList;
    return this;
  }

  public GmvMaxCreateBody addIdentityListItem(CampaigngmvMaxcreateIdentityList identityListItem) {
    if (this.identityList == null) {
      this.identityList = new ArrayList<CampaigngmvMaxcreateIdentityList>();
    }
    this.identityList.add(identityListItem);
    return this;
  }

   /**
   * Get identityList
   * @return identityList
  **/
  @Schema(description = "")
  public List<CampaigngmvMaxcreateIdentityList> getIdentityList() {
    return identityList;
  }

  public void setIdentityList(List<CampaigngmvMaxcreateIdentityList> identityList) {
    this.identityList = identityList;
  }

  public GmvMaxCreateBody itemGroupIds(List<String> itemGroupIds) {
    this.itemGroupIds = itemGroupIds;
    return this;
  }

  public GmvMaxCreateBody addItemGroupIdsItem(String itemGroupIdsItem) {
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

  public GmvMaxCreateBody itemList(List<CampaigngmvMaxcreateItemList> itemList) {
    this.itemList = itemList;
    return this;
  }

  public GmvMaxCreateBody addItemListItem(CampaigngmvMaxcreateItemList itemListItem) {
    if (this.itemList == null) {
      this.itemList = new ArrayList<CampaigngmvMaxcreateItemList>();
    }
    this.itemList.add(itemListItem);
    return this;
  }

   /**
   * Get itemList
   * @return itemList
  **/
  @Schema(description = "")
  public List<CampaigngmvMaxcreateItemList> getItemList() {
    return itemList;
  }

  public void setItemList(List<CampaigngmvMaxcreateItemList> itemList) {
    this.itemList = itemList;
  }

  public GmvMaxCreateBody optimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

   /**
   * Get optimizationGoal
   * @return optimizationGoal
  **/
  @Schema(required = true, description = "")
  public String getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public GmvMaxCreateBody productSpecificType(String productSpecificType) {
    this.productSpecificType = productSpecificType;
    return this;
  }

   /**
   * Get productSpecificType
   * @return productSpecificType
  **/
  @Schema(description = "")
  public String getProductSpecificType() {
    return productSpecificType;
  }

  public void setProductSpecificType(String productSpecificType) {
    this.productSpecificType = productSpecificType;
  }

  public GmvMaxCreateBody productVideoSpecificType(String productVideoSpecificType) {
    this.productVideoSpecificType = productVideoSpecificType;
    return this;
  }

   /**
   * Get productVideoSpecificType
   * @return productVideoSpecificType
  **/
  @Schema(description = "")
  public String getProductVideoSpecificType() {
    return productVideoSpecificType;
  }

  public void setProductVideoSpecificType(String productVideoSpecificType) {
    this.productVideoSpecificType = productVideoSpecificType;
  }

  public GmvMaxCreateBody promotionDays(CampaigngmvMaxcreatePromotionDays promotionDays) {
    this.promotionDays = promotionDays;
    return this;
  }

   /**
   * Get promotionDays
   * @return promotionDays
  **/
  @Schema(description = "")
  public CampaigngmvMaxcreatePromotionDays getPromotionDays() {
    return promotionDays;
  }

  public void setPromotionDays(CampaigngmvMaxcreatePromotionDays promotionDays) {
    this.promotionDays = promotionDays;
  }

  public GmvMaxCreateBody requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(required = true, description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public GmvMaxCreateBody roasBid(Double roasBid) {
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

  public GmvMaxCreateBody scheduleEndTime(String scheduleEndTime) {
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

  public GmvMaxCreateBody scheduleStartTime(String scheduleStartTime) {
    this.scheduleStartTime = scheduleStartTime;
    return this;
  }

   /**
   * Get scheduleStartTime
   * @return scheduleStartTime
  **/
  @Schema(required = true, description = "")
  public String getScheduleStartTime() {
    return scheduleStartTime;
  }

  public void setScheduleStartTime(String scheduleStartTime) {
    this.scheduleStartTime = scheduleStartTime;
  }

  public GmvMaxCreateBody scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @Schema(required = true, description = "")
  public String getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }

  public GmvMaxCreateBody shoppingAdsType(String shoppingAdsType) {
    this.shoppingAdsType = shoppingAdsType;
    return this;
  }

   /**
   * Get shoppingAdsType
   * @return shoppingAdsType
  **/
  @Schema(required = true, description = "")
  public String getShoppingAdsType() {
    return shoppingAdsType;
  }

  public void setShoppingAdsType(String shoppingAdsType) {
    this.shoppingAdsType = shoppingAdsType;
  }

  public GmvMaxCreateBody storeAuthorizedBcId(String storeAuthorizedBcId) {
    this.storeAuthorizedBcId = storeAuthorizedBcId;
    return this;
  }

   /**
   * Get storeAuthorizedBcId
   * @return storeAuthorizedBcId
  **/
  @Schema(required = true, description = "")
  public String getStoreAuthorizedBcId() {
    return storeAuthorizedBcId;
  }

  public void setStoreAuthorizedBcId(String storeAuthorizedBcId) {
    this.storeAuthorizedBcId = storeAuthorizedBcId;
  }

  public GmvMaxCreateBody storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @Schema(required = true, description = "")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GmvMaxCreateBody gmvMaxCreateBody = (GmvMaxCreateBody) o;
    return Objects.equals(this.advertiserId, gmvMaxCreateBody.advertiserId) &&
        Objects.equals(this.affiliatePostsEnabled, gmvMaxCreateBody.affiliatePostsEnabled) &&
        Objects.equals(this.autoBudgetEnabled, gmvMaxCreateBody.autoBudgetEnabled) &&
        Objects.equals(this.budget, gmvMaxCreateBody.budget) &&
        Objects.equals(this.campaignName, gmvMaxCreateBody.campaignName) &&
        Objects.equals(this.customAnchorVideoList, gmvMaxCreateBody.customAnchorVideoList) &&
        Objects.equals(this.deepBidType, gmvMaxCreateBody.deepBidType) &&
        Objects.equals(this.identityList, gmvMaxCreateBody.identityList) &&
        Objects.equals(this.itemGroupIds, gmvMaxCreateBody.itemGroupIds) &&
        Objects.equals(this.itemList, gmvMaxCreateBody.itemList) &&
        Objects.equals(this.optimizationGoal, gmvMaxCreateBody.optimizationGoal) &&
        Objects.equals(this.productSpecificType, gmvMaxCreateBody.productSpecificType) &&
        Objects.equals(this.productVideoSpecificType, gmvMaxCreateBody.productVideoSpecificType) &&
        Objects.equals(this.promotionDays, gmvMaxCreateBody.promotionDays) &&
        Objects.equals(this.requestId, gmvMaxCreateBody.requestId) &&
        Objects.equals(this.roasBid, gmvMaxCreateBody.roasBid) &&
        Objects.equals(this.scheduleEndTime, gmvMaxCreateBody.scheduleEndTime) &&
        Objects.equals(this.scheduleStartTime, gmvMaxCreateBody.scheduleStartTime) &&
        Objects.equals(this.scheduleType, gmvMaxCreateBody.scheduleType) &&
        Objects.equals(this.shoppingAdsType, gmvMaxCreateBody.shoppingAdsType) &&
        Objects.equals(this.storeAuthorizedBcId, gmvMaxCreateBody.storeAuthorizedBcId) &&
        Objects.equals(this.storeId, gmvMaxCreateBody.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, affiliatePostsEnabled, autoBudgetEnabled, budget, campaignName, customAnchorVideoList, deepBidType, identityList, itemGroupIds, itemList, optimizationGoal, productSpecificType, productVideoSpecificType, promotionDays, requestId, roasBid, scheduleEndTime, scheduleStartTime, scheduleType, shoppingAdsType, storeAuthorizedBcId, storeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GmvMaxCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    affiliatePostsEnabled: ").append(toIndentedString(affiliatePostsEnabled)).append("\n");
    sb.append("    autoBudgetEnabled: ").append(toIndentedString(autoBudgetEnabled)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    customAnchorVideoList: ").append(toIndentedString(customAnchorVideoList)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    identityList: ").append(toIndentedString(identityList)).append("\n");
    sb.append("    itemGroupIds: ").append(toIndentedString(itemGroupIds)).append("\n");
    sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    productSpecificType: ").append(toIndentedString(productSpecificType)).append("\n");
    sb.append("    productVideoSpecificType: ").append(toIndentedString(productVideoSpecificType)).append("\n");
    sb.append("    promotionDays: ").append(toIndentedString(promotionDays)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    roasBid: ").append(toIndentedString(roasBid)).append("\n");
    sb.append("    scheduleEndTime: ").append(toIndentedString(scheduleEndTime)).append("\n");
    sb.append("    scheduleStartTime: ").append(toIndentedString(scheduleStartTime)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    shoppingAdsType: ").append(toIndentedString(shoppingAdsType)).append("\n");
    sb.append("    storeAuthorizedBcId: ").append(toIndentedString(storeAuthorizedBcId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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
