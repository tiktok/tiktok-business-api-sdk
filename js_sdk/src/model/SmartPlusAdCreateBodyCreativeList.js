/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {SmartPlusAdCreateBodyCreativeInfo} from './SmartPlusAdCreateBodyCreativeInfo.js';

/**
 * The SmartPlusAdCreateBodyCreativeList model module.
 * @module model/SmartPlusAdCreateBodyCreativeList
 * @version 1.2.1
 */
export class SmartPlusAdCreateBodyCreativeList {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyCreativeList</code>.
   * @alias module:model/SmartPlusAdCreateBodyCreativeList
   * @class
   * @param creative_info {module:model/SmartPlusAdCreateBodyCreativeInfo} 
   */
  constructor(creative_info) {
    this.creative_info = creative_info;
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyCreativeList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyCreativeList} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyCreativeList} The populated <code>SmartPlusAdCreateBodyCreativeList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyCreativeList();
      if (data.hasOwnProperty('creative_info'))
        obj.creative_info = SmartPlusAdCreateBodyCreativeInfo.constructFromObject(data['creative_info']);
    }
    return obj;
  }
}

/**
 * @member {module:model/SmartPlusAdCreateBodyCreativeInfo} creative_info
 */
SmartPlusAdCreateBodyCreativeList.prototype.creative_info = undefined;

