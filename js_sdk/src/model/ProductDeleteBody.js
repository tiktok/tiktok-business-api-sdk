/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ProductDeleteBody model module.
 * @module model/ProductDeleteBody
 * @version 1.2.1
 */
export class ProductDeleteBody {
  /**
   * Constructs a new <code>ProductDeleteBody</code>.
   * @alias module:model/ProductDeleteBody
   * @class
   * @param bc_id {String} 
   * @param catalog_id {String} 
   */
  constructor(bc_id, catalog_id) {
    this.bc_id = bc_id;
    this.catalog_id = catalog_id;
  }

  /**
   * Constructs a <code>ProductDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ProductDeleteBody} obj Optional instance to populate.
   * @return {module:model/ProductDeleteBody} The populated <code>ProductDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ProductDeleteBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('destination_ids'))
        obj.destination_ids = ApiClient.convertToType(data['destination_ids'], ['String']);
      if (data.hasOwnProperty('feed_id'))
        obj.feed_id = ApiClient.convertToType(data['feed_id'], 'String');
      if (data.hasOwnProperty('flight_ids'))
        obj.flight_ids = ApiClient.convertToType(data['flight_ids'], ['String']);
      if (data.hasOwnProperty('hotel_ids'))
        obj.hotel_ids = ApiClient.convertToType(data['hotel_ids'], ['String']);
      if (data.hasOwnProperty('media_title_ids'))
        obj.media_title_ids = ApiClient.convertToType(data['media_title_ids'], ['String']);
      if (data.hasOwnProperty('sku_ids'))
        obj.sku_ids = ApiClient.convertToType(data['sku_ids'], ['String']);
      if (data.hasOwnProperty('vehicle_ids'))
        obj.vehicle_ids = ApiClient.convertToType(data['vehicle_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
ProductDeleteBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
ProductDeleteBody.prototype.catalog_id = undefined;

/**
 * @member {Array.<String>} destination_ids
 */
ProductDeleteBody.prototype.destination_ids = undefined;

/**
 * @member {String} feed_id
 */
ProductDeleteBody.prototype.feed_id = undefined;

/**
 * @member {Array.<String>} flight_ids
 */
ProductDeleteBody.prototype.flight_ids = undefined;

/**
 * @member {Array.<String>} hotel_ids
 */
ProductDeleteBody.prototype.hotel_ids = undefined;

/**
 * @member {Array.<String>} media_title_ids
 */
ProductDeleteBody.prototype.media_title_ids = undefined;

/**
 * @member {Array.<String>} sku_ids
 */
ProductDeleteBody.prototype.sku_ids = undefined;

/**
 * @member {Array.<String>} vehicle_ids
 */
ProductDeleteBody.prototype.vehicle_ids = undefined;

