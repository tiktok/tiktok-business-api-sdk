/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyAdConfigurationTrackingInfo model module.
 * @module model/SmartPlusAdCreateBodyAdConfigurationTrackingInfo
 * @version 0.1.8
 */
export class SmartPlusAdCreateBodyAdConfigurationTrackingInfo {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyAdConfigurationTrackingInfo</code>.
   * @alias module:model/SmartPlusAdCreateBodyAdConfigurationTrackingInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyAdConfigurationTrackingInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyAdConfigurationTrackingInfo} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyAdConfigurationTrackingInfo} The populated <code>SmartPlusAdCreateBodyAdConfigurationTrackingInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyAdConfigurationTrackingInfo();
      if (data.hasOwnProperty('click_tracking_url'))
        obj.click_tracking_url = ApiClient.convertToType(data['click_tracking_url'], 'String');
      if (data.hasOwnProperty('impression_tracking_url'))
        obj.impression_tracking_url = ApiClient.convertToType(data['impression_tracking_url'], 'String');
      if (data.hasOwnProperty('tracking_app_id'))
        obj.tracking_app_id = ApiClient.convertToType(data['tracking_app_id'], 'String');
      if (data.hasOwnProperty('tracking_message_event_set_id'))
        obj.tracking_message_event_set_id = ApiClient.convertToType(data['tracking_message_event_set_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} click_tracking_url
 */
SmartPlusAdCreateBodyAdConfigurationTrackingInfo.prototype.click_tracking_url = undefined;

/**
 * @member {String} impression_tracking_url
 */
SmartPlusAdCreateBodyAdConfigurationTrackingInfo.prototype.impression_tracking_url = undefined;

/**
 * @member {String} tracking_app_id
 */
SmartPlusAdCreateBodyAdConfigurationTrackingInfo.prototype.tracking_app_id = undefined;

/**
 * @member {String} tracking_message_event_set_id
 */
SmartPlusAdCreateBodyAdConfigurationTrackingInfo.prototype.tracking_message_event_set_id = undefined;

