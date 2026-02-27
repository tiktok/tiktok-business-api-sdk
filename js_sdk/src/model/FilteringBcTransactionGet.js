/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringBcTransactionGet model module.
 * @module model/FilteringBcTransactionGet
 * @version 1.2.1
 */
export class FilteringBcTransactionGet {
  /**
   * Constructs a new <code>FilteringBcTransactionGet</code>.
   * @alias module:model/FilteringBcTransactionGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringBcTransactionGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBcTransactionGet} obj Optional instance to populate.
   * @return {module:model/FilteringBcTransactionGet} The populated <code>FilteringBcTransactionGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBcTransactionGet();
      if (data.hasOwnProperty('funds_type'))
        obj.funds_type = ApiClient.convertToType(data['funds_type'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} funds_type
 */
FilteringBcTransactionGet.prototype.funds_type = undefined;

