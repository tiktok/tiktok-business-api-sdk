/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CampaignCreateBody model module.
 * @module model/CampaignCreateBody
 * @version 0.1.1
 */
export class CampaignCreateBody {
  /**
   * Constructs a new <code>CampaignCreateBody</code>.
   * @alias module:model/CampaignCreateBody
   * @class
   * @param advertiser_id {String} Advertiser ID
   * @param campaign_name {String} Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
   * @param objective_type {String} Advertising objective. For enum values and descriptions, see Objectives.
   */
  constructor(advertiser_id, campaign_name, objective_type) {
    this.advertiser_id = advertiser_id;
    this.campaign_name = campaign_name;
    this.objective_type = objective_type;
  }

  /**
   * Constructs a <code>CampaignCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaignCreateBody} obj Optional instance to populate.
   * @return {module:model/CampaignCreateBody} The populated <code>CampaignCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaignCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('app_promotion_type'))
        obj.app_promotion_type = ApiClient.convertToType(data['app_promotion_type'], 'String');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('budget_mode'))
        obj.budget_mode = ApiClient.convertToType(data['budget_mode'], 'String');
      if (data.hasOwnProperty('budget_optimize_on'))
        obj.budget_optimize_on = ApiClient.convertToType(data['budget_optimize_on'], 'Boolean');
      if (data.hasOwnProperty('campaign_name'))
        obj.campaign_name = ApiClient.convertToType(data['campaign_name'], 'String');
      if (data.hasOwnProperty('campaign_type'))
        obj.campaign_type = ApiClient.convertToType(data['campaign_type'], 'String');
      if (data.hasOwnProperty('objective_type'))
        obj.objective_type = ApiClient.convertToType(data['objective_type'], 'String');
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
      if (data.hasOwnProperty('optimization_goal'))
        obj.optimization_goal = ApiClient.convertToType(data['optimization_goal'], 'String');
      if (data.hasOwnProperty('rf_campaign_type'))
        obj.rf_campaign_type = ApiClient.convertToType(data['rf_campaign_type'], 'String');
      if (data.hasOwnProperty('special_industries'))
        obj.special_industries = ApiClient.convertToType(data['special_industries'], ['String']);
    }
    return obj;
  }
}

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
CampaignCreateBody.prototype.advertiser_id = undefined;

/**
 * App ID, required when the campaign is an iOS 14 Dedicated Campaign (camapign_type=IOS14_CAMPAIGN) with the advertising objective (objective_type) as PRODUCT_SALES.
 * @member {String} app_id
 */
CampaignCreateBody.prototype.app_id = undefined;

/**
 * App promotion type. Required when `objective_type` is `APP_PROMOTION`. Enum values- `APP_INSTALL`, `APP_RETARGETING`. Note- `APP_INSTALL` can be used in an iOS14 Dedicated Campaign, while `APP_RETARGETING` cannot be used.
 * @member {String} app_promotion_type
 */
CampaignCreateBody.prototype.app_promotion_type = undefined;

/**
 * Campaign budget, required when budget_mode is BUDGET_MODE_DAY or BUDGET_MODE_TOTAL. To learn about the mininum budget and how to set budget types, see Budget settings.
 * @member {Number} budget
 */
CampaignCreateBody.prototype.budget = undefined;

/**
 * Budget mode. When Campaign Budget Optimization is enabled, only BUDGET_MODE_DAY is supported. When \"objective_type\" is RF_REACH, only BUDGET_MODE_INFINITE is supported. To learn about how to set budget types, see Budget setting.
 * @member {String} budget_mode
 */
CampaignCreateBody.prototype.budget_mode = undefined;

/**
 * Whether to enable Campaign Budget Optimization. True: Enabled. False: Not enabled. Default: True. For details about Campaign Budget Optimization (CBO), see Campaign Budget Optimization.
 * @member {Boolean} budget_optimize_on
 */
CampaignCreateBody.prototype.budget_optimize_on = undefined;

/**
 * Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
 * @member {String} campaign_name
 */
CampaignCreateBody.prototype.campaign_name = undefined;

/**
 * Enums values: REGULAR_CAMPAIGN, IOS14_CAMPAIGN. The value IOS14_CAMPAIGN supports the advertising objective PRODUCT_SALES only. For iOS 14 Dedicated Campaign with objectives other than PRODUCT_SALES , set campaign_type as REGULAR_CAMPAIGN.
 * @member {String} campaign_type
 */
CampaignCreateBody.prototype.campaign_type = undefined;

/**
 * Advertising objective. For enum values and descriptions, see Objectives.
 * @member {String} objective_type
 */
CampaignCreateBody.prototype.objective_type = undefined;

/**
 * The field operation_status is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative. If you pass in this field without applying for allowlisting first, the field will be ignored and no error message will appear. For Reach & Frequency campaigns, please specify operation_status as ENABLE or do not pass in operation_status. Do not specify operation_status as DISABLE.  The status of the campaign when created. Enum values: ENABLE : The campaign is enabled when created. DISABLE : The campaign is disabled when created. Default value: ENABLE. If you want to update the status of the campaign after creation, use the /campaign/status/update/ endpoint.
 * @member {String} operation_status
 */
CampaignCreateBody.prototype.operation_status = undefined;

/**
 * Optimization goal at the campaign level. Required when Campaign Budget Optimization is enabled. Allowed values: CONVERT, INSTALL, VALUE, IN_APP_EVENT and LEAD_GENERATION.
 * @member {String} optimization_goal
 */
CampaignCreateBody.prototype.optimization_goal = undefined;

/**
 * When `objective_type` is specified as `RF_REACH`, use this field to set the campaign as a TikTok Pulse campaign, then you can get available premium contextual tags. Do not pass in this field when `objective_type` is not specified as `RF_REACH`.Enum values- `STANDARD` (Reach & Frequency campaign), `PULSE`(TikTok Pulse campaign). Note<- This is an allowlist-only feature. If you would like to access it, please contact your TikTok representative. This field cannot be updated after creation. If you select `rf_campaign_type` to `PULSE` , then you must enter contextual tags of `PREMIUM` type in the `contextual_tag_ids`  field in [/adgroup/rf/create/](https://ads.tiktok.com/marketing_api/docs?id=1738235338194945). In this case, the CPM in your ad group is fixed. If you set `rf_campaign_type` to `PULSE`, then the targeting locations cannot be updated in  [/adgroup/rf/update/](https://ads.tiktok.com/marketing_api/docs?id=1738235402874882). If you set `rf_campaign_type` to `PULSE`, then `feed_type` cannot be `TOP_FEED` in  [/adgroup/rf/create/](https://ads.tiktok.com/marketing_api/docs?id=1738235338194945).
 * @member {String} rf_campaign_type
 */
CampaignCreateBody.prototype.rf_campaign_type = undefined;

/**
 * Ad categories. Enum values: HOUSING(Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities.) EMPLOYMENT(Ads for job offers, internship, professional certification programs or other related opportunities.) CREDIT(Ads for credit card offers, auto loans, long-term financing or other related opportunities.) Note: Once you've specified the industry type, the system will adjust your ad group target options to help you comply with advertising policies. See Ad targeting to know more.
 * @member {Array.<String>} special_industries
 */
CampaignCreateBody.prototype.special_industries = undefined;

