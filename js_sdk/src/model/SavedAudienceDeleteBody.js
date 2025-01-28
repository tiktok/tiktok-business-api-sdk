/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SavedAudienceDeleteBody model module.
 * @module model/SavedAudienceDeleteBody
 * @version 0.1.3
 */
export class SavedAudienceDeleteBody {
  /**
   * Constructs a new <code>SavedAudienceDeleteBody</code>.
   * @alias module:model/SavedAudienceDeleteBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param saved_audience_ids {Array.<String>} IDs of Saved Audiences that you want to delete. Max size = 100.
   */
  constructor(advertiser_id, saved_audience_ids) {
    this.advertiser_id = advertiser_id;
    this.saved_audience_ids = saved_audience_ids;
  }

  /**
   * Constructs a <code>SavedAudienceDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SavedAudienceDeleteBody} obj Optional instance to populate.
   * @return {module:model/SavedAudienceDeleteBody} The populated <code>SavedAudienceDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SavedAudienceDeleteBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('saved_audience_ids'))
        obj.saved_audience_ids = ApiClient.convertToType(data['saved_audience_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
SavedAudienceDeleteBody.prototype.advertiser_id = undefined;

/**
 * IDs of Saved Audiences that you want to delete. Max size = 100.
 * @member {Array.<String>} saved_audience_ids
 */
SavedAudienceDeleteBody.prototype.saved_audience_ids = undefined;

