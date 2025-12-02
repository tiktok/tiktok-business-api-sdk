/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The EventUpdateBody model module.
 * @module model/EventUpdateBody
 * @version 0.1.9
 */
export class EventUpdateBody {
  /**
   * Constructs a new <code>EventUpdateBody</code>.
   * @alias module:model/EventUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param event_id {String} 
   */
  constructor(advertiser_id, event_id) {
    this.advertiser_id = advertiser_id;
    this.event_id = event_id;
  }

  /**
   * Constructs a <code>EventUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EventUpdateBody} obj Optional instance to populate.
   * @return {module:model/EventUpdateBody} The populated <code>EventUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new EventUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('currency'))
        obj.currency = ApiClient.convertToType(data['currency'], 'String');
      if (data.hasOwnProperty('currency_value'))
        obj.currency_value = ApiClient.convertToType(data['currency_value'], 'String');
      if (data.hasOwnProperty('event_id'))
        obj.event_id = ApiClient.convertToType(data['event_id'], 'String');
      if (data.hasOwnProperty('event_name'))
        obj.event_name = ApiClient.convertToType(data['event_name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
EventUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} currency
 */
EventUpdateBody.prototype.currency = undefined;

/**
 * @member {String} currency_value
 */
EventUpdateBody.prototype.currency_value = undefined;

/**
 * @member {String} event_id
 */
EventUpdateBody.prototype.event_id = undefined;

/**
 * @member {String} event_name
 */
EventUpdateBody.prototype.event_name = undefined;

