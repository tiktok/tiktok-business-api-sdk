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
 * @version 0.1.7
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
      if (data.hasOwnProperty('adgroup_ids'))
        obj.adgroup_ids = ApiClient.convertToType(data['adgroup_ids'], ['String']);
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
 * A list of Ad ID，quantity- `1-100`
 * @member {Array.<String>} ad_ids
 */
FilteringAdGet.prototype.ad_ids = undefined;

/**
 * A list of Ad group ID, quantity- `1-100`
 * @member {Array.<String>} adgroup_ids
 */
FilteringAdGet.prototype.adgroup_ids = undefined;

/**
 * Billing events. For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {Array.<String>} billing_events
 */
FilteringAdGet.prototype.billing_events = undefined;

/**
 * A list of Campaign IDs, quantity- `1-100`
 * @member {Array.<String>} campaign_ids
 */
FilteringAdGet.prototype.campaign_ids = undefined;

/**
 * Filter by higher range of ad creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ads created earlier than this time will be returned.
 * @member {String} creation_filter_end_time
 */
FilteringAdGet.prototype.creation_filter_end_time = undefined;

/**
 * Filter by lower range of ad creation time, in the format of `YYYY-MM-DD HH:MM:SS` (UTC time zone). Ads created later than this time will be returned. Suggestion A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won't be affected.
 * @member {String} creation_filter_start_time
 */
FilteringAdGet.prototype.creation_filter_start_time = undefined;

/**
 * Advertising Objective. For enum values, see [Enumeration - Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). Note- Whether you choose `WEB_CONVERSIONS` or  `CONVERSIONS` as the objective filter, we will return data of both `WEB_CONVERSIONS` and  `CONVERSIONS`.
 * @member {String} objective_type
 */
FilteringAdGet.prototype.objective_type = undefined;

/**
 * Primary status. For enum values, see [Enumeration -Primary status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {String} primary_status
 */
FilteringAdGet.prototype.primary_status = undefined;

/**
 * Ad status（secondary status). For enum values, see [Enumeration - Ad Status - Secondary Status](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). his field is not returned in the sandbox environment because the ad is not actually delivered. [Supported secondary statuses for a primary status](https://ads.tiktok.com/marketing_api/docs?id=1757239620352002) to learn about the valid values you can pass in via `secondary_status` for the primary status you specify.
 * @member {String} secondary_status
 */
FilteringAdGet.prototype.secondary_status = undefined;

