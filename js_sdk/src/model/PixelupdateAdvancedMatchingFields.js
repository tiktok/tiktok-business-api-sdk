/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PixelupdateAdvancedMatchingFields model module.
 * @module model/PixelupdateAdvancedMatchingFields
 * @version 0.1.7
 */
export class PixelupdateAdvancedMatchingFields {
  /**
   * Constructs a new <code>PixelupdateAdvancedMatchingFields</code>.
   * @alias module:model/PixelupdateAdvancedMatchingFields
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PixelupdateAdvancedMatchingFields</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelupdateAdvancedMatchingFields} obj Optional instance to populate.
   * @return {module:model/PixelupdateAdvancedMatchingFields} The populated <code>PixelupdateAdvancedMatchingFields</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelupdateAdvancedMatchingFields();
      if (data.hasOwnProperty('email'))
        obj.email = ApiClient.convertToType(data['email'], 'Boolean');
      if (data.hasOwnProperty('phone_number'))
        obj.phone_number = ApiClient.convertToType(data['phone_number'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {Boolean} email
 * @default true
 */
PixelupdateAdvancedMatchingFields.prototype.email = true;

/**
 * @member {Boolean} phone_number
 * @default true
 */
PixelupdateAdvancedMatchingFields.prototype.phone_number = true;

