/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The FilteringBCTransactionGet model module.
 * @module model/FilteringBCTransactionGet
 * @version 0.1.0
 */
export class FilteringBCTransactionGet {
  /**
   * Constructs a new <code>FilteringBCTransactionGet</code>.
   * @alias module:model/FilteringBCTransactionGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringBCTransactionGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBCTransactionGet} obj Optional instance to populate.
   * @return {module:model/FilteringBCTransactionGet} The populated <code>FilteringBCTransactionGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBCTransactionGet();
      if (data.hasOwnProperty('funds_type'))
        obj.funds_type = ApiClient.convertToType(data['funds_type'], ['String']);
    }
    return obj;
  }
}

/**
 * Fund type. If not specified, both types of fund will be returned. Enum values- `FUNDS_TYPE_CASH` (cash), `FUNDS_TYPE_GRANT` (non-cash).
 * @member {Array.<String>} funds_type
 */
FilteringBCTransactionGet.prototype.funds_type = undefined;

