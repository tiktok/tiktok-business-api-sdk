/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {SmartPlusAdCreateBodyAdConfigurationPhoneInfo} from './SmartPlusAdCreateBodyAdConfigurationPhoneInfo.js';
import {SmartPlusAdUpdateBodyAdConfigurationTrackingInfo} from './SmartPlusAdUpdateBodyAdConfigurationTrackingInfo.js';
import {SmartPlusAdUpdateBodyAdConfigurationUtmParams} from './SmartPlusAdUpdateBodyAdConfigurationUtmParams.js';

/**
 * The SmartPlusAdUpdateBodyAdConfiguration model module.
 * @module model/SmartPlusAdUpdateBodyAdConfiguration
 * @version 0.1.8
 */
export class SmartPlusAdUpdateBodyAdConfiguration {
  /**
   * Constructs a new <code>SmartPlusAdUpdateBodyAdConfiguration</code>.
   * @alias module:model/SmartPlusAdUpdateBodyAdConfiguration
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SmartPlusAdUpdateBodyAdConfiguration</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdUpdateBodyAdConfiguration} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdUpdateBodyAdConfiguration} The populated <code>SmartPlusAdUpdateBodyAdConfiguration</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdUpdateBodyAdConfiguration();
      if (data.hasOwnProperty('auto_disclaimer_types'))
        obj.auto_disclaimer_types = ApiClient.convertToType(data['auto_disclaimer_types'], ['String']);
      if (data.hasOwnProperty('call_to_action_id'))
        obj.call_to_action_id = ApiClient.convertToType(data['call_to_action_id'], 'String');
      if (data.hasOwnProperty('catalog_creative_toggle'))
        obj.catalog_creative_toggle = ApiClient.convertToType(data['catalog_creative_toggle'], 'Boolean');
      if (data.hasOwnProperty('dark_post_status'))
        obj.dark_post_status = ApiClient.convertToType(data['dark_post_status'], 'String');
      if (data.hasOwnProperty('end_card_cta'))
        obj.end_card_cta = ApiClient.convertToType(data['end_card_cta'], 'String');
      if (data.hasOwnProperty('fallback_type'))
        obj.fallback_type = ApiClient.convertToType(data['fallback_type'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('phone_info'))
        obj.phone_info = SmartPlusAdCreateBodyAdConfigurationPhoneInfo.constructFromObject(data['phone_info']);
      if (data.hasOwnProperty('product_ids'))
        obj.product_ids = ApiClient.convertToType(data['product_ids'], ['String']);
      if (data.hasOwnProperty('product_set_id'))
        obj.product_set_id = ApiClient.convertToType(data['product_set_id'], 'String');
      if (data.hasOwnProperty('product_specific_type'))
        obj.product_specific_type = ApiClient.convertToType(data['product_specific_type'], 'String');
      if (data.hasOwnProperty('tracking_info'))
        obj.tracking_info = SmartPlusAdUpdateBodyAdConfigurationTrackingInfo.constructFromObject(data['tracking_info']);
      if (data.hasOwnProperty('utm_params'))
        obj.utm_params = ApiClient.convertToType(data['utm_params'], [SmartPlusAdUpdateBodyAdConfigurationUtmParams]);
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} auto_disclaimer_types
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.auto_disclaimer_types = undefined;

/**
 * @member {String} call_to_action_id
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.call_to_action_id = undefined;

/**
 * @member {Boolean} catalog_creative_toggle
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.catalog_creative_toggle = undefined;

/**
 * @member {String} dark_post_status
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.dark_post_status = undefined;

/**
 * @member {String} end_card_cta
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.end_card_cta = undefined;

/**
 * @member {String} fallback_type
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.fallback_type = undefined;

/**
 * @member {String} identity_id
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.identity_id = undefined;

/**
 * @member {String} identity_type
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.identity_type = undefined;

/**
 * @member {module:model/SmartPlusAdCreateBodyAdConfigurationPhoneInfo} phone_info
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.phone_info = undefined;

/**
 * @member {Array.<String>} product_ids
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.product_ids = undefined;

/**
 * @member {String} product_set_id
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.product_set_id = undefined;

/**
 * @member {String} product_specific_type
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.product_specific_type = undefined;

/**
 * @member {module:model/SmartPlusAdUpdateBodyAdConfigurationTrackingInfo} tracking_info
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.tracking_info = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdUpdateBodyAdConfigurationUtmParams>} utm_params
 */
SmartPlusAdUpdateBodyAdConfiguration.prototype.utm_params = undefined;

