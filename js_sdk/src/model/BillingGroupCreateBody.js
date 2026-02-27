/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BillingGroupCreateBody model module.
 * @module model/BillingGroupCreateBody
 * @version 1.2.1
 */
export class BillingGroupCreateBody {
  /**
   * Constructs a new <code>BillingGroupCreateBody</code>.
   * @alias module:model/BillingGroupCreateBody
   * @class
   * @param advertiser_ids {Array.<String>} 
   * @param bc_id {String} 
   * @param billing_group_name {String} 
   */
  constructor(advertiser_ids, bc_id, billing_group_name) {
    this.advertiser_ids = advertiser_ids;
    this.bc_id = bc_id;
    this.billing_group_name = billing_group_name;
  }

  /**
   * Constructs a <code>BillingGroupCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BillingGroupCreateBody} obj Optional instance to populate.
   * @return {module:model/BillingGroupCreateBody} The populated <code>BillingGroupCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BillingGroupCreateBody();
      if (data.hasOwnProperty('advertiser_ids'))
        obj.advertiser_ids = ApiClient.convertToType(data['advertiser_ids'], ['String']);
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('billing_group_emails'))
        obj.billing_group_emails = ApiClient.convertToType(data['billing_group_emails'], ['String']);
      if (data.hasOwnProperty('billing_group_name'))
        obj.billing_group_name = ApiClient.convertToType(data['billing_group_name'], 'String');
      if (data.hasOwnProperty('billing_group_type'))
        obj.billing_group_type = ApiClient.convertToType(data['billing_group_type'], 'String');
      if (data.hasOwnProperty('is_primary'))
        obj.is_primary = ApiClient.convertToType(data['is_primary'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} advertiser_ids
 */
BillingGroupCreateBody.prototype.advertiser_ids = undefined;

/**
 * @member {String} bc_id
 */
BillingGroupCreateBody.prototype.bc_id = undefined;

/**
 * @member {Array.<String>} billing_group_emails
 */
BillingGroupCreateBody.prototype.billing_group_emails = undefined;

/**
 * @member {String} billing_group_name
 */
BillingGroupCreateBody.prototype.billing_group_name = undefined;

/**
 * @member {String} billing_group_type
 * @default 'AUCTION'
 */
BillingGroupCreateBody.prototype.billing_group_type = 'AUCTION';

/**
 * @member {Boolean} is_primary
 * @default false
 */
BillingGroupCreateBody.prototype.is_primary = false;

