/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringSmartPlusCampaignGet model module.
 * @module model/FilteringSmartPlusCampaignGet
 * @version 0.1.8
 */
export class FilteringSmartPlusCampaignGet {
  /**
   * Constructs a new <code>FilteringSmartPlusCampaignGet</code>.
   * @alias module:model/FilteringSmartPlusCampaignGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringSmartPlusCampaignGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringSmartPlusCampaignGet} obj Optional instance to populate.
   * @return {module:model/FilteringSmartPlusCampaignGet} The populated <code>FilteringSmartPlusCampaignGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringSmartPlusCampaignGet();
      if (data.hasOwnProperty('campaign_ids'))
        obj.campaign_ids = ApiClient.convertToType(data['campaign_ids'], ['String']);
      if (data.hasOwnProperty('campaign_name'))
        obj.campaign_name = ApiClient.convertToType(data['campaign_name'], 'String');
      if (data.hasOwnProperty('creation_filter_end_time'))
        obj.creation_filter_end_time = ApiClient.convertToType(data['creation_filter_end_time'], 'String');
      if (data.hasOwnProperty('creation_filter_start_time'))
        obj.creation_filter_start_time = ApiClient.convertToType(data['creation_filter_start_time'], 'String');
      if (data.hasOwnProperty('objective_type'))
        obj.objective_type = ApiClient.convertToType(data['objective_type'], 'String');
      if (data.hasOwnProperty('primary_status'))
        obj.primary_status = ApiClient.convertToType(data['primary_status'], 'String');
      if (data.hasOwnProperty('secondary_status'))
        obj.secondary_status = ApiClient.convertToType(data['secondary_status'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} campaign_ids
 */
FilteringSmartPlusCampaignGet.prototype.campaign_ids = undefined;

/**
 * @member {String} campaign_name
 */
FilteringSmartPlusCampaignGet.prototype.campaign_name = undefined;

/**
 * @member {String} creation_filter_end_time
 */
FilteringSmartPlusCampaignGet.prototype.creation_filter_end_time = undefined;

/**
 * @member {String} creation_filter_start_time
 */
FilteringSmartPlusCampaignGet.prototype.creation_filter_start_time = undefined;

/**
 * @member {String} objective_type
 */
FilteringSmartPlusCampaignGet.prototype.objective_type = undefined;

/**
 * @member {String} primary_status
 */
FilteringSmartPlusCampaignGet.prototype.primary_status = undefined;

/**
 * @member {String} secondary_status
 */
FilteringSmartPlusCampaignGet.prototype.secondary_status = undefined;

