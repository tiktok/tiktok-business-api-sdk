/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CatalogcreateCatalogConf} from './CatalogcreateCatalogConf.js';

/**
 * The CatalogCreateBody model module.
 * @module model/CatalogCreateBody
 * @version 1.2.1
 */
export class CatalogCreateBody {
  /**
   * Constructs a new <code>CatalogCreateBody</code>.
   * @alias module:model/CatalogCreateBody
   * @class
   * @param bc_id {String} 
   * @param catalog_conf {module:model/CatalogcreateCatalogConf} 
   * @param catalog_type {String} 
   * @param name {String} 
   */
  constructor(bc_id, catalog_conf, catalog_type, name) {
    this.bc_id = bc_id;
    this.catalog_conf = catalog_conf;
    this.catalog_type = catalog_type;
    this.name = name;
  }

  /**
   * Constructs a <code>CatalogCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CatalogCreateBody} obj Optional instance to populate.
   * @return {module:model/CatalogCreateBody} The populated <code>CatalogCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CatalogCreateBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_conf'))
        obj.catalog_conf = CatalogcreateCatalogConf.constructFromObject(data['catalog_conf']);
      if (data.hasOwnProperty('catalog_type'))
        obj.catalog_type = ApiClient.convertToType(data['catalog_type'], 'String');
      if (data.hasOwnProperty('creative_asset_type'))
        obj.creative_asset_type = ApiClient.convertToType(data['creative_asset_type'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
CatalogCreateBody.prototype.bc_id = undefined;

/**
 * @member {module:model/CatalogcreateCatalogConf} catalog_conf
 */
CatalogCreateBody.prototype.catalog_conf = undefined;

/**
 * @member {String} catalog_type
 */
CatalogCreateBody.prototype.catalog_type = undefined;

/**
 * @member {String} creative_asset_type
 */
CatalogCreateBody.prototype.creative_asset_type = undefined;

/**
 * @member {String} name
 */
CatalogCreateBody.prototype.name = undefined;

