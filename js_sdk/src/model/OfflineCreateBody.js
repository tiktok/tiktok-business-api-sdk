/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OfflineCreateBody model module.
 * @module model/OfflineCreateBody
 * @version 0.1.8
 */
export class OfflineCreateBody {
  /**
   * Constructs a new <code>OfflineCreateBody</code>.
   * @alias module:model/OfflineCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param description {String} 
   * @param name {String} 
   */
  constructor(advertiser_id, description, name) {
    this.advertiser_id = advertiser_id;
    this.description = description;
    this.name = name;
  }

  /**
   * Constructs a <code>OfflineCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OfflineCreateBody} obj Optional instance to populate.
   * @return {module:model/OfflineCreateBody} The populated <code>OfflineCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OfflineCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('auto_tracking'))
        obj.auto_tracking = ApiClient.convertToType(data['auto_tracking'], 'Boolean');
      if (data.hasOwnProperty('description'))
        obj.description = ApiClient.convertToType(data['description'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
OfflineCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {Boolean} auto_tracking
 * @default false
 */
OfflineCreateBody.prototype.auto_tracking = false;

/**
 * @member {String} description
 */
OfflineCreateBody.prototype.description = undefined;

/**
 * @member {String} name
 */
OfflineCreateBody.prototype.name = undefined;

