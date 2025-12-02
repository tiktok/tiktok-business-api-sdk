/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AppupdateTrackingUrl} from './AppupdateTrackingUrl.js';

/**
 * The AppUpdateBody model module.
 * @module model/AppUpdateBody
 * @version 0.1.9
 */
export class AppUpdateBody {
  /**
   * Constructs a new <code>AppUpdateBody</code>.
   * @alias module:model/AppUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param app_id {String} 
   */
  constructor(advertiser_id, app_id) {
    this.advertiser_id = advertiser_id;
    this.app_id = app_id;
  }

  /**
   * Constructs a <code>AppUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AppUpdateBody} obj Optional instance to populate.
   * @return {module:model/AppUpdateBody} The populated <code>AppUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AppUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('download_url'))
        obj.download_url = ApiClient.convertToType(data['download_url'], 'String');
      if (data.hasOwnProperty('enable_retargeting'))
        obj.enable_retargeting = ApiClient.convertToType(data['enable_retargeting'], 'String');
      if (data.hasOwnProperty('partner'))
        obj.partner = ApiClient.convertToType(data['partner'], 'String');
      if (data.hasOwnProperty('platform'))
        obj.platform = ApiClient.convertToType(data['platform'], 'String');
      if (data.hasOwnProperty('tracking_url'))
        obj.tracking_url = AppupdateTrackingUrl.constructFromObject(data['tracking_url']);
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
AppUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} app_id
 */
AppUpdateBody.prototype.app_id = undefined;

/**
 * @member {String} download_url
 */
AppUpdateBody.prototype.download_url = undefined;

/**
 * @member {String} enable_retargeting
 * @default 'NON_RETARGETING'
 */
AppUpdateBody.prototype.enable_retargeting = 'NON_RETARGETING';

/**
 * @member {String} partner
 */
AppUpdateBody.prototype.partner = undefined;

/**
 * @member {String} platform
 */
AppUpdateBody.prototype.platform = undefined;

/**
 * @member {module:model/AppupdateTrackingUrl} tracking_url
 */
AppUpdateBody.prototype.tracking_url = undefined;

