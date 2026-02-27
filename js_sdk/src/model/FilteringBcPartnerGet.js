/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringBcPartnerGet model module.
 * @module model/FilteringBcPartnerGet
 * @version 1.2.1
 */
export class FilteringBcPartnerGet {
  /**
   * Constructs a new <code>FilteringBcPartnerGet</code>.
   * @alias module:model/FilteringBcPartnerGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringBcPartnerGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringBcPartnerGet} obj Optional instance to populate.
   * @return {module:model/FilteringBcPartnerGet} The populated <code>FilteringBcPartnerGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringBcPartnerGet();
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
    }
    return obj;
  }
}

/**
 * Filter partners by name.
 * @member {String} name
 */
FilteringBcPartnerGet.prototype.name = undefined;

