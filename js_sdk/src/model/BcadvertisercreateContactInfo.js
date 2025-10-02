/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BcadvertisercreateContactInfo model module.
 * @module model/BcadvertisercreateContactInfo
 * @version 0.1.8
 */
export class BcadvertisercreateContactInfo {
  /**
   * Constructs a new <code>BcadvertisercreateContactInfo</code>.
   * Contact Information
   * @alias module:model/BcadvertisercreateContactInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>BcadvertisercreateContactInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BcadvertisercreateContactInfo} obj Optional instance to populate.
   * @return {module:model/BcadvertisercreateContactInfo} The populated <code>BcadvertisercreateContactInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BcadvertisercreateContactInfo();
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
BcadvertisercreateContactInfo.prototype.email = undefined;

/**
 * Contact name. No more than 100 characters in length
 * @member {String} name
 */
BcadvertisercreateContactInfo.prototype.name = undefined;

/**
 * Contact phone
 * @member {String} _number
 */
BcadvertisercreateContactInfo.prototype._number = undefined;

