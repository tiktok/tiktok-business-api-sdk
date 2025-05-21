/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PixelCreateBody model module.
 * @module model/PixelCreateBody
 * @version 0.1.7
 */
export class PixelCreateBody {
  /**
   * Constructs a new <code>PixelCreateBody</code>.
   * @alias module:model/PixelCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param pixel_name {String} 
   */
  constructor(advertiser_id, pixel_name) {
    this.advertiser_id = advertiser_id;
    this.pixel_name = pixel_name;
  }

  /**
   * Constructs a <code>PixelCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelCreateBody} obj Optional instance to populate.
   * @return {module:model/PixelCreateBody} The populated <code>PixelCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('partner_name'))
        obj.partner_name = ApiClient.convertToType(data['partner_name'], 'String');
      if (data.hasOwnProperty('pixel_category'))
        obj.pixel_category = ApiClient.convertToType(data['pixel_category'], 'String');
      if (data.hasOwnProperty('pixel_name'))
        obj.pixel_name = ApiClient.convertToType(data['pixel_name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
PixelCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} partner_name
 */
PixelCreateBody.prototype.partner_name = undefined;

/**
 * @member {String} pixel_category
 */
PixelCreateBody.prototype.pixel_category = undefined;

/**
 * @member {String} pixel_name
 */
PixelCreateBody.prototype.pixel_name = undefined;

