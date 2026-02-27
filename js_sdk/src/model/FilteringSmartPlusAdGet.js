/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringSmartPlusAdGet model module.
 * @module model/FilteringSmartPlusAdGet
 * @version 1.2.1
 */
export class FilteringSmartPlusAdGet {
  /**
   * Constructs a new <code>FilteringSmartPlusAdGet</code>.
   * @alias module:model/FilteringSmartPlusAdGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringSmartPlusAdGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringSmartPlusAdGet} obj Optional instance to populate.
   * @return {module:model/FilteringSmartPlusAdGet} The populated <code>FilteringSmartPlusAdGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringSmartPlusAdGet();
      if (data.hasOwnProperty('adgroup_ids'))
        obj.adgroup_ids = ApiClient.convertToType(data['adgroup_ids'], ['String']);
      if (data.hasOwnProperty('campaign_ids'))
        obj.campaign_ids = ApiClient.convertToType(data['campaign_ids'], ['String']);
      if (data.hasOwnProperty('creation_filter_end_time'))
        obj.creation_filter_end_time = ApiClient.convertToType(data['creation_filter_end_time'], 'String');
      if (data.hasOwnProperty('creation_filter_start_time'))
        obj.creation_filter_start_time = ApiClient.convertToType(data['creation_filter_start_time'], 'String');
      if (data.hasOwnProperty('modified_after'))
        obj.modified_after = ApiClient.convertToType(data['modified_after'], 'String');
      if (data.hasOwnProperty('objective_type'))
        obj.objective_type = ApiClient.convertToType(data['objective_type'], 'String');
      if (data.hasOwnProperty('optimization_goal'))
        obj.optimization_goal = ApiClient.convertToType(data['optimization_goal'], 'String');
      if (data.hasOwnProperty('primary_status'))
        obj.primary_status = ApiClient.convertToType(data['primary_status'], 'String');
      if (data.hasOwnProperty('secondary_status'))
        obj.secondary_status = ApiClient.convertToType(data['secondary_status'], 'String');
      if (data.hasOwnProperty('smart_plus_ad_ids'))
        obj.smart_plus_ad_ids = ApiClient.convertToType(data['smart_plus_ad_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} adgroup_ids
 */
FilteringSmartPlusAdGet.prototype.adgroup_ids = undefined;

/**
 * @member {Array.<String>} campaign_ids
 */
FilteringSmartPlusAdGet.prototype.campaign_ids = undefined;

/**
 * @member {String} creation_filter_end_time
 */
FilteringSmartPlusAdGet.prototype.creation_filter_end_time = undefined;

/**
 * @member {String} creation_filter_start_time
 */
FilteringSmartPlusAdGet.prototype.creation_filter_start_time = undefined;

/**
 * @member {String} modified_after
 */
FilteringSmartPlusAdGet.prototype.modified_after = undefined;

/**
 * @member {String} objective_type
 */
FilteringSmartPlusAdGet.prototype.objective_type = undefined;

/**
 * @member {String} optimization_goal
 */
FilteringSmartPlusAdGet.prototype.optimization_goal = undefined;

/**
 * @member {String} primary_status
 */
FilteringSmartPlusAdGet.prototype.primary_status = undefined;

/**
 * @member {String} secondary_status
 */
FilteringSmartPlusAdGet.prototype.secondary_status = undefined;

/**
 * @member {Array.<String>} smart_plus_ad_ids
 */
FilteringSmartPlusAdGet.prototype.smart_plus_ad_ids = undefined;

