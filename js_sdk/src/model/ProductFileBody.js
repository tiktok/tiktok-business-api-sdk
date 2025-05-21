/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ProductFileBody model module.
 * @module model/ProductFileBody
 * @version 0.1.7
 */
export class ProductFileBody {
  /**
   * Constructs a new <code>ProductFileBody</code>.
   * @alias module:model/ProductFileBody
   * @class
   * @param bc_id {String} 
   * @param catalog_id {String} 
   * @param file_url {String} 
   */
  constructor(bc_id, catalog_id, file_url) {
    this.bc_id = bc_id;
    this.catalog_id = catalog_id;
    this.file_url = file_url;
  }

  /**
   * Constructs a <code>ProductFileBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ProductFileBody} obj Optional instance to populate.
   * @return {module:model/ProductFileBody} The populated <code>ProductFileBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ProductFileBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('feed_id'))
        obj.feed_id = ApiClient.convertToType(data['feed_id'], 'Number');
      if (data.hasOwnProperty('file_url'))
        obj.file_url = ApiClient.convertToType(data['file_url'], 'String');
      if (data.hasOwnProperty('update_mode'))
        obj.update_mode = ApiClient.convertToType(data['update_mode'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
ProductFileBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
ProductFileBody.prototype.catalog_id = undefined;

/**
 * @member {Number} feed_id
 */
ProductFileBody.prototype.feed_id = undefined;

/**
 * @member {String} file_url
 */
ProductFileBody.prototype.file_url = undefined;

/**
 * @member {String} update_mode
 * @default 'INCREMENTAL'
 */
ProductFileBody.prototype.update_mode = 'INCREMENTAL';

