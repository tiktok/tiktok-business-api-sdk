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
 * @version 0.1.2
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
      if (data.hasOwnProperty('campaign_ids'))
        obj.campaign_ids = ApiClient.convertToType(data['campaign_ids'], ['String']);
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
      if (data.hasOwnProperty('targeting_broaden_required'))
        obj.targeting_broaden_required = ApiClient.convertToType(data['targeting_broaden_required'], 'Boolean');
    }
    return obj;
  }
}

/**
 * Filter by campaign IDs. Allowable quantity- `1-100`.
 * @member {Array.<String>} campaign_ids
 */
FilteringCampaignGet.prototype.campaign_ids = undefined;

/**
 * Filter by higher range of campaign creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Campaigns created later than this time will be returned.Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected.
 * @member {String} creation_filter_end_time
 */
FilteringCampaignGet.prototype.creation_filter_end_time = undefined;

/**
 * Filter by lower range of campaign creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Campaigns created later than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected
 * @member {String} creation_filter_start_time
 */
FilteringCampaignGet.prototype.creation_filter_start_time = undefined;

/**
 * Filter by  advertising objectives, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {String} objective_type
 */
FilteringCampaignGet.prototype.objective_type = undefined;

/**
 * Primary status. For enum values, see [Enumeration-Primary Status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {String} primary_status
 */
FilteringCampaignGet.prototype.primary_status = undefined;

/**
 * Filter by campaign status（Secondary status).  For enum values, see [Enumeration- Campaign Status - Secondary Status]
 * @member {String} secondary_status
 */
FilteringCampaignGet.prototype.secondary_status = undefined;

/**
 * @member {Boolean} targeting_broaden_required
 */
FilteringCampaignGet.prototype.targeting_broaden_required = undefined;

