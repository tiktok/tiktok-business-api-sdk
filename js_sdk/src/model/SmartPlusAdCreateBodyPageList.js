/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyPageList model module.
 * @module model/SmartPlusAdCreateBodyPageList
 * @version 1.2.1
 */
export class SmartPlusAdCreateBodyPageList {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyPageList</code>.
   * @alias module:model/SmartPlusAdCreateBodyPageList
   * @class
   * @param page_id {String} 
   */
  constructor(page_id) {
    this.page_id = page_id;
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyPageList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyPageList} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyPageList} The populated <code>SmartPlusAdCreateBodyPageList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyPageList();
      if (data.hasOwnProperty('page_id'))
        obj.page_id = ApiClient.convertToType(data['page_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} page_id
 */
SmartPlusAdCreateBodyPageList.prototype.page_id = undefined;

