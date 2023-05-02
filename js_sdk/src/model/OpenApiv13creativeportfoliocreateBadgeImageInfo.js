/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The OpenApiv13creativeportfoliocreateBadgeImageInfo model module.
 * @module model/OpenApiv13creativeportfoliocreateBadgeImageInfo
 * @version 0.1.0
 */
export class OpenApiv13creativeportfoliocreateBadgeImageInfo {
  /**
   * Constructs a new <code>OpenApiv13creativeportfoliocreateBadgeImageInfo</code>.
   * Information about the badge image
   * @alias module:model/OpenApiv13creativeportfoliocreateBadgeImageInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13creativeportfoliocreateBadgeImageInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13creativeportfoliocreateBadgeImageInfo} obj Optional instance to populate.
   * @return {module:model/OpenApiv13creativeportfoliocreateBadgeImageInfo} The populated <code>OpenApiv13creativeportfoliocreateBadgeImageInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13creativeportfoliocreateBadgeImageInfo();
      if (data.hasOwnProperty('image_id'))
        obj.image_id = ApiClient.convertToType(data['image_id'], 'String');
    }
    return obj;
  }
}

/**
 * ID of the badge image. The image must be 448x448 px. Supported formats include PNG, JPEG, and JPG. The largest size supported is 1 MB
 * @member {String} image_id
 */
OpenApiv13creativeportfoliocreateBadgeImageInfo.prototype.image_id = undefined;

