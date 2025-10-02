/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OfflineUpdateBody model module.
 * @module model/OfflineUpdateBody
 * @version 0.1.8
 */
export class OfflineUpdateBody {
  /**
   * Constructs a new <code>OfflineUpdateBody</code>.
   * @alias module:model/OfflineUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param event_set_id {String} 
   */
  constructor(advertiser_id, event_set_id) {
    this.advertiser_id = advertiser_id;
    this.event_set_id = event_set_id;
  }

  /**
   * Constructs a <code>OfflineUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OfflineUpdateBody} obj Optional instance to populate.
   * @return {module:model/OfflineUpdateBody} The populated <code>OfflineUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OfflineUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('auto_tracking'))
        obj.auto_tracking = ApiClient.convertToType(data['auto_tracking'], 'Boolean');
      if (data.hasOwnProperty('event_set_id'))
        obj.event_set_id = ApiClient.convertToType(data['event_set_id'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
OfflineUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Boolean} auto_tracking
 */
OfflineUpdateBody.prototype.auto_tracking = undefined;

/**
 * @member {String} event_set_id
 */
OfflineUpdateBody.prototype.event_set_id = undefined;

/**
 * @member {String} name
 */
OfflineUpdateBody.prototype.name = undefined;

