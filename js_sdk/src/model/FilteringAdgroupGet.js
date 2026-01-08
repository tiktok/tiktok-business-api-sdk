/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringAdgroupGet model module.
 * @module model/FilteringAdgroupGet
 * @version 0.1.9
 */
export class FilteringAdgroupGet {
  /**
   * Constructs a new <code>FilteringAdgroupGet</code>.
   * @alias module:model/FilteringAdgroupGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringAdgroupGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringAdgroupGet} obj Optional instance to populate.
   * @return {module:model/FilteringAdgroupGet} The populated <code>FilteringAdgroupGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringAdgroupGet();
      if (data.hasOwnProperty('adgroup_ids'))
        obj.adgroup_ids = ApiClient.convertToType(data['adgroup_ids'], ['String']);
      if (data.hasOwnProperty('adgroup_name'))
        obj.adgroup_name = ApiClient.convertToType(data['adgroup_name'], 'String');
      if (data.hasOwnProperty('bid_strategy'))
        obj.bid_strategy = ApiClient.convertToType(data['bid_strategy'], 'String');
      if (data.hasOwnProperty('billing_events'))
        obj.billing_events = ApiClient.convertToType(data['billing_events'], ['String']);
      if (data.hasOwnProperty('buying_types'))
        obj.buying_types = ApiClient.convertToType(data['buying_types'], ['String']);
      if (data.hasOwnProperty('campaign_ids'))
        obj.campaign_ids = ApiClient.convertToType(data['campaign_ids'], ['String']);
      if (data.hasOwnProperty('campaign_system_origins'))
        obj.campaign_system_origins = ApiClient.convertToType(data['campaign_system_origins'], ['String']);
      if (data.hasOwnProperty('creation_filter_end_time'))
        obj.creation_filter_end_time = ApiClient.convertToType(data['creation_filter_end_time'], 'String');
      if (data.hasOwnProperty('creation_filter_start_time'))
        obj.creation_filter_start_time = ApiClient.convertToType(data['creation_filter_start_time'], 'String');
      if (data.hasOwnProperty('creative_material_mode'))
        obj.creative_material_mode = ApiClient.convertToType(data['creative_material_mode'], 'String');
      if (data.hasOwnProperty('objective_type'))
        obj.objective_type = ApiClient.convertToType(data['objective_type'], 'String');
      if (data.hasOwnProperty('optimization_goal'))
        obj.optimization_goal = ApiClient.convertToType(data['optimization_goal'], 'String');
      if (data.hasOwnProperty('primary_status'))
        obj.primary_status = ApiClient.convertToType(data['primary_status'], 'String');
      if (data.hasOwnProperty('promotion_type'))
        obj.promotion_type = ApiClient.convertToType(data['promotion_type'], 'String');
      if (data.hasOwnProperty('secondary_status'))
        obj.secondary_status = ApiClient.convertToType(data['secondary_status'], 'String');
      if (data.hasOwnProperty('split_test_enabled'))
        obj.split_test_enabled = ApiClient.convertToType(data['split_test_enabled'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} adgroup_ids
 */
FilteringAdgroupGet.prototype.adgroup_ids = undefined;

/**
 * @member {String} adgroup_name
 */
FilteringAdgroupGet.prototype.adgroup_name = undefined;

/**
 * @member {String} bid_strategy
 */
FilteringAdgroupGet.prototype.bid_strategy = undefined;

/**
 * @member {Array.<String>} billing_events
 */
FilteringAdgroupGet.prototype.billing_events = undefined;

/**
 * @member {Array.<String>} buying_types
 */
FilteringAdgroupGet.prototype.buying_types = undefined;

/**
 * @member {Array.<String>} campaign_ids
 */
FilteringAdgroupGet.prototype.campaign_ids = undefined;

/**
 * @member {Array.<String>} campaign_system_origins
 */
FilteringAdgroupGet.prototype.campaign_system_origins = undefined;

/**
 * @member {String} creation_filter_end_time
 */
FilteringAdgroupGet.prototype.creation_filter_end_time = undefined;

/**
 * @member {String} creation_filter_start_time
 */
FilteringAdgroupGet.prototype.creation_filter_start_time = undefined;

/**
 * @member {String} creative_material_mode
 */
FilteringAdgroupGet.prototype.creative_material_mode = undefined;

/**
 * @member {String} objective_type
 */
FilteringAdgroupGet.prototype.objective_type = undefined;

/**
 * @member {String} optimization_goal
 */
FilteringAdgroupGet.prototype.optimization_goal = undefined;

/**
 * @member {String} primary_status
 * @default 'STATUS_NOT_DELETE'
 */
FilteringAdgroupGet.prototype.primary_status = 'STATUS_NOT_DELETE';

/**
 * @member {String} promotion_type
 */
FilteringAdgroupGet.prototype.promotion_type = undefined;

/**
 * @member {String} secondary_status
 */
FilteringAdgroupGet.prototype.secondary_status = undefined;

/**
 * @member {Boolean} split_test_enabled
 */
FilteringAdgroupGet.prototype.split_test_enabled = undefined;

