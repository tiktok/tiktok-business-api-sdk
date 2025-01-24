/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CustomAudienceDeleteBody model module.
 * @module model/CustomAudienceDeleteBody
 * @version 0.1.3
 */
export class CustomAudienceDeleteBody {
  /**
   * Constructs a new <code>CustomAudienceDeleteBody</code>.
   * @alias module:model/CustomAudienceDeleteBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param custom_audience_ids {Array.<String>} A list of Audience IDs. Length range is [1, 100].
   */
  constructor(advertiser_id, custom_audience_ids) {
    this.advertiser_id = advertiser_id;
    this.custom_audience_ids = custom_audience_ids;
  }

  /**
   * Constructs a <code>CustomAudienceDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CustomAudienceDeleteBody} obj Optional instance to populate.
   * @return {module:model/CustomAudienceDeleteBody} The populated <code>CustomAudienceDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CustomAudienceDeleteBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('custom_audience_ids'))
        obj.custom_audience_ids = ApiClient.convertToType(data['custom_audience_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
CustomAudienceDeleteBody.prototype.advertiser_id = undefined;

/**
 * A list of Audience IDs. Length range is [1, 100].
 * @member {Array.<String>} custom_audience_ids
 */
CustomAudienceDeleteBody.prototype.custom_audience_ids = undefined;

