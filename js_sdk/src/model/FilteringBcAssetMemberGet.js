/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringBcAssetMemberGet model module.
 * @module model/FilteringBcAssetMemberGet
 * @version 0.1.9
 */
export class FilteringBcAssetMemberGet {
  /**
   * Constructs a new <code>FilteringBcAssetMemberGet</code>.
   * @alias module:model/FilteringBcAssetMemberGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringBcAssetMemberGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBcAssetMemberGet} obj Optional instance to populate.
   * @return {module:model/FilteringBcAssetMemberGet} The populated <code>FilteringBcAssetMemberGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBcAssetMemberGet();
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} keyword
 */
FilteringBcAssetMemberGet.prototype.keyword = undefined;

