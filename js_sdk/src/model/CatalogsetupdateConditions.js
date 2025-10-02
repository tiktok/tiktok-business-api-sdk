/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CatalogsetupdateConditions model module.
 * @module model/CatalogsetupdateConditions
 * @version 0.1.8
 */
export class CatalogsetupdateConditions {
  /**
   * Constructs a new <code>CatalogsetupdateConditions</code>.
   * @alias module:model/CatalogsetupdateConditions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CatalogsetupdateConditions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CatalogsetupdateConditions} obj Optional instance to populate.
   * @return {module:model/CatalogsetupdateConditions} The populated <code>CatalogsetupdateConditions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CatalogsetupdateConditions();
      if (data.hasOwnProperty('and'))
        obj.and = ApiClient.convertToType(data['and'], [Object]);
      if (data.hasOwnProperty('or'))
        obj.or = ApiClient.convertToType(data['or'], [Object]);
    }
    return obj;
  }
}

/**
 * @member {Array.<Object>} and
 */
CatalogsetupdateConditions.prototype.and = undefined;

/**
 * @member {Array.<Object>} or
 */
CatalogsetupdateConditions.prototype.or = undefined;

