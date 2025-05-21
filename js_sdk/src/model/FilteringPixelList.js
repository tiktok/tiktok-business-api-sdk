/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringPixelList model module.
 * @module model/FilteringPixelList
 * @version 0.1.7
 */
export class FilteringPixelList {
  /**
   * Constructs a new <code>FilteringPixelList</code>.
   * @alias module:model/FilteringPixelList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringPixelList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringPixelList} obj Optional instance to populate.
   * @return {module:model/FilteringPixelList} The populated <code>FilteringPixelList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringPixelList();
      if (data.hasOwnProperty('available_for_catalog_only'))
        obj.available_for_catalog_only = ApiClient.convertToType(data['available_for_catalog_only'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {Boolean} available_for_catalog_only
 * @default false
 */
FilteringPixelList.prototype.available_for_catalog_only = false;

