/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The EventsourceUnbindBody model module.
 * @module model/EventsourceUnbindBody
 * @version 0.1.4
 */
export class EventsourceUnbindBody {
  /**
   * Constructs a new <code>EventsourceUnbindBody</code>.
   * @alias module:model/EventsourceUnbindBody
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
   * Constructs a <code>EventsourceUnbindBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EventsourceUnbindBody} obj Optional instance to populate.
   * @return {module:model/EventsourceUnbindBody} The populated <code>EventsourceUnbindBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new EventsourceUnbindBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('pixel_code'))
        obj.pixel_code = ApiClient.convertToType(data['pixel_code'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
EventsourceUnbindBody.prototype.advertiser_id = undefined;

/**
 * @member {String} app_id
 */
EventsourceUnbindBody.prototype.app_id = undefined;

/**
 * @member {String} bc_id
 */
EventsourceUnbindBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
EventsourceUnbindBody.prototype.catalog_id = undefined;

/**
 * @member {String} pixel_code
 */
EventsourceUnbindBody.prototype.pixel_code = undefined;

