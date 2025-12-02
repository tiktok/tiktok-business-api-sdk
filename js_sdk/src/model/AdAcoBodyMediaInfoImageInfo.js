/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdAcoBodyMediaInfoImageInfo model module.
 * @module model/AdAcoBodyMediaInfoImageInfo
 * @version 0.1.9
 */
export class AdAcoBodyMediaInfoImageInfo {
  /**
   * Constructs a new <code>AdAcoBodyMediaInfoImageInfo</code>.
   * @alias module:model/AdAcoBodyMediaInfoImageInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyMediaInfoImageInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyMediaInfoImageInfo} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyMediaInfoImageInfo} The populated <code>AdAcoBodyMediaInfoImageInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyMediaInfoImageInfo();
      if (data.hasOwnProperty('file_name'))
        obj.file_name = ApiClient.convertToType(data['file_name'], 'String');
      if (data.hasOwnProperty('web_uri'))
        obj.web_uri = ApiClient.convertToType(data['web_uri'], 'String');
    }
    return obj;
  }
}

/**
 * Image name. If image material is used, this field is used to form ad's name.
 * @member {String} file_name
 */
AdAcoBodyMediaInfoImageInfo.prototype.file_name = undefined;

/**
 * Image ID. You can find the image ID in the response after you upload an image via the [/file/image/ad/upload/](https://ads.tiktok.com/marketing_api/docs?id=1739067433456642) endpoint.
 * @member {String} web_uri
 */
AdAcoBodyMediaInfoImageInfo.prototype.web_uri = undefined;

