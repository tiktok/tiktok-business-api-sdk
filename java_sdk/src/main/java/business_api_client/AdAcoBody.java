/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdAcoBodyAvatarIconList;
import business_api_client.AdAcoBodyCallToActionList;
import business_api_client.AdAcoBodyCardList;
import business_api_client.AdAcoBodyCommonMaterial;
import business_api_client.AdAcoBodyDeeplinkList;
import business_api_client.AdAcoBodyDisplayNameList;
import business_api_client.AdAcoBodyLandingPageUrls;
import business_api_client.AdAcoBodyMediaInfoList;
import business_api_client.AdAcoBodyPageList;
import business_api_client.AdAcoBodyTitleList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * AdAcoBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class AdAcoBody {
  @JsonProperty("adgroup_id")
  private String adgroupId = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("avatar_icon_list")
  private List<AdAcoBodyAvatarIconList> avatarIconList = null;

  @JsonProperty("call_to_action_list")
  private List<AdAcoBodyCallToActionList> callToActionList = null;

  @JsonProperty("card_list")
  private List<AdAcoBodyCardList> cardList = null;

  @JsonProperty("common_material")
  private AdAcoBodyCommonMaterial commonMaterial = null;

  @JsonProperty("deeplink_list")
  private List<AdAcoBodyDeeplinkList> deeplinkList = null;

  @JsonProperty("display_name_list")
  private List<AdAcoBodyDisplayNameList> displayNameList = null;

  @JsonProperty("landing_page_urls")
  private List<AdAcoBodyLandingPageUrls> landingPageUrls = null;

  @JsonProperty("media_info_list")
  private List<AdAcoBodyMediaInfoList> mediaInfoList = null;

  @JsonProperty("page_list")
  private List<AdAcoBodyPageList> pageList = null;

  @JsonProperty("title_list")
  private List<AdAcoBodyTitleList> titleList = null;

  public AdAcoBody adgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Ad group ID. The ID should be of the ad group that you will enable Automated Creative Optimization for, and &#x60;creative_material_mode&#x60; for the ad group must be set as &#x60;DYNAMIC&#x60;.
   * @return adgroupId
  **/
  @Schema(description = "Ad group ID. The ID should be of the ad group that you will enable Automated Creative Optimization for, and `creative_material_mode` for the ad group must be set as `DYNAMIC`.")
  public String getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
  }

  public AdAcoBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID. 
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID. ")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public AdAcoBody avatarIconList(List<AdAcoBodyAvatarIconList> avatarIconList) {
    this.avatarIconList = avatarIconList;
    return this;
  }

  public AdAcoBody addAvatarIconListItem(AdAcoBodyAvatarIconList avatarIconListItem) {
    if (this.avatarIconList == null) {
      this.avatarIconList = new ArrayList<AdAcoBodyAvatarIconList>();
    }
    this.avatarIconList.add(avatarIconListItem);
    return this;
  }

   /**
   * Avatar image list.
   * @return avatarIconList
  **/
  @Schema(description = "Avatar image list.")
  public List<AdAcoBodyAvatarIconList> getAvatarIconList() {
    return avatarIconList;
  }

  public void setAvatarIconList(List<AdAcoBodyAvatarIconList> avatarIconList) {
    this.avatarIconList = avatarIconList;
  }

  public AdAcoBody callToActionList(List<AdAcoBodyCallToActionList> callToActionList) {
    this.callToActionList = callToActionList;
    return this;
  }

  public AdAcoBody addCallToActionListItem(AdAcoBodyCallToActionList callToActionListItem) {
    if (this.callToActionList == null) {
      this.callToActionList = new ArrayList<AdAcoBodyCallToActionList>();
    }
    this.callToActionList.add(callToActionListItem);
    return this;
  }

   /**
   * Call-to-action list. For TikTok ads, either this field or &#x60;call_to_action_id&#x60; must be specified. If both are specified, this field will be ignored.
   * @return callToActionList
  **/
  @Schema(description = "Call-to-action list. For TikTok ads, either this field or `call_to_action_id` must be specified. If both are specified, this field will be ignored.")
  public List<AdAcoBodyCallToActionList> getCallToActionList() {
    return callToActionList;
  }

  public void setCallToActionList(List<AdAcoBodyCallToActionList> callToActionList) {
    this.callToActionList = callToActionList;
  }

  public AdAcoBody cardList(List<AdAcoBodyCardList> cardList) {
    this.cardList = cardList;
    return this;
  }

  public AdAcoBody addCardListItem(AdAcoBodyCardList cardListItem) {
    if (this.cardList == null) {
      this.cardList = new ArrayList<AdAcoBodyCardList>();
    }
    this.cardList.add(cardListItem);
    return this;
  }

   /**
   * Card ID list. Length range- [0,1].
   * @return cardList
  **/
  @Schema(description = "Card ID list. Length range- [0,1].")
  public List<AdAcoBodyCardList> getCardList() {
    return cardList;
  }

  public void setCardList(List<AdAcoBodyCardList> cardList) {
    this.cardList = cardList;
  }

  public AdAcoBody commonMaterial(AdAcoBodyCommonMaterial commonMaterial) {
    this.commonMaterial = commonMaterial;
    return this;
  }

   /**
   * Get commonMaterial
   * @return commonMaterial
  **/
  @Schema(description = "")
  public AdAcoBodyCommonMaterial getCommonMaterial() {
    return commonMaterial;
  }

  public void setCommonMaterial(AdAcoBodyCommonMaterial commonMaterial) {
    this.commonMaterial = commonMaterial;
  }

  public AdAcoBody deeplinkList(List<AdAcoBodyDeeplinkList> deeplinkList) {
    this.deeplinkList = deeplinkList;
    return this;
  }

  public AdAcoBody addDeeplinkListItem(AdAcoBodyDeeplinkList deeplinkListItem) {
    if (this.deeplinkList == null) {
      this.deeplinkList = new ArrayList<AdAcoBodyDeeplinkList>();
    }
    this.deeplinkList.add(deeplinkListItem);
    return this;
  }

   /**
   * List of open URLs. Length range- [0,1]
   * @return deeplinkList
  **/
  @Schema(description = "List of open URLs. Length range- [0,1]")
  public List<AdAcoBodyDeeplinkList> getDeeplinkList() {
    return deeplinkList;
  }

  public void setDeeplinkList(List<AdAcoBodyDeeplinkList> deeplinkList) {
    this.deeplinkList = deeplinkList;
  }

  public AdAcoBody displayNameList(List<AdAcoBodyDisplayNameList> displayNameList) {
    this.displayNameList = displayNameList;
    return this;
  }

  public AdAcoBody addDisplayNameListItem(AdAcoBodyDisplayNameList displayNameListItem) {
    if (this.displayNameList == null) {
      this.displayNameList = new ArrayList<AdAcoBodyDisplayNameList>();
    }
    this.displayNameList.add(displayNameListItem);
    return this;
  }

   /**
   * Display names.
   * @return displayNameList
  **/
  @Schema(description = "Display names.")
  public List<AdAcoBodyDisplayNameList> getDisplayNameList() {
    return displayNameList;
  }

  public void setDisplayNameList(List<AdAcoBodyDisplayNameList> displayNameList) {
    this.displayNameList = displayNameList;
  }

  public AdAcoBody landingPageUrls(List<AdAcoBodyLandingPageUrls> landingPageUrls) {
    this.landingPageUrls = landingPageUrls;
    return this;
  }

  public AdAcoBody addLandingPageUrlsItem(AdAcoBodyLandingPageUrls landingPageUrlsItem) {
    if (this.landingPageUrls == null) {
      this.landingPageUrls = new ArrayList<AdAcoBodyLandingPageUrls>();
    }
    this.landingPageUrls.add(landingPageUrlsItem);
    return this;
  }

   /**
   * Multiple landing page URLs.
   * @return landingPageUrls
  **/
  @Schema(description = "Multiple landing page URLs.")
  public List<AdAcoBodyLandingPageUrls> getLandingPageUrls() {
    return landingPageUrls;
  }

  public void setLandingPageUrls(List<AdAcoBodyLandingPageUrls> landingPageUrls) {
    this.landingPageUrls = landingPageUrls;
  }

  public AdAcoBody mediaInfoList(List<AdAcoBodyMediaInfoList> mediaInfoList) {
    this.mediaInfoList = mediaInfoList;
    return this;
  }

  public AdAcoBody addMediaInfoListItem(AdAcoBodyMediaInfoList mediaInfoListItem) {
    if (this.mediaInfoList == null) {
      this.mediaInfoList = new ArrayList<AdAcoBodyMediaInfoList>();
    }
    this.mediaInfoList.add(mediaInfoListItem);
    return this;
  }

   /**
   * List of media information.
   * @return mediaInfoList
  **/
  @Schema(description = "List of media information.")
  public List<AdAcoBodyMediaInfoList> getMediaInfoList() {
    return mediaInfoList;
  }

  public void setMediaInfoList(List<AdAcoBodyMediaInfoList> mediaInfoList) {
    this.mediaInfoList = mediaInfoList;
  }

  public AdAcoBody pageList(List<AdAcoBodyPageList> pageList) {
    this.pageList = pageList;
    return this;
  }

  public AdAcoBody addPageListItem(AdAcoBodyPageList pageListItem) {
    if (this.pageList == null) {
      this.pageList = new ArrayList<AdAcoBodyPageList>();
    }
    this.pageList.add(pageListItem);
    return this;
  }

   /**
   * Page ID list.
   * @return pageList
  **/
  @Schema(description = "Page ID list.")
  public List<AdAcoBodyPageList> getPageList() {
    return pageList;
  }

  public void setPageList(List<AdAcoBodyPageList> pageList) {
    this.pageList = pageList;
  }

  public AdAcoBody titleList(List<AdAcoBodyTitleList> titleList) {
    this.titleList = titleList;
    return this;
  }

  public AdAcoBody addTitleListItem(AdAcoBodyTitleList titleListItem) {
    if (this.titleList == null) {
      this.titleList = new ArrayList<AdAcoBodyTitleList>();
    }
    this.titleList.add(titleListItem);
    return this;
  }

   /**
   * List of ad titles (also called ad texts). Ad titles are shown to your audience as part of your ad creative, to deliver the message you intend to communicate to them.
   * @return titleList
  **/
  @Schema(description = "List of ad titles (also called ad texts). Ad titles are shown to your audience as part of your ad creative, to deliver the message you intend to communicate to them.")
  public List<AdAcoBodyTitleList> getTitleList() {
    return titleList;
  }

  public void setTitleList(List<AdAcoBodyTitleList> titleList) {
    this.titleList = titleList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAcoBody adAcoBody = (AdAcoBody) o;
    return Objects.equals(this.adgroupId, adAcoBody.adgroupId) &&
        Objects.equals(this.advertiserId, adAcoBody.advertiserId) &&
        Objects.equals(this.avatarIconList, adAcoBody.avatarIconList) &&
        Objects.equals(this.callToActionList, adAcoBody.callToActionList) &&
        Objects.equals(this.cardList, adAcoBody.cardList) &&
        Objects.equals(this.commonMaterial, adAcoBody.commonMaterial) &&
        Objects.equals(this.deeplinkList, adAcoBody.deeplinkList) &&
        Objects.equals(this.displayNameList, adAcoBody.displayNameList) &&
        Objects.equals(this.landingPageUrls, adAcoBody.landingPageUrls) &&
        Objects.equals(this.mediaInfoList, adAcoBody.mediaInfoList) &&
        Objects.equals(this.pageList, adAcoBody.pageList) &&
        Objects.equals(this.titleList, adAcoBody.titleList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, advertiserId, avatarIconList, callToActionList, cardList, commonMaterial, deeplinkList, displayNameList, landingPageUrls, mediaInfoList, pageList, titleList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBody {\n");
    
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    avatarIconList: ").append(toIndentedString(avatarIconList)).append("\n");
    sb.append("    callToActionList: ").append(toIndentedString(callToActionList)).append("\n");
    sb.append("    cardList: ").append(toIndentedString(cardList)).append("\n");
    sb.append("    commonMaterial: ").append(toIndentedString(commonMaterial)).append("\n");
    sb.append("    deeplinkList: ").append(toIndentedString(deeplinkList)).append("\n");
    sb.append("    displayNameList: ").append(toIndentedString(displayNameList)).append("\n");
    sb.append("    landingPageUrls: ").append(toIndentedString(landingPageUrls)).append("\n");
    sb.append("    mediaInfoList: ").append(toIndentedString(mediaInfoList)).append("\n");
    sb.append("    pageList: ").append(toIndentedString(pageList)).append("\n");
    sb.append("    titleList: ").append(toIndentedString(titleList)).append("\n");
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
