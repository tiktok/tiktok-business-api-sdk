/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CampaignUpdateBody model module.
 * @module model/CampaignUpdateBody
 * @version 0.1.2
 */
export class CampaignUpdateBody {
  /**
   * Constructs a new <code>CampaignUpdateBody</code>.
   * @alias module:model/CampaignUpdateBody
   * @class
   * @param advertiser_id {String} Advertiser ID
   * @param campaign_id {String} Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
   */
  constructor(advertiser_id, campaign_id) {
    this.advertiser_id = advertiser_id;
    this.campaign_id = campaign_id;
  }

  /**
   * Constructs a <code>CampaignUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaignUpdateBody} obj Optional instance to populate.
   * @return {module:model/CampaignUpdateBody} The populated <code>CampaignUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaignUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('budget_mode'))
        obj.budget_mode = ApiClient.convertToType(data['budget_mode'], 'String');
      if (data.hasOwnProperty('campaign_id'))
        obj.campaign_id = ApiClient.convertToType(data['campaign_id'], 'String');
      if (data.hasOwnProperty('campaign_name'))
        obj.campaign_name = ApiClient.convertToType(data['campaign_name'], 'String');
      if (data.hasOwnProperty('roas_bid'))
        obj.roas_bid = ApiClient.convertToType(data['roas_bid'], 'Number');
      if (data.hasOwnProperty('special_industries'))
        obj.special_industries = ApiClient.convertToType(data['special_industries'], ['String']);
    }
    return obj;
  }
}

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
CampaignUpdateBody.prototype.advertiser_id = undefined;

/**
 * Campaign budget. Required when budget_mode is BUDGET_MODE_DAY or BUDGET_MODE_TOTAL. To learn about the mininum budget and how to set budget types, see Budget settings.
 * @member {Number} budget
 */
CampaignUpdateBody.prototype.budget = undefined;

/**
 * Budget type. When Campaign Budgeet Optimization is enabled, only BUDGET_MODE_DAY is supported. To learn about how to set budget types, see Budget setting.
 * @member {String} budget_mode
 */
CampaignUpdateBody.prototype.budget_mode = undefined;

/**
 * Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
 * @member {String} campaign_id
 */
CampaignUpdateBody.prototype.campaign_id = undefined;

/**
 * Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
 * @member {String} campaign_name
 */
CampaignUpdateBody.prototype.campaign_name = undefined;

/**
 * ROAS (Return On Advertising Spend) goal to optimize value. This field can be modified only when Campaign Budget Optimization(budget_optimize_on) is enabled , optimization_goal is VALUE and deep_bid_type is VO_MIN_ROAS. Value range: 0.01-1000.
 * @member {Number} roas_bid
 */
CampaignUpdateBody.prototype.roas_bid = undefined;

/**
 * Ad categories. Enum values: HOUSING(Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities.) EMPLOYMENT(Ads for job offers, internship, professional certification programs or other related opportunities.) CREDIT(Ads for credit card offers, auto loans, long-term financing or other related opportunities.) Note: The ONLY supported operation here is that you can clear all the values for the field if you've specifed it when creating a campaign. If you've not specified the field when creating a campaign, you cannot specify it now either.
 * @member {Array.<String>} special_industries
 */
CampaignUpdateBody.prototype.special_industries = undefined;

