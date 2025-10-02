/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {SmartPlusAdCreateBodyAdConfiguration} from './SmartPlusAdCreateBodyAdConfiguration.js';
import {SmartPlusAdCreateBodyAdTextList} from './SmartPlusAdCreateBodyAdTextList.js';
import {SmartPlusAdCreateBodyAutoMessageList} from './SmartPlusAdCreateBodyAutoMessageList.js';
import {SmartPlusAdCreateBodyCallToActionList} from './SmartPlusAdCreateBodyCallToActionList.js';
import {SmartPlusAdCreateBodyCreativeList} from './SmartPlusAdCreateBodyCreativeList.js';
import {SmartPlusAdCreateBodyDeeplinkList} from './SmartPlusAdCreateBodyDeeplinkList.js';
import {SmartPlusAdCreateBodyInteractiveAddOnList} from './SmartPlusAdCreateBodyInteractiveAddOnList.js';
import {SmartPlusAdCreateBodyLandingPageUrlList} from './SmartPlusAdCreateBodyLandingPageUrlList.js';
import {SmartPlusAdCreateBodyPageList} from './SmartPlusAdCreateBodyPageList.js';

/**
 * The SmartPlusAdCreateBody model module.
 * @module model/SmartPlusAdCreateBody
 * @version 0.1.8
 */
export class SmartPlusAdCreateBody {
  /**
   * Constructs a new <code>SmartPlusAdCreateBody</code>.
   * @alias module:model/SmartPlusAdCreateBody
   * @class
   * @param ad_name {String} 
   * @param adgroup_id {String} 
   * @param advertiser_id {String} 
   */
  constructor(ad_name, adgroup_id, advertiser_id) {
    this.ad_name = ad_name;
    this.adgroup_id = adgroup_id;
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBody} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBody} The populated <code>SmartPlusAdCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBody();
      if (data.hasOwnProperty('ad_configuration'))
        obj.ad_configuration = SmartPlusAdCreateBodyAdConfiguration.constructFromObject(data['ad_configuration']);
      if (data.hasOwnProperty('ad_name'))
        obj.ad_name = ApiClient.convertToType(data['ad_name'], 'String');
      if (data.hasOwnProperty('ad_text_list'))
        obj.ad_text_list = ApiClient.convertToType(data['ad_text_list'], [SmartPlusAdCreateBodyAdTextList]);
      if (data.hasOwnProperty('adgroup_id'))
        obj.adgroup_id = ApiClient.convertToType(data['adgroup_id'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('auto_message_list'))
        obj.auto_message_list = ApiClient.convertToType(data['auto_message_list'], [SmartPlusAdCreateBodyAutoMessageList]);
      if (data.hasOwnProperty('call_to_action_list'))
        obj.call_to_action_list = ApiClient.convertToType(data['call_to_action_list'], [SmartPlusAdCreateBodyCallToActionList]);
      if (data.hasOwnProperty('creative_list'))
        obj.creative_list = ApiClient.convertToType(data['creative_list'], [SmartPlusAdCreateBodyCreativeList]);
      if (data.hasOwnProperty('deeplink_list'))
        obj.deeplink_list = ApiClient.convertToType(data['deeplink_list'], [SmartPlusAdCreateBodyDeeplinkList]);
      if (data.hasOwnProperty('interactive_add_on_list'))
        obj.interactive_add_on_list = ApiClient.convertToType(data['interactive_add_on_list'], [SmartPlusAdCreateBodyInteractiveAddOnList]);
      if (data.hasOwnProperty('landing_page_url_list'))
        obj.landing_page_url_list = ApiClient.convertToType(data['landing_page_url_list'], [SmartPlusAdCreateBodyLandingPageUrlList]);
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
      if (data.hasOwnProperty('page_list'))
        obj.page_list = ApiClient.convertToType(data['page_list'], [SmartPlusAdCreateBodyPageList]);
    }
    return obj;
  }
}

/**
 * @member {module:model/SmartPlusAdCreateBodyAdConfiguration} ad_configuration
 */
SmartPlusAdCreateBody.prototype.ad_configuration = undefined;

/**
 * @member {String} ad_name
 */
SmartPlusAdCreateBody.prototype.ad_name = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyAdTextList>} ad_text_list
 */
SmartPlusAdCreateBody.prototype.ad_text_list = undefined;

/**
 * @member {String} adgroup_id
 */
SmartPlusAdCreateBody.prototype.adgroup_id = undefined;

/**
 * @member {String} advertiser_id
 */
SmartPlusAdCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyAutoMessageList>} auto_message_list
 */
SmartPlusAdCreateBody.prototype.auto_message_list = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyCallToActionList>} call_to_action_list
 */
SmartPlusAdCreateBody.prototype.call_to_action_list = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyCreativeList>} creative_list
 */
SmartPlusAdCreateBody.prototype.creative_list = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyDeeplinkList>} deeplink_list
 */
SmartPlusAdCreateBody.prototype.deeplink_list = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyInteractiveAddOnList>} interactive_add_on_list
 */
SmartPlusAdCreateBody.prototype.interactive_add_on_list = undefined;

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyLandingPageUrlList>} landing_page_url_list
 */
SmartPlusAdCreateBody.prototype.landing_page_url_list = undefined;

/**
 * @member {String} operation_status
 * @default 'ENABLE'
 */
SmartPlusAdCreateBody.prototype.operation_status = 'ENABLE';

/**
 * @member {Array.<module:model/SmartPlusAdCreateBodyPageList>} page_list
 */
SmartPlusAdCreateBody.prototype.page_list = undefined;

