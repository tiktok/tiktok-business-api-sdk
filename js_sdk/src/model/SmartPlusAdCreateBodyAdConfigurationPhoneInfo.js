/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdCreateBodyAdConfigurationPhoneInfo model module.
 * @module model/SmartPlusAdCreateBodyAdConfigurationPhoneInfo
 * @version 1.2.1
 */
export class SmartPlusAdCreateBodyAdConfigurationPhoneInfo {
  /**
   * Constructs a new <code>SmartPlusAdCreateBodyAdConfigurationPhoneInfo</code>.
   * @alias module:model/SmartPlusAdCreateBodyAdConfigurationPhoneInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SmartPlusAdCreateBodyAdConfigurationPhoneInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdCreateBodyAdConfigurationPhoneInfo} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdCreateBodyAdConfigurationPhoneInfo} The populated <code>SmartPlusAdCreateBodyAdConfigurationPhoneInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdCreateBodyAdConfigurationPhoneInfo();
      if (data.hasOwnProperty('phone_number'))
        obj.phone_number = ApiClient.convertToType(data['phone_number'], 'String');
      if (data.hasOwnProperty('phone_region_calling_code'))
        obj.phone_region_calling_code = ApiClient.convertToType(data['phone_region_calling_code'], 'String');
      if (data.hasOwnProperty('phone_region_code'))
        obj.phone_region_code = ApiClient.convertToType(data['phone_region_code'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} phone_number
 */
SmartPlusAdCreateBodyAdConfigurationPhoneInfo.prototype.phone_number = undefined;

/**
 * @member {String} phone_region_calling_code
 */
SmartPlusAdCreateBodyAdConfigurationPhoneInfo.prototype.phone_region_calling_code = undefined;

/**
 * @member {String} phone_region_code
 */
SmartPlusAdCreateBodyAdConfigurationPhoneInfo.prototype.phone_region_code = undefined;

