/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CampaignStatusUpdateBody model module.
 * @module model/CampaignStatusUpdateBody
 * @version 1.2.1
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
      if (data.hasOwnProperty('postback_window_mode'))
        obj.postback_window_mode = ApiClient.convertToType(data['postback_window_mode'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
CampaignStatusUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<String>} campaign_ids
 */
CampaignStatusUpdateBody.prototype.campaign_ids = undefined;

/**
 * @member {String} operation_status
 */
CampaignStatusUpdateBody.prototype.operation_status = undefined;

/**
 * @member {String} postback_window_mode
 */
CampaignStatusUpdateBody.prototype.postback_window_mode = undefined;

