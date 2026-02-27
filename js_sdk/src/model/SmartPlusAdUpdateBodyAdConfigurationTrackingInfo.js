/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdUpdateBodyAdConfigurationTrackingInfo model module.
 * @module model/SmartPlusAdUpdateBodyAdConfigurationTrackingInfo
 * @version 1.2.1
 */
export class SmartPlusAdUpdateBodyAdConfigurationTrackingInfo {
  /**
   * Constructs a new <code>SmartPlusAdUpdateBodyAdConfigurationTrackingInfo</code>.
   * @alias module:model/SmartPlusAdUpdateBodyAdConfigurationTrackingInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SmartPlusAdUpdateBodyAdConfigurationTrackingInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdUpdateBodyAdConfigurationTrackingInfo} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdUpdateBodyAdConfigurationTrackingInfo} The populated <code>SmartPlusAdUpdateBodyAdConfigurationTrackingInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdUpdateBodyAdConfigurationTrackingInfo();
      if (data.hasOwnProperty('click_tracking_url'))
        obj.click_tracking_url = ApiClient.convertToType(data['click_tracking_url'], 'String');
      if (data.hasOwnProperty('impression_tracking_url'))
        obj.impression_tracking_url = ApiClient.convertToType(data['impression_tracking_url'], 'String');
      if (data.hasOwnProperty('tracking_app_id'))
        obj.tracking_app_id = ApiClient.convertToType(data['tracking_app_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} click_tracking_url
 */
SmartPlusAdUpdateBodyAdConfigurationTrackingInfo.prototype.click_tracking_url = undefined;

/**
 * @member {String} impression_tracking_url
 */
SmartPlusAdUpdateBodyAdConfigurationTrackingInfo.prototype.impression_tracking_url = undefined;

/**
 * @member {String} tracking_app_id
 */
SmartPlusAdUpdateBodyAdConfigurationTrackingInfo.prototype.tracking_app_id = undefined;

