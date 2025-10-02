/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdgroupcreateActions} from './AdgroupcreateActions.js';
import {AdgroupcreateAudienceRule} from './AdgroupcreateAudienceRule.js';
import {AdgroupcreateExcludedCustomActions} from './AdgroupcreateExcludedCustomActions.js';
import {AdgroupcreateIncludedCustomActions} from './AdgroupcreateIncludedCustomActions.js';
import {AdgroupcreateTargetingExpansion} from './AdgroupcreateTargetingExpansion.js';

/**
 * The AdgroupCreateBody model module.
 * @module model/AdgroupCreateBody
 * @version 0.1.8
 */
export class AdgroupCreateBody {
  /**
   * Constructs a new <code>AdgroupCreateBody</code>.
   * @alias module:model/AdgroupCreateBody
   * @class
   * @param adgroup_name {String} Ad group name. Character limit is 512 and cannot contain emoji.
   * @param advertiser_id {String} Advertiser ID
   * @param billing_event {String} Events that you want to pay for. For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).|
   * @param campaign_id {String} The Ad group's campaign ID.
   * @param location_ids {Array.<String>} IDs of the locations that you want to target. To get the available locations and corresponding IDs based on your placement and objective, use the [/tool/region/](https://ads.tiktok.com/marketing_api/docs?id=1737189539571713) endpoint. To get the list of location IDs, see [Location IDs](https://ads.tiktok.com/marketing_api/docs?id=1739311040498689).
   * @param schedule_start_time {String} Schedule start time (UTC+0), in the format of \"YYYY-MM-DD HH-MM-SS\". The start time can be up to 12 hours earlier than the current time.
   * @param schedule_type {String} The schedule type can be either `SCHEDULE_START_END` or `SCHEDULE_FROM_NOW`. If you choose `SCHEDULE_START_END`, you need to specify a start time and an end time. If you choose `SCHEDULE_FROM_NOW`, you only need to specify a start time and the end time will be automatically set to 10 years later than the start time. If `budget_mode` is `BUDGET_MODE_TOTAL`, this field must be set to `SCHEDULE_START_END`.
   */
  constructor(adgroup_name, advertiser_id, billing_event, campaign_id, location_ids, schedule_start_time, schedule_type) {
    this.adgroup_name = adgroup_name;
    this.advertiser_id = advertiser_id;
    this.billing_event = billing_event;
    this.campaign_id = campaign_id;
    this.location_ids = location_ids;
    this.schedule_start_time = schedule_start_time;
    this.schedule_type = schedule_type;
  }

