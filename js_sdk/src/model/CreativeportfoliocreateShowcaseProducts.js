/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CreativeportfoliocreateShowcaseProducts model module.
 * @module model/CreativeportfoliocreateShowcaseProducts
 * @version 0.1.7
 */
export class CreativeportfoliocreateShowcaseProducts {
  /**
   * Constructs a new <code>CreativeportfoliocreateShowcaseProducts</code>.
   * @alias module:model/CreativeportfoliocreateShowcaseProducts
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CreativeportfoliocreateShowcaseProducts</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreativeportfoliocreateShowcaseProducts} obj Optional instance to populate.
   * @return {module:model/CreativeportfoliocreateShowcaseProducts} The populated <code>CreativeportfoliocreateShowcaseProducts</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreativeportfoliocreateShowcaseProducts();
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('item_group_id'))
        obj.item_group_id = ApiClient.convertToType(data['item_group_id'], 'String');
      if (data.hasOwnProperty('store_id'))
        obj.store_id = ApiClient.convertToType(data['store_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} catalog_id
 */
CreativeportfoliocreateShowcaseProducts.prototype.catalog_id = undefined;

/**
 * @member {String} item_group_id
 */
CreativeportfoliocreateShowcaseProducts.prototype.item_group_id = undefined;

/**
 * @member {String} store_id
 */
CreativeportfoliocreateShowcaseProducts.prototype.store_id = undefined;

