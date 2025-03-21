/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdAcoBodyTitleList model module.
 * @module model/AdAcoBodyTitleList
 * @version 0.1.5
 */
export class AdAcoBodyTitleList {
  /**
   * Constructs a new <code>AdAcoBodyTitleList</code>.
   * @alias module:model/AdAcoBodyTitleList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyTitleList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyTitleList} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyTitleList} The populated <code>AdAcoBodyTitleList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyTitleList();
      if (data.hasOwnProperty('title'))
        obj.title = ApiClient.convertToType(data['title'], 'String');
    }
    return obj;
  }
}

/**
 * Ad title (ad text). If you don't know how to create effective ad texts, you can try the [Smart Text](https://ads.tiktok.com/marketing_api/docs?id=1739084248002626) feature, which generates ad text recommendations based on the industry and language.
 * @member {String} title
 */
AdAcoBodyTitleList.prototype.title = undefined;

