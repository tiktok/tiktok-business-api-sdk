/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ExclusiveAuthorizationCreateBody model module.
 * @module model/ExclusiveAuthorizationCreateBody
 * @version 1.2.1
 */
export class ExclusiveAuthorizationCreateBody {
  /**
   * Constructs a new <code>ExclusiveAuthorizationCreateBody</code>.
   * @alias module:model/ExclusiveAuthorizationCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param store_authorized_bc_id {String} 
   * @param store_id {String} 
   */
  constructor(advertiser_id, store_authorized_bc_id, store_id) {
    this.advertiser_id = advertiser_id;
    this.store_authorized_bc_id = store_authorized_bc_id;
    this.store_id = store_id;
  }

  /**
   * Constructs a <code>ExclusiveAuthorizationCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ExclusiveAuthorizationCreateBody} obj Optional instance to populate.
   * @return {module:model/ExclusiveAuthorizationCreateBody} The populated <code>ExclusiveAuthorizationCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ExclusiveAuthorizationCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('store_authorized_bc_id'))
        obj.store_authorized_bc_id = ApiClient.convertToType(data['store_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('store_id'))
        obj.store_id = ApiClient.convertToType(data['store_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
ExclusiveAuthorizationCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} store_authorized_bc_id
 */
ExclusiveAuthorizationCreateBody.prototype.store_authorized_bc_id = undefined;

/**
 * @member {String} store_id
 */
ExclusiveAuthorizationCreateBody.prototype.store_id = undefined;

