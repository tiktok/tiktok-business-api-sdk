/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudienceapplyContextInfo} from './DmpcustomAudienceapplyContextInfo.js';

/**
 * The CustomAudienceApplyBody model module.
 * @module model/CustomAudienceApplyBody
 * @version 0.1.5
 */
export class CustomAudienceApplyBody {
  /**
   * Constructs a new <code>CustomAudienceApplyBody</code>.
   * @alias module:model/CustomAudienceApplyBody
   * @class
   * @param action_mode {String} Specific operation to be performed on the audience. Enum values: Apply, Disconnect.
   * @param adgroup_ids {Array.<String>} A list of ad group IDs. Note: adgroup_ids and custom_audience_id should be under the same advertiser account. Otherwise, an error will occur. Lookalike Audience cannot be used in Reach & Frequency ads. Otherwise, an error will occur. See below for more details. 1. If the custom_audience_id is a Lookalike Audience and the adgroup_ids are Reach & Frequency ad groups, an error will occur. 2. If the custom_audience_id is a Lookalike Audience with the REACH_FREQUENCY audience subtype, an error will occur.
   * @param advertiser_id {String} Advertiser ID.
   * @param custom_audience_id {String} Custom audience ID. You can only pass one custom audience ID.
   */
  constructor(action_mode, adgroup_ids, advertiser_id, custom_audience_id) {
    this.action_mode = action_mode;
    this.adgroup_ids = adgroup_ids;
    this.advertiser_id = advertiser_id;
    this.custom_audience_id = custom_audience_id;
  }

  /**
   * Constructs a <code>CustomAudienceApplyBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CustomAudienceApplyBody} obj Optional instance to populate.
   * @return {module:model/CustomAudienceApplyBody} The populated <code>CustomAudienceApplyBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CustomAudienceApplyBody();
      if (data.hasOwnProperty('action_mode'))
        obj.action_mode = ApiClient.convertToType(data['action_mode'], 'String');
      if (data.hasOwnProperty('adgroup_ids'))
        obj.adgroup_ids = ApiClient.convertToType(data['adgroup_ids'], ['String']);
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('context_info'))
        obj.context_info = DmpcustomAudienceapplyContextInfo.constructFromObject(data['context_info']);
      if (data.hasOwnProperty('custom_audience_id'))
        obj.custom_audience_id = ApiClient.convertToType(data['custom_audience_id'], 'String');
      if (data.hasOwnProperty('usage_mode'))
        obj.usage_mode = ApiClient.convertToType(data['usage_mode'], 'String');
    }
    return obj;
  }
}

/**
 * Specific operation to be performed on the audience. Enum values: Apply, Disconnect.
 * @member {String} action_mode
 */
CustomAudienceApplyBody.prototype.action_mode = undefined;

/**
 * A list of ad group IDs. Note: adgroup_ids and custom_audience_id should be under the same advertiser account. Otherwise, an error will occur. Lookalike Audience cannot be used in Reach & Frequency ads. Otherwise, an error will occur. See below for more details. 1. If the custom_audience_id is a Lookalike Audience and the adgroup_ids are Reach & Frequency ad groups, an error will occur. 2. If the custom_audience_id is a Lookalike Audience with the REACH_FREQUENCY audience subtype, an error will occur.
 * @member {Array.<String>} adgroup_ids
 */
CustomAudienceApplyBody.prototype.adgroup_ids = undefined;

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
CustomAudienceApplyBody.prototype.advertiser_id = undefined;

/**
 * @member {module:model/DmpcustomAudienceapplyContextInfo} context_info
 */
CustomAudienceApplyBody.prototype.context_info = undefined;

/**
 * Custom audience ID. You can only pass one custom audience ID.
 * @member {String} custom_audience_id
 */
CustomAudienceApplyBody.prototype.custom_audience_id = undefined;

/**
 * Whether to include this audience in or exclude it from your ad groups. Required when action_mode is Apply. Enum values: Include, Exclude.
 * @member {String} usage_mode
 */
CustomAudienceApplyBody.prototype.usage_mode = undefined;

