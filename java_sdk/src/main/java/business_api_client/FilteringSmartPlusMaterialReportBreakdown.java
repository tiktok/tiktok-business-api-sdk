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
 * FilteringSmartPlusMaterialReportBreakdown
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class FilteringSmartPlusMaterialReportBreakdown {
  @JsonProperty("ad_text_entity_ids")
  private List<String> adTextEntityIds = null;

  @JsonProperty("adgroup_ids")
  private List<String> adgroupIds = null;

  @JsonProperty("call_to_action_entity_ids")
  private List<String> callToActionEntityIds = null;

  @JsonProperty("campaign_ids")
  private List<String> campaignIds = null;

  @JsonProperty("interactive_add_on_entity_ids")
  private List<String> interactiveAddOnEntityIds = null;

  @JsonProperty("main_material_ids")
  private List<String> mainMaterialIds = null;

  @JsonProperty("main_material_types")
  private List<String> mainMaterialTypes = null;

  @JsonProperty("smart_plus_ad_ids")
  private List<String> smartPlusAdIds = null;

  public FilteringSmartPlusMaterialReportBreakdown adTextEntityIds(List<String> adTextEntityIds) {
    this.adTextEntityIds = adTextEntityIds;
    return this;
  }

  public FilteringSmartPlusMaterialReportBreakdown addAdTextEntityIdsItem(String adTextEntityIdsItem) {
    if (this.adTextEntityIds == null) {
      this.adTextEntityIds = new ArrayList<String>();
    }
    this.adTextEntityIds.add(adTextEntityIdsItem);
    return this;
  }

   /**
   * Get adTextEntityIds
   * @return adTextEntityIds
  **/
  @Schema(description = "")
  public List<String> getAdTextEntityIds() {
    return adTextEntityIds;
  }

  public void setAdTextEntityIds(List<String> adTextEntityIds) {
    this.adTextEntityIds = adTextEntityIds;
  }

  public FilteringSmartPlusMaterialReportBreakdown adgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
    return this;
  }

  public FilteringSmartPlusMaterialReportBreakdown addAdgroupIdsItem(String adgroupIdsItem) {
    if (this.adgroupIds == null) {
      this.adgroupIds = new ArrayList<String>();
    }
    this.adgroupIds.add(adgroupIdsItem);
    return this;
  }

   /**
   * Get adgroupIds
   * @return adgroupIds
  **/
  @Schema(description = "")
  public List<String> getAdgroupIds() {
    return adgroupIds;
  }

  public void setAdgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
  }

  public FilteringSmartPlusMaterialReportBreakdown callToActionEntityIds(List<String> callToActionEntityIds) {
    this.callToActionEntityIds = callToActionEntityIds;
    return this;
  }

  public FilteringSmartPlusMaterialReportBreakdown addCallToActionEntityIdsItem(String callToActionEntityIdsItem) {
    if (this.callToActionEntityIds == null) {
      this.callToActionEntityIds = new ArrayList<String>();
    }
    this.callToActionEntityIds.add(callToActionEntityIdsItem);
    return this;
  }

   /**
   * Get callToActionEntityIds
   * @return callToActionEntityIds
  **/
  @Schema(description = "")
  public List<String> getCallToActionEntityIds() {
    return callToActionEntityIds;
  }

  public void setCallToActionEntityIds(List<String> callToActionEntityIds) {
    this.callToActionEntityIds = callToActionEntityIds;
  }

  public FilteringSmartPlusMaterialReportBreakdown campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilteringSmartPlusMaterialReportBreakdown addCampaignIdsItem(String campaignIdsItem) {
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

  public FilteringSmartPlusMaterialReportBreakdown interactiveAddOnEntityIds(List<String> interactiveAddOnEntityIds) {
    this.interactiveAddOnEntityIds = interactiveAddOnEntityIds;
    return this;
  }

  public FilteringSmartPlusMaterialReportBreakdown addInteractiveAddOnEntityIdsItem(String interactiveAddOnEntityIdsItem) {
    if (this.interactiveAddOnEntityIds == null) {
      this.interactiveAddOnEntityIds = new ArrayList<String>();
    }
    this.interactiveAddOnEntityIds.add(interactiveAddOnEntityIdsItem);
    return this;
  }

   /**
   * Get interactiveAddOnEntityIds
   * @return interactiveAddOnEntityIds
  **/
  @Schema(description = "")
  public List<String> getInteractiveAddOnEntityIds() {
    return interactiveAddOnEntityIds;
  }

  public void setInteractiveAddOnEntityIds(List<String> interactiveAddOnEntityIds) {
    this.interactiveAddOnEntityIds = interactiveAddOnEntityIds;
  }

  public FilteringSmartPlusMaterialReportBreakdown mainMaterialIds(List<String> mainMaterialIds) {
    this.mainMaterialIds = mainMaterialIds;
    return this;
  }

  public FilteringSmartPlusMaterialReportBreakdown addMainMaterialIdsItem(String mainMaterialIdsItem) {
    if (this.mainMaterialIds == null) {
      this.mainMaterialIds = new ArrayList<String>();
    }
    this.mainMaterialIds.add(mainMaterialIdsItem);
    return this;
  }

   /**
   * Get mainMaterialIds
   * @return mainMaterialIds
  **/
  @Schema(description = "")
  public List<String> getMainMaterialIds() {
    return mainMaterialIds;
  }

  public void setMainMaterialIds(List<String> mainMaterialIds) {
    this.mainMaterialIds = mainMaterialIds;
  }

  public FilteringSmartPlusMaterialReportBreakdown mainMaterialTypes(List<String> mainMaterialTypes) {
    this.mainMaterialTypes = mainMaterialTypes;
    return this;
  }

  public FilteringSmartPlusMaterialReportBreakdown addMainMaterialTypesItem(String mainMaterialTypesItem) {
    if (this.mainMaterialTypes == null) {
      this.mainMaterialTypes = new ArrayList<String>();
    }
    this.mainMaterialTypes.add(mainMaterialTypesItem);
    return this;
  }

   /**
   * Get mainMaterialTypes
   * @return mainMaterialTypes
  **/
  @Schema(description = "")
  public List<String> getMainMaterialTypes() {
    return mainMaterialTypes;
  }

  public void setMainMaterialTypes(List<String> mainMaterialTypes) {
    this.mainMaterialTypes = mainMaterialTypes;
  }

  public FilteringSmartPlusMaterialReportBreakdown smartPlusAdIds(List<String> smartPlusAdIds) {
    this.smartPlusAdIds = smartPlusAdIds;
    return this;
  }

  public FilteringSmartPlusMaterialReportBreakdown addSmartPlusAdIdsItem(String smartPlusAdIdsItem) {
    if (this.smartPlusAdIds == null) {
      this.smartPlusAdIds = new ArrayList<String>();
    }
    this.smartPlusAdIds.add(smartPlusAdIdsItem);
    return this;
  }

   /**
   * Get smartPlusAdIds
   * @return smartPlusAdIds
  **/
  @Schema(description = "")
  public List<String> getSmartPlusAdIds() {
    return smartPlusAdIds;
  }

  public void setSmartPlusAdIds(List<String> smartPlusAdIds) {
    this.smartPlusAdIds = smartPlusAdIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringSmartPlusMaterialReportBreakdown filteringSmartPlusMaterialReportBreakdown = (FilteringSmartPlusMaterialReportBreakdown) o;
    return Objects.equals(this.adTextEntityIds, filteringSmartPlusMaterialReportBreakdown.adTextEntityIds) &&
        Objects.equals(this.adgroupIds, filteringSmartPlusMaterialReportBreakdown.adgroupIds) &&
        Objects.equals(this.callToActionEntityIds, filteringSmartPlusMaterialReportBreakdown.callToActionEntityIds) &&
        Objects.equals(this.campaignIds, filteringSmartPlusMaterialReportBreakdown.campaignIds) &&
        Objects.equals(this.interactiveAddOnEntityIds, filteringSmartPlusMaterialReportBreakdown.interactiveAddOnEntityIds) &&
        Objects.equals(this.mainMaterialIds, filteringSmartPlusMaterialReportBreakdown.mainMaterialIds) &&
        Objects.equals(this.mainMaterialTypes, filteringSmartPlusMaterialReportBreakdown.mainMaterialTypes) &&
        Objects.equals(this.smartPlusAdIds, filteringSmartPlusMaterialReportBreakdown.smartPlusAdIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adTextEntityIds, adgroupIds, callToActionEntityIds, campaignIds, interactiveAddOnEntityIds, mainMaterialIds, mainMaterialTypes, smartPlusAdIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringSmartPlusMaterialReportBreakdown {\n");
    
    sb.append("    adTextEntityIds: ").append(toIndentedString(adTextEntityIds)).append("\n");
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
    sb.append("    callToActionEntityIds: ").append(toIndentedString(callToActionEntityIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    interactiveAddOnEntityIds: ").append(toIndentedString(interactiveAddOnEntityIds)).append("\n");
    sb.append("    mainMaterialIds: ").append(toIndentedString(mainMaterialIds)).append("\n");
    sb.append("    mainMaterialTypes: ").append(toIndentedString(mainMaterialTypes)).append("\n");
    sb.append("    smartPlusAdIds: ").append(toIndentedString(smartPlusAdIds)).append("\n");
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
