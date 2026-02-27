/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ImageEditBody model module.
 * @module model/ImageEditBody
 * @version 1.2.1
 */
export class ImageEditBody {
  /**
   * Constructs a new <code>ImageEditBody</code>.
   * @alias module:model/ImageEditBody
   * @class
   * @param advertiser_id {String} 
   * @param height {Number} 
   * @param image_id {String} 
   * @param width {Number} 
   */
  constructor(advertiser_id, height, image_id, width) {
    this.advertiser_id = advertiser_id;
    this.height = height;
    this.image_id = image_id;
    this.width = width;
  }

  /**
   * Constructs a <code>ImageEditBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ImageEditBody} obj Optional instance to populate.
   * @return {module:model/ImageEditBody} The populated <code>ImageEditBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ImageEditBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('edit_method'))
        obj.edit_method = ApiClient.convertToType(data['edit_method'], 'String');
      if (data.hasOwnProperty('height'))
        obj.height = ApiClient.convertToType(data['height'], 'Number');
      if (data.hasOwnProperty('image_id'))
        obj.image_id = ApiClient.convertToType(data['image_id'], 'String');
      if (data.hasOwnProperty('image_name'))
        obj.image_name = ApiClient.convertToType(data['image_name'], 'String');
      if (data.hasOwnProperty('width'))
        obj.width = ApiClient.convertToType(data['width'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
ImageEditBody.prototype.advertiser_id = undefined;

/**
 * @member {String} edit_method
 * @default 'fix_size'
 */
ImageEditBody.prototype.edit_method = 'fix_size';

/**
 * @member {Number} height
 */
ImageEditBody.prototype.height = undefined;

/**
 * @member {String} image_id
 */
ImageEditBody.prototype.image_id = undefined;

/**
 * @member {String} image_name
 */
ImageEditBody.prototype.image_name = undefined;

/**
 * @member {Number} width
 */
ImageEditBody.prototype.width = undefined;

