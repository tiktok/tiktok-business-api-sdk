/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudiencefileuploadContextInfo} from './DmpcustomAudiencefileuploadContextInfo.js';

/**
 * The LookalikeUpdateBody model module.
 * @module model/LookalikeUpdateBody
 * @version 1.2.1
 */
export class LookalikeUpdateBody {
  /**
   * Constructs a new <code>LookalikeUpdateBody</code>.
   * @alias module:model/LookalikeUpdateBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param custom_audience_ids {Array.<String>} A list of custom audience IDs.
   */
  constructor(advertiser_id, custom_audience_ids) {
    this.advertiser_id = advertiser_id;
    this.custom_audience_ids = custom_audience_ids;
  }

  /**
   * Constructs a <code>LookalikeUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LookalikeUpdateBody} obj Optional instance to populate.
   * @return {module:model/LookalikeUpdateBody} The populated <code>LookalikeUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new LookalikeUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('context_info'))
        obj.context_info = DmpcustomAudiencefileuploadContextInfo.constructFromObject(data['context_info']);
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
LookalikeUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {module:model/DmpcustomAudiencefileuploadContextInfo} context_info
 */
LookalikeUpdateBody.prototype.context_info = undefined;

/**
 * A list of custom audience IDs.
 * @member {Array.<String>} custom_audience_ids
 */
LookalikeUpdateBody.prototype.custom_audience_ids = undefined;

