/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyDeeplinkList model module.
 * @module model/SmartPlusAdCreateBodyDeeplinkList
 * @version 1.2.1
 */
export class SmartPlusAdCreateBodyDeeplinkList {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyDeeplinkList</code>.
   * @alias module:model/SmartPlusAdCreateBodyDeeplinkList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyDeeplinkList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyDeeplinkList} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyDeeplinkList} The populated <code>SmartPlusAdCreateBodyDeeplinkList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyDeeplinkList();
      if (data.hasOwnProperty('deeplink'))
        obj.deeplink = ApiClient.convertToType(data['deeplink'], 'String');
      if (data.hasOwnProperty('deeplink_type'))
        obj.deeplink_type = ApiClient.convertToType(data['deeplink_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} deeplink
 */
SmartPlusAdCreateBodyDeeplinkList.prototype.deeplink = undefined;

/**
 * @member {String} deeplink_type
 */
SmartPlusAdCreateBodyDeeplinkList.prototype.deeplink_type = undefined;

