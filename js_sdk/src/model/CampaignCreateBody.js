/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CampaignCreateBody model module.
 * @module model/CampaignCreateBody
 * @version 1.2.1
 */
export class CampaignCreateBody {
  /**
   * Constructs a new <code>CampaignCreateBody</code>.
   * @alias module:model/CampaignCreateBody
   * @class
   * @param advertiser_id {String} 
   * @param campaign_name {String} 
   * @param objective_type {String} 
   */
  constructor(advertiser_id, campaign_name, objective_type) {
    this.advertiser_id = advertiser_id;
    this.campaign_name = campaign_name;
    this.objective_type = objective_type;
  }

  /**
   * Constructs a <code>CampaignCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaignCreateBody} obj Optional instance to populate.
   * @return {module:model/CampaignCreateBody} The populated <code>CampaignCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaignCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('app_promotion_type'))
        obj.app_promotion_type = ApiClient.convertToType(data['app_promotion_type'], 'String');
      if (data.hasOwnProperty('bid_type'))
        obj.bid_type = ApiClient.convertToType(data['bid_type'], 'String');
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
      if (data.hasOwnProperty('campaign_product_source'))
        obj.campaign_product_source = ApiClient.convertToType(data['campaign_product_source'], 'String');
      if (data.hasOwnProperty('campaign_type'))
        obj.campaign_type = ApiClient.convertToType(data['campaign_type'], 'String');
      if (data.hasOwnProperty('catalog_enabled'))
        obj.catalog_enabled = ApiClient.convertToType(data['catalog_enabled'], 'Boolean');
      if (data.hasOwnProperty('deep_bid_type'))
        obj.deep_bid_type = ApiClient.convertToType(data['deep_bid_type'], 'String');
      if (data.hasOwnProperty('disable_skan_campaign'))
        obj.disable_skan_campaign = ApiClient.convertToType(data['disable_skan_campaign'], 'Boolean');
      if (data.hasOwnProperty('internal_channel'))
        obj.internal_channel = ApiClient.convertToType(data['internal_channel'], 'String');
      if (data.hasOwnProperty('is_advanced_dedicated_campaign'))
        obj.is_advanced_dedicated_campaign = ApiClient.convertToType(data['is_advanced_dedicated_campaign'], 'Boolean');
      if (data.hasOwnProperty('is_search_campaign'))
        obj.is_search_campaign = ApiClient.convertToType(data['is_search_campaign'], 'Boolean');
      if (data.hasOwnProperty('objective_type'))
        obj.objective_type = ApiClient.convertToType(data['objective_type'], 'String');
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
      if (data.hasOwnProperty('optimization_goal'))
        obj.optimization_goal = ApiClient.convertToType(data['optimization_goal'], 'String');
      if (data.hasOwnProperty('plugin_partner'))
        obj.plugin_partner = ApiClient.convertToType(data['plugin_partner'], 'String');
      if (data.hasOwnProperty('po_number'))
        obj.po_number = ApiClient.convertToType(data['po_number'], 'String');
      if (data.hasOwnProperty('postback_window_mode'))
        obj.postback_window_mode = ApiClient.convertToType(data['postback_window_mode'], 'String');
      if (data.hasOwnProperty('request_id'))
        obj.request_id = ApiClient.convertToType(data['request_id'], 'String');
      if (data.hasOwnProperty('rf_campaign_type'))
        obj.rf_campaign_type = ApiClient.convertToType(data['rf_campaign_type'], 'String');
      if (data.hasOwnProperty('roas_bid'))
        obj.roas_bid = ApiClient.convertToType(data['roas_bid'], 'Number');
      if (data.hasOwnProperty('rta_bid_enabled'))
        obj.rta_bid_enabled = ApiClient.convertToType(data['rta_bid_enabled'], 'Boolean');
      if (data.hasOwnProperty('rta_id'))
        obj.rta_id = ApiClient.convertToType(data['rta_id'], 'String');
      if (data.hasOwnProperty('rta_product_selection_enabled'))
        obj.rta_product_selection_enabled = ApiClient.convertToType(data['rta_product_selection_enabled'], 'Boolean');
      if (data.hasOwnProperty('sales_destination'))
        obj.sales_destination = ApiClient.convertToType(data['sales_destination'], 'String');
      if (data.hasOwnProperty('special_industries'))
        obj.special_industries = ApiClient.convertToType(data['special_industries'], ['String']);
      if (data.hasOwnProperty('virtual_objective_type'))
        obj.virtual_objective_type = ApiClient.convertToType(data['virtual_objective_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
CampaignCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} app_id
 */
CampaignCreateBody.prototype.app_id = undefined;

/**
 * @member {String} app_promotion_type
 */
CampaignCreateBody.prototype.app_promotion_type = undefined;

/**
 * @member {String} bid_type
 */
CampaignCreateBody.prototype.bid_type = undefined;

/**
 * @member {Number} budget
 */
CampaignCreateBody.prototype.budget = undefined;

/**
 * @member {String} budget_mode
 */
CampaignCreateBody.prototype.budget_mode = undefined;

/**
 * @member {Boolean} budget_optimize_on
 * @default false
 */
CampaignCreateBody.prototype.budget_optimize_on = false;

/**
 * @member {String} campaign_app_profile_page_state
 */
CampaignCreateBody.prototype.campaign_app_profile_page_state = undefined;

/**
 * @member {String} campaign_name
 */
CampaignCreateBody.prototype.campaign_name = undefined;

/**
 * @member {String} campaign_product_source
 */
CampaignCreateBody.prototype.campaign_product_source = undefined;

/**
 * @member {String} campaign_type
 */
CampaignCreateBody.prototype.campaign_type = undefined;

/**
 * @member {Boolean} catalog_enabled
 */
CampaignCreateBody.prototype.catalog_enabled = undefined;

/**
 * @member {String} deep_bid_type
 */
CampaignCreateBody.prototype.deep_bid_type = undefined;

/**
 * @member {Boolean} disable_skan_campaign
 */
CampaignCreateBody.prototype.disable_skan_campaign = undefined;

/**
 * @member {String} internal_channel
 */
CampaignCreateBody.prototype.internal_channel = undefined;

/**
 * @member {Boolean} is_advanced_dedicated_campaign
 */
CampaignCreateBody.prototype.is_advanced_dedicated_campaign = undefined;

/**
 * @member {Boolean} is_search_campaign
 */
CampaignCreateBody.prototype.is_search_campaign = undefined;

/**
 * @member {String} objective_type
 */
CampaignCreateBody.prototype.objective_type = undefined;

/**
 * @member {String} operation_status
 * @default 'ENABLE'
 */
CampaignCreateBody.prototype.operation_status = 'ENABLE';

/**
 * @member {String} optimization_goal
 */
CampaignCreateBody.prototype.optimization_goal = undefined;

/**
 * @member {String} plugin_partner
 */
CampaignCreateBody.prototype.plugin_partner = undefined;

/**
 * @member {String} po_number
 */
CampaignCreateBody.prototype.po_number = undefined;

/**
 * @member {String} postback_window_mode
 */
CampaignCreateBody.prototype.postback_window_mode = undefined;

/**
 * @member {String} request_id
 */
CampaignCreateBody.prototype.request_id = undefined;

/**
 * @member {String} rf_campaign_type
 */
CampaignCreateBody.prototype.rf_campaign_type = undefined;

/**
 * @member {Number} roas_bid
 */
CampaignCreateBody.prototype.roas_bid = undefined;

/**
 * @member {Boolean} rta_bid_enabled
 * @default false
 */
CampaignCreateBody.prototype.rta_bid_enabled = false;

/**
 * @member {String} rta_id
 */
CampaignCreateBody.prototype.rta_id = undefined;

/**
 * @member {Boolean} rta_product_selection_enabled
 */
CampaignCreateBody.prototype.rta_product_selection_enabled = undefined;

/**
 * @member {String} sales_destination
 */
CampaignCreateBody.prototype.sales_destination = undefined;

/**
 * @member {Array.<String>} special_industries
 */
CampaignCreateBody.prototype.special_industries = undefined;

/**
 * @member {String} virtual_objective_type
 */
CampaignCreateBody.prototype.virtual_objective_type = undefined;