  /**
   * Constructs a <code>AdgroupCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupCreateBody} obj Optional instance to populate.
   * @return {module:model/AdgroupCreateBody} The populated <code>AdgroupCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupCreateBody();
      if (data.hasOwnProperty('actions'))
        obj.actions = ApiClient.convertToType(data['actions'], [AdgroupcreateActions]);
      if (data.hasOwnProperty('adgroup_app_profile_page_state'))
        obj.adgroup_app_profile_page_state = ApiClient.convertToType(data['adgroup_app_profile_page_state'], 'String');
      if (data.hasOwnProperty('adgroup_name'))
        obj.adgroup_name = ApiClient.convertToType(data['adgroup_name'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('age_groups'))
        obj.age_groups = ApiClient.convertToType(data['age_groups'], ['String']);
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('audience_ids'))
        obj.audience_ids = ApiClient.convertToType(data['audience_ids'], ['String']);
      if (data.hasOwnProperty('audience_rule'))
        obj.audience_rule = AdgroupcreateAudienceRule.constructFromObject(data['audience_rule']);
      if (data.hasOwnProperty('audience_type'))
        obj.audience_type = ApiClient.convertToType(data['audience_type'], 'String');
      if (data.hasOwnProperty('auto_targeting_enabled'))
        obj.auto_targeting_enabled = ApiClient.convertToType(data['auto_targeting_enabled'], 'String');
      if (data.hasOwnProperty('bid_display_mode'))
        obj.bid_display_mode = ApiClient.convertToType(data['bid_display_mode'], 'String');
      if (data.hasOwnProperty('bid_price'))
        obj.bid_price = ApiClient.convertToType(data['bid_price'], 'Number');
      if (data.hasOwnProperty('bid_type'))
        obj.bid_type = ApiClient.convertToType(data['bid_type'], 'String');
      if (data.hasOwnProperty('billing_event'))
        obj.billing_event = ApiClient.convertToType(data['billing_event'], 'String');
      if (data.hasOwnProperty('blocked_pangle_app_ids'))
        obj.blocked_pangle_app_ids = ApiClient.convertToType(data['blocked_pangle_app_ids'], ['String']);
      if (data.hasOwnProperty('brand_safety_partner'))
        obj.brand_safety_partner = ApiClient.convertToType(data['brand_safety_partner'], 'String');
      if (data.hasOwnProperty('brand_safety_type'))
        obj.brand_safety_type = ApiClient.convertToType(data['brand_safety_type'], 'String');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('budget_mode'))
        obj.budget_mode = ApiClient.convertToType(data['budget_mode'], 'String');
      if (data.hasOwnProperty('budget_optmize_on'))
        obj.budget_optmize_on = ApiClient.convertToType(data['budget_optmize_on'], 'Boolean');
      if (data.hasOwnProperty('campaign_id'))
        obj.campaign_id = ApiClient.convertToType(data['campaign_id'], 'String');
      if (data.hasOwnProperty('carrier_ids'))
        obj.carrier_ids = ApiClient.convertToType(data['carrier_ids'], ['String']);
      if (data.hasOwnProperty('catalog_authorized_bc_id'))
        obj.catalog_authorized_bc_id = ApiClient.convertToType(data['catalog_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('comment_disabled'))
        obj.comment_disabled = ApiClient.convertToType(data['comment_disabled'], 'String');
      if (data.hasOwnProperty('contextual_tag_ids'))
        obj.contextual_tag_ids = ApiClient.convertToType(data['contextual_tag_ids'], ['String']);
      if (data.hasOwnProperty('conversion_bid_price'))
        obj.conversion_bid_price = ApiClient.convertToType(data['conversion_bid_price'], 'Number');
      if (data.hasOwnProperty('conversion_id'))
        obj.conversion_id = ApiClient.convertToType(data['conversion_id'], 'String');
      if (data.hasOwnProperty('creative_material_mode'))
        obj.creative_material_mode = ApiClient.convertToType(data['creative_material_mode'], 'String');
      if (data.hasOwnProperty('dayparting'))
        obj.dayparting = ApiClient.convertToType(data['dayparting'], 'String');
      if (data.hasOwnProperty('deep_bid_type'))
        obj.deep_bid_type = ApiClient.convertToType(data['deep_bid_type'], 'String');
      if (data.hasOwnProperty('deep_cpa_bid'))
        obj.deep_cpa_bid = ApiClient.convertToType(data['deep_cpa_bid'], 'Number');
      if (data.hasOwnProperty('device_model_ids'))
        obj.device_model_ids = ApiClient.convertToType(data['device_model_ids'], ['String']);
      if (data.hasOwnProperty('device_price_ranges'))
        obj.device_price_ranges = ApiClient.convertToType(data['device_price_ranges'], ['Number']);
      if (data.hasOwnProperty('excluded_audience_ids'))
        obj.excluded_audience_ids = ApiClient.convertToType(data['excluded_audience_ids'], ['String']);
      if (data.hasOwnProperty('excluded_custom_actions'))
        obj.excluded_custom_actions = AdgroupcreateExcludedCustomActions.constructFromObject(data['excluded_custom_actions']);
      if (data.hasOwnProperty('excluded_pangle_audience_package_ids'))
        obj.excluded_pangle_audience_package_ids = ApiClient.convertToType(data['excluded_pangle_audience_package_ids'], ['String']);
      if (data.hasOwnProperty('frequency'))
        obj.frequency = ApiClient.convertToType(data['frequency'], 'Number');
      if (data.hasOwnProperty('frequency_schedule'))
        obj.frequency_schedule = ApiClient.convertToType(data['frequency_schedule'], 'Number');
      if (data.hasOwnProperty('gender'))
        obj.gender = ApiClient.convertToType(data['gender'], 'String');
      if (data.hasOwnProperty('household_income'))
        obj.household_income = ApiClient.convertToType(data['household_income'], ['String']);
      if (data.hasOwnProperty('identity_authorized_bc_id'))
        obj.identity_authorized_bc_id = ApiClient.convertToType(data['identity_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('included_custom_actions'))
        obj.included_custom_actions = AdgroupcreateIncludedCustomActions.constructFromObject(data['included_custom_actions']);
      if (data.hasOwnProperty('included_pangle_audience_package_ids'))
        obj.included_pangle_audience_package_ids = ApiClient.convertToType(data['included_pangle_audience_package_ids'], ['String']);
      if (data.hasOwnProperty('interest_category_ids'))
        obj.interest_category_ids = ApiClient.convertToType(data['interest_category_ids'], ['String']);
      if (data.hasOwnProperty('interest_keyword_ids'))
        obj.interest_keyword_ids = ApiClient.convertToType(data['interest_keyword_ids'], ['String']);
      if (data.hasOwnProperty('interest_keywords'))
        obj.interest_keywords = ApiClient.convertToType(data['interest_keywords'], ['String']);
      if (data.hasOwnProperty('ios14_targeting'))
        obj.ios14_targeting = ApiClient.convertToType(data['ios14_targeting'], 'String');
      if (data.hasOwnProperty('is_hfss'))
        obj.is_hfss = ApiClient.convertToType(data['is_hfss'], 'Boolean');
      if (data.hasOwnProperty('languages'))
        obj.languages = ApiClient.convertToType(data['languages'], ['String']);
      if (data.hasOwnProperty('location_ids'))
        obj.location_ids = ApiClient.convertToType(data['location_ids'], ['String']);
      if (data.hasOwnProperty('min_android_version'))
        obj.min_android_version = ApiClient.convertToType(data['min_android_version'], 'String');
      if (data.hasOwnProperty('min_ios_version'))
        obj.min_ios_version = ApiClient.convertToType(data['min_ios_version'], 'String');
      if (data.hasOwnProperty('network_types'))
        obj.network_types = ApiClient.convertToType(data['network_types'], ['String']);
      if (data.hasOwnProperty('next_day_retention'))
        obj.next_day_retention = ApiClient.convertToType(data['next_day_retention'], 'Number');
      if (data.hasOwnProperty('operating_systems'))
        obj.operating_systems = ApiClient.convertToType(data['operating_systems'], ['String']);
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
      if (data.hasOwnProperty('optimization_event'))
        obj.optimization_event = ApiClient.convertToType(data['optimization_event'], 'String');
      if (data.hasOwnProperty('optimization_goal'))
        obj.optimization_goal = ApiClient.convertToType(data['optimization_goal'], 'String');
      if (data.hasOwnProperty('pacing'))
        obj.pacing = ApiClient.convertToType(data['pacing'], 'String');
      if (data.hasOwnProperty('pixel_id'))
        obj.pixel_id = ApiClient.convertToType(data['pixel_id'], 'String');
      if (data.hasOwnProperty('placement_type'))
        obj.placement_type = ApiClient.convertToType(data['placement_type'], 'String');
      if (data.hasOwnProperty('placements'))
        obj.placements = ApiClient.convertToType(data['placements'], ['String']);
      if (data.hasOwnProperty('product_set_id'))
        obj.product_set_id = ApiClient.convertToType(data['product_set_id'], 'String');
      if (data.hasOwnProperty('product_source'))
        obj.product_source = ApiClient.convertToType(data['product_source'], 'String');
      if (data.hasOwnProperty('promotion_type'))
        obj.promotion_type = ApiClient.convertToType(data['promotion_type'], 'String');
      if (data.hasOwnProperty('promotion_website_type'))
        obj.promotion_website_type = ApiClient.convertToType(data['promotion_website_type'], 'String');
      if (data.hasOwnProperty('purchase_intention_keyword_ids'))
        obj.purchase_intention_keyword_ids = ApiClient.convertToType(data['purchase_intention_keyword_ids'], ['String']);
      if (data.hasOwnProperty('request_id'))
        obj.request_id = ApiClient.convertToType(data['request_id'], 'String');
      if (data.hasOwnProperty('roas_bid'))
        obj.roas_bid = ApiClient.convertToType(data['roas_bid'], 'Number');
      if (data.hasOwnProperty('schedule_end_time'))
        obj.schedule_end_time = ApiClient.convertToType(data['schedule_end_time'], 'String');
      if (data.hasOwnProperty('schedule_start_time'))
        obj.schedule_start_time = ApiClient.convertToType(data['schedule_start_time'], 'String');
      if (data.hasOwnProperty('schedule_type'))
        obj.schedule_type = ApiClient.convertToType(data['schedule_type'], 'String');
      if (data.hasOwnProperty('secondary_optimization_event'))
        obj.secondary_optimization_event = ApiClient.convertToType(data['secondary_optimization_event'], 'String');
      if (data.hasOwnProperty('shopping_ads_retargeting_actions_days'))
        obj.shopping_ads_retargeting_actions_days = ApiClient.convertToType(data['shopping_ads_retargeting_actions_days'], 'Number');
      if (data.hasOwnProperty('shopping_ads_retargeting_type'))
        obj.shopping_ads_retargeting_type = ApiClient.convertToType(data['shopping_ads_retargeting_type'], 'String');
      if (data.hasOwnProperty('shopping_ads_type'))
        obj.shopping_ads_type = ApiClient.convertToType(data['shopping_ads_type'], 'String');
      if (data.hasOwnProperty('skip_learning_phase'))
        obj.skip_learning_phase = ApiClient.convertToType(data['skip_learning_phase'], 'String');
      if (data.hasOwnProperty('spending_power'))
        obj.spending_power = ApiClient.convertToType(data['spending_power'], 'String');
      if (data.hasOwnProperty('statistic_type'))
        obj.statistic_type = ApiClient.convertToType(data['statistic_type'], 'String');
      if (data.hasOwnProperty('store_authorized_bc_id'))
        obj.store_authorized_bc_id = ApiClient.convertToType(data['store_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('store_id'))
        obj.store_id = ApiClient.convertToType(data['store_id'], 'String');
      if (data.hasOwnProperty('targeting_expansion'))
        obj.targeting_expansion = AdgroupcreateTargetingExpansion.constructFromObject(data['targeting_expansion']);
      if (data.hasOwnProperty('video_download_disabled'))
        obj.video_download_disabled = ApiClient.convertToType(data['video_download_disabled'], 'String');
    }
    return obj;
  }
}

/**
 * A list of action category objects.
 * @member {Array.<module:model/AdgroupcreateActions>} actions
 */
AdgroupCreateBody.prototype.actions = undefined;

/**
 * Whether to use App Profile Page or not. Enum values- `ON`, `OFF`.
 * @member {String} adgroup_app_profile_page_state
 */
AdgroupCreateBody.prototype.adgroup_app_profile_page_state = undefined;

/**
 * Ad group name. Character limit is 512 and cannot contain emoji.
 * @member {String} adgroup_name
 */
AdgroupCreateBody.prototype.adgroup_name = undefined;

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
AdgroupCreateBody.prototype.advertiser_id = undefined;

/**
 * Age groups you want to target. For enum values, see [Enumeration - Targeting Age Group](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {Array.<String>} age_groups
 */
AdgroupCreateBody.prototype.age_groups = undefined;

/**
 * The Application id of the promoted app. You can get `app_id` by using the [/app/list/](https://ads.tiktok.com/marketing_api/docs?id=1740859313270786) endpoint. Required in the following use cases- When `objective_type` is `APP_INSTALL`.When `objective_type` is `APP_PROMOTION` and `app_promotion_type` is `APP_RETARGETING` (App retargeting).When `objective_type` is `APP_PROMOTION` , `app_promotion_type` is `APP_INSTALL`(App install), and it is not an iOS14 Dedicated Campaign.When `objective_type` is `CONVERSIONS` and `promotion_type` is `APP_ANDROID` or `APP_IOS`
 * @member {String} app_id
 */
AdgroupCreateBody.prototype.app_id = undefined;

/**
 * List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746) endpoint.
 * @member {Array.<String>} audience_ids
 */
AdgroupCreateBody.prototype.audience_ids = undefined;

/**
 * @member {module:model/AdgroupcreateAudienceRule} audience_rule
 */
AdgroupCreateBody.prototype.audience_rule = undefined;

/**
 * App retargeting audience type, required when objective_type is `CONVERSIONS` and externla_type is app-related. Currently, the only supported enumeration is `NEW_CUSTOM_AUDIENCE`; for this type, you must pass audience IDs to the `audience_ids` field when creating or updating the ad group. The audiences to be used must be either Custom File Audience or App Activity Audience. Optionally, you can specify the `excluded_audience_ids` field. If both `audience_ids` and `excluded_audience_ids` are specified, they cannot contain the same IDs
 * @member {String} audience_type
 */
AdgroupCreateBody.prototype.audience_type = undefined;

/**
 * Whether to enable automated targeting.
 * @member {String} auto_targeting_enabled
 */
AdgroupCreateBody.prototype.auto_targeting_enabled = undefined;

/**
 * How you calculate and measure Cost per View. `bid_display_mode` is required and must be set to `CPV`(Cost per One View) when `objective_type` is `VIDEO_VIEW` and `bid_type` is `BID_TYPE_CUSTOM`. Cannot be updated after creation.
 * @member {String} bid_display_mode
 */
AdgroupCreateBody.prototype.bid_display_mode = undefined;

/**
 * The maximum cost per result you are willing to bid (for Bid Cap bidding strategy), or an average cost per result that you want to achieve (for Cost Cap bidding strategy). When Campaign Budget Optimization (`budget_optimize_on`) is on, we suggest that you set the same bid value for all ad groups in the campaign. Note- To specify `bid_price`, you need to set `bid_type` as `BID_TYPE_CUSTOM`.`bid_price` needs to be lower than budget set at the campaign level and ad group level. See [Bidding-Bidding limits](https://ads.tiktok.com/marketing_api/docs?id=1745292444424193) to learn more about the bid verification mechanism.
 * @member {Number} bid_price
 */
AdgroupCreateBody.prototype.bid_price = undefined;

/**
 * Bidding strategy that determines how the system manages your cost per result, spends your budget, and how it delivers ads. Required when Campaign Budget Optimization (CBO) is enabled (`budget_optimize_on` = `TRUE`). For enum values, see [Enumeration - Bidding Strategy](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {String} bid_type
 */
AdgroupCreateBody.prototype.bid_type = undefined;

/**
 * Events that you want to pay for. For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).|
 * @member {String} billing_event
 */
AdgroupCreateBody.prototype.billing_event = undefined;

/**
 * Pangle app block list ID. You can get an ID via the `app_package_id` field returned by [Get Pangle block list](https://ads.tiktok.com/marketing_api/docs?id=1740039957181441). It only takes effect when Pangle placement is selected.
 * @member {Array.<String>} blocked_pangle_app_ids
 */
AdgroupCreateBody.prototype.blocked_pangle_app_ids = undefined;

/**
 * Brand safety partner. Required only when `brand_safety_type` is `THIRD_PARTY`, and `placements` needs to be set as `PLACEMENT_TIKTOK`. Enum values- `IAS`, `OPEN_SLATE`. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the [/tool/region/](https://ads.tiktok.com/marketing_api/docs?id=1737189539571713) endpoint. You need to pass in the brand safety type and brand safety partner. Note-  Pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative.  Pre-bid third-party Brand Safety solutions are not supported for TikTok Pulse campaigns (`rf_campaign_type` =`PULSE`).   Once set, this field cannot be modified.
 * @member {String} brand_safety_partner
 */
AdgroupCreateBody.prototype.brand_safety_partner = undefined;

/**
 * Valid only when `placements` is set as `PLACEMENT_TIKTOK`. Default value- `NO_BRAND_SAFETY`. Enum values- `NO_BRAND_SAFETY`-  To not use any brand safety solution.  Full inventory, which means your ads may appear next to some content featuring mature themes. `STANDARD_INVENTORY`- Use TikTok's brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. `LIMITED_INVENTORY`- Use TikTok's brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes.`THIRD_PARTY`- Use a third-party brand safety solution. You also need to pass in a value to the `brand_safety_partner` field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the [/tool/region/] function. Note -   Pre-bid first-party Brand Safety solutions for `APP_PROMOTION`, `APP_INSTALL`, `WEB_CONVERSIONS`, `CONVERSIONS`, `TRAFFIC`,  `LEAD_GENERATION` objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative.  Pre-bid third-party Brand Safety solutions are not supported for TikTok Pulse campaigns (`rf_campaign_type` =`PULSE`).  See [Brand safety](https://ads.tiktok.com/marketing_api/docs?id=1739381752981505) to learn about the supported advertising objectives, supported markets, and the general introduction of pre-bid Brand Safety filtering.  Once set, this field cannot be modified.
 * @member {String} brand_safety_type
 */
AdgroupCreateBody.prototype.brand_safety_type = undefined;

/**
 * Ad group budget. The setting will be ignored when Campaign Budget Optimization (`budget_optimize_on` = `TRUE`) is enabled. For how to configure budget settings, see [Budget](https://ads.tiktok.com/marketing_api/docs?id=1739381246298114). To directly see the daily budget value range for a currency, see [Currency-Daily budget value range](https://ads.tiktok.com/marketing_api/docs?id=1737585839634433).
 * @member {Number} budget
 */
AdgroupCreateBody.prototype.budget = undefined;

/**
 * Ad group budget mode. To learn about how to set budget modes, see [Budget](https://ads.tiktok.com/marketing_api/docs?id=1739381246298114).When Campaign Budget Optimization (CBO) is enabled, `budget_mode` at the ad group level will be ignored.When CBO is disabled, `budget_mode` at the ad group level supports the following enum values-`BUDGET_MODE_TOTAL`- Lifetime budget.`BUDGET_MODE_DAY`- Daily budget.`BUDGET_MODE_DYNAMIC_DAILY_BUDGET`- Dynamic daily budget. It is the average daily budget over a week. Daily costs will not exceed 125% of the average daily budget. Weekly costs will not exceed the average daily budget * 7. `BUDGET_MODE_DYNAMIC_DAILY_BUDGET` supports the following `objective_type`- `TRAFFIC`, `APP_PROMOTION`, `WEB_CONVERSIONS`, `LEAD_GENERATION`, `PRODUCT_SALES`.
 * @member {String} budget_mode
 */
AdgroupCreateBody.prototype.budget_mode = undefined;

/**
 * Whether to enable Campaign Budget Optimization (CBO). Enum values- `True`- Enabled. `False`- Not enabled. Default value- `False`. For details about CBO, see [Campaign Budget Optimization](https://ads.tiktok.com/marketing_api/docs?id=1739381757818881).
 * @member {Boolean} budget_optmize_on
 */
AdgroupCreateBody.prototype.budget_optmize_on = undefined;

/**
 * The Ad group's campaign ID.
 * @member {String} campaign_id
 */
AdgroupCreateBody.prototype.campaign_id = undefined;

/**
 * Carriers that you want to target. A carrier is valid only when the `in_use` field for the carrier is `true`. The carriers must be consistent with the location(s) that you want to target. Use [/tool/carrier/](https://ads.tiktok.com/marketing_api/docs?id=1737168013095938) endpoint to get the enum values.
 * @member {Array.<String>} carrier_ids
 */
AdgroupCreateBody.prototype.carrier_ids = undefined;

/**
 * For catalogs in Business Center, you must specify the ID of the Business Center that a catalog belongs to.
 * @member {String} catalog_authorized_bc_id
 */
AdgroupCreateBody.prototype.catalog_authorized_bc_id = undefined;

/**
 * Catalog ID. Required when the corresponding campaign `objective_type` is `PRODUCT_SALES`
 * @member {String} catalog_id
 */
AdgroupCreateBody.prototype.catalog_id = undefined;

/**
 * Whether to allow comments on your ads on TikTok.
 * @member {String} comment_disabled
 */
AdgroupCreateBody.prototype.comment_disabled = undefined;

/**
 * Contextual tag IDs. You can use [/tool/contextual_tag/get/](https://ads.tiktok.com/marketing_api/docs?id=1747747118654465) to get available contextual tags.  See [Contextual targeting](https://ads.tiktok.com/marketing_api/docs?id=1745292519923713)  to learn more about how to use contextual targeting.<p><span style=\"color-darkred\"><b>Note</b></span>- This is an allowlist-only feature. If you would like to access it, please contact your TikTok representative.Only supports `REACH` and `VIDEO_VIEWS` as objectives (`objective_type`) at the campaign level. Not supported when `brand_safety_type` is set to `THIRD_PARTY`.
 * @member {Array.<String>} contextual_tag_ids
 */
AdgroupCreateBody.prototype.contextual_tag_ids = undefined;

/**
 * Where you can set a target cost per conversion for oCPM(Optimized Cost per Mille); Required when `billing_event` = `OCPM` and `bid_type` = `BID_TYPE_CUSTOM`.`conversion_bid_price` needs to be lower than budget set at the campaign level and ad group level. See [Bidding-Bidding limits](https://ads.tiktok.com/marketing_api/docs?id=1745292444424193) to learn more about the bid verification mechanism.
 * @member {Number} conversion_bid_price
 */
AdgroupCreateBody.prototype.conversion_bid_price = undefined;

/**
 * Conversion Id
 * @member {String} conversion_id
 */
AdgroupCreateBody.prototype.conversion_id = undefined;

/**
 * The strategy that your creatives will be delivered.<br data-tomark-pass>`Note`- When you choose automated ad, your creative materials will automatically be combined for delivery. Tiktok Ads' smart optimization algorithm is applied and will be used to achieve the best ad performance during delivery. <br data-tomark-pass>Optional values include- `CUSTOM` (custom), `DYNAMIC` (automated). Default value is `CUSTOM` (custom). See [help center](https://ads.tiktok.com/help/article?aid=6670043695674294277) for more.
 * @member {String} creative_material_mode
 */
AdgroupCreateBody.prototype.creative_material_mode = undefined;

/**
 * Ad delivery arrangement, in the format of a string that consists of 48 x 7 characters. Each character is mapped to a 30-minute timeframe from Monday to Sunday. Each character can be set to either 0 or 1. 1 represents delivery in the 30-minute timeframe, and 0 stands for non-delivery in the 30-minute timeframe. The first character is mapped to 0-01-0-30 of Monday; The second character is mapped to 0-31-1-00 of Monday, and the last character represents 23-31-0-00 Sunday.
 * @member {String} dayparting
 */
AdgroupCreateBody.prototype.dayparting = undefined;

/**
 * Bidding strategy for in-app events. Required when Campaign Budget Optimization (CBO) is enabled (`budget_optimize_on` = `TRUE`)  and `optimization_goal` is `VALUE`. Enum values- `VO_MIN_ROAS` (allowlisted), `VO_HIGHEST_VALUE` (allowlisted). For details, see [Enumeration - Deep-level Bidding Strategy](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {String} deep_bid_type
 */
AdgroupCreateBody.prototype.deep_bid_type = undefined;

/**
 * Deep CPA bid
 * @member {Number} deep_cpa_bid
 */
AdgroupCreateBody.prototype.deep_cpa_bid = undefined;

/**
 * IDs of the device models that you want to target. Use [/tool/device_model/](https://ads.tiktok.com/marketing_api/docs?id=1737172880570369) to get the complete list of device model IDs and their statuses, and only active devices (`is_active` = `True` in the response of  [/tool/device_model/](https://ads.tiktok.com/marketing_api/docs?id=1737172880570369)) can be used to create ads.
 * @member {Array.<String>} device_model_ids
 */
AdgroupCreateBody.prototype.device_model_ids = undefined;

/**
 * Targeting device price range. 10000 means 1000+. The numbers must be in multiples of 50. The upper limit you set will be added by 50 and the resulting new number will be used as the actual upper limit for device targeting. The actual upper limit is shown in the ad group settings in TikTok Ads Manager. If you set and get the price range of [0, 250], it actually means [0, 300].
 * @member {Array.<Number>} device_price_ranges
 */
AdgroupCreateBody.prototype.device_price_ranges = undefined;

/**
 * List of audience ID to be excluded. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746) endpoint.
 * @member {Array.<String>} excluded_audience_ids
 */
AdgroupCreateBody.prototype.excluded_audience_ids = undefined;

/**
 * @member {module:model/AdgroupcreateExcludedCustomActions} excluded_custom_actions
 */
AdgroupCreateBody.prototype.excluded_custom_actions = undefined;

/**
 * IDs of the Pangle audiences that you want to exclude. Valid only for Pangle placement. You can get audience IDs (`package_id`) by using the [/pangle_audience_package/get/](https://ads.tiktok.com/marketing_api/docs?id=1740040177229826) endpoint. You need to set `bind_type` to `EXCLUDE`. Do not specify this field and `included_pangle_audience_package_ids` at the same time.
 * @member {Array.<String>} excluded_pangle_audience_package_ids
 */
AdgroupCreateBody.prototype.excluded_pangle_audience_package_ids = undefined;

/**
 * Frequency, together with `frequency_schedule`, controls how often people see your ad (only available for `REACH` ads). The below conditions should be both met-1 <= `frequency` <= `frequency_schedule` * 3 1 <= `frequency_schedule` <=7 For example, `frequency` = 2 & `frequency_schedule` = 3 means \"show ads no more than twice every 3 day\".
 * @member {Number} frequency
 */
AdgroupCreateBody.prototype.frequency = undefined;

/**
 * Frequency_schedule`, together with `frequency`, controls how often people see your ad (only available for `REACH` ads). See `frequency` fields for more.
 * @member {Number} frequency_schedule
 */
AdgroupCreateBody.prototype.frequency_schedule = undefined;

/**
 * Gender that you want to target. Enum values- `GENDER_FEMALE`,`GENDER_MALE`,`GENDER_UNLIMITED`
 * @member {String} gender
 */
AdgroupCreateBody.prototype.gender = undefined;

/**
 * Household income that you want to target. Enum values- `TOP5`(Top 5% of ZIP codes), `TOP10`(Top 10% of ZIP codes), `TOP10_25`(Top 10% -25% of ZIP codes), `TOP25_50`(Top 25% - 50% of ZIP codes). Note-  It only supports the ad objectives for Auction ads. See [Advertising objectives](https://ads.tiktok.com/marketing_api/docs?id=1737585562434561) for details. It  is only applicable the TikTok Placement in US. If you have specified `special_industries` at the campaign level, then you cannot use the field here. `household_income` is an allowlist-only feature that is only available in US. If you would like to access it, please contact your TikTok representative.
 * @member {Array.<String>} household_income
 */
AdgroupCreateBody.prototype.household_income = undefined;

/**
 * ID of the Business Center that a TikTok Account User in Business Center identity is associated with. Required when `identity_type` is `BC_AUTH_TT`.
 * @member {String} identity_authorized_bc_id
 */
AdgroupCreateBody.prototype.identity_authorized_bc_id = undefined;

/**
 * Identity ID. Required and only valid when `objective_type` is `SHOP_PURCHASES` or `PRODUCT_SALES`.
 * @member {String} identity_id
 */
AdgroupCreateBody.prototype.identity_id = undefined;

/**
 * Identity type. Enum values- `AUTH_CODE` (Authorized Post User), `TT_USER` (TikTok Business Account User), `BC_AUTH_TT`(The TikTok account that a Business Center is authorized to access). Required and only valid when `objective_type` is `SHOP_PURCHASES` or `PRODUCT_SALES`. See [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097) for details.
 * @member {String} identity_type
 */
AdgroupCreateBody.prototype.identity_type = undefined;

/**
 * @member {module:model/AdgroupcreateIncludedCustomActions} included_custom_actions
 */
AdgroupCreateBody.prototype.included_custom_actions = undefined;

/**
 * IDs of the Pangle audiences that you want to include. Valid only for Pangle placement. You can get audience IDs (`package_id`) by using the [/pangle_audience_package/get/](https://ads.tiktok.com/marketing_api/docs?id=1740040177229826) endpoint. You need to set `bind_type` to `INCLUDE`.  Do not specify this field and `excluded_pangle_audience_package_ids` at the sa
 * @member {Array.<String>} included_pangle_audience_package_ids
 */
AdgroupCreateBody.prototype.included_pangle_audience_package_ids = undefined;

/**
 * Interest classification. If the interest is specified, users that do not meet interest target will be excluded during delivery. Do not specify if you wish to target everyone. Use [/tool/target_recommend_tags/](https://ads.tiktok.com/marketing_api/docs?id=1736275204260866) to get a list of recommended interest categories based on your targeting regions and your industries. Use [/tool/interest_category/](https://ads.tiktok.com/marketing_api/docs?id=1737174348712961) endpoint to get the complete list of interest categories.
 * @member {Array.<String>} interest_category_ids
 */
AdgroupCreateBody.prototype.interest_category_ids = undefined;

/**
 * IDs of interest keywords that you want to use to target audience. You can get recommended interest keywords IDs by using the [/tool/interest_keyword/recommend/](https://ads.tiktok.com/marketing_api/docs?id=1737180852720642) endpoint.
 * @member {Array.<String>} interest_keyword_ids
 */
AdgroupCreateBody.prototype.interest_keyword_ids = undefined;

/**
 *  Interest Keywords
 * @member {Array.<String>} interest_keywords
 */
AdgroupCreateBody.prototype.interest_keywords = undefined;

/**
 * The iOS devices that you want to target. When `campaign_type` of the campaign is set as `IOS14_CAMPAIGN`,  `ios14_targeting` is required and must be specified as `IOS14_PLUS`. Enum values-`UNSET`- Devices with iOS 14.4 or earlier versions. The default value for ad groups that were created before the introduction of this field.`IOS14_MINUS`- Devices with versions earlier than iOS 14.0, which are not affected by the iOS 14 privacy update. This is the default value for ad groups that are created after the introduction of this field.`IOS14_PLUS`- Devices with iOS 14.5 and above. The iOS 14 privacy update has been enforced in this group of devices. Specify this value if you want to create an iOS 14 campaign.  Each iOS 14 campaign can have up to 2 active ad groups. <br data-tomark-pass> If `IOS14_PLUS` is specified, this field cannot be updated. If `IOS14_PLUS` is specified for this field, the system will verify if related fields meet the requirements for an iOS 14 campaign. The following fields will be checked. `app_id`- It must not be an ID of an Android app.`operating_systems`- It must not be `ANDROID` or `PC`.`min_ios_version`- You must specify a value for this field, and the the value must not contradict with the selection for `ios14_targeting`.`min_android_version`- Must not be specified.`optimization_goal`- Can only be set to `IN_APP_EVENT`, `INSTALL`, or `CLICK`.`shopping_ads_retargeting_type`- Must not be specified.`shopping_ads_retargeting_actions_days`- Must not be specified. `conversion_window`- Must not be specified.On the Ad level, `deeplink_type` must not be set to `DEFERRED_DEEPLINK`.
 * @member {String} ios14_targeting
 */
AdgroupCreateBody.prototype.ios14_targeting = undefined;

/**
 * Whether the promoted content is HFSS foods (foods that are high in fat, salt, or sugar).
 * @member {Boolean} is_hfss
 */
AdgroupCreateBody.prototype.is_hfss = undefined;

/**
 * Codes of the languages that you want to target. For the list of languages codes supported, see [Enumeration - Language Code](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).You can get language codes via [/tool/language/](https://ads.tiktok.com/marketing_api/docs?id=1737188554152962), and if you don't want to limit the languages you target, assign an empty value to this field or do not pass in this field.
 * @member {Array.<String>} languages
 */
AdgroupCreateBody.prototype.languages = undefined;

/**
 * IDs of the locations that you want to target. To get the available locations and corresponding IDs based on your placement and objective, use the [/tool/region/](https://ads.tiktok.com/marketing_api/docs?id=1737189539571713) endpoint. To get the list of location IDs, see [Location IDs](https://ads.tiktok.com/marketing_api/docs?id=1739311040498689).
 * @member {Array.<String>} location_ids
 */
AdgroupCreateBody.prototype.location_ids = undefined;

/**
 * Minimum device Android version. For enum values, see [Enumeration - Minimum Android Version](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {String} min_android_version
 */
AdgroupCreateBody.prototype.min_android_version = undefined;

/**
 * Minimum iOS version. For enum values, see [Enumeration - Minimum iOS Version](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). This field is required when `ios14_targeting` is specified.
 * @member {String} min_ios_version
 */
AdgroupCreateBody.prototype.min_ios_version = undefined;

/**
 * Device connection types that you want to target. Default- `unlimited`. For enum values, see [Enumeration - Connection Type](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {Array.<String>} network_types
 */
AdgroupCreateBody.prototype.network_types = undefined;

/**
 * Day 2 retention ratio. Formula- `next_day_retention` = `conversion_bid_price`/`deep_cpa_bid`. Value range is (0,1]. Only valid when `placements` is `PLACEMENT_PANGLE` and `secondary_optimization_event` is `NEXT_DAY_OPEN`. If you want to use this field, please pass in `conversion_bid_price`, `deep_cpa_bid`, and `next_day_retention` at the same time, and make sure the value of them meets the calculation formula. Otherwise there might be unexpected errors.
 * @member {Number} next_day_retention
 */
AdgroupCreateBody.prototype.next_day_retention = undefined;

/**
 * Device operating systems that you want to target. Only one value is allowed.  Enum values- `ANDROID`, `IOS`. This field is required in two scenarios- `objective_type` = `APP_INSTALL``objective`=`TRAFFIC` and `optimization_event` = `APP_IOS` or `APP_ANDROID`
 * @member {Array.<String>} operating_systems
 */
AdgroupCreateBody.prototype.operating_systems = undefined;

/**
 * The status of the ad group when created. Enum values- `ENABLE` - The ad group is enabled when created. `DISABLE` - The ad group is disabled when created. Default value- `ENABLE`. If you want to update the status of the ad group after creation, use the [/adgroup/status/update/](https://ads.tiktok.com/marketing_api/docs?id=1739591716326402) endpoint.
 * @member {String} operation_status
 */
AdgroupCreateBody.prototype.operation_status = undefined;

/**
 * Conversion event for the ad group. Required when the promoted object is an App with tracking urls, or when `pixel_id` is specified. For the supported app and pixel events, see [Conversion events](https://ads.tiktok.com/marketing_api/docs?id=1739361474981889). You can use the [/app/optimization_event/](https://ads.tiktok.com/marketing_api/docs?id=1740859338750977) endpoint to find out the supported events for your ap
 * @member {String} optimization_event
 */
AdgroupCreateBody.prototype.optimization_event = undefined;

/**
 * The measurable results you'd like to drive with your ads.  Required when Campaign Budget Optimization (CBO) is enabled (`budget_optimize_on` = `TRUE`).
 * @member {String} optimization_goal
 */
AdgroupCreateBody.prototype.optimization_goal = undefined;

/**
 * You can choose between `PACING_MODE_SMOOTH` and `PACING_MODE_FAST`. For `PACING_MODE_SMOOTH`, the budget is allocated evenly within the scheduled time. `PACING_MODE_FAST` would consume budget and produce results as soon as possible. When Campaign Budget Optimization (`budget_optimize_on`) is on, your setting will be ignored and it will be set as `PACING_MODE_SMOOTH`. Otherwise, this field is required.
 * @member {String} pacing
 */
AdgroupCreateBody.prototype.pacing = undefined;

/**
 * Pixel ID. Only applicable for landing pages.  It needs to be passed in with the `optimization_event` field, and the supported advertising objectives (`objective_type`) are `CONVERSIONS`, `PRODUCT_SALES`, `SHOP_PURCHASES`.   If you want to track events for other objectives other than `LEAD_GENERATION`, use `tracking_pixel_id` at the ad level. Use [/pixel/list/](https://ads.tiktok.com/marketing_api/docs?id=1740858697598978) endpoint to get all Pixel IDs.
 * @member {String} pixel_id
 */
AdgroupCreateBody.prototype.pixel_id = undefined;

/**
 * Placement Type
 * @member {String} placement_type
 */
AdgroupCreateBody.prototype.placement_type = undefined;

/**
 * The apps where you want to deliver your ads. Required when `placement_type` is `PLACEMENT_TYPE_NORMAL`, and ignored when `placement_type` is `PLACEMENT_TYPE_AUTOMATIC`. `placements` cannot be updated after the ad group has been created. Currently, we support `PLACEMENT_TIKTOK`, `PLACEMENT_PANGLE` and `PLACEMENT_GLOBAL_APP_BUNDLE`. Please don't select `PLACEMENT_TOPBUZZ` or `PLACEMENT_HELO` as your `placements` since they've been deprecated. For a full list of enum values, see [Enumeration - Placement](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).`PLACEMENT_GLOBAL_APP_BUNDLE` is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative.For Product Sales campaigns (`objective_type` = `PRODUCT_SALES`), only TikTok placement (`PLACEMENT_TIKTOK`) is supported.
 * @member {Array.<String>} placements
 */
AdgroupCreateBody.prototype.placements = undefined;

/**
 * ProductSet ID of the catalog. `0` means selecting all product sets. The default value is 0.
 * @member {String} product_set_id
 */
AdgroupCreateBody.prototype.product_set_id = undefined;

/**
 * Required for Video Shopping Ads. Product source where you want to get products for promotion. Enum values- `UNSET` ,`CATALOG`(Catalog) , `STORE` (TikTok Shop or TikTok Storefront (third-party store)),`SHOWCASE`(TikTok Showcase).See [Create Video Shopping Ads](https://ads.tiktok.com/marketing_api/docs?id=1741942291730434) to learn more about the steps of creating Video Shopping Ads.
 * @member {String} product_source
 */
AdgroupCreateBody.prototype.product_source = undefined;

/**
 * Promotion type and you can decide where you'd like to promote your products using this field. You need to specify the field when advertising objective (`objective_type`) for your campaign is NOT set as `REACH`, `VIDEO_VIEWS`, or `ENGAGEMENT`. For enum values, see [Enumeration - Promotion Type](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {String} promotion_type
 */
AdgroupCreateBody.prototype.promotion_type = undefined;

/**
 * Instant page type in the ad group. Currently, the only supported value is `TIKTOK_NATIVE_PAGE`. If you use instant pages in your ads, you also need to pass in `page_id` of the instant page when creating the ad. Do not pass in value if you do not want to use instant pages in your ad group.
 * @member {String} promotion_website_type
 */
AdgroupCreateBody.prototype.promotion_website_type = undefined;

/**
 * IDs of purchase intention keywords that you want to use to target audiences with an interest in purchases related to a content category. To get purchase intention keyword IDs, you need to set `audience_type` as `PURCHASE_INTENTION` when calling [/tool/interest_keyword/recommend/](https://ads.tiktok.com/marketing_api/docs?id=1737180852720642) and then get purchase intention keyword IDs from `keyword_id` in the response. Note-Do not pass in `purchase_intention_keyword_ids` and `interest_keyword_ids` at the same time. Otherwise, keyword conflict will occur.`purchase_intention_keyword_ids` only supports auctions ads with the corresponding advertising objective(`objective_type`) as App promotion (`APP_PROMOTION`), Conversions (`CONVERSIONS` ) ，or Product sales (`PRODUCT_SALES` when the corresponding `promotion_type` = `APP_ANDROID`, `APP_IOS`, or `WEBSITE`）, and the placement setting should include TikTok.
 * @member {Array.<String>} purchase_intention_keyword_ids
 */
AdgroupCreateBody.prototype.purchase_intention_keyword_ids = undefined;

/**
 * Request ID with which you can create ad groups with duplicate names. It also supports idempotency to prevent you from sending the same request twice.  If you retry requests with the same request ID multiple times, then only one will succeed. It is different from the `request_id` returned in the response parameters, which is used to uniquely identify an HTTP request.
 * @member {String} request_id
 */
AdgroupCreateBody.prototype.request_id = undefined;

/**
 * ROAS goal for Value Optimization. Required when `deep_bid_type` is `VO_MIN_ROAS`.
 * @member {Number} roas_bid
 */
AdgroupCreateBody.prototype.roas_bid = undefined;

/**
 * Schedule end time (UTC+0), in the format of \"YYYY-MM-DD HH-MM-SS\". This field is required when `schedule_type` is `SCHEDULE_START_END` or `budget_mode` is `BUDGET_MODE_TOTAL`
 * @member {String} schedule_end_time
 */
AdgroupCreateBody.prototype.schedule_end_time = undefined;

/**
 * Schedule start time (UTC+0), in the format of \"YYYY-MM-DD HH-MM-SS\". The start time can be up to 12 hours earlier than the current time.
 * @member {String} schedule_start_time
 */
AdgroupCreateBody.prototype.schedule_start_time = undefined;

/**
 * The schedule type can be either `SCHEDULE_START_END` or `SCHEDULE_FROM_NOW`. If you choose `SCHEDULE_START_END`, you need to specify a start time and an end time. If you choose `SCHEDULE_FROM_NOW`, you only need to specify a start time and the end time will be automatically set to 10 years later than the start time. If `budget_mode` is `BUDGET_MODE_TOTAL`, this field must be set to `SCHEDULE_START_END`.
 * @member {String} schedule_type
 */
AdgroupCreateBody.prototype.schedule_type = undefined;

/**
 * The secondary goal when optimization goal (`optimization_goal`) is Install (`INSTALL`) or Value (`VALUE`). For enum values, see [Conversion events - Secondary-goal events](https://ads.tiktok.com/marketing_api/docs?id=1739361474981889).
 * @member {String} secondary_optimization_event
 */
AdgroupCreateBody.prototype.secondary_optimization_event = undefined;

/**
 * The valid time range for the specified audience action. Audiences who have completed the specified action within the time range will be retargeted by the shopping ads. Required when `shopping_ads_retargeting_type` is `LAB1` or `LAB2`.
 * @member {Number} shopping_ads_retargeting_actions_days
 */
AdgroupCreateBody.prototype.shopping_ads_retargeting_actions_days = undefined;

/**
 * Valid when the campaign `objective_type` is `PRODUCT_SALES`. The retargeting type of shopping ads. Enum values- `LAB1`- Retargeting audiences who viewed products or added products to cart but didn't purchase products. `LAB2`- Retargeting audiences who added products to cart but didn't purchase products. `LAB3`- Retargeting audiences using custom combination. `OFF`- No retargeting.
 * @member {String} shopping_ads_retargeting_type
 */
AdgroupCreateBody.prototype.shopping_ads_retargeting_type = undefined;

/**
 * Shopping ads type. Enum values- `UNSET`, `VIDEO`(Video shopping ads),`LIVE`(Live shopping ads), `CATALOG_LISTING_ADS`
 * @member {String} shopping_ads_type
 */
AdgroupCreateBody.prototype.shopping_ads_type = undefined;

/**
 * Whether to skip the learning phase. It only takes effect when the corresponding campaign `objective_type` is `CATALOG_SALES` (Deprecated) and `bid_type` is `OCPM`.
 * @member {String} skip_learning_phase
 */
AdgroupCreateBody.prototype.skip_learning_phase = undefined;

/**
 * Spending power that you want to target. Enum values- `ALL`, `HIGH`.   If it is set to `HIGH`, you can target high spending users who typically spend more on purchases than average users.  Note-  It is only applicable to the TikTok placement. Your `placements` field must contain the enum value of `PLACEMENT_TIKTOK` . It only supports the ad objectives for Auction ads. See [Advertising objectives](https://ads.tiktok.com/marketing_api/docs?id=1737585562434561) for details.  It cannot be used with special industries targeting at the same time. If you have specified `special_industries` at the campaign level, then you cannot use the field here. When `auto_targeting_enabled` is `True` at the ad group level, then `spending_power`  will be automatically set to `ALL`.  Enum values are `ALL` and `HIGH`. Even if you don't specify this field,  then we will still return `ALL` spending power users.
 * @member {String} spending_power
 */
AdgroupCreateBody.prototype.spending_power = undefined;

/**
 * Conversion bid statistic type, bid for `EVERYTIME` (Each Purchase)/ `NONE` (Unique Purchase). You can get statistic_type values suitable for your app event  by using the [/app/optimization_event/](https://ads.tiktok.com/marketing_api/docs?id=1740859338750977) endpoint.
 * @member {String} statistic_type
 */
AdgroupCreateBody.prototype.statistic_type = undefined;

/**
 * ID of the Business Center that is authorized to access the store (`store_id`). Required when `objective_type` is `SHOP_PURCHASES` or `PRODUCT_SALES`.
 * @member {String} store_authorized_bc_id
 */
AdgroupCreateBody.prototype.store_authorized_bc_id = undefined;

/**
 * ID of the TikTok Storefront or TikTok Shop. Valid and required only when `objective_type` is `SHOP_PURCHASES` or `PRODUCT_SALES`. To get the TikTok Storefront ID or TikTok Shop ID, you can use [/bc/asset/get/] function. When in the response `asset_type` is `STOREFRONT`, the returned `asset_id` is the TikTok Storefront ID. When in the response `asset_type` is `TIKTOK_SHOP`, the returned `asset_id` is the TikTok Shop ID.
 * @member {String} store_id
 */
AdgroupCreateBody.prototype.store_id = undefined;

/**
 * @member {module:model/AdgroupcreateTargetingExpansion} targeting_expansion
 */
AdgroupCreateBody.prototype.targeting_expansion = undefined;

/**
 * hether users can download your video ads on TikTok(cannot be updated once created).|
 * @member {String} video_download_disabled
 */
AdgroupCreateBody.prototype.video_download_disabled = undefined;

