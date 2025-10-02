/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusAdStatusUpdateBody model module.
 * @module model/SmartPlusAdStatusUpdateBody
 * @version 0.1.8
 */
export class SmartPlusAdStatusUpdateBody {
  /**
   * Constructs a new <code>SmartPlusAdStatusUpdateBody</code>.
   * @alias module:model/SmartPlusAdStatusUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param operation_status {String} 
   * @param smart_plus_ad_ids {Array.<String>} 
   */
  constructor(advertiser_id, operation_status, smart_plus_ad_ids) {
    this.advertiser_id = advertiser_id;
    this.operation_status = operation_status;
    this.smart_plus_ad_ids = smart_plus_ad_ids;
  }

  /**
   * Constructs a <code>SmartPlusAdStatusUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdStatusUpdateBody} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdStatusUpdateBody} The populated <code>SmartPlusAdStatusUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdStatusUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
      if (data.hasOwnProperty('smart_plus_ad_ids'))
        obj.smart_plus_ad_ids = ApiClient.convertToType(data['smart_plus_ad_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
SmartPlusAdStatusUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} operation_status
 */
SmartPlusAdStatusUpdateBody.prototype.operation_status = undefined;

/**
 * @member {Array.<String>} smart_plus_ad_ids
 */
SmartPlusAdStatusUpdateBody.prototype.smart_plus_ad_ids = undefined;

