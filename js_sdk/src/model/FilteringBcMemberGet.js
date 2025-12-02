/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringBcMemberGet model module.
 * @module model/FilteringBcMemberGet
 * @version 0.1.9
 */
export class FilteringBcMemberGet {
  /**
   * Constructs a new <code>FilteringBcMemberGet</code>.
   * @alias module:model/FilteringBcMemberGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringBcMemberGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBcMemberGet} obj Optional instance to populate.
   * @return {module:model/FilteringBcMemberGet} The populated <code>FilteringBcMemberGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBcMemberGet();
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
      if (data.hasOwnProperty('relation_status'))
        obj.relation_status = ApiClient.convertToType(data['relation_status'], 'String');
      if (data.hasOwnProperty('user_role'))
        obj.user_role = ApiClient.convertToType(data['user_role'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} keyword
 */
FilteringBcMemberGet.prototype.keyword = undefined;

/**
 * @member {String} relation_status
 */
FilteringBcMemberGet.prototype.relation_status = undefined;

/**
 * @member {String} user_role
 */
FilteringBcMemberGet.prototype.user_role = undefined;

