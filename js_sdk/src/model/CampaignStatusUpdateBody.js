/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The CampaignStatusUpdateBody model module.
 * @module model/CampaignStatusUpdateBody
 * @version 0.1.1
 */
export class CampaignStatusUpdateBody {
  /**
   * Constructs a new <code>CampaignStatusUpdateBody</code>.
   * @alias module:model/CampaignStatusUpdateBody
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CampaignStatusUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaignStatusUpdateBody} obj Optional instance to populate.
   * @return {module:model/CampaignStatusUpdateBody} The populated <code>CampaignStatusUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaignStatusUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('campaign_ids'))
        obj.campaign_ids = ApiClient.convertToType(data['campaign_ids'], ['String']);
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
    }
    return obj;
  }
}

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
CampaignStatusUpdateBody.prototype.advertiser_id = undefined;

/**
 * A list of campaign IDs, with an allowed quantity range `1-20`.
 * @member {Array.<String>} campaign_ids
 */
CampaignStatusUpdateBody.prototype.campaign_ids = undefined;

/**
 * The operation being made. Enum values- `DELETE` (delete),` DISABLE` (pause), `ENABLE` (enable). The status of deleted ads cannot be modified.
 * @member {String} operation_status
 */
CampaignStatusUpdateBody.prototype.operation_status = undefined;

