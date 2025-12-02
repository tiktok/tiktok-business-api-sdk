/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringSmartPlusAdgroupGet model module.
 * @module model/FilteringSmartPlusAdgroupGet
 * @version 0.1.9
 */
export class FilteringSmartPlusAdgroupGet {
  /**
   * Constructs a new <code>FilteringSmartPlusAdgroupGet</code>.
   * @alias module:model/FilteringSmartPlusAdgroupGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringSmartPlusAdgroupGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringSmartPlusAdgroupGet} obj Optional instance to populate.
   * @return {module:model/FilteringSmartPlusAdgroupGet} The populated <code>FilteringSmartPlusAdgroupGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringSmartPlusAdgroupGet();
      if (data.hasOwnProperty('adgroup_ids'))
        obj.adgroup_ids = ApiClient.convertToType(data['adgroup_ids'], ['String']);
      if (data.hasOwnProperty('adgroup_name'))
        obj.adgroup_name = ApiClient.convertToType(data['adgroup_name'], 'String');
      if (data.hasOwnProperty('campaign_ids'))
        obj.campaign_ids = ApiClient.convertToType(data['campaign_ids'], ['String']);
      if (data.hasOwnProperty('creation_filter_end_time'))
        obj.creation_filter_end_time = ApiClient.convertToType(data['creation_filter_end_time'], 'String');
      if (data.hasOwnProperty('creation_filter_start_time'))
        obj.creation_filter_start_time = ApiClient.convertToType(data['creation_filter_start_time'], 'String');
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
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} adgroup_ids
 */
FilteringSmartPlusAdgroupGet.prototype.adgroup_ids = undefined;

/**
 * @member {String} adgroup_name
 */
FilteringSmartPlusAdgroupGet.prototype.adgroup_name = undefined;

/**
 * @member {Array.<String>} campaign_ids
 */
FilteringSmartPlusAdgroupGet.prototype.campaign_ids = undefined;

/**
 * @member {String} creation_filter_end_time
 */
FilteringSmartPlusAdgroupGet.prototype.creation_filter_end_time = undefined;

/**
 * @member {String} creation_filter_start_time
 */
FilteringSmartPlusAdgroupGet.prototype.creation_filter_start_time = undefined;

/**
 * @member {String} objective_type
 */
FilteringSmartPlusAdgroupGet.prototype.objective_type = undefined;

/**
 * @member {String} optimization_goal
 */
FilteringSmartPlusAdgroupGet.prototype.optimization_goal = undefined;

/**
 * @member {String} primary_status
 */
FilteringSmartPlusAdgroupGet.prototype.primary_status = undefined;

/**
 * @member {String} promotion_type
 */
FilteringSmartPlusAdgroupGet.prototype.promotion_type = undefined;

/**
 * @member {String} secondary_status
 */
FilteringSmartPlusAdgroupGet.prototype.secondary_status = undefined;

