/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PageInfo model module.
 * @module model/PageInfo
 * @version 0.1.7
 */
export class PageInfo {
  /**
   * Constructs a new <code>PageInfo</code>.
   * @alias module:model/PageInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PageInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PageInfo} obj Optional instance to populate.
   * @return {module:model/PageInfo} The populated <code>PageInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PageInfo();
      if (data.hasOwnProperty('page'))
        obj.page = ApiClient.convertToType(data['page'], 'Number');
      if (data.hasOwnProperty('page_size'))
        obj.page_size = ApiClient.convertToType(data['page_size'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {Number} page
 * @default 1
 */
PageInfo.prototype.page = 1;

/**
 * @member {Number} page_size
 * @default 10
 */
PageInfo.prototype.page_size = 10;

