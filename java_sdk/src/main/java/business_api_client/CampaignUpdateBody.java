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
 * CampaignUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-04-18T10:46:48.851395-07:00[America/Los_Angeles]")
public class CampaignUpdateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("budget")
  private Float budget = null;

  @JsonProperty("budget_mode")
  private String budgetMode = null;

  @JsonProperty("campaign_id")
  private String campaignId = null;

  @JsonProperty("campaign_name")
  private String campaignName = null;

  @JsonProperty("roas_bid")
  private Float roasBid = null;

  @JsonProperty("special_industries")
  private List<String> specialIndustries = null;

  public CampaignUpdateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public CampaignUpdateBody budget(Float budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Campaign budget. Required when budget_mode is BUDGET_MODE_DAY or BUDGET_MODE_TOTAL. To learn about the mininum budget and how to set budget types, see Budget settings.
   * @return budget
  **/
  @Schema(description = "Campaign budget. Required when budget_mode is BUDGET_MODE_DAY or BUDGET_MODE_TOTAL. To learn about the mininum budget and how to set budget types, see Budget settings.")
  public Float getBudget() {
    return budget;
  }

  public void setBudget(Float budget) {
    this.budget = budget;
  }

  public CampaignUpdateBody budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Budget type. When Campaign Budgeet Optimization is enabled, only BUDGET_MODE_DAY is supported. To learn about how to set budget types, see Budget setting.
   * @return budgetMode
  **/
  @Schema(description = "Budget type. When Campaign Budgeet Optimization is enabled, only BUDGET_MODE_DAY is supported. To learn about how to set budget types, see Budget setting.")
  public String getBudgetMode() {
    return budgetMode;
  }

  public void setBudgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
  }

  public CampaignUpdateBody campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
   * @return campaignId
  **/
  @Schema(required = true, description = "Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignUpdateBody campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
   * @return campaignName
  **/
  @Schema(description = "Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public CampaignUpdateBody roasBid(Float roasBid) {
    this.roasBid = roasBid;
    return this;
  }

   /**
   * ROAS (Return On Advertising Spend) goal to optimize value. This field can be modified only when Campaign Budget Optimization(budget_optimize_on) is enabled , optimization_goal is VALUE and deep_bid_type is VO_MIN_ROAS. Value range: 0.01-1000.
   * @return roasBid
  **/
  @Schema(description = "ROAS (Return On Advertising Spend) goal to optimize value. This field can be modified only when Campaign Budget Optimization(budget_optimize_on) is enabled , optimization_goal is VALUE and deep_bid_type is VO_MIN_ROAS. Value range: 0.01-1000.")
  public Float getRoasBid() {
    return roasBid;
  }

  public void setRoasBid(Float roasBid) {
    this.roasBid = roasBid;
  }

  public CampaignUpdateBody specialIndustries(List<String> specialIndustries) {
    this.specialIndustries = specialIndustries;
    return this;
  }

  public CampaignUpdateBody addSpecialIndustriesItem(String specialIndustriesItem) {
    if (this.specialIndustries == null) {
      this.specialIndustries = new ArrayList<String>();
    }
    this.specialIndustries.add(specialIndustriesItem);
    return this;
  }

   /**
   * Ad categories. Enum values: HOUSING(Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities.) EMPLOYMENT(Ads for job offers, internship, professional certification programs or other related opportunities.) CREDIT(Ads for credit card offers, auto loans, long-term financing or other related opportunities.) Note: The ONLY supported operation here is that you can clear all the values for the field if you&#x27;ve specifed it when creating a campaign. If you&#x27;ve not specified the field when creating a campaign, you cannot specify it now either.
   * @return specialIndustries
  **/
  @Schema(description = "Ad categories. Enum values: HOUSING(Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities.) EMPLOYMENT(Ads for job offers, internship, professional certification programs or other related opportunities.) CREDIT(Ads for credit card offers, auto loans, long-term financing or other related opportunities.) Note: The ONLY supported operation here is that you can clear all the values for the field if you've specifed it when creating a campaign. If you've not specified the field when creating a campaign, you cannot specify it now either.")
  public List<String> getSpecialIndustries() {
    return specialIndustries;
  }

  public void setSpecialIndustries(List<String> specialIndustries) {
    this.specialIndustries = specialIndustries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignUpdateBody campaignUpdateBody = (CampaignUpdateBody) o;
    return Objects.equals(this.advertiserId, campaignUpdateBody.advertiserId) &&
        Objects.equals(this.budget, campaignUpdateBody.budget) &&
        Objects.equals(this.budgetMode, campaignUpdateBody.budgetMode) &&
        Objects.equals(this.campaignId, campaignUpdateBody.campaignId) &&
        Objects.equals(this.campaignName, campaignUpdateBody.campaignName) &&
        Objects.equals(this.roasBid, campaignUpdateBody.roasBid) &&
        Objects.equals(this.specialIndustries, campaignUpdateBody.specialIndustries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budget, budgetMode, campaignId, campaignName, roasBid, specialIndustries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignUpdateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    roasBid: ").append(toIndentedString(roasBid)).append("\n");
    sb.append("    specialIndustries: ").append(toIndentedString(specialIndustries)).append("\n");
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
