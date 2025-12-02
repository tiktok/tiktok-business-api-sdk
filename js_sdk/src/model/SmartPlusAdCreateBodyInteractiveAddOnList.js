/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyInteractiveAddOnList model module.
 * @module model/SmartPlusAdCreateBodyInteractiveAddOnList
 * @version 0.1.9
 */
export class SmartPlusAdCreateBodyInteractiveAddOnList {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyInteractiveAddOnList</code>.
   * @alias module:model/SmartPlusAdCreateBodyInteractiveAddOnList
   * @class
   * @param card_id {String} 
   */
  constructor(card_id) {
    this.card_id = card_id;
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyInteractiveAddOnList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyInteractiveAddOnList} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyInteractiveAddOnList} The populated <code>SmartPlusAdCreateBodyInteractiveAddOnList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyInteractiveAddOnList();
      if (data.hasOwnProperty('card_id'))
        obj.card_id = ApiClient.convertToType(data['card_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} card_id
 */
SmartPlusAdCreateBodyInteractiveAddOnList.prototype.card_id = undefined;

