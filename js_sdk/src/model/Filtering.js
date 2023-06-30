/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The Filtering model module.
 * @module model/Filtering
 * @version 0.1.1
 */
export class Filtering {
  /**
   * Constructs a new <code>Filtering</code>.
   * @alias module:model/Filtering
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>Filtering</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Filtering} obj Optional instance to populate.
   * @return {module:model/Filtering} The populated <code>Filtering</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Filtering();
      if (data.hasOwnProperty('keyword'))
        obj.keyword = ApiClient.convertToType(data['keyword'], 'String');
      if (data.hasOwnProperty('user_email'))
        obj.user_email = ApiClient.convertToType(data['user_email'], 'String');
      if (data.hasOwnProperty('user_id'))
        obj.user_id = ApiClient.convertToType(data['user_id'], 'String');
    }
    return obj;
  }
}

/**
 * Keyword of the asset you are looking for
 * @member {String} keyword
 */
Filtering.prototype.keyword = undefined;

/**
 * Email of the user that you want to get assets for. Note: `user_id` and `user_mail` cannot be set at the same time. For users that are in `BOUND` status, use `user_id` to get their assets. For users that are in `PENDING` status, use `user_email` to get their assets. Use `user_email` as filter only when you have set `asset_type` as `ADVERTISER` and the invitation for the user to join Business Center is still pending.
 * @member {String} user_email
 */
Filtering.prototype.user_email = undefined;

/**
 * ID of the user that you want to get assets for. Note: `user_id` and `user_mail` cannot be set at the same time. For users that are in `BOUND` status, use `user_id` to get their assets. For users that are in `PENDING` status, use `user_email` to get their assets
 * @member {String} user_id
 */
Filtering.prototype.user_id = undefined;

