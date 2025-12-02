/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OfflineDeleteBody model module.
 * @module model/OfflineDeleteBody
 * @version 0.1.9
 */
export class OfflineDeleteBody {
  /**
   * Constructs a new <code>OfflineDeleteBody</code>.
   * @alias module:model/OfflineDeleteBody
   * @class
   * @param advertiser_id {String} 
   * @param event_set_id {String} 
   */
  constructor(advertiser_id, event_set_id) {
    this.advertiser_id = advertiser_id;
    this.event_set_id = event_set_id;
  }

  /**
   * Constructs a <code>OfflineDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OfflineDeleteBody} obj Optional instance to populate.
   * @return {module:model/OfflineDeleteBody} The populated <code>OfflineDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OfflineDeleteBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('event_set_id'))
        obj.event_set_id = ApiClient.convertToType(data['event_set_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
OfflineDeleteBody.prototype.advertiser_id = undefined;

/**
 * @member {String} event_set_id
 */
OfflineDeleteBody.prototype.event_set_id = undefined;

