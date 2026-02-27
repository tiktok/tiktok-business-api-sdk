/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CatalogsetupdateConditions} from './CatalogsetupdateConditions.js';

/**
 * The SetUpdateBody model module.
 * @module model/SetUpdateBody
 * @version 1.2.1
 */
export class SetUpdateBody {
  /**
   * Constructs a new <code>SetUpdateBody</code>.
   * @alias module:model/SetUpdateBody
   * @class
   * @param bc_id {String} 
   * @param catalog_id {String} 
   * @param product_set_id {String} 
   */
  constructor(bc_id, catalog_id, product_set_id) {
    this.bc_id = bc_id;
    this.catalog_id = catalog_id;
    this.product_set_id = product_set_id;
  }

  /**
   * Constructs a <code>SetUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SetUpdateBody} obj Optional instance to populate.
   * @return {module:model/SetUpdateBody} The populated <code>SetUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SetUpdateBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('conditions'))
        obj.conditions = CatalogsetupdateConditions.constructFromObject(data['conditions']);
      if (data.hasOwnProperty('product_set_id'))
        obj.product_set_id = ApiClient.convertToType(data['product_set_id'], 'String');
      if (data.hasOwnProperty('product_set_name'))
        obj.product_set_name = ApiClient.convertToType(data['product_set_name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
SetUpdateBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
SetUpdateBody.prototype.catalog_id = undefined;

/**
 * @member {module:model/CatalogsetupdateConditions} conditions
 */
SetUpdateBody.prototype.conditions = undefined;

/**
 * @member {String} product_set_id
 */
SetUpdateBody.prototype.product_set_id = undefined;

/**
 * @member {String} product_set_name
 */
SetUpdateBody.prototype.product_set_name = undefined;

