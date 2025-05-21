/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdcreateCreatives} from './AdcreateCreatives.js';

/**
 * The AdCreateBody model module.
 * @module model/AdCreateBody
 * @version 0.1.7
 */
export class AdCreateBody {
  /**
   * Constructs a new <code>AdCreateBody</code>.
   * @alias module:model/AdCreateBody
   * @class
   * @param adgroup_id {String} Ad group ID
   * @param advertiser_id {String} Advertiser ID
   * @param creatives {Array.<module:model/AdcreateCreatives>} Advertising creatives.
   */
  constructor(adgroup_id, advertiser_id, creatives) {
    this.adgroup_id = adgroup_id;
    this.advertiser_id = advertiser_id;
    this.creatives = creatives;
  }

  /**
   * Constructs a <code>AdCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdCreateBody} obj Optional instance to populate.
   * @return {module:model/AdCreateBody} The populated <code>AdCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdCreateBody();
      if (data.hasOwnProperty('adgroup_id'))
        obj.adgroup_id = ApiClient.convertToType(data['adgroup_id'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('creatives'))
        obj.creatives = ApiClient.convertToType(data['creatives'], [AdcreateCreatives]);
    }
    return obj;
  }
}

/**
 * Ad group ID
 * @member {String} adgroup_id
 */
AdCreateBody.prototype.adgroup_id = undefined;

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
AdCreateBody.prototype.advertiser_id = undefined;

/**
 * Advertising creatives.
 * @member {Array.<module:model/AdcreateCreatives>} creatives
 */
AdCreateBody.prototype.creatives = undefined;

