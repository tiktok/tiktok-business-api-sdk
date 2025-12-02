/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdAcoBodyPageList model module.
 * @module model/AdAcoBodyPageList
 * @version 0.1.9
 */
export class AdAcoBodyPageList {
  /**
   * Constructs a new <code>AdAcoBodyPageList</code>.
   * @alias module:model/AdAcoBodyPageList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyPageList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyPageList} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyPageList} The populated <code>AdAcoBodyPageList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyPageList();
      if (data.hasOwnProperty('page_id'))
        obj.page_id = ApiClient.convertToType(data['page_id'], 'String');
    }
    return obj;
  }
}

/**
 * Page ID.
 * @member {String} page_id
 */
AdAcoBodyPageList.prototype.page_id = undefined;

