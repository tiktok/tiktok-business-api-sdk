/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdcreateDeeplinkUtmParams;
import business_api_client.AdcreateDisclaimerClickableTexts;
import business_api_client.AdcreateDisclaimerText;
import business_api_client.AdcreateUtmParams;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * AdupdateCreatives
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class AdupdateCreatives {
  @JsonProperty("ad_format")
  private String adFormat = null;

  @JsonProperty("ad_id")
  private String adId = null;

  @JsonProperty("ad_name")
  private String adName = null;

  @JsonProperty("ad_text")
  private String adText = null;

  @JsonProperty("ad_texts")
  private List<String> adTexts = null;

  @JsonProperty("aigc_disclosure_type")
  private String aigcDisclosureType = "NOT_DECLARED";

  @JsonProperty("app_name")
  private String appName = null;

  @JsonProperty("avatar_icon_web_uri")
  private String avatarIconWebUri = null;

  @JsonProperty("brand_safety_postbid_partner")
  private String brandSafetyPostbidPartner = null;

  @JsonProperty("brand_safety_vast_url")
  private String brandSafetyVastUrl = null;

  @JsonProperty("call_to_action")
  private String callToAction = null;

  @JsonProperty("call_to_action_id")
  private String callToActionId = null;

  @JsonProperty("card_id")
  private String cardId = null;

  @JsonProperty("carousel_image_index")
  private Integer carouselImageIndex = null;

  @JsonProperty("click_tracking_url")
  private String clickTrackingUrl = null;

  @JsonProperty("cpp_url")
  private String cppUrl = null;

  @JsonProperty("creative_authorized")
  private Boolean creativeAuthorized = false;

  @JsonProperty("creative_type")
  private String creativeType = null;

  @JsonProperty("dark_post_status")
  private String darkPostStatus = null;

  @JsonProperty("deeplink")
  private String deeplink = null;

  @JsonProperty("deeplink_type")
  private String deeplinkType = "NORMAL";

  @JsonProperty("deeplink_utm_params")
  private List<AdcreateDeeplinkUtmParams> deeplinkUtmParams = null;

  @JsonProperty("disclaimer_clickable_texts")
  private List<AdcreateDisclaimerClickableTexts> disclaimerClickableTexts = null;

  @JsonProperty("disclaimer_text")
  private AdcreateDisclaimerText disclaimerText = null;

  @JsonProperty("disclaimer_type")
  private String disclaimerType = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("dynamic_destination")
  private String dynamicDestination = null;

  @JsonProperty("dynamic_format")
  private String dynamicFormat = null;

  @JsonProperty("end_card_cta")
  private String endCardCta = null;

  @JsonProperty("fallback_type")
  private String fallbackType = null;

  @JsonProperty("identity_authorized_bc_id")
  private String identityAuthorizedBcId = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("image_ids")
  private List<String> imageIds = null;

  @JsonProperty("impression_tracking_url")
  private String impressionTrackingUrl = null;

  @JsonProperty("instant_product_page_used")
  private Boolean instantProductPageUsed = null;

  @JsonProperty("item_duet_status")
  private String itemDuetStatus = null;

  @JsonProperty("item_group_ids")
  private List<String> itemGroupIds = null;

  @JsonProperty("item_stitch_status")
  private String itemStitchStatus = null;

  @JsonProperty("landing_page_url")
  private String landingPageUrl = null;

  @JsonProperty("music_id")
  private String musicId = null;

  @JsonProperty("page_id")
  private Long pageId = null;

  @JsonProperty("page_image_index")
  private Integer pageImageIndex = null;

  @JsonProperty("playable_url")
  private String playableUrl = null;

  @JsonProperty("product_set_id")
  private String productSetId = null;

  @JsonProperty("product_specific_type")
  private String productSpecificType = null;

  @JsonProperty("promotional_music_disabled")
  private Boolean promotionalMusicDisabled = true;

  @JsonProperty("shopping_ads_deeplink_type")
  private String shoppingAdsDeeplinkType = null;

  @JsonProperty("shopping_ads_fallback_type")
  private String shoppingAdsFallbackType = null;

  @JsonProperty("shopping_ads_video_package_id")
  private String shoppingAdsVideoPackageId = null;

  @JsonProperty("sku_ids")
  private List<String> skuIds = null;

  @JsonProperty("tiktok_item_id")
  private String tiktokItemId = null;

  @JsonProperty("tracking_app_id")
  private String trackingAppId = null;

  @JsonProperty("tracking_offline_event_set_ids")
  private List<String> trackingOfflineEventSetIds = null;

  @JsonProperty("tracking_pixel_id")
  private Long trackingPixelId = null;

  @JsonProperty("utm_params")
  private List<AdcreateUtmParams> utmParams = null;

  @JsonProperty("vast_moat_enabled")
  private Boolean vastMoatEnabled = false;

  @JsonProperty("vertical_video_strategy")
  private String verticalVideoStrategy = null;

  @JsonProperty("video_id")
  private String videoId = null;

  @JsonProperty("video_view_tracking_url")
  private String videoViewTrackingUrl = null;

  @JsonProperty("viewability_postbid_partner")
  private String viewabilityPostbidPartner = null;

  @JsonProperty("viewability_vast_url")
  private String viewabilityVastUrl = null;

  public AdupdateCreatives adFormat(String adFormat) {
    this.adFormat = adFormat;
    return this;
  }

   /**
   * Get adFormat
   * @return adFormat
  **/
  @Schema(description = "")
  public String getAdFormat() {
    return adFormat;
  }

  public void setAdFormat(String adFormat) {
    this.adFormat = adFormat;
  }

  public AdupdateCreatives adId(String adId) {
    this.adId = adId;
    return this;
  }

   /**
   * Get adId
   * @return adId
  **/
  @Schema(description = "")
  public String getAdId() {
    return adId;
  }

  public void setAdId(String adId) {
    this.adId = adId;
  }

  public AdupdateCreatives adName(String adName) {
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

  public AdupdateCreatives adText(String adText) {
    this.adText = adText;
    return this;
  }

   /**
   * Get adText
   * @return adText
  **/
  @Schema(description = "")
  public String getAdText() {
    return adText;
  }

  public void setAdText(String adText) {
    this.adText = adText;
  }

  public AdupdateCreatives adTexts(List<String> adTexts) {
    this.adTexts = adTexts;
    return this;
  }

  public AdupdateCreatives addAdTextsItem(String adTextsItem) {
    if (this.adTexts == null) {
      this.adTexts = new ArrayList<String>();
    }
    this.adTexts.add(adTextsItem);
    return this;
  }

   /**
   * Get adTexts
   * @return adTexts
  **/
  @Schema(description = "")
  public List<String> getAdTexts() {
    return adTexts;
  }

  public void setAdTexts(List<String> adTexts) {
    this.adTexts = adTexts;
  }

  public AdupdateCreatives aigcDisclosureType(String aigcDisclosureType) {
    this.aigcDisclosureType = aigcDisclosureType;
    return this;
  }

   /**
   * Get aigcDisclosureType
   * @return aigcDisclosureType
  **/
  @Schema(description = "")
  public String getAigcDisclosureType() {
    return aigcDisclosureType;
  }

  public void setAigcDisclosureType(String aigcDisclosureType) {
    this.aigcDisclosureType = aigcDisclosureType;
  }

  public AdupdateCreatives appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  @Schema(description = "")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public AdupdateCreatives avatarIconWebUri(String avatarIconWebUri) {
    this.avatarIconWebUri = avatarIconWebUri;
    return this;
  }

   /**
   * Get avatarIconWebUri
   * @return avatarIconWebUri
  **/
  @Schema(description = "")
  public String getAvatarIconWebUri() {
    return avatarIconWebUri;
  }

  public void setAvatarIconWebUri(String avatarIconWebUri) {
    this.avatarIconWebUri = avatarIconWebUri;
  }

  public AdupdateCreatives brandSafetyPostbidPartner(String brandSafetyPostbidPartner) {
    this.brandSafetyPostbidPartner = brandSafetyPostbidPartner;
    return this;
  }

   /**
   * Get brandSafetyPostbidPartner
   * @return brandSafetyPostbidPartner
  **/
  @Schema(description = "")
  public String getBrandSafetyPostbidPartner() {
    return brandSafetyPostbidPartner;
  }

  public void setBrandSafetyPostbidPartner(String brandSafetyPostbidPartner) {
    this.brandSafetyPostbidPartner = brandSafetyPostbidPartner;
  }

  public AdupdateCreatives brandSafetyVastUrl(String brandSafetyVastUrl) {
    this.brandSafetyVastUrl = brandSafetyVastUrl;
    return this;
  }

   /**
   * Get brandSafetyVastUrl
   * @return brandSafetyVastUrl
  **/
  @Schema(description = "")
  public String getBrandSafetyVastUrl() {
    return brandSafetyVastUrl;
  }

  public void setBrandSafetyVastUrl(String brandSafetyVastUrl) {
    this.brandSafetyVastUrl = brandSafetyVastUrl;
  }

  public AdupdateCreatives callToAction(String callToAction) {
    this.callToAction = callToAction;
    return this;
  }

   /**
   * Get callToAction
   * @return callToAction
  **/
  @Schema(description = "")
  public String getCallToAction() {
    return callToAction;
  }

  public void setCallToAction(String callToAction) {
    this.callToAction = callToAction;
  }

  public AdupdateCreatives callToActionId(String callToActionId) {
    this.callToActionId = callToActionId;
    return this;
  }

   /**
   * Get callToActionId
   * @return callToActionId
  **/
  @Schema(description = "")
  public String getCallToActionId() {
    return callToActionId;
  }

  public void setCallToActionId(String callToActionId) {
    this.callToActionId = callToActionId;
  }

  public AdupdateCreatives cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Get cardId
   * @return cardId
  **/
  @Schema(description = "")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public AdupdateCreatives carouselImageIndex(Integer carouselImageIndex) {
    this.carouselImageIndex = carouselImageIndex;
    return this;
  }

   /**
   * Get carouselImageIndex
   * @return carouselImageIndex
  **/
  @Schema(description = "")
  public Integer getCarouselImageIndex() {
    return carouselImageIndex;
  }

  public void setCarouselImageIndex(Integer carouselImageIndex) {
    this.carouselImageIndex = carouselImageIndex;
  }

  public AdupdateCreatives clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

   /**
   * Get clickTrackingUrl
   * @return clickTrackingUrl
  **/
  @Schema(description = "")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public AdupdateCreatives cppUrl(String cppUrl) {
    this.cppUrl = cppUrl;
    return this;
  }

   /**
   * Get cppUrl
   * @return cppUrl
  **/
  @Schema(description = "")
  public String getCppUrl() {
    return cppUrl;
  }

  public void setCppUrl(String cppUrl) {
    this.cppUrl = cppUrl;
  }

  public AdupdateCreatives creativeAuthorized(Boolean creativeAuthorized) {
    this.creativeAuthorized = creativeAuthorized;
    return this;
  }

   /**
   * Get creativeAuthorized
   * @return creativeAuthorized
  **/
  @Schema(description = "")
  public Boolean isCreativeAuthorized() {
    return creativeAuthorized;
  }

  public void setCreativeAuthorized(Boolean creativeAuthorized) {
    this.creativeAuthorized = creativeAuthorized;
  }

  public AdupdateCreatives creativeType(String creativeType) {
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Get creativeType
   * @return creativeType
  **/
  @Schema(description = "")
  public String getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(String creativeType) {
    this.creativeType = creativeType;
  }

  public AdupdateCreatives darkPostStatus(String darkPostStatus) {
    this.darkPostStatus = darkPostStatus;
    return this;
  }

   /**
   * Get darkPostStatus
   * @return darkPostStatus
  **/
  @Schema(description = "")
  public String getDarkPostStatus() {
    return darkPostStatus;
  }

  public void setDarkPostStatus(String darkPostStatus) {
    this.darkPostStatus = darkPostStatus;
  }

  public AdupdateCreatives deeplink(String deeplink) {
    this.deeplink = deeplink;
    return this;
  }

   /**
   * Get deeplink
   * @return deeplink
  **/
  @Schema(description = "")
  public String getDeeplink() {
    return deeplink;
  }

  public void setDeeplink(String deeplink) {
    this.deeplink = deeplink;
  }

  public AdupdateCreatives deeplinkType(String deeplinkType) {
    this.deeplinkType = deeplinkType;
    return this;
  }

   /**
   * Get deeplinkType
   * @return deeplinkType
  **/
  @Schema(description = "")
  public String getDeeplinkType() {
    return deeplinkType;
  }

  public void setDeeplinkType(String deeplinkType) {
    this.deeplinkType = deeplinkType;
  }

  public AdupdateCreatives deeplinkUtmParams(List<AdcreateDeeplinkUtmParams> deeplinkUtmParams) {
    this.deeplinkUtmParams = deeplinkUtmParams;
    return this;
  }

  public AdupdateCreatives addDeeplinkUtmParamsItem(AdcreateDeeplinkUtmParams deeplinkUtmParamsItem) {
    if (this.deeplinkUtmParams == null) {
      this.deeplinkUtmParams = new ArrayList<AdcreateDeeplinkUtmParams>();
    }
    this.deeplinkUtmParams.add(deeplinkUtmParamsItem);
    return this;
  }

   /**
   * Get deeplinkUtmParams
   * @return deeplinkUtmParams
  **/
  @Schema(description = "")
  public List<AdcreateDeeplinkUtmParams> getDeeplinkUtmParams() {
    return deeplinkUtmParams;
  }

  public void setDeeplinkUtmParams(List<AdcreateDeeplinkUtmParams> deeplinkUtmParams) {
    this.deeplinkUtmParams = deeplinkUtmParams;
  }

  public AdupdateCreatives disclaimerClickableTexts(List<AdcreateDisclaimerClickableTexts> disclaimerClickableTexts) {
    this.disclaimerClickableTexts = disclaimerClickableTexts;
    return this;
  }

  public AdupdateCreatives addDisclaimerClickableTextsItem(AdcreateDisclaimerClickableTexts disclaimerClickableTextsItem) {
    if (this.disclaimerClickableTexts == null) {
      this.disclaimerClickableTexts = new ArrayList<AdcreateDisclaimerClickableTexts>();
    }
    this.disclaimerClickableTexts.add(disclaimerClickableTextsItem);
    return this;
  }

   /**
   * Get disclaimerClickableTexts
   * @return disclaimerClickableTexts
  **/
  @Schema(description = "")
  public List<AdcreateDisclaimerClickableTexts> getDisclaimerClickableTexts() {
    return disclaimerClickableTexts;
  }

  public void setDisclaimerClickableTexts(List<AdcreateDisclaimerClickableTexts> disclaimerClickableTexts) {
    this.disclaimerClickableTexts = disclaimerClickableTexts;
  }

  public AdupdateCreatives disclaimerText(AdcreateDisclaimerText disclaimerText) {
    this.disclaimerText = disclaimerText;
    return this;
  }

   /**
   * Get disclaimerText
   * @return disclaimerText
  **/
  @Schema(description = "")
  public AdcreateDisclaimerText getDisclaimerText() {
    return disclaimerText;
  }

  public void setDisclaimerText(AdcreateDisclaimerText disclaimerText) {
    this.disclaimerText = disclaimerText;
  }

  public AdupdateCreatives disclaimerType(String disclaimerType) {
    this.disclaimerType = disclaimerType;
    return this;
  }

   /**
   * Get disclaimerType
   * @return disclaimerType
  **/
  @Schema(description = "")
  public String getDisclaimerType() {
    return disclaimerType;
  }

  public void setDisclaimerType(String disclaimerType) {
    this.disclaimerType = disclaimerType;
  }

  public AdupdateCreatives displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AdupdateCreatives dynamicDestination(String dynamicDestination) {
    this.dynamicDestination = dynamicDestination;
    return this;
  }

   /**
   * Get dynamicDestination
   * @return dynamicDestination
  **/
  @Schema(description = "")
  public String getDynamicDestination() {
    return dynamicDestination;
  }

  public void setDynamicDestination(String dynamicDestination) {
    this.dynamicDestination = dynamicDestination;
  }

  public AdupdateCreatives dynamicFormat(String dynamicFormat) {
    this.dynamicFormat = dynamicFormat;
    return this;
  }

   /**
   * Get dynamicFormat
   * @return dynamicFormat
  **/
  @Schema(description = "")
  public String getDynamicFormat() {
    return dynamicFormat;
  }

  public void setDynamicFormat(String dynamicFormat) {
    this.dynamicFormat = dynamicFormat;
  }

  public AdupdateCreatives endCardCta(String endCardCta) {
    this.endCardCta = endCardCta;
    return this;
  }

   /**
   * Get endCardCta
   * @return endCardCta
  **/
  @Schema(description = "")
  public String getEndCardCta() {
    return endCardCta;
  }

  public void setEndCardCta(String endCardCta) {
    this.endCardCta = endCardCta;
  }

  public AdupdateCreatives fallbackType(String fallbackType) {
    this.fallbackType = fallbackType;
    return this;
  }

   /**
   * Get fallbackType
   * @return fallbackType
  **/
  @Schema(description = "")
  public String getFallbackType() {
    return fallbackType;
  }

  public void setFallbackType(String fallbackType) {
    this.fallbackType = fallbackType;
  }

  public AdupdateCreatives identityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
    return this;
  }

   /**
   * Get identityAuthorizedBcId
   * @return identityAuthorizedBcId
  **/
  @Schema(description = "")
  public String getIdentityAuthorizedBcId() {
    return identityAuthorizedBcId;
  }

  public void setIdentityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
  }

  public AdupdateCreatives identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Get identityId
   * @return identityId
  **/
  @Schema(description = "")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public AdupdateCreatives identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Get identityType
   * @return identityType
  **/
  @Schema(description = "")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public AdupdateCreatives imageIds(List<String> imageIds) {
    this.imageIds = imageIds;
    return this;
  }

  public AdupdateCreatives addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<String>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * Get imageIds
   * @return imageIds
  **/
  @Schema(description = "")
  public List<String> getImageIds() {
    return imageIds;
  }

  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }

  public AdupdateCreatives impressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
    return this;
  }

   /**
   * Get impressionTrackingUrl
   * @return impressionTrackingUrl
  **/
  @Schema(description = "")
  public String getImpressionTrackingUrl() {
    return impressionTrackingUrl;
  }

  public void setImpressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
  }

  public AdupdateCreatives instantProductPageUsed(Boolean instantProductPageUsed) {
    this.instantProductPageUsed = instantProductPageUsed;
    return this;
  }

   /**
   * Get instantProductPageUsed
   * @return instantProductPageUsed
  **/
  @Schema(description = "")
  public Boolean isInstantProductPageUsed() {
    return instantProductPageUsed;
  }

  public void setInstantProductPageUsed(Boolean instantProductPageUsed) {
    this.instantProductPageUsed = instantProductPageUsed;
  }

  public AdupdateCreatives itemDuetStatus(String itemDuetStatus) {
    this.itemDuetStatus = itemDuetStatus;
    return this;
  }

   /**
   * Get itemDuetStatus
   * @return itemDuetStatus
  **/
  @Schema(description = "")
  public String getItemDuetStatus() {
    return itemDuetStatus;
  }

  public void setItemDuetStatus(String itemDuetStatus) {
    this.itemDuetStatus = itemDuetStatus;
  }

  public AdupdateCreatives itemGroupIds(List<String> itemGroupIds) {
    this.itemGroupIds = itemGroupIds;
    return this;
  }

  public AdupdateCreatives addItemGroupIdsItem(String itemGroupIdsItem) {
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

  public AdupdateCreatives itemStitchStatus(String itemStitchStatus) {
    this.itemStitchStatus = itemStitchStatus;
    return this;
  }

   /**
   * Get itemStitchStatus
   * @return itemStitchStatus
  **/
  @Schema(description = "")
  public String getItemStitchStatus() {
    return itemStitchStatus;
  }

  public void setItemStitchStatus(String itemStitchStatus) {
    this.itemStitchStatus = itemStitchStatus;
  }

  public AdupdateCreatives landingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
    return this;
  }

   /**
   * Get landingPageUrl
   * @return landingPageUrl
  **/
  @Schema(description = "")
  public String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  public AdupdateCreatives musicId(String musicId) {
    this.musicId = musicId;
    return this;
  }

   /**
   * Get musicId
   * @return musicId
  **/
  @Schema(description = "")
  public String getMusicId() {
    return musicId;
  }

  public void setMusicId(String musicId) {
    this.musicId = musicId;
  }

  public AdupdateCreatives pageId(Long pageId) {
    this.pageId = pageId;
    return this;
  }

   /**
   * Get pageId
   * @return pageId
  **/
  @Schema(description = "")
  public Long getPageId() {
    return pageId;
  }

  public void setPageId(Long pageId) {
    this.pageId = pageId;
  }

  public AdupdateCreatives pageImageIndex(Integer pageImageIndex) {
    this.pageImageIndex = pageImageIndex;
    return this;
  }

   /**
   * Get pageImageIndex
   * @return pageImageIndex
  **/
  @Schema(description = "")
  public Integer getPageImageIndex() {
    return pageImageIndex;
  }

  public void setPageImageIndex(Integer pageImageIndex) {
    this.pageImageIndex = pageImageIndex;
  }

  public AdupdateCreatives playableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * Get playableUrl
   * @return playableUrl
  **/
  @Schema(description = "")
  public String getPlayableUrl() {
    return playableUrl;
  }

  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }

  public AdupdateCreatives productSetId(String productSetId) {
    this.productSetId = productSetId;
    return this;
  }

   /**
   * Get productSetId
   * @return productSetId
  **/
  @Schema(description = "")
  public String getProductSetId() {
    return productSetId;
  }

  public void setProductSetId(String productSetId) {
    this.productSetId = productSetId;
  }

  public AdupdateCreatives productSpecificType(String productSpecificType) {
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

  public AdupdateCreatives promotionalMusicDisabled(Boolean promotionalMusicDisabled) {
    this.promotionalMusicDisabled = promotionalMusicDisabled;
    return this;
  }

   /**
   * Get promotionalMusicDisabled
   * @return promotionalMusicDisabled
  **/
  @Schema(description = "")
  public Boolean isPromotionalMusicDisabled() {
    return promotionalMusicDisabled;
  }

  public void setPromotionalMusicDisabled(Boolean promotionalMusicDisabled) {
    this.promotionalMusicDisabled = promotionalMusicDisabled;
  }

  public AdupdateCreatives shoppingAdsDeeplinkType(String shoppingAdsDeeplinkType) {
    this.shoppingAdsDeeplinkType = shoppingAdsDeeplinkType;
    return this;
  }

   /**
   * Get shoppingAdsDeeplinkType
   * @return shoppingAdsDeeplinkType
  **/
  @Schema(description = "")
  public String getShoppingAdsDeeplinkType() {
    return shoppingAdsDeeplinkType;
  }

  public void setShoppingAdsDeeplinkType(String shoppingAdsDeeplinkType) {
    this.shoppingAdsDeeplinkType = shoppingAdsDeeplinkType;
  }

  public AdupdateCreatives shoppingAdsFallbackType(String shoppingAdsFallbackType) {
    this.shoppingAdsFallbackType = shoppingAdsFallbackType;
    return this;
  }

   /**
   * Get shoppingAdsFallbackType
   * @return shoppingAdsFallbackType
  **/
  @Schema(description = "")
  public String getShoppingAdsFallbackType() {
    return shoppingAdsFallbackType;
  }

  public void setShoppingAdsFallbackType(String shoppingAdsFallbackType) {
    this.shoppingAdsFallbackType = shoppingAdsFallbackType;
  }

  public AdupdateCreatives shoppingAdsVideoPackageId(String shoppingAdsVideoPackageId) {
    this.shoppingAdsVideoPackageId = shoppingAdsVideoPackageId;
    return this;
  }

   /**
   * Get shoppingAdsVideoPackageId
   * @return shoppingAdsVideoPackageId
  **/
  @Schema(description = "")
  public String getShoppingAdsVideoPackageId() {
    return shoppingAdsVideoPackageId;
  }

  public void setShoppingAdsVideoPackageId(String shoppingAdsVideoPackageId) {
    this.shoppingAdsVideoPackageId = shoppingAdsVideoPackageId;
  }

  public AdupdateCreatives skuIds(List<String> skuIds) {
    this.skuIds = skuIds;
    return this;
  }

  public AdupdateCreatives addSkuIdsItem(String skuIdsItem) {
    if (this.skuIds == null) {
      this.skuIds = new ArrayList<String>();
    }
    this.skuIds.add(skuIdsItem);
    return this;
  }

   /**
   * Get skuIds
   * @return skuIds
  **/
  @Schema(description = "")
  public List<String> getSkuIds() {
    return skuIds;
  }

  public void setSkuIds(List<String> skuIds) {
    this.skuIds = skuIds;
  }

  public AdupdateCreatives tiktokItemId(String tiktokItemId) {
    this.tiktokItemId = tiktokItemId;
    return this;
  }

   /**
   * Get tiktokItemId
   * @return tiktokItemId
  **/
  @Schema(description = "")
  public String getTiktokItemId() {
    return tiktokItemId;
  }

  public void setTiktokItemId(String tiktokItemId) {
    this.tiktokItemId = tiktokItemId;
  }

  public AdupdateCreatives trackingAppId(String trackingAppId) {
    this.trackingAppId = trackingAppId;
    return this;
  }

   /**
   * Get trackingAppId
   * @return trackingAppId
  **/
  @Schema(description = "")
  public String getTrackingAppId() {
    return trackingAppId;
  }

  public void setTrackingAppId(String trackingAppId) {
    this.trackingAppId = trackingAppId;
  }

  public AdupdateCreatives trackingOfflineEventSetIds(List<String> trackingOfflineEventSetIds) {
    this.trackingOfflineEventSetIds = trackingOfflineEventSetIds;
    return this;
  }

  public AdupdateCreatives addTrackingOfflineEventSetIdsItem(String trackingOfflineEventSetIdsItem) {
    if (this.trackingOfflineEventSetIds == null) {
      this.trackingOfflineEventSetIds = new ArrayList<String>();
    }
    this.trackingOfflineEventSetIds.add(trackingOfflineEventSetIdsItem);
    return this;
  }

   /**
   * Get trackingOfflineEventSetIds
   * @return trackingOfflineEventSetIds
  **/
  @Schema(description = "")
  public List<String> getTrackingOfflineEventSetIds() {
    return trackingOfflineEventSetIds;
  }

  public void setTrackingOfflineEventSetIds(List<String> trackingOfflineEventSetIds) {
    this.trackingOfflineEventSetIds = trackingOfflineEventSetIds;
  }

  public AdupdateCreatives trackingPixelId(Long trackingPixelId) {
    this.trackingPixelId = trackingPixelId;
    return this;
  }

   /**
   * Get trackingPixelId
   * @return trackingPixelId
  **/
  @Schema(description = "")
  public Long getTrackingPixelId() {
    return trackingPixelId;
  }

  public void setTrackingPixelId(Long trackingPixelId) {
    this.trackingPixelId = trackingPixelId;
  }

  public AdupdateCreatives utmParams(List<AdcreateUtmParams> utmParams) {
    this.utmParams = utmParams;
    return this;
  }

  public AdupdateCreatives addUtmParamsItem(AdcreateUtmParams utmParamsItem) {
    if (this.utmParams == null) {
      this.utmParams = new ArrayList<AdcreateUtmParams>();
    }
    this.utmParams.add(utmParamsItem);
    return this;
  }

   /**
   * Get utmParams
   * @return utmParams
  **/
  @Schema(description = "")
  public List<AdcreateUtmParams> getUtmParams() {
    return utmParams;
  }

  public void setUtmParams(List<AdcreateUtmParams> utmParams) {
    this.utmParams = utmParams;
  }

  public AdupdateCreatives vastMoatEnabled(Boolean vastMoatEnabled) {
    this.vastMoatEnabled = vastMoatEnabled;
    return this;
  }

   /**
   * Get vastMoatEnabled
   * @return vastMoatEnabled
  **/
  @Schema(description = "")
  public Boolean isVastMoatEnabled() {
    return vastMoatEnabled;
  }

  public void setVastMoatEnabled(Boolean vastMoatEnabled) {
    this.vastMoatEnabled = vastMoatEnabled;
  }

  public AdupdateCreatives verticalVideoStrategy(String verticalVideoStrategy) {
    this.verticalVideoStrategy = verticalVideoStrategy;
    return this;
  }

   /**
   * Get verticalVideoStrategy
   * @return verticalVideoStrategy
  **/
  @Schema(description = "")
  public String getVerticalVideoStrategy() {
    return verticalVideoStrategy;
  }

  public void setVerticalVideoStrategy(String verticalVideoStrategy) {
    this.verticalVideoStrategy = verticalVideoStrategy;
  }

  public AdupdateCreatives videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * Get videoId
   * @return videoId
  **/
  @Schema(description = "")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public AdupdateCreatives videoViewTrackingUrl(String videoViewTrackingUrl) {
    this.videoViewTrackingUrl = videoViewTrackingUrl;
    return this;
  }

   /**
   * Get videoViewTrackingUrl
   * @return videoViewTrackingUrl
  **/
  @Schema(description = "")
  public String getVideoViewTrackingUrl() {
    return videoViewTrackingUrl;
  }

  public void setVideoViewTrackingUrl(String videoViewTrackingUrl) {
    this.videoViewTrackingUrl = videoViewTrackingUrl;
  }

  public AdupdateCreatives viewabilityPostbidPartner(String viewabilityPostbidPartner) {
    this.viewabilityPostbidPartner = viewabilityPostbidPartner;
    return this;
  }

   /**
   * Get viewabilityPostbidPartner
   * @return viewabilityPostbidPartner
  **/
  @Schema(description = "")
  public String getViewabilityPostbidPartner() {
    return viewabilityPostbidPartner;
  }

  public void setViewabilityPostbidPartner(String viewabilityPostbidPartner) {
    this.viewabilityPostbidPartner = viewabilityPostbidPartner;
  }

  public AdupdateCreatives viewabilityVastUrl(String viewabilityVastUrl) {
    this.viewabilityVastUrl = viewabilityVastUrl;
    return this;
  }

   /**
   * Get viewabilityVastUrl
   * @return viewabilityVastUrl
  **/
  @Schema(description = "")
  public String getViewabilityVastUrl() {
    return viewabilityVastUrl;
  }

  public void setViewabilityVastUrl(String viewabilityVastUrl) {
    this.viewabilityVastUrl = viewabilityVastUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdupdateCreatives adupdateCreatives = (AdupdateCreatives) o;
    return Objects.equals(this.adFormat, adupdateCreatives.adFormat) &&
        Objects.equals(this.adId, adupdateCreatives.adId) &&
        Objects.equals(this.adName, adupdateCreatives.adName) &&
        Objects.equals(this.adText, adupdateCreatives.adText) &&
        Objects.equals(this.adTexts, adupdateCreatives.adTexts) &&
        Objects.equals(this.aigcDisclosureType, adupdateCreatives.aigcDisclosureType) &&
        Objects.equals(this.appName, adupdateCreatives.appName) &&
        Objects.equals(this.avatarIconWebUri, adupdateCreatives.avatarIconWebUri) &&
        Objects.equals(this.brandSafetyPostbidPartner, adupdateCreatives.brandSafetyPostbidPartner) &&
        Objects.equals(this.brandSafetyVastUrl, adupdateCreatives.brandSafetyVastUrl) &&
        Objects.equals(this.callToAction, adupdateCreatives.callToAction) &&
        Objects.equals(this.callToActionId, adupdateCreatives.callToActionId) &&
        Objects.equals(this.cardId, adupdateCreatives.cardId) &&
        Objects.equals(this.carouselImageIndex, adupdateCreatives.carouselImageIndex) &&
        Objects.equals(this.clickTrackingUrl, adupdateCreatives.clickTrackingUrl) &&
        Objects.equals(this.cppUrl, adupdateCreatives.cppUrl) &&
        Objects.equals(this.creativeAuthorized, adupdateCreatives.creativeAuthorized) &&
        Objects.equals(this.creativeType, adupdateCreatives.creativeType) &&
        Objects.equals(this.darkPostStatus, adupdateCreatives.darkPostStatus) &&
        Objects.equals(this.deeplink, adupdateCreatives.deeplink) &&
        Objects.equals(this.deeplinkType, adupdateCreatives.deeplinkType) &&
        Objects.equals(this.deeplinkUtmParams, adupdateCreatives.deeplinkUtmParams) &&
        Objects.equals(this.disclaimerClickableTexts, adupdateCreatives.disclaimerClickableTexts) &&
        Objects.equals(this.disclaimerText, adupdateCreatives.disclaimerText) &&
        Objects.equals(this.disclaimerType, adupdateCreatives.disclaimerType) &&
        Objects.equals(this.displayName, adupdateCreatives.displayName) &&
        Objects.equals(this.dynamicDestination, adupdateCreatives.dynamicDestination) &&
        Objects.equals(this.dynamicFormat, adupdateCreatives.dynamicFormat) &&
        Objects.equals(this.endCardCta, adupdateCreatives.endCardCta) &&
        Objects.equals(this.fallbackType, adupdateCreatives.fallbackType) &&
        Objects.equals(this.identityAuthorizedBcId, adupdateCreatives.identityAuthorizedBcId) &&
        Objects.equals(this.identityId, adupdateCreatives.identityId) &&
        Objects.equals(this.identityType, adupdateCreatives.identityType) &&
        Objects.equals(this.imageIds, adupdateCreatives.imageIds) &&
        Objects.equals(this.impressionTrackingUrl, adupdateCreatives.impressionTrackingUrl) &&
        Objects.equals(this.instantProductPageUsed, adupdateCreatives.instantProductPageUsed) &&
        Objects.equals(this.itemDuetStatus, adupdateCreatives.itemDuetStatus) &&
        Objects.equals(this.itemGroupIds, adupdateCreatives.itemGroupIds) &&
        Objects.equals(this.itemStitchStatus, adupdateCreatives.itemStitchStatus) &&
        Objects.equals(this.landingPageUrl, adupdateCreatives.landingPageUrl) &&
        Objects.equals(this.musicId, adupdateCreatives.musicId) &&
        Objects.equals(this.pageId, adupdateCreatives.pageId) &&
        Objects.equals(this.pageImageIndex, adupdateCreatives.pageImageIndex) &&
        Objects.equals(this.playableUrl, adupdateCreatives.playableUrl) &&
        Objects.equals(this.productSetId, adupdateCreatives.productSetId) &&
        Objects.equals(this.productSpecificType, adupdateCreatives.productSpecificType) &&
        Objects.equals(this.promotionalMusicDisabled, adupdateCreatives.promotionalMusicDisabled) &&
        Objects.equals(this.shoppingAdsDeeplinkType, adupdateCreatives.shoppingAdsDeeplinkType) &&
        Objects.equals(this.shoppingAdsFallbackType, adupdateCreatives.shoppingAdsFallbackType) &&
        Objects.equals(this.shoppingAdsVideoPackageId, adupdateCreatives.shoppingAdsVideoPackageId) &&
        Objects.equals(this.skuIds, adupdateCreatives.skuIds) &&
        Objects.equals(this.tiktokItemId, adupdateCreatives.tiktokItemId) &&
        Objects.equals(this.trackingAppId, adupdateCreatives.trackingAppId) &&
        Objects.equals(this.trackingOfflineEventSetIds, adupdateCreatives.trackingOfflineEventSetIds) &&
        Objects.equals(this.trackingPixelId, adupdateCreatives.trackingPixelId) &&
        Objects.equals(this.utmParams, adupdateCreatives.utmParams) &&
        Objects.equals(this.vastMoatEnabled, adupdateCreatives.vastMoatEnabled) &&
        Objects.equals(this.verticalVideoStrategy, adupdateCreatives.verticalVideoStrategy) &&
        Objects.equals(this.videoId, adupdateCreatives.videoId) &&
        Objects.equals(this.videoViewTrackingUrl, adupdateCreatives.videoViewTrackingUrl) &&
        Objects.equals(this.viewabilityPostbidPartner, adupdateCreatives.viewabilityPostbidPartner) &&
        Objects.equals(this.viewabilityVastUrl, adupdateCreatives.viewabilityVastUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adFormat, adId, adName, adText, adTexts, aigcDisclosureType, appName, avatarIconWebUri, brandSafetyPostbidPartner, brandSafetyVastUrl, callToAction, callToActionId, cardId, carouselImageIndex, clickTrackingUrl, cppUrl, creativeAuthorized, creativeType, darkPostStatus, deeplink, deeplinkType, deeplinkUtmParams, disclaimerClickableTexts, disclaimerText, disclaimerType, displayName, dynamicDestination, dynamicFormat, endCardCta, fallbackType, identityAuthorizedBcId, identityId, identityType, imageIds, impressionTrackingUrl, instantProductPageUsed, itemDuetStatus, itemGroupIds, itemStitchStatus, landingPageUrl, musicId, pageId, pageImageIndex, playableUrl, productSetId, productSpecificType, promotionalMusicDisabled, shoppingAdsDeeplinkType, shoppingAdsFallbackType, shoppingAdsVideoPackageId, skuIds, tiktokItemId, trackingAppId, trackingOfflineEventSetIds, trackingPixelId, utmParams, vastMoatEnabled, verticalVideoStrategy, videoId, videoViewTrackingUrl, viewabilityPostbidPartner, viewabilityVastUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdupdateCreatives {\n");
    
    sb.append("    adFormat: ").append(toIndentedString(adFormat)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    adText: ").append(toIndentedString(adText)).append("\n");
    sb.append("    adTexts: ").append(toIndentedString(adTexts)).append("\n");
    sb.append("    aigcDisclosureType: ").append(toIndentedString(aigcDisclosureType)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    avatarIconWebUri: ").append(toIndentedString(avatarIconWebUri)).append("\n");
    sb.append("    brandSafetyPostbidPartner: ").append(toIndentedString(brandSafetyPostbidPartner)).append("\n");
    sb.append("    brandSafetyVastUrl: ").append(toIndentedString(brandSafetyVastUrl)).append("\n");
    sb.append("    callToAction: ").append(toIndentedString(callToAction)).append("\n");
    sb.append("    callToActionId: ").append(toIndentedString(callToActionId)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    carouselImageIndex: ").append(toIndentedString(carouselImageIndex)).append("\n");
    sb.append("    clickTrackingUrl: ").append(toIndentedString(clickTrackingUrl)).append("\n");
    sb.append("    cppUrl: ").append(toIndentedString(cppUrl)).append("\n");
    sb.append("    creativeAuthorized: ").append(toIndentedString(creativeAuthorized)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    darkPostStatus: ").append(toIndentedString(darkPostStatus)).append("\n");
    sb.append("    deeplink: ").append(toIndentedString(deeplink)).append("\n");
    sb.append("    deeplinkType: ").append(toIndentedString(deeplinkType)).append("\n");
    sb.append("    deeplinkUtmParams: ").append(toIndentedString(deeplinkUtmParams)).append("\n");
    sb.append("    disclaimerClickableTexts: ").append(toIndentedString(disclaimerClickableTexts)).append("\n");
    sb.append("    disclaimerText: ").append(toIndentedString(disclaimerText)).append("\n");
    sb.append("    disclaimerType: ").append(toIndentedString(disclaimerType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dynamicDestination: ").append(toIndentedString(dynamicDestination)).append("\n");
    sb.append("    dynamicFormat: ").append(toIndentedString(dynamicFormat)).append("\n");
    sb.append("    endCardCta: ").append(toIndentedString(endCardCta)).append("\n");
    sb.append("    fallbackType: ").append(toIndentedString(fallbackType)).append("\n");
    sb.append("    identityAuthorizedBcId: ").append(toIndentedString(identityAuthorizedBcId)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    impressionTrackingUrl: ").append(toIndentedString(impressionTrackingUrl)).append("\n");
    sb.append("    instantProductPageUsed: ").append(toIndentedString(instantProductPageUsed)).append("\n");
    sb.append("    itemDuetStatus: ").append(toIndentedString(itemDuetStatus)).append("\n");
    sb.append("    itemGroupIds: ").append(toIndentedString(itemGroupIds)).append("\n");
    sb.append("    itemStitchStatus: ").append(toIndentedString(itemStitchStatus)).append("\n");
    sb.append("    landingPageUrl: ").append(toIndentedString(landingPageUrl)).append("\n");
    sb.append("    musicId: ").append(toIndentedString(musicId)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    pageImageIndex: ").append(toIndentedString(pageImageIndex)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    productSetId: ").append(toIndentedString(productSetId)).append("\n");
    sb.append("    productSpecificType: ").append(toIndentedString(productSpecificType)).append("\n");
    sb.append("    promotionalMusicDisabled: ").append(toIndentedString(promotionalMusicDisabled)).append("\n");
    sb.append("    shoppingAdsDeeplinkType: ").append(toIndentedString(shoppingAdsDeeplinkType)).append("\n");
    sb.append("    shoppingAdsFallbackType: ").append(toIndentedString(shoppingAdsFallbackType)).append("\n");
    sb.append("    shoppingAdsVideoPackageId: ").append(toIndentedString(shoppingAdsVideoPackageId)).append("\n");
    sb.append("    skuIds: ").append(toIndentedString(skuIds)).append("\n");
    sb.append("    tiktokItemId: ").append(toIndentedString(tiktokItemId)).append("\n");
    sb.append("    trackingAppId: ").append(toIndentedString(trackingAppId)).append("\n");
    sb.append("    trackingOfflineEventSetIds: ").append(toIndentedString(trackingOfflineEventSetIds)).append("\n");
    sb.append("    trackingPixelId: ").append(toIndentedString(trackingPixelId)).append("\n");
    sb.append("    utmParams: ").append(toIndentedString(utmParams)).append("\n");
    sb.append("    vastMoatEnabled: ").append(toIndentedString(vastMoatEnabled)).append("\n");
    sb.append("    verticalVideoStrategy: ").append(toIndentedString(verticalVideoStrategy)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoViewTrackingUrl: ").append(toIndentedString(videoViewTrackingUrl)).append("\n");
    sb.append("    viewabilityPostbidPartner: ").append(toIndentedString(viewabilityPostbidPartner)).append("\n");
    sb.append("    viewabilityVastUrl: ").append(toIndentedString(viewabilityVastUrl)).append("\n");
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
