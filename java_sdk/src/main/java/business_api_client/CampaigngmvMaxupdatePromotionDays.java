/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CampaigngmvMaxupdatePromotionDaysCustomScheduleList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CampaigngmvMaxupdatePromotionDays
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class CampaigngmvMaxupdatePromotionDays {
  @JsonProperty("auto_schedule_enabled")
  private Boolean autoScheduleEnabled = null;

  @JsonProperty("custom_schedule_list")
  private List<CampaigngmvMaxupdatePromotionDaysCustomScheduleList> customScheduleList = null;

  @JsonProperty("is_enabled")
  private Boolean isEnabled = null;

  @JsonProperty("roas_bid_multiplier")
  private Long roasBidMultiplier = null;

  public CampaigngmvMaxupdatePromotionDays autoScheduleEnabled(Boolean autoScheduleEnabled) {
    this.autoScheduleEnabled = autoScheduleEnabled;
    return this;
  }

   /**
   * Get autoScheduleEnabled
   * @return autoScheduleEnabled
  **/
  @Schema(description = "")
  public Boolean isAutoScheduleEnabled() {
    return autoScheduleEnabled;
  }

  public void setAutoScheduleEnabled(Boolean autoScheduleEnabled) {
    this.autoScheduleEnabled = autoScheduleEnabled;
  }

  public CampaigngmvMaxupdatePromotionDays customScheduleList(List<CampaigngmvMaxupdatePromotionDaysCustomScheduleList> customScheduleList) {
    this.customScheduleList = customScheduleList;
    return this;
  }

  public CampaigngmvMaxupdatePromotionDays addCustomScheduleListItem(CampaigngmvMaxupdatePromotionDaysCustomScheduleList customScheduleListItem) {
    if (this.customScheduleList == null) {
      this.customScheduleList = new ArrayList<CampaigngmvMaxupdatePromotionDaysCustomScheduleList>();
    }
    this.customScheduleList.add(customScheduleListItem);
    return this;
  }

   /**
   * Get customScheduleList
   * @return customScheduleList
  **/
  @Schema(description = "")
  public List<CampaigngmvMaxupdatePromotionDaysCustomScheduleList> getCustomScheduleList() {
    return customScheduleList;
  }

  public void setCustomScheduleList(List<CampaigngmvMaxupdatePromotionDaysCustomScheduleList> customScheduleList) {
    this.customScheduleList = customScheduleList;
  }

  public CampaigngmvMaxupdatePromotionDays isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @Schema(description = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public CampaigngmvMaxupdatePromotionDays roasBidMultiplier(Long roasBidMultiplier) {
    this.roasBidMultiplier = roasBidMultiplier;
    return this;
  }

   /**
   * Get roasBidMultiplier
   * @return roasBidMultiplier
  **/
  @Schema(description = "")
  public Long getRoasBidMultiplier() {
    return roasBidMultiplier;
  }

  public void setRoasBidMultiplier(Long roasBidMultiplier) {
    this.roasBidMultiplier = roasBidMultiplier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaigngmvMaxupdatePromotionDays campaigngmvMaxupdatePromotionDays = (CampaigngmvMaxupdatePromotionDays) o;
    return Objects.equals(this.autoScheduleEnabled, campaigngmvMaxupdatePromotionDays.autoScheduleEnabled) &&
        Objects.equals(this.customScheduleList, campaigngmvMaxupdatePromotionDays.customScheduleList) &&
        Objects.equals(this.isEnabled, campaigngmvMaxupdatePromotionDays.isEnabled) &&
        Objects.equals(this.roasBidMultiplier, campaigngmvMaxupdatePromotionDays.roasBidMultiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoScheduleEnabled, customScheduleList, isEnabled, roasBidMultiplier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaigngmvMaxupdatePromotionDays {\n");
    
    sb.append("    autoScheduleEnabled: ").append(toIndentedString(autoScheduleEnabled)).append("\n");
    sb.append("    customScheduleList: ").append(toIndentedString(customScheduleList)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    roasBidMultiplier: ").append(toIndentedString(roasBidMultiplier)).append("\n");
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
