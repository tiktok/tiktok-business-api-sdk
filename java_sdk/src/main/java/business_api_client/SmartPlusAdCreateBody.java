/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.SmartPlusAdCreateBodyAdConfiguration;
import business_api_client.SmartPlusAdCreateBodyAdTextList;
import business_api_client.SmartPlusAdCreateBodyAutoMessageList;
import business_api_client.SmartPlusAdCreateBodyCallToActionList;
import business_api_client.SmartPlusAdCreateBodyCreativeList;
import business_api_client.SmartPlusAdCreateBodyDeeplinkList;
import business_api_client.SmartPlusAdCreateBodyInteractiveAddOnList;
import business_api_client.SmartPlusAdCreateBodyLandingPageUrlList;
import business_api_client.SmartPlusAdCreateBodyPageList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SmartPlusAdCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class SmartPlusAdCreateBody {
  @JsonProperty("ad_configuration")
  private SmartPlusAdCreateBodyAdConfiguration adConfiguration = null;

  @JsonProperty("ad_name")
  private String adName = null;

  @JsonProperty("ad_text_list")
  private List<SmartPlusAdCreateBodyAdTextList> adTextList = null;

  @JsonProperty("adgroup_id")
  private String adgroupId = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("auto_message_list")
  private List<SmartPlusAdCreateBodyAutoMessageList> autoMessageList = null;

  @JsonProperty("call_to_action_list")
  private List<SmartPlusAdCreateBodyCallToActionList> callToActionList = null;

  @JsonProperty("creative_list")
  private List<SmartPlusAdCreateBodyCreativeList> creativeList = null;

  @JsonProperty("deeplink_list")
  private List<SmartPlusAdCreateBodyDeeplinkList> deeplinkList = null;

  @JsonProperty("interactive_add_on_list")
  private List<SmartPlusAdCreateBodyInteractiveAddOnList> interactiveAddOnList = null;

  @JsonProperty("landing_page_url_list")
  private List<SmartPlusAdCreateBodyLandingPageUrlList> landingPageUrlList = null;

  @JsonProperty("operation_status")
  private String operationStatus = "ENABLE";

  @JsonProperty("page_list")
  private List<SmartPlusAdCreateBodyPageList> pageList = null;

  public SmartPlusAdCreateBody adConfiguration(SmartPlusAdCreateBodyAdConfiguration adConfiguration) {
    this.adConfiguration = adConfiguration;
    return this;
  }

   /**
   * Get adConfiguration
   * @return adConfiguration
  **/
  @Schema(description = "")
  public SmartPlusAdCreateBodyAdConfiguration getAdConfiguration() {
    return adConfiguration;
  }

  public void setAdConfiguration(SmartPlusAdCreateBodyAdConfiguration adConfiguration) {
    this.adConfiguration = adConfiguration;
  }

  public SmartPlusAdCreateBody adName(String adName) {
    this.adName = adName;
    return this;
  }

   /**
   * Get adName
   * @return adName
  **/
  @Schema(required = true, description = "")
  public String getAdName() {
    return adName;
  }

  public void setAdName(String adName) {
    this.adName = adName;
  }

  public SmartPlusAdCreateBody adTextList(List<SmartPlusAdCreateBodyAdTextList> adTextList) {
    this.adTextList = adTextList;
    return this;
  }

  public SmartPlusAdCreateBody addAdTextListItem(SmartPlusAdCreateBodyAdTextList adTextListItem) {
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

  public SmartPlusAdCreateBody adgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @Schema(required = true, description = "")
  public String getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
  }

  public SmartPlusAdCreateBody advertiserId(String advertiserId) {
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

  public SmartPlusAdCreateBody autoMessageList(List<SmartPlusAdCreateBodyAutoMessageList> autoMessageList) {
    this.autoMessageList = autoMessageList;
    return this;
  }

  public SmartPlusAdCreateBody addAutoMessageListItem(SmartPlusAdCreateBodyAutoMessageList autoMessageListItem) {
    if (this.autoMessageList == null) {
      this.autoMessageList = new ArrayList<SmartPlusAdCreateBodyAutoMessageList>();
    }
    this.autoMessageList.add(autoMessageListItem);
    return this;
  }

   /**
   * Get autoMessageList
   * @return autoMessageList
  **/
  @Schema(description = "")
  public List<SmartPlusAdCreateBodyAutoMessageList> getAutoMessageList() {
    return autoMessageList;
  }

  public void setAutoMessageList(List<SmartPlusAdCreateBodyAutoMessageList> autoMessageList) {
    this.autoMessageList = autoMessageList;
  }

  public SmartPlusAdCreateBody callToActionList(List<SmartPlusAdCreateBodyCallToActionList> callToActionList) {
    this.callToActionList = callToActionList;
    return this;
  }

  public SmartPlusAdCreateBody addCallToActionListItem(SmartPlusAdCreateBodyCallToActionList callToActionListItem) {
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

  public SmartPlusAdCreateBody creativeList(List<SmartPlusAdCreateBodyCreativeList> creativeList) {
    this.creativeList = creativeList;
    return this;
  }

  public SmartPlusAdCreateBody addCreativeListItem(SmartPlusAdCreateBodyCreativeList creativeListItem) {
    if (this.creativeList == null) {
      this.creativeList = new ArrayList<SmartPlusAdCreateBodyCreativeList>();
    }
    this.creativeList.add(creativeListItem);
    return this;
  }

   /**
   * Get creativeList
   * @return creativeList
  **/
  @Schema(description = "")
  public List<SmartPlusAdCreateBodyCreativeList> getCreativeList() {
    return creativeList;
  }

  public void setCreativeList(List<SmartPlusAdCreateBodyCreativeList> creativeList) {
    this.creativeList = creativeList;
  }

  public SmartPlusAdCreateBody deeplinkList(List<SmartPlusAdCreateBodyDeeplinkList> deeplinkList) {
    this.deeplinkList = deeplinkList;
    return this;
  }

  public SmartPlusAdCreateBody addDeeplinkListItem(SmartPlusAdCreateBodyDeeplinkList deeplinkListItem) {
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

  public SmartPlusAdCreateBody interactiveAddOnList(List<SmartPlusAdCreateBodyInteractiveAddOnList> interactiveAddOnList) {
    this.interactiveAddOnList = interactiveAddOnList;
    return this;
  }

  public SmartPlusAdCreateBody addInteractiveAddOnListItem(SmartPlusAdCreateBodyInteractiveAddOnList interactiveAddOnListItem) {
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

  public SmartPlusAdCreateBody landingPageUrlList(List<SmartPlusAdCreateBodyLandingPageUrlList> landingPageUrlList) {
    this.landingPageUrlList = landingPageUrlList;
    return this;
  }

  public SmartPlusAdCreateBody addLandingPageUrlListItem(SmartPlusAdCreateBodyLandingPageUrlList landingPageUrlListItem) {
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

  public SmartPlusAdCreateBody operationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
    return this;
  }

   /**
   * Get operationStatus
   * @return operationStatus
  **/
  @Schema(description = "")
  public String getOperationStatus() {
    return operationStatus;
  }

  public void setOperationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
  }

  public SmartPlusAdCreateBody pageList(List<SmartPlusAdCreateBodyPageList> pageList) {
    this.pageList = pageList;
    return this;
  }

  public SmartPlusAdCreateBody addPageListItem(SmartPlusAdCreateBodyPageList pageListItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdCreateBody smartPlusAdCreateBody = (SmartPlusAdCreateBody) o;
    return Objects.equals(this.adConfiguration, smartPlusAdCreateBody.adConfiguration) &&
        Objects.equals(this.adName, smartPlusAdCreateBody.adName) &&
        Objects.equals(this.adTextList, smartPlusAdCreateBody.adTextList) &&
        Objects.equals(this.adgroupId, smartPlusAdCreateBody.adgroupId) &&
        Objects.equals(this.advertiserId, smartPlusAdCreateBody.advertiserId) &&
        Objects.equals(this.autoMessageList, smartPlusAdCreateBody.autoMessageList) &&
        Objects.equals(this.callToActionList, smartPlusAdCreateBody.callToActionList) &&
        Objects.equals(this.creativeList, smartPlusAdCreateBody.creativeList) &&
        Objects.equals(this.deeplinkList, smartPlusAdCreateBody.deeplinkList) &&
        Objects.equals(this.interactiveAddOnList, smartPlusAdCreateBody.interactiveAddOnList) &&
        Objects.equals(this.landingPageUrlList, smartPlusAdCreateBody.landingPageUrlList) &&
        Objects.equals(this.operationStatus, smartPlusAdCreateBody.operationStatus) &&
        Objects.equals(this.pageList, smartPlusAdCreateBody.pageList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adConfiguration, adName, adTextList, adgroupId, advertiserId, autoMessageList, callToActionList, creativeList, deeplinkList, interactiveAddOnList, landingPageUrlList, operationStatus, pageList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdCreateBody {\n");
    
    sb.append("    adConfiguration: ").append(toIndentedString(adConfiguration)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    adTextList: ").append(toIndentedString(adTextList)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    autoMessageList: ").append(toIndentedString(autoMessageList)).append("\n");
    sb.append("    callToActionList: ").append(toIndentedString(callToActionList)).append("\n");
    sb.append("    creativeList: ").append(toIndentedString(creativeList)).append("\n");
    sb.append("    deeplinkList: ").append(toIndentedString(deeplinkList)).append("\n");
    sb.append("    interactiveAddOnList: ").append(toIndentedString(interactiveAddOnList)).append("\n");
    sb.append("    landingPageUrlList: ").append(toIndentedString(landingPageUrlList)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    pageList: ").append(toIndentedString(pageList)).append("\n");
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
