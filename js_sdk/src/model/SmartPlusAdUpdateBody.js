/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {SmartPlusAdCreateBodyAdTextList} from './SmartPlusAdCreateBodyAdTextList.js';
import {SmartPlusAdCreateBodyCallToActionList} from './SmartPlusAdCreateBodyCallToActionList.js';
import {SmartPlusAdCreateBodyDeeplinkList} from './SmartPlusAdCreateBodyDeeplinkList.js';
import {SmartPlusAdCreateBodyInteractiveAddOnList} from './SmartPlusAdCreateBodyInteractiveAddOnList.js';
import {SmartPlusAdCreateBodyLandingPageUrlList} from './SmartPlusAdCreateBodyLandingPageUrlList.js';
import {SmartPlusAdCreateBodyPageList} from './SmartPlusAdCreateBodyPageList.js';
import {SmartPlusAdUpdateBodyAdConfiguration} from './SmartPlusAdUpdateBodyAdConfiguration.js';
import {SmartPlusAdUpdateBodyCreativeList} from './SmartPlusAdUpdateBodyCreativeList.js';

/**
 * The SmartPlusAdUpdateBody model module.
 * @module model/SmartPlusAdUpdateBody
 * @version 0.1.8
 */
export class SmartPlusAdUpdateBody {
  /**
   * Constructs a new <code>SmartPlusAdUpdateBody</code>.
   * @alias module:model/SmartPlusAdUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param smart_plus_ad_id {String} 
   */
  constructor(advertiser_id, smart_plus_ad_id) {
    this.advertiser_id = advertiser_id;
    this.smart_plus_ad_id = smart_plus_ad_id;
  }

  /**
   * Constructs a <code>SmartPlusAdUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdUpdateBody} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdUpdateBody} The populated <code>SmartPlusAdUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdUpdateBody();
      if (data.hasOwnProperty('ad_configuration'))
        obj.ad_configuration = SmartPlusAdUpdateBodyAdConfiguration.constructFromObject(data['ad_configuration']);
      if (data.hasOwnProperty('ad_name'))
        obj.ad_name = ApiClient.convertToType(data['ad_name'], 'String');
      if (data.hasOwnProperty('ad_text_list'))
        obj.ad_text_list = ApiClient.convertToType(data['ad_text_list'], [SmartPlusAdCreateBodyAdTextList]);
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('call_to_action_list'))
        obj.call_to_action_list = ApiClient.convertToType(data['call_to_action_list'], [SmartPlusAdCreateBodyCallToActionList]);
      if (data.hasOwnProperty('creative_list'))
        obj.creative_list = ApiClient.convertToType(data['creative_list'], [SmartPlusAdUpdateBodyCreativeList]);
      if (data.hasOwnProperty('deeplink_list'))
        obj.deeplink_list = ApiClient.convertToType(data['deeplink_list'], [SmartPlusAdCreateBodyDeeplinkList]);
      if (data.hasOwnProperty('interactive_add_on_list'))
        obj.interactive_add_on_list = ApiClient.convertToType(data['interactive_add_on_list'], [SmartPlusAdCreateBodyInteractiveAddOnList]);
      if (data.hasOwnProperty('landing_page_url_list'))
        obj.landing_page_url_list = ApiClient.convertToType(data['landing_page_url_list'], [SmartPlusAdCreateBodyLandingPageUrlList]);
      if (data.hasOwnProperty('page_list'))
        obj.page_list = ApiClient.convertToType(data['page_list'], [SmartPlusAdCreateBodyPageList]);
      if (data.hasOwnProperty('smart_plus_ad_id'))
        obj.smart_plus_ad_id = ApiClient.convertToType(data['smart_plus_ad_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {module:model/SmartPlusAdUpdateBodyAdConfiguration} ad_configuration
 */
SmartPlusAdUpdateBody.prototype.ad_configuration = undefined;

/**
 * @member {String} ad_name
 */
SmartPlusAdUpdateBody.prototype.ad_name = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyAdTextList>} ad_text_list
 */
SmartPlusAdUpdateBody.prototype.ad_text_list = undefined;

/**
 * @member {String} advertiser_id
 */
SmartPlusAdUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyCallToActionList>} call_to_action_list
 */
SmartPlusAdUpdateBody.prototype.call_to_action_list = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdUpdateBodyCreativeList>} creative_list
 */
SmartPlusAdUpdateBody.prototype.creative_list = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyDeeplinkList>} deeplink_list
 */
SmartPlusAdUpdateBody.prototype.deeplink_list = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyInteractiveAddOnList>} interactive_add_on_list
 */
SmartPlusAdUpdateBody.prototype.interactive_add_on_list = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyLandingPageUrlList>} landing_page_url_list
 */
SmartPlusAdUpdateBody.prototype.landing_page_url_list = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyPageList>} page_list
 */
SmartPlusAdUpdateBody.prototype.page_list = undefined;

/**
 * @member {String} smart_plus_ad_id
 */
SmartPlusAdUpdateBody.prototype.smart_plus_ad_id = undefined;

