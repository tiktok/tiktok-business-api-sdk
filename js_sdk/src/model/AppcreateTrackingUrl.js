/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AppcreateTrackingUrl model module.
 * @module model/AppcreateTrackingUrl
 * @version 0.1.8
 */
export class AppcreateTrackingUrl {
  /**
   * Constructs a new <code>AppcreateTrackingUrl</code>.
   * @alias module:model/AppcreateTrackingUrl
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AppcreateTrackingUrl</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AppcreateTrackingUrl} obj Optional instance to populate.
   * @return {module:model/AppcreateTrackingUrl} The populated <code>AppcreateTrackingUrl</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AppcreateTrackingUrl();
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
AppcreateTrackingUrl.prototype.click_url = undefined;

/**
 * @member {String} impression_url
 */
AppcreateTrackingUrl.prototype.impression_url = undefined;

/**
 * @member {String} retargeting_click_url
 */
AppcreateTrackingUrl.prototype.retargeting_click_url = undefined;

/**
 * @member {String} retargeting_impression_url
 */
AppcreateTrackingUrl.prototype.retargeting_impression_url = undefined;

