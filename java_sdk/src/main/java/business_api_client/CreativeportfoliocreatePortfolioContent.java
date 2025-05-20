/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CreativeportfoliocreateAdvancedAudioInfo;
import business_api_client.CreativeportfoliocreateAdvancedGestureIcon;
import business_api_client.CreativeportfoliocreateAdvancedGestureImage;
import business_api_client.CreativeportfoliocreateBadgeImageInfo;
import business_api_client.CreativeportfoliocreateBadgePosition;
import business_api_client.CreativeportfoliocreateShowcaseProducts;
import business_api_client.CreativeportfoliocreateSlideDimension;
import business_api_client.CreativeportfoliocreateStickerParam;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CreativeportfoliocreatePortfolioContent
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-05-20T12:00:30.004772-07:00[America/Los_Angeles]")
public class CreativeportfoliocreatePortfolioContent {
  @JsonProperty("ad_text")
  private String adText = null;

  @JsonProperty("advanced_audio_info")
  private CreativeportfoliocreateAdvancedAudioInfo advancedAudioInfo = null;

  @JsonProperty("advanced_gesture_icon")
  private CreativeportfoliocreateAdvancedGestureIcon advancedGestureIcon = null;

  @JsonProperty("advanced_gesture_image")
  private CreativeportfoliocreateAdvancedGestureImage advancedGestureImage = null;

  @JsonProperty("advanced_interact_shape")
  private String advancedInteractShape = null;

  @JsonProperty("advanced_interact_type")
  private String advancedInteractType = null;

  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("asset_content")
  private String assetContent = null;

  @JsonProperty("asset_ids")
  private List<String> assetIds = null;

  @JsonProperty("badge_image_info")
  private CreativeportfoliocreateBadgeImageInfo badgeImageInfo = null;

  @JsonProperty("badge_position")
  private CreativeportfoliocreateBadgePosition badgePosition = null;

  @JsonProperty("badge_show_time")
  private Long badgeShowTime = null;

  @JsonProperty("call_to_action")
  private String callToAction = null;

  @JsonProperty("call_to_action_text")
  private String callToActionText = null;

  @JsonProperty("card_image_index")
  private Long cardImageIndex = null;

  @JsonProperty("card_show_price")
  private Boolean cardShowPrice = null;

  @JsonProperty("card_tags")
  private List<String> cardTags = null;

  @JsonProperty("card_type")
  private String cardType = null;

  @JsonProperty("catalog_authorized_bc_id")
  private String catalogAuthorizedBcId = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("category_label")
  private String categoryLabel = null;

  @JsonProperty("country_code")
  private List<String> countryCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("display_price_enabled")
  private Boolean displayPriceEnabled = null;

  @JsonProperty("dynamic_format")
  private String dynamicFormat = "UNSET";

  @JsonProperty("gesture_type")
  private String gestureType = null;

  @JsonProperty("identity_authorized_bc_id")
  private String identityAuthorizedBcId = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("image_id")
  private String imageId = null;

  @JsonProperty("image_optimization_enabled")
  private Boolean imageOptimizationEnabled = null;

  @JsonProperty("interactive_music_id")
  private String interactiveMusicId = null;

  @JsonProperty("item_group_ids")
  private List<String> itemGroupIds = null;

  @JsonProperty("layouts")
  private List<String> layouts = null;

  @JsonProperty("mobile_app_id")
  private String mobileAppId = null;

  @JsonProperty("pop_up_window_image_id")
  private String popUpWindowImageId = null;

  @JsonProperty("primary_text")
  private String primaryText = null;

  @JsonProperty("product_set_id")
  private String productSetId = null;

  @JsonProperty("product_source")
  private String productSource = null;

  @JsonProperty("product_specific_type")
  private String productSpecificType = "UNSET";

  @JsonProperty("profile_image")
  private String profileImage = null;

  @JsonProperty("secondary_text")
  private String secondaryText = null;

  @JsonProperty("selling_points")
  private List<String> sellingPoints = null;

  @JsonProperty("showcase_products")
  private List<CreativeportfoliocreateShowcaseProducts> showcaseProducts = null;

  @JsonProperty("sku_ids")
  private List<String> skuIds = null;

  @JsonProperty("slide_dimension")
  private CreativeportfoliocreateSlideDimension slideDimension = null;

