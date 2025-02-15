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
 * @version 0.1.4
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
      if (data.hasOwnProperty('billing_events'))
        obj.billing_events = ApiClient.convertToType(data['billing_events'], ['String']);
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
    }
    return obj;
  }
}

/**
 * List of Ad group ID. Allowed number of IDs- `1-100`
 * @member {Array.<String>} adgroup_ids
 */
FilteringAdgroupGet.prototype.adgroup_ids = undefined;

/**
 * Ad group name.
 * @member {String} adgroup_name
 */
FilteringAdgroupGet.prototype.adgroup_name = undefined;

/**
 * Events that you want to pay for.  For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {Array.<String>} billing_events
 */
FilteringAdgroupGet.prototype.billing_events = undefined;

/**
 * List of campaign IDs. Allowed number of IDs- `1-100`
 * @member {Array.<String>} campaign_ids
 */
FilteringAdgroupGet.prototype.campaign_ids = undefined;

/**
 * Filter by higher range of ad group creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ad groups created earlier than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected.
 * @member {String} creation_filter_end_time
 */
FilteringAdgroupGet.prototype.creation_filter_end_time = undefined;

/**
 * Filter by lower range of ad group creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ad groups created later than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected.
 * @member {String} creation_filter_start_time
 */
FilteringAdgroupGet.prototype.creation_filter_start_time = undefined;

/**
 * Advertising objective. For details, see [Enumeration - Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). Whether you choose `WEB_CONVERSIONS` or  `CONVERSIONS` as the objective filter, we will return data of both `WEB_CONVERSIONS` and  `CONVERSIONS`.
 * @member {String} objective_type
 */
FilteringAdgroupGet.prototype.objective_type = undefined;

/**
 * Primary status. For enum values, see [Enumeration - Primary Status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). The default value is `STATUS_NOT_DELETE`, which returns ad groups in all status excluding `STATUS_DELETE`. If you want to get ad groups in all status including `STATUS_DELETE`, use `STATUS_ALL` instead.
 * @member {String} primary_status
 */
FilteringAdgroupGet.prototype.primary_status = undefined;

/**
 * Ad group status（secondary status). For enum values, see [Enumeration - Ad Group Status - Secondary Status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). his field is not returned in the sandbox environment because the ad group is not actually delivered. See [Supported secondary statuses for a primary status](https://ads.tiktok.com/marketing_api/docs?id=1757239620352002) to learn about the valid values you can pass in via `secondary_status` for the primary status you specify.
 * @member {String} secondary_status
 */
FilteringAdgroupGet.prototype.secondary_status = undefined;

