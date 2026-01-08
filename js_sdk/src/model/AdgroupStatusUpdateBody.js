/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupStatusUpdateBody model module.
 * @module model/AdgroupStatusUpdateBody
 * @version 0.1.9
 */
export class AdgroupStatusUpdateBody {
  /**
   * Constructs a new <code>AdgroupStatusUpdateBody</code>.
   * @alias module:model/AdgroupStatusUpdateBody
   * @class
   * @param adgroup_ids {Array.<String>} 
   * @param advertiser_id {String} 
   * @param operation_status {String} 
   */
  constructor(adgroup_ids, advertiser_id, operation_status) {
    this.adgroup_ids = adgroup_ids;
    this.advertiser_id = advertiser_id;
    this.operation_status = operation_status;
  }

  /**
   * Constructs a <code>AdgroupStatusUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupStatusUpdateBody} obj Optional instance to populate.
   * @return {module:model/AdgroupStatusUpdateBody} The populated <code>AdgroupStatusUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupStatusUpdateBody();
      if (data.hasOwnProperty('adgroup_ids'))
        obj.adgroup_ids = ApiClient.convertToType(data['adgroup_ids'], ['String']);
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('allow_partial_success'))
        obj.allow_partial_success = ApiClient.convertToType(data['allow_partial_success'], 'Boolean');
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} adgroup_ids
 */
AdgroupStatusUpdateBody.prototype.adgroup_ids = undefined;

/**
 * @member {String} advertiser_id
 */
AdgroupStatusUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Boolean} allow_partial_success
 * @default false
 */
AdgroupStatusUpdateBody.prototype.allow_partial_success = false;

/**
 * @member {String} operation_status
 */
AdgroupStatusUpdateBody.prototype.operation_status = undefined;

