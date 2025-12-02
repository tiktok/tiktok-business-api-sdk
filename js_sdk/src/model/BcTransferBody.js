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
 * @version 0.1.9
 */
export class BcTransferBody {
  /**
   * Constructs a new <code>BcTransferBody</code>.
   * @alias module:model/BcTransferBody
   * @class
   * @param bc_id {String} 
   * @param transfer_type {String} 
   */
  constructor(bc_id, transfer_type) {
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
      if (data.hasOwnProperty('child_bc_id'))
        obj.child_bc_id = ApiClient.convertToType(data['child_bc_id'], 'String');
      if (data.hasOwnProperty('grant_amount'))
        obj.grant_amount = ApiClient.convertToType(data['grant_amount'], 'Number');
      if (data.hasOwnProperty('request_id'))
        obj.request_id = ApiClient.convertToType(data['request_id'], 'String');
      if (data.hasOwnProperty('transfer_level'))
        obj.transfer_level = ApiClient.convertToType(data['transfer_level'], 'String');
      if (data.hasOwnProperty('transfer_type'))
        obj.transfer_type = ApiClient.convertToType(data['transfer_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
BcTransferBody.prototype.advertiser_id = undefined;

/**
 * @member {String} bc_id
 */
BcTransferBody.prototype.bc_id = undefined;

/**
 * @member {Number} cash_amount
 */
BcTransferBody.prototype.cash_amount = undefined;

/**
 * @member {String} child_bc_id
 */
BcTransferBody.prototype.child_bc_id = undefined;

/**
 * @member {Number} grant_amount
 */
BcTransferBody.prototype.grant_amount = undefined;

/**
 * @member {String} request_id
 */
BcTransferBody.prototype.request_id = undefined;

/**
 * @member {String} transfer_level
 */
BcTransferBody.prototype.transfer_level = undefined;

/**
 * @member {String} transfer_type
 */
BcTransferBody.prototype.transfer_type = undefined;

