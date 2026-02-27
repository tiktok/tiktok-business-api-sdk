/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringBcBillingGroupGet model module.
 * @module model/FilteringBcBillingGroupGet
 * @version 1.2.1
 */
export class FilteringBcBillingGroupGet {
  /**
   * Constructs a new <code>FilteringBcBillingGroupGet</code>.
   * @alias module:model/FilteringBcBillingGroupGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringBcBillingGroupGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBcBillingGroupGet} obj Optional instance to populate.
   * @return {module:model/FilteringBcBillingGroupGet} The populated <code>FilteringBcBillingGroupGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBcBillingGroupGet();
      if (data.hasOwnProperty('billed_to_type'))
        obj.billed_to_type = ApiClient.convertToType(data['billed_to_type'], 'String');
      if (data.hasOwnProperty('billing_group_id'))
        obj.billing_group_id = ApiClient.convertToType(data['billing_group_id'], 'String');
      if (data.hasOwnProperty('billing_group_name'))
        obj.billing_group_name = ApiClient.convertToType(data['billing_group_name'], 'String');
      if (data.hasOwnProperty('billing_group_type'))
        obj.billing_group_type = ApiClient.convertToType(data['billing_group_type'], 'String');
      if (data.hasOwnProperty('invoice_group_by'))
        obj.invoice_group_by = ApiClient.convertToType(data['invoice_group_by'], 'String');
      if (data.hasOwnProperty('status'))
        obj.status = ApiClient.convertToType(data['status'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {String} billed_to_type
 */
FilteringBcBillingGroupGet.prototype.billed_to_type = undefined;

/**
 * @member {String} billing_group_id
 */
FilteringBcBillingGroupGet.prototype.billing_group_id = undefined;

/**
 * @member {String} billing_group_name
 */
FilteringBcBillingGroupGet.prototype.billing_group_name = undefined;

/**
 * @member {String} billing_group_type
 */
FilteringBcBillingGroupGet.prototype.billing_group_type = undefined;

/**
 * @member {String} invoice_group_by
 */
FilteringBcBillingGroupGet.prototype.invoice_group_by = undefined;

/**
 * @member {Number} status
 */
FilteringBcBillingGroupGet.prototype.status = undefined;

