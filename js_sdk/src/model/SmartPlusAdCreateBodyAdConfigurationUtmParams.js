/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyAdConfigurationUtmParams model module.
 * @module model/SmartPlusAdCreateBodyAdConfigurationUtmParams
 * @version 0.1.9
 */
export class SmartPlusAdCreateBodyAdConfigurationUtmParams {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyAdConfigurationUtmParams</code>.
   * @alias module:model/SmartPlusAdCreateBodyAdConfigurationUtmParams
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyAdConfigurationUtmParams</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyAdConfigurationUtmParams} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyAdConfigurationUtmParams} The populated <code>SmartPlusAdCreateBodyAdConfigurationUtmParams</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyAdConfigurationUtmParams();
      if (data.hasOwnProperty('key'))
        obj.key = ApiClient.convertToType(data['key'], 'String');
      if (data.hasOwnProperty('value'))
        obj.value = ApiClient.convertToType(data['value'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} key
 */
SmartPlusAdCreateBodyAdConfigurationUtmParams.prototype.key = undefined;

/**
 * @member {String} value
 */
SmartPlusAdCreateBodyAdConfigurationUtmParams.prototype.value = undefined;

