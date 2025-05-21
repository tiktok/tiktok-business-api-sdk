/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {BcadvertisercreateAdvertiserInfo} from './BcadvertisercreateAdvertiserInfo.js';
import {BcadvertisercreateBillingGroupInfo} from './BcadvertisercreateBillingGroupInfo.js';
import {BcadvertisercreateBillingInfo} from './BcadvertisercreateBillingInfo.js';
import {BcadvertisercreateContactInfo} from './BcadvertisercreateContactInfo.js';
import {BcadvertisercreateCustomerInfo} from './BcadvertisercreateCustomerInfo.js';
import {BcadvertisercreateQualificationInfo} from './BcadvertisercreateQualificationInfo.js';

/**
 * The AdvertiserCreateBody model module.
 * @module model/AdvertiserCreateBody
 * @version 0.1.7
 */
export class AdvertiserCreateBody {
  /**
   * Constructs a new <code>AdvertiserCreateBody</code>.
   * @alias module:model/AdvertiserCreateBody
   * @class
   * @param advertiser_info {module:model/BcadvertisercreateAdvertiserInfo} 
   * @param bc_id {String} Business Center ID
   * @param customer_info {module:model/BcadvertisercreateCustomerInfo} 
   */
  constructor(advertiser_info, bc_id, customer_info) {
    this.advertiser_info = advertiser_info;
    this.bc_id = bc_id;
    this.customer_info = customer_info;
  }

  /**
   * Constructs a <code>AdvertiserCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdvertiserCreateBody} obj Optional instance to populate.
   * @return {module:model/AdvertiserCreateBody} The populated <code>AdvertiserCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdvertiserCreateBody();
      if (data.hasOwnProperty('advertiser_info'))
        obj.advertiser_info = BcadvertisercreateAdvertiserInfo.constructFromObject(data['advertiser_info']);
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('billing_group_info'))
        obj.billing_group_info = BcadvertisercreateBillingGroupInfo.constructFromObject(data['billing_group_info']);
      if (data.hasOwnProperty('billing_info'))
        obj.billing_info = BcadvertisercreateBillingInfo.constructFromObject(data['billing_info']);
      if (data.hasOwnProperty('contact_info'))
        obj.contact_info = BcadvertisercreateContactInfo.constructFromObject(data['contact_info']);
      if (data.hasOwnProperty('customer_info'))
        obj.customer_info = BcadvertisercreateCustomerInfo.constructFromObject(data['customer_info']);
      if (data.hasOwnProperty('qualification_info'))
        obj.qualification_info = BcadvertisercreateQualificationInfo.constructFromObject(data['qualification_info']);
      if (data.hasOwnProperty('tied_to_billing_group'))
        obj.tied_to_billing_group = ApiClient.convertToType(data['tied_to_billing_group'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {module:model/BcadvertisercreateAdvertiserInfo} advertiser_info
 */
AdvertiserCreateBody.prototype.advertiser_info = undefined;

/**
 * Business Center ID
 * @member {String} bc_id
 */
AdvertiserCreateBody.prototype.bc_id = undefined;

/**
 * @member {module:model/BcadvertisercreateBillingGroupInfo} billing_group_info
 */
AdvertiserCreateBody.prototype.billing_group_info = undefined;

/**
 * @member {module:model/BcadvertisercreateBillingInfo} billing_info
 */
AdvertiserCreateBody.prototype.billing_info = undefined;

/**
 * @member {module:model/BcadvertisercreateContactInfo} contact_info
 */
AdvertiserCreateBody.prototype.contact_info = undefined;

/**
 * @member {module:model/BcadvertisercreateCustomerInfo} customer_info
 */
AdvertiserCreateBody.prototype.customer_info = undefined;

/**
 * @member {module:model/BcadvertisercreateQualificationInfo} qualification_info
 */
AdvertiserCreateBody.prototype.qualification_info = undefined;

/**
 * Whether to add the ad account to a billing group. Default value: `False`. This field is an allowlist-only feature. If you would like to access it, please contact your TikTok representative
 * @member {Boolean} tied_to_billing_group
 */
AdvertiserCreateBody.prototype.tied_to_billing_group = undefined;

