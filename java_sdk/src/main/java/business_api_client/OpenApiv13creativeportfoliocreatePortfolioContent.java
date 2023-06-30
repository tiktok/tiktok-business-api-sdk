/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13creativeportfoliocreateAdvancedAudioInfo;
import business_api_client.OpenApiv13creativeportfoliocreateAdvancedGestureIcon;
import business_api_client.OpenApiv13creativeportfoliocreateBadgeImageInfo;
import business_api_client.OpenApiv13creativeportfoliocreateBadgePosition;
import business_api_client.OpenApiv13creativeportfoliocreateStickerParam;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * The content of the portfolio
 */
@Schema(description = "The content of the portfolio")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-06-28T14:49:22.099759+05:30[Asia/Kolkata]")
public class OpenApiv13creativeportfoliocreatePortfolioContent {
  @JsonProperty("advanced_audio_info")
  private OpenApiv13creativeportfoliocreateAdvancedAudioInfo advancedAudioInfo = null;

  @JsonProperty("advanced_gesture_icon")
  private OpenApiv13creativeportfoliocreateAdvancedGestureIcon advancedGestureIcon = null;

  @JsonProperty("advanced_gesture_image")
  private OpenApiv13creativeportfoliocreateAdvancedGestureIcon advancedGestureImage = null;

  @JsonProperty("call_to_action_text")
  private String callToActionText = null;

  @JsonProperty("badge_image_info")
  private OpenApiv13creativeportfoliocreateBadgeImageInfo badgeImageInfo = null;

  @JsonProperty("advanced_interact_shape")
  private String advancedInteractShape = null;

  @JsonProperty("advanced_interact_type")
  private String advancedInteractType = null;

  @JsonProperty("badge_position")
  private OpenApiv13creativeportfoliocreateBadgePosition badgePosition = null;

  @JsonProperty("badge_show_time")
  private Integer badgeShowTime = null;

  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("asset_content")
  private String assetContent = null;

  @JsonProperty("asset_ids")
  private List<String> assetIds = null;

  @JsonProperty("profile_image")
  private String profileImage = null;

  @JsonProperty("category_label")
  private String categoryLabel = null;

  @JsonProperty("country_code")
  private List<String> countryCode = null;

  @JsonProperty("call_to_action")
  private String callToAction = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("image_id")
  private String imageId = null;

  @JsonProperty("layouts")
  private List<String> layouts = null;

  @JsonProperty("mobile_app_id")
  private String mobileAppId = null;

  @JsonProperty("product_source")
  private String productSource = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("identity_authorized_bc_id")
  private String identityAuthorizedBcId = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("catalog_authorized_bc_id")
  private String catalogAuthorizedBcId = null;

  @JsonProperty("store_id")
  private String storeId = null;

  @JsonProperty("store_authorized_bc_id")
  private String storeAuthorizedBcId = null;

  @JsonProperty("product_specific_type")
  private String productSpecificType = null;

  @JsonProperty("product_set_id")
  private String productSetId = null;

  @JsonProperty("dynamic_format")
  private String dynamicFormat = null;

  @JsonProperty("vertical_video_strategy")
  private String verticalVideoStrategy = null;

  @JsonProperty("ad_text")
  private String adText = null;

  @JsonProperty("card_show_price")
  private Boolean cardShowPrice = null;

  @JsonProperty("card_image_index")
  private Integer cardImageIndex = null;

  @JsonProperty("card_tags")
  private List<String> cardTags = null;

  @JsonProperty("item_group_ids")
  private List<String> itemGroupIds = null;

  @JsonProperty("sku_ids")
  private List<String> skuIds = null;

  @JsonProperty("sticker_param")
  private OpenApiv13creativeportfoliocreateStickerParam stickerParam = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("card_type")
  private String cardType = null;

  public OpenApiv13creativeportfoliocreatePortfolioContent advancedAudioInfo(OpenApiv13creativeportfoliocreateAdvancedAudioInfo advancedAudioInfo) {
    this.advancedAudioInfo = advancedAudioInfo;
    return this;
  }

   /**
   * Get advancedAudioInfo
   * @return advancedAudioInfo
  **/
  @Schema(description = "")
  public OpenApiv13creativeportfoliocreateAdvancedAudioInfo getAdvancedAudioInfo() {
    return advancedAudioInfo;
  }

