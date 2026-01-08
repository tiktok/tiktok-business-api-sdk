/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdcreateShowcaseProducts model module.
 * @module model/AdcreateShowcaseProducts
 * @version 0.1.9
 */
export class AdcreateShowcaseProducts {
  /**
   * Constructs a new <code>AdcreateShowcaseProducts</code>.
   * @alias module:model/AdcreateShowcaseProducts
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdcreateShowcaseProducts</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdcreateShowcaseProducts} obj Optional instance to populate.
   * @return {module:model/AdcreateShowcaseProducts} The populated <code>AdcreateShowcaseProducts</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdcreateShowcaseProducts();
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
AdcreateShowcaseProducts.prototype.catalog_id = undefined;

/**
 * @member {String} item_group_id
 */
AdcreateShowcaseProducts.prototype.item_group_id = undefined;

/**
 * @member {String} store_id
 */
AdcreateShowcaseProducts.prototype.store_id = undefined;

