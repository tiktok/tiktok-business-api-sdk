/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringBcGet model module.
 * @module model/FilteringBcGet
 * @version 0.1.9
 */
export class FilteringBcGet {
  /**
   * Constructs a new <code>FilteringBcGet</code>.
   * @alias module:model/FilteringBcGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringBcGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBcGet} obj Optional instance to populate.
   * @return {module:model/FilteringBcGet} The populated <code>FilteringBcGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBcGet();
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
      if (data.hasOwnProperty('keyword_type'))
        obj.keyword_type = ApiClient.convertToType(data['keyword_type'], 'String');
      if (data.hasOwnProperty('relation_type'))
        obj.relation_type = ApiClient.convertToType(data['relation_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} keyword
 */
FilteringBcGet.prototype.keyword = undefined;

/**
 * @member {String} keyword_type
 */
FilteringBcGet.prototype.keyword_type = undefined;

/**
 * @member {String} relation_type
 */
FilteringBcGet.prototype.relation_type = undefined;

