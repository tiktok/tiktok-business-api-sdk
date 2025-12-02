/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyAdTextList model module.
 * @module model/SmartPlusAdCreateBodyAdTextList
 * @version 0.1.9
 */
export class SmartPlusAdCreateBodyAdTextList {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyAdTextList</code>.
   * @alias module:model/SmartPlusAdCreateBodyAdTextList
   * @class
   * @param ad_text {String} 
   */
  constructor(ad_text) {
    this.ad_text = ad_text;
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyAdTextList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyAdTextList} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyAdTextList} The populated <code>SmartPlusAdCreateBodyAdTextList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyAdTextList();
      if (data.hasOwnProperty('ad_text'))
        obj.ad_text = ApiClient.convertToType(data['ad_text'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} ad_text
 */
SmartPlusAdCreateBodyAdTextList.prototype.ad_text = undefined;

