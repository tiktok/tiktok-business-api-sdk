/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdcreateDisclaimerClickableTexts;
import business_api_client.AdcreateDisclaimerText;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * AdcreateCreatives
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class AdcreateCreatives {
  @JsonProperty("ad_format")
  private String adFormat = null;

  @JsonProperty("ad_name")
  private String adName = null;

  @JsonProperty("ad_text")
  private String adText = null;

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

  @JsonProperty("card_image_id")
  private String cardImageId = null;

  @JsonProperty("card_image_index")
  private Integer cardImageIndex = null;

  @JsonProperty("card_show_price")
  private Boolean cardShowPrice = null;

  @JsonProperty("card_tags")
  private List<String> cardTags = null;

  @JsonProperty("card_type")
  private String cardType = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("click_tracking_url")
  private String clickTrackingUrl = null;

  @JsonProperty("creative_authorized")
  private Boolean creativeAuthorized = null;

  @JsonProperty("creative_type")
  private String creativeType = null;

  @JsonProperty("dark_post_status")
  private String darkPostStatus = null;

  @JsonProperty("deeplink")
  private String deeplink = null;

  @JsonProperty("deeplink_type")
  private String deeplinkType = null;

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

  @JsonProperty("operation_status")
  private String operationStatus = null;

  @JsonProperty("page_id")
  private Integer pageId = null;

  @JsonProperty("page_image_index")
  private Integer pageImageIndex = null;

  @JsonProperty("playable_url")
  private String playableUrl = null;

  @JsonProperty("product_set_id")
  private String productSetId = null;

  @JsonProperty("product_specific_type")
  private String productSpecificType = null;

  @JsonProperty("promotional_music_disabled")
  private Boolean promotionalMusicDisabled = null;

  @JsonProperty("shopping_ads_deeplink_type")
  private String shoppingAdsDeeplinkType = null;

  @JsonProperty("shopping_ads_fallback_type")
  private String shoppingAdsFallbackType = null;

  @JsonProperty("shopping_ads_video_package_id")
  private String shoppingAdsVideoPackageId = null;

  @JsonProperty("shopping_ads_word_set")
  private List<Integer> shoppingAdsWordSet = null;

  @JsonProperty("sku_ids")
  private List<String> skuIds = null;

  @JsonProperty("tiktok_item_id")
  private String tiktokItemId = null;

  @JsonProperty("tracking_pixel_id")
  private Integer trackingPixelId = null;

  @JsonProperty("vast_moat_enabled")
  private Boolean vastMoatEnabled = null;

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
   * The creative type. Enum values- SINGLE_IMAGE, SINGLE_VIDEO, LIVE_CONTENT. For in-feed ads on TikTok, set this field to SINGLE_VIDEO. For live shopping events on TikTok, set this field to LIVE_CONTENT.
   * @return adFormat
  **/
  @Schema(description = "The creative type. Enum values- SINGLE_IMAGE, SINGLE_VIDEO, LIVE_CONTENT. For in-feed ads on TikTok, set this field to SINGLE_VIDEO. For live shopping events on TikTok, set this field to LIVE_CONTENT.")
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
   * Ad name. Set as \&quot; \&quot; (Empty string) for it to be automatically generated. The format of auto-generated ad name is- creative name + creation time (e.g. adcreative20210111190739). Character limit is 512 and cannot contain emoji. Note- Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
   * @return adName
  **/
  @Schema(description = "Ad name. Set as \" \" (Empty string) for it to be automatically generated. The format of auto-generated ad name is- creative name + creation time (e.g. adcreative20210111190739). Character limit is 512 and cannot contain emoji. Note- Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.")
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
   * An ad text. It is shown to your audience as part of your ad creative, to deliver the message you intend to communicate to them. If you don&#x27;t know how to create effective ad texts, you can try the Smart Text feature, which generates ad text recommendations based on the industry and language.This field is required for image or video ads (ad_format is SINGLE_IMAGE or SINGLE_VIDEO)Ad text must be 1-100 characters long and cannot contain emoji.Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
   * @return adText
  **/
  @Schema(description = "An ad text. It is shown to your audience as part of your ad creative, to deliver the message you intend to communicate to them. If you don't know how to create effective ad texts, you can try the Smart Text feature, which generates ad text recommendations based on the industry and language.This field is required for image or video ads (ad_format is SINGLE_IMAGE or SINGLE_VIDEO)Ad text must be 1-100 characters long and cannot contain emoji.Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.")
  public String getAdText() {
    return adText;
  }

  public void setAdText(String adText) {
    this.adText = adText;
  }

  public AdcreateCreatives appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * App name that is displayed in the ad.  If not specified, the name in the app store will be used. Number of characters allowed- 1-40. If the name in the app store exceeds 40 characters, you must pass in a new app name with this field.
   * @return appName
  **/
  @Schema(description = "App name that is displayed in the ad.  If not specified, the name in the app store will be used. Number of characters allowed- 1-40. If the name in the app store exceeds 40 characters, you must pass in a new app name with this field.")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public AdcreateCreatives avatarIconWebUri(String avatarIconWebUri) {
    this.avatarIconWebUri = avatarIconWebUri;
    return this;
  }

   /**
   * ID of the avatar image. It can be uploaded through the [Upload an image](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739067433456642) endpoint (picture ratio requirement is 1- 1
   * @return avatarIconWebUri
  **/
  @Schema(description = "ID of the avatar image. It can be uploaded through the [Upload an image](https://ads.tiktok.com/marketing_api/docs?id=1739067433456642) endpoint (picture ratio requirement is 1- 1")
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
   * Post-bid third-party brand safety measurement partner. Enum values- &#x60;DOUBLE_VERIFY&#x60;, &#x60;IAS&#x60;, &#x60;ZEFR&#x60;. You can use [/tool/vast_option/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1755436556897281) to get available post-bid third-party measurement partners.
   * @return brandSafetyPostbidPartner
  **/
  @Schema(description = "Post-bid third-party brand safety measurement partner. Enum values- `DOUBLE_VERIFY`, `IAS`, `ZEFR`. You can use [/tool/vast_option/](https://ads.tiktok.com/marketing_api/docs?id=1755436556897281) to get available post-bid third-party measurement partners.")
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
   * The wrapped VAST URL used by the post-bid third-party partner to measure brand safety. Required when &#x60;brand_safety_postbid_partner&#x60; &#x3D; &#x60;IAS&#x60;. You need to get the URL from the measurement partner IAS
   * @return brandSafetyVastUrl
  **/
  @Schema(description = "The wrapped VAST URL used by the post-bid third-party partner to measure brand safety. Required when `brand_safety_postbid_partner` = `IAS`. You need to get the URL from the measurement partner IAS")
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
   * Call-to-action text. For TikTok ads, either this field or &#x60;call_to_action_id&#x60; must be specified. If both are specified, this field will be ignored. For enum values, see [Enumeration - Call-to-Action](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). For live shopping events, the call to action must be &#x60;WATCH_LIVE&#x60;.
   * @return callToAction
  **/
  @Schema(description = "Call-to-action text. For TikTok ads, either this field or `call_to_action_id` must be specified. If both are specified, this field will be ignored. For enum values, see [Enumeration - Call-to-Action](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). For live shopping events, the call to action must be `WATCH_LIVE`.")
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
   * The ID of the CTA portfolio that you want to use in your ads. A CTA portfolio is a group of auto-optimized CTAs. If both this field and &#x60;call_to_action&#x60; are specified, this field will be used, and &#x60;call_to_action&#x60; will be ignored. For details about auto-optimized CTAs, see [CTA Recommendations - Auto-Optimized CTAs](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740307296329730).
   * @return callToActionId
  **/
  @Schema(description = "The ID of the CTA portfolio that you want to use in your ads. A CTA portfolio is a group of auto-optimized CTAs. If both this field and `call_to_action` are specified, this field will be used, and `call_to_action` will be ignored. For details about auto-optimized CTAs, see [CTA Recommendations - Auto-Optimized CTAs](https://ads.tiktok.com/marketing_api/docs?id=1740307296329730).")
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
   * Image card ID, gift code card ID, premium badge ID, Countdown Sticker ID, or Download Card ID. To learn about how to get an image card ID or gift card ID, please see [Use Cards in Ads]
   * @return cardId
  **/
  @Schema(description = "Image card ID, gift code card ID, premium badge ID, Countdown Sticker ID, or Download Card ID. To learn about how to get an image card ID or gift card ID, please see [Use Cards in Ads]")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public AdcreateCreatives cardImageId(String cardImageId) {
    this.cardImageId = cardImageId;
    return this;
  }

   /**
   * Required if card_type&#x3D;IMAGE
   * @return cardImageId
  **/
  @Schema(description = "Required if card_type=IMAGE")
  public String getCardImageId() {
    return cardImageId;
  }

  public void setCardImageId(String cardImageId) {
    this.cardImageId = cardImageId;
  }

  public AdcreateCreatives cardImageIndex(Integer cardImageIndex) {
    this.cardImageIndex = cardImageIndex;
    return this;
  }

   /**
   * The index of product additional image list. The clients can use it to specify card image of product cards.
   * @return cardImageIndex
  **/
  @Schema(description = "The index of product additional image list. The clients can use it to specify card image of product cards.")
  public Integer getCardImageIndex() {
    return cardImageIndex;
  }

  public void setCardImageIndex(Integer cardImageIndex) {
    this.cardImageIndex = cardImageIndex;
  }

  public AdcreateCreatives cardShowPrice(Boolean cardShowPrice) {
    this.cardShowPrice = cardShowPrice;
    return this;
  }

   /**
   * Whether to show price on card or not
   * @return cardShowPrice
  **/
  @Schema(description = "Whether to show price on card or not")
  public Boolean isCardShowPrice() {
    return cardShowPrice;
  }

  public void setCardShowPrice(Boolean cardShowPrice) {
    this.cardShowPrice = cardShowPrice;
  }

  public AdcreateCreatives cardTags(List<String> cardTags) {
    this.cardTags = cardTags;
    return this;
  }

  public AdcreateCreatives addCardTagsItem(String cardTagsItem) {
    if (this.cardTags == null) {
      this.cardTags = new ArrayList<String>();
    }
    this.cardTags.add(cardTagsItem);
    return this;
  }

   /**
   * Enum values- &#x60;BRAND&#x60;,  &#x60;DESC&#x60;. Max size &#x3D; 2.
   * @return cardTags
  **/
  @Schema(description = "Enum values- `BRAND`,  `DESC`. Max size = 2.")
  public List<String> getCardTags() {
    return cardTags;
  }

  public void setCardTags(List<String> cardTags) {
    this.cardTags = cardTags;
  }

  public AdcreateCreatives cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Enum values- &#x60;IMAGE&#x60;, &#x60;PRODUCT&#x60;
   * @return cardType
  **/
  @Schema(description = "Enum values- `IMAGE`, `PRODUCT`")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public AdcreateCreatives catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Product catalog ID. Required for shop purchases ads. Products whose links are shown in the ad are from this catalog.
   * @return catalogId
  **/
  @Schema(description = "Product catalog ID. Required for shop purchases ads. Products whose links are shown in the ad are from this catalog.")
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
   * Click monitoring URL. Currently Pangle does not support DCM, Sizmek or Flashtalking.
   * @return clickTrackingUrl
  **/
  @Schema(description = "Click monitoring URL. Currently Pangle does not support DCM, Sizmek or Flashtalking.")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public AdcreateCreatives creativeAuthorized(Boolean creativeAuthorized) {
    this.creativeAuthorized = creativeAuthorized;
    return this;
  }

   /**
   * Whether you grant displaying some of your ads in our TikTok For Business Creative Center. Only valid for non-US advertisers, the default value is &#x60;false&#x60;.
   * @return creativeAuthorized
  **/
  @Schema(description = "Whether you grant displaying some of your ads in our TikTok For Business Creative Center. Only valid for non-US advertisers, the default value is `false`.")
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
   * Creative type for Shop Purchases or Product Sales scenarios. Required when &#x60;objective_type&#x60; is &#x60;SHOP_PURCHASES&#x60; or &#x60;PRODUCT_SALES.
   * @return creativeType
  **/
  @Schema(description = "Creative type for Shop Purchases or Product Sales scenarios. Required when `objective_type` is `SHOP_PURCHASES` or `PRODUCT_SALES.")
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
   * You can set this field to either &#x60;ON&#x60; or &#x60;OFF&#x60;. Default is &#x60;OFF&#x60;. If the ad is created as a dark post, it will not appear in the creator&#x27;s homepage.
   * @return darkPostStatus
  **/
  @Schema(description = "You can set this field to either `ON` or `OFF`. Default is `OFF`. If the ad is created as a dark post, it will not appear in the creator's homepage.")
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
   * The specific location where you want your audience to go if they have your app installed. See &#x60;deeplink_type&#x60; for more.
   * @return deeplink
  **/
  @Schema(description = "The specific location where you want your audience to go if they have your app installed. See `deeplink_type` for more.")
  public String getDeeplink() {
    return deeplink;
  }

  public void setDeeplink(String deeplink) {
    this.deeplink = deeplink;
  }

  public AdcreateCreatives deeplinkType(String deeplinkType) {
    this.deeplinkType = deeplinkType;
    return this;
  }

   /**
   * The open URL type. Allowed values differs based on campaign objectives. Allowed values- &#x60;NORMAL&#x60;(supported in Traffic, Conversion), &#x60;DEFERRED_DEEPLINK&#x60;(supported in App Install). The default value is &#x60;NORMAL&#x60;. For an ad that will be included in an iOS 14 campaign, this field cannot be set to &#x60;DEFERRED_DEEPLINK&#x60;.
   * @return deeplinkType
  **/
  @Schema(description = "The open URL type. Allowed values differs based on campaign objectives. Allowed values- `NORMAL`(supported in Traffic, Conversion), `DEFERRED_DEEPLINK`(supported in App Install). The default value is `NORMAL`. For an ad that will be included in an iOS 14 campaign, this field cannot be set to `DEFERRED_DEEPLINK`.")
  public String getDeeplinkType() {
    return deeplinkType;
  }

  public void setDeeplinkType(String deeplinkType) {
    this.deeplinkType = deeplinkType;
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
   * The clickable disclaimer or clickable disclaimers that you want to add to the ad. Required when &#x60;disclaimer_type&#x60; &#x3D; &#x60;TEXT_LINK&#x60;. Max size- 3. If you use multiple clickable disclaimers, both the overall length for all the texts you pass in and the length of individual text need to be no more than 40 characters.
   * @return disclaimerClickableTexts
  **/
  @Schema(description = "The clickable disclaimer or clickable disclaimers that you want to add to the ad. Required when `disclaimer_type` = `TEXT_LINK`. Max size- 3. If you use multiple clickable disclaimers, both the overall length for all the texts you pass in and the length of individual text need to be no more than 40 characters.")
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
   * Type of disclaimer that you want to add to the ad. Enum values- &#x60;TEXT_LINK&#x60;(clickable disclaimers), &#x60;TEXT_ONLY&#x60;(text-only disclaimers). See [Include disclaimers in ads](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953274550273) to learn about how to configure disclaimer settings. Disclaimers are currently an allowlist-only feature for advertisers not registered in Canada and America using auction ad objectives, and for all advertisers using Reach &amp; Frequency ad objectives. If you would like to access it, please contact your TikTok representative. The disclaimer feature only supports the following advertising objectives- &#x60;APP_PROMOTION&#x60;, &#x60;WEB_CONVERSIONS&#x60;, &#x60;APP_INSTALL&#x60;, &#x60;CONVERSIONS&#x60;, &#x60;REACH&#x60;, &#x60;TRAFFIC&#x60;, &#x60;VIDEO_VIEWS&#x60;, &#x60;ENGAGEMENT&#x60;, &#x60;LEAD_GENERATION&#x60;, &#x60;RF_REACH&#x60;, &#x60;RF_TRAFFIC&#x60;, &#x60;RF_VIDEO_VIEW&#x60;.  The disclaimer feature only supports TikTok placement. The disclaimer feature is not supported for Automated Creative Optimization ads. Once added to your ads, the disclaimer cannot be deleted.
   * @return disclaimerType
  **/
  @Schema(description = "Type of disclaimer that you want to add to the ad. Enum values- `TEXT_LINK`(clickable disclaimers), `TEXT_ONLY`(text-only disclaimers). See [Include disclaimers in ads](https://ads.tiktok.com/marketing_api/docs?id=1739953274550273) to learn about how to configure disclaimer settings. Disclaimers are currently an allowlist-only feature for advertisers not registered in Canada and America using auction ad objectives, and for all advertisers using Reach & Frequency ad objectives. If you would like to access it, please contact your TikTok representative. The disclaimer feature only supports the following advertising objectives- `APP_PROMOTION`, `WEB_CONVERSIONS`, `APP_INSTALL`, `CONVERSIONS`, `REACH`, `TRAFFIC`, `VIDEO_VIEWS`, `ENGAGEMENT`, `LEAD_GENERATION`, `RF_REACH`, `RF_TRAFFIC`, `RF_VIDEO_VIEW`.  The disclaimer feature only supports TikTok placement. The disclaimer feature is not supported for Automated Creative Optimization ads. Once added to your ads, the disclaimer cannot be deleted.")
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
   * The display name of landing page or pure exposure ad, length limit- 1-40 English characters, or 1-20 Chinese/Japanese/Korean characters, required when the promotion type is landing page or pure exposure
   * @return displayName
  **/
  @Schema(description = "The display name of landing page or pure exposure ad, length limit- 1-40 English characters, or 1-20 Chinese/Japanese/Korean characters, required when the promotion type is landing page or pure exposure")
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
   * Enum values- &#x60;UNSET&#x60;, &#x60;DLP&#x60;(Dynamic Landing Page)
   * @return dynamicDestination
  **/
  @Schema(description = "Enum values- `UNSET`, `DLP`(Dynamic Landing Page)")
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
   * Enum values- &#x60;UNSET&#x60;, &#x60;DYNAMIC_CREATIVE&#x60;(smart creative).
   * @return dynamicFormat
  **/
  @Schema(description = "Enum values- `UNSET`, `DYNAMIC_CREATIVE`(smart creative).")
  public String getDynamicFormat() {
    return dynamicFormat;
  }

  public void setDynamicFormat(String dynamicFormat) {
    this.dynamicFormat = dynamicFormat;
  }

  public AdcreateCreatives fallbackType(String fallbackType) {
    this.fallbackType = fallbackType;
    return this;
  }

   /**
   * Fallback Type. If the audience do not have the app installed, you can have them fall back to install the app, or to view a specific web page. Allowed values- &#x60;APP_INSTALL&#x60;, &#x60;WEBSITE&#x60;, &#x60;UNSET&#x60;. If website is chosen, you need to specify the url via &#x60;landing_page_url&#x60; field.
   * @return fallbackType
  **/
  @Schema(description = "Fallback Type. If the audience do not have the app installed, you can have them fall back to install the app, or to view a specific web page. Allowed values- `APP_INSTALL`, `WEBSITE`, `UNSET`. If website is chosen, you need to specify the url via `landing_page_url` field.")
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
   * ID of the Business Center that a TikTok Account User in Business Center identity is associated with. Required when &#x60;identity_type&#x60; is &#x60;BC_AUTH_TT&#x60;.
   * @return identityAuthorizedBcId
  **/
  @Schema(description = "ID of the Business Center that a TikTok Account User in Business Center identity is associated with. Required when `identity_type` is `BC_AUTH_TT`.")
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
   * Identity ID, required when you use Spark Ads (&#x60;tiktok_item_id&#x60;). If you are not using Spark Ads, we still highly recommend you to pass in &#x60;ideneity_id&#x60; and &#x60;identity_type&#x60; (&#x60;CUSTOMIZED_USER&#x60;) for better management of ads information.
   * @return identityId
  **/
  @Schema(description = "Identity ID, required when you use Spark Ads (`tiktok_item_id`). If you are not using Spark Ads, we still highly recommend you to pass in `ideneity_id` and `identity_type` (`CUSTOMIZED_USER`) for better management of ads information.")
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
   * Identity type. Enum- &#x60;CUSTOMIZED_USER&#x60;, &#x60;AUTH_CODE&#x60;, &#x60;TT_USER&#x60;, &#x60;BC_AUTH_TT&#x60;.  For details about identities, see [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097).
   * @return identityType
  **/
  @Schema(description = "Identity type. Enum- `CUSTOMIZED_USER`, `AUTH_CODE`, `TT_USER`, `BC_AUTH_TT`.  For details about identities, see [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097).")
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
   * A list of image IDs (image used in an ad or as a video cover). You can get the image ID when you upload an image using the [/file/image/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739067433456642) endpoint. When the ad_format is &#x60;SINGLE_VIDEO&#x60;, the value of this field will be used as the video cover (thumbnail) (only one value is allowed), and the aspect ratio of the image should be the same as the video.
   * @return imageIds
  **/
  @Schema(description = "A list of image IDs (image used in an ad or as a video cover). You can get the image ID when you upload an image using the [/file/image/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id=1739067433456642) endpoint. When the ad_format is `SINGLE_VIDEO`, the value of this field will be used as the video cover (thumbnail) (only one value is allowed), and the aspect ratio of the image should be the same as the video.")
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
   * Display monitoring URL
   * @return impressionTrackingUrl
  **/
  @Schema(description = "Display monitoring URL")
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
   * Using TikTok instant page or not. When dynamic_destination &#x3D; DLP, you don&#x27;t need this parameter.When dynamic_destination &#x3D; UNSET, you need to turn on this parameter to use instant page and pass page id.
   * @return instantProductPageUsed
  **/
  @Schema(description = "Using TikTok instant page or not. When dynamic_destination = DLP, you don't need this parameter.When dynamic_destination = UNSET, you need to turn on this parameter to use instant page and pass page id.")
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
   * Whether to enable dueting for the Spark Ad. This field is valid only when &#x60;promotional_music_disabled&#x60; is set to &#x60;false&#x60;. Enum values- &#x60;ENABLE&#x60;, &#x60;DISABLE&#x60;. This field is only valid for Spark Ad posts.
   * @return itemDuetStatus
  **/
  @Schema(description = "Whether to enable dueting for the Spark Ad. This field is valid only when `promotional_music_disabled` is set to `false`. Enum values- `ENABLE`, `DISABLE`. This field is only valid for Spark Ad posts.")
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
   * Product SPU ID
   * @return itemGroupIds
  **/
  @Schema(description = "Product SPU ID")
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
   * Whether to enable stitching for the Spark Ad. This field is valid only when &#x60;promotional_music_disabled&#x60; is set to &#x60;false&#x60;. Enum values- &#x60;ENABLE&#x60;, &#x60;DISABLE&#x60;. This field is only valid for Spark Ad posts.
   * @return itemStitchStatus
  **/
  @Schema(description = "Whether to enable stitching for the Spark Ad. This field is valid only when `promotional_music_disabled` is set to `false`. Enum values- `ENABLE`, `DISABLE`. This field is only valid for Spark Ad posts.")
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
   * Landing page URL.
   * @return landingPageUrl
  **/
  @Schema(description = "Landing page URL.")
  public String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  public AdcreateCreatives operationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
    return this;
  }

   /**
   * The status of the ad when created. Enum values- &#x60;ENABLE&#x60; - The ad is enabled when created. &#x60;DISABLE&#x60; - The ad is disabled when created. Default value- &#x60;ENABLE&#x60;. If you want to update the status of the ad after creation, use the [/ad/status/update/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953422970882) endpoint.
   * @return operationStatus
  **/
  @Schema(description = "The status of the ad when created. Enum values- `ENABLE` - The ad is enabled when created. `DISABLE` - The ad is disabled when created. Default value- `ENABLE`. If you want to update the status of the ad after creation, use the [/ad/status/update/](https://ads.tiktok.com/marketing_api/docs?id=1739953422970882) endpoint.")
  public String getOperationStatus() {
    return operationStatus;
  }

  public void setOperationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
  }

  public AdcreateCreatives pageId(Integer pageId) {
    this.pageId = pageId;
    return this;
  }

   /**
   * Page (Instant form, Custom TikTok Instant Page or App Profile Page) ID, which can be created by [Instant Page Editor SDK](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740307202170881). Instant Forms are for &#x60;LEAD_GENERATION&#x60; campaign objective. Only applicable for TikTok placement. Before creating for the first time, you need to sign the &#x60;LeadAds&#x60; agreement through the [/term/confirm/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737192284435457) endpoint. This field is ignored for &#x60;SHOP_PURCHASES&#x60; objective. Note- We will sunset the Collection Ads on Feb.16,2023. To ensure a seamless experience, please don&#x27;t set a storefront page as your instant page.
   * @return pageId
  **/
  @Schema(description = "Page (Instant form, Custom TikTok Instant Page or App Profile Page) ID, which can be created by [Instant Page Editor SDK](https://ads.tiktok.com/marketing_api/docs?id=1740307202170881). Instant Forms are for `LEAD_GENERATION` campaign objective. Only applicable for TikTok placement. Before creating for the first time, you need to sign the `LeadAds` agreement through the [/term/confirm/](https://ads.tiktok.com/marketing_api/docs?id=1737192284435457) endpoint. This field is ignored for `SHOP_PURCHASES` objective. Note- We will sunset the Collection Ads on Feb.16,2023. To ensure a seamless experience, please don't set a storefront page as your instant page.")
  public Integer getPageId() {
    return pageId;
  }

  public void setPageId(Integer pageId) {
    this.pageId = pageId;
  }

  public AdcreateCreatives pageImageIndex(Integer pageImageIndex) {
    this.pageImageIndex = pageImageIndex;
    return this;
  }

   /**
   * The index of page.
   * @return pageImageIndex
  **/
  @Schema(description = "The index of page.")
  public Integer getPageImageIndex() {
    return pageImageIndex;
  }

  public void setPageImageIndex(Integer pageImageIndex) {
    this.pageImageIndex = pageImageIndex;
  }

  public AdcreateCreatives playableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * Playable material url, valid in Pangle and TikTok placement. You can get the url via the [/playable/get/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737732758495234) endpoint. Note that all ads in the same ad group share the same playble material.
   * @return playableUrl
  **/
  @Schema(description = "Playable material url, valid in Pangle and TikTok placement. You can get the url via the [/playable/get/](https://ads.tiktok.com/marketing_api/docs?id=1737732758495234) endpoint. Note that all ads in the same ad group share the same playble material.")
  public String getPlayableUrl() {
    return playableUrl;
  }

  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }

  public AdcreateCreatives productSetId(String productSetId) {
    this.productSetId = productSetId;
    return this;
  }

   /**
   * The ID of the product set.
   * @return productSetId
  **/
  @Schema(description = "The ID of the product set.")
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
   * Different dimensions to choose products. Enum values- &#x60;ALL&#x60;,&#x60; PRODUCT_SET&#x60;, &#x60;CUSTOMIZED_PRODUCTS&#x60;. If you choose &#x60;ALL&#x60;, you don&#x27;t need to input &#x60;sku_ids&#x60; or  &#x60;item_group_ids&#x60;  or &#x60;product_set_id&#x60;.  &#x60;item_group_ids&#x60;  or &#x60;product_set_id&#x60; are required if &#x60;product_specific_type&#x60;&#x3D;&#x60;PRODUCT_SET&#x60;. &#x60;sku_ids&#x60; are required if &#x60;product_specific_type&#x60;&#x3D;&#x60;CUSTOMIZED_PRODUCTS&#x60;
   * @return productSpecificType
  **/
  @Schema(description = "Different dimensions to choose products. Enum values- `ALL`,` PRODUCT_SET`, `CUSTOMIZED_PRODUCTS`. If you choose `ALL`, you don't need to input `sku_ids` or  `item_group_ids`  or `product_set_id`.  `item_group_ids`  or `product_set_id` are required if `product_specific_type`=`PRODUCT_SET`. `sku_ids` are required if `product_specific_type`=`CUSTOMIZED_PRODUCTS`")
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
   * Whether to disable the promotional use of the music in the Spark Ad. The default value is &#x60;true&#x60;. If you want to allow dueting and stitching for the TikTok video, you need to set this field to &#x60;false&#x60;. This field is only valid for Spark Ad posts.
   * @return promotionalMusicDisabled
  **/
  @Schema(description = "Whether to disable the promotional use of the music in the Spark Ad. The default value is `true`. If you want to allow dueting and stitching for the TikTok video, you need to set this field to `false`. This field is only valid for Spark Ad posts.")
  public Boolean isPromotionalMusicDisabled() {
    return promotionalMusicDisabled;
  }

  public void setPromotionalMusicDisabled(Boolean promotionalMusicDisabled) {
    this.promotionalMusicDisabled = promotionalMusicDisabled;
  }

  public AdcreateCreatives shoppingAdsDeeplinkType(String shoppingAdsDeeplinkType) {
    this.shoppingAdsDeeplinkType = shoppingAdsDeeplinkType;
    return this;
  }

   /**
   * Indicates the source of the direct link used in the Shopping Ad. When specified as &#x60;CUSTOM&#x60;, the direct link is written in the deeplink field. &lt;br data-tomark-pass&gt;  Optional values- &#x60;NONE&#x60;(not enabled),&#x60;CUSTOM&#x60;(custom direct link),&#x60;SHOPPING_ADS&#x60;(commodity direct link). The default value is &#x60;NONE&#x60;.
   * @return shoppingAdsDeeplinkType
  **/
  @Schema(description = "Indicates the source of the direct link used in the Shopping Ad. When specified as `CUSTOM`, the direct link is written in the deeplink field. <br data-tomark-pass>  Optional values- `NONE`(not enabled),`CUSTOM`(custom direct link),`SHOPPING_ADS`(commodity direct link). The default value is `NONE`.")
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
   * In the Shopping Ads redirection scenario, the fallback behavior of deeplink evokes failed.  When specified as &#x60;CUSTOM&#x60;, fallback_url written to the &#x60;landing_page_url&#x60;. Optional values- &#x60;DEFAULT&#x60;(Application Installation),&#x60;CUSTOM&#x60;(Custom Landing Page),&#x60;SHOPPING_ADS&#x60;(Catalog Product Link). Required when the corresponding campaign &#x60;objective_type&#x60; is &#x60;PRODUCT_SALES&#x60;.
   * @return shoppingAdsFallbackType
  **/
  @Schema(description = "In the Shopping Ads redirection scenario, the fallback behavior of deeplink evokes failed.  When specified as `CUSTOM`, fallback_url written to the `landing_page_url`. Optional values- `DEFAULT`(Application Installation),`CUSTOM`(Custom Landing Page),`SHOPPING_ADS`(Catalog Product Link). Required when the corresponding campaign `objective_type` is `PRODUCT_SALES`.")
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
   * Product video package ID. Use the [/catalog/video/get/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740574099715073) endpoint to get video package IDs.|
   * @return shoppingAdsVideoPackageId
  **/
  @Schema(description = "Product video package ID. Use the [/catalog/video/get/](https://ads.tiktok.com/marketing_api/docs?id=1740574099715073) endpoint to get video package IDs.|")
  public String getShoppingAdsVideoPackageId() {
    return shoppingAdsVideoPackageId;
  }

  public void setShoppingAdsVideoPackageId(String shoppingAdsVideoPackageId) {
    this.shoppingAdsVideoPackageId = shoppingAdsVideoPackageId;
  }

  public AdcreateCreatives shoppingAdsWordSet(List<Integer> shoppingAdsWordSet) {
    this.shoppingAdsWordSet = shoppingAdsWordSet;
    return this;
  }

  public AdcreateCreatives addShoppingAdsWordSetItem(Integer shoppingAdsWordSetItem) {
    if (this.shoppingAdsWordSet == null) {
      this.shoppingAdsWordSet = new ArrayList<Integer>();
    }
    this.shoppingAdsWordSet.add(shoppingAdsWordSetItem);
    return this;
  }

   /**
   * Shopping Ads word set
   * @return shoppingAdsWordSet
  **/
  @Schema(description = "Shopping Ads word set")
  public List<Integer> getShoppingAdsWordSet() {
    return shoppingAdsWordSet;
  }

  public void setShoppingAdsWordSet(List<Integer> shoppingAdsWordSet) {
    this.shoppingAdsWordSet = shoppingAdsWordSet;
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
   * IDs of the SKUs
   * @return skuIds
  **/
  @Schema(description = "IDs of the SKUs")
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
   * The ID of the TikTok post to be used as an ad (Spark Ad). Pass in the &#x60;item_id&#x60; you get from the response of the [/tt_video/info/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738376324021250) or [/identity/video/get/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740218475032577) endpoint. This field is required for Spark Ads.  Note- By using Spark Ads, you confirm that you have the rights to use the music in the videos for commercial purposes
   * @return tiktokItemId
  **/
  @Schema(description = "The ID of the TikTok post to be used as an ad (Spark Ad). Pass in the `item_id` you get from the response of the [/tt_video/info/](https://ads.tiktok.com/marketing_api/docs?id=1738376324021250) or [/identity/video/get/](https://ads.tiktok.com/marketing_api/docs?id=1740218475032577) endpoint. This field is required for Spark Ads.  Note- By using Spark Ads, you confirm that you have the rights to use the music in the videos for commercial purposes")
  public String getTiktokItemId() {
    return tiktokItemId;
  }

  public void setTiktokItemId(String tiktokItemId) {
    this.tiktokItemId = tiktokItemId;
  }

  public AdcreateCreatives trackingPixelId(Integer trackingPixelId) {
    this.trackingPixelId = trackingPixelId;
    return this;
  }

   /**
   * The pixel ID that you&#x27;d like to track. You can use this field to track offsite events. It supports the campaign objectives for both Auction ads (&#x60;REACH&#x60;, &#x60;VIDEO_VIEWS&#x60;, &#x60;TRAFFIC&#x60;, &#x60;CONVERSIONS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, &#x60;LEAD_GENERATION&#x60;, &#x60;APP_PROMOTION&#x60;, &#x60;PRODUCT_SALES&#x60;, &#x60;ENGAGEMENT&#x60;) and Reach &amp; Frequency ads (&#x60;RF_REACH&#x60;, &#x60;RF_TRAFFIC&#x60;, &#x60;RF_VIDEO_VIEW&#x60;). For Auction objectives. If &#x60;pixel_id&#x60;!&#x3D;0 at the ad group level  and  you want to use pixel to track offsite events, then the pixel ID you pass in the &#x60;tracking_pixel_id&#x60; field must be the same ID that you specified in the &#x60;pixel_id&#x60; field for the ad group. Otherwise, you can pass in any pixel ID that you&#x27;d like to track in the &#x60;tracking_pixel_id&#x60; field. This field is an allowlist feature if your campaign objective is &#x60;ENGAGEMENT&#x60;/ &#x60;PRODUCT_SALES&#x60; (when &#x60;product_source&#x60; &#x3D; &#x60;CATALOG&#x60; / &#x60;STORE&#x60; and &#x60;shopping_ads_type&#x60; &#x3D; &#x60;VIDEO&#x60;) /&#x60;APP_PROMOTION&#x60;(when &#x60;app_promotion_type&#x60; &#x3D; &#x60;APP_RETARGETING&#x60; ). If you want to use the field, please reach out to your TikTok representative.For Reach &amp; Frequency objectives You can pass in any pixel ID that you&#x27;d like to track in the &#x60;tracking_pixel_id&#x60; field.
   * @return trackingPixelId
  **/
  @Schema(description = "The pixel ID that you'd like to track. You can use this field to track offsite events. It supports the campaign objectives for both Auction ads (`REACH`, `VIDEO_VIEWS`, `TRAFFIC`, `CONVERSIONS`, `WEB_CONVERSIONS`, `LEAD_GENERATION`, `APP_PROMOTION`, `PRODUCT_SALES`, `ENGAGEMENT`) and Reach & Frequency ads (`RF_REACH`, `RF_TRAFFIC`, `RF_VIDEO_VIEW`). For Auction objectives. If `pixel_id`!=0 at the ad group level  and  you want to use pixel to track offsite events, then the pixel ID you pass in the `tracking_pixel_id` field must be the same ID that you specified in the `pixel_id` field for the ad group. Otherwise, you can pass in any pixel ID that you'd like to track in the `tracking_pixel_id` field. This field is an allowlist feature if your campaign objective is `ENGAGEMENT`/ `PRODUCT_SALES` (when `product_source` = `CATALOG` / `STORE` and `shopping_ads_type` = `VIDEO`) /`APP_PROMOTION`(when `app_promotion_type` = `APP_RETARGETING` ). If you want to use the field, please reach out to your TikTok representative.For Reach & Frequency objectives You can pass in any pixel ID that you'd like to track in the `tracking_pixel_id` field.")
  public Integer getTrackingPixelId() {
    return trackingPixelId;
  }

  public void setTrackingPixelId(Integer trackingPixelId) {
    this.trackingPixelId = trackingPixelId;
  }

  public AdcreateCreatives vastMoatEnabled(Boolean vastMoatEnabled) {
    this.vastMoatEnabled = vastMoatEnabled;
    return this;
  }

   /**
   * Whether Moat Viewability Verification is enabled for the ad. TikTok has partnered with Moat to launch viewability measurement for Brand Auction and Reach &amp; Frequency In-feed ads purchased on TikTok for Business. Default value- &#x60;false&#x60;.
   * @return vastMoatEnabled
  **/
  @Schema(description = "Whether Moat Viewability Verification is enabled for the ad. TikTok has partnered with Moat to launch viewability measurement for Brand Auction and Reach & Frequency In-feed ads purchased on TikTok for Business. Default value- `false`.")
  public Boolean isVastMoatEnabled() {
    return vastMoatEnabled;
  }

  public void setVastMoatEnabled(Boolean vastMoatEnabled) {
    this.vastMoatEnabled = vastMoatEnabled;
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
   * Video ID. Required when the creative type is standard videos. For Spark Ads, use &#x60;tiktok_item_id&#x60; to specify the TikTok post ID. You can find out video IDs by using the [/file/video/ad/search/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740050472224769) endpoint. Note- To ensure a smooth integration journey, we recommned that you use [/file/video/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737587322856449)(&#x60;upload_type&#x60; &#x3D; &#x60;UPLOAD_BY_VIDEO_ID&#x60;)to bind video ID with your advertiser ID.
   * @return videoId
  **/
  @Schema(description = "Video ID. Required when the creative type is standard videos. For Spark Ads, use `tiktok_item_id` to specify the TikTok post ID. You can find out video IDs by using the [/file/video/ad/search/](https://ads.tiktok.com/marketing_api/docs?id=1740050472224769) endpoint. Note- To ensure a smooth integration journey, we recommned that you use [/file/video/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id=1737587322856449)(`upload_type` = `UPLOAD_BY_VIDEO_ID`)to bind video ID with your advertiser ID.")
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
   * The monitoring URL for video view.
   * @return videoViewTrackingUrl
  **/
  @Schema(description = "The monitoring URL for video view.")
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
   * Post-bid third-party viewability measurement partner. Enum values- &#x60;MOAT&#x60;, &#x60;DOUBLE_VERIFY&#x60;, &#x60;IAS&#x60;. You can use [/tool/vast_option/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1755436556897281) to get available post-bid third-party measurement partners. Note - ost-bid third-party viewability measurement is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative.  See [Brand safety](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739381752981505) to learn about the supported advertising objectives, supported markets, and the general introduction of post-bid measurement.
   * @return viewabilityPostbidPartner
  **/
  @Schema(description = "Post-bid third-party viewability measurement partner. Enum values- `MOAT`, `DOUBLE_VERIFY`, `IAS`. You can use [/tool/vast_option/](https://ads.tiktok.com/marketing_api/docs?id=1755436556897281) to get available post-bid third-party measurement partners. Note - ost-bid third-party viewability measurement is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative.  See [Brand safety](https://ads.tiktok.com/marketing_api/docs?id=1739381752981505) to learn about the supported advertising objectives, supported markets, and the general introduction of post-bid measurement.")
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
   * The wrapped VAST URL used by the post-bid third-party partner to measure viewability. Required when &#x60;viewability_postbid_partner&#x60; &#x3D; &#x60;IAS&#x60;. You need to get the URL from the measurement partner IAS. Post-bid third-party viewability measurement is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative. Post-bid third-party measurement is not supported for ACO ads. Post-bid third-party measurement is not supported for ad groups where &#x60;promotion_type&#x60; is set as &#x60;LIVE_SHOPPING&#x60;.
   * @return viewabilityVastUrl
  **/
  @Schema(description = "The wrapped VAST URL used by the post-bid third-party partner to measure viewability. Required when `viewability_postbid_partner` = `IAS`. You need to get the URL from the measurement partner IAS. Post-bid third-party viewability measurement is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative. Post-bid third-party measurement is not supported for ACO ads. Post-bid third-party measurement is not supported for ad groups where `promotion_type` is set as `LIVE_SHOPPING`.")
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
        Objects.equals(this.appName, adcreateCreatives.appName) &&
        Objects.equals(this.avatarIconWebUri, adcreateCreatives.avatarIconWebUri) &&
        Objects.equals(this.brandSafetyPostbidPartner, adcreateCreatives.brandSafetyPostbidPartner) &&
        Objects.equals(this.brandSafetyVastUrl, adcreateCreatives.brandSafetyVastUrl) &&
        Objects.equals(this.callToAction, adcreateCreatives.callToAction) &&
        Objects.equals(this.callToActionId, adcreateCreatives.callToActionId) &&
        Objects.equals(this.cardId, adcreateCreatives.cardId) &&
        Objects.equals(this.cardImageId, adcreateCreatives.cardImageId) &&
        Objects.equals(this.cardImageIndex, adcreateCreatives.cardImageIndex) &&
        Objects.equals(this.cardShowPrice, adcreateCreatives.cardShowPrice) &&
        Objects.equals(this.cardTags, adcreateCreatives.cardTags) &&
        Objects.equals(this.cardType, adcreateCreatives.cardType) &&
        Objects.equals(this.catalogId, adcreateCreatives.catalogId) &&
        Objects.equals(this.clickTrackingUrl, adcreateCreatives.clickTrackingUrl) &&
        Objects.equals(this.creativeAuthorized, adcreateCreatives.creativeAuthorized) &&
        Objects.equals(this.creativeType, adcreateCreatives.creativeType) &&
        Objects.equals(this.darkPostStatus, adcreateCreatives.darkPostStatus) &&
        Objects.equals(this.deeplink, adcreateCreatives.deeplink) &&
        Objects.equals(this.deeplinkType, adcreateCreatives.deeplinkType) &&
        Objects.equals(this.disclaimerClickableTexts, adcreateCreatives.disclaimerClickableTexts) &&
        Objects.equals(this.disclaimerText, adcreateCreatives.disclaimerText) &&
        Objects.equals(this.disclaimerType, adcreateCreatives.disclaimerType) &&
        Objects.equals(this.displayName, adcreateCreatives.displayName) &&
        Objects.equals(this.dynamicDestination, adcreateCreatives.dynamicDestination) &&
        Objects.equals(this.dynamicFormat, adcreateCreatives.dynamicFormat) &&
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
        Objects.equals(this.operationStatus, adcreateCreatives.operationStatus) &&
        Objects.equals(this.pageId, adcreateCreatives.pageId) &&
        Objects.equals(this.pageImageIndex, adcreateCreatives.pageImageIndex) &&
        Objects.equals(this.playableUrl, adcreateCreatives.playableUrl) &&
        Objects.equals(this.productSetId, adcreateCreatives.productSetId) &&
        Objects.equals(this.productSpecificType, adcreateCreatives.productSpecificType) &&
        Objects.equals(this.promotionalMusicDisabled, adcreateCreatives.promotionalMusicDisabled) &&
        Objects.equals(this.shoppingAdsDeeplinkType, adcreateCreatives.shoppingAdsDeeplinkType) &&
        Objects.equals(this.shoppingAdsFallbackType, adcreateCreatives.shoppingAdsFallbackType) &&
        Objects.equals(this.shoppingAdsVideoPackageId, adcreateCreatives.shoppingAdsVideoPackageId) &&
        Objects.equals(this.shoppingAdsWordSet, adcreateCreatives.shoppingAdsWordSet) &&
        Objects.equals(this.skuIds, adcreateCreatives.skuIds) &&
        Objects.equals(this.tiktokItemId, adcreateCreatives.tiktokItemId) &&
        Objects.equals(this.trackingPixelId, adcreateCreatives.trackingPixelId) &&
        Objects.equals(this.vastMoatEnabled, adcreateCreatives.vastMoatEnabled) &&
        Objects.equals(this.verticalVideoStrategy, adcreateCreatives.verticalVideoStrategy) &&
        Objects.equals(this.videoId, adcreateCreatives.videoId) &&
        Objects.equals(this.videoViewTrackingUrl, adcreateCreatives.videoViewTrackingUrl) &&
        Objects.equals(this.viewabilityPostbidPartner, adcreateCreatives.viewabilityPostbidPartner) &&
        Objects.equals(this.viewabilityVastUrl, adcreateCreatives.viewabilityVastUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adFormat, adName, adText, appName, avatarIconWebUri, brandSafetyPostbidPartner, brandSafetyVastUrl, callToAction, callToActionId, cardId, cardImageId, cardImageIndex, cardShowPrice, cardTags, cardType, catalogId, clickTrackingUrl, creativeAuthorized, creativeType, darkPostStatus, deeplink, deeplinkType, disclaimerClickableTexts, disclaimerText, disclaimerType, displayName, dynamicDestination, dynamicFormat, fallbackType, identityAuthorizedBcId, identityId, identityType, imageIds, impressionTrackingUrl, instantProductPageUsed, itemDuetStatus, itemGroupIds, itemStitchStatus, landingPageUrl, operationStatus, pageId, pageImageIndex, playableUrl, productSetId, productSpecificType, promotionalMusicDisabled, shoppingAdsDeeplinkType, shoppingAdsFallbackType, shoppingAdsVideoPackageId, shoppingAdsWordSet, skuIds, tiktokItemId, trackingPixelId, vastMoatEnabled, verticalVideoStrategy, videoId, videoViewTrackingUrl, viewabilityPostbidPartner, viewabilityVastUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdcreateCreatives {\n");
    
    sb.append("    adFormat: ").append(toIndentedString(adFormat)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    adText: ").append(toIndentedString(adText)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    avatarIconWebUri: ").append(toIndentedString(avatarIconWebUri)).append("\n");
    sb.append("    brandSafetyPostbidPartner: ").append(toIndentedString(brandSafetyPostbidPartner)).append("\n");
    sb.append("    brandSafetyVastUrl: ").append(toIndentedString(brandSafetyVastUrl)).append("\n");
    sb.append("    callToAction: ").append(toIndentedString(callToAction)).append("\n");
    sb.append("    callToActionId: ").append(toIndentedString(callToActionId)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    cardImageId: ").append(toIndentedString(cardImageId)).append("\n");
    sb.append("    cardImageIndex: ").append(toIndentedString(cardImageIndex)).append("\n");
    sb.append("    cardShowPrice: ").append(toIndentedString(cardShowPrice)).append("\n");
    sb.append("    cardTags: ").append(toIndentedString(cardTags)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    clickTrackingUrl: ").append(toIndentedString(clickTrackingUrl)).append("\n");
    sb.append("    creativeAuthorized: ").append(toIndentedString(creativeAuthorized)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    darkPostStatus: ").append(toIndentedString(darkPostStatus)).append("\n");
    sb.append("    deeplink: ").append(toIndentedString(deeplink)).append("\n");
    sb.append("    deeplinkType: ").append(toIndentedString(deeplinkType)).append("\n");
    sb.append("    disclaimerClickableTexts: ").append(toIndentedString(disclaimerClickableTexts)).append("\n");
    sb.append("    disclaimerText: ").append(toIndentedString(disclaimerText)).append("\n");
    sb.append("    disclaimerType: ").append(toIndentedString(disclaimerType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dynamicDestination: ").append(toIndentedString(dynamicDestination)).append("\n");
    sb.append("    dynamicFormat: ").append(toIndentedString(dynamicFormat)).append("\n");
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
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    pageImageIndex: ").append(toIndentedString(pageImageIndex)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    productSetId: ").append(toIndentedString(productSetId)).append("\n");
    sb.append("    productSpecificType: ").append(toIndentedString(productSpecificType)).append("\n");
    sb.append("    promotionalMusicDisabled: ").append(toIndentedString(promotionalMusicDisabled)).append("\n");
    sb.append("    shoppingAdsDeeplinkType: ").append(toIndentedString(shoppingAdsDeeplinkType)).append("\n");
    sb.append("    shoppingAdsFallbackType: ").append(toIndentedString(shoppingAdsFallbackType)).append("\n");
    sb.append("    shoppingAdsVideoPackageId: ").append(toIndentedString(shoppingAdsVideoPackageId)).append("\n");
    sb.append("    shoppingAdsWordSet: ").append(toIndentedString(shoppingAdsWordSet)).append("\n");
    sb.append("    skuIds: ").append(toIndentedString(skuIds)).append("\n");
    sb.append("    tiktokItemId: ").append(toIndentedString(tiktokItemId)).append("\n");
    sb.append("    trackingPixelId: ").append(toIndentedString(trackingPixelId)).append("\n");
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
