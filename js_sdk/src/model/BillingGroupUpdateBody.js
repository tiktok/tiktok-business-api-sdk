/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BillingGroupUpdateBody model module.
 * @module model/BillingGroupUpdateBody
 * @version 1.2.1
 */
export class BillingGroupUpdateBody {
  /**
   * Constructs a new <code>BillingGroupUpdateBody</code>.
   * @alias module:model/BillingGroupUpdateBody
   * @class
   * @param bc_id {String} 
   * @param billing_group_id {String} 
   */
  constructor(bc_id, billing_group_id) {
    this.bc_id = bc_id;
    this.billing_group_id = billing_group_id;
  }

  /**
   * Constructs a <code>BillingGroupUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BillingGroupUpdateBody} obj Optional instance to populate.
   * @return {module:model/BillingGroupUpdateBody} The populated <code>BillingGroupUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BillingGroupUpdateBody();
      if (data.hasOwnProperty('add_advertiser_ids'))
        obj.add_advertiser_ids = ApiClient.convertToType(data['add_advertiser_ids'], ['String']);
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('billing_group_id'))
        obj.billing_group_id = ApiClient.convertToType(data['billing_group_id'], 'String');
      if (data.hasOwnProperty('delete_advertiser_ids'))
        obj.delete_advertiser_ids = ApiClient.convertToType(data['delete_advertiser_ids'], ['String']);
      if (data.hasOwnProperty('is_primary'))
        obj.is_primary = ApiClient.convertToType(data['is_primary'], 'Boolean');
      if (data.hasOwnProperty('new_billing_group_emails'))
        obj.new_billing_group_emails = ApiClient.convertToType(data['new_billing_group_emails'], ['String']);
      if (data.hasOwnProperty('new_billing_group_name'))
        obj.new_billing_group_name = ApiClient.convertToType(data['new_billing_group_name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} add_advertiser_ids
 */
BillingGroupUpdateBody.prototype.add_advertiser_ids = undefined;

/**
 * @member {String} bc_id
 */
BillingGroupUpdateBody.prototype.bc_id = undefined;

/**
 * @member {String} billing_group_id
 */
BillingGroupUpdateBody.prototype.billing_group_id = undefined;

/**
 * @member {Array.<String>} delete_advertiser_ids
 */
BillingGroupUpdateBody.prototype.delete_advertiser_ids = undefined;

/**
 * @member {Boolean} is_primary
 */
BillingGroupUpdateBody.prototype.is_primary = undefined;

/**
 * @member {Array.<String>} new_billing_group_emails
 */
BillingGroupUpdateBody.prototype.new_billing_group_emails = undefined;

/**
 * @member {String} new_billing_group_name
 */
BillingGroupUpdateBody.prototype.new_billing_group_name = undefined;

