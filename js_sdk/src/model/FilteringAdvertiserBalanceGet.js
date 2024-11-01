/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringAdvertiserBalanceGet model module.
 * @module model/FilteringAdvertiserBalanceGet
 * @version 0.1.2
 */
export class FilteringAdvertiserBalanceGet {
  /**
   * Constructs a new <code>FilteringAdvertiserBalanceGet</code>.
   * @alias module:model/FilteringAdvertiserBalanceGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringAdvertiserBalanceGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringAdvertiserBalanceGet} obj Optional instance to populate.
   * @return {module:model/FilteringAdvertiserBalanceGet} The populated <code>FilteringAdvertiserBalanceGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringAdvertiserBalanceGet();
      if (data.hasOwnProperty('advertiser_status'))
        obj.advertiser_status = ApiClient.convertToType(data['advertiser_status'], ['String']);
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
    }
    return obj;
  }
}

/**
 * Account display status. Enum values- `SHOW_ACCOUNT_STATUS_NOT_APPROVED` (failed); `SHOW_ACCOUNT_STATUS_APPROVED`(passed); `SHOW_ACCOUNT_STATUS_IN_REVIEW`(under review);  `SHOW_ACCOUNT_STATUS_PUNISHED`(punishment).
 * @member {Array.<String>} advertiser_status
 */
FilteringAdvertiserBalanceGet.prototype.advertiser_status = undefined;

/**
 * Keywords, you can search for ad account name or ad account ID.
 * @member {String} keyword
 */
FilteringAdvertiserBalanceGet.prototype.keyword = undefined;

