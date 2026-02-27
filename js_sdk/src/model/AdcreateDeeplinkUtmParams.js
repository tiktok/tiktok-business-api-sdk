/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdcreateDeeplinkUtmParams model module.
 * @module model/AdcreateDeeplinkUtmParams
 * @version 1.2.1
 */
export class AdcreateDeeplinkUtmParams {
  /**
   * Constructs a new <code>AdcreateDeeplinkUtmParams</code>.
   * @alias module:model/AdcreateDeeplinkUtmParams
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdcreateDeeplinkUtmParams</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdcreateDeeplinkUtmParams} obj Optional instance to populate.
   * @return {module:model/AdcreateDeeplinkUtmParams} The populated <code>AdcreateDeeplinkUtmParams</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdcreateDeeplinkUtmParams();
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
AdcreateDeeplinkUtmParams.prototype.key = undefined;

/**
 * @member {String} value
 */
AdcreateDeeplinkUtmParams.prototype.value = undefined;

