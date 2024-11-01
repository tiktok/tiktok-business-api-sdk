/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BcTransferBody model module.
 * @module model/BcTransferBody
 * @version 0.1.2
 */
export class BcTransferBody {
  /**
   * Constructs a new <code>BcTransferBody</code>.
   * @alias module:model/BcTransferBody
   * @class
   * @param advertiser_id {String} Ad Account ID
   * @param bc_id {String} Business Center ID
   * @param transfer_type {String} How you'd like to process payments from an ad account. Enum values：`RECHARGE`(transfer), `REFUND`(deduction)
   */
  constructor(advertiser_id, bc_id, transfer_type) {
    this.advertiser_id = advertiser_id;
    this.bc_id = bc_id;
    this.transfer_type = transfer_type;
  }

  /**
   * Constructs a <code>BcTransferBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BcTransferBody} obj Optional instance to populate.
   * @return {module:model/BcTransferBody} The populated <code>BcTransferBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BcTransferBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('cash_amount'))
        obj.cash_amount = ApiClient.convertToType(data['cash_amount'], 'Number');
      if (data.hasOwnProperty('grant_amount'))
        obj.grant_amount = ApiClient.convertToType(data['grant_amount'], 'Number');
      if (data.hasOwnProperty('transfer_type'))
        obj.transfer_type = ApiClient.convertToType(data['transfer_type'], 'String');
    }
    return obj;
  }
}

/**
 * Ad Account ID
 * @member {String} advertiser_id
 */
BcTransferBody.prototype.advertiser_id = undefined;

/**
 * Business Center ID
 * @member {String} bc_id
 */
BcTransferBody.prototype.bc_id = undefined;

/**
 * The amount to process. You need to specify either cash_amount or grant_amount. Rounded to two decimal places. Value range > 0.
 * @member {Number} cash_amount
 */
BcTransferBody.prototype.cash_amount = undefined;

/**
 * Coupon/voucher amount. You need to specify either `cash_amount` or `grant_amount`. Rounded to two decimal places. Value range > 0
 * @member {Number} grant_amount
 */
BcTransferBody.prototype.grant_amount = undefined;

/**
 * How you'd like to process payments from an ad account. Enum values：`RECHARGE`(transfer), `REFUND`(deduction)
 * @member {String} transfer_type
 */
BcTransferBody.prototype.transfer_type = undefined;

