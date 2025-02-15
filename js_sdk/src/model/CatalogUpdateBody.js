/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CatalogUpdateBody model module.
 * @module model/CatalogUpdateBody
 * @version 0.1.4
 */
export class CatalogUpdateBody {
  /**
   * Constructs a new <code>CatalogUpdateBody</code>.
   * @alias module:model/CatalogUpdateBody
   * @class
   * @param bc_id {String} 
   * @param catalog_id {String} 
   * @param name {String} 
   */
  constructor(bc_id, catalog_id, name) {
    this.bc_id = bc_id;
    this.catalog_id = catalog_id;
    this.name = name;
  }

  /**
   * Constructs a <code>CatalogUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CatalogUpdateBody} obj Optional instance to populate.
   * @return {module:model/CatalogUpdateBody} The populated <code>CatalogUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CatalogUpdateBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
CatalogUpdateBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
CatalogUpdateBody.prototype.catalog_id = undefined;

/**
 * @member {String} name
 */
CatalogUpdateBody.prototype.name = undefined;

