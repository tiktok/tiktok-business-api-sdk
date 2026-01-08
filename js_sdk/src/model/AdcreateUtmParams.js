/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdcreateUtmParams model module.
 * @module model/AdcreateUtmParams
 * @version 0.1.9
 */
export class AdcreateUtmParams {
  /**
   * Constructs a new <code>AdcreateUtmParams</code>.
   * @alias module:model/AdcreateUtmParams
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdcreateUtmParams</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdcreateUtmParams} obj Optional instance to populate.
   * @return {module:model/AdcreateUtmParams} The populated <code>AdcreateUtmParams</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdcreateUtmParams();
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
AdcreateUtmParams.prototype.key = undefined;

/**
 * @member {String} value
 */
AdcreateUtmParams.prototype.value = undefined;

