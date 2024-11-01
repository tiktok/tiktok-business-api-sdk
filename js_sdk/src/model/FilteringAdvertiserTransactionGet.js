/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringAdvertiserTransactionGet model module.
 * @module model/FilteringAdvertiserTransactionGet
 * @version 0.1.2
 */
export class FilteringAdvertiserTransactionGet {
  /**
   * Constructs a new <code>FilteringAdvertiserTransactionGet</code>.
   * @alias module:model/FilteringAdvertiserTransactionGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringAdvertiserTransactionGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringAdvertiserTransactionGet} obj Optional instance to populate.
   * @return {module:model/FilteringAdvertiserTransactionGet} The populated <code>FilteringAdvertiserTransactionGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringAdvertiserTransactionGet();
      if (data.hasOwnProperty('end_date'))
        obj.end_date = ApiClient.convertToType(data['end_date'], 'String');
      if (data.hasOwnProperty('funds_type'))
        obj.funds_type = ApiClient.convertToType(data['funds_type'], ['String']);
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
      if (data.hasOwnProperty('start_date'))
        obj.start_date = ApiClient.convertToType(data['start_date'], 'String');
      if (data.hasOwnProperty('summary_by_account'))
        obj.summary_by_account = ApiClient.convertToType(data['summary_by_account'], 'Boolean');
      if (data.hasOwnProperty('transfer_type'))
        obj.transfer_type = ApiClient.convertToType(data['transfer_type'], 'String');
    }
    return obj;
  }
}

/**
 * Transaction record search end time, (UTC+0) format：`2020-11-12`. The default date is the same day
 * @member {String} end_date
 */
FilteringAdvertiserTransactionGet.prototype.end_date = undefined;

/**
 * Fund type. Allowed types- `FUNDS_TYPE_CASH`(cash), `FUNDS_TYPE_GRANT`(coupon/voucher). The default is to select both types.
 * @member {Array.<String>} funds_type
 */
FilteringAdvertiserTransactionGet.prototype.funds_type = undefined;

/**
 * Search keywords, you can search for ad account name or ad account ID.
 * @member {String} keyword
 */
FilteringAdvertiserTransactionGet.prototype.keyword = undefined;

/**
 * Transaction record search start time, (UTC+0) format：`2020-10-12`. The default date is 90 days ago
 * @member {String} start_date
 */
FilteringAdvertiserTransactionGet.prototype.start_date = undefined;

/**
 * Whether to summarize by account. `false` means no summary; `true` means summary. Default value- `false`.
 * @member {Boolean} summary_by_account
 */
FilteringAdvertiserTransactionGet.prototype.summary_by_account = undefined;

/**
 * Billing type. Enum values- `TRANS_TYPE_TRANSFER`(transfer), `TRANS_TYPE_TAX`(tax), `TRANS_TYPE_COST`(consumption), `TRANS_TYPE_PAYMENT` (payment). Default value-  `TRANS_TYPE_TRANSFER`
 * @member {String} transfer_type
 */
FilteringAdvertiserTransactionGet.prototype.transfer_type = undefined;

