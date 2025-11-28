/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CampaigngmvMaxcreatePromotionDaysCustomScheduleList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CampaigngmvMaxcreatePromotionDays
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class CampaigngmvMaxcreatePromotionDays {
  @JsonProperty("auto_schedule_enabled")
  private Boolean autoScheduleEnabled = true;

  @JsonProperty("custom_schedule_list")
  private List<CampaigngmvMaxcreatePromotionDaysCustomScheduleList> customScheduleList = null;

  @JsonProperty("is_enabled")
  private Boolean isEnabled = true;

  @JsonProperty("roas_bid_multiplier")
  private Integer roasBidMultiplier = 90;

  public CampaigngmvMaxcreatePromotionDays autoScheduleEnabled(Boolean autoScheduleEnabled) {
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

  public CampaigngmvMaxcreatePromotionDays customScheduleList(List<CampaigngmvMaxcreatePromotionDaysCustomScheduleList> customScheduleList) {
    this.customScheduleList = customScheduleList;
    return this;
  }

  public CampaigngmvMaxcreatePromotionDays addCustomScheduleListItem(CampaigngmvMaxcreatePromotionDaysCustomScheduleList customScheduleListItem) {
    if (this.customScheduleList == null) {
      this.customScheduleList = new ArrayList<CampaigngmvMaxcreatePromotionDaysCustomScheduleList>();
    }
    this.customScheduleList.add(customScheduleListItem);
    return this;
  }

   /**
   * Get customScheduleList
   * @return customScheduleList
  **/
  @Schema(description = "")
  public List<CampaigngmvMaxcreatePromotionDaysCustomScheduleList> getCustomScheduleList() {
    return customScheduleList;
  }

  public void setCustomScheduleList(List<CampaigngmvMaxcreatePromotionDaysCustomScheduleList> customScheduleList) {
    this.customScheduleList = customScheduleList;
  }

  public CampaigngmvMaxcreatePromotionDays isEnabled(Boolean isEnabled) {
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

  public CampaigngmvMaxcreatePromotionDays roasBidMultiplier(Integer roasBidMultiplier) {
    this.roasBidMultiplier = roasBidMultiplier;
    return this;
  }

   /**
   * Get roasBidMultiplier
   * @return roasBidMultiplier
  **/
  @Schema(description = "")
  public Integer getRoasBidMultiplier() {
    return roasBidMultiplier;
  }

  public void setRoasBidMultiplier(Integer roasBidMultiplier) {
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
    CampaigngmvMaxcreatePromotionDays campaigngmvMaxcreatePromotionDays = (CampaigngmvMaxcreatePromotionDays) o;
    return Objects.equals(this.autoScheduleEnabled, campaigngmvMaxcreatePromotionDays.autoScheduleEnabled) &&
        Objects.equals(this.customScheduleList, campaigngmvMaxcreatePromotionDays.customScheduleList) &&
        Objects.equals(this.isEnabled, campaigngmvMaxcreatePromotionDays.isEnabled) &&
        Objects.equals(this.roasBidMultiplier, campaigngmvMaxcreatePromotionDays.roasBidMultiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoScheduleEnabled, customScheduleList, isEnabled, roasBidMultiplier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaigngmvMaxcreatePromotionDays {\n");
    
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
