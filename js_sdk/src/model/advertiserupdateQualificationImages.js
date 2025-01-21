/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The advertiserupdateQualificationImages model module.
 * @module model/advertiserupdateQualificationImages
 * @version 0.1.2
 */
export class advertiserupdateQualificationImages {
  /**
   * Constructs a new <code>advertiserupdateQualificationImages</code>.
   * Additional business certificates
   * @alias module:model/advertiserupdateQualificationImages
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>advertiserupdateQualificationImages</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/advertiserupdateQualificationImages} obj Optional instance to populate.
   * @return {module:model/advertiserupdateQualificationImages} The populated <code>advertiserupdateQualificationImages</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new advertiserupdateQualificationImages();
      if (data.hasOwnProperty('image_id'))
        obj.image_id = ApiClient.convertToType(data['image_id'], 'String');
    }
    return obj;
  }
}

/**
 * Image ID of the business certificate
 * @member {String} image_id
 */
advertiserupdateQualificationImages.prototype.image_id = undefined;

