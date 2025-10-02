/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BcadvertisercreateBillingInfo model module.
 * @module model/BcadvertisercreateBillingInfo
 * @version 0.1.8
 */
export class BcadvertisercreateBillingInfo {
  /**
   * Constructs a new <code>BcadvertisercreateBillingInfo</code>.
   * Billing information. Required if the place of registration of the ad account or the agency that owns the Business Center is France, Brazil, or Mexico
   * @alias module:model/BcadvertisercreateBillingInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>BcadvertisercreateBillingInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BcadvertisercreateBillingInfo} obj Optional instance to populate.
   * @return {module:model/BcadvertisercreateBillingInfo} The populated <code>BcadvertisercreateBillingInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BcadvertisercreateBillingInfo();
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
BcadvertisercreateBillingInfo.prototype.address = undefined;

/**
 * Billing and invoicing tax number. Different countries use different tax number fields. The tax number field `vat` is used for European countries, for instance, France.The tax number field `tax_id` is used for Brazil (required), Mexico (required), United Arab Emirates, Egypt, Saudi Arabia, Israel, Turkey, Canada, and the United States.The tax number field `abn` is used for Australia and New Zealand.
 * @member {String} tax_map
 */
BcadvertisercreateBillingInfo.prototype.tax_map = undefined;

