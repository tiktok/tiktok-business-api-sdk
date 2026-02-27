/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {PixeleventcreatePixelEvents} from './PixeleventcreatePixelEvents.js';

/**
 * The EventCreateBody model module.
 * @module model/EventCreateBody
 * @version 1.2.1
 */
export class EventCreateBody {
  /**
   * Constructs a new <code>EventCreateBody</code>.
   * @alias module:model/EventCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param pixel_events {Array.<module:model/PixeleventcreatePixelEvents>} 
   * @param pixel_id {String} 
   */
  constructor(advertiser_id, pixel_events, pixel_id) {
    this.advertiser_id = advertiser_id;
    this.pixel_events = pixel_events;
    this.pixel_id = pixel_id;
  }

  /**
   * Constructs a <code>EventCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EventCreateBody} obj Optional instance to populate.
   * @return {module:model/EventCreateBody} The populated <code>EventCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new EventCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('pixel_events'))
        obj.pixel_events = ApiClient.convertToType(data['pixel_events'], [PixeleventcreatePixelEvents]);
      if (data.hasOwnProperty('pixel_id'))
        obj.pixel_id = ApiClient.convertToType(data['pixel_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
EventCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<module:model/PixeleventcreatePixelEvents>} pixel_events
 */
EventCreateBody.prototype.pixel_events = undefined;

/**
 * @member {String} pixel_id
 */
EventCreateBody.prototype.pixel_id = undefined;

