/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdAcoBodyAvatarIcon model module.
 * @module model/AdAcoBodyAvatarIcon
 * @version 0.1.5
 */
export class AdAcoBodyAvatarIcon {
  /**
   * Constructs a new <code>AdAcoBodyAvatarIcon</code>.
   * Avatar image.
   * @alias module:model/AdAcoBodyAvatarIcon
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyAvatarIcon</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyAvatarIcon} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyAvatarIcon} The populated <code>AdAcoBodyAvatarIcon</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyAvatarIcon();
      if (data.hasOwnProperty('web_uri'))
        obj.web_uri = ApiClient.convertToType(data['web_uri'], 'String');
    }
    return obj;
  }
}

/**
 * ID of the avatar image. It can be uploaded through the Upload an image endpoint.
 * @member {String} web_uri
 */
AdAcoBodyAvatarIcon.prototype.web_uri = undefined;

