/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The ImageUploadBody model module.
 * @module model/ImageUploadBody
 * @version 0.1.1
 */
export class ImageUploadBody {
  /**
   * Constructs a new <code>ImageUploadBody</code>.
   * @alias module:model/ImageUploadBody
   * @class
   * @param bc_id {String} Business Center ID
   * @param image_file {Blob} The certificate image file to be uploaded. Supported picture format: JPG/JPEG/PNG. The maximum file size is 10 MB
   */
  constructor(bc_id, image_file) {
    this.bc_id = bc_id;
    this.image_file = image_file;
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
 * Business Center ID
 * @member {String} bc_id
 */
ImageUploadBody.prototype.bc_id = undefined;

/**
 * The certificate image file to be uploaded. Supported picture format: JPG/JPEG/PNG. The maximum file size is 10 MB
 * @member {Blob} image_file
 */
ImageUploadBody.prototype.image_file = undefined;

