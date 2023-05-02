/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The OpenApiv13bcadvertisercreateContactInfo model module.
 * @module model/OpenApiv13bcadvertisercreateContactInfo
 * @version 0.1.0
 */
export class OpenApiv13bcadvertisercreateContactInfo {
  /**
   * Constructs a new <code>OpenApiv13bcadvertisercreateContactInfo</code>.
   * Contact Information
   * @alias module:model/OpenApiv13bcadvertisercreateContactInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13bcadvertisercreateContactInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13bcadvertisercreateContactInfo} obj Optional instance to populate.
   * @return {module:model/OpenApiv13bcadvertisercreateContactInfo} The populated <code>OpenApiv13bcadvertisercreateContactInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13bcadvertisercreateContactInfo();
      if (data.hasOwnProperty('email'))
        obj.email = ApiClient.convertToType(data['email'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('number'))
        obj._number = ApiClient.convertToType(data['number'], 'String');
    }
    return obj;
  }
}

/**
 * Contact email. Required if the place of registration of the ad account or the Business Center is France, Brazil, or Mexico
 * @member {String} email
 */
OpenApiv13bcadvertisercreateContactInfo.prototype.email = undefined;

/**
 * Contact name. No more than 100 characters in length
 * @member {String} name
 */
OpenApiv13bcadvertisercreateContactInfo.prototype.name = undefined;

/**
 * Contact phone
 * @member {String} _number
 */
OpenApiv13bcadvertisercreateContactInfo.prototype._number = undefined;

