/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CatalogDeleteBody model module.
 * @module model/CatalogDeleteBody
 * @version 0.1.9
 */
export class CatalogDeleteBody {
  /**
   * Constructs a new <code>CatalogDeleteBody</code>.
   * @alias module:model/CatalogDeleteBody
   * @class
   * @param bc_id {String} 
   * @param catalog_id {String} 
   */
  constructor(bc_id, catalog_id) {
    this.bc_id = bc_id;
    this.catalog_id = catalog_id;
  }

  /**
   * Constructs a <code>CatalogDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CatalogDeleteBody} obj Optional instance to populate.
   * @return {module:model/CatalogDeleteBody} The populated <code>CatalogDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CatalogDeleteBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
CatalogDeleteBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
CatalogDeleteBody.prototype.catalog_id = undefined;

