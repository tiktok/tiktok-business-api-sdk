/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {PixeleventcreateRules} from './PixeleventcreateRules.js';

/**
 * The PixeleventcreatePixelEvents model module.
 * @module model/PixeleventcreatePixelEvents
 * @version 0.1.8
 */
export class PixeleventcreatePixelEvents {
  /**
   * Constructs a new <code>PixeleventcreatePixelEvents</code>.
   * @alias module:model/PixeleventcreatePixelEvents
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PixeleventcreatePixelEvents</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixeleventcreatePixelEvents} obj Optional instance to populate.
   * @return {module:model/PixeleventcreatePixelEvents} The populated <code>PixeleventcreatePixelEvents</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixeleventcreatePixelEvents();
      if (data.hasOwnProperty('currency'))
        obj.currency = ApiClient.convertToType(data['currency'], 'String');
      if (data.hasOwnProperty('currency_value'))
        obj.currency_value = ApiClient.convertToType(data['currency_value'], 'String');
      if (data.hasOwnProperty('event_code'))
        obj.event_code = ApiClient.convertToType(data['event_code'], 'String');
      if (data.hasOwnProperty('event_id'))
        obj.event_id = ApiClient.convertToType(data['event_id'], 'String');
      if (data.hasOwnProperty('event_name'))
        obj.event_name = ApiClient.convertToType(data['event_name'], 'String');
      if (data.hasOwnProperty('event_type'))
        obj.event_type = ApiClient.convertToType(data['event_type'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [PixeleventcreateRules]);
      if (data.hasOwnProperty('statistic_type'))
        obj.statistic_type = ApiClient.convertToType(data['statistic_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} currency
 */
PixeleventcreatePixelEvents.prototype.currency = undefined;

/**
 * @member {String} currency_value
 */
PixeleventcreatePixelEvents.prototype.currency_value = undefined;

/**
 * @member {String} event_code
 */
PixeleventcreatePixelEvents.prototype.event_code = undefined;

/**
 * @member {String} event_id
 */
PixeleventcreatePixelEvents.prototype.event_id = undefined;

/**
 * @member {String} event_name
 */
PixeleventcreatePixelEvents.prototype.event_name = undefined;

/**
 * @member {String} event_type
 */
PixeleventcreatePixelEvents.prototype.event_type = undefined;

/**
 * @member {Array.<module:model/PixeleventcreateRules>} rules
 */
PixeleventcreatePixelEvents.prototype.rules = undefined;

/**
 * @member {String} statistic_type
 */
PixeleventcreatePixelEvents.prototype.statistic_type = undefined;

