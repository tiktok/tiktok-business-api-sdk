/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The StatusUpdateBody model module.
 * @module model/StatusUpdateBody
 * @version 0.1.8
 */
export class StatusUpdateBody {
  /**
   * Constructs a new <code>StatusUpdateBody</code>.
   * @alias module:model/StatusUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param comment_ids {Array.<String>} 
   * @param operation {String} 
   */
  constructor(advertiser_id, comment_ids, operation) {
    this.advertiser_id = advertiser_id;
    this.comment_ids = comment_ids;
    this.operation = operation;
  }

  /**
   * Constructs a <code>StatusUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/StatusUpdateBody} obj Optional instance to populate.
   * @return {module:model/StatusUpdateBody} The populated <code>StatusUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new StatusUpdateBody();
      if (data.hasOwnProperty('ad_type'))
        obj.ad_type = ApiClient.convertToType(data['ad_type'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('comment_ids'))
        obj.comment_ids = ApiClient.convertToType(data['comment_ids'], ['String']);
      if (data.hasOwnProperty('operation'))
        obj.operation = ApiClient.convertToType(data['operation'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} ad_type
 * @default 'BIDDING'
 */
StatusUpdateBody.prototype.ad_type = 'BIDDING';

/**
 * @member {String} advertiser_id
 */
StatusUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<String>} comment_ids
 */
StatusUpdateBody.prototype.comment_ids = undefined;

/**
 * @member {String} operation
 */
StatusUpdateBody.prototype.operation = undefined;

