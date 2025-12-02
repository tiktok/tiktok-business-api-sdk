/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CatalogCapitalizeBody model module.
 * @module model/CatalogCapitalizeBody
 * @version 0.1.9
 */
export class CatalogCapitalizeBody {
  /**
   * Constructs a new <code>CatalogCapitalizeBody</code>.
   * @alias module:model/CatalogCapitalizeBody
   * @class
   * @param advertiser_id {String} 
   * @param bc_id {String} 
   * @param catalog_id {String} 
   */
  constructor(advertiser_id, bc_id, catalog_id) {
    this.advertiser_id = advertiser_id;
    this.bc_id = bc_id;
    this.catalog_id = catalog_id;
  }

  /**
   * Constructs a <code>CatalogCapitalizeBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CatalogCapitalizeBody} obj Optional instance to populate.
   * @return {module:model/CatalogCapitalizeBody} The populated <code>CatalogCapitalizeBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CatalogCapitalizeBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
CatalogCapitalizeBody.prototype.advertiser_id = undefined;

/**
 * @member {String} bc_id
 */
CatalogCapitalizeBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
CatalogCapitalizeBody.prototype.catalog_id = undefined;

