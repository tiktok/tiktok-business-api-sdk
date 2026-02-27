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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class CampaignUpdateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("budget")
  private Float budget = null;

  @JsonProperty("campaign_id")
  private String campaignId = null;

  @JsonProperty("campaign_name")
  private String campaignName = null;

  @JsonProperty("po_number")
  private String poNumber = null;

  @JsonProperty("special_industries")
  private List<String> specialIndustries = null;

  public CampaignUpdateBody advertiserId(String advertiserId) {
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

  public CampaignUpdateBody budget(Float budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @Schema(description = "")
  public Float getBudget() {
    return budget;
  }

  public void setBudget(Float budget) {
    this.budget = budget;
  }

  public CampaignUpdateBody campaignId(String campaignId) {
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

  public CampaignUpdateBody campaignName(String campaignName) {
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

  public CampaignUpdateBody poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

   /**
   * Get poNumber
   * @return poNumber
  **/
  @Schema(description = "")
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
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
   * Get specialIndustries
   * @return specialIndustries
  **/
  @Schema(description = "")
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
        Objects.equals(this.campaignId, campaignUpdateBody.campaignId) &&
        Objects.equals(this.campaignName, campaignUpdateBody.campaignName) &&
        Objects.equals(this.poNumber, campaignUpdateBody.poNumber) &&
        Objects.equals(this.specialIndustries, campaignUpdateBody.specialIndustries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budget, campaignId, campaignName, poNumber, specialIndustries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignUpdateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
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
