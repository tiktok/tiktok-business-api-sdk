/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringBcAssetGroupList model module.
 * @module model/FilteringBcAssetGroupList
 * @version 0.1.9
 */
export class FilteringBcAssetGroupList {
  /**
   * Constructs a new <code>FilteringBcAssetGroupList</code>.
   * @alias module:model/FilteringBcAssetGroupList
   * @class
   * @param keyword {String} Keyword filter for asset group search.
   */
  constructor(keyword) {
    this.keyword = keyword;
  }

  /**
   * Constructs a <code>FilteringBcAssetGroupList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBcAssetGroupList} obj Optional instance to populate.
   * @return {module:model/FilteringBcAssetGroupList} The populated <code>FilteringBcAssetGroupList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBcAssetGroupList();
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
    }
    return obj;
  }
}

/**
 * Keyword filter for asset group search.
 * @member {String} keyword
 */
FilteringBcAssetGroupList.prototype.keyword = undefined;

