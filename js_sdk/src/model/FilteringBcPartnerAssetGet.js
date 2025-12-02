/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringBcPartnerAssetGet model module.
 * @module model/FilteringBcPartnerAssetGet
 * @version 0.1.9
 */
export class FilteringBcPartnerAssetGet {
  /**
   * Constructs a new <code>FilteringBcPartnerAssetGet</code>.
   * @alias module:model/FilteringBcPartnerAssetGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringBcPartnerAssetGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBcPartnerAssetGet} obj Optional instance to populate.
   * @return {module:model/FilteringBcPartnerAssetGet} The populated <code>FilteringBcPartnerAssetGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBcPartnerAssetGet();
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
    }
    return obj;
  }
}

/**
 * Keyword filter for asset search.
 * @member {String} keyword
 */
FilteringBcPartnerAssetGet.prototype.keyword = undefined;

