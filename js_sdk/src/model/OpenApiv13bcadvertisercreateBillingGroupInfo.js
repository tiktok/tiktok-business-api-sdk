/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13bcadvertisercreateBillingGroupInfo model module.
 * @module model/OpenApiv13bcadvertisercreateBillingGroupInfo
 * @version 0.1.2
 */
export class OpenApiv13bcadvertisercreateBillingGroupInfo {
  /**
   * Constructs a new <code>OpenApiv13bcadvertisercreateBillingGroupInfo</code>.
   * Billing group information
   * @alias module:model/OpenApiv13bcadvertisercreateBillingGroupInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13bcadvertisercreateBillingGroupInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13bcadvertisercreateBillingGroupInfo} obj Optional instance to populate.
   * @return {module:model/OpenApiv13bcadvertisercreateBillingGroupInfo} The populated <code>OpenApiv13bcadvertisercreateBillingGroupInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13bcadvertisercreateBillingGroupInfo();
      if (data.hasOwnProperty('billing_group_id'))
        obj.billing_group_id = ApiClient.convertToType(data['billing_group_id'], 'String');
      if (data.hasOwnProperty('invoice_group_by'))
        obj.invoice_group_by = ApiClient.convertToType(data['invoice_group_by'], 'String');
      if (data.hasOwnProperty('invoice_payer'))
        obj.invoice_payer = ApiClient.convertToType(data['invoice_payer'], 'String');
    }
    return obj;
  }
}

/**
 * Billing group ID. Valid when `invoice_group_by` is `ACCOUNT`
 * @member {String} billing_group_id
 */
OpenApiv13bcadvertisercreateBillingGroupInfo.prototype.billing_group_id = undefined;

/**
 * Invoicing mode. Enum values: `ACCOUNT`: Invoices in this billing groups are combined. `ADVERTISER`: Invoices in this billing group are handled separately.
 * @member {String} invoice_group_by
 */
OpenApiv13bcadvertisercreateBillingGroupInfo.prototype.invoice_group_by = undefined;

/**
 * Party who pays the invoices. Enum values: `AGENCY`, `ADVERTISER`. This field is required when the registrated area of the ad account is `FR` (France)
 * @member {String} invoice_payer
 */
OpenApiv13bcadvertisercreateBillingGroupInfo.prototype.invoice_payer = undefined;

