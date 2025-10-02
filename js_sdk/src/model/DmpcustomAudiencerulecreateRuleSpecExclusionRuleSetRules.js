/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet} from './DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet.js';

/**
 * The DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules model module.
 * @module model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules
 * @version 0.1.8
 */
export class DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules {
  /**
   * Constructs a new <code>DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules</code>.
   * @alias module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules
   * @class
   * @param retention_days {Number} Required when exclusion_rule_set is passed. Audience lookback window. For enum values, see Enumerations - Lookback window. Note: If audience_type = BUSINESS_ACCOUNT, and the value in the filters object is not BUSINESS ACCOUNT PROFILE FOLLOW, then retention_days must be 7, 14, or 30. If audience_type = ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO, then retention_days must be 7, 14, or 30. To avoid confusion between retention_days and retention_in_days, we'll rename retention_days in the next API version.
   */
  constructor(retention_days) {
    this.retention_days = retention_days;
  }

  /**
   * Constructs a <code>DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules} obj Optional instance to populate.
   * @return {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules} The populated <code>DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules();
      if (data.hasOwnProperty('event_source_ids'))
        obj.event_source_ids = ApiClient.convertToType(data['event_source_ids'], ['String']);
      if (data.hasOwnProperty('filter_set'))
        obj.filter_set = DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet.constructFromObject(data['filter_set']);
      if (data.hasOwnProperty('retention_days'))
        obj.retention_days = ApiClient.convertToType(data['retention_days'], 'Number');
    }
    return obj;
  }
}

/**
 * List of event source IDs of the rule. For an Engagement Audience, use ad group IDs as event source IDs. If not specified, all available event source IDs will be used. For an Organic Engagement Audience, use TikTok post IDs as event source IDs. You can use /identity/video/get/ to get TikTok post IDs. The maximum allowed number of TikTok post IDs is 10. For a Live Engagement Audience, use live video ID as event source IDs. You can use /identity/live/get/ to get live video IDs. The maximum allowed number of live video IDs is 10. For an App Activity Audience, use App IDs as event source IDs. For a Website Traffic Audience, use pixel IDs as event source IDs. For a Lead Generation Audience, do not pass in this field. Otherwise, an error will occur. If not specified, all available event source IDs will be used. For a Business Account Audience, use core user IDs of the advertisers. You can use /user/info/ to get a core user ID. For a Shop Activity Audience, use TikTok Shop IDs as event source IDs. You can use /store/list/ to get TikTok Shop IDs. For an Offline Activity Audience, use Offline Event set IDs as event source IDs. You can use /offline/get/ to get Offline Event set IDs.
 * @member {Array.<String>} event_source_ids
 */
DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules.prototype.event_source_ids = undefined;

/**
 * @member {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet} filter_set
 */
DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules.prototype.filter_set = undefined;

/**
 * Required when exclusion_rule_set is passed. Audience lookback window. For enum values, see Enumerations - Lookback window. Note: If audience_type = BUSINESS_ACCOUNT, and the value in the filters object is not BUSINESS ACCOUNT PROFILE FOLLOW, then retention_days must be 7, 14, or 30. If audience_type = ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO, then retention_days must be 7, 14, or 30. To avoid confusion between retention_days and retention_in_days, we'll rename retention_days in the next API version.
 * @member {Number} retention_days
 */
DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules.prototype.retention_days = undefined;

