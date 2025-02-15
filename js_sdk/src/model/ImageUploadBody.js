/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ImageUploadBody model module.
 * @module model/ImageUploadBody
 * @version 0.1.4
 */
export class ImageUploadBody {
  /**
   * Constructs a new <code>ImageUploadBody</code>.
   * @alias module:model/ImageUploadBody
   * @class
   * @param bc_id {String} 
   */
  constructor(bc_id) {
    this.bc_id = bc_id;
  }

  /**
   * Constructs a <code>ImageUploadBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ImageUploadBody} obj Optional instance to populate.
   * @return {module:model/ImageUploadBody} The populated <code>ImageUploadBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ImageUploadBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('image_file'))
        obj.image_file = ApiClient.convertToType(data['image_file'], 'Blob');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
ImageUploadBody.prototype.bc_id = undefined;

/**
 * @member {Blob} image_file
 */
ImageUploadBody.prototype.image_file = undefined;

