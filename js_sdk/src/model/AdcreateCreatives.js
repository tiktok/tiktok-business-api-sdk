/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdcreateDeeplinkUtmParams} from './AdcreateDeeplinkUtmParams.js';
import {AdcreateDisclaimerClickableTexts} from './AdcreateDisclaimerClickableTexts.js';
import {AdcreateDisclaimerText} from './AdcreateDisclaimerText.js';
import {AdcreateShowcaseProducts} from './AdcreateShowcaseProducts.js';
import {AdcreateUtmParams} from './AdcreateUtmParams.js';

/**
 * The AdcreateCreatives model module.
 * @module model/AdcreateCreatives
 * @version 1.2.1
 */
export class AdcreateCreatives {
  /**
   * Constructs a new <code>AdcreateCreatives</code>.
   * @alias module:model/AdcreateCreatives
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdcreateCreatives</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdcreateCreatives} obj Optional instance to populate.
   * @return {module:model/AdcreateCreatives} The populated <code>AdcreateCreatives</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdcreateCreatives();
      if (data.hasOwnProperty('ad_format'))
        obj.ad_format = ApiClient.convertToType(data['ad_format'], 'String');
      if (data.hasOwnProperty('ad_name'))
        obj.ad_name = ApiClient.convertToType(data['ad_name'], 'String');
      if (data.hasOwnProperty('ad_text'))
        obj.ad_text = ApiClient.convertToType(data['ad_text'], 'String');
      if (data.hasOwnProperty('ad_texts'))
        obj.ad_texts = ApiClient.convertToType(data['ad_texts'], ['String']);
      if (data.hasOwnProperty('aigc_disclosure_type'))
        obj.aigc_disclosure_type = ApiClient.convertToType(data['aigc_disclosure_type'], 'String');
      if (data.hasOwnProperty('app_name'))
        obj.app_name = ApiClient.convertToType(data['app_name'], 'String');
      if (data.hasOwnProperty('auto_disclaimer_types'))
        obj.auto_disclaimer_types = ApiClient.convertToType(data['auto_disclaimer_types'], ['String']);
      if (data.hasOwnProperty('auto_message_id'))
        obj.auto_message_id = ApiClient.convertToType(data['auto_message_id'], 'String');
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
      if (data.hasOwnProperty('carousel_image_index'))
        obj.carousel_image_index = ApiClient.convertToType(data['carousel_image_index'], 'Number');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('click_tracking_url'))
        obj.click_tracking_url = ApiClient.convertToType(data['click_tracking_url'], 'String');
      if (data.hasOwnProperty('cpp_url'))
        obj.cpp_url = ApiClient.convertToType(data['cpp_url'], 'String');
      if (data.hasOwnProperty('creative_authorized'))
        obj.creative_authorized = ApiClient.convertToType(data['creative_authorized'], 'Boolean');
      if (data.hasOwnProperty('creative_type'))
        obj.creative_type = ApiClient.convertToType(data['creative_type'], 'String');
      if (data.hasOwnProperty('dark_post_status'))
        obj.dark_post_status = ApiClient.convertToType(data['dark_post_status'], 'String');
      if (data.hasOwnProperty('deeplink'))
        obj.deeplink = ApiClient.convertToType(data['deeplink'], 'String');
      if (data.hasOwnProperty('deeplink_format_type'))
        obj.deeplink_format_type = ApiClient.convertToType(data['deeplink_format_type'], 'String');
      if (data.hasOwnProperty('deeplink_type'))
        obj.deeplink_type = ApiClient.convertToType(data['deeplink_type'], 'String');
      if (data.hasOwnProperty('deeplink_utm_params'))
        obj.deeplink_utm_params = ApiClient.convertToType(data['deeplink_utm_params'], [AdcreateDeeplinkUtmParams]);
      if (data.hasOwnProperty('disclaimer_clickable_texts'))
        obj.disclaimer_clickable_texts = ApiClient.convertToType(data['disclaimer_clickable_texts'], [AdcreateDisclaimerClickableTexts]);
      if (data.hasOwnProperty('disclaimer_text'))
        obj.disclaimer_text = AdcreateDisclaimerText.constructFromObject(data['disclaimer_text']);
      if (data.hasOwnProperty('disclaimer_type'))
        obj.disclaimer_type = ApiClient.convertToType(data['disclaimer_type'], 'String');
      if (data.hasOwnProperty('display_name'))
        obj.display_name = ApiClient.convertToType(data['display_name'], 'String');
      if (data.hasOwnProperty('dynamic_destination'))
        obj.dynamic_destination = ApiClient.convertToType(data['dynamic_destination'], 'String');
      if (data.hasOwnProperty('dynamic_format'))
        obj.dynamic_format = ApiClient.convertToType(data['dynamic_format'], 'String');
      if (data.hasOwnProperty('end_card_cta'))
        obj.end_card_cta = ApiClient.convertToType(data['end_card_cta'], 'String');
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
      if (data.hasOwnProperty('item_duet_status'))
        obj.item_duet_status = ApiClient.convertToType(data['item_duet_status'], 'String');
      if (data.hasOwnProperty('item_group_ids'))
        obj.item_group_ids = ApiClient.convertToType(data['item_group_ids'], ['String']);
      if (data.hasOwnProperty('item_stitch_status'))
        obj.item_stitch_status = ApiClient.convertToType(data['item_stitch_status'], 'String');
      if (data.hasOwnProperty('landing_page_url'))
        obj.landing_page_url = ApiClient.convertToType(data['landing_page_url'], 'String');
      if (data.hasOwnProperty('music_id'))
        obj.music_id = ApiClient.convertToType(data['music_id'], 'String');
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
      if (data.hasOwnProperty('page_id'))
        obj.page_id = ApiClient.convertToType(data['page_id'], 'Number');
      if (data.hasOwnProperty('page_image_index'))
        obj.page_image_index = ApiClient.convertToType(data['page_image_index'], 'Number');
      if (data.hasOwnProperty('phone_number'))
        obj.phone_number = ApiClient.convertToType(data['phone_number'], 'String');
      if (data.hasOwnProperty('phone_region_calling_code'))
        obj.phone_region_calling_code = ApiClient.convertToType(data['phone_region_calling_code'], 'String');
      if (data.hasOwnProperty('phone_region_code'))
        obj.phone_region_code = ApiClient.convertToType(data['phone_region_code'], 'String');
      if (data.hasOwnProperty('playable_url'))
        obj.playable_url = ApiClient.convertToType(data['playable_url'], 'String');
      if (data.hasOwnProperty('product_display_field_list'))
        obj.product_display_field_list = ApiClient.convertToType(data['product_display_field_list'], ['String']);
      if (data.hasOwnProperty('product_set_id'))
        obj.product_set_id = ApiClient.convertToType(data['product_set_id'], 'String');
      if (data.hasOwnProperty('product_specific_type'))
        obj.product_specific_type = ApiClient.convertToType(data['product_specific_type'], 'String');
      if (data.hasOwnProperty('promotional_music_disabled'))
        obj.promotional_music_disabled = ApiClient.convertToType(data['promotional_music_disabled'], 'Boolean');
      if (data.hasOwnProperty('schedule_id'))
        obj.schedule_id = ApiClient.convertToType(data['schedule_id'], 'String');
      if (data.hasOwnProperty('shopping_ads_deeplink_type'))
        obj.shopping_ads_deeplink_type = ApiClient.convertToType(data['shopping_ads_deeplink_type'], 'String');
      if (data.hasOwnProperty('shopping_ads_fallback_type'))
        obj.shopping_ads_fallback_type = ApiClient.convertToType(data['shopping_ads_fallback_type'], 'String');
      if (data.hasOwnProperty('shopping_ads_video_package_id'))
        obj.shopping_ads_video_package_id = ApiClient.convertToType(data['shopping_ads_video_package_id'], 'String');
      if (data.hasOwnProperty('showcase_products'))
        obj.showcase_products = ApiClient.convertToType(data['showcase_products'], [AdcreateShowcaseProducts]);
      if (data.hasOwnProperty('sku_ids'))
        obj.sku_ids = ApiClient.convertToType(data['sku_ids'], ['String']);
      if (data.hasOwnProperty('tiktok_item_id'))
        obj.tiktok_item_id = ApiClient.convertToType(data['tiktok_item_id'], 'String');
      if (data.hasOwnProperty('tiktok_page_category'))
        obj.tiktok_page_category = ApiClient.convertToType(data['tiktok_page_category'], 'String');
      if (data.hasOwnProperty('tracking_app_id'))
        obj.tracking_app_id = ApiClient.convertToType(data['tracking_app_id'], 'String');
      if (data.hasOwnProperty('tracking_message_event_set_id'))
        obj.tracking_message_event_set_id = ApiClient.convertToType(data['tracking_message_event_set_id'], 'String');
      if (data.hasOwnProperty('tracking_offline_event_set_ids'))
        obj.tracking_offline_event_set_ids = ApiClient.convertToType(data['tracking_offline_event_set_ids'], ['String']);
      if (data.hasOwnProperty('tracking_pixel_id'))
        obj.tracking_pixel_id = ApiClient.convertToType(data['tracking_pixel_id'], 'Number');
      if (data.hasOwnProperty('utm_params'))
        obj.utm_params = ApiClient.convertToType(data['utm_params'], [AdcreateUtmParams]);
      if (data.hasOwnProperty('vehicle_ids'))
        obj.vehicle_ids = ApiClient.convertToType(data['vehicle_ids'], ['String']);
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
 * @member {String} ad_format
 */
AdcreateCreatives.prototype.ad_format = undefined;

/**
 * @member {String} ad_name
 */
AdcreateCreatives.prototype.ad_name = undefined;

/**
 * @member {String} ad_text
 */
AdcreateCreatives.prototype.ad_text = undefined;

/**
 * @member {Array.<String>} ad_texts
 */
AdcreateCreatives.prototype.ad_texts = undefined;

/**
 * @member {String} aigc_disclosure_type
 * @default 'NOT_DECLARED'
 */
AdcreateCreatives.prototype.aigc_disclosure_type = 'NOT_DECLARED';

/**
 * @member {String} app_name
 */
AdcreateCreatives.prototype.app_name = undefined;

/**
 * @member {Array.<String>} auto_disclaimer_types
 */
AdcreateCreatives.prototype.auto_disclaimer_types = undefined;

/**
 * @member {String} auto_message_id
 */
AdcreateCreatives.prototype.auto_message_id = undefined;

/**
 * @member {String} avatar_icon_web_uri
 */
AdcreateCreatives.prototype.avatar_icon_web_uri = undefined;

/**
 * @member {String} brand_safety_postbid_partner
 */
AdcreateCreatives.prototype.brand_safety_postbid_partner = undefined;

/**
 * @member {String} brand_safety_vast_url
 */
AdcreateCreatives.prototype.brand_safety_vast_url = undefined;

/**
 * @member {String} call_to_action
 */
AdcreateCreatives.prototype.call_to_action = undefined;

/**
 * @member {String} call_to_action_id
 */
AdcreateCreatives.prototype.call_to_action_id = undefined;

/**
 * @member {String} card_id
 */
AdcreateCreatives.prototype.card_id = undefined;

/**
 * @member {Number} carousel_image_index
 */
AdcreateCreatives.prototype.carousel_image_index = undefined;

/**
 * @member {String} catalog_id
 */
AdcreateCreatives.prototype.catalog_id = undefined;

/**
 * @member {String} click_tracking_url
 */
AdcreateCreatives.prototype.click_tracking_url = undefined;

/**
 * @member {String} cpp_url
 */
AdcreateCreatives.prototype.cpp_url = undefined;

/**
 * @member {Boolean} creative_authorized
 * @default false
 */
AdcreateCreatives.prototype.creative_authorized = false;

/**
 * @member {String} creative_type
 */
AdcreateCreatives.prototype.creative_type = undefined;

/**
 * @member {String} dark_post_status
 */
AdcreateCreatives.prototype.dark_post_status = undefined;

/**
 * @member {String} deeplink
 */
AdcreateCreatives.prototype.deeplink = undefined;

/**
 * @member {String} deeplink_format_type
 */
AdcreateCreatives.prototype.deeplink_format_type = undefined;

/**
 * @member {String} deeplink_type
 * @default 'NORMAL'
 */
AdcreateCreatives.prototype.deeplink_type = 'NORMAL';

/**
 * @member {Array.<module:model/AdcreateDeeplinkUtmParams>} deeplink_utm_params
 */
AdcreateCreatives.prototype.deeplink_utm_params = undefined;

/**
 * @member {Array.<module:model/AdcreateDisclaimerClickableTexts>} disclaimer_clickable_texts
 */
AdcreateCreatives.prototype.disclaimer_clickable_texts = undefined;

/**
 * @member {module:model/AdcreateDisclaimerText} disclaimer_text
 */
AdcreateCreatives.prototype.disclaimer_text = undefined;

/**
 * @member {String} disclaimer_type
 */
AdcreateCreatives.prototype.disclaimer_type = undefined;

/**
 * @member {String} display_name
 */
AdcreateCreatives.prototype.display_name = undefined;

/**
 * @member {String} dynamic_destination
 */
AdcreateCreatives.prototype.dynamic_destination = undefined;

/**
 * @member {String} dynamic_format
 */
AdcreateCreatives.prototype.dynamic_format = undefined;

/**
 * @member {String} end_card_cta
 */
AdcreateCreatives.prototype.end_card_cta = undefined;

/**
 * @member {String} fallback_type
 */
AdcreateCreatives.prototype.fallback_type = undefined;

/**
 * @member {String} identity_authorized_bc_id
 */
AdcreateCreatives.prototype.identity_authorized_bc_id = undefined;

/**
 * @member {String} identity_id
 */
AdcreateCreatives.prototype.identity_id = undefined;

/**
 * @member {String} identity_type
 */
AdcreateCreatives.prototype.identity_type = undefined;

/**
 * @member {Array.<String>} image_ids
 */
AdcreateCreatives.prototype.image_ids = undefined;

/**
 * @member {String} impression_tracking_url
 */
AdcreateCreatives.prototype.impression_tracking_url = undefined;

/**
 * @member {Boolean} instant_product_page_used
 */
AdcreateCreatives.prototype.instant_product_page_used = undefined;

/**
 * @member {String} item_duet_status
 */
AdcreateCreatives.prototype.item_duet_status = undefined;

/**
 * @member {Array.<String>} item_group_ids
 */
AdcreateCreatives.prototype.item_group_ids = undefined;

/**
 * @member {String} item_stitch_status
 */
AdcreateCreatives.prototype.item_stitch_status = undefined;

/**
 * @member {String} landing_page_url
 */
AdcreateCreatives.prototype.landing_page_url = undefined;

/**
 * @member {String} music_id
 */
AdcreateCreatives.prototype.music_id = undefined;

/**
 * @member {String} operation_status
 * @default 'ENABLE'
 */
AdcreateCreatives.prototype.operation_status = 'ENABLE';

/**
 * @member {Number} page_id
 */
AdcreateCreatives.prototype.page_id = undefined;

/**
 * @member {Number} page_image_index
 */
AdcreateCreatives.prototype.page_image_index = undefined;

/**
 * @member {String} phone_number
 */
AdcreateCreatives.prototype.phone_number = undefined;

/**
 * @member {String} phone_region_calling_code
 */
AdcreateCreatives.prototype.phone_region_calling_code = undefined;

/**
 * @member {String} phone_region_code
 */
AdcreateCreatives.prototype.phone_region_code = undefined;

/**
 * @member {String} playable_url
 */
AdcreateCreatives.prototype.playable_url = undefined;

/**
 * @member {Array.<String>} product_display_field_list
 */
AdcreateCreatives.prototype.product_display_field_list = undefined;

/**
 * @member {String} product_set_id
 */
AdcreateCreatives.prototype.product_set_id = undefined;

/**
 * @member {String} product_specific_type
 */
AdcreateCreatives.prototype.product_specific_type = undefined;

/**
 * @member {Boolean} promotional_music_disabled
 * @default true
 */
AdcreateCreatives.prototype.promotional_music_disabled = true;

/**
 * @member {String} schedule_id
 */
AdcreateCreatives.prototype.schedule_id = undefined;

/**
 * @member {String} shopping_ads_deeplink_type
 * @default 'NONE'
 */
AdcreateCreatives.prototype.shopping_ads_deeplink_type = 'NONE';

/**
 * @member {String} shopping_ads_fallback_type
 */
AdcreateCreatives.prototype.shopping_ads_fallback_type = undefined;

/**
 * @member {String} shopping_ads_video_package_id
 */
AdcreateCreatives.prototype.shopping_ads_video_package_id = undefined;

/**
 * @member {Array.<module:model/AdcreateShowcaseProducts>} showcase_products
 */
AdcreateCreatives.prototype.showcase_products = undefined;

/**
 * @member {Array.<String>} sku_ids
 */
AdcreateCreatives.prototype.sku_ids = undefined;

/**
 * @member {String} tiktok_item_id
 */
AdcreateCreatives.prototype.tiktok_item_id = undefined;

/**
 * @member {String} tiktok_page_category
 */
AdcreateCreatives.prototype.tiktok_page_category = undefined;

/**
 * @member {String} tracking_app_id
 */
AdcreateCreatives.prototype.tracking_app_id = undefined;

/**
 * @member {String} tracking_message_event_set_id
 */
AdcreateCreatives.prototype.tracking_message_event_set_id = undefined;

/**
 * @member {Array.<String>} tracking_offline_event_set_ids
 */
AdcreateCreatives.prototype.tracking_offline_event_set_ids = undefined;

/**
 * @member {Number} tracking_pixel_id
 */
AdcreateCreatives.prototype.tracking_pixel_id = undefined;

/**
 * @member {Array.<module:model/AdcreateUtmParams>} utm_params
 */
AdcreateCreatives.prototype.utm_params = undefined;

/**
 * @member {Array.<String>} vehicle_ids
 */
AdcreateCreatives.prototype.vehicle_ids = undefined;

/**
 * @member {String} vertical_video_strategy
 */
AdcreateCreatives.prototype.vertical_video_strategy = undefined;

/**
 * @member {String} video_id
 */
AdcreateCreatives.prototype.video_id = undefined;

/**
 * @member {String} video_view_tracking_url
 */
AdcreateCreatives.prototype.video_view_tracking_url = undefined;

/**
 * @member {String} viewability_postbid_partner
 */
AdcreateCreatives.prototype.viewability_postbid_partner = undefined;

/**
 * @member {String} viewability_vast_url
 */
AdcreateCreatives.prototype.viewability_vast_url = undefined;

