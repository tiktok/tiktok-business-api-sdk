/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupcreateSearchKeywords model module.
 * @module model/AdgroupcreateSearchKeywords
 * @version 0.1.9
 */
export class AdgroupcreateSearchKeywords {
  /**
   * Constructs a new <code>AdgroupcreateSearchKeywords</code>.
   * @alias module:model/AdgroupcreateSearchKeywords
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateSearchKeywords</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateSearchKeywords} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateSearchKeywords} The populated <code>AdgroupcreateSearchKeywords</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateSearchKeywords();
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
AdgroupcreateSearchKeywords.prototype.keyword = undefined;

/**
 * @member {Number} keyword_bid
 */
AdgroupcreateSearchKeywords.prototype.keyword_bid = undefined;

/**
 * @member {String} keyword_bid_type
 * @default 'FOLLOW_ADGROUP'
 */
AdgroupcreateSearchKeywords.prototype.keyword_bid_type = 'FOLLOW_ADGROUP';

/**
 * @member {String} match_type
 */
AdgroupcreateSearchKeywords.prototype.match_type = undefined;

