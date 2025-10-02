/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {PixelupdateAdvancedMatchingFields} from './PixelupdateAdvancedMatchingFields.js';

/**
 * The PixelUpdateBody model module.
 * @module model/PixelUpdateBody
 * @version 0.1.8
 */
export class PixelUpdateBody {
  /**
   * Constructs a new <code>PixelUpdateBody</code>.
   * @alias module:model/PixelUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param pixel_id {String} 
   * @param pixel_name {String} 
   */
  constructor(advertiser_id, pixel_id, pixel_name) {
    this.advertiser_id = advertiser_id;
    this.pixel_id = pixel_id;
    this.pixel_name = pixel_name;
  }

  /**
   * Constructs a <code>PixelUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelUpdateBody} obj Optional instance to populate.
   * @return {module:model/PixelUpdateBody} The populated <code>PixelUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelUpdateBody();
      if (data.hasOwnProperty('advanced_matching_fields'))
        obj.advanced_matching_fields = PixelupdateAdvancedMatchingFields.constructFromObject(data['advanced_matching_fields']);
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('pixel_id'))
        obj.pixel_id = ApiClient.convertToType(data['pixel_id'], 'String');
      if (data.hasOwnProperty('pixel_name'))
        obj.pixel_name = ApiClient.convertToType(data['pixel_name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {module:model/PixelupdateAdvancedMatchingFields} advanced_matching_fields
 */
PixelUpdateBody.prototype.advanced_matching_fields = undefined;

/**
 * @member {String} advertiser_id
 */
PixelUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} pixel_id
 */
PixelUpdateBody.prototype.pixel_id = undefined;

/**
 * @member {String} pixel_name
 */
PixelUpdateBody.prototype.pixel_name = undefined;