  @JsonProperty("slide_length")
  private Long slideLength = null;

  @JsonProperty("sticker_param")
  private CreativeportfoliocreateStickerParam stickerParam = null;

  @JsonProperty("store_authorized_bc_id")
  private String storeAuthorizedBcId = null;

  @JsonProperty("store_id")
  private String storeId = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("vertical_video_strategy")
  private String verticalVideoStrategy = null;

  public CreativeportfoliocreatePortfolioContent adText(String adText) {
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

  public CreativeportfoliocreatePortfolioContent advancedAudioInfo(CreativeportfoliocreateAdvancedAudioInfo advancedAudioInfo) {
    this.advancedAudioInfo = advancedAudioInfo;
    return this;
  }

   /**
   * Get advancedAudioInfo
   * @return advancedAudioInfo
  **/
  @Schema(description = "")
  public CreativeportfoliocreateAdvancedAudioInfo getAdvancedAudioInfo() {
    return advancedAudioInfo;
  }

  public void setAdvancedAudioInfo(CreativeportfoliocreateAdvancedAudioInfo advancedAudioInfo) {
    this.advancedAudioInfo = advancedAudioInfo;
  }

  public CreativeportfoliocreatePortfolioContent advancedGestureIcon(CreativeportfoliocreateAdvancedGestureIcon advancedGestureIcon) {
    this.advancedGestureIcon = advancedGestureIcon;
    return this;
  }

   /**
   * Get advancedGestureIcon
   * @return advancedGestureIcon
  **/
  @Schema(description = "")
  public CreativeportfoliocreateAdvancedGestureIcon getAdvancedGestureIcon() {
    return advancedGestureIcon;
  }

  public void setAdvancedGestureIcon(CreativeportfoliocreateAdvancedGestureIcon advancedGestureIcon) {
    this.advancedGestureIcon = advancedGestureIcon;
  }

  public CreativeportfoliocreatePortfolioContent advancedGestureImage(CreativeportfoliocreateAdvancedGestureImage advancedGestureImage) {
    this.advancedGestureImage = advancedGestureImage;
    return this;
  }

   /**
   * Get advancedGestureImage
   * @return advancedGestureImage
  **/
  @Schema(description = "")
  public CreativeportfoliocreateAdvancedGestureImage getAdvancedGestureImage() {
    return advancedGestureImage;
  }

  public void setAdvancedGestureImage(CreativeportfoliocreateAdvancedGestureImage advancedGestureImage) {
    this.advancedGestureImage = advancedGestureImage;
  }

  public CreativeportfoliocreatePortfolioContent advancedInteractShape(String advancedInteractShape) {
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

  public CreativeportfoliocreatePortfolioContent advancedInteractType(String advancedInteractType) {
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

  public CreativeportfoliocreatePortfolioContent appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @Schema(description = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public CreativeportfoliocreatePortfolioContent assetContent(String assetContent) {
    this.assetContent = assetContent;
    return this;
  }

   /**
   * Get assetContent
   * @return assetContent
  **/
  @Schema(description = "")
  public String getAssetContent() {
    return assetContent;
  }

  public void setAssetContent(String assetContent) {
    this.assetContent = assetContent;
  }

  public CreativeportfoliocreatePortfolioContent assetIds(List<String> assetIds) {
    this.assetIds = assetIds;
    return this;
  }

  public CreativeportfoliocreatePortfolioContent addAssetIdsItem(String assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<String>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * Get assetIds
   * @return assetIds
  **/
  @Schema(description = "")
  public List<String> getAssetIds() {
    return assetIds;
  }

  public void setAssetIds(List<String> assetIds) {
    this.assetIds = assetIds;
  }

  public CreativeportfoliocreatePortfolioContent badgeImageInfo(CreativeportfoliocreateBadgeImageInfo badgeImageInfo) {
    this.badgeImageInfo = badgeImageInfo;
    return this;
  }

   /**
   * Get badgeImageInfo
   * @return badgeImageInfo
  **/
  @Schema(description = "")
  public CreativeportfoliocreateBadgeImageInfo getBadgeImageInfo() {
    return badgeImageInfo;
  }

  public void setBadgeImageInfo(CreativeportfoliocreateBadgeImageInfo badgeImageInfo) {
    this.badgeImageInfo = badgeImageInfo;
  }

  public CreativeportfoliocreatePortfolioContent badgePosition(CreativeportfoliocreateBadgePosition badgePosition) {
    this.badgePosition = badgePosition;
    return this;
  }

   /**
   * Get badgePosition
   * @return badgePosition
  **/
  @Schema(description = "")
  public CreativeportfoliocreateBadgePosition getBadgePosition() {
    return badgePosition;
  }

  public void setBadgePosition(CreativeportfoliocreateBadgePosition badgePosition) {
    this.badgePosition = badgePosition;
  }

  public CreativeportfoliocreatePortfolioContent badgeShowTime(Long badgeShowTime) {
    this.badgeShowTime = badgeShowTime;
    return this;
  }

   /**
   * Get badgeShowTime
   * minimum: 3
   * @return badgeShowTime
  **/
  @Schema(description = "")
  public Long getBadgeShowTime() {
    return badgeShowTime;
  }

  public void setBadgeShowTime(Long badgeShowTime) {
    this.badgeShowTime = badgeShowTime;
  }

  public CreativeportfoliocreatePortfolioContent callToAction(String callToAction) {
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

  public CreativeportfoliocreatePortfolioContent callToActionText(String callToActionText) {
    this.callToActionText = callToActionText;
    return this;
  }

   /**
   * Get callToActionText
   * @return callToActionText
  **/
  @Schema(description = "")
  public String getCallToActionText() {
    return callToActionText;
  }

  public void setCallToActionText(String callToActionText) {
    this.callToActionText = callToActionText;
  }

  public CreativeportfoliocreatePortfolioContent cardImageIndex(Long cardImageIndex) {
    this.cardImageIndex = cardImageIndex;
    return this;
  }

   /**
   * Get cardImageIndex
   * minimum: 0
   * @return cardImageIndex
  **/
  @Schema(description = "")
  public Long getCardImageIndex() {
    return cardImageIndex;
  }

  public void setCardImageIndex(Long cardImageIndex) {
    this.cardImageIndex = cardImageIndex;
  }

  public CreativeportfoliocreatePortfolioContent cardShowPrice(Boolean cardShowPrice) {
    this.cardShowPrice = cardShowPrice;
    return this;
  }

   /**
   * Get cardShowPrice
   * @return cardShowPrice
  **/
  @Schema(description = "")
  public Boolean isCardShowPrice() {
    return cardShowPrice;
  }

  public void setCardShowPrice(Boolean cardShowPrice) {
    this.cardShowPrice = cardShowPrice;
  }

  public CreativeportfoliocreatePortfolioContent cardTags(List<String> cardTags) {
    this.cardTags = cardTags;
    return this;
  }

  public CreativeportfoliocreatePortfolioContent addCardTagsItem(String cardTagsItem) {
    if (this.cardTags == null) {
      this.cardTags = new ArrayList<String>();
    }
    this.cardTags.add(cardTagsItem);
    return this;
  }

   /**
   * Get cardTags
   * @return cardTags
  **/
  @Schema(description = "")
  public List<String> getCardTags() {
    return cardTags;
  }

  public void setCardTags(List<String> cardTags) {
    this.cardTags = cardTags;
  }

  public CreativeportfoliocreatePortfolioContent cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @Schema(description = "")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public CreativeportfoliocreatePortfolioContent catalogAuthorizedBcId(String catalogAuthorizedBcId) {
    this.catalogAuthorizedBcId = catalogAuthorizedBcId;
    return this;
  }

   /**
   * Get catalogAuthorizedBcId
   * @return catalogAuthorizedBcId
  **/
  @Schema(description = "")
  public String getCatalogAuthorizedBcId() {
    return catalogAuthorizedBcId;
  }

  public void setCatalogAuthorizedBcId(String catalogAuthorizedBcId) {
    this.catalogAuthorizedBcId = catalogAuthorizedBcId;
  }

  public CreativeportfoliocreatePortfolioContent catalogId(String catalogId) {
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

  public CreativeportfoliocreatePortfolioContent categoryLabel(String categoryLabel) {
    this.categoryLabel = categoryLabel;
    return this;
  }

   /**
   * Get categoryLabel
   * @return categoryLabel
  **/
  @Schema(description = "")
  public String getCategoryLabel() {
    return categoryLabel;
  }

  public void setCategoryLabel(String categoryLabel) {
    this.categoryLabel = categoryLabel;
  }

  public CreativeportfoliocreatePortfolioContent countryCode(List<String> countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  public CreativeportfoliocreatePortfolioContent addCountryCodeItem(String countryCodeItem) {
    if (this.countryCode == null) {
      this.countryCode = new ArrayList<String>();
    }
    this.countryCode.add(countryCodeItem);
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @Schema(description = "")
  public List<String> getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(List<String> countryCode) {
    this.countryCode = countryCode;
  }

  public CreativeportfoliocreatePortfolioContent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreativeportfoliocreatePortfolioContent displayPriceEnabled(Boolean displayPriceEnabled) {
    this.displayPriceEnabled = displayPriceEnabled;
    return this;
  }

   /**
   * Get displayPriceEnabled
   * @return displayPriceEnabled
  **/
  @Schema(description = "")
  public Boolean isDisplayPriceEnabled() {
    return displayPriceEnabled;
  }

  public void setDisplayPriceEnabled(Boolean displayPriceEnabled) {
    this.displayPriceEnabled = displayPriceEnabled;
  }

  public CreativeportfoliocreatePortfolioContent dynamicFormat(String dynamicFormat) {
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

  public CreativeportfoliocreatePortfolioContent gestureType(String gestureType) {
    this.gestureType = gestureType;
    return this;
  }

   /**
   * Get gestureType
   * @return gestureType
  **/
  @Schema(description = "")
  public String getGestureType() {
    return gestureType;
  }

  public void setGestureType(String gestureType) {
    this.gestureType = gestureType;
  }

  public CreativeportfoliocreatePortfolioContent identityAuthorizedBcId(String identityAuthorizedBcId) {
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

  public CreativeportfoliocreatePortfolioContent identityId(String identityId) {
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

  public CreativeportfoliocreatePortfolioContent identityType(String identityType) {
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

  public CreativeportfoliocreatePortfolioContent imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @Schema(description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public CreativeportfoliocreatePortfolioContent imageOptimizationEnabled(Boolean imageOptimizationEnabled) {
    this.imageOptimizationEnabled = imageOptimizationEnabled;
    return this;
  }

   /**
   * Get imageOptimizationEnabled
   * @return imageOptimizationEnabled
  **/
  @Schema(description = "")
  public Boolean isImageOptimizationEnabled() {
    return imageOptimizationEnabled;
  }

  public void setImageOptimizationEnabled(Boolean imageOptimizationEnabled) {
    this.imageOptimizationEnabled = imageOptimizationEnabled;
  }

  public CreativeportfoliocreatePortfolioContent interactiveMusicId(String interactiveMusicId) {
    this.interactiveMusicId = interactiveMusicId;
    return this;
  }

   /**
   * Get interactiveMusicId
   * @return interactiveMusicId
  **/
  @Schema(description = "")
  public String getInteractiveMusicId() {
    return interactiveMusicId;
  }

  public void setInteractiveMusicId(String interactiveMusicId) {
    this.interactiveMusicId = interactiveMusicId;
  }

  public CreativeportfoliocreatePortfolioContent itemGroupIds(List<String> itemGroupIds) {
    this.itemGroupIds = itemGroupIds;
    return this;
  }

  public CreativeportfoliocreatePortfolioContent addItemGroupIdsItem(String itemGroupIdsItem) {
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

  public CreativeportfoliocreatePortfolioContent layouts(List<String> layouts) {
    this.layouts = layouts;
    return this;
  }

  public CreativeportfoliocreatePortfolioContent addLayoutsItem(String layoutsItem) {
    if (this.layouts == null) {
      this.layouts = new ArrayList<String>();
    }
    this.layouts.add(layoutsItem);
    return this;
  }

   /**
   * Get layouts
   * @return layouts
  **/
  @Schema(description = "")
  public List<String> getLayouts() {
    return layouts;
  }

  public void setLayouts(List<String> layouts) {
    this.layouts = layouts;
  }

  public CreativeportfoliocreatePortfolioContent mobileAppId(String mobileAppId) {
    this.mobileAppId = mobileAppId;
    return this;
  }

   /**
   * Get mobileAppId
   * @return mobileAppId
  **/
  @Schema(description = "")
  public String getMobileAppId() {
    return mobileAppId;
  }

  public void setMobileAppId(String mobileAppId) {
    this.mobileAppId = mobileAppId;
  }

  public CreativeportfoliocreatePortfolioContent popUpWindowImageId(String popUpWindowImageId) {
    this.popUpWindowImageId = popUpWindowImageId;
    return this;
  }

   /**
   * Get popUpWindowImageId
   * @return popUpWindowImageId
  **/
  @Schema(description = "")
  public String getPopUpWindowImageId() {
    return popUpWindowImageId;
  }

  public void setPopUpWindowImageId(String popUpWindowImageId) {
    this.popUpWindowImageId = popUpWindowImageId;
  }

  public CreativeportfoliocreatePortfolioContent primaryText(String primaryText) {
    this.primaryText = primaryText;
    return this;
  }

   /**
   * Get primaryText
   * @return primaryText
  **/
  @Schema(description = "")
  public String getPrimaryText() {
    return primaryText;
  }

  public void setPrimaryText(String primaryText) {
    this.primaryText = primaryText;
  }

  public CreativeportfoliocreatePortfolioContent productSetId(String productSetId) {
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

  public CreativeportfoliocreatePortfolioContent productSource(String productSource) {
    this.productSource = productSource;
    return this;
  }

   /**
   * Get productSource
   * @return productSource
  **/
  @Schema(description = "")
  public String getProductSource() {
    return productSource;
  }

  public void setProductSource(String productSource) {
    this.productSource = productSource;
  }

  public CreativeportfoliocreatePortfolioContent productSpecificType(String productSpecificType) {
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

  public CreativeportfoliocreatePortfolioContent profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Get profileImage
   * @return profileImage
  **/
  @Schema(description = "")
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public CreativeportfoliocreatePortfolioContent secondaryText(String secondaryText) {
    this.secondaryText = secondaryText;
    return this;
  }

   /**
   * Get secondaryText
   * @return secondaryText
  **/
  @Schema(description = "")
  public String getSecondaryText() {
    return secondaryText;
  }

  public void setSecondaryText(String secondaryText) {
    this.secondaryText = secondaryText;
  }

  public CreativeportfoliocreatePortfolioContent sellingPoints(List<String> sellingPoints) {
    this.sellingPoints = sellingPoints;
    return this;
  }

  public CreativeportfoliocreatePortfolioContent addSellingPointsItem(String sellingPointsItem) {
    if (this.sellingPoints == null) {
      this.sellingPoints = new ArrayList<String>();
    }
    this.sellingPoints.add(sellingPointsItem);
    return this;
  }

   /**
   * Get sellingPoints
   * @return sellingPoints
  **/
  @Schema(description = "")
  public List<String> getSellingPoints() {
    return sellingPoints;
  }

  public void setSellingPoints(List<String> sellingPoints) {
    this.sellingPoints = sellingPoints;
  }

  public CreativeportfoliocreatePortfolioContent showcaseProducts(List<CreativeportfoliocreateShowcaseProducts> showcaseProducts) {
    this.showcaseProducts = showcaseProducts;
    return this;
  }

  public CreativeportfoliocreatePortfolioContent addShowcaseProductsItem(CreativeportfoliocreateShowcaseProducts showcaseProductsItem) {
    if (this.showcaseProducts == null) {
      this.showcaseProducts = new ArrayList<CreativeportfoliocreateShowcaseProducts>();
    }
    this.showcaseProducts.add(showcaseProductsItem);
    return this;
  }

   /**
   * Get showcaseProducts
   * @return showcaseProducts
  **/
  @Schema(description = "")
  public List<CreativeportfoliocreateShowcaseProducts> getShowcaseProducts() {
    return showcaseProducts;
  }

  public void setShowcaseProducts(List<CreativeportfoliocreateShowcaseProducts> showcaseProducts) {
    this.showcaseProducts = showcaseProducts;
  }

  public CreativeportfoliocreatePortfolioContent skuIds(List<String> skuIds) {
    this.skuIds = skuIds;
    return this;
  }

  public CreativeportfoliocreatePortfolioContent addSkuIdsItem(String skuIdsItem) {
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

  public CreativeportfoliocreatePortfolioContent slideDimension(CreativeportfoliocreateSlideDimension slideDimension) {
    this.slideDimension = slideDimension;
    return this;
  }

   /**
   * Get slideDimension
   * @return slideDimension
  **/
  @Schema(description = "")
  public CreativeportfoliocreateSlideDimension getSlideDimension() {
    return slideDimension;
  }

  public void setSlideDimension(CreativeportfoliocreateSlideDimension slideDimension) {
    this.slideDimension = slideDimension;
  }

  public CreativeportfoliocreatePortfolioContent slideLength(Long slideLength) {
    this.slideLength = slideLength;
    return this;
  }

   /**
   * Get slideLength
   * @return slideLength
  **/
  @Schema(description = "")
  public Long getSlideLength() {
    return slideLength;
  }

  public void setSlideLength(Long slideLength) {
    this.slideLength = slideLength;
  }

  public CreativeportfoliocreatePortfolioContent stickerParam(CreativeportfoliocreateStickerParam stickerParam) {
    this.stickerParam = stickerParam;
    return this;
  }

   /**
   * Get stickerParam
   * @return stickerParam
  **/
  @Schema(description = "")
  public CreativeportfoliocreateStickerParam getStickerParam() {
    return stickerParam;
  }

  public void setStickerParam(CreativeportfoliocreateStickerParam stickerParam) {
    this.stickerParam = stickerParam;
  }

  public CreativeportfoliocreatePortfolioContent storeAuthorizedBcId(String storeAuthorizedBcId) {
    this.storeAuthorizedBcId = storeAuthorizedBcId;
    return this;
  }

   /**
   * Get storeAuthorizedBcId
   * @return storeAuthorizedBcId
  **/
  @Schema(description = "")
  public String getStoreAuthorizedBcId() {
    return storeAuthorizedBcId;
  }

  public void setStoreAuthorizedBcId(String storeAuthorizedBcId) {
    this.storeAuthorizedBcId = storeAuthorizedBcId;
  }

  public CreativeportfoliocreatePortfolioContent storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @Schema(description = "")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public CreativeportfoliocreatePortfolioContent tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreativeportfoliocreatePortfolioContent addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CreativeportfoliocreatePortfolioContent title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CreativeportfoliocreatePortfolioContent verticalVideoStrategy(String verticalVideoStrategy) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeportfoliocreatePortfolioContent creativeportfoliocreatePortfolioContent = (CreativeportfoliocreatePortfolioContent) o;
    return Objects.equals(this.adText, creativeportfoliocreatePortfolioContent.adText) &&
        Objects.equals(this.advancedAudioInfo, creativeportfoliocreatePortfolioContent.advancedAudioInfo) &&
        Objects.equals(this.advancedGestureIcon, creativeportfoliocreatePortfolioContent.advancedGestureIcon) &&
        Objects.equals(this.advancedGestureImage, creativeportfoliocreatePortfolioContent.advancedGestureImage) &&
        Objects.equals(this.advancedInteractShape, creativeportfoliocreatePortfolioContent.advancedInteractShape) &&
        Objects.equals(this.advancedInteractType, creativeportfoliocreatePortfolioContent.advancedInteractType) &&
        Objects.equals(this.appId, creativeportfoliocreatePortfolioContent.appId) &&
        Objects.equals(this.assetContent, creativeportfoliocreatePortfolioContent.assetContent) &&
        Objects.equals(this.assetIds, creativeportfoliocreatePortfolioContent.assetIds) &&
        Objects.equals(this.badgeImageInfo, creativeportfoliocreatePortfolioContent.badgeImageInfo) &&
        Objects.equals(this.badgePosition, creativeportfoliocreatePortfolioContent.badgePosition) &&
        Objects.equals(this.badgeShowTime, creativeportfoliocreatePortfolioContent.badgeShowTime) &&
        Objects.equals(this.callToAction, creativeportfoliocreatePortfolioContent.callToAction) &&
        Objects.equals(this.callToActionText, creativeportfoliocreatePortfolioContent.callToActionText) &&
        Objects.equals(this.cardImageIndex, creativeportfoliocreatePortfolioContent.cardImageIndex) &&
        Objects.equals(this.cardShowPrice, creativeportfoliocreatePortfolioContent.cardShowPrice) &&
        Objects.equals(this.cardTags, creativeportfoliocreatePortfolioContent.cardTags) &&
        Objects.equals(this.cardType, creativeportfoliocreatePortfolioContent.cardType) &&
        Objects.equals(this.catalogAuthorizedBcId, creativeportfoliocreatePortfolioContent.catalogAuthorizedBcId) &&
        Objects.equals(this.catalogId, creativeportfoliocreatePortfolioContent.catalogId) &&
        Objects.equals(this.categoryLabel, creativeportfoliocreatePortfolioContent.categoryLabel) &&
        Objects.equals(this.countryCode, creativeportfoliocreatePortfolioContent.countryCode) &&
        Objects.equals(this.description, creativeportfoliocreatePortfolioContent.description) &&
        Objects.equals(this.displayPriceEnabled, creativeportfoliocreatePortfolioContent.displayPriceEnabled) &&
        Objects.equals(this.dynamicFormat, creativeportfoliocreatePortfolioContent.dynamicFormat) &&
        Objects.equals(this.gestureType, creativeportfoliocreatePortfolioContent.gestureType) &&
        Objects.equals(this.identityAuthorizedBcId, creativeportfoliocreatePortfolioContent.identityAuthorizedBcId) &&
        Objects.equals(this.identityId, creativeportfoliocreatePortfolioContent.identityId) &&
        Objects.equals(this.identityType, creativeportfoliocreatePortfolioContent.identityType) &&
        Objects.equals(this.imageId, creativeportfoliocreatePortfolioContent.imageId) &&
        Objects.equals(this.imageOptimizationEnabled, creativeportfoliocreatePortfolioContent.imageOptimizationEnabled) &&
        Objects.equals(this.interactiveMusicId, creativeportfoliocreatePortfolioContent.interactiveMusicId) &&
        Objects.equals(this.itemGroupIds, creativeportfoliocreatePortfolioContent.itemGroupIds) &&
        Objects.equals(this.layouts, creativeportfoliocreatePortfolioContent.layouts) &&
        Objects.equals(this.mobileAppId, creativeportfoliocreatePortfolioContent.mobileAppId) &&
        Objects.equals(this.popUpWindowImageId, creativeportfoliocreatePortfolioContent.popUpWindowImageId) &&
        Objects.equals(this.primaryText, creativeportfoliocreatePortfolioContent.primaryText) &&
        Objects.equals(this.productSetId, creativeportfoliocreatePortfolioContent.productSetId) &&
        Objects.equals(this.productSource, creativeportfoliocreatePortfolioContent.productSource) &&
        Objects.equals(this.productSpecificType, creativeportfoliocreatePortfolioContent.productSpecificType) &&
        Objects.equals(this.profileImage, creativeportfoliocreatePortfolioContent.profileImage) &&
        Objects.equals(this.secondaryText, creativeportfoliocreatePortfolioContent.secondaryText) &&
        Objects.equals(this.sellingPoints, creativeportfoliocreatePortfolioContent.sellingPoints) &&
        Objects.equals(this.showcaseProducts, creativeportfoliocreatePortfolioContent.showcaseProducts) &&
        Objects.equals(this.skuIds, creativeportfoliocreatePortfolioContent.skuIds) &&
        Objects.equals(this.slideDimension, creativeportfoliocreatePortfolioContent.slideDimension) &&
        Objects.equals(this.slideLength, creativeportfoliocreatePortfolioContent.slideLength) &&
        Objects.equals(this.stickerParam, creativeportfoliocreatePortfolioContent.stickerParam) &&
        Objects.equals(this.storeAuthorizedBcId, creativeportfoliocreatePortfolioContent.storeAuthorizedBcId) &&
        Objects.equals(this.storeId, creativeportfoliocreatePortfolioContent.storeId) &&
        Objects.equals(this.tags, creativeportfoliocreatePortfolioContent.tags) &&
        Objects.equals(this.title, creativeportfoliocreatePortfolioContent.title) &&
        Objects.equals(this.verticalVideoStrategy, creativeportfoliocreatePortfolioContent.verticalVideoStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adText, advancedAudioInfo, advancedGestureIcon, advancedGestureImage, advancedInteractShape, advancedInteractType, appId, assetContent, assetIds, badgeImageInfo, badgePosition, badgeShowTime, callToAction, callToActionText, cardImageIndex, cardShowPrice, cardTags, cardType, catalogAuthorizedBcId, catalogId, categoryLabel, countryCode, description, displayPriceEnabled, dynamicFormat, gestureType, identityAuthorizedBcId, identityId, identityType, imageId, imageOptimizationEnabled, interactiveMusicId, itemGroupIds, layouts, mobileAppId, popUpWindowImageId, primaryText, productSetId, productSource, productSpecificType, profileImage, secondaryText, sellingPoints, showcaseProducts, skuIds, slideDimension, slideLength, stickerParam, storeAuthorizedBcId, storeId, tags, title, verticalVideoStrategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeportfoliocreatePortfolioContent {\n");
    
    sb.append("    adText: ").append(toIndentedString(adText)).append("\n");
    sb.append("    advancedAudioInfo: ").append(toIndentedString(advancedAudioInfo)).append("\n");
    sb.append("    advancedGestureIcon: ").append(toIndentedString(advancedGestureIcon)).append("\n");
    sb.append("    advancedGestureImage: ").append(toIndentedString(advancedGestureImage)).append("\n");
    sb.append("    advancedInteractShape: ").append(toIndentedString(advancedInteractShape)).append("\n");
    sb.append("    advancedInteractType: ").append(toIndentedString(advancedInteractType)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    assetContent: ").append(toIndentedString(assetContent)).append("\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    badgeImageInfo: ").append(toIndentedString(badgeImageInfo)).append("\n");
    sb.append("    badgePosition: ").append(toIndentedString(badgePosition)).append("\n");
    sb.append("    badgeShowTime: ").append(toIndentedString(badgeShowTime)).append("\n");
    sb.append("    callToAction: ").append(toIndentedString(callToAction)).append("\n");
    sb.append("    callToActionText: ").append(toIndentedString(callToActionText)).append("\n");
    sb.append("    cardImageIndex: ").append(toIndentedString(cardImageIndex)).append("\n");
    sb.append("    cardShowPrice: ").append(toIndentedString(cardShowPrice)).append("\n");
    sb.append("    cardTags: ").append(toIndentedString(cardTags)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    catalogAuthorizedBcId: ").append(toIndentedString(catalogAuthorizedBcId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    categoryLabel: ").append(toIndentedString(categoryLabel)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayPriceEnabled: ").append(toIndentedString(displayPriceEnabled)).append("\n");
    sb.append("    dynamicFormat: ").append(toIndentedString(dynamicFormat)).append("\n");
    sb.append("    gestureType: ").append(toIndentedString(gestureType)).append("\n");
    sb.append("    identityAuthorizedBcId: ").append(toIndentedString(identityAuthorizedBcId)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageOptimizationEnabled: ").append(toIndentedString(imageOptimizationEnabled)).append("\n");
    sb.append("    interactiveMusicId: ").append(toIndentedString(interactiveMusicId)).append("\n");
    sb.append("    itemGroupIds: ").append(toIndentedString(itemGroupIds)).append("\n");
    sb.append("    layouts: ").append(toIndentedString(layouts)).append("\n");
    sb.append("    mobileAppId: ").append(toIndentedString(mobileAppId)).append("\n");
    sb.append("    popUpWindowImageId: ").append(toIndentedString(popUpWindowImageId)).append("\n");
    sb.append("    primaryText: ").append(toIndentedString(primaryText)).append("\n");
    sb.append("    productSetId: ").append(toIndentedString(productSetId)).append("\n");
    sb.append("    productSource: ").append(toIndentedString(productSource)).append("\n");
    sb.append("    productSpecificType: ").append(toIndentedString(productSpecificType)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    secondaryText: ").append(toIndentedString(secondaryText)).append("\n");
    sb.append("    sellingPoints: ").append(toIndentedString(sellingPoints)).append("\n");
    sb.append("    showcaseProducts: ").append(toIndentedString(showcaseProducts)).append("\n");
    sb.append("    skuIds: ").append(toIndentedString(skuIds)).append("\n");
    sb.append("    slideDimension: ").append(toIndentedString(slideDimension)).append("\n");
    sb.append("    slideLength: ").append(toIndentedString(slideLength)).append("\n");
    sb.append("    stickerParam: ").append(toIndentedString(stickerParam)).append("\n");
    sb.append("    storeAuthorizedBcId: ").append(toIndentedString(storeAuthorizedBcId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    verticalVideoStrategy: ").append(toIndentedString(verticalVideoStrategy)).append("\n");
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
