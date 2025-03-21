/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudiencerulecreateRuleSpec} from './DmpcustomAudiencerulecreateRuleSpec.js';

/**
 * The RuleCreateBody model module.
 * @module model/RuleCreateBody
 * @version 0.1.5
 */
export class RuleCreateBody {
  /**
   * Constructs a new <code>RuleCreateBody</code>.
   * @alias module:model/RuleCreateBody
   * @class
   * @param advertiser_id {String} Advertiser ID.
   * @param audience_type {String} Audience type. Enum values: ENGAGEMENT: Engagement Audience (with asset type as ad groups). ENGAGEMENT_ORGANIC_VIDEO: Organic Engagement Audience (with asset type as public video). ENGAGEMENT_LIVE_VIDEO: Live Engagement Audience (with asset type as live video). APP: App Activity Audience. PIXEL: Website Traffic Audience. LEAD_GENERATION: Lead Generation Audience. BUSINESS_ACCOUNT: Business Account Audience. TIKTOK_SHOP: Shop Activity Audience. OFFLINE: Offline Activity Audience.
   * @param custom_audience_name {String} Audience name. Length limit: 128 characters.
   * @param rule_spec {module:model/DmpcustomAudiencerulecreateRuleSpec} 
   */
  constructor(advertiser_id, audience_type, custom_audience_name, rule_spec) {
    this.advertiser_id = advertiser_id;
    this.audience_type = audience_type;
    this.custom_audience_name = custom_audience_name;
    this.rule_spec = rule_spec;
  }

  /**
   * Constructs a <code>RuleCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RuleCreateBody} obj Optional instance to populate.
   * @return {module:model/RuleCreateBody} The populated <code>RuleCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new RuleCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('audience_sub_type'))
        obj.audience_sub_type = ApiClient.convertToType(data['audience_sub_type'], 'String');
      if (data.hasOwnProperty('audience_type'))
        obj.audience_type = ApiClient.convertToType(data['audience_type'], 'String');
      if (data.hasOwnProperty('custom_audience_name'))
        obj.custom_audience_name = ApiClient.convertToType(data['custom_audience_name'], 'String');
      if (data.hasOwnProperty('identity_authorized_bc_id'))
        obj.identity_authorized_bc_id = ApiClient.convertToType(data['identity_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('is_auto_refresh'))
        obj.is_auto_refresh = ApiClient.convertToType(data['is_auto_refresh'], 'Boolean');
      if (data.hasOwnProperty('retention_in_days'))
        obj.retention_in_days = ApiClient.convertToType(data['retention_in_days'], 'Number');
      if (data.hasOwnProperty('rule_spec'))
        obj.rule_spec = DmpcustomAudiencerulecreateRuleSpec.constructFromObject(data['rule_spec']);
    }
    return obj;
  }
}

/**
 * Advertiser ID.
 * @member {String} advertiser_id
 */
RuleCreateBody.prototype.advertiser_id = undefined;

/**
 * Audience sub type, indicating the type of ads that the audience can be used. Enum values: NORMAL: Audience for non-Reach & Frequency ads. REACH_FREQUENCY: Audience for Reach & Frequency ads. It can only be used in Reach & Frequency ads. Default value: NORMAL.
 * @member {String} audience_sub_type
 */
RuleCreateBody.prototype.audience_sub_type = undefined;

/**
 * Audience type. Enum values: ENGAGEMENT: Engagement Audience (with asset type as ad groups). ENGAGEMENT_ORGANIC_VIDEO: Organic Engagement Audience (with asset type as public video). ENGAGEMENT_LIVE_VIDEO: Live Engagement Audience (with asset type as live video). APP: App Activity Audience. PIXEL: Website Traffic Audience. LEAD_GENERATION: Lead Generation Audience. BUSINESS_ACCOUNT: Business Account Audience. TIKTOK_SHOP: Shop Activity Audience. OFFLINE: Offline Activity Audience.
 * @member {String} audience_type
 */
RuleCreateBody.prototype.audience_type = undefined;

/**
 * Audience name. Length limit: 128 characters.
 * @member {String} custom_audience_name
 */
RuleCreateBody.prototype.custom_audience_name = undefined;

/**
 * Required when identity_type is BC_AUTH_TT. ID of the Business Center that a TikTok Account User in Business Center identity is associated with.
 * @member {String} identity_authorized_bc_id
 */
RuleCreateBody.prototype.identity_authorized_bc_id = undefined;

/**
 * Required when audience_type is ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO. Identity ID.
 * @member {String} identity_id
 */
RuleCreateBody.prototype.identity_id = undefined;

/**
 * Required when audience_type is ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO. Identity type. Enum values: TT_USER, BC_AUTH_TT
 * @member {String} identity_type
 */
RuleCreateBody.prototype.identity_type = undefined;

/**
 * Whether to turn on the audience auto-refresh function. Supported values: true, false. Default value: true. If you enable this feature, your audience will automatically refresh to include the latest user data according to the lookback window you set. If you disable this feature, your audience will not automatically refresh.
 * @member {Boolean} is_auto_refresh
 */
RuleCreateBody.prototype.is_auto_refresh = undefined;

/**
 * Number of days to retain the audience. Value range: 1-365. Note: If this field is passed, the expiration date will be the specified number of retention days from the date when the audience was created. Any operations to the audience CANNOT reset the expiration date. If this field is not passed, the expiration date will be 365 days from the last time the audience was applied to an active ad group or modified. Applying the audience to an active ad group or modifying the audience will reset the expiration date. To learn about the actions that will reset the expiration date, refer to the Help Center article Audience Expiration Policy.
 * @member {Number} retention_in_days
 */
RuleCreateBody.prototype.retention_in_days = undefined;

/**
 * @member {module:model/DmpcustomAudiencerulecreateRuleSpec} rule_spec
 */
RuleCreateBody.prototype.rule_spec = undefined;

