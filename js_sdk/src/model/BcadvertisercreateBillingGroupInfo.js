/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BcadvertisercreateBillingGroupInfo model module.
 * @module model/BcadvertisercreateBillingGroupInfo
 * @version 0.1.9
 */
export class BcadvertisercreateBillingGroupInfo {
  /**
   * Constructs a new <code>BcadvertisercreateBillingGroupInfo</code>.
   * Billing group information
   * @alias module:model/BcadvertisercreateBillingGroupInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>BcadvertisercreateBillingGroupInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BcadvertisercreateBillingGroupInfo} obj Optional instance to populate.
   * @return {module:model/BcadvertisercreateBillingGroupInfo} The populated <code>BcadvertisercreateBillingGroupInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BcadvertisercreateBillingGroupInfo();
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
BcadvertisercreateBillingGroupInfo.prototype.billing_group_id = undefined;

/**
 * Invoicing mode. Enum values: `ACCOUNT`: Invoices in this billing groups are combined. `ADVERTISER`: Invoices in this billing group are handled separately.
 * @member {String} invoice_group_by
 */
BcadvertisercreateBillingGroupInfo.prototype.invoice_group_by = undefined;

/**
 * Party who pays the invoices. Enum values: `AGENCY`, `ADVERTISER`. This field is required when the registrated area of the ad account is `FR` (France)
 * @member {String} invoice_payer
 */
BcadvertisercreateBillingGroupInfo.prototype.invoice_payer = undefined;

