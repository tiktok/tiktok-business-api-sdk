/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The EventsourceBindBody model module.
 * @module model/EventsourceBindBody
 * @version 0.1.3
 */
export class EventsourceBindBody {
  /**
   * Constructs a new <code>EventsourceBindBody</code>.
   * @alias module:model/EventsourceBindBody
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
   * Constructs a <code>EventsourceBindBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EventsourceBindBody} obj Optional instance to populate.
   * @return {module:model/EventsourceBindBody} The populated <code>EventsourceBindBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new EventsourceBindBody();
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
EventsourceBindBody.prototype.advertiser_id = undefined;

/**
 * @member {String} app_id
 */
EventsourceBindBody.prototype.app_id = undefined;

/**
 * @member {String} bc_id
 */
EventsourceBindBody.prototype.bc_id = undefined;

/**
 * @member {String} catalog_id
 */
EventsourceBindBody.prototype.catalog_id = undefined;

/**
 * @member {String} pixel_code
 */
EventsourceBindBody.prototype.pixel_code = undefined;

