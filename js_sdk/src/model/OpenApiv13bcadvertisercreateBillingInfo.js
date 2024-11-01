/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13bcadvertisercreateBillingInfo model module.
 * @module model/OpenApiv13bcadvertisercreateBillingInfo
 * @version 0.1.2
 */
export class OpenApiv13bcadvertisercreateBillingInfo {
  /**
   * Constructs a new <code>OpenApiv13bcadvertisercreateBillingInfo</code>.
   * Billing information. Required if the place of registration of the ad account or the agency that owns the Business Center is France, Brazil, or Mexico
   * @alias module:model/OpenApiv13bcadvertisercreateBillingInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13bcadvertisercreateBillingInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13bcadvertisercreateBillingInfo} obj Optional instance to populate.
   * @return {module:model/OpenApiv13bcadvertisercreateBillingInfo} The populated <code>OpenApiv13bcadvertisercreateBillingInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13bcadvertisercreateBillingInfo();
      if (data.hasOwnProperty('address'))
        obj.address = ApiClient.convertToType(data['address'], 'String');
      if (data.hasOwnProperty('tax_map'))
        obj.tax_map = ApiClient.convertToType(data['tax_map'], 'String');
    }
    return obj;
  }
}

/**
 * Billing address, no more than 512 characters in length
 * @member {String} address
 */
OpenApiv13bcadvertisercreateBillingInfo.prototype.address = undefined;

/**
 * Billing and invoicing tax number. Different countries use different tax number fields. The tax number field `vat` is used for European countries, for instance, France.The tax number field `tax_id` is used for Brazil (required), Mexico (required), United Arab Emirates, Egypt, Saudi Arabia, Israel, Turkey, Canada, and the United States.The tax number field `abn` is used for Australia and New Zealand.
 * @member {String} tax_map
 */
OpenApiv13bcadvertisercreateBillingInfo.prototype.tax_map = undefined;

