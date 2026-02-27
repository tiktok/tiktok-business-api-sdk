/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CampaigngmvMaxsessioncreateSessionProductList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CampaigngmvMaxsessioncreateSession
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class CampaigngmvMaxsessioncreateSession {
  @JsonProperty("bid_type")
  private String bidType = null;

  @JsonProperty("budget")
  private Double budget = null;

  @JsonProperty("item_id")
  private String itemId = null;

  @JsonProperty("product_list")
  private List<CampaigngmvMaxsessioncreateSessionProductList> productList = new ArrayList<CampaigngmvMaxsessioncreateSessionProductList>();

  @JsonProperty("schedule_end_time")
  private String scheduleEndTime = null;

  @JsonProperty("schedule_start_time")
  private String scheduleStartTime = null;

  @JsonProperty("schedule_type")
  private String scheduleType = null;

  public CampaigngmvMaxsessioncreateSession bidType(String bidType) {
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @Schema(description = "")
  public String getBidType() {
    return bidType;
  }

  public void setBidType(String bidType) {
    this.bidType = bidType;
  }

  public CampaigngmvMaxsessioncreateSession budget(Double budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @Schema(required = true, description = "")
  public Double getBudget() {
    return budget;
  }

  public void setBudget(Double budget) {
    this.budget = budget;
  }

  public CampaigngmvMaxsessioncreateSession itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @Schema(description = "")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CampaigngmvMaxsessioncreateSession productList(List<CampaigngmvMaxsessioncreateSessionProductList> productList) {
    this.productList = productList;
    return this;
  }

  public CampaigngmvMaxsessioncreateSession addProductListItem(CampaigngmvMaxsessioncreateSessionProductList productListItem) {
    this.productList.add(productListItem);
    return this;
  }

   /**
   * Get productList
   * @return productList
  **/
  @Schema(required = true, description = "")
  public List<CampaigngmvMaxsessioncreateSessionProductList> getProductList() {
    return productList;
  }

  public void setProductList(List<CampaigngmvMaxsessioncreateSessionProductList> productList) {
    this.productList = productList;
  }

  public CampaigngmvMaxsessioncreateSession scheduleEndTime(String scheduleEndTime) {
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

  public CampaigngmvMaxsessioncreateSession scheduleStartTime(String scheduleStartTime) {
    this.scheduleStartTime = scheduleStartTime;
    return this;
  }

   /**
   * Get scheduleStartTime
   * @return scheduleStartTime
  **/
  @Schema(description = "")
  public String getScheduleStartTime() {
    return scheduleStartTime;
  }

  public void setScheduleStartTime(String scheduleStartTime) {
    this.scheduleStartTime = scheduleStartTime;
  }

  public CampaigngmvMaxsessioncreateSession scheduleType(String scheduleType) {
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
    CampaigngmvMaxsessioncreateSession campaigngmvMaxsessioncreateSession = (CampaigngmvMaxsessioncreateSession) o;
    return Objects.equals(this.bidType, campaigngmvMaxsessioncreateSession.bidType) &&
        Objects.equals(this.budget, campaigngmvMaxsessioncreateSession.budget) &&
        Objects.equals(this.itemId, campaigngmvMaxsessioncreateSession.itemId) &&
        Objects.equals(this.productList, campaigngmvMaxsessioncreateSession.productList) &&
        Objects.equals(this.scheduleEndTime, campaigngmvMaxsessioncreateSession.scheduleEndTime) &&
        Objects.equals(this.scheduleStartTime, campaigngmvMaxsessioncreateSession.scheduleStartTime) &&
        Objects.equals(this.scheduleType, campaigngmvMaxsessioncreateSession.scheduleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidType, budget, itemId, productList, scheduleEndTime, scheduleStartTime, scheduleType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaigngmvMaxsessioncreateSession {\n");
    
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
    sb.append("    scheduleEndTime: ").append(toIndentedString(scheduleEndTime)).append("\n");
    sb.append("    scheduleStartTime: ").append(toIndentedString(scheduleStartTime)).append("\n");
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
