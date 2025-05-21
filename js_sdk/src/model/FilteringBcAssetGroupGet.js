/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringBcAssetGroupGet model module.
 * @module model/FilteringBcAssetGroupGet
 * @version 0.1.7
 */
export class FilteringBcAssetGroupGet {
  /**
   * Constructs a new <code>FilteringBcAssetGroupGet</code>.
   * @alias module:model/FilteringBcAssetGroupGet
   * @class
   * @param keyword {String} Keyword filter for retrieving asset group details.
   */
  constructor(keyword) {
    this.keyword = keyword;
  }

  /**
   * Constructs a <code>FilteringBcAssetGroupGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBcAssetGroupGet} obj Optional instance to populate.
   * @return {module:model/FilteringBcAssetGroupGet} The populated <code>FilteringBcAssetGroupGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBcAssetGroupGet();
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
    }
    return obj;
  }
}

/**
 * Keyword filter for retrieving asset group details.
 * @member {String} keyword
 */
FilteringBcAssetGroupGet.prototype.keyword = undefined;

