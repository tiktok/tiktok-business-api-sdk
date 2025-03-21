/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AppupdateTrackingUrl model module.
 * @module model/AppupdateTrackingUrl
 * @version 0.1.5
 */
export class AppupdateTrackingUrl {
  /**
   * Constructs a new <code>AppupdateTrackingUrl</code>.
   * @alias module:model/AppupdateTrackingUrl
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AppupdateTrackingUrl</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AppupdateTrackingUrl} obj Optional instance to populate.
   * @return {module:model/AppupdateTrackingUrl} The populated <code>AppupdateTrackingUrl</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AppupdateTrackingUrl();
      if (data.hasOwnProperty('click_url'))
        obj.click_url = ApiClient.convertToType(data['click_url'], 'String');
      if (data.hasOwnProperty('impression_url'))
        obj.impression_url = ApiClient.convertToType(data['impression_url'], 'String');
      if (data.hasOwnProperty('retargeting_click_url'))
        obj.retargeting_click_url = ApiClient.convertToType(data['retargeting_click_url'], 'String');
      if (data.hasOwnProperty('retargeting_impression_url'))
        obj.retargeting_impression_url = ApiClient.convertToType(data['retargeting_impression_url'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} click_url
 */
AppupdateTrackingUrl.prototype.click_url = undefined;

/**
 * @member {String} impression_url
 */
AppupdateTrackingUrl.prototype.impression_url = undefined;

/**
 * @member {String} retargeting_click_url
 */
AppupdateTrackingUrl.prototype.retargeting_click_url = undefined;

/**
 * @member {String} retargeting_impression_url
 */
AppupdateTrackingUrl.prototype.retargeting_impression_url = undefined;

