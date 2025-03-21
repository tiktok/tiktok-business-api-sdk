/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudiencefileuploadContextInfo} from './DmpcustomAudiencefileuploadContextInfo.js';

/**
 * The CustomAudienceShareBody model module.
 * @module model/CustomAudienceShareBody
 * @version 0.1.5
 */
export class CustomAudienceShareBody {
  /**
   * Constructs a new <code>CustomAudienceShareBody</code>.
   * @alias module:model/CustomAudienceShareBody
   * @class
   * @param advertiser_id {String} Operator advertiser ID.
   * @param custom_audience_ids {Array.<String>} Custom audiences that you want to share. Size: 1-10.
   * @param shared_advertiser_ids {Array.<String>} Advertisers that you want to share audiences with. They must be in the same Business Center as you. Size: 1-10.
   */
  constructor(advertiser_id, custom_audience_ids, shared_advertiser_ids) {
    this.advertiser_id = advertiser_id;
    this.custom_audience_ids = custom_audience_ids;
    this.shared_advertiser_ids = shared_advertiser_ids;
  }

  /**
   * Constructs a <code>CustomAudienceShareBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CustomAudienceShareBody} obj Optional instance to populate.
   * @return {module:model/CustomAudienceShareBody} The populated <code>CustomAudienceShareBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CustomAudienceShareBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('context_info'))
        obj.context_info = DmpcustomAudiencefileuploadContextInfo.constructFromObject(data['context_info']);
      if (data.hasOwnProperty('custom_audience_ids'))
        obj.custom_audience_ids = ApiClient.convertToType(data['custom_audience_ids'], ['String']);
      if (data.hasOwnProperty('shared_advertiser_ids'))
        obj.shared_advertiser_ids = ApiClient.convertToType(data['shared_advertiser_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * Operator advertiser ID.
 * @member {String} advertiser_id
 */
CustomAudienceShareBody.prototype.advertiser_id = undefined;

/**
 * @member {module:model/DmpcustomAudiencefileuploadContextInfo} context_info
 */
CustomAudienceShareBody.prototype.context_info = undefined;

/**
 * Custom audiences that you want to share. Size: 1-10.
 * @member {Array.<String>} custom_audience_ids
 */
CustomAudienceShareBody.prototype.custom_audience_ids = undefined;

/**
 * Advertisers that you want to share audiences with. They must be in the same Business Center as you. Size: 1-10.
 * @member {Array.<String>} shared_advertiser_ids
 */
CustomAudienceShareBody.prototype.shared_advertiser_ids = undefined;

