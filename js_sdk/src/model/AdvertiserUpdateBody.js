/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OpenApiv13advertiserupdateQualificationImages} from './OpenApiv13advertiserupdateQualificationImages.js';

/**
 * The AdvertiserUpdateBody model module.
 * @module model/AdvertiserUpdateBody
 * @version 0.1.1
 */
export class AdvertiserUpdateBody {
  /**
   * Constructs a new <code>AdvertiserUpdateBody</code>.
   * @alias module:model/AdvertiserUpdateBody
   * @class
   * @param advertiser_id {String} Ad account ID
   */
  constructor(advertiser_id) {
    this.advertiser_id = advertiser_id;
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
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('advertiser_name'))
        obj.advertiser_name = ApiClient.convertToType(data['advertiser_name'], 'String');
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
        obj.qualification_images = OpenApiv13advertiserupdateQualificationImages.constructFromObject(data['qualification_images']);
      if (data.hasOwnProperty('tax_map'))
        obj.tax_map = ApiClient.convertToType(data['tax_map'], 'String');
    }
    return obj;
  }
}

/**
 * Business address that is shown on receipts
 * @member {String} address
 */
AdvertiserUpdateBody.prototype.address = undefined;

/**
 * Ad account ID
 * @member {String} advertiser_id
 */
AdvertiserUpdateBody.prototype.advertiser_id = undefined;

/**
 * Ad account name
 * @member {String} advertiser_name
 */
AdvertiserUpdateBody.prototype.advertiser_name = undefined;

/**
 * Company name
 * @member {String} company
 */
AdvertiserUpdateBody.prototype.company = undefined;

/**
 * Contact email
 * @member {String} contact_email
 */
AdvertiserUpdateBody.prototype.contact_email = undefined;

/**
 * Name of the contact person
 * @member {String} contact_name
 */
AdvertiserUpdateBody.prototype.contact_name = undefined;

/**
 * Contact phone number
 * @member {String} contact_number
 */
AdvertiserUpdateBody.prototype.contact_number = undefined;

/**
 * Image ID (`image_id`) of the business license
 * @member {String} license_image_id
 */
AdvertiserUpdateBody.prototype.license_image_id = undefined;

/**
 * Business license number. This is required for ad accounts that are registered in the Chinese mainland, Hong Kong, or in countries Brazil and Mexico
 * @member {String} license_no
 */
AdvertiserUpdateBody.prototype.license_no = undefined;

/**
 * Whether you want to submit the new certificate images for review
 * @member {Boolean} need_submit_certificate
 */
AdvertiserUpdateBody.prototype.need_submit_certificate = undefined;

/**
 * Promotion link. Length cannot exceed 255 characters
 * @member {String} promotion_link
 */
AdvertiserUpdateBody.prototype.promotion_link = undefined;

/**
 * @member {module:model/OpenApiv13advertiserupdateQualificationImages} qualification_images
 */
AdvertiserUpdateBody.prototype.qualification_images = undefined;

/**
 * Billing and invoicing tax number. Different countries use different tax number fields. France uses `vat`, and Brazil uses `tax_id`
 * @member {String} tax_map
 */
AdvertiserUpdateBody.prototype.tax_map = undefined;