  public void setAdvancedAudioInfo(OpenApiv13creativeportfoliocreateAdvancedAudioInfo advancedAudioInfo) {
    this.advancedAudioInfo = advancedAudioInfo;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent advancedGestureIcon(OpenApiv13creativeportfoliocreateAdvancedGestureIcon advancedGestureIcon) {
    this.advancedGestureIcon = advancedGestureIcon;
    return this;
  }

   /**
   * Get advancedGestureIcon
   * @return advancedGestureIcon
  **/
  @Schema(description = "")
  public OpenApiv13creativeportfoliocreateAdvancedGestureIcon getAdvancedGestureIcon() {
    return advancedGestureIcon;
  }

  public void setAdvancedGestureIcon(OpenApiv13creativeportfoliocreateAdvancedGestureIcon advancedGestureIcon) {
    this.advancedGestureIcon = advancedGestureIcon;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent advancedGestureImage(OpenApiv13creativeportfoliocreateAdvancedGestureIcon advancedGestureImage) {
    this.advancedGestureImage = advancedGestureImage;
    return this;
  }

   /**
   * Get advancedGestureImage
   * @return advancedGestureImage
  **/
  @Schema(description = "")
  public OpenApiv13creativeportfoliocreateAdvancedGestureIcon getAdvancedGestureImage() {
    return advancedGestureImage;
  }

  public void setAdvancedGestureImage(OpenApiv13creativeportfoliocreateAdvancedGestureIcon advancedGestureImage) {
    this.advancedGestureImage = advancedGestureImage;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent callToActionText(String callToActionText) {
    this.callToActionText = callToActionText;
    return this;
  }

   /**
   * The call-to-action text that will be shown below the image/badge
   * @return callToActionText
  **/
  @Schema(description = "The call-to-action text that will be shown below the image/badge")
  public String getCallToActionText() {
    return callToActionText;
  }

  public void setCallToActionText(String callToActionText) {
    this.callToActionText = callToActionText;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent badgeImageInfo(OpenApiv13creativeportfoliocreateBadgeImageInfo badgeImageInfo) {
    this.badgeImageInfo = badgeImageInfo;
    return this;
  }

   /**
   * Get badgeImageInfo
   * @return badgeImageInfo
  **/
  @Schema(description = "")
  public OpenApiv13creativeportfoliocreateBadgeImageInfo getBadgeImageInfo() {
    return badgeImageInfo;
  }

  public void setBadgeImageInfo(OpenApiv13creativeportfoliocreateBadgeImageInfo badgeImageInfo) {
    this.badgeImageInfo = badgeImageInfo;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent advancedInteractShape(String advancedInteractShape) {
    this.advancedInteractShape = advancedInteractShape;
    return this;
  }

   /**
   * Get advancedInteractShape
   * @return advancedInteractShape
  **/
  @Schema(description = "")
  public String getAdvancedInteractShape() {
    return advancedInteractShape;
  }

  public void setAdvancedInteractShape(String advancedInteractShape) {
    this.advancedInteractShape = advancedInteractShape;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent advancedInteractType(String advancedInteractType) {
    this.advancedInteractType = advancedInteractType;
    return this;
  }

   /**
   * Get advancedInteractType
   * @return advancedInteractType
  **/
  @Schema(description = "")
  public String getAdvancedInteractType() {
    return advancedInteractType;
  }

  public void setAdvancedInteractType(String advancedInteractType) {
    this.advancedInteractType = advancedInteractType;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent badgePosition(OpenApiv13creativeportfoliocreateBadgePosition badgePosition) {
    this.badgePosition = badgePosition;
    return this;
  }

   /**
   * Get badgePosition
   * @return badgePosition
  **/
  @Schema(description = "")
  public OpenApiv13creativeportfoliocreateBadgePosition getBadgePosition() {
    return badgePosition;
  }

  public void setBadgePosition(OpenApiv13creativeportfoliocreateBadgePosition badgePosition) {
    this.badgePosition = badgePosition;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent badgeShowTime(Integer badgeShowTime) {
    this.badgeShowTime = badgeShowTime;
    return this;
  }

   /**
   * When the premium badge will start to show, in seconds. The first three seconds and the last five seconds of the video cannot be used as the badge show start time
   * @return badgeShowTime
  **/
  @Schema(description = "When the premium badge will start to show, in seconds. The first three seconds and the last five seconds of the video cannot be used as the badge show start time")
  public Integer getBadgeShowTime() {
    return badgeShowTime;
  }

  public void setBadgeShowTime(Integer badgeShowTime) {
    this.badgeShowTime = badgeShowTime;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;DOWNLOAD_CARD&#x60;. ID of the app that you want to promote in the Download Card. It is the App ID from Events Manager
   * @return appId
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. ID of the app that you want to promote in the Download Card. It is the App ID from Events Manager")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent assetContent(String assetContent) {
    this.assetContent = assetContent;
    return this;
  }

   /**
   * A call-to-action text. For example, &#x60;\&quot;Learn More\&quot;&#x60;. This field is required when &#x60;creative_portfolio_type&#x60; is &#x60;CTA&#x60;
   * @return assetContent
  **/
  @Schema(description = "A call-to-action text. For example, `\"Learn More\"`. This field is required when `creative_portfolio_type` is `CTA`")
  public String getAssetContent() {
    return assetContent;
  }

  public void setAssetContent(String assetContent) {
    this.assetContent = assetContent;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent assetIds(List<String> assetIds) {
    this.assetIds = assetIds;
    return this;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent addAssetIdsItem(String assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<String>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * A list of CTAs. For example, &#x60;[201781, 201535]&#x60;. This field is required when &#x60;creative_portfolio_type&#x60; is &#x60;CTA&#x60;. To create a CTA portfolio, you need to get a group of auto-optimized CTAs by using &#x60;/creative/cta/recommend/&#x60;. Fetch the data in the response and include it as values to this field. Note: Auto-optimized CTAs can only be used in the advertiser accounts that they were created for.
   * @return assetIds
  **/
  @Schema(description = "A list of CTAs. For example, `[201781, 201535]`. This field is required when `creative_portfolio_type` is `CTA`. To create a CTA portfolio, you need to get a group of auto-optimized CTAs by using `/creative/cta/recommend/`. Fetch the data in the response and include it as values to this field. Note: Auto-optimized CTAs can only be used in the advertiser accounts that they were created for.")
  public List<String> getAssetIds() {
    return assetIds;
  }

  public void setAssetIds(List<String> assetIds) {
    this.assetIds = assetIds;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;DOWNLOAD_CARD&#x60;. Profile image URL
   * @return profileImage
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. Profile image URL")
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent categoryLabel(String categoryLabel) {
    this.categoryLabel = categoryLabel;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;DOWNLOAD_CARD&#x60; and the value of &#x60;tags&#x60; includes &#x60;CATEGORIES&#x60;. Category name of the app you want to promote in the Download Card. See [Enumerations-Creative Management-Category Labels](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) for the enum values, and you need to pass the value as string
   * @return categoryLabel
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `DOWNLOAD_CARD` and the value of `tags` includes `CATEGORIES`. Category name of the app you want to promote in the Download Card. See [Enumerations-Creative Management-Category Labels](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138) for the enum values, and you need to pass the value as string")
  public String getCategoryLabel() {
    return categoryLabel;
  }

  public void setCategoryLabel(String categoryLabel) {
    this.categoryLabel = categoryLabel;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent countryCode(List<String> countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent addCountryCodeItem(String countryCodeItem) {
    if (this.countryCode == null) {
      this.countryCode = new ArrayList<String>();
    }
    this.countryCode.add(countryCodeItem);
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;DOWNLOAD_CARD&#x60;. Country or location code of the region you want to target. For enum values, see [Appendix - Location code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737585867307010)
   * @return countryCode
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. Country or location code of the region you want to target. For enum values, see [Appendix - Location code](https://ads.tiktok.com/marketing_api/docs?id=1737585867307010)")
  public List<String> getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(List<String> countryCode) {
    this.countryCode = countryCode;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent callToAction(String callToAction) {
    this.callToAction = callToAction;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;DOWNLOAD_CARD&#x60;. Call-to-action text in the Download Card
   * @return callToAction
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. Call-to-action text in the Download Card")
  public String getCallToAction() {
    return callToAction;
  }

  public void setCallToAction(String callToAction) {
    this.callToAction = callToAction;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;DOWNLOAD_CARD&#x60; and the value of &#x60;layouts&#x60; includes &#x60;TYPE_1&#x60;. Description of the app that you want to promote in the Download Card
   * @return description
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `DOWNLOAD_CARD` and the value of `layouts` includes `TYPE_1`. Description of the app that you want to promote in the Download Card")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Image ID. Required when &#x60;creative_portfolio_type&#x60; is &#x60;CARD&#x60;
   * @return imageId
  **/
  @Schema(description = "Image ID. Required when `creative_portfolio_type` is `CARD`")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent layouts(List<String> layouts) {
    this.layouts = layouts;
    return this;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent addLayoutsItem(String layoutsItem) {
    if (this.layouts == null) {
      this.layouts = new ArrayList<String>();
    }
    this.layouts.add(layoutsItem);
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;DOWNLOAD_CARD&#x60;. The layout type of the Download Card. Enum values: &#x60;TYPE_1&#x60;: Type 1, showing app description in the Download Card. &#x60;TYPE_2&#x60; : Type 2, not showing app description in the Download Card. You can pass in one or two layout types, and when you pass in both &#x60;TYPE_1&#x60; and &#x60;TYPE_2&#x60; in this field, you will create one Type 1 Download Card and one Type 2 Download Card
   * @return layouts
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. The layout type of the Download Card. Enum values: `TYPE_1`: Type 1, showing app description in the Download Card. `TYPE_2` : Type 2, not showing app description in the Download Card. You can pass in one or two layout types, and when you pass in both `TYPE_1` and `TYPE_2` in this field, you will create one Type 1 Download Card and one Type 2 Download Card")
  public List<String> getLayouts() {
    return layouts;
  }

  public void setLayouts(List<String> layouts) {
    this.layouts = layouts;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent mobileAppId(String mobileAppId) {
    this.mobileAppId = mobileAppId;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;DOWNLOAD_CARD&#x60;. Mobile App ID, used to extract tag information from Google Play or App Store. For an iOS app, please find the ID number in the app’s App Store URL as the string of numbers directly after &#x60;id&#x60;. For instance, in &#x60;https://apps.apple.com/us/app/hyperpure/id1203646221&#x60; the ID would be &#x60;1203646221&#x60;. For an Android app, please find the package name in the app’s Google Play store URL after &#x60;id&#x60;. For instance, in &#x60;https://play.google.com/store/apps/details?id&#x3D;com.innersloth.spacemafia&#x60; the ID would be &#x60;com.innersloth.spacemafia&#x60;.
   * @return mobileAppId
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. Mobile App ID, used to extract tag information from Google Play or App Store. For an iOS app, please find the ID number in the app’s App Store URL as the string of numbers directly after `id`. For instance, in `https://apps.apple.com/us/app/hyperpure/id1203646221` the ID would be `1203646221`. For an Android app, please find the package name in the app’s Google Play store URL after `id`. For instance, in `https://play.google.com/store/apps/details?id=com.innersloth.spacemafia` the ID would be `com.innersloth.spacemafia`.")
  public String getMobileAppId() {
    return mobileAppId;
  }

  public void setMobileAppId(String mobileAppId) {
    this.mobileAppId = mobileAppId;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent productSource(String productSource) {
    this.productSource = productSource;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60;. Product source where you want to get products for promotion. Enum values: &#x60;UNSET&#x60;, &#x60;CATALOG&#x60;(Catalog), &#x60;STORE&#x60; (TikTok Shop or TikTok Storefront (third-party store)). If you set this field as &#x60;STORE&#x60;, you need to pass in &#x60;item_group_ids&#x60; at the same time. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product.
   * @return productSource
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD`. Product source where you want to get products for promotion. Enum values: `UNSET`, `CATALOG`(Catalog), `STORE` (TikTok Shop or TikTok Storefront (third-party store)). If you set this field as `STORE`, you need to pass in `item_group_ids` at the same time. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product.")
  public String getProductSource() {
    return productSource;
  }

  public void setProductSource(String productSource) {
    this.productSource = productSource;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60;. Identity ID
   * @return identityId
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD`. Identity ID")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60;. Identity type. Enum values: &#x60;CUSTOMIZED_USER&#x60;, &#x60;AUTH_CODE&#x60;, &#x60;TT_USER&#x60;, &#x60;BC_AUTH_TT&#x60;. For details about identities, see [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097)
   * @return identityType
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD`. Identity type. Enum values: `CUSTOMIZED_USER`, `AUTH_CODE`, `TT_USER`, `BC_AUTH_TT`. For details about identities, see [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097)")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent identityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and &#x60;identity_type&#x60; is &#x60;BC_AUTH_TT&#x60;.  ID of the Business Center that a TikTok Account User in Business Center identity is associated with
   * @return identityAuthorizedBcId
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD` and `identity_type` is `BC_AUTH_TT`.  ID of the Business Center that a TikTok Account User in Business Center identity is associated with")
  public String getIdentityAuthorizedBcId() {
    return identityAuthorizedBcId;
  }

  public void setIdentityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60;. Catalog ID. Note: You can use [/store/list/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1752267762718722) to get the &#x60;catalog_id&#x60;, &#x60;store_id&#x60; and &#x60;store_authorized_bc_id&#x60; for available stores under an ad account. If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product.
   * @return catalogId
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD`. Catalog ID. Note: You can use [/store/list/](https://ads.tiktok.com/marketing_api/docs?id=1752267762718722) to get the `catalog_id`, `store_id` and `store_authorized_bc_id` for available stores under an ad account. If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product.")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent catalogAuthorizedBcId(String catalogAuthorizedBcId) {
    this.catalogAuthorizedBcId = catalogAuthorizedBcId;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and &#x60;product_source&#x60; is set as &#x60;CATALOG&#x60;.ID of the Business Center that is authorized to access the catalog (&#x60;catalog_id&#x60;). Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
   * @return catalogAuthorizedBcId
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `CATALOG`.ID of the Business Center that is authorized to access the catalog (`catalog_id`). Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product")
  public String getCatalogAuthorizedBcId() {
    return catalogAuthorizedBcId;
  }

  public void setCatalogAuthorizedBcId(String catalogAuthorizedBcId) {
    this.catalogAuthorizedBcId = catalogAuthorizedBcId;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and &#x60;product_source&#x60; is set as &#x60;STORE&#x60;. ID of the TikTok Storefront or TikTok Shop. Note:  To get the TikTok Storefront ID or TikTok Shop ID, you can use [/bc/asset/get/]( https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739432717798401):  When in the response &#x60;asset_type&#x60; is &#x60;STOREFRONT&#x60;, the returned &#x60;asset_id&#x60; is the TikTok Storefront ID.  When in the response &#x60;asset_type&#x60; is &#x60;TIKTOK_SHOP&#x60;, the returned &#x60;asset_id&#x60; is the TikTok Shop ID.  A store of the TikTok Storefront type (store_id) can be used to create ad groups only when a TikTok account has been bound to the store. You can use [/store/list/]( https://ads.tiktok.com/marketing_api/docs?id&#x3D;1752267762718722) to check the binding status of a TikTok Storefront via &#x60;tiktok_account_binding_status&#x60; in the response. If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product.
   * @return storeId
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `STORE`. ID of the TikTok Storefront or TikTok Shop. Note:  To get the TikTok Storefront ID or TikTok Shop ID, you can use [/bc/asset/get/]( https://ads.tiktok.com/marketing_api/docs?id=1739432717798401):  When in the response `asset_type` is `STOREFRONT`, the returned `asset_id` is the TikTok Storefront ID.  When in the response `asset_type` is `TIKTOK_SHOP`, the returned `asset_id` is the TikTok Shop ID.  A store of the TikTok Storefront type (store_id) can be used to create ad groups only when a TikTok account has been bound to the store. You can use [/store/list/]( https://ads.tiktok.com/marketing_api/docs?id=1752267762718722) to check the binding status of a TikTok Storefront via `tiktok_account_binding_status` in the response. If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product.")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent storeAuthorizedBcId(String storeAuthorizedBcId) {
    this.storeAuthorizedBcId = storeAuthorizedBcId;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and &#x60;product_source&#x60; is set as &#x60;STORE&#x60;.  ID of the Business Center that is authorized to access the store (&#x60;store_id&#x60;). Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad group levelyou pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
   * @return storeAuthorizedBcId
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `STORE`.  ID of the Business Center that is authorized to access the store (`store_id`). Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad group levelyou pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product")
  public String getStoreAuthorizedBcId() {
    return storeAuthorizedBcId;
  }

  public void setStoreAuthorizedBcId(String storeAuthorizedBcId) {
    this.storeAuthorizedBcId = storeAuthorizedBcId;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent productSpecificType(String productSpecificType) {
    this.productSpecificType = productSpecificType;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and &#x60;product_source&#x60; is set as &#x60;CATALOG&#x60;. The way that you specify the products. Enum values:  &#x60;ALL&#x60;: All products. Allow TikTok to dynamically choose from all catalog products. You do not need to specify any of &#x60;sku_ids&#x60;, &#x60;item_group_ids&#x60; and &#x60;product_set_id&#x60; at the same time.&#x60;PRODUCT_SET&#x60;: Product set. Select a product set. TikTok will dynamically choose products from this set. You need to specify &#x60;item_group_ids&#x60; or &#x60;product_set_id&#x60; at the same time. &#x60;CUSTOMIZED_PRODUCTS&#x60;: Specific products. Select up to 20 products from your catalog. You need to specify &#x60;sku_ids&#x60; at the same time.Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
   * @return productSpecificType
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `CATALOG`. The way that you specify the products. Enum values:  `ALL`: All products. Allow TikTok to dynamically choose from all catalog products. You do not need to specify any of `sku_ids`, `item_group_ids` and `product_set_id` at the same time.`PRODUCT_SET`: Product set. Select a product set. TikTok will dynamically choose products from this set. You need to specify `item_group_ids` or `product_set_id` at the same time. `CUSTOMIZED_PRODUCTS`: Specific products. Select up to 20 products from your catalog. You need to specify `sku_ids` at the same time.Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product")
  public String getProductSpecificType() {
    return productSpecificType;
  }

  public void setProductSpecificType(String productSpecificType) {
    this.productSpecificType = productSpecificType;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent productSetId(String productSetId) {
    this.productSetId = productSetId;
    return this;
  }

   /**
   * When &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and &#x60;product_specific_type&#x60; &#x3D; &#x60;PRODUCT_SET&#x60;, you need to pass in either &#x60;product_set_id&#x60; or &#x60;item_group_ids&#x60;. ID of the Product Set. You can call [/catalog/set/get/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740570556295169) to get a list of Product Sets in a catalog under your Business Center. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
   * @return productSetId
  **/
  @Schema(description = "When `creative_portfolio_type`= `PRODUCT_CARD` and `product_specific_type` = `PRODUCT_SET`, you need to pass in either `product_set_id` or `item_group_ids`. ID of the Product Set. You can call [/catalog/set/get/](https://ads.tiktok.com/marketing_api/docs?id=1740570556295169) to get a list of Product Sets in a catalog under your Business Center. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product")
  public String getProductSetId() {
    return productSetId;
  }

  public void setProductSetId(String productSetId) {
    this.productSetId = productSetId;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent dynamicFormat(String dynamicFormat) {
    this.dynamicFormat = dynamicFormat;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and product_source is set as &#x60;CATALOG&#x60;. When &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and &#x60;product_source&#x60; is set as &#x60;STORE&#x60;, you cannot set &#x60;dynamic_format&#x60; as &#x60;DYNAMIC_CREATIVE&#x60;. You can choose not to pass in the field or set it as &#x60;UNSET&#x60;. Whether to enable Dynamic Format. Dynamic Format combines video creative, product cards, and landing pages into different variations based on a shopper purchase intent, maximizing conversions for you. Enum values: &#x60;UNSET&#x60;, &#x60;DYNAMIC_CREATIVE&#x60; (Use Dynamic Format to create smart creatives). Note:&#x60;dynamic_format&#x60; cannot be enabled for retargeting ads (i.e. when &#x60;shopping_ads_retargeting_type&#x60; in the ad group is not &#x60;OFF&#x60;). When &#x60;dynamic_format&#x60; &#x3D; &#x60;DYNAMIC_CREATIVE&#x60;, we will automatically create cards. This means that you will not need to pass all card related fields (&#x60;card_show_price&#x60;, &#x60;card_tags&#x60;, &#x60;card_image_index&#x60;). If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card.
   * @return dynamicFormat
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD` and product_source is set as `CATALOG`. When `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `STORE`, you cannot set `dynamic_format` as `DYNAMIC_CREATIVE`. You can choose not to pass in the field or set it as `UNSET`. Whether to enable Dynamic Format. Dynamic Format combines video creative, product cards, and landing pages into different variations based on a shopper purchase intent, maximizing conversions for you. Enum values: `UNSET`, `DYNAMIC_CREATIVE` (Use Dynamic Format to create smart creatives). Note:`dynamic_format` cannot be enabled for retargeting ads (i.e. when `shopping_ads_retargeting_type` in the ad group is not `OFF`). When `dynamic_format` = `DYNAMIC_CREATIVE`, we will automatically create cards. This means that you will not need to pass all card related fields (`card_show_price`, `card_tags`, `card_image_index`). If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card.")
  public String getDynamicFormat() {
    return dynamicFormat;
  }

  public void setDynamicFormat(String dynamicFormat) {
    this.dynamicFormat = dynamicFormat;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent verticalVideoStrategy(String verticalVideoStrategy) {
    this.verticalVideoStrategy = verticalVideoStrategy;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and &#x60;product_source&#x60; is set as &#x60;CATALOG&#x60;. When &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and &#x60;product_source&#x60; is set as &#x60;STORE&#x60;, you can choose not to pass in the field or set it as &#x60;SINGLE_VIDEO&#x60;. The video type that you use for Product Sales scenarios. Enum values: &#x60;UNSET&#x60; (unset), &#x60;SINGLE_VIDEO&#x60; (single video), &#x60;CATALOG_VIDEOS&#x60; (catalog video).  It must be &#x60;UNSET&#x60; if &#x60;dynamic_format&#x60; &#x3D; &#x60;DYNAMIC_CREATIVE&#x60;. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card
   * @return verticalVideoStrategy
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `CATALOG`. When `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `STORE`, you can choose not to pass in the field or set it as `SINGLE_VIDEO`. The video type that you use for Product Sales scenarios. Enum values: `UNSET` (unset), `SINGLE_VIDEO` (single video), `CATALOG_VIDEOS` (catalog video).  It must be `UNSET` if `dynamic_format` = `DYNAMIC_CREATIVE`. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card")
  public String getVerticalVideoStrategy() {
    return verticalVideoStrategy;
  }

  public void setVerticalVideoStrategy(String verticalVideoStrategy) {
    this.verticalVideoStrategy = verticalVideoStrategy;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent adText(String adText) {
    this.adText = adText;
    return this;
  }

   /**
   * Valid when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60;. An ad text. It is shown to your audience as part of your ad creative, to deliver the message you intend to communicate to them.  If you do not know how to create effective ad texts, you can try the [Smart Text](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739084248002626) feature, which generates ad text recommendations based on the industry and language. Note: Ad text must be 1-100 characters long and cannot contain emoji.  Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
   * @return adText
  **/
  @Schema(description = "Valid when `creative_portfolio_type`= `PRODUCT_CARD`. An ad text. It is shown to your audience as part of your ad creative, to deliver the message you intend to communicate to them.  If you do not know how to create effective ad texts, you can try the [Smart Text](https://ads.tiktok.com/marketing_api/docs?id=1739084248002626) feature, which generates ad text recommendations based on the industry and language. Note: Ad text must be 1-100 characters long and cannot contain emoji.  Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.")
  public String getAdText() {
    return adText;
  }

  public void setAdText(String adText) {
    this.adText = adText;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent cardShowPrice(Boolean cardShowPrice) {
    this.cardShowPrice = cardShowPrice;
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60;.  Whether to show the price of products on the Product Card or not
   * @return cardShowPrice
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD`.  Whether to show the price of products on the Product Card or not")
  public Boolean isCardShowPrice() {
    return cardShowPrice;
  }

  public void setCardShowPrice(Boolean cardShowPrice) {
    this.cardShowPrice = cardShowPrice;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent cardImageIndex(Integer cardImageIndex) {
    this.cardImageIndex = cardImageIndex;
    return this;
  }

   /**
   * card_image_index | integer | Valid when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60;. You can use this field to specify the image used in the Product Card. The number you set via this field will be used as index to query the Image URLs you have passed through &#x60;additional_image_urls&#x60; in [/catalog/product/upload/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740497429681153). For instance, &#x60;card_image_index&#x60; &#x3D; 2 means that you will use the image via the second image URL in &#x60;additional_image_urls&#x60;
   * @return cardImageIndex
  **/
  @Schema(description = "card_image_index | integer | Valid when `creative_portfolio_type`= `PRODUCT_CARD`. You can use this field to specify the image used in the Product Card. The number you set via this field will be used as index to query the Image URLs you have passed through `additional_image_urls` in [/catalog/product/upload/](https://ads.tiktok.com/marketing_api/docs?id=1740497429681153). For instance, `card_image_index` = 2 means that you will use the image via the second image URL in `additional_image_urls`")
  public Integer getCardImageIndex() {
    return cardImageIndex;
  }

  public void setCardImageIndex(Integer cardImageIndex) {
    this.cardImageIndex = cardImageIndex;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent cardTags(List<String> cardTags) {
    this.cardTags = cardTags;
    return this;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent addCardTagsItem(String cardTagsItem) {
    if (this.cardTags == null) {
      this.cardTags = new ArrayList<String>();
    }
    this.cardTags.add(cardTagsItem);
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60;. The product tags that you want to show on the Product Card. Enum values: &#x60;BRAND&#x60; (Brand Name), &#x60;DESC&#x60; (Description)
   * @return cardTags
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `PRODUCT_CARD`. The product tags that you want to show on the Product Card. Enum values: `BRAND` (Brand Name), `DESC` (Description)")
  public List<String> getCardTags() {
    return cardTags;
  }

  public void setCardTags(List<String> cardTags) {
    this.cardTags = cardTags;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent itemGroupIds(List<String> itemGroupIds) {
    this.itemGroupIds = itemGroupIds;
    return this;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent addItemGroupIdsItem(String itemGroupIdsItem) {
    if (this.itemGroupIds == null) {
      this.itemGroupIds = new ArrayList<String>();
    }
    this.itemGroupIds.add(itemGroupIdsItem);
    return this;
  }

   /**
   *  Required when &#x60;creative_portfolio_type&#x60;is &#x60;PRODUCT_CARD&#x60; and &#x60;product_source&#x60; is set as &#x60;STORE&#x60;. When &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and &#x60;product_specific_type&#x60; &#x3D; PRODUCT_SET, you need to pass in either &#x60;product_set_id&#x60; or &#x60;item_group_ids&#x60;. Product SPU IDs. Max size: 20. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
   * @return itemGroupIds
  **/
  @Schema(description = " Required when `creative_portfolio_type`is `PRODUCT_CARD` and `product_source` is set as `STORE`. When `creative_portfolio_type`= `PRODUCT_CARD` and `product_specific_type` = PRODUCT_SET, you need to pass in either `product_set_id` or `item_group_ids`. Product SPU IDs. Max size: 20. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product")
  public List<String> getItemGroupIds() {
    return itemGroupIds;
  }

  public void setItemGroupIds(List<String> itemGroupIds) {
    this.itemGroupIds = itemGroupIds;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent skuIds(List<String> skuIds) {
    this.skuIds = skuIds;
    return this;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent addSkuIdsItem(String skuIdsItem) {
    if (this.skuIds == null) {
      this.skuIds = new ArrayList<String>();
    }
    this.skuIds.add(skuIdsItem);
    return this;
  }

   /**
   *  Required when &#x60;creative_portfolio_type&#x60;is &#x60;PRODUCT_CARD&#x60; and &#x60;product_source&#x60; is set as &#x60;STORE&#x60;. When &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;PRODUCT_CARD&#x60; and &#x60;product_specific_type&#x60; &#x3D; PRODUCT_SET, you need to pass in either &#x60;product_set_id&#x60; or &#x60;item_group_ids&#x60;. Product SPU IDs. Max size: 20. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
   * @return skuIds
  **/
  @Schema(description = " Required when `creative_portfolio_type`is `PRODUCT_CARD` and `product_source` is set as `STORE`. When `creative_portfolio_type`= `PRODUCT_CARD` and `product_specific_type` = PRODUCT_SET, you need to pass in either `product_set_id` or `item_group_ids`. Product SPU IDs. Max size: 20. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product")
  public List<String> getSkuIds() {
    return skuIds;
  }

  public void setSkuIds(List<String> skuIds) {
    this.skuIds = skuIds;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent stickerParam(OpenApiv13creativeportfoliocreateStickerParam stickerParam) {
    this.stickerParam = stickerParam;
    return this;
  }

   /**
   * Get stickerParam
   * @return stickerParam
  **/
  @Schema(description = "")
  public OpenApiv13creativeportfoliocreateStickerParam getStickerParam() {
    return stickerParam;
  }

  public void setStickerParam(OpenApiv13creativeportfoliocreateStickerParam stickerParam) {
    this.stickerParam = stickerParam;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Required when &#x60;creative_portfolio_type&#x60;&#x3D; &#x60;DOWNLOAD_CARD&#x60;. Tags for the Download Card. Enum values: &#x60;CATEGORIES&#x60;：Showing the category of the app you want to promote in the Download Card. &#x60;FILESIZE&#x60;：Showing the file size of the app you want to promote in the Download Card.  &#x60;RATING&#x60;：Showing the rating of the app you want to promote in the Download Card. &#x60;RANKING&#x60;：Showing the ranking of the app you want to promote in the Download Card. &#x60;COMMENT_VOLUME&#x60;：Showing the number of comments for the app you want to promote in the Download Card. Note: You can pass in multiple tags at one time, but when you pass in more than two tags, only two tags will show in the Download Card according to the following tag priority: &#x60;CATEGORIES&#x60; &gt; &#x60;FILESIZE&#x60; &gt; &#x60;RATING&#x60; &gt; &#x60;RANKING&#x60;&gt;&#x60;COMMENT_VOLUME&#x60;. For Type 1 Download Card, you need to pass in at least one tag. For Type 2 Download Card, you need to pass in at least two tags. 
   * @return tags
  **/
  @Schema(description = "Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. Tags for the Download Card. Enum values: `CATEGORIES`：Showing the category of the app you want to promote in the Download Card. `FILESIZE`：Showing the file size of the app you want to promote in the Download Card.  `RATING`：Showing the rating of the app you want to promote in the Download Card. `RANKING`：Showing the ranking of the app you want to promote in the Download Card. `COMMENT_VOLUME`：Showing the number of comments for the app you want to promote in the Download Card. Note: You can pass in multiple tags at one time, but when you pass in more than two tags, only two tags will show in the Download Card according to the following tag priority: `CATEGORIES` > `FILESIZE` > `RATING` > `RANKING`>`COMMENT_VOLUME`. For Type 1 Download Card, you need to pass in at least one tag. For Type 2 Download Card, you need to pass in at least two tags. ")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public OpenApiv13creativeportfoliocreatePortfolioContent cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Card type. Currently only image card portfolio (IMAGE) can be created with this endpoint. Required when creative_portfolio_type is CARD
   * @return cardType
  **/
  @Schema(description = "Card type. Currently only image card portfolio (IMAGE) can be created with this endpoint. Required when creative_portfolio_type is CARD")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13creativeportfoliocreatePortfolioContent openApiv13creativeportfoliocreatePortfolioContent = (OpenApiv13creativeportfoliocreatePortfolioContent) o;
    return Objects.equals(this.advancedAudioInfo, openApiv13creativeportfoliocreatePortfolioContent.advancedAudioInfo) &&
        Objects.equals(this.advancedGestureIcon, openApiv13creativeportfoliocreatePortfolioContent.advancedGestureIcon) &&
        Objects.equals(this.advancedGestureImage, openApiv13creativeportfoliocreatePortfolioContent.advancedGestureImage) &&
        Objects.equals(this.callToActionText, openApiv13creativeportfoliocreatePortfolioContent.callToActionText) &&
        Objects.equals(this.badgeImageInfo, openApiv13creativeportfoliocreatePortfolioContent.badgeImageInfo) &&
        Objects.equals(this.advancedInteractShape, openApiv13creativeportfoliocreatePortfolioContent.advancedInteractShape) &&
        Objects.equals(this.advancedInteractType, openApiv13creativeportfoliocreatePortfolioContent.advancedInteractType) &&
        Objects.equals(this.badgePosition, openApiv13creativeportfoliocreatePortfolioContent.badgePosition) &&
        Objects.equals(this.badgeShowTime, openApiv13creativeportfoliocreatePortfolioContent.badgeShowTime) &&
        Objects.equals(this.appId, openApiv13creativeportfoliocreatePortfolioContent.appId) &&
        Objects.equals(this.assetContent, openApiv13creativeportfoliocreatePortfolioContent.assetContent) &&
        Objects.equals(this.assetIds, openApiv13creativeportfoliocreatePortfolioContent.assetIds) &&
        Objects.equals(this.profileImage, openApiv13creativeportfoliocreatePortfolioContent.profileImage) &&
        Objects.equals(this.categoryLabel, openApiv13creativeportfoliocreatePortfolioContent.categoryLabel) &&
        Objects.equals(this.countryCode, openApiv13creativeportfoliocreatePortfolioContent.countryCode) &&
        Objects.equals(this.callToAction, openApiv13creativeportfoliocreatePortfolioContent.callToAction) &&
        Objects.equals(this.description, openApiv13creativeportfoliocreatePortfolioContent.description) &&
        Objects.equals(this.imageId, openApiv13creativeportfoliocreatePortfolioContent.imageId) &&
        Objects.equals(this.layouts, openApiv13creativeportfoliocreatePortfolioContent.layouts) &&
        Objects.equals(this.mobileAppId, openApiv13creativeportfoliocreatePortfolioContent.mobileAppId) &&
        Objects.equals(this.productSource, openApiv13creativeportfoliocreatePortfolioContent.productSource) &&
        Objects.equals(this.identityId, openApiv13creativeportfoliocreatePortfolioContent.identityId) &&
        Objects.equals(this.identityType, openApiv13creativeportfoliocreatePortfolioContent.identityType) &&
        Objects.equals(this.identityAuthorizedBcId, openApiv13creativeportfoliocreatePortfolioContent.identityAuthorizedBcId) &&
        Objects.equals(this.catalogId, openApiv13creativeportfoliocreatePortfolioContent.catalogId) &&
        Objects.equals(this.catalogAuthorizedBcId, openApiv13creativeportfoliocreatePortfolioContent.catalogAuthorizedBcId) &&
        Objects.equals(this.storeId, openApiv13creativeportfoliocreatePortfolioContent.storeId) &&
        Objects.equals(this.storeAuthorizedBcId, openApiv13creativeportfoliocreatePortfolioContent.storeAuthorizedBcId) &&
        Objects.equals(this.productSpecificType, openApiv13creativeportfoliocreatePortfolioContent.productSpecificType) &&
        Objects.equals(this.productSetId, openApiv13creativeportfoliocreatePortfolioContent.productSetId) &&
        Objects.equals(this.dynamicFormat, openApiv13creativeportfoliocreatePortfolioContent.dynamicFormat) &&
        Objects.equals(this.verticalVideoStrategy, openApiv13creativeportfoliocreatePortfolioContent.verticalVideoStrategy) &&
        Objects.equals(this.adText, openApiv13creativeportfoliocreatePortfolioContent.adText) &&
        Objects.equals(this.cardShowPrice, openApiv13creativeportfoliocreatePortfolioContent.cardShowPrice) &&
        Objects.equals(this.cardImageIndex, openApiv13creativeportfoliocreatePortfolioContent.cardImageIndex) &&
        Objects.equals(this.cardTags, openApiv13creativeportfoliocreatePortfolioContent.cardTags) &&
        Objects.equals(this.itemGroupIds, openApiv13creativeportfoliocreatePortfolioContent.itemGroupIds) &&
        Objects.equals(this.skuIds, openApiv13creativeportfoliocreatePortfolioContent.skuIds) &&
        Objects.equals(this.stickerParam, openApiv13creativeportfoliocreatePortfolioContent.stickerParam) &&
        Objects.equals(this.tags, openApiv13creativeportfoliocreatePortfolioContent.tags) &&
        Objects.equals(this.cardType, openApiv13creativeportfoliocreatePortfolioContent.cardType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedAudioInfo, advancedGestureIcon, advancedGestureImage, callToActionText, badgeImageInfo, advancedInteractShape, advancedInteractType, badgePosition, badgeShowTime, appId, assetContent, assetIds, profileImage, categoryLabel, countryCode, callToAction, description, imageId, layouts, mobileAppId, productSource, identityId, identityType, identityAuthorizedBcId, catalogId, catalogAuthorizedBcId, storeId, storeAuthorizedBcId, productSpecificType, productSetId, dynamicFormat, verticalVideoStrategy, adText, cardShowPrice, cardImageIndex, cardTags, itemGroupIds, skuIds, stickerParam, tags, cardType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13creativeportfoliocreatePortfolioContent {\n");
    
    sb.append("    advancedAudioInfo: ").append(toIndentedString(advancedAudioInfo)).append("\n");
    sb.append("    advancedGestureIcon: ").append(toIndentedString(advancedGestureIcon)).append("\n");
    sb.append("    advancedGestureImage: ").append(toIndentedString(advancedGestureImage)).append("\n");
    sb.append("    callToActionText: ").append(toIndentedString(callToActionText)).append("\n");
    sb.append("    badgeImageInfo: ").append(toIndentedString(badgeImageInfo)).append("\n");
    sb.append("    advancedInteractShape: ").append(toIndentedString(advancedInteractShape)).append("\n");
    sb.append("    advancedInteractType: ").append(toIndentedString(advancedInteractType)).append("\n");
    sb.append("    badgePosition: ").append(toIndentedString(badgePosition)).append("\n");
    sb.append("    badgeShowTime: ").append(toIndentedString(badgeShowTime)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    assetContent: ").append(toIndentedString(assetContent)).append("\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    categoryLabel: ").append(toIndentedString(categoryLabel)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    callToAction: ").append(toIndentedString(callToAction)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    layouts: ").append(toIndentedString(layouts)).append("\n");
    sb.append("    mobileAppId: ").append(toIndentedString(mobileAppId)).append("\n");
    sb.append("    productSource: ").append(toIndentedString(productSource)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    identityAuthorizedBcId: ").append(toIndentedString(identityAuthorizedBcId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogAuthorizedBcId: ").append(toIndentedString(catalogAuthorizedBcId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeAuthorizedBcId: ").append(toIndentedString(storeAuthorizedBcId)).append("\n");
    sb.append("    productSpecificType: ").append(toIndentedString(productSpecificType)).append("\n");
    sb.append("    productSetId: ").append(toIndentedString(productSetId)).append("\n");
    sb.append("    dynamicFormat: ").append(toIndentedString(dynamicFormat)).append("\n");
    sb.append("    verticalVideoStrategy: ").append(toIndentedString(verticalVideoStrategy)).append("\n");
    sb.append("    adText: ").append(toIndentedString(adText)).append("\n");
    sb.append("    cardShowPrice: ").append(toIndentedString(cardShowPrice)).append("\n");
    sb.append("    cardImageIndex: ").append(toIndentedString(cardImageIndex)).append("\n");
    sb.append("    cardTags: ").append(toIndentedString(cardTags)).append("\n");
    sb.append("    itemGroupIds: ").append(toIndentedString(itemGroupIds)).append("\n");
    sb.append("    skuIds: ").append(toIndentedString(skuIds)).append("\n");
    sb.append("    stickerParam: ").append(toIndentedString(stickerParam)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
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
