/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CreativeportfoliocreateAdvancedAudioInfo} from './CreativeportfoliocreateAdvancedAudioInfo.js';
import {CreativeportfoliocreateAdvancedGestureIcon} from './CreativeportfoliocreateAdvancedGestureIcon.js';
import {CreativeportfoliocreateBadgeImageInfo} from './CreativeportfoliocreateBadgeImageInfo.js';
import {CreativeportfoliocreateBadgePosition} from './CreativeportfoliocreateBadgePosition.js';
import {CreativeportfoliocreateStickerParam} from './CreativeportfoliocreateStickerParam.js';

/**
 * The CreativeportfoliocreatePortfolioContent model module.
 * @module model/CreativeportfoliocreatePortfolioContent
 * @version 0.1.4
 */
export class CreativeportfoliocreatePortfolioContent {
  /**
   * Constructs a new <code>CreativeportfoliocreatePortfolioContent</code>.
   * The content of the portfolio
   * @alias module:model/CreativeportfoliocreatePortfolioContent
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CreativeportfoliocreatePortfolioContent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreativeportfoliocreatePortfolioContent} obj Optional instance to populate.
   * @return {module:model/CreativeportfoliocreatePortfolioContent} The populated <code>CreativeportfoliocreatePortfolioContent</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreativeportfoliocreatePortfolioContent();
      if (data.hasOwnProperty('ad_text'))
        obj.ad_text = ApiClient.convertToType(data['ad_text'], 'String');
      if (data.hasOwnProperty('advanced_audio_info'))
        obj.advanced_audio_info = CreativeportfoliocreateAdvancedAudioInfo.constructFromObject(data['advanced_audio_info']);
      if (data.hasOwnProperty('advanced_gesture_icon'))
        obj.advanced_gesture_icon = CreativeportfoliocreateAdvancedGestureIcon.constructFromObject(data['advanced_gesture_icon']);
      if (data.hasOwnProperty('advanced_gesture_image'))
        obj.advanced_gesture_image = CreativeportfoliocreateAdvancedGestureIcon.constructFromObject(data['advanced_gesture_image']);
      if (data.hasOwnProperty('advanced_interact_shape'))
        obj.advanced_interact_shape = ApiClient.convertToType(data['advanced_interact_shape'], 'String');
      if (data.hasOwnProperty('advanced_interact_type'))
        obj.advanced_interact_type = ApiClient.convertToType(data['advanced_interact_type'], 'String');
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('asset_content'))
        obj.asset_content = ApiClient.convertToType(data['asset_content'], 'String');
      if (data.hasOwnProperty('asset_ids'))
        obj.asset_ids = ApiClient.convertToType(data['asset_ids'], ['String']);
      if (data.hasOwnProperty('badge_image_info'))
        obj.badge_image_info = CreativeportfoliocreateBadgeImageInfo.constructFromObject(data['badge_image_info']);
      if (data.hasOwnProperty('badge_position'))
        obj.badge_position = CreativeportfoliocreateBadgePosition.constructFromObject(data['badge_position']);
      if (data.hasOwnProperty('badge_show_time'))
        obj.badge_show_time = ApiClient.convertToType(data['badge_show_time'], 'Number');
      if (data.hasOwnProperty('call_to_action'))
        obj.call_to_action = ApiClient.convertToType(data['call_to_action'], 'String');
      if (data.hasOwnProperty('call_to_action_text'))
        obj.call_to_action_text = ApiClient.convertToType(data['call_to_action_text'], 'String');
      if (data.hasOwnProperty('card_image_index'))
        obj.card_image_index = ApiClient.convertToType(data['card_image_index'], 'Number');
      if (data.hasOwnProperty('card_show_price'))
        obj.card_show_price = ApiClient.convertToType(data['card_show_price'], 'Boolean');
      if (data.hasOwnProperty('card_tags'))
        obj.card_tags = ApiClient.convertToType(data['card_tags'], ['String']);
      if (data.hasOwnProperty('card_type'))
        obj.card_type = ApiClient.convertToType(data['card_type'], 'String');
      if (data.hasOwnProperty('catalog_authorized_bc_id'))
        obj.catalog_authorized_bc_id = ApiClient.convertToType(data['catalog_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('category_label'))
        obj.category_label = ApiClient.convertToType(data['category_label'], 'String');
      if (data.hasOwnProperty('country_code'))
        obj.country_code = ApiClient.convertToType(data['country_code'], ['String']);
      if (data.hasOwnProperty('description'))
        obj.description = ApiClient.convertToType(data['description'], 'String');
      if (data.hasOwnProperty('dynamic_format'))
        obj.dynamic_format = ApiClient.convertToType(data['dynamic_format'], 'String');
      if (data.hasOwnProperty('identity_authorized_bc_id'))
        obj.identity_authorized_bc_id = ApiClient.convertToType(data['identity_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('image_id'))
        obj.image_id = ApiClient.convertToType(data['image_id'], 'String');
      if (data.hasOwnProperty('item_group_ids'))
        obj.item_group_ids = ApiClient.convertToType(data['item_group_ids'], ['String']);
      if (data.hasOwnProperty('layouts'))
        obj.layouts = ApiClient.convertToType(data['layouts'], ['String']);
      if (data.hasOwnProperty('mobile_app_id'))
        obj.mobile_app_id = ApiClient.convertToType(data['mobile_app_id'], 'String');
      if (data.hasOwnProperty('product_set_id'))
        obj.product_set_id = ApiClient.convertToType(data['product_set_id'], 'String');
      if (data.hasOwnProperty('product_source'))
        obj.product_source = ApiClient.convertToType(data['product_source'], 'String');
      if (data.hasOwnProperty('product_specific_type'))
        obj.product_specific_type = ApiClient.convertToType(data['product_specific_type'], 'String');
      if (data.hasOwnProperty('profile_image'))
        obj.profile_image = ApiClient.convertToType(data['profile_image'], 'String');
      if (data.hasOwnProperty('sku_ids'))
        obj.sku_ids = ApiClient.convertToType(data['sku_ids'], ['String']);
      if (data.hasOwnProperty('sticker_param'))
        obj.sticker_param = CreativeportfoliocreateStickerParam.constructFromObject(data['sticker_param']);
      if (data.hasOwnProperty('store_authorized_bc_id'))
        obj.store_authorized_bc_id = ApiClient.convertToType(data['store_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('store_id'))
        obj.store_id = ApiClient.convertToType(data['store_id'], 'String');
      if (data.hasOwnProperty('tags'))
        obj.tags = ApiClient.convertToType(data['tags'], ['String']);
      if (data.hasOwnProperty('vertical_video_strategy'))
        obj.vertical_video_strategy = ApiClient.convertToType(data['vertical_video_strategy'], 'String');
    }
    return obj;
  }
}

/**
 * Valid when `creative_portfolio_type`= `PRODUCT_CARD`. An ad text. It is shown to your audience as part of your ad creative, to deliver the message you intend to communicate to them.  If you do not know how to create effective ad texts, you can try the [Smart Text](https://ads.tiktok.com/marketing_api/docs?id=1739084248002626) feature, which generates ad text recommendations based on the industry and language. Note: Ad text must be 1-100 characters long and cannot contain emoji.  Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
 * @member {String} ad_text
 */
CreativeportfoliocreatePortfolioContent.prototype.ad_text = undefined;

/**
 * @member {module:model/CreativeportfoliocreateAdvancedAudioInfo} advanced_audio_info
 */
CreativeportfoliocreatePortfolioContent.prototype.advanced_audio_info = undefined;

/**
 * @member {module:model/CreativeportfoliocreateAdvancedGestureIcon} advanced_gesture_icon
 */
CreativeportfoliocreatePortfolioContent.prototype.advanced_gesture_icon = undefined;

/**
 * @member {module:model/CreativeportfoliocreateAdvancedGestureIcon} advanced_gesture_image
 */
CreativeportfoliocreatePortfolioContent.prototype.advanced_gesture_image = undefined;

/**
 * @member {String} advanced_interact_shape
 */
CreativeportfoliocreatePortfolioContent.prototype.advanced_interact_shape = undefined;

/**
 * @member {String} advanced_interact_type
 */
CreativeportfoliocreatePortfolioContent.prototype.advanced_interact_type = undefined;

/**
 * Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. ID of the app that you want to promote in the Download Card. It is the App ID from Events Manager
 * @member {String} app_id
 */
CreativeportfoliocreatePortfolioContent.prototype.app_id = undefined;

/**
 * A call-to-action text. For example, `\"Learn More\"`. This field is required when `creative_portfolio_type` is `CTA`
 * @member {String} asset_content
 */
CreativeportfoliocreatePortfolioContent.prototype.asset_content = undefined;

/**
 * A list of CTAs. For example, `[201781, 201535]`. This field is required when `creative_portfolio_type` is `CTA`. To create a CTA portfolio, you need to get a group of auto-optimized CTAs by using `/creative/cta/recommend/`. Fetch the data in the response and include it as values to this field. Note: Auto-optimized CTAs can only be used in the advertiser accounts that they were created for.
 * @member {Array.<String>} asset_ids
 */
CreativeportfoliocreatePortfolioContent.prototype.asset_ids = undefined;

/**
 * @member {module:model/CreativeportfoliocreateBadgeImageInfo} badge_image_info
 */
CreativeportfoliocreatePortfolioContent.prototype.badge_image_info = undefined;

/**
 * @member {module:model/CreativeportfoliocreateBadgePosition} badge_position
 */
CreativeportfoliocreatePortfolioContent.prototype.badge_position = undefined;

/**
 * When the premium badge will start to show, in seconds. The first three seconds and the last five seconds of the video cannot be used as the badge show start time
 * @member {Number} badge_show_time
 */
CreativeportfoliocreatePortfolioContent.prototype.badge_show_time = undefined;

/**
 * Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. Call-to-action text in the Download Card
 * @member {String} call_to_action
 */
CreativeportfoliocreatePortfolioContent.prototype.call_to_action = undefined;

/**
 * The call-to-action text that will be shown below the image/badge
 * @member {String} call_to_action_text
 */
CreativeportfoliocreatePortfolioContent.prototype.call_to_action_text = undefined;

/**
 * card_image_index | integer | Valid when `creative_portfolio_type`= `PRODUCT_CARD`. You can use this field to specify the image used in the Product Card. The number you set via this field will be used as index to query the Image URLs you have passed through `additional_image_urls` in [/catalog/product/upload/](https://ads.tiktok.com/marketing_api/docs?id=1740497429681153). For instance, `card_image_index` = 2 means that you will use the image via the second image URL in `additional_image_urls`
 * @member {Number} card_image_index
 */
CreativeportfoliocreatePortfolioContent.prototype.card_image_index = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD`.  Whether to show the price of products on the Product Card or not
 * @member {Boolean} card_show_price
 */
CreativeportfoliocreatePortfolioContent.prototype.card_show_price = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD`. The product tags that you want to show on the Product Card. Enum values: `BRAND` (Brand Name), `DESC` (Description)
 * @member {Array.<String>} card_tags
 */
CreativeportfoliocreatePortfolioContent.prototype.card_tags = undefined;

/**
 * Card type. Currently only image card portfolio (IMAGE) can be created with this endpoint. Required when creative_portfolio_type is CARD
 * @member {String} card_type
 */
CreativeportfoliocreatePortfolioContent.prototype.card_type = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `CATALOG`.ID of the Business Center that is authorized to access the catalog (`catalog_id`). Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
 * @member {String} catalog_authorized_bc_id
 */
CreativeportfoliocreatePortfolioContent.prototype.catalog_authorized_bc_id = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD`. Catalog ID. Note: You can use [/store/list/](https://ads.tiktok.com/marketing_api/docs?id=1752267762718722) to get the `catalog_id`, `store_id` and `store_authorized_bc_id` for available stores under an ad account. If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product.
 * @member {String} catalog_id
 */
CreativeportfoliocreatePortfolioContent.prototype.catalog_id = undefined;

/**
 * Required when `creative_portfolio_type`= `DOWNLOAD_CARD` and the value of `tags` includes `CATEGORIES`. Category name of the app you want to promote in the Download Card. See [Enumerations-Creative Management-Category Labels](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138) for the enum values, and you need to pass the value as string
 * @member {String} category_label
 */
CreativeportfoliocreatePortfolioContent.prototype.category_label = undefined;

/**
 * Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. Country or location code of the region you want to target. For enum values, see [Appendix - Location code](https://ads.tiktok.com/marketing_api/docs?id=1737585867307010)
 * @member {Array.<String>} country_code
 */
CreativeportfoliocreatePortfolioContent.prototype.country_code = undefined;

/**
 * Required when `creative_portfolio_type`= `DOWNLOAD_CARD` and the value of `layouts` includes `TYPE_1`. Description of the app that you want to promote in the Download Card
 * @member {String} description
 */
CreativeportfoliocreatePortfolioContent.prototype.description = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD` and product_source is set as `CATALOG`. When `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `STORE`, you cannot set `dynamic_format` as `DYNAMIC_CREATIVE`. You can choose not to pass in the field or set it as `UNSET`. Whether to enable Dynamic Format. Dynamic Format combines video creative, product cards, and landing pages into different variations based on a shopper purchase intent, maximizing conversions for you. Enum values: `UNSET`, `DYNAMIC_CREATIVE` (Use Dynamic Format to create smart creatives). Note:`dynamic_format` cannot be enabled for retargeting ads (i.e. when `shopping_ads_retargeting_type` in the ad group is not `OFF`). When `dynamic_format` = `DYNAMIC_CREATIVE`, we will automatically create cards. This means that you will not need to pass all card related fields (`card_show_price`, `card_tags`, `card_image_index`). If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card.
 * @member {String} dynamic_format
 */
CreativeportfoliocreatePortfolioContent.prototype.dynamic_format = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD` and `identity_type` is `BC_AUTH_TT`.  ID of the Business Center that a TikTok Account User in Business Center identity is associated with
 * @member {String} identity_authorized_bc_id
 */
CreativeportfoliocreatePortfolioContent.prototype.identity_authorized_bc_id = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD`. Identity ID
 * @member {String} identity_id
 */
CreativeportfoliocreatePortfolioContent.prototype.identity_id = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD`. Identity type. Enum values: `CUSTOMIZED_USER`, `AUTH_CODE`, `TT_USER`, `BC_AUTH_TT`. For details about identities, see [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097)
 * @member {String} identity_type
 */
CreativeportfoliocreatePortfolioContent.prototype.identity_type = undefined;

/**
 * Image ID. Required when `creative_portfolio_type` is `CARD`
 * @member {String} image_id
 */
CreativeportfoliocreatePortfolioContent.prototype.image_id = undefined;

/**
 *  Required when `creative_portfolio_type`is `PRODUCT_CARD` and `product_source` is set as `STORE`. When `creative_portfolio_type`= `PRODUCT_CARD` and `product_specific_type` = PRODUCT_SET, you need to pass in either `product_set_id` or `item_group_ids`. Product SPU IDs. Max size: 20. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
 * @member {Array.<String>} item_group_ids
 */
CreativeportfoliocreatePortfolioContent.prototype.item_group_ids = undefined;

/**
 * Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. The layout type of the Download Card. Enum values: `TYPE_1`: Type 1, showing app description in the Download Card. `TYPE_2` : Type 2, not showing app description in the Download Card. You can pass in one or two layout types, and when you pass in both `TYPE_1` and `TYPE_2` in this field, you will create one Type 1 Download Card and one Type 2 Download Card
 * @member {Array.<String>} layouts
 */
CreativeportfoliocreatePortfolioContent.prototype.layouts = undefined;

/**
 * Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. Mobile App ID, used to extract tag information from Google Play or App Store. For an iOS app, please find the ID number in the app’s App Store URL as the string of numbers directly after `id`. For instance, in `https://apps.apple.com/us/app/hyperpure/id1203646221` the ID would be `1203646221`. For an Android app, please find the package name in the app’s Google Play store URL after `id`. For instance, in `https://play.google.com/store/apps/details?id=com.innersloth.spacemafia` the ID would be `com.innersloth.spacemafia`.
 * @member {String} mobile_app_id
 */
CreativeportfoliocreatePortfolioContent.prototype.mobile_app_id = undefined;

/**
 * When `creative_portfolio_type`= `PRODUCT_CARD` and `product_specific_type` = `PRODUCT_SET`, you need to pass in either `product_set_id` or `item_group_ids`. ID of the Product Set. You can call [/catalog/set/get/](https://ads.tiktok.com/marketing_api/docs?id=1740570556295169) to get a list of Product Sets in a catalog under your Business Center. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
 * @member {String} product_set_id
 */
CreativeportfoliocreatePortfolioContent.prototype.product_set_id = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD`. Product source where you want to get products for promotion. Enum values: `UNSET`, `CATALOG`(Catalog), `STORE` (TikTok Shop or TikTok Storefront (third-party store)). If you set this field as `STORE`, you need to pass in `item_group_ids` at the same time. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product.
 * @member {String} product_source
 */
CreativeportfoliocreatePortfolioContent.prototype.product_source = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `CATALOG`. The way that you specify the products. Enum values:  `ALL`: All products. Allow TikTok to dynamically choose from all catalog products. You do not need to specify any of `sku_ids`, `item_group_ids` and `product_set_id` at the same time.`PRODUCT_SET`: Product set. Select a product set. TikTok will dynamically choose products from this set. You need to specify `item_group_ids` or `product_set_id` at the same time. `CUSTOMIZED_PRODUCTS`: Specific products. Select up to 20 products from your catalog. You need to specify `sku_ids` at the same time.Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
 * @member {String} product_specific_type
 */
CreativeportfoliocreatePortfolioContent.prototype.product_specific_type = undefined;

/**
 * Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. Profile image URL
 * @member {String} profile_image
 */
CreativeportfoliocreatePortfolioContent.prototype.profile_image = undefined;

/**
 *  Required when `creative_portfolio_type`is `PRODUCT_CARD` and `product_source` is set as `STORE`. When `creative_portfolio_type`= `PRODUCT_CARD` and `product_specific_type` = PRODUCT_SET, you need to pass in either `product_set_id` or `item_group_ids`. Product SPU IDs. Max size: 20. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
 * @member {Array.<String>} sku_ids
 */
CreativeportfoliocreatePortfolioContent.prototype.sku_ids = undefined;

/**
 * @member {module:model/CreativeportfoliocreateStickerParam} sticker_param
 */
CreativeportfoliocreatePortfolioContent.prototype.sticker_param = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `STORE`.  ID of the Business Center that is authorized to access the store (`store_id`). Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad group levelyou pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product
 * @member {String} store_authorized_bc_id
 */
CreativeportfoliocreatePortfolioContent.prototype.store_authorized_bc_id = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `STORE`. ID of the TikTok Storefront or TikTok Shop. Note:  To get the TikTok Storefront ID or TikTok Shop ID, you can use [/bc/asset/get/]( https://ads.tiktok.com/marketing_api/docs?id=1739432717798401):  When in the response `asset_type` is `STOREFRONT`, the returned `asset_id` is the TikTok Storefront ID.  When in the response `asset_type` is `TIKTOK_SHOP`, the returned `asset_id` is the TikTok Shop ID.  A store of the TikTok Storefront type (store_id) can be used to create ad groups only when a TikTok account has been bound to the store. You can use [/store/list/]( https://ads.tiktok.com/marketing_api/docs?id=1752267762718722) to check the binding status of a TikTok Storefront via `tiktok_account_binding_status` in the response. If you have created a Product Card and want to use it during ad creation, ensure that at the ad group level you pass to the same field the value that is used for creating the Product Card. Otherwise, when the ad is delivered, the product thumbnail in the Product Card may not be of the promoted product.
 * @member {String} store_id
 */
CreativeportfoliocreatePortfolioContent.prototype.store_id = undefined;

/**
 * Required when `creative_portfolio_type`= `DOWNLOAD_CARD`. Tags for the Download Card. Enum values: `CATEGORIES`：Showing the category of the app you want to promote in the Download Card. `FILESIZE`：Showing the file size of the app you want to promote in the Download Card.  `RATING`：Showing the rating of the app you want to promote in the Download Card. `RANKING`：Showing the ranking of the app you want to promote in the Download Card. `COMMENT_VOLUME`：Showing the number of comments for the app you want to promote in the Download Card. Note: You can pass in multiple tags at one time, but when you pass in more than two tags, only two tags will show in the Download Card according to the following tag priority: `CATEGORIES` > `FILESIZE` > `RATING` > `RANKING`>`COMMENT_VOLUME`. For Type 1 Download Card, you need to pass in at least one tag. For Type 2 Download Card, you need to pass in at least two tags. 
 * @member {Array.<String>} tags
 */
CreativeportfoliocreatePortfolioContent.prototype.tags = undefined;

/**
 * Required when `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `CATALOG`. When `creative_portfolio_type`= `PRODUCT_CARD` and `product_source` is set as `STORE`, you can choose not to pass in the field or set it as `SINGLE_VIDEO`. The video type that you use for Product Sales scenarios. Enum values: `UNSET` (unset), `SINGLE_VIDEO` (single video), `CATALOG_VIDEOS` (catalog video).  It must be `UNSET` if `dynamic_format` = `DYNAMIC_CREATIVE`. Note: If you have created a Product Card and want to use it during ad creation, ensure that at the ad level you pass to the same field the value that is used for creating the Product Card
 * @member {String} vertical_video_strategy
 */
CreativeportfoliocreatePortfolioContent.prototype.vertical_video_strategy = undefined;

