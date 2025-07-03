/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SetDeleteBody model module.
 * @module model/SetDeleteBody
 * @version 0.1.7
 */
export class SetDeleteBody {
  /**
   * Constructs a new <code>SetDeleteBody</code>.
   * @alias module:model/SetDeleteBody
   * @class
   * @param bc_id {String} 
   * @param catalog_id {String} 
   * @param product_set_ids {Array.<String>} 
   */
  constructor(bc_id, catalog_id, product_set_ids) {
    this.bc_id = bc_id;
    this.catalog_id = catalog_id;
    this.product_set_ids = product_set_ids;
  }

  /**
   * Constructs a <code>SetDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SetDeleteBody} obj Optional instance to populate.
   * @return {module:model/SetDeleteBody} The populated <code>SetDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SetDeleteBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('product_set_ids'))
        obj.product_set_ids = ApiClient.convertToType(data['product_set_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
SetDeleteBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
SetDeleteBody.prototype.catalog_id = undefined;

/**
 * @member {Array.<String>} product_set_ids
 */
SetDeleteBody.prototype.product_set_ids = undefined;

