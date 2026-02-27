/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringAdGet model module.
 * @module model/FilteringAdGet
 * @version 1.2.1
 */
export class FilteringAdGet {
  /**
   * Constructs a new <code>FilteringAdGet</code>.
   * @alias module:model/FilteringAdGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringAdGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringAdGet} obj Optional instance to populate.
   * @return {module:model/FilteringAdGet} The populated <code>FilteringAdGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringAdGet();
      if (data.hasOwnProperty('ad_ids'))
        obj.ad_ids = ApiClient.convertToType(data['ad_ids'], ['String']);
      if (data.hasOwnProperty('ad_name'))
        obj.ad_name = ApiClient.convertToType(data['ad_name'], 'String');
      if (data.hasOwnProperty('adgroup_ids'))
        obj.adgroup_ids = ApiClient.convertToType(data['adgroup_ids'], ['String']);
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
      if (data.hasOwnProperty('destination'))
        obj.destination = ApiClient.convertToType(data['destination'], 'String');
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
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} ad_ids
 */
FilteringAdGet.prototype.ad_ids = undefined;

/**
 * @member {String} ad_name
 */
FilteringAdGet.prototype.ad_name = undefined;

/**
 * @member {Array.<String>} adgroup_ids
 */
FilteringAdGet.prototype.adgroup_ids = undefined;

/**
 * @member {Array.<String>} buying_types
 */
FilteringAdGet.prototype.buying_types = undefined;

/**
 * @member {Array.<String>} campaign_ids
 */
FilteringAdGet.prototype.campaign_ids = undefined;

/**
 * @member {Array.<String>} campaign_system_origins
 */
FilteringAdGet.prototype.campaign_system_origins = undefined;

/**
 * @member {String} creation_filter_end_time
 */
FilteringAdGet.prototype.creation_filter_end_time = undefined;

/**
 * @member {String} creation_filter_start_time
 */
FilteringAdGet.prototype.creation_filter_start_time = undefined;

/**
 * @member {String} creative_material_mode
 */
FilteringAdGet.prototype.creative_material_mode = undefined;

/**
 * @member {String} destination
 */
FilteringAdGet.prototype.destination = undefined;

/**
 * @member {String} modified_after
 */
FilteringAdGet.prototype.modified_after = undefined;

/**
 * @member {String} objective_type
 */
FilteringAdGet.prototype.objective_type = undefined;

/**
 * @member {String} optimization_goal
 */
FilteringAdGet.prototype.optimization_goal = undefined;

/**
 * @member {String} primary_status
 * @default 'STATUS_NOT_DELETE'
 */
FilteringAdGet.prototype.primary_status = 'STATUS_NOT_DELETE';

/**
 * @member {String} secondary_status
 */
FilteringAdGet.prototype.secondary_status = undefined;

