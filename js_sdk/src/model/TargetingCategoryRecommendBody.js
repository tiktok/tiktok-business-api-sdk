/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The TargetingCategoryRecommendBody model module.
 * @module model/TargetingCategoryRecommendBody
 * @version 0.1.1
 */
export class TargetingCategoryRecommendBody {
  /**
   * Constructs a new <code>TargetingCategoryRecommendBody</code>.
   * @alias module:model/TargetingCategoryRecommendBody
   * @class
   * @param advertiser_id {String} Advertiser ID
   */
  constructor(advertiser_id) {
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>TargetingCategoryRecommendBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TargetingCategoryRecommendBody} obj Optional instance to populate.
   * @return {module:model/TargetingCategoryRecommendBody} The populated <code>TargetingCategoryRecommendBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new TargetingCategoryRecommendBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('region_codes'))
        obj.region_codes = ApiClient.convertToType(data['region_codes'], ['String']);
    }
    return obj;
  }
}

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
TargetingCategoryRecommendBody.prototype.advertiser_id = undefined;

/**
 * ID of the mobile app that you want to promote. This field in optional and only valid if you want to promote a mobile app
 * @member {String} app_id
 */
TargetingCategoryRecommendBody.prototype.app_id = undefined;

/**
 * List of country or region codes
 * @member {Array.<String>} region_codes
 */
TargetingCategoryRecommendBody.prototype.region_codes = undefined;

