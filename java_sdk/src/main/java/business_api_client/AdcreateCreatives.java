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
import business_api_client.AdcreateShowcaseProducts;
import business_api_client.AdcreateUtmParams;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * AdcreateCreatives
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class AdcreateCreatives {
  @JsonProperty("ad_format")
  private String adFormat = null;

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

  @JsonProperty("auto_disclaimer_types")
  private List<String> autoDisclaimerTypes = null;

  @JsonProperty("auto_message_id")
  private String autoMessageId = null;

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

  @JsonProperty("catalog_id")
  private String catalogId = null;

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

  @JsonProperty("deeplink_format_type")
  private String deeplinkFormatType = null;

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

  @JsonProperty("operation_status")
  private String operationStatus = "ENABLE";

  @JsonProperty("page_id")
  private Long pageId = null;

  @JsonProperty("page_image_index")
  private Integer pageImageIndex = null;

  @JsonProperty("phone_number")
  private String phoneNumber = null;

  @JsonProperty("phone_region_calling_code")
  private String phoneRegionCallingCode = null;

  @JsonProperty("phone_region_code")
  private String phoneRegionCode = null;

  @JsonProperty("playable_url")
  private String playableUrl = null;

  @JsonProperty("product_display_field_list")
  private List<String> productDisplayFieldList = null;

  @JsonProperty("product_set_id")
  private String productSetId = null;

  @JsonProperty("product_specific_type")
  private String productSpecificType = null;

  @JsonProperty("promotional_music_disabled")
  private Boolean promotionalMusicDisabled = true;

  @JsonProperty("schedule_id")
  private String scheduleId = null;

  @JsonProperty("shopping_ads_deeplink_type")
  private String shoppingAdsDeeplinkType = "NONE";

  @JsonProperty("shopping_ads_fallback_type")
  private String shoppingAdsFallbackType = null;

  @JsonProperty("shopping_ads_video_package_id")
  private String shoppingAdsVideoPackageId = null;

  @JsonProperty("showcase_products")
  private List<AdcreateShowcaseProducts> showcaseProducts = null;

  @JsonProperty("sku_ids")
  private List<String> skuIds = null;

  @JsonProperty("tiktok_item_id")
  private String tiktokItemId = null;

  @JsonProperty("tiktok_page_category")
  private String tiktokPageCategory = null;

  @JsonProperty("tracking_app_id")
  private String trackingAppId = null;

  @JsonProperty("tracking_message_event_set_id")
  private String trackingMessageEventSetId = null;

  @JsonProperty("tracking_offline_event_set_ids")
  private List<String> trackingOfflineEventSetIds = null;

  @JsonProperty("tracking_pixel_id")
  private Long trackingPixelId = null;

  @JsonProperty("utm_params")
  private List<AdcreateUtmParams> utmParams = null;

  @JsonProperty("vehicle_ids")
  private List<String> vehicleIds = null;

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

  public AdcreateCreatives adFormat(String adFormat) {
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

  public AdcreateCreatives adName(String adName) {
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

  public AdcreateCreatives adText(String adText) {
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

  public AdcreateCreatives adTexts(List<String> adTexts) {
    this.adTexts = adTexts;
    return this;
  }

  public AdcreateCreatives addAdTextsItem(String adTextsItem) {
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

  public AdcreateCreatives aigcDisclosureType(String aigcDisclosureType) {
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

  public AdcreateCreatives appName(String appName) {
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

  public AdcreateCreatives autoDisclaimerTypes(List<String> autoDisclaimerTypes) {
    this.autoDisclaimerTypes = autoDisclaimerTypes;
    return this;
  }

  public AdcreateCreatives addAutoDisclaimerTypesItem(String autoDisclaimerTypesItem) {
    if (this.autoDisclaimerTypes == null) {
      this.autoDisclaimerTypes = new ArrayList<String>();
    }
    this.autoDisclaimerTypes.add(autoDisclaimerTypesItem);
    return this;
  }

   /**
   * Get autoDisclaimerTypes
   * @return autoDisclaimerTypes
  **/
  @Schema(description = "")
  public List<String> getAutoDisclaimerTypes() {
    return autoDisclaimerTypes;
  }

  public void setAutoDisclaimerTypes(List<String> autoDisclaimerTypes) {
    this.autoDisclaimerTypes = autoDisclaimerTypes;
  }

  public AdcreateCreatives autoMessageId(String autoMessageId) {
    this.autoMessageId = autoMessageId;
    return this;
  }

   /**
   * Get autoMessageId
   * @return autoMessageId
  **/
  @Schema(description = "")
  public String getAutoMessageId() {
    return autoMessageId;
  }

  public void setAutoMessageId(String autoMessageId) {
    this.autoMessageId = autoMessageId;
  }

  public AdcreateCreatives avatarIconWebUri(String avatarIconWebUri) {
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

  public AdcreateCreatives brandSafetyPostbidPartner(String brandSafetyPostbidPartner) {
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

  public AdcreateCreatives brandSafetyVastUrl(String brandSafetyVastUrl) {
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

  public AdcreateCreatives callToAction(String callToAction) {
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

  public AdcreateCreatives callToActionId(String callToActionId) {
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

  public AdcreateCreatives cardId(String cardId) {
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

  public AdcreateCreatives carouselImageIndex(Integer carouselImageIndex) {
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

  public AdcreateCreatives catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @Schema(description = "")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public AdcreateCreatives clickTrackingUrl(String clickTrackingUrl) {
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

  public AdcreateCreatives cppUrl(String cppUrl) {
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

  public AdcreateCreatives creativeAuthorized(Boolean creativeAuthorized) {
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

  public AdcreateCreatives creativeType(String creativeType) {
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

  public AdcreateCreatives darkPostStatus(String darkPostStatus) {
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

  public AdcreateCreatives deeplink(String deeplink) {
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

  public AdcreateCreatives deeplinkFormatType(String deeplinkFormatType) {
    this.deeplinkFormatType = deeplinkFormatType;
    return this;
  }

   /**
   * Get deeplinkFormatType
   * @return deeplinkFormatType
  **/
  @Schema(description = "")
  public String getDeeplinkFormatType() {
    return deeplinkFormatType;
  }

  public void setDeeplinkFormatType(String deeplinkFormatType) {
    this.deeplinkFormatType = deeplinkFormatType;
  }

  public AdcreateCreatives deeplinkType(String deeplinkType) {
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

  public AdcreateCreatives deeplinkUtmParams(List<AdcreateDeeplinkUtmParams> deeplinkUtmParams) {
    this.deeplinkUtmParams = deeplinkUtmParams;
    return this;
  }

  public AdcreateCreatives addDeeplinkUtmParamsItem(AdcreateDeeplinkUtmParams deeplinkUtmParamsItem) {
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

  public AdcreateCreatives disclaimerClickableTexts(List<AdcreateDisclaimerClickableTexts> disclaimerClickableTexts) {
    this.disclaimerClickableTexts = disclaimerClickableTexts;
    return this;
  }

  public AdcreateCreatives addDisclaimerClickableTextsItem(AdcreateDisclaimerClickableTexts disclaimerClickableTextsItem) {
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

  public AdcreateCreatives disclaimerText(AdcreateDisclaimerText disclaimerText) {
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

  public AdcreateCreatives disclaimerType(String disclaimerType) {
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

  public AdcreateCreatives displayName(String displayName) {
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

  public AdcreateCreatives dynamicDestination(String dynamicDestination) {
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

  public AdcreateCreatives dynamicFormat(String dynamicFormat) {
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

  public AdcreateCreatives endCardCta(String endCardCta) {
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

  public AdcreateCreatives fallbackType(String fallbackType) {
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

  public AdcreateCreatives identityAuthorizedBcId(String identityAuthorizedBcId) {
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

  public AdcreateCreatives identityId(String identityId) {
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

  public AdcreateCreatives identityType(String identityType) {
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

  public AdcreateCreatives imageIds(List<String> imageIds) {
    this.imageIds = imageIds;
    return this;
  }

  public AdcreateCreatives addImageIdsItem(String imageIdsItem) {
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

  public AdcreateCreatives impressionTrackingUrl(String impressionTrackingUrl) {
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

  public AdcreateCreatives instantProductPageUsed(Boolean instantProductPageUsed) {
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

  public AdcreateCreatives itemDuetStatus(String itemDuetStatus) {
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

  public AdcreateCreatives itemGroupIds(List<String> itemGroupIds) {
    this.itemGroupIds = itemGroupIds;
    return this;
  }

  public AdcreateCreatives addItemGroupIdsItem(String itemGroupIdsItem) {
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

  public AdcreateCreatives itemStitchStatus(String itemStitchStatus) {
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

  public AdcreateCreatives landingPageUrl(String landingPageUrl) {
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

  public AdcreateCreatives musicId(String musicId) {
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

  public AdcreateCreatives operationStatus(String operationStatus) {
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

  public AdcreateCreatives pageId(Long pageId) {
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

  public AdcreateCreatives pageImageIndex(Integer pageImageIndex) {
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

  public AdcreateCreatives phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @Schema(description = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AdcreateCreatives phoneRegionCallingCode(String phoneRegionCallingCode) {
    this.phoneRegionCallingCode = phoneRegionCallingCode;
    return this;
  }

   /**
   * Get phoneRegionCallingCode
   * @return phoneRegionCallingCode
  **/
  @Schema(description = "")
  public String getPhoneRegionCallingCode() {
    return phoneRegionCallingCode;
  }

  public void setPhoneRegionCallingCode(String phoneRegionCallingCode) {
    this.phoneRegionCallingCode = phoneRegionCallingCode;
  }

  public AdcreateCreatives phoneRegionCode(String phoneRegionCode) {
    this.phoneRegionCode = phoneRegionCode;
    return this;
  }

   /**
   * Get phoneRegionCode
   * @return phoneRegionCode
  **/
  @Schema(description = "")
  public String getPhoneRegionCode() {
    return phoneRegionCode;
  }

  public void setPhoneRegionCode(String phoneRegionCode) {
    this.phoneRegionCode = phoneRegionCode;
  }

  public AdcreateCreatives playableUrl(String playableUrl) {
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

  public AdcreateCreatives productDisplayFieldList(List<String> productDisplayFieldList) {
    this.productDisplayFieldList = productDisplayFieldList;
    return this;
  }

  public AdcreateCreatives addProductDisplayFieldListItem(String productDisplayFieldListItem) {
    if (this.productDisplayFieldList == null) {
      this.productDisplayFieldList = new ArrayList<String>();
    }
    this.productDisplayFieldList.add(productDisplayFieldListItem);
    return this;
  }

   /**
   * Get productDisplayFieldList
   * @return productDisplayFieldList
  **/
  @Schema(description = "")
  public List<String> getProductDisplayFieldList() {
    return productDisplayFieldList;
  }

  public void setProductDisplayFieldList(List<String> productDisplayFieldList) {
    this.productDisplayFieldList = productDisplayFieldList;
  }

  public AdcreateCreatives productSetId(String productSetId) {
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

  public AdcreateCreatives productSpecificType(String productSpecificType) {
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

  public AdcreateCreatives promotionalMusicDisabled(Boolean promotionalMusicDisabled) {
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

  public AdcreateCreatives scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

   /**
   * Get scheduleId
   * @return scheduleId
  **/
  @Schema(description = "")
  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  public AdcreateCreatives shoppingAdsDeeplinkType(String shoppingAdsDeeplinkType) {
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

  public AdcreateCreatives shoppingAdsFallbackType(String shoppingAdsFallbackType) {
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

  public AdcreateCreatives shoppingAdsVideoPackageId(String shoppingAdsVideoPackageId) {
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

  public AdcreateCreatives showcaseProducts(List<AdcreateShowcaseProducts> showcaseProducts) {
    this.showcaseProducts = showcaseProducts;
    return this;
  }

  public AdcreateCreatives addShowcaseProductsItem(AdcreateShowcaseProducts showcaseProductsItem) {
    if (this.showcaseProducts == null) {
      this.showcaseProducts = new ArrayList<AdcreateShowcaseProducts>();
    }
    this.showcaseProducts.add(showcaseProductsItem);
    return this;
  }

   /**
   * Get showcaseProducts
   * @return showcaseProducts
  **/
  @Schema(description = "")
  public List<AdcreateShowcaseProducts> getShowcaseProducts() {
    return showcaseProducts;
  }

  public void setShowcaseProducts(List<AdcreateShowcaseProducts> showcaseProducts) {
    this.showcaseProducts = showcaseProducts;
  }

  public AdcreateCreatives skuIds(List<String> skuIds) {
    this.skuIds = skuIds;
    return this;
  }

  public AdcreateCreatives addSkuIdsItem(String skuIdsItem) {
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

  public AdcreateCreatives tiktokItemId(String tiktokItemId) {
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

  public AdcreateCreatives tiktokPageCategory(String tiktokPageCategory) {
    this.tiktokPageCategory = tiktokPageCategory;
    return this;
  }

   /**
   * Get tiktokPageCategory
   * @return tiktokPageCategory
  **/
  @Schema(description = "")
  public String getTiktokPageCategory() {
    return tiktokPageCategory;
  }

  public void setTiktokPageCategory(String tiktokPageCategory) {
    this.tiktokPageCategory = tiktokPageCategory;
  }

  public AdcreateCreatives trackingAppId(String trackingAppId) {
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

  public AdcreateCreatives trackingMessageEventSetId(String trackingMessageEventSetId) {
    this.trackingMessageEventSetId = trackingMessageEventSetId;
    return this;
  }

   /**
   * Get trackingMessageEventSetId
   * @return trackingMessageEventSetId
  **/
  @Schema(description = "")
  public String getTrackingMessageEventSetId() {
    return trackingMessageEventSetId;
  }

  public void setTrackingMessageEventSetId(String trackingMessageEventSetId) {
    this.trackingMessageEventSetId = trackingMessageEventSetId;
  }

  public AdcreateCreatives trackingOfflineEventSetIds(List<String> trackingOfflineEventSetIds) {
    this.trackingOfflineEventSetIds = trackingOfflineEventSetIds;
    return this;
  }

  public AdcreateCreatives addTrackingOfflineEventSetIdsItem(String trackingOfflineEventSetIdsItem) {
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

  public AdcreateCreatives trackingPixelId(Long trackingPixelId) {
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

  public AdcreateCreatives utmParams(List<AdcreateUtmParams> utmParams) {
    this.utmParams = utmParams;
    return this;
  }

  public AdcreateCreatives addUtmParamsItem(AdcreateUtmParams utmParamsItem) {
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

  public AdcreateCreatives vehicleIds(List<String> vehicleIds) {
    this.vehicleIds = vehicleIds;
    return this;
  }

  public AdcreateCreatives addVehicleIdsItem(String vehicleIdsItem) {
    if (this.vehicleIds == null) {
      this.vehicleIds = new ArrayList<String>();
    }
    this.vehicleIds.add(vehicleIdsItem);
    return this;
  }

   /**
   * Get vehicleIds
   * @return vehicleIds
  **/
  @Schema(description = "")
  public List<String> getVehicleIds() {
    return vehicleIds;
  }

  public void setVehicleIds(List<String> vehicleIds) {
    this.vehicleIds = vehicleIds;
  }

  public AdcreateCreatives verticalVideoStrategy(String verticalVideoStrategy) {
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

  public AdcreateCreatives videoId(String videoId) {
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

  public AdcreateCreatives videoViewTrackingUrl(String videoViewTrackingUrl) {
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

  public AdcreateCreatives viewabilityPostbidPartner(String viewabilityPostbidPartner) {
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

  public AdcreateCreatives viewabilityVastUrl(String viewabilityVastUrl) {
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
    AdcreateCreatives adcreateCreatives = (AdcreateCreatives) o;
    return Objects.equals(this.adFormat, adcreateCreatives.adFormat) &&
        Objects.equals(this.adName, adcreateCreatives.adName) &&
        Objects.equals(this.adText, adcreateCreatives.adText) &&
        Objects.equals(this.adTexts, adcreateCreatives.adTexts) &&
        Objects.equals(this.aigcDisclosureType, adcreateCreatives.aigcDisclosureType) &&
        Objects.equals(this.appName, adcreateCreatives.appName) &&
        Objects.equals(this.autoDisclaimerTypes, adcreateCreatives.autoDisclaimerTypes) &&
        Objects.equals(this.autoMessageId, adcreateCreatives.autoMessageId) &&
        Objects.equals(this.avatarIconWebUri, adcreateCreatives.avatarIconWebUri) &&
        Objects.equals(this.brandSafetyPostbidPartner, adcreateCreatives.brandSafetyPostbidPartner) &&
        Objects.equals(this.brandSafetyVastUrl, adcreateCreatives.brandSafetyVastUrl) &&
        Objects.equals(this.callToAction, adcreateCreatives.callToAction) &&
        Objects.equals(this.callToActionId, adcreateCreatives.callToActionId) &&
        Objects.equals(this.cardId, adcreateCreatives.cardId) &&
        Objects.equals(this.carouselImageIndex, adcreateCreatives.carouselImageIndex) &&
        Objects.equals(this.catalogId, adcreateCreatives.catalogId) &&
        Objects.equals(this.clickTrackingUrl, adcreateCreatives.clickTrackingUrl) &&
        Objects.equals(this.cppUrl, adcreateCreatives.cppUrl) &&
        Objects.equals(this.creativeAuthorized, adcreateCreatives.creativeAuthorized) &&
        Objects.equals(this.creativeType, adcreateCreatives.creativeType) &&
        Objects.equals(this.darkPostStatus, adcreateCreatives.darkPostStatus) &&
        Objects.equals(this.deeplink, adcreateCreatives.deeplink) &&
        Objects.equals(this.deeplinkFormatType, adcreateCreatives.deeplinkFormatType) &&
        Objects.equals(this.deeplinkType, adcreateCreatives.deeplinkType) &&
        Objects.equals(this.deeplinkUtmParams, adcreateCreatives.deeplinkUtmParams) &&
        Objects.equals(this.disclaimerClickableTexts, adcreateCreatives.disclaimerClickableTexts) &&
        Objects.equals(this.disclaimerText, adcreateCreatives.disclaimerText) &&
        Objects.equals(this.disclaimerType, adcreateCreatives.disclaimerType) &&
        Objects.equals(this.displayName, adcreateCreatives.displayName) &&
        Objects.equals(this.dynamicDestination, adcreateCreatives.dynamicDestination) &&
        Objects.equals(this.dynamicFormat, adcreateCreatives.dynamicFormat) &&
        Objects.equals(this.endCardCta, adcreateCreatives.endCardCta) &&
        Objects.equals(this.fallbackType, adcreateCreatives.fallbackType) &&
        Objects.equals(this.identityAuthorizedBcId, adcreateCreatives.identityAuthorizedBcId) &&
        Objects.equals(this.identityId, adcreateCreatives.identityId) &&
        Objects.equals(this.identityType, adcreateCreatives.identityType) &&
        Objects.equals(this.imageIds, adcreateCreatives.imageIds) &&
        Objects.equals(this.impressionTrackingUrl, adcreateCreatives.impressionTrackingUrl) &&
        Objects.equals(this.instantProductPageUsed, adcreateCreatives.instantProductPageUsed) &&
        Objects.equals(this.itemDuetStatus, adcreateCreatives.itemDuetStatus) &&
        Objects.equals(this.itemGroupIds, adcreateCreatives.itemGroupIds) &&
        Objects.equals(this.itemStitchStatus, adcreateCreatives.itemStitchStatus) &&
        Objects.equals(this.landingPageUrl, adcreateCreatives.landingPageUrl) &&
        Objects.equals(this.musicId, adcreateCreatives.musicId) &&
        Objects.equals(this.operationStatus, adcreateCreatives.operationStatus) &&
        Objects.equals(this.pageId, adcreateCreatives.pageId) &&
        Objects.equals(this.pageImageIndex, adcreateCreatives.pageImageIndex) &&
        Objects.equals(this.phoneNumber, adcreateCreatives.phoneNumber) &&
        Objects.equals(this.phoneRegionCallingCode, adcreateCreatives.phoneRegionCallingCode) &&
        Objects.equals(this.phoneRegionCode, adcreateCreatives.phoneRegionCode) &&
        Objects.equals(this.playableUrl, adcreateCreatives.playableUrl) &&
        Objects.equals(this.productDisplayFieldList, adcreateCreatives.productDisplayFieldList) &&
        Objects.equals(this.productSetId, adcreateCreatives.productSetId) &&
        Objects.equals(this.productSpecificType, adcreateCreatives.productSpecificType) &&
        Objects.equals(this.promotionalMusicDisabled, adcreateCreatives.promotionalMusicDisabled) &&
        Objects.equals(this.scheduleId, adcreateCreatives.scheduleId) &&
        Objects.equals(this.shoppingAdsDeeplinkType, adcreateCreatives.shoppingAdsDeeplinkType) &&
        Objects.equals(this.shoppingAdsFallbackType, adcreateCreatives.shoppingAdsFallbackType) &&
        Objects.equals(this.shoppingAdsVideoPackageId, adcreateCreatives.shoppingAdsVideoPackageId) &&
        Objects.equals(this.showcaseProducts, adcreateCreatives.showcaseProducts) &&
        Objects.equals(this.skuIds, adcreateCreatives.skuIds) &&
        Objects.equals(this.tiktokItemId, adcreateCreatives.tiktokItemId) &&
        Objects.equals(this.tiktokPageCategory, adcreateCreatives.tiktokPageCategory) &&
        Objects.equals(this.trackingAppId, adcreateCreatives.trackingAppId) &&
        Objects.equals(this.trackingMessageEventSetId, adcreateCreatives.trackingMessageEventSetId) &&
        Objects.equals(this.trackingOfflineEventSetIds, adcreateCreatives.trackingOfflineEventSetIds) &&
        Objects.equals(this.trackingPixelId, adcreateCreatives.trackingPixelId) &&
        Objects.equals(this.utmParams, adcreateCreatives.utmParams) &&
        Objects.equals(this.vehicleIds, adcreateCreatives.vehicleIds) &&
        Objects.equals(this.verticalVideoStrategy, adcreateCreatives.verticalVideoStrategy) &&
        Objects.equals(this.videoId, adcreateCreatives.videoId) &&
        Objects.equals(this.videoViewTrackingUrl, adcreateCreatives.videoViewTrackingUrl) &&
        Objects.equals(this.viewabilityPostbidPartner, adcreateCreatives.viewabilityPostbidPartner) &&
        Objects.equals(this.viewabilityVastUrl, adcreateCreatives.viewabilityVastUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adFormat, adName, adText, adTexts, aigcDisclosureType, appName, autoDisclaimerTypes, autoMessageId, avatarIconWebUri, brandSafetyPostbidPartner, brandSafetyVastUrl, callToAction, callToActionId, cardId, carouselImageIndex, catalogId, clickTrackingUrl, cppUrl, creativeAuthorized, creativeType, darkPostStatus, deeplink, deeplinkFormatType, deeplinkType, deeplinkUtmParams, disclaimerClickableTexts, disclaimerText, disclaimerType, displayName, dynamicDestination, dynamicFormat, endCardCta, fallbackType, identityAuthorizedBcId, identityId, identityType, imageIds, impressionTrackingUrl, instantProductPageUsed, itemDuetStatus, itemGroupIds, itemStitchStatus, landingPageUrl, musicId, operationStatus, pageId, pageImageIndex, phoneNumber, phoneRegionCallingCode, phoneRegionCode, playableUrl, productDisplayFieldList, productSetId, productSpecificType, promotionalMusicDisabled, scheduleId, shoppingAdsDeeplinkType, shoppingAdsFallbackType, shoppingAdsVideoPackageId, showcaseProducts, skuIds, tiktokItemId, tiktokPageCategory, trackingAppId, trackingMessageEventSetId, trackingOfflineEventSetIds, trackingPixelId, utmParams, vehicleIds, verticalVideoStrategy, videoId, videoViewTrackingUrl, viewabilityPostbidPartner, viewabilityVastUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdcreateCreatives {\n");
    
    sb.append("    adFormat: ").append(toIndentedString(adFormat)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    adText: ").append(toIndentedString(adText)).append("\n");
    sb.append("    adTexts: ").append(toIndentedString(adTexts)).append("\n");
    sb.append("    aigcDisclosureType: ").append(toIndentedString(aigcDisclosureType)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    autoDisclaimerTypes: ").append(toIndentedString(autoDisclaimerTypes)).append("\n");
    sb.append("    autoMessageId: ").append(toIndentedString(autoMessageId)).append("\n");
    sb.append("    avatarIconWebUri: ").append(toIndentedString(avatarIconWebUri)).append("\n");
    sb.append("    brandSafetyPostbidPartner: ").append(toIndentedString(brandSafetyPostbidPartner)).append("\n");
    sb.append("    brandSafetyVastUrl: ").append(toIndentedString(brandSafetyVastUrl)).append("\n");
    sb.append("    callToAction: ").append(toIndentedString(callToAction)).append("\n");
    sb.append("    callToActionId: ").append(toIndentedString(callToActionId)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    carouselImageIndex: ").append(toIndentedString(carouselImageIndex)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    clickTrackingUrl: ").append(toIndentedString(clickTrackingUrl)).append("\n");
    sb.append("    cppUrl: ").append(toIndentedString(cppUrl)).append("\n");
    sb.append("    creativeAuthorized: ").append(toIndentedString(creativeAuthorized)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    darkPostStatus: ").append(toIndentedString(darkPostStatus)).append("\n");
    sb.append("    deeplink: ").append(toIndentedString(deeplink)).append("\n");
    sb.append("    deeplinkFormatType: ").append(toIndentedString(deeplinkFormatType)).append("\n");
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
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    pageImageIndex: ").append(toIndentedString(pageImageIndex)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneRegionCallingCode: ").append(toIndentedString(phoneRegionCallingCode)).append("\n");
    sb.append("    phoneRegionCode: ").append(toIndentedString(phoneRegionCode)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    productDisplayFieldList: ").append(toIndentedString(productDisplayFieldList)).append("\n");
    sb.append("    productSetId: ").append(toIndentedString(productSetId)).append("\n");
    sb.append("    productSpecificType: ").append(toIndentedString(productSpecificType)).append("\n");
    sb.append("    promotionalMusicDisabled: ").append(toIndentedString(promotionalMusicDisabled)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    shoppingAdsDeeplinkType: ").append(toIndentedString(shoppingAdsDeeplinkType)).append("\n");
    sb.append("    shoppingAdsFallbackType: ").append(toIndentedString(shoppingAdsFallbackType)).append("\n");
    sb.append("    shoppingAdsVideoPackageId: ").append(toIndentedString(shoppingAdsVideoPackageId)).append("\n");
    sb.append("    showcaseProducts: ").append(toIndentedString(showcaseProducts)).append("\n");
    sb.append("    skuIds: ").append(toIndentedString(skuIds)).append("\n");
    sb.append("    tiktokItemId: ").append(toIndentedString(tiktokItemId)).append("\n");
    sb.append("    tiktokPageCategory: ").append(toIndentedString(tiktokPageCategory)).append("\n");
    sb.append("    trackingAppId: ").append(toIndentedString(trackingAppId)).append("\n");
    sb.append("    trackingMessageEventSetId: ").append(toIndentedString(trackingMessageEventSetId)).append("\n");
    sb.append("    trackingOfflineEventSetIds: ").append(toIndentedString(trackingOfflineEventSetIds)).append("\n");
    sb.append("    trackingPixelId: ").append(toIndentedString(trackingPixelId)).append("\n");
    sb.append("    utmParams: ").append(toIndentedString(utmParams)).append("\n");
    sb.append("    vehicleIds: ").append(toIndentedString(vehicleIds)).append("\n");
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
