/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdvertiserupdateQualificationImages model module.
 * @module model/AdvertiserupdateQualificationImages
 * @version 0.1.9
 */
export class AdvertiserupdateQualificationImages {
  /**
   * Constructs a new <code>AdvertiserupdateQualificationImages</code>.
   * @alias module:model/AdvertiserupdateQualificationImages
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdvertiserupdateQualificationImages</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdvertiserupdateQualificationImages} obj Optional instance to populate.
   * @return {module:model/AdvertiserupdateQualificationImages} The populated <code>AdvertiserupdateQualificationImages</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdvertiserupdateQualificationImages();
      if (data.hasOwnProperty('image_id'))
        obj.image_id = ApiClient.convertToType(data['image_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} image_id
 */
AdvertiserupdateQualificationImages.prototype.image_id = undefined;

