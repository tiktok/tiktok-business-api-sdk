/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AppcreateTrackingUrl} from './AppcreateTrackingUrl.js';

/**
 * The AppCreateBody model module.
 * @module model/AppCreateBody
 * @version 0.1.9
 */
export class AppCreateBody {
  /**
   * Constructs a new <code>AppCreateBody</code>.
   * @alias module:model/AppCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param download_url {String} 
   */
  constructor(advertiser_id, download_url) {
    this.advertiser_id = advertiser_id;
    this.download_url = download_url;
  }

  /**
   * Constructs a <code>AppCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AppCreateBody} obj Optional instance to populate.
   * @return {module:model/AppCreateBody} The populated <code>AppCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AppCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('download_url'))
        obj.download_url = ApiClient.convertToType(data['download_url'], 'String');
      if (data.hasOwnProperty('enable_retargeting'))
        obj.enable_retargeting = ApiClient.convertToType(data['enable_retargeting'], 'String');
      if (data.hasOwnProperty('partner'))
        obj.partner = ApiClient.convertToType(data['partner'], 'String');
      if (data.hasOwnProperty('tracking_url'))
        obj.tracking_url = AppcreateTrackingUrl.constructFromObject(data['tracking_url']);
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
AppCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} download_url
 */
AppCreateBody.prototype.download_url = undefined;

/**
 * @member {String} enable_retargeting
 * @default 'NON_RETARGETING'
 */
AppCreateBody.prototype.enable_retargeting = 'NON_RETARGETING';

/**
 * @member {String} partner
 */
AppCreateBody.prototype.partner = undefined;

/**
 * @member {module:model/AppcreateTrackingUrl} tracking_url
 */
AppCreateBody.prototype.tracking_url = undefined;

