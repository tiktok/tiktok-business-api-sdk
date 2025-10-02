/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdvertiserupdateAdvertiserBudgets} from './AdvertiserupdateAdvertiserBudgets.js';
import {AdvertiserupdateQualificationImages} from './AdvertiserupdateQualificationImages.js';

/**
 * The AdvertiserUpdateBody model module.
 * @module model/AdvertiserUpdateBody
 * @version 0.1.8
 */
export class AdvertiserUpdateBody {
  /**
   * Constructs a new <code>AdvertiserUpdateBody</code>.
   * @alias module:model/AdvertiserUpdateBody
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdvertiserUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdvertiserUpdateBody} obj Optional instance to populate.
   * @return {module:model/AdvertiserUpdateBody} The populated <code>AdvertiserUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdvertiserUpdateBody();
      if (data.hasOwnProperty('address'))
        obj.address = ApiClient.convertToType(data['address'], 'String');
      if (data.hasOwnProperty('advertiser_budgets'))
        obj.advertiser_budgets = ApiClient.convertToType(data['advertiser_budgets'], [AdvertiserupdateAdvertiserBudgets]);
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('advertiser_name'))
        obj.advertiser_name = ApiClient.convertToType(data['advertiser_name'], 'String');
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'Number');
      if (data.hasOwnProperty('budget_update_type'))
        obj.budget_update_type = ApiClient.convertToType(data['budget_update_type'], 'String');
      if (data.hasOwnProperty('child_bc_id'))
        obj.child_bc_id = ApiClient.convertToType(data['child_bc_id'], 'Number');
      if (data.hasOwnProperty('company'))
        obj.company = ApiClient.convertToType(data['company'], 'String');
      if (data.hasOwnProperty('contact_email'))
        obj.contact_email = ApiClient.convertToType(data['contact_email'], 'String');
      if (data.hasOwnProperty('contact_name'))
        obj.contact_name = ApiClient.convertToType(data['contact_name'], 'String');
      if (data.hasOwnProperty('contact_number'))
        obj.contact_number = ApiClient.convertToType(data['contact_number'], 'String');
      if (data.hasOwnProperty('license_image_id'))
        obj.license_image_id = ApiClient.convertToType(data['license_image_id'], 'String');
      if (data.hasOwnProperty('license_no'))
        obj.license_no = ApiClient.convertToType(data['license_no'], 'String');
      if (data.hasOwnProperty('need_submit_certificate'))
        obj.need_submit_certificate = ApiClient.convertToType(data['need_submit_certificate'], 'Boolean');
      if (data.hasOwnProperty('promotion_link'))
        obj.promotion_link = ApiClient.convertToType(data['promotion_link'], 'String');
      if (data.hasOwnProperty('qualification_images'))
        obj.qualification_images = ApiClient.convertToType(data['qualification_images'], [AdvertiserupdateQualificationImages]);
      if (data.hasOwnProperty('tax_map'))
        obj.tax_map = ApiClient.convertToType(data['tax_map'], {'String': 'String'});
    }
    return obj;
  }
}

/**
 * @member {String} address
 */
AdvertiserUpdateBody.prototype.address = undefined;

/**
 * @member {Array.<module:model/AdvertiserupdateAdvertiserBudgets>} advertiser_budgets
 */
AdvertiserUpdateBody.prototype.advertiser_budgets = undefined;

/**
 * @member {String} advertiser_id
 */
AdvertiserUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} advertiser_name
 */
AdvertiserUpdateBody.prototype.advertiser_name = undefined;

/**
 * @member {Number} bc_id
 */
AdvertiserUpdateBody.prototype.bc_id = undefined;

/**
 * @member {String} budget_update_type
 */
AdvertiserUpdateBody.prototype.budget_update_type = undefined;

/**
 * @member {Number} child_bc_id
 */
AdvertiserUpdateBody.prototype.child_bc_id = undefined;

/**
 * @member {String} company
 */
AdvertiserUpdateBody.prototype.company = undefined;

/**
 * @member {String} contact_email
 */
AdvertiserUpdateBody.prototype.contact_email = undefined;

/**
 * @member {String} contact_name
 */
AdvertiserUpdateBody.prototype.contact_name = undefined;

/**
 * @member {String} contact_number
 */
AdvertiserUpdateBody.prototype.contact_number = undefined;

/**
 * @member {String} license_image_id
 */
AdvertiserUpdateBody.prototype.license_image_id = undefined;

/**
 * @member {String} license_no
 */
AdvertiserUpdateBody.prototype.license_no = undefined;

/**
 * @member {Boolean} need_submit_certificate
 */
AdvertiserUpdateBody.prototype.need_submit_certificate = undefined;

/**
 * @member {String} promotion_link
 */
AdvertiserUpdateBody.prototype.promotion_link = undefined;

/**
 * @member {Array.<module:model/AdvertiserupdateQualificationImages>} qualification_images
 */
AdvertiserUpdateBody.prototype.qualification_images = undefined;

/**
 * @member {Object.<String, String>} tax_map
 */
AdvertiserUpdateBody.prototype.tax_map = undefined;

