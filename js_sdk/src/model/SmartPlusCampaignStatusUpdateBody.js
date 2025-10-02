/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusCampaignStatusUpdateBody model module.
 * @module model/SmartPlusCampaignStatusUpdateBody
 * @version 0.1.8
 */
export class SmartPlusCampaignStatusUpdateBody {
  /**
   * Constructs a new <code>SmartPlusCampaignStatusUpdateBody</code>.
   * @alias module:model/SmartPlusCampaignStatusUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param campaign_ids {Array.<String>} 
   * @param operation_status {String} 
   */
  constructor(advertiser_id, campaign_ids, operation_status) {
    this.advertiser_id = advertiser_id;
    this.campaign_ids = campaign_ids;
    this.operation_status = operation_status;
  }

  /**
   * Constructs a <code>SmartPlusCampaignStatusUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusCampaignStatusUpdateBody} obj Optional instance to populate.
   * @return {module:model/SmartPlusCampaignStatusUpdateBody} The populated <code>SmartPlusCampaignStatusUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusCampaignStatusUpdateBody();
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
SmartPlusCampaignStatusUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<String>} campaign_ids
 */
SmartPlusCampaignStatusUpdateBody.prototype.campaign_ids = undefined;

/**
 * @member {String} operation_status
 */
SmartPlusCampaignStatusUpdateBody.prototype.operation_status = undefined;

/**
 * @member {String} postback_window_mode
 */
SmartPlusCampaignStatusUpdateBody.prototype.postback_window_mode = undefined;

