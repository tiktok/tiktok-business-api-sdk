/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.SmartPlusAdCreateBodyAdTextList;
import business_api_client.SmartPlusAdCreateBodyCallToActionList;
import business_api_client.SmartPlusAdCreateBodyDeeplinkList;
import business_api_client.SmartPlusAdCreateBodyInteractiveAddOnList;
import business_api_client.SmartPlusAdCreateBodyLandingPageUrlList;
import business_api_client.SmartPlusAdCreateBodyPageList;
import business_api_client.SmartPlusAdUpdateBodyAdConfiguration;
import business_api_client.SmartPlusAdUpdateBodyCreativeList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SmartPlusAdUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class SmartPlusAdUpdateBody {
  @JsonProperty("ad_configuration")
  private SmartPlusAdUpdateBodyAdConfiguration adConfiguration = null;

  @JsonProperty("ad_name")
  private String adName = null;

  @JsonProperty("ad_text_list")
  private List<SmartPlusAdCreateBodyAdTextList> adTextList = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("call_to_action_list")
  private List<SmartPlusAdCreateBodyCallToActionList> callToActionList = null;

  @JsonProperty("creative_list")
  private List<SmartPlusAdUpdateBodyCreativeList> creativeList = null;

  @JsonProperty("deeplink_list")
  private List<SmartPlusAdCreateBodyDeeplinkList> deeplinkList = null;

  @JsonProperty("interactive_add_on_list")
  private List<SmartPlusAdCreateBodyInteractiveAddOnList> interactiveAddOnList = null;

  @JsonProperty("landing_page_url_list")
  private List<SmartPlusAdCreateBodyLandingPageUrlList> landingPageUrlList = null;

  @JsonProperty("page_list")
  private List<SmartPlusAdCreateBodyPageList> pageList = null;

  @JsonProperty("smart_plus_ad_id")
  private String smartPlusAdId = null;

  public SmartPlusAdUpdateBody adConfiguration(SmartPlusAdUpdateBodyAdConfiguration adConfiguration) {
    this.adConfiguration = adConfiguration;
    return this;
  }

   /**
   * Get adConfiguration
   * @return adConfiguration
  **/
  @Schema(description = "")
  public SmartPlusAdUpdateBodyAdConfiguration getAdConfiguration() {
    return adConfiguration;
  }

  public void setAdConfiguration(SmartPlusAdUpdateBodyAdConfiguration adConfiguration) {
    this.adConfiguration = adConfiguration;
  }

  public SmartPlusAdUpdateBody adName(String adName) {
    this.adName = adName;
    return this;
  }

   /**
   * Get adName
   * @return adName
  **/
  @Schema(description = "")
  public String getAdName() {
    return adName;
  }

  public void setAdName(String adName) {
    this.adName = adName;
  }

  public SmartPlusAdUpdateBody adTextList(List<SmartPlusAdCreateBodyAdTextList> adTextList) {
    this.adTextList = adTextList;
    return this;
  }

  public SmartPlusAdUpdateBody addAdTextListItem(SmartPlusAdCreateBodyAdTextList adTextListItem) {
    if (this.adTextList == null) {
      this.adTextList = new ArrayList<SmartPlusAdCreateBodyAdTextList>();
    }
    this.adTextList.add(adTextListItem);
    return this;
  }

   /**
   * Get adTextList
   * @return adTextList
  **/
  @Schema(description = "")
  public List<SmartPlusAdCreateBodyAdTextList> getAdTextList() {
    return adTextList;
  }

  public void setAdTextList(List<SmartPlusAdCreateBodyAdTextList> adTextList) {
    this.adTextList = adTextList;
  }

  public SmartPlusAdUpdateBody advertiserId(String advertiserId) {
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

  public SmartPlusAdUpdateBody callToActionList(List<SmartPlusAdCreateBodyCallToActionList> callToActionList) {
    this.callToActionList = callToActionList;
    return this;
  }

  public SmartPlusAdUpdateBody addCallToActionListItem(SmartPlusAdCreateBodyCallToActionList callToActionListItem) {
    if (this.callToActionList == null) {
      this.callToActionList = new ArrayList<SmartPlusAdCreateBodyCallToActionList>();
    }
    this.callToActionList.add(callToActionListItem);
    return this;
  }

   /**
   * Get callToActionList
   * @return callToActionList
  **/
  @Schema(description = "")
  public List<SmartPlusAdCreateBodyCallToActionList> getCallToActionList() {
    return callToActionList;
  }

  public void setCallToActionList(List<SmartPlusAdCreateBodyCallToActionList> callToActionList) {
    this.callToActionList = callToActionList;
  }

  public SmartPlusAdUpdateBody creativeList(List<SmartPlusAdUpdateBodyCreativeList> creativeList) {
    this.creativeList = creativeList;
    return this;
  }

  public SmartPlusAdUpdateBody addCreativeListItem(SmartPlusAdUpdateBodyCreativeList creativeListItem) {
    if (this.creativeList == null) {
      this.creativeList = new ArrayList<SmartPlusAdUpdateBodyCreativeList>();
    }
    this.creativeList.add(creativeListItem);
    return this;
  }

   /**
   * Get creativeList
   * @return creativeList
  **/
  @Schema(description = "")
  public List<SmartPlusAdUpdateBodyCreativeList> getCreativeList() {
    return creativeList;
  }

  public void setCreativeList(List<SmartPlusAdUpdateBodyCreativeList> creativeList) {
    this.creativeList = creativeList;
  }

  public SmartPlusAdUpdateBody deeplinkList(List<SmartPlusAdCreateBodyDeeplinkList> deeplinkList) {
    this.deeplinkList = deeplinkList;
    return this;
  }

  public SmartPlusAdUpdateBody addDeeplinkListItem(SmartPlusAdCreateBodyDeeplinkList deeplinkListItem) {
    if (this.deeplinkList == null) {
      this.deeplinkList = new ArrayList<SmartPlusAdCreateBodyDeeplinkList>();
    }
    this.deeplinkList.add(deeplinkListItem);
    return this;
  }

   /**
   * Get deeplinkList
   * @return deeplinkList
  **/
  @Schema(description = "")
  public List<SmartPlusAdCreateBodyDeeplinkList> getDeeplinkList() {
    return deeplinkList;
  }

  public void setDeeplinkList(List<SmartPlusAdCreateBodyDeeplinkList> deeplinkList) {
    this.deeplinkList = deeplinkList;
  }

  public SmartPlusAdUpdateBody interactiveAddOnList(List<SmartPlusAdCreateBodyInteractiveAddOnList> interactiveAddOnList) {
    this.interactiveAddOnList = interactiveAddOnList;
    return this;
  }

  public SmartPlusAdUpdateBody addInteractiveAddOnListItem(SmartPlusAdCreateBodyInteractiveAddOnList interactiveAddOnListItem) {
    if (this.interactiveAddOnList == null) {
      this.interactiveAddOnList = new ArrayList<SmartPlusAdCreateBodyInteractiveAddOnList>();
    }
    this.interactiveAddOnList.add(interactiveAddOnListItem);
    return this;
  }

   /**
   * Get interactiveAddOnList
   * @return interactiveAddOnList
  **/
  @Schema(description = "")
  public List<SmartPlusAdCreateBodyInteractiveAddOnList> getInteractiveAddOnList() {
    return interactiveAddOnList;
  }

  public void setInteractiveAddOnList(List<SmartPlusAdCreateBodyInteractiveAddOnList> interactiveAddOnList) {
    this.interactiveAddOnList = interactiveAddOnList;
  }

  public SmartPlusAdUpdateBody landingPageUrlList(List<SmartPlusAdCreateBodyLandingPageUrlList> landingPageUrlList) {
    this.landingPageUrlList = landingPageUrlList;
    return this;
  }

  public SmartPlusAdUpdateBody addLandingPageUrlListItem(SmartPlusAdCreateBodyLandingPageUrlList landingPageUrlListItem) {
    if (this.landingPageUrlList == null) {
      this.landingPageUrlList = new ArrayList<SmartPlusAdCreateBodyLandingPageUrlList>();
    }
    this.landingPageUrlList.add(landingPageUrlListItem);
    return this;
  }

   /**
   * Get landingPageUrlList
   * @return landingPageUrlList
  **/
  @Schema(description = "")
  public List<SmartPlusAdCreateBodyLandingPageUrlList> getLandingPageUrlList() {
    return landingPageUrlList;
  }

  public void setLandingPageUrlList(List<SmartPlusAdCreateBodyLandingPageUrlList> landingPageUrlList) {
    this.landingPageUrlList = landingPageUrlList;
  }

  public SmartPlusAdUpdateBody pageList(List<SmartPlusAdCreateBodyPageList> pageList) {
    this.pageList = pageList;
    return this;
  }

  public SmartPlusAdUpdateBody addPageListItem(SmartPlusAdCreateBodyPageList pageListItem) {
    if (this.pageList == null) {
      this.pageList = new ArrayList<SmartPlusAdCreateBodyPageList>();
    }
    this.pageList.add(pageListItem);
    return this;
  }

   /**
   * Get pageList
   * @return pageList
  **/
  @Schema(description = "")
  public List<SmartPlusAdCreateBodyPageList> getPageList() {
    return pageList;
  }

  public void setPageList(List<SmartPlusAdCreateBodyPageList> pageList) {
    this.pageList = pageList;
  }

  public SmartPlusAdUpdateBody smartPlusAdId(String smartPlusAdId) {
    this.smartPlusAdId = smartPlusAdId;
    return this;
  }

   /**
   * Get smartPlusAdId
   * @return smartPlusAdId
  **/
  @Schema(required = true, description = "")
  public String getSmartPlusAdId() {
    return smartPlusAdId;
  }

  public void setSmartPlusAdId(String smartPlusAdId) {
    this.smartPlusAdId = smartPlusAdId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdUpdateBody smartPlusAdUpdateBody = (SmartPlusAdUpdateBody) o;
    return Objects.equals(this.adConfiguration, smartPlusAdUpdateBody.adConfiguration) &&
        Objects.equals(this.adName, smartPlusAdUpdateBody.adName) &&
        Objects.equals(this.adTextList, smartPlusAdUpdateBody.adTextList) &&
        Objects.equals(this.advertiserId, smartPlusAdUpdateBody.advertiserId) &&
        Objects.equals(this.callToActionList, smartPlusAdUpdateBody.callToActionList) &&
        Objects.equals(this.creativeList, smartPlusAdUpdateBody.creativeList) &&
        Objects.equals(this.deeplinkList, smartPlusAdUpdateBody.deeplinkList) &&
        Objects.equals(this.interactiveAddOnList, smartPlusAdUpdateBody.interactiveAddOnList) &&
        Objects.equals(this.landingPageUrlList, smartPlusAdUpdateBody.landingPageUrlList) &&
        Objects.equals(this.pageList, smartPlusAdUpdateBody.pageList) &&
        Objects.equals(this.smartPlusAdId, smartPlusAdUpdateBody.smartPlusAdId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adConfiguration, adName, adTextList, advertiserId, callToActionList, creativeList, deeplinkList, interactiveAddOnList, landingPageUrlList, pageList, smartPlusAdId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdUpdateBody {\n");
    
    sb.append("    adConfiguration: ").append(toIndentedString(adConfiguration)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    adTextList: ").append(toIndentedString(adTextList)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    callToActionList: ").append(toIndentedString(callToActionList)).append("\n");
    sb.append("    creativeList: ").append(toIndentedString(creativeList)).append("\n");
    sb.append("    deeplinkList: ").append(toIndentedString(deeplinkList)).append("\n");
    sb.append("    interactiveAddOnList: ").append(toIndentedString(interactiveAddOnList)).append("\n");
    sb.append("    landingPageUrlList: ").append(toIndentedString(landingPageUrlList)).append("\n");
    sb.append("    pageList: ").append(toIndentedString(pageList)).append("\n");
    sb.append("    smartPlusAdId: ").append(toIndentedString(smartPlusAdId)).append("\n");
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
