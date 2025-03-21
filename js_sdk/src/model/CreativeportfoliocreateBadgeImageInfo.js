/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CreativeportfoliocreateBadgeImageInfo model module.
 * @module model/CreativeportfoliocreateBadgeImageInfo
 * @version 0.1.5
 */
export class CreativeportfoliocreateBadgeImageInfo {
  /**
   * Constructs a new <code>CreativeportfoliocreateBadgeImageInfo</code>.
   * Information about the badge image
   * @alias module:model/CreativeportfoliocreateBadgeImageInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CreativeportfoliocreateBadgeImageInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreativeportfoliocreateBadgeImageInfo} obj Optional instance to populate.
   * @return {module:model/CreativeportfoliocreateBadgeImageInfo} The populated <code>CreativeportfoliocreateBadgeImageInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreativeportfoliocreateBadgeImageInfo();
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
CreativeportfoliocreateBadgeImageInfo.prototype.image_id = undefined;

