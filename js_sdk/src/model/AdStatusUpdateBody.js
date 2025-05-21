/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdStatusUpdateBody model module.
 * @module model/AdStatusUpdateBody
 * @version 0.1.7
 */
export class AdStatusUpdateBody {
  /**
   * Constructs a new <code>AdStatusUpdateBody</code>.
   * @alias module:model/AdStatusUpdateBody
   * @class
   * @param advertiser_id {String} Advertiser ID
   * @param operation_status {String} The operation being made. Enum values- `DELETE` (delete),` DISABLE` (pause), `ENABLE` (enable).  The status of deleted ads cannot be modified.
   */
  constructor(advertiser_id, operation_status) {
    this.advertiser_id = advertiser_id;
    this.operation_status = operation_status;
  }

  /**
   * Constructs a <code>AdStatusUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdStatusUpdateBody} obj Optional instance to populate.
   * @return {module:model/AdStatusUpdateBody} The populated <code>AdStatusUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdStatusUpdateBody();
      if (data.hasOwnProperty('aco_ad_ids'))
        obj.aco_ad_ids = ApiClient.convertToType(data['aco_ad_ids'], ['String']);
      if (data.hasOwnProperty('ad_ids'))
        obj.ad_ids = ApiClient.convertToType(data['ad_ids'], ['String']);
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
    }
    return obj;
  }
}

/**
 * A list of ACO ad IDs. Only support `ENABLE` and `DISABLE` for ACO ads.  Allowed quantity- `1-20`. Either `ad_ids` or `aco_ad_ids` has to be set.
 * @member {Array.<String>} aco_ad_ids
 */
AdStatusUpdateBody.prototype.aco_ad_ids = undefined;

/**
 * A list of ad IDs. Allowed quantity- `1-20`. Either `ad_ids` or `aco_ad_ids` has to be set.
 * @member {Array.<String>} ad_ids
 */
AdStatusUpdateBody.prototype.ad_ids = undefined;

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
AdStatusUpdateBody.prototype.advertiser_id = undefined;

/**
 * The operation being made. Enum values- `DELETE` (delete),` DISABLE` (pause), `ENABLE` (enable).  The status of deleted ads cannot be modified.
 * @member {String} operation_status
 */
AdStatusUpdateBody.prototype.operation_status = undefined;

