/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringBcAssetGet model module.
 * @module model/FilteringBcAssetGet
 * @version 0.1.7
 */
export class FilteringBcAssetGet {
  /**
   * Constructs a new <code>FilteringBcAssetGet</code>.
   * @alias module:model/FilteringBcAssetGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringBcAssetGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBcAssetGet} obj Optional instance to populate.
   * @return {module:model/FilteringBcAssetGet} The populated <code>FilteringBcAssetGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBcAssetGet();
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
      if (data.hasOwnProperty('user_email'))
        obj.user_email = ApiClient.convertToType(data['user_email'], 'String');
      if (data.hasOwnProperty('user_id'))
        obj.user_id = ApiClient.convertToType(data['user_id'], 'String');
    }
    return obj;
  }
}

/**
 * Keyword filter for asset search.
 * @member {String} keyword
 */
FilteringBcAssetGet.prototype.keyword = undefined;

/**
 * User email filter.
 * @member {String} user_email
 */
FilteringBcAssetGet.prototype.user_email = undefined;

/**
 * User ID filter.
 * @member {String} user_id
 */
FilteringBcAssetGet.prototype.user_id = undefined;

