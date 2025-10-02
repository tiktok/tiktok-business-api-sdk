/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The SmartPlusCampaignCreateBody model module.
 * @module model/SmartPlusCampaignCreateBody
 * @version 0.1.8
 */
export class SmartPlusCampaignCreateBody {
  /**
   * Constructs a new <code>SmartPlusCampaignCreateBody</code>.
   * @alias module:model/SmartPlusCampaignCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param campaign_name {String} 
   * @param objective_type {String} 
   * @param request_id {String} 
   */
  constructor(advertiser_id, campaign_name, objective_type, request_id) {
    this.advertiser_id = advertiser_id;
    this.campaign_name = campaign_name;
    this.objective_type = objective_type;
    this.request_id = request_id;
  }

  /**
   * Constructs a <code>SmartPlusCampaignCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusCampaignCreateBody} obj Optional instance to populate.
   * @return {module:model/SmartPlusCampaignCreateBody} The populated <code>SmartPlusCampaignCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusCampaignCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('app_promotion_type'))
        obj.app_promotion_type = ApiClient.convertToType(data['app_promotion_type'], 'String');
      if (data.hasOwnProperty('bid_align_type'))
        obj.bid_align_type = ApiClient.convertToType(data['bid_align_type'], 'String');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('budget_mode'))
        obj.budget_mode = ApiClient.convertToType(data['budget_mode'], 'String');
      if (data.hasOwnProperty('budget_optimize_on'))
        obj.budget_optimize_on = ApiClient.convertToType(data['budget_optimize_on'], 'Boolean');
      if (data.hasOwnProperty('campaign_app_profile_page_state'))
        obj.campaign_app_profile_page_state = ApiClient.convertToType(data['campaign_app_profile_page_state'], 'String');
      if (data.hasOwnProperty('campaign_name'))
        obj.campaign_name = ApiClient.convertToType(data['campaign_name'], 'String');
      if (data.hasOwnProperty('campaign_type'))
        obj.campaign_type = ApiClient.convertToType(data['campaign_type'], 'String');
      if (data.hasOwnProperty('catalog_enabled'))
        obj.catalog_enabled = ApiClient.convertToType(data['catalog_enabled'], 'Boolean');
      if (data.hasOwnProperty('catalog_type'))
        obj.catalog_type = ApiClient.convertToType(data['catalog_type'], 'String');
      if (data.hasOwnProperty('disable_skan_campaign'))
        obj.disable_skan_campaign = ApiClient.convertToType(data['disable_skan_campaign'], 'Boolean');
      if (data.hasOwnProperty('is_advanced_dedicated_campaign'))
        obj.is_advanced_dedicated_campaign = ApiClient.convertToType(data['is_advanced_dedicated_campaign'], 'Boolean');
      if (data.hasOwnProperty('is_promotional_campaign'))
        obj.is_promotional_campaign = ApiClient.convertToType(data['is_promotional_campaign'], 'Boolean');
      if (data.hasOwnProperty('objective_type'))
        obj.objective_type = ApiClient.convertToType(data['objective_type'], 'String');
      if (data.hasOwnProperty('open_api_partner'))
        obj.open_api_partner = ApiClient.convertToType(data['open_api_partner'], 'String');
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
      if (data.hasOwnProperty('po_number'))
        obj.po_number = ApiClient.convertToType(data['po_number'], 'String');
      if (data.hasOwnProperty('postback_window_mode'))
        obj.postback_window_mode = ApiClient.convertToType(data['postback_window_mode'], 'String');
      if (data.hasOwnProperty('request_id'))
        obj.request_id = ApiClient.convertToType(data['request_id'], 'String');
      if (data.hasOwnProperty('sales_destination'))
        obj.sales_destination = ApiClient.convertToType(data['sales_destination'], 'String');
      if (data.hasOwnProperty('special_industries'))
        obj.special_industries = ApiClient.convertToType(data['special_industries'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
SmartPlusCampaignCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} app_id
 */
SmartPlusCampaignCreateBody.prototype.app_id = undefined;

/**
 * @member {String} app_promotion_type
 */
SmartPlusCampaignCreateBody.prototype.app_promotion_type = undefined;

/**
 * @member {String} bid_align_type
 */
SmartPlusCampaignCreateBody.prototype.bid_align_type = undefined;

/**
 * @member {Number} budget
 */
SmartPlusCampaignCreateBody.prototype.budget = undefined;

/**
 * @member {String} budget_mode
 */
SmartPlusCampaignCreateBody.prototype.budget_mode = undefined;

/**
 * @member {Boolean} budget_optimize_on
 */
SmartPlusCampaignCreateBody.prototype.budget_optimize_on = undefined;

/**
 * @member {String} campaign_app_profile_page_state
 */
SmartPlusCampaignCreateBody.prototype.campaign_app_profile_page_state = undefined;

/**
 * @member {String} campaign_name
 */
SmartPlusCampaignCreateBody.prototype.campaign_name = undefined;

/**
 * @member {String} campaign_type
 */
SmartPlusCampaignCreateBody.prototype.campaign_type = undefined;

/**
 * @member {Boolean} catalog_enabled
 */
SmartPlusCampaignCreateBody.prototype.catalog_enabled = undefined;

/**
 * @member {String} catalog_type
 */
SmartPlusCampaignCreateBody.prototype.catalog_type = undefined;

/**
 * @member {Boolean} disable_skan_campaign
 */
SmartPlusCampaignCreateBody.prototype.disable_skan_campaign = undefined;

/**
 * @member {Boolean} is_advanced_dedicated_campaign
 * @default true
 */
SmartPlusCampaignCreateBody.prototype.is_advanced_dedicated_campaign = true;

/**
 * @member {Boolean} is_promotional_campaign
 */
SmartPlusCampaignCreateBody.prototype.is_promotional_campaign = undefined;

/**
 * @member {String} objective_type
 */
SmartPlusCampaignCreateBody.prototype.objective_type = undefined;

/**
 * @member {String} open_api_partner
 */
SmartPlusCampaignCreateBody.prototype.open_api_partner = undefined;

/**
 * @member {String} operation_status
 */
SmartPlusCampaignCreateBody.prototype.operation_status = undefined;

/**
 * @member {String} po_number
 */
SmartPlusCampaignCreateBody.prototype.po_number = undefined;

/**
 * @member {String} postback_window_mode
 */
SmartPlusCampaignCreateBody.prototype.postback_window_mode = undefined;

/**
 * @member {String} request_id
 */
SmartPlusCampaignCreateBody.prototype.request_id = undefined;

/**
 * @member {String} sales_destination
 */
SmartPlusCampaignCreateBody.prototype.sales_destination = undefined;

/**
 * @member {Array.<String>} special_industries
 */
SmartPlusCampaignCreateBody.prototype.special_industries = undefined;

