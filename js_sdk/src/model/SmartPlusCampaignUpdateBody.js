/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusCampaignUpdateBody model module.
 * @module model/SmartPlusCampaignUpdateBody
 * @version 0.1.9
 */
export class SmartPlusCampaignUpdateBody {
  /**
   * Constructs a new <code>SmartPlusCampaignUpdateBody</code>.
   * @alias module:model/SmartPlusCampaignUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param campaign_id {String} 
   */
  constructor(advertiser_id, campaign_id) {
    this.advertiser_id = advertiser_id;
    this.campaign_id = campaign_id;
  }

  /**
   * Constructs a <code>SmartPlusCampaignUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusCampaignUpdateBody} obj Optional instance to populate.
   * @return {module:model/SmartPlusCampaignUpdateBody} The populated <code>SmartPlusCampaignUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusCampaignUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('campaign_id'))
        obj.campaign_id = ApiClient.convertToType(data['campaign_id'], 'String');
      if (data.hasOwnProperty('campaign_name'))
        obj.campaign_name = ApiClient.convertToType(data['campaign_name'], 'String');
      if (data.hasOwnProperty('po_number'))
        obj.po_number = ApiClient.convertToType(data['po_number'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
SmartPlusCampaignUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Number} budget
 */
SmartPlusCampaignUpdateBody.prototype.budget = undefined;

/**
 * @member {String} campaign_id
 */
SmartPlusCampaignUpdateBody.prototype.campaign_id = undefined;

/**
 * @member {String} campaign_name
 */
SmartPlusCampaignUpdateBody.prototype.campaign_name = undefined;

/**
 * @member {String} po_number
 */
SmartPlusCampaignUpdateBody.prototype.po_number = undefined;

