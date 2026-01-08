/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupupdateSearchKeywords model module.
 * @module model/AdgroupupdateSearchKeywords
 * @version 0.1.9
 */
export class AdgroupupdateSearchKeywords {
  /**
   * Constructs a new <code>AdgroupupdateSearchKeywords</code>.
   * @alias module:model/AdgroupupdateSearchKeywords
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupupdateSearchKeywords</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupupdateSearchKeywords} obj Optional instance to populate.
   * @return {module:model/AdgroupupdateSearchKeywords} The populated <code>AdgroupupdateSearchKeywords</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupupdateSearchKeywords();
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
      if (data.hasOwnProperty('keyword_bid'))
        obj.keyword_bid = ApiClient.convertToType(data['keyword_bid'], 'Number');
      if (data.hasOwnProperty('keyword_bid_type'))
        obj.keyword_bid_type = ApiClient.convertToType(data['keyword_bid_type'], 'String');
      if (data.hasOwnProperty('match_type'))
        obj.match_type = ApiClient.convertToType(data['match_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} keyword
 */
AdgroupupdateSearchKeywords.prototype.keyword = undefined;

/**
 * @member {Number} keyword_bid
 */
AdgroupupdateSearchKeywords.prototype.keyword_bid = undefined;

/**
 * @member {String} keyword_bid_type
 * @default 'FOLLOW_ADGROUP'
 */
AdgroupupdateSearchKeywords.prototype.keyword_bid_type = 'FOLLOW_ADGROUP';

/**
 * @member {String} match_type
 */
AdgroupupdateSearchKeywords.prototype.match_type = undefined;

