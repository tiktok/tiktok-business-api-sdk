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
import {AdcreateUtmParams} from './AdcreateUtmParams.js';

/**
 * The AdupdateCreatives model module.
 * @module model/AdupdateCreatives
 * @version 0.1.9
 */
export class AdupdateCreatives {
  /**
   * Constructs a new <code>AdupdateCreatives</code>.
   * @alias module:model/AdupdateCreatives
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdupdateCreatives</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdupdateCreatives} obj Optional instance to populate.
   * @return {module:model/AdupdateCreatives} The populated <code>AdupdateCreatives</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdupdateCreatives();
      if (data.hasOwnProperty('ad_format'))
        obj.ad_format = ApiClient.convertToType(data['ad_format'], 'String');
      if (data.hasOwnProperty('ad_id'))
        obj.ad_id = ApiClient.convertToType(data['ad_id'], 'String');
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
      if (data.hasOwnProperty('tracking_app_id'))
        obj.tracking_app_id = ApiClient.convertToType(data['tracking_app_id'], 'String');
      if (data.hasOwnProperty('tracking_offline_event_set_ids'))
        obj.tracking_offline_event_set_ids = ApiClient.convertToType(data['tracking_offline_event_set_ids'], ['String']);
      if (data.hasOwnProperty('tracking_pixel_id'))
        obj.tracking_pixel_id = ApiClient.convertToType(data['tracking_pixel_id'], 'Number');
      if (data.hasOwnProperty('utm_params'))
        obj.utm_params = ApiClient.convertToType(data['utm_params'], [AdcreateUtmParams]);
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
 * @member {String} ad_format
 */
AdupdateCreatives.prototype.ad_format = undefined;

/**
 * @member {String} ad_id
 */
AdupdateCreatives.prototype.ad_id = undefined;

/**
 * @member {String} ad_name
 */
AdupdateCreatives.prototype.ad_name = undefined;

/**
 * @member {String} ad_text
 */
AdupdateCreatives.prototype.ad_text = undefined;

/**
 * @member {Array.<String>} ad_texts
 */
AdupdateCreatives.prototype.ad_texts = undefined;

/**
 * @member {String} aigc_disclosure_type
 * @default 'NOT_DECLARED'
 */
AdupdateCreatives.prototype.aigc_disclosure_type = 'NOT_DECLARED';

/**
 * @member {String} app_name
 */
AdupdateCreatives.prototype.app_name = undefined;

/**
 * @member {String} avatar_icon_web_uri
 */
AdupdateCreatives.prototype.avatar_icon_web_uri = undefined;

/**
 * @member {String} brand_safety_postbid_partner
 */
AdupdateCreatives.prototype.brand_safety_postbid_partner = undefined;

/**
 * @member {String} brand_safety_vast_url
 */
AdupdateCreatives.prototype.brand_safety_vast_url = undefined;

/**
 * @member {String} call_to_action
 */
AdupdateCreatives.prototype.call_to_action = undefined;

/**
 * @member {String} call_to_action_id
 */
AdupdateCreatives.prototype.call_to_action_id = undefined;

/**
 * @member {String} card_id
 */
AdupdateCreatives.prototype.card_id = undefined;

/**
 * @member {Number} carousel_image_index
 */
AdupdateCreatives.prototype.carousel_image_index = undefined;

/**
 * @member {String} click_tracking_url
 */
AdupdateCreatives.prototype.click_tracking_url = undefined;

/**
 * @member {String} cpp_url
 */
AdupdateCreatives.prototype.cpp_url = undefined;

/**
 * @member {Boolean} creative_authorized
 * @default false
 */
AdupdateCreatives.prototype.creative_authorized = false;

/**
 * @member {String} creative_type
 */
AdupdateCreatives.prototype.creative_type = undefined;

/**
 * @member {String} dark_post_status
 */
AdupdateCreatives.prototype.dark_post_status = undefined;

/**
 * @member {String} deeplink
 */
AdupdateCreatives.prototype.deeplink = undefined;

/**
 * @member {String} deeplink_type
 * @default 'NORMAL'
 */
AdupdateCreatives.prototype.deeplink_type = 'NORMAL';

/**
 * @member {Array.<module:model/AdcreateDeeplinkUtmParams>} deeplink_utm_params
 */
AdupdateCreatives.prototype.deeplink_utm_params = undefined;

/**
 * @member {Array.<module:model/AdcreateDisclaimerClickableTexts>} disclaimer_clickable_texts
 */
AdupdateCreatives.prototype.disclaimer_clickable_texts = undefined;

/**
 * @member {module:model/AdcreateDisclaimerText} disclaimer_text
 */
AdupdateCreatives.prototype.disclaimer_text = undefined;

/**
 * @member {String} disclaimer_type
 */
AdupdateCreatives.prototype.disclaimer_type = undefined;

/**
 * @member {String} display_name
 */
AdupdateCreatives.prototype.display_name = undefined;

/**
 * @member {String} dynamic_destination
 */
AdupdateCreatives.prototype.dynamic_destination = undefined;

/**
 * @member {String} dynamic_format
 */
AdupdateCreatives.prototype.dynamic_format = undefined;

/**
 * @member {String} end_card_cta
 */
AdupdateCreatives.prototype.end_card_cta = undefined;

/**
 * @member {String} fallback_type
 */
AdupdateCreatives.prototype.fallback_type = undefined;

/**
 * @member {String} identity_authorized_bc_id
 */
AdupdateCreatives.prototype.identity_authorized_bc_id = undefined;

/**
 * @member {String} identity_id
 */
AdupdateCreatives.prototype.identity_id = undefined;

/**
 * @member {String} identity_type
 */
AdupdateCreatives.prototype.identity_type = undefined;

/**
 * @member {Array.<String>} image_ids
 */
AdupdateCreatives.prototype.image_ids = undefined;

/**
 * @member {String} impression_tracking_url
 */
AdupdateCreatives.prototype.impression_tracking_url = undefined;

/**
 * @member {Boolean} instant_product_page_used
 */
AdupdateCreatives.prototype.instant_product_page_used = undefined;

/**
 * @member {String} item_duet_status
 */
AdupdateCreatives.prototype.item_duet_status = undefined;

/**
 * @member {Array.<String>} item_group_ids
 */
AdupdateCreatives.prototype.item_group_ids = undefined;

/**
 * @member {String} item_stitch_status
 */
AdupdateCreatives.prototype.item_stitch_status = undefined;

/**
 * @member {String} landing_page_url
 */
AdupdateCreatives.prototype.landing_page_url = undefined;

/**
 * @member {String} music_id
 */
AdupdateCreatives.prototype.music_id = undefined;

/**
 * @member {Number} page_id
 */
AdupdateCreatives.prototype.page_id = undefined;

/**
 * @member {Number} page_image_index
 */
AdupdateCreatives.prototype.page_image_index = undefined;

/**
 * @member {String} playable_url
 */
AdupdateCreatives.prototype.playable_url = undefined;

/**
 * @member {String} product_set_id
 */
AdupdateCreatives.prototype.product_set_id = undefined;

/**
 * @member {String} product_specific_type
 */
AdupdateCreatives.prototype.product_specific_type = undefined;

/**
 * @member {Boolean} promotional_music_disabled
 * @default true
 */
AdupdateCreatives.prototype.promotional_music_disabled = true;

/**
 * @member {String} shopping_ads_deeplink_type
 */
AdupdateCreatives.prototype.shopping_ads_deeplink_type = undefined;

/**
 * @member {String} shopping_ads_fallback_type
 */
AdupdateCreatives.prototype.shopping_ads_fallback_type = undefined;

/**
 * @member {String} shopping_ads_video_package_id
 */
AdupdateCreatives.prototype.shopping_ads_video_package_id = undefined;

/**
 * @member {Array.<String>} sku_ids
 */
AdupdateCreatives.prototype.sku_ids = undefined;

/**
 * @member {String} tiktok_item_id
 */
AdupdateCreatives.prototype.tiktok_item_id = undefined;

/**
 * @member {String} tracking_app_id
 */
AdupdateCreatives.prototype.tracking_app_id = undefined;

/**
 * @member {Array.<String>} tracking_offline_event_set_ids
 */
AdupdateCreatives.prototype.tracking_offline_event_set_ids = undefined;

/**
 * @member {Number} tracking_pixel_id
 */
AdupdateCreatives.prototype.tracking_pixel_id = undefined;

/**
 * @member {Array.<module:model/AdcreateUtmParams>} utm_params
 */
AdupdateCreatives.prototype.utm_params = undefined;

/**
 * @member {Boolean} vast_moat_enabled
 * @default false
 */
AdupdateCreatives.prototype.vast_moat_enabled = false;

/**
 * @member {String} vertical_video_strategy
 */
AdupdateCreatives.prototype.vertical_video_strategy = undefined;

/**
 * @member {String} video_id
 */
AdupdateCreatives.prototype.video_id = undefined;

/**
 * @member {String} video_view_tracking_url
 */
AdupdateCreatives.prototype.video_view_tracking_url = undefined;

/**
 * @member {String} viewability_postbid_partner
 */
AdupdateCreatives.prototype.viewability_postbid_partner = undefined;

/**
 * @member {String} viewability_vast_url
 */
AdupdateCreatives.prototype.viewability_vast_url = undefined;

