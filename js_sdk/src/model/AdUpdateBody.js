/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OpenApiv13adupdateCreatives} from './OpenApiv13adupdateCreatives.js';

/**
 * The AdUpdateBody model module.
 * @module model/AdUpdateBody
 * @version 0.1.2
 */
export class AdUpdateBody {
  /**
   * Constructs a new <code>AdUpdateBody</code>.
   * @alias module:model/AdUpdateBody
   * @class
   * @param adgroup_id {String} Ad group ID
   * @param advertiser_id {String} Advertiser ID
   * @param creatives {Array.<module:model/OpenApiv13adupdateCreatives>} Advertising creatives.
   */
  constructor(adgroup_id, advertiser_id, creatives) {
    this.adgroup_id = adgroup_id;
    this.advertiser_id = advertiser_id;
    this.creatives = creatives;
  }

  /**
   * Constructs a <code>AdUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdUpdateBody} obj Optional instance to populate.
   * @return {module:model/AdUpdateBody} The populated <code>AdUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdUpdateBody();
      if (data.hasOwnProperty('adgroup_id'))
        obj.adgroup_id = ApiClient.convertToType(data['adgroup_id'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('creatives'))
        obj.creatives = ApiClient.convertToType(data['creatives'], [OpenApiv13adupdateCreatives]);
    }
    return obj;
  }
}

/**
 * Ad group ID
 * @member {String} adgroup_id
 */
AdUpdateBody.prototype.adgroup_id = undefined;

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
AdUpdateBody.prototype.advertiser_id = undefined;

/**
 * Advertising creatives.
 * @member {Array.<module:model/OpenApiv13adupdateCreatives>} creatives
 */
AdUpdateBody.prototype.creatives = undefined;

