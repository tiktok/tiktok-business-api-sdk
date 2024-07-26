/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OpenApiv13adcreateDisclaimerClickableTexts} from './OpenApiv13adcreateDisclaimerClickableTexts.js';
import {OpenApiv13adcreateDisclaimerText} from './OpenApiv13adcreateDisclaimerText.js';

/**
 * The OpenApiv13adupdateCreatives model module.
 * @module model/OpenApiv13adupdateCreatives
 * @version 0.1.1
 */
export class OpenApiv13adupdateCreatives {
  /**
   * Constructs a new <code>OpenApiv13adupdateCreatives</code>.
   * @alias module:model/OpenApiv13adupdateCreatives
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adupdateCreatives</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adupdateCreatives} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adupdateCreatives} The populated <code>OpenApiv13adupdateCreatives</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adupdateCreatives();
      if (data.hasOwnProperty('ad_format'))
        obj.ad_format = ApiClient.convertToType(data['ad_format'], 'String');
      if (data.hasOwnProperty('ad_id'))
        obj.ad_id = ApiClient.convertToType(data['ad_id'], 'String');
      if (data.hasOwnProperty('ad_name'))
        obj.ad_name = ApiClient.convertToType(data['ad_name'], 'String');
      if (data.hasOwnProperty('ad_text'))
        obj.ad_text = ApiClient.convertToType(data['ad_text'], 'String');
      if (data.hasOwnProperty('app_name'))
        obj.app_name = ApiClient.convertToType(data['app_name'], 'String');
      if (data.hasOwnProperty('avatar_icon_web_uri'))
        obj.avatar_icon_web_uri = ApiClient.convertToType(data['avatar_icon_web_uri'], 'String');
      if (data.hasOwnProperty('brand_safety_postbid_partner'))
        obj.brand_safety_postbid_partner = ApiClient.convertToType(data['brand_safety_postbid_partner'], 'String');
      if (data.hasOwnProperty('brand_safety_vast_url'))
        obj.brand_safety_vast_url = ApiClient.convertToType(data['brand_safety_vast_url'], 'String');
      if (data.hasOwnProperty('call_to_action'))
        obj.call_to_action = ApiClient.convertToType(data['call_to_action'], 'String');
      if (data.hasOwnProperty('call_to_action_id'))
        obj.call_to_action_id = ApiClient.convertToType(data['call_to_action_id'], 'String');
      if (data.hasOwnProperty('card_id'))
        obj.card_id = ApiClient.convertToType(data['card_id'], 'String');
      if (data.hasOwnProperty('card_image_id'))
        obj.card_image_id = ApiClient.convertToType(data['card_image_id'], 'String');
      if (data.hasOwnProperty('card_image_index'))
        obj.card_image_index = ApiClient.convertToType(data['card_image_index'], 'Number');
      if (data.hasOwnProperty('card_show_price'))
        obj.card_show_price = ApiClient.convertToType(data['card_show_price'], 'Boolean');
      if (data.hasOwnProperty('card_tags'))
        obj.card_tags = ApiClient.convertToType(data['card_tags'], ['String']);
      if (data.hasOwnProperty('card_type'))
        obj.card_type = ApiClient.convertToType(data['card_type'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('click_tracking_url'))
        obj.click_tracking_url = ApiClient.convertToType(data['click_tracking_url'], 'String');
      if (data.hasOwnProperty('creative_authorized'))
        obj.creative_authorized = ApiClient.convertToType(data['creative_authorized'], 'Boolean');
      if (data.hasOwnProperty('creative_type'))
        obj.creative_type = ApiClient.convertToType(data['creative_type'], 'String');
      if (data.hasOwnProperty('dark_post_status'))
        obj.dark_post_status = ApiClient.convertToType(data['dark_post_status'], 'String');
      if (data.hasOwnProperty('deeplink'))
        obj.deeplink = ApiClient.convertToType(data['deeplink'], 'String');
      if (data.hasOwnProperty('deeplink_type'))
        obj.deeplink_type = ApiClient.convertToType(data['deeplink_type'], 'String');
      if (data.hasOwnProperty('disclaimer_clickable_texts'))
        obj.disclaimer_clickable_texts = ApiClient.convertToType(data['disclaimer_clickable_texts'], [OpenApiv13adcreateDisclaimerClickableTexts]);
      if (data.hasOwnProperty('disclaimer_text'))
        obj.disclaimer_text = OpenApiv13adcreateDisclaimerText.constructFromObject(data['disclaimer_text']);
      if (data.hasOwnProperty('disclaimer_type'))
        obj.disclaimer_type = ApiClient.convertToType(data['disclaimer_type'], 'String');
      if (data.hasOwnProperty('display_name'))
        obj.display_name = ApiClient.convertToType(data['display_name'], 'String');
      if (data.hasOwnProperty('dynamic_destination'))
        obj.dynamic_destination = ApiClient.convertToType(data['dynamic_destination'], 'String');
      if (data.hasOwnProperty('dynamic_format'))
        obj.dynamic_format = ApiClient.convertToType(data['dynamic_format'], 'String');
      if (data.hasOwnProperty('fallback_type'))
        obj.fallback_type = ApiClient.convertToType(data['fallback_type'], 'String');
      if (data.hasOwnProperty('identity_authorized_bc_id'))
        obj.identity_authorized_bc_id = ApiClient.convertToType(data['identity_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('image_ids'))
        obj.image_ids = ApiClient.convertToType(data['image_ids'], ['String']);
      if (data.hasOwnProperty('impression_tracking_url'))
        obj.impression_tracking_url = ApiClient.convertToType(data['impression_tracking_url'], 'String');
      if (data.hasOwnProperty('instant_product_page_used'))
        obj.instant_product_page_used = ApiClient.convertToType(data['instant_product_page_used'], 'Boolean');
      if (data.hasOwnProperty('interactive_motion_id'))
        obj.interactive_motion_id = ApiClient.convertToType(data['interactive_motion_id'], 'String');
      if (data.hasOwnProperty('item_duet_status'))
        obj.item_duet_status = ApiClient.convertToType(data['item_duet_status'], 'String');
      if (data.hasOwnProperty('item_group_ids'))
        obj.item_group_ids = ApiClient.convertToType(data['item_group_ids'], ['String']);
      if (data.hasOwnProperty('item_stitch_status'))
        obj.item_stitch_status = ApiClient.convertToType(data['item_stitch_status'], 'String');
      if (data.hasOwnProperty('landing_page_url'))
        obj.landing_page_url = ApiClient.convertToType(data['landing_page_url'], 'String');
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
      if (data.hasOwnProperty('page_id'))
        obj.page_id = ApiClient.convertToType(data['page_id'], 'Number');
      if (data.hasOwnProperty('page_image_index'))
        obj.page_image_index = ApiClient.convertToType(data['page_image_index'], 'Number');
      if (data.hasOwnProperty('playable_url'))
        obj.playable_url = ApiClient.convertToType(data['playable_url'], 'String');
      if (data.hasOwnProperty('product_set_id'))
        obj.product_set_id = ApiClient.convertToType(data['product_set_id'], 'String');
      if (data.hasOwnProperty('product_specific_type'))
        obj.product_specific_type = ApiClient.convertToType(data['product_specific_type'], 'String');
      if (data.hasOwnProperty('promotional_music_disabled'))
        obj.promotional_music_disabled = ApiClient.convertToType(data['promotional_music_disabled'], 'Boolean');
      if (data.hasOwnProperty('shopping_ads_deeplink_type'))
        obj.shopping_ads_deeplink_type = ApiClient.convertToType(data['shopping_ads_deeplink_type'], 'String');
      if (data.hasOwnProperty('shopping_ads_fallback_type'))
        obj.shopping_ads_fallback_type = ApiClient.convertToType(data['shopping_ads_fallback_type'], 'String');
      if (data.hasOwnProperty('shopping_ads_video_package_id'))
        obj.shopping_ads_video_package_id = ApiClient.convertToType(data['shopping_ads_video_package_id'], 'String');
      if (data.hasOwnProperty('sku_ids'))
        obj.sku_ids = ApiClient.convertToType(data['sku_ids'], ['String']);
      if (data.hasOwnProperty('tiktok_item_id'))
        obj.tiktok_item_id = ApiClient.convertToType(data['tiktok_item_id'], 'String');
      if (data.hasOwnProperty('tracking_pixel_id'))
        obj.tracking_pixel_id = ApiClient.convertToType(data['tracking_pixel_id'], 'Number');
      if (data.hasOwnProperty('vast_moat_enabled'))
        obj.vast_moat_enabled = ApiClient.convertToType(data['vast_moat_enabled'], 'Boolean');
      if (data.hasOwnProperty('vertical_video_strategy'))
        obj.vertical_video_strategy = ApiClient.convertToType(data['vertical_video_strategy'], 'String');
      if (data.hasOwnProperty('video_id'))
        obj.video_id = ApiClient.convertToType(data['video_id'], 'String');
      if (data.hasOwnProperty('video_view_tracking_url'))
        obj.video_view_tracking_url = ApiClient.convertToType(data['video_view_tracking_url'], 'String');
      if (data.hasOwnProperty('viewability_postbid_partner'))
        obj.viewability_postbid_partner = ApiClient.convertToType(data['viewability_postbid_partner'], 'String');
      if (data.hasOwnProperty('viewability_vast_url'))
        obj.viewability_vast_url = ApiClient.convertToType(data['viewability_vast_url'], 'String');
    }
    return obj;
  }
}

/**
 * The creative type. Enum values- SINGLE_IMAGE, SINGLE_VIDEO, LIVE_CONTENT. For in-feed ads on TikTok, set this field to SINGLE_VIDEO. For live shopping events on TikTok, set this field to LIVE_CONTENT.
 * @member {String} ad_format
 */
OpenApiv13adupdateCreatives.prototype.ad_format = undefined;

/**
 * Ad ID
 * @member {String} ad_id
 */
OpenApiv13adupdateCreatives.prototype.ad_id = undefined;

/**
 * Ad name. Set as \" \" (Empty string) for it to be automatically generated. The format of auto-generated ad name is- creative name + creation time (e.g. adcreative20210111190739). Character limit is 512 and cannot contain emoji. Note- Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
 * @member {String} ad_name
 */
OpenApiv13adupdateCreatives.prototype.ad_name = undefined;

/**
 * An ad text. It is shown to your audience as part of your ad creative, to deliver the message you intend to communicate to them. If you don't know how to create effective ad texts, you can try the Smart Text feature, which generates ad text recommendations based on the industry and language.This field is required for image or video ads (ad_format is SINGLE_IMAGE or SINGLE_VIDEO)Ad text must be 1-100 characters long and cannot contain emoji.Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
 * @member {String} ad_text
 */
OpenApiv13adupdateCreatives.prototype.ad_text = undefined;

/**
 * App name that is displayed in the ad.  If not specified, the name in the app store will be used. Number of characters allowed- 1-40. If the name in the app store exceeds 40 characters, you must pass in a new app name with this field.
 * @member {String} app_name
 */
OpenApiv13adupdateCreatives.prototype.app_name = undefined;

/**
 * ID of the avatar image. It can be uploaded through the [Upload an image](https://ads.tiktok.com/marketing_api/docs?id=1739067433456642) endpoint (picture ratio requirement is 1- 1
 * @member {String} avatar_icon_web_uri
 */
OpenApiv13adupdateCreatives.prototype.avatar_icon_web_uri = undefined;

/**
 * Post-bid third-party brand safety measurement partner. Enum values- `DOUBLE_VERIFY`, `IAS`, `ZEFR`. You can use [/tool/vast_option/](https://ads.tiktok.com/marketing_api/docs?id=1755436556897281) to get available post-bid third-party measurement partners.
 * @member {String} brand_safety_postbid_partner
 */
OpenApiv13adupdateCreatives.prototype.brand_safety_postbid_partner = undefined;

/**
 * The wrapped VAST URL used by the post-bid third-party partner to measure brand safety. Required when `brand_safety_postbid_partner` = `IAS`. You need to get the URL from the measurement partner IAS
 * @member {String} brand_safety_vast_url
 */
OpenApiv13adupdateCreatives.prototype.brand_safety_vast_url = undefined;

/**
 * Call-to-action text. For TikTok ads, either this field or `call_to_action_id` must be specified. If both are specified, this field will be ignored. For enum values, see [Enumeration - Call-to-Action](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). For live shopping events, the call to action must be `WATCH_LIVE`.
 * @member {String} call_to_action
 */
OpenApiv13adupdateCreatives.prototype.call_to_action = undefined;

/**
 * The ID of the CTA portfolio that you want to use in your ads. A CTA portfolio is a group of auto-optimized CTAs. If both this field and `call_to_action` are specified, this field will be used, and `call_to_action` will be ignored. For details about auto-optimized CTAs, see [CTA Recommendations - Auto-Optimized CTAs](https://ads.tiktok.com/marketing_api/docs?id=1740307296329730).
 * @member {String} call_to_action_id
 */
OpenApiv13adupdateCreatives.prototype.call_to_action_id = undefined;

/**
 * Image card ID, gift code card ID, premium badge ID, Countdown Sticker ID, or Download Card ID. To learn about how to get an image card ID or gift card ID, please see [Use Cards in Ads]
 * @member {String} card_id
 */
OpenApiv13adupdateCreatives.prototype.card_id = undefined;

/**
 * Required if card_type=IMAGE
 * @member {String} card_image_id
 */
OpenApiv13adupdateCreatives.prototype.card_image_id = undefined;

/**
 * The index of product additional image list. The clients can use it to specify card image of product cards.
 * @member {Number} card_image_index
 */
OpenApiv13adupdateCreatives.prototype.card_image_index = undefined;

/**
 * Whether to show price on card or not
 * @member {Boolean} card_show_price
 */
OpenApiv13adupdateCreatives.prototype.card_show_price = undefined;

/**
 * Enum values- `BRAND`,  `DESC`. Max size = 2.
 * @member {Array.<String>} card_tags
 */
OpenApiv13adupdateCreatives.prototype.card_tags = undefined;

/**
 * Enum values- `IMAGE`, `PRODUCT`
 * @member {String} card_type
 */
OpenApiv13adupdateCreatives.prototype.card_type = undefined;

/**
 * Product catalog ID. Required for shop purchases ads. Products whose links are shown in the ad are from this catalog.
 * @member {String} catalog_id
 */
OpenApiv13adupdateCreatives.prototype.catalog_id = undefined;

/**
 * Click monitoring URL. Currently Pangle does not support DCM, Sizmek or Flashtalking.
 * @member {String} click_tracking_url
 */
OpenApiv13adupdateCreatives.prototype.click_tracking_url = undefined;

/**
 * Whether you grant displaying some of your ads in our TikTok For Business Creative Center. Only valid for non-US advertisers, the default value is `false`.
 * @member {Boolean} creative_authorized
 */
OpenApiv13adupdateCreatives.prototype.creative_authorized = undefined;

/**
 * Creative type for Shop Purchases or Product Sales scenarios. Required when `objective_type` is `SHOP_PURCHASES` or `PRODUCT_SALES.
 * @member {String} creative_type
 */
OpenApiv13adupdateCreatives.prototype.creative_type = undefined;

/**
 * You can set this field to either `ON` or `OFF`. Default is `OFF`. If the ad is created as a dark post, it will not appear in the creator's homepage.
 * @member {String} dark_post_status
 */
OpenApiv13adupdateCreatives.prototype.dark_post_status = undefined;

/**
 * The specific location where you want your audience to go if they have your app installed. See `deeplink_type` for more.
 * @member {String} deeplink
 */
OpenApiv13adupdateCreatives.prototype.deeplink = undefined;

/**
 * The open URL type. Allowed values differs based on campaign objectives. Allowed values- `NORMAL`(supported in Traffic, Conversion), `DEFERRED_DEEPLINK`(supported in App Install). The default value is `NORMAL`. For an ad that will be included in an iOS 14 campaign, this field cannot be set to `DEFERRED_DEEPLINK`.
 * @member {String} deeplink_type
 */
OpenApiv13adupdateCreatives.prototype.deeplink_type = undefined;

/**
 * The clickable disclaimer or clickable disclaimers that you want to add to the ad. Required when `disclaimer_type` = `TEXT_LINK`. Max size- 3. If you use multiple clickable disclaimers, both the overall length for all the texts you pass in and the length of individual text need to be no more than 40 characters.
 * @member {Array.<module:model/OpenApiv13adcreateDisclaimerClickableTexts>} disclaimer_clickable_texts
 */
OpenApiv13adupdateCreatives.prototype.disclaimer_clickable_texts = undefined;

/**
 * @member {module:model/OpenApiv13adcreateDisclaimerText} disclaimer_text
 */
OpenApiv13adupdateCreatives.prototype.disclaimer_text = undefined;

/**
 * Type of disclaimer that you want to add to the ad. Enum values- `TEXT_LINK`(clickable disclaimers), `TEXT_ONLY`(text-only disclaimers). See [Include disclaimers in ads](https://ads.tiktok.com/marketing_api/docs?id=1739953274550273) to learn about how to configure disclaimer settings. Disclaimers are currently an allowlist-only feature for advertisers not registered in Canada and America using auction ad objectives, and for all advertisers using Reach & Frequency ad objectives. If you would like to access it, please contact your TikTok representative. The disclaimer feature only supports the following advertising objectives- `APP_PROMOTION`, `WEB_CONVERSIONS`, `APP_INSTALL`, `CONVERSIONS`, `REACH`, `TRAFFIC`, `VIDEO_VIEWS`, `ENGAGEMENT`, `LEAD_GENERATION`, `RF_REACH`, `RF_TRAFFIC`, `RF_VIDEO_VIEW`.  The disclaimer feature only supports TikTok placement. The disclaimer feature is not supported for Automated Creative Optimization ads. Once added to your ads, the disclaimer cannot be deleted.
 * @member {String} disclaimer_type
 */
OpenApiv13adupdateCreatives.prototype.disclaimer_type = undefined;

/**
 * The display name of landing page or pure exposure ad, length limit- 1-40 English characters, or 1-20 Chinese/Japanese/Korean characters, required when the promotion type is landing page or pure exposure
 * @member {String} display_name
 */
OpenApiv13adupdateCreatives.prototype.display_name = undefined;

/**
 * Enum values- `UNSET`, `DLP`(Dynamic Landing Page)
 * @member {String} dynamic_destination
 */
OpenApiv13adupdateCreatives.prototype.dynamic_destination = undefined;

/**
 * Enum values- `UNSET`, `DYNAMIC_CREATIVE`(smart creative).
 * @member {String} dynamic_format
 */
OpenApiv13adupdateCreatives.prototype.dynamic_format = undefined;

/**
 * Fallback Type. If the audience do not have the app installed, you can have them fall back to install the app, or to view a specific web page. Allowed values- `APP_INSTALL`, `WEBSITE`, `UNSET`. If website is chosen, you need to specify the url via `landing_page_url` field.
 * @member {String} fallback_type
 */
OpenApiv13adupdateCreatives.prototype.fallback_type = undefined;

/**
 * ID of the Business Center that a TikTok Account User in Business Center identity is associated with. Required when `identity_type` is `BC_AUTH_TT`.
 * @member {String} identity_authorized_bc_id
 */
OpenApiv13adupdateCreatives.prototype.identity_authorized_bc_id = undefined;

/**
 * Identity ID, required when you use Spark Ads (`tiktok_item_id`). If you are not using Spark Ads, we still highly recommend you to pass in `ideneity_id` and `identity_type` (`CUSTOMIZED_USER`) for better management of ads information.
 * @member {String} identity_id
 */
OpenApiv13adupdateCreatives.prototype.identity_id = undefined;

/**
 * Identity type. Enum- `CUSTOMIZED_USER`, `AUTH_CODE`, `TT_USER`, `BC_AUTH_TT`.  For details about identities, see [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097).
 * @member {String} identity_type
 */
OpenApiv13adupdateCreatives.prototype.identity_type = undefined;

/**
 * A list of image IDs (image used in an ad or as a video cover). You can get the image ID when you upload an image using the [/file/image/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id=1739067433456642) endpoint. When the ad_format is `SINGLE_VIDEO`, the value of this field will be used as the video cover (thumbnail) (only one value is allowed), and the aspect ratio of the image should be the same as the video.
 * @member {Array.<String>} image_ids
 */
OpenApiv13adupdateCreatives.prototype.image_ids = undefined;

/**
 * Display monitoring URL
 * @member {String} impression_tracking_url
 */
OpenApiv13adupdateCreatives.prototype.impression_tracking_url = undefined;

/**
 * Using TikTok instant page or not. When dynamic_destination = DLP, you don't need this parameter.When dynamic_destination = UNSET, you need to turn on this parameter to use instant page and pass page id.
 * @member {Boolean} instant_product_page_used
 */
OpenApiv13adupdateCreatives.prototype.instant_product_page_used = undefined;

/**
 * Interactive motion id.
 * @member {String} interactive_motion_id
 */
OpenApiv13adupdateCreatives.prototype.interactive_motion_id = undefined;

/**
 * Whether to enable dueting for the Spark Ad. This field is valid only when `promotional_music_disabled` is set to `false`. Enum values- `ENABLE`, `DISABLE`. This field is only valid for Spark Ad posts.
 * @member {String} item_duet_status
 */
OpenApiv13adupdateCreatives.prototype.item_duet_status = undefined;

/**
 * Product SPU ID
 * @member {Array.<String>} item_group_ids
 */
OpenApiv13adupdateCreatives.prototype.item_group_ids = undefined;

/**
 * Whether to enable stitching for the Spark Ad. This field is valid only when `promotional_music_disabled` is set to `false`. Enum values- `ENABLE`, `DISABLE`. This field is only valid for Spark Ad posts.
 * @member {String} item_stitch_status
 */
OpenApiv13adupdateCreatives.prototype.item_stitch_status = undefined;

/**
 * Landing page URL.
 * @member {String} landing_page_url
 */
OpenApiv13adupdateCreatives.prototype.landing_page_url = undefined;

/**
 * The status of the ad when created. Enum values- `ENABLE` - The ad is enabled when created. `DISABLE` - The ad is disabled when created. Default value- `ENABLE`. If you want to update the status of the ad after creation, use the [/ad/status/update/](https://ads.tiktok.com/marketing_api/docs?id=1739953422970882) endpoint.
 * @member {String} operation_status
 */
OpenApiv13adupdateCreatives.prototype.operation_status = undefined;

/**
 * Page (Instant form, Custom TikTok Instant Page or App Profile Page) ID, which can be created by [Instant Page Editor SDK](https://ads.tiktok.com/marketing_api/docs?id=1740307202170881). Instant Forms are for `LEAD_GENERATION` campaign objective. Only applicable for TikTok placement. Before creating for the first time, you need to sign the `LeadAds` agreement through the [/term/confirm/](https://ads.tiktok.com/marketing_api/docs?id=1737192284435457) endpoint. This field is ignored for `SHOP_PURCHASES` objective. Note- We will sunset the Collection Ads on Feb.16,2023. To ensure a seamless experience, please don't set a storefront page as your instant page.
 * @member {Number} page_id
 */
OpenApiv13adupdateCreatives.prototype.page_id = undefined;

/**
 * The index of page.
 * @member {Number} page_image_index
 */
OpenApiv13adupdateCreatives.prototype.page_image_index = undefined;

/**
 * Playable material url, valid in Pangle and TikTok placement. You can get the url via the [/playable/get/](https://ads.tiktok.com/marketing_api/docs?id=1737732758495234) endpoint. Note that all ads in the same ad group share the same playble material.
 * @member {String} playable_url
 */
OpenApiv13adupdateCreatives.prototype.playable_url = undefined;

/**
 * The ID of the product set.
 * @member {String} product_set_id
 */
OpenApiv13adupdateCreatives.prototype.product_set_id = undefined;

/**
 * Different dimensions to choose products. Enum values- `ALL`,` PRODUCT_SET`, `CUSTOMIZED_PRODUCTS`. If you choose `ALL`, you don't need to input `sku_ids` or  `item_group_ids`  or `product_set_id`.  `item_group_ids`  or `product_set_id` are required if `product_specific_type`=`PRODUCT_SET`. `sku_ids` are required if `product_specific_type`=`CUSTOMIZED_PRODUCTS`
 * @member {String} product_specific_type
 */
OpenApiv13adupdateCreatives.prototype.product_specific_type = undefined;

/**
 * Whether to disable the promotional use of the music in the Spark Ad. The default value is `true`. If you want to allow dueting and stitching for the TikTok video, you need to set this field to `false`. This field is only valid for Spark Ad posts.
 * @member {Boolean} promotional_music_disabled
 */
OpenApiv13adupdateCreatives.prototype.promotional_music_disabled = undefined;

/**
 * Indicates the source of the direct link used in the Shopping Ad. When specified as `CUSTOM`, the direct link is written in the deeplink field. <br data-tomark-pass>  Optional values- `NONE`(not enabled),`CUSTOM`(custom direct link),`SHOPPING_ADS`(commodity direct link). The default value is `NONE`.
 * @member {String} shopping_ads_deeplink_type
 */
OpenApiv13adupdateCreatives.prototype.shopping_ads_deeplink_type = undefined;

/**
 * Indicates the source of the direct link used in the Shopping Ad. When specified as `CUSTOM`, the direct link is written in the deeplink field. <br data-tomark-pass>  Optional values- `NONE`(not enabled),`CUSTOM`(custom direct link),`SHOPPING_ADS`(commodity direct link). The default value is `NONE`.
 * @member {String} shopping_ads_fallback_type
 */
OpenApiv13adupdateCreatives.prototype.shopping_ads_fallback_type = undefined;

/**
 * Product video package ID. Use the [/catalog/video/get/](https://ads.tiktok.com/marketing_api/docs?id=1740574099715073) endpoint to get video package IDs.|
 * @member {String} shopping_ads_video_package_id
 */
OpenApiv13adupdateCreatives.prototype.shopping_ads_video_package_id = undefined;

/**
 * IDs of the SKUs
 * @member {Array.<String>} sku_ids
 */
OpenApiv13adupdateCreatives.prototype.sku_ids = undefined;

/**
 * The ID of the TikTok post to be used as an ad (Spark Ad). Pass in the `item_id` you get from the response of the [/tt_video/info/](https://ads.tiktok.com/marketing_api/docs?id=1738376324021250) or [/identity/video/get/](https://ads.tiktok.com/marketing_api/docs?id=1740218475032577) endpoint. This field is required for Spark Ads.  Note- By using Spark Ads, you confirm that you have the rights to use the music in the videos for commercial purposes
 * @member {String} tiktok_item_id
 */
OpenApiv13adupdateCreatives.prototype.tiktok_item_id = undefined;

/**
 * The pixel ID that you'd like to track. You can use this field to track offsite events. It supports the campaign objectives for both Auction ads (`REACH`, `VIDEO_VIEWS`, `TRAFFIC`, `CONVERSIONS`, `WEB_CONVERSIONS`, `LEAD_GENERATION`, `APP_PROMOTION`, `PRODUCT_SALES`, `ENGAGEMENT`) and Reach & Frequency ads (`RF_REACH`, `RF_TRAFFIC`, `RF_VIDEO_VIEW`).For Auction objectives. If `pixel_id`!=0 at the ad group level  and  you want to use pixel to track offsite events, then the pixel ID you pass in the `tracking_pixel_id` field must be the same ID that you specified in the `pixel_id` field for the ad group. Otherwise, you can pass in any pixel ID that you'd like to track in the `tracking_pixel_id` field. This field is an allowlist feature if your campaign objective is `ENGAGEMENT`/ `PRODUCT_SALES` (when `product_source` = `CATALOG` / `STORE` and `shopping_ads_type` = `VIDEO`) /`APP_PROMOTION`(when `app_promotion_type` = `APP_RETARGETING` ). If you want to use the field, please reach out to your TikTok representative.For Reach & Frequency objectives You can pass in any pixel ID that you'd like to track in the `tracking_pixel_id` field.
 * @member {Number} tracking_pixel_id
 */
OpenApiv13adupdateCreatives.prototype.tracking_pixel_id = undefined;

/**
 * Whether Moat Viewability Verification is enabled for the ad. TikTok has partnered with Moat to launch viewability measurement for Brand Auction and Reach & Frequency In-feed ads purchased on TikTok for Business. Default value- `false`.
 * @member {Boolean} vast_moat_enabled
 */
OpenApiv13adupdateCreatives.prototype.vast_moat_enabled = undefined;

/**
 * The video type that you use for Product Sales scenarios. Enum values- `UNSET` (unset), `SINGLE_VIDEO` (single video), `CATALOG_VIDEOS` (catalog video), `LIVE_STREAM` (livestream video). It must be `UNSET` if `dynamic_format` = `DYNAMIC_CREATIVE`.
 * @member {String} vertical_video_strategy
 */
OpenApiv13adupdateCreatives.prototype.vertical_video_strategy = undefined;

/**
 * Video ID. Required when the creative type is standard videos. For Spark Ads, use `tiktok_item_id` to specify the TikTok post ID. You can find out video IDs by using the [/file/video/ad/search/](https://ads.tiktok.com/marketing_api/docs?id=1740050472224769) endpoint. Note- To ensure a smooth integration journey, we recommned that you use [/file/video/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id=1737587322856449)(`upload_type` = `UPLOAD_BY_VIDEO_ID`)to bind video ID with your advertiser ID.
 * @member {String} video_id
 */
OpenApiv13adupdateCreatives.prototype.video_id = undefined;

/**
 * The monitoring URL for video view.
 * @member {String} video_view_tracking_url
 */
OpenApiv13adupdateCreatives.prototype.video_view_tracking_url = undefined;

/**
 * Post-bid third-party viewability measurement partner. Enum values- `MOAT`, `DOUBLE_VERIFY`, `IAS`. You can use [/tool/vast_option/](https://ads.tiktok.com/marketing_api/docs?id=1755436556897281) to get available post-bid third-party measurement partners. Note - ost-bid third-party viewability measurement is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative.  See [Brand safety](https://ads.tiktok.com/marketing_api/docs?id=1739381752981505) to learn about the supported advertising objectives, supported markets, and the general introduction of post-bid measurement.
 * @member {String} viewability_postbid_partner
 */
OpenApiv13adupdateCreatives.prototype.viewability_postbid_partner = undefined;

/**
 * The wrapped VAST URL used by the post-bid third-party partner to measure viewability. Required when `viewability_postbid_partner` = `IAS`. You need to get the URL from the measurement partner IAS. Post-bid third-party viewability measurement is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative. Post-bid third-party measurement is not supported for ACO ads. Post-bid third-party measurement is not supported for ad groups where `promotion_type` is set as `LIVE_SHOPPING`.
 * @member {String} viewability_vast_url
 */
OpenApiv13adupdateCreatives.prototype.viewability_vast_url = undefined;

