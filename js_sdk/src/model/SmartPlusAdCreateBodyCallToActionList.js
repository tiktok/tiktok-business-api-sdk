/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyCallToActionList model module.
 * @module model/SmartPlusAdCreateBodyCallToActionList
 * @version 0.1.9
 */
export class SmartPlusAdCreateBodyCallToActionList {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyCallToActionList</code>.
   * @alias module:model/SmartPlusAdCreateBodyCallToActionList
   * @class
   * @param call_to_action {String} 
   */
  constructor(call_to_action) {
    this.call_to_action = call_to_action;
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyCallToActionList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyCallToActionList} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyCallToActionList} The populated <code>SmartPlusAdCreateBodyCallToActionList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyCallToActionList();
      if (data.hasOwnProperty('call_to_action'))
        obj.call_to_action = ApiClient.convertToType(data['call_to_action'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} call_to_action
 */
SmartPlusAdCreateBodyCallToActionList.prototype.call_to_action = undefined;

