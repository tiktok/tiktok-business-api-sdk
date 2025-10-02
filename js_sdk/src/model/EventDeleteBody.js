/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The EventDeleteBody model module.
 * @module model/EventDeleteBody
 * @version 0.1.8
 */
export class EventDeleteBody {
  /**
   * Constructs a new <code>EventDeleteBody</code>.
   * @alias module:model/EventDeleteBody
   * @class
   * @param advertiser_id {String} 
   * @param event_id {String} 
   */
  constructor(advertiser_id, event_id) {
    this.advertiser_id = advertiser_id;
    this.event_id = event_id;
  }

  /**
   * Constructs a <code>EventDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EventDeleteBody} obj Optional instance to populate.
   * @return {module:model/EventDeleteBody} The populated <code>EventDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new EventDeleteBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('event_id'))
        obj.event_id = ApiClient.convertToType(data['event_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
EventDeleteBody.prototype.advertiser_id = undefined;

/**
 * @member {String} event_id
 */
EventDeleteBody.prototype.event_id = undefined;

