/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdUpdateBodyAdConfigurationUtmParams model module.
 * @module model/SmartPlusAdUpdateBodyAdConfigurationUtmParams
 * @version 1.2.1
 */
export class SmartPlusAdUpdateBodyAdConfigurationUtmParams {
  /**
   * Constructs a new <code>SmartPlusAdUpdateBodyAdConfigurationUtmParams</code>.
   * @alias module:model/SmartPlusAdUpdateBodyAdConfigurationUtmParams
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SmartPlusAdUpdateBodyAdConfigurationUtmParams</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdUpdateBodyAdConfigurationUtmParams} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdUpdateBodyAdConfigurationUtmParams} The populated <code>SmartPlusAdUpdateBodyAdConfigurationUtmParams</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdUpdateBodyAdConfigurationUtmParams();
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
SmartPlusAdUpdateBodyAdConfigurationUtmParams.prototype.key = undefined;

/**
 * @member {String} value
 */
SmartPlusAdUpdateBodyAdConfigurationUtmParams.prototype.value = undefined;

