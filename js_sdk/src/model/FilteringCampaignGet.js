/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringCampaignGet model module.
 * @module model/FilteringCampaignGet
 * @version 0.1.9
 */
export class FilteringCampaignGet {
  /**
   * Constructs a new <code>FilteringCampaignGet</code>.
   * @alias module:model/FilteringCampaignGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringCampaignGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringCampaignGet} obj Optional instance to populate.
   * @return {module:model/FilteringCampaignGet} The populated <code>FilteringCampaignGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringCampaignGet();
      if (data.hasOwnProperty('buying_types'))
        obj.buying_types = ApiClient.convertToType(data['buying_types'], ['String']);
      if (data.hasOwnProperty('campaign_ids'))
        obj.campaign_ids = ApiClient.convertToType(data['campaign_ids'], ['String']);
      if (data.hasOwnProperty('campaign_name'))
        obj.campaign_name = ApiClient.convertToType(data['campaign_name'], 'String');
      if (data.hasOwnProperty('campaign_product_source'))
        obj.campaign_product_source = ApiClient.convertToType(data['campaign_product_source'], 'String');
      if (data.hasOwnProperty('campaign_system_origins'))
        obj.campaign_system_origins = ApiClient.convertToType(data['campaign_system_origins'], ['String']);
      if (data.hasOwnProperty('campaign_type'))
        obj.campaign_type = ApiClient.convertToType(data['campaign_type'], 'String');
      if (data.hasOwnProperty('creation_filter_end_time'))
        obj.creation_filter_end_time = ApiClient.convertToType(data['creation_filter_end_time'], 'String');
      if (data.hasOwnProperty('creation_filter_start_time'))
        obj.creation_filter_start_time = ApiClient.convertToType(data['creation_filter_start_time'], 'String');
      if (data.hasOwnProperty('creative_campaign_type'))
        obj.creative_campaign_type = ApiClient.convertToType(data['creative_campaign_type'], ['String']);
      if (data.hasOwnProperty('is_smart_performance_campaign'))
        obj.is_smart_performance_campaign = ApiClient.convertToType(data['is_smart_performance_campaign'], 'Boolean');
      if (data.hasOwnProperty('objective_type'))
        obj.objective_type = ApiClient.convertToType(data['objective_type'], 'String');
      if (data.hasOwnProperty('optimization_goal'))
        obj.optimization_goal = ApiClient.convertToType(data['optimization_goal'], 'String');
      if (data.hasOwnProperty('primary_status'))
        obj.primary_status = ApiClient.convertToType(data['primary_status'], 'String');
      if (data.hasOwnProperty('sales_destination'))
        obj.sales_destination = ApiClient.convertToType(data['sales_destination'], 'String');
      if (data.hasOwnProperty('secondary_status'))
        obj.secondary_status = ApiClient.convertToType(data['secondary_status'], 'String');
      if (data.hasOwnProperty('split_test_enabled'))
        obj.split_test_enabled = ApiClient.convertToType(data['split_test_enabled'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} buying_types
 */
FilteringCampaignGet.prototype.buying_types = undefined;

/**
 * @member {Array.<String>} campaign_ids
 */
FilteringCampaignGet.prototype.campaign_ids = undefined;

/**
 * @member {String} campaign_name
 */
FilteringCampaignGet.prototype.campaign_name = undefined;

/**
 * @member {String} campaign_product_source
 */
FilteringCampaignGet.prototype.campaign_product_source = undefined;

/**
 * @member {Array.<String>} campaign_system_origins
 */
FilteringCampaignGet.prototype.campaign_system_origins = undefined;

/**
 * @member {String} campaign_type
 */
FilteringCampaignGet.prototype.campaign_type = undefined;

/**
 * @member {String} creation_filter_end_time
 */
FilteringCampaignGet.prototype.creation_filter_end_time = undefined;

/**
 * @member {String} creation_filter_start_time
 */
FilteringCampaignGet.prototype.creation_filter_start_time = undefined;

/**
 * @member {Array.<String>} creative_campaign_type
 */
FilteringCampaignGet.prototype.creative_campaign_type = undefined;

/**
 * @member {Boolean} is_smart_performance_campaign
 */
FilteringCampaignGet.prototype.is_smart_performance_campaign = undefined;

/**
 * @member {String} objective_type
 */
FilteringCampaignGet.prototype.objective_type = undefined;

/**
 * @member {String} optimization_goal
 */
FilteringCampaignGet.prototype.optimization_goal = undefined;

/**
 * @member {String} primary_status
 */
FilteringCampaignGet.prototype.primary_status = undefined;

/**
 * @member {String} sales_destination
 */
FilteringCampaignGet.prototype.sales_destination = undefined;

/**
 * @member {String} secondary_status
 */
FilteringCampaignGet.prototype.secondary_status = undefined;

/**
 * @member {Boolean} split_test_enabled
 */
FilteringCampaignGet.prototype.split_test_enabled = undefined;

