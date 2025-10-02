/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdAcoBodyCommonMaterialTrackingInfo} from './AdAcoBodyCommonMaterialTrackingInfo.js';

/**
 * The AdAcoBodyCommonMaterial model module.
 * @module model/AdAcoBodyCommonMaterial
 * @version 0.1.8
 */
export class AdAcoBodyCommonMaterial {
  /**
   * Constructs a new <code>AdAcoBodyCommonMaterial</code>.
   * Common material.
   * @alias module:model/AdAcoBodyCommonMaterial
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyCommonMaterial</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyCommonMaterial} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyCommonMaterial} The populated <code>AdAcoBodyCommonMaterial</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyCommonMaterial();
      if (data.hasOwnProperty('ad_name'))
        obj.ad_name = ApiClient.convertToType(data['ad_name'], 'String');
      if (data.hasOwnProperty('call_to_action_id'))
        obj.call_to_action_id = ApiClient.convertToType(data['call_to_action_id'], 'String');
      if (data.hasOwnProperty('creative_authorized'))
        obj.creative_authorized = ApiClient.convertToType(data['creative_authorized'], 'Boolean');
      if (data.hasOwnProperty('fallback_type'))
        obj.fallback_type = ApiClient.convertToType(data['fallback_type'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('is_smart_creative'))
        obj.is_smart_creative = ApiClient.convertToType(data['is_smart_creative'], 'Boolean');
      if (data.hasOwnProperty('playable_url'))
        obj.playable_url = ApiClient.convertToType(data['playable_url'], 'String');
      if (data.hasOwnProperty('tracking_info'))
        obj.tracking_info = AdAcoBodyCommonMaterialTrackingInfo.constructFromObject(data['tracking_info']);
    }
    return obj;
  }
}

/**
 * Ad name. Set as \" \" (Empty string) for it to be automatically generated. The format of auto-generated ad name is- creative name + creation time (e.g. adcreative20210111190739). Character limit is 512 and cannot contain emoji.
 * @member {String} ad_name
 */
AdAcoBodyCommonMaterial.prototype.ad_name = undefined;

/**
 * The ID of the CTA portfolio that you want to use in your ads. A CTA portfolio is a group of auto-optimized CTAs. For details about auto-optimized CTAs, see [CTA recommendations > Dynamic CTAs](https://ads.tiktok.com/marketing_api/docs?id=1740307296329730)
 * @member {String} call_to_action_id
 */
AdAcoBodyCommonMaterial.prototype.call_to_action_id = undefined;

/**
 * Whether you grant displaying some of your ads in our TikTok for Business Creative Center. Only valid for non-US advertisers, the default value is `false`.
 * @member {Boolean} creative_authorized
 */
AdAcoBodyCommonMaterial.prototype.creative_authorized = undefined;

/**
 * Fallback Type. If the audience do not have the app installed, you can have them fall back to install the app, or to view a specific web page.  Allowed values- `APP_INSTALL `, `WEBSITE`. If website is chosen, you need to specify the url via `landing_page_urls` field.
 * @member {String} fallback_type
 */
AdAcoBodyCommonMaterial.prototype.fallback_type = undefined;

/**
 * Identity ID, required when you use Spark Ads (`tiktok_item_id`).
 * @member {String} identity_id
 */
AdAcoBodyCommonMaterial.prototype.identity_id = undefined;

/**
 * Identity type. Required when you use Spark Ads (`tiktok_item_id`). Enum values- `AUTH_CODE`, `TT_USER`. For details about identities, see [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097).
 * @member {String} identity_type
 */
AdAcoBodyCommonMaterial.prototype.identity_type = undefined;

/**
 * Whether the ad is a Smart Creative ad. Default value- `False`. Smart Creative is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative.
 * @member {Boolean} is_smart_creative
 */
AdAcoBodyCommonMaterial.prototype.is_smart_creative = undefined;

/**
 * Playable material url, valid only in Pangle placement. You can get the url via the [/playable/get/](https://ads.tiktok.com/marketing_api/docs?id=1737732758495234) endpoint. Note that all ads in the same ad group share the same playable material.
 * @member {String} playable_url
 */
AdAcoBodyCommonMaterial.prototype.playable_url = undefined;

/**
 * @member {module:model/AdAcoBodyCommonMaterialTrackingInfo} tracking_info
 */
AdAcoBodyCommonMaterial.prototype.tracking_info = undefined;

