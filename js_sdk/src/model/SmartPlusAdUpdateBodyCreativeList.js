/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {SmartPlusAdUpdateBodyCreativeInfo} from './SmartPlusAdUpdateBodyCreativeInfo.js';

/**
 * The SmartPlusAdUpdateBodyCreativeList model module.
 * @module model/SmartPlusAdUpdateBodyCreativeList
 * @version 0.1.9
 */
export class SmartPlusAdUpdateBodyCreativeList {
  /**
   * Constructs a new <code>SmartPlusAdUpdateBodyCreativeList</code>.
   * @alias module:model/SmartPlusAdUpdateBodyCreativeList
   * @class
   * @param creative_info {module:model/SmartPlusAdUpdateBodyCreativeInfo} 
   */
  constructor(creative_info) {
    this.creative_info = creative_info;
  }

  /**
   * Constructs a <code>SmartPlusAdUpdateBodyCreativeList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdUpdateBodyCreativeList} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdUpdateBodyCreativeList} The populated <code>SmartPlusAdUpdateBodyCreativeList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdUpdateBodyCreativeList();
      if (data.hasOwnProperty('creative_info'))
        obj.creative_info = SmartPlusAdUpdateBodyCreativeInfo.constructFromObject(data['creative_info']);
    }
    return obj;
  }
}

/**
 * @member {module:model/SmartPlusAdUpdateBodyCreativeInfo} creative_info
 */
SmartPlusAdUpdateBodyCreativeList.prototype.creative_info = undefined;

