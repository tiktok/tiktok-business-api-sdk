/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyAutoMessageList model module.
 * @module model/SmartPlusAdCreateBodyAutoMessageList
 * @version 1.2.1
 */
export class SmartPlusAdCreateBodyAutoMessageList {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyAutoMessageList</code>.
   * @alias module:model/SmartPlusAdCreateBodyAutoMessageList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyAutoMessageList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyAutoMessageList} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyAutoMessageList} The populated <code>SmartPlusAdCreateBodyAutoMessageList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyAutoMessageList();
      if (data.hasOwnProperty('auto_message_id'))
        obj.auto_message_id = ApiClient.convertToType(data['auto_message_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} auto_message_id
 */
SmartPlusAdCreateBodyAutoMessageList.prototype.auto_message_id = undefined;

