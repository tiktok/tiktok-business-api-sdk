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
 * The AdgroupUpdateBody model module.
 * @module model/AdgroupUpdateBody
 * @version 0.1.8
 */
export class AdgroupUpdateBody {
  /**
   * Constructs a new <code>AdgroupUpdateBody</code>.
   * @alias module:model/AdgroupUpdateBody
   * @class
   * @param adgroup_id {String} Ad group ID
   * @param advertiser_id {String} Advertiser ID
   */
  constructor(adgroup_id, advertiser_id) {
    this.adgroup_id = adgroup_id;
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>AdgroupUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupUpdateBody} obj Optional instance to populate.
   * @return {module:model/AdgroupUpdateBody} The populated <code>AdgroupUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupUpdateBody();
      if (data.hasOwnProperty('actions'))
        obj.actions = ApiClient.convertToType(data['actions'], [AdgroupcreateActions]);
      if (data.hasOwnProperty('adgroup_id'))
        obj.adgroup_id = ApiClient.convertToType(data['adgroup_id'], 'String');
      if (data.hasOwnProperty('adgroup_name'))
        obj.adgroup_name = ApiClient.convertToType(data['adgroup_name'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('age_groups'))
        obj.age_groups = ApiClient.convertToType(data['age_groups'], ['String']);
      if (data.hasOwnProperty('app_download_url'))
        obj.app_download_url = ApiClient.convertToType(data['app_download_url'], 'String');
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('audience_ids'))
        obj.audience_ids = ApiClient.convertToType(data['audience_ids'], ['String']);
      if (data.hasOwnProperty('audience_rule'))
        obj.audience_rule = AdgroupcreateAudienceRule.constructFromObject(data['audience_rule']);
      if (data.hasOwnProperty('audience_type'))
        obj.audience_type = ApiClient.convertToType(data['audience_type'], 'String');
      if (data.hasOwnProperty('auto_targeting_enabled'))
        obj.auto_targeting_enabled = ApiClient.convertToType(data['auto_targeting_enabled'], 'Boolean');
      if (data.hasOwnProperty('bid_price'))
        obj.bid_price = ApiClient.convertToType(data['bid_price'], 'Number');
      if (data.hasOwnProperty('bid_type'))
        obj.bid_type = ApiClient.convertToType(data['bid_type'], 'String');
      if (data.hasOwnProperty('billing_event'))
        obj.billing_event = ApiClient.convertToType(data['billing_event'], 'String');
      if (data.hasOwnProperty('blocked_pangle_app_ids'))
        obj.blocked_pangle_app_ids = ApiClient.convertToType(data['blocked_pangle_app_ids'], ['String']);
      if (data.hasOwnProperty('brand_safety_type'))
        obj.brand_safety_type = ApiClient.convertToType(data['brand_safety_type'], 'String');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('carrier_ids'))
        obj.carrier_ids = ApiClient.convertToType(data['carrier_ids'], ['String']);
      if (data.hasOwnProperty('catalog_authorized_bc_id'))
        obj.catalog_authorized_bc_id = ApiClient.convertToType(data['catalog_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('comment_disabled'))
        obj.comment_disabled = ApiClient.convertToType(data['comment_disabled'], 'String');
      if (data.hasOwnProperty('contextual_tag_ids'))
        obj.contextual_tag_ids = ApiClient.convertToType(data['contextual_tag_ids'], ['String']);
      if (data.hasOwnProperty('conversion_bid_price'))
        obj.conversion_bid_price = ApiClient.convertToType(data['conversion_bid_price'], 'Number');
      if (data.hasOwnProperty('conversion_id'))
        obj.conversion_id = ApiClient.convertToType(data['conversion_id'], 'Number');
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
      if (data.hasOwnProperty('pacing'))
        obj.pacing = ApiClient.convertToType(data['pacing'], 'String');
      if (data.hasOwnProperty('purchase_intention_keyword_ids'))
        obj.purchase_intention_keyword_ids = ApiClient.convertToType(data['purchase_intention_keyword_ids'], ['String']);
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
      if (data.hasOwnProperty('spending_power'))
        obj.spending_power = ApiClient.convertToType(data['spending_power'], 'String');
      if (data.hasOwnProperty('targeting_expansion'))
        obj.targeting_expansion = AdgroupcreateTargetingExpansion.constructFromObject(data['targeting_expansion']);
    }
    return obj;
  }
}

/**
 * A list of action category objects.
 * @member {Array.<module:model/AdgroupcreateActions>} actions
 */
AdgroupUpdateBody.prototype.actions = undefined;

/**
 * Ad group ID
 * @member {String} adgroup_id
 */
AdgroupUpdateBody.prototype.adgroup_id = undefined;

/**
 * Ad group name. Character limit is 512 and cannot contain emoji.
 * @member {String} adgroup_name
 */
AdgroupUpdateBody.prototype.adgroup_name = undefined;

/**
 * Advertiser ID
 * @member {String} advertiser_id
 */
AdgroupUpdateBody.prototype.advertiser_id = undefined;

/**
 * Age groups you want to target. For enum values, see [Enumeration - Targeting Age Group](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {Array.<String>} age_groups
 */
AdgroupUpdateBody.prototype.age_groups = undefined;

/**
 * App download link
 * @member {String} app_download_url
 */
AdgroupUpdateBody.prototype.app_download_url = undefined;

/**
 * The Application id of the promoted app. You can get `app_id` by using the [/app/list/](https://ads.tiktok.com/marketing_api/docs?id=1740859313270786) endpoint. Required in the following use cases- When `objective_type` is `APP_INSTALL`.When `objective_type` is `APP_PROMOTION` and `app_promotion_type` is `APP_RETARGETING` (App retargeting).When `objective_type` is `APP_PROMOTION` , `app_promotion_type` is `APP_INSTALL`(App install), and it is not an iOS14 Dedicated Campaign.When `objective_type` is `CONVERSIONS` and `promotion_type` is `APP_ANDROID` or `APP_IOS`
 * @member {String} app_id
 */
AdgroupUpdateBody.prototype.app_id = undefined;

/**
 * List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746) endpoint.
 * @member {Array.<String>} audience_ids
 */
AdgroupUpdateBody.prototype.audience_ids = undefined;

/**
 * @member {module:model/AdgroupcreateAudienceRule} audience_rule
 */
AdgroupUpdateBody.prototype.audience_rule = undefined;

/**
 * App retargeting audience type, required when objective_type is `CONVERSIONS` and externla_type is app-related. Currently, the only supported enumeration is `NEW_CUSTOM_AUDIENCE`; for this type, you must pass audience IDs to the `audience_ids` field when creating or updating the ad group. The audiences to be used must be either Custom File Audience or App Activity Audience. Optionally, you can specify the `excluded_audience_ids` field. If both `audience_ids` and `excluded_audience_ids` are specified, they cannot contain the same IDs
 * @member {String} audience_type
 */
AdgroupUpdateBody.prototype.audience_type = undefined;

/**
 * Whether to enable automated targeting.
 * @member {Boolean} auto_targeting_enabled
 */
AdgroupUpdateBody.prototype.auto_targeting_enabled = undefined;

/**
 * The maximum cost per result you are willing to bid (for Bid Cap bidding strategy), or an average cost per result that you want to achieve (for Cost Cap bidding strategy). When Campaign Budget Optimization (`budget_optimize_on`) is on, we suggest that you set the same bid value for all ad groups in the campaign. Note- To specify `bid_price`, you need to set `bid_type` as `BID_TYPE_CUSTOM`.`bid_price` needs to be lower than budget set at the campaign level and ad group level. See [Bidding-Bidding limits](https://ads.tiktok.com/marketing_api/docs?id=1745292444424193) to learn more about the bid verification mechanism.
 * @member {Number} bid_price
 */
AdgroupUpdateBody.prototype.bid_price = undefined;

/**
 * Bidding strategy that determines how the system manages your cost per result, spends your budget, and how it delivers ads. Required when Campaign Budget Optimization (CBO) is enabled (`budget_optimize_on` = `TRUE`). For enum values, see [Enumeration - Bidding Strategy](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {String} bid_type
 */
AdgroupUpdateBody.prototype.bid_type = undefined;

/**
 * Events that you want to pay for. For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).|
 * @member {String} billing_event
 */
AdgroupUpdateBody.prototype.billing_event = undefined;

/**
 * Pangle app block list ID. You can get an ID via the `app_package_id` field returned by [Get Pangle block list](https://ads.tiktok.com/marketing_api/docs?id=1740039957181441). It only takes effect when Pangle placement is selected.
 * @member {Array.<String>} blocked_pangle_app_ids
 */
AdgroupUpdateBody.prototype.blocked_pangle_app_ids = undefined;

/**
 * Valid only when `placements` is set as `PLACEMENT_TIKTOK`. Default value- `NO_BRAND_SAFETY`. Enum values- `NO_BRAND_SAFETY`-  To not use any brand safety solution.  Full inventory, which means your ads may appear next to some content featuring mature themes. `STANDARD_INVENTORY`- Use TikTok's brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. `LIMITED_INVENTORY`- Use TikTok's brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes.`THIRD_PARTY`- Use a third-party brand safety solution. You also need to pass in a value to the `brand_safety_partner` field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the [/tool/region/] function. Note -   Pre-bid first-party Brand Safety solutions for `APP_PROMOTION`, `APP_INSTALL`, `WEB_CONVERSIONS`, `CONVERSIONS`, `TRAFFIC`,  `LEAD_GENERATION` objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative.  Pre-bid third-party Brand Safety solutions are not supported for TikTok Pulse campaigns (`rf_campaign_type` =`PULSE`).  See [Brand safety](https://ads.tiktok.com/marketing_api/docs?id=1739381752981505) to learn about the supported advertising objectives, supported markets, and the general introduction of pre-bid Brand Safety filtering.  Once set, this field cannot be modified.
 * @member {String} brand_safety_type
 */
AdgroupUpdateBody.prototype.brand_safety_type = undefined;

/**
 * Ad group budget. The setting will be ignored when Campaign Budget Optimization (`budget_optimize_on` = `TRUE`) is enabled. For how to configure budget settings, see [Budget](https://ads.tiktok.com/marketing_api/docs?id=1739381246298114). To directly see the daily budget value range for a currency, see [Currency-Daily budget value range](https://ads.tiktok.com/marketing_api/docs?id=1737585839634433).
 * @member {Number} budget
 */
AdgroupUpdateBody.prototype.budget = undefined;

/**
 * Carriers that you want to target. A carrier is valid only when the `in_use` field for the carrier is `true`. The carriers must be consistent with the location(s) that you want to target. Use [/tool/carrier/](https://ads.tiktok.com/marketing_api/docs?id=1737168013095938) endpoint to get the enum values.
 * @member {Array.<String>} carrier_ids
 */
AdgroupUpdateBody.prototype.carrier_ids = undefined;

/**
 * For catalogs in Business Center, you must specify the ID of the Business Center that a catalog belongs to.
 * @member {String} catalog_authorized_bc_id
 */
AdgroupUpdateBody.prototype.catalog_authorized_bc_id = undefined;

/**
 * Whether to allow comments on your ads on TikTok.
 * @member {String} comment_disabled
 */
AdgroupUpdateBody.prototype.comment_disabled = undefined;

/**
 * Contextual tag IDs. You can use [/tool/contextual_tag/get/](https://ads.tiktok.com/marketing_api/docs?id=1747747118654465) to get available contextual tags.  See [Contextual targeting](https://ads.tiktok.com/marketing_api/docs?id=1745292519923713)  to learn more about how to use contextual targeting.<p><span style=\"color-darkred\"><b>Note</b></span>- This is an allowlist-only feature. If you would like to access it, please contact your TikTok representative.Only supports `REACH` and `VIDEO_VIEWS` as objectives (`objective_type`) at the campaign level. Not supported when `brand_safety_type` is set to `THIRD_PARTY`.
 * @member {Array.<String>} contextual_tag_ids
 */
AdgroupUpdateBody.prototype.contextual_tag_ids = undefined;

/**
 * Where you can set a target cost per conversion for oCPM(Optimized Cost per Mille); Required when `billing_event` = `OCPM` and `bid_type` = `BID_TYPE_CUSTOM`.`conversion_bid_price` needs to be lower than budget set at the campaign level and ad group level. See [Bidding-Bidding limits](https://ads.tiktok.com/marketing_api/docs?id=1745292444424193) to learn more about the bid verification mechanism.
 * @member {Number} conversion_bid_price
 */
AdgroupUpdateBody.prototype.conversion_bid_price = undefined;

/**
 * Conversion Id
 * @member {Number} conversion_id
 */
AdgroupUpdateBody.prototype.conversion_id = undefined;

/**
 * The strategy that your creatives will be delivered.<br data-tomark-pass>`Note`- When you choose automated ad, your creative materials will automatically be combined for delivery. Tiktok Ads' smart optimization algorithm is applied and will be used to achieve the best ad performance during delivery. <br data-tomark-pass>Optional values include- `CUSTOM` (custom), `DYNAMIC` (automated). Default value is `CUSTOM` (custom). See [help center](https://ads.tiktok.com/help/article?aid=6670043695674294277) for more.
 * @member {String} creative_material_mode
 */
AdgroupUpdateBody.prototype.creative_material_mode = undefined;

/**
 * Ad delivery arrangement, in the format of a string that consists of 48 x 7 characters. Each character is mapped to a 30-minute timeframe from Monday to Sunday. Each character can be set to either 0 or 1. 1 represents delivery in the 30-minute timeframe, and 0 stands for non-delivery in the 30-minute timeframe. The first character is mapped to 0-01-0-30 of Monday; The second character is mapped to 0-31-1-00 of Monday, and the last character represents 23-31-0-00 Sunday.
 * @member {String} dayparting
 */
AdgroupUpdateBody.prototype.dayparting = undefined;

/**
 * Bidding strategy for in-app events. Required when Campaign Budget Optimization (CBO) is enabled (`budget_optimize_on` = `TRUE`)  and `optimization_goal` is `VALUE`. Enum values- `VO_MIN_ROAS` (allowlisted), `VO_HIGHEST_VALUE` (allowlisted). For details, see [Enumeration - Deep-level Bidding Strategy](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {String} deep_bid_type
 */
AdgroupUpdateBody.prototype.deep_bid_type = undefined;

/**
 * Deep CPA bid
 * @member {Number} deep_cpa_bid
 */
AdgroupUpdateBody.prototype.deep_cpa_bid = undefined;

/**
 * IDs of the device models that you want to target. Use [/tool/device_model/](https://ads.tiktok.com/marketing_api/docs?id=1737172880570369) to get the complete list of device model IDs and their statuses, and only active devices (`is_active` = `True` in the response of  [/tool/device_model/](https://ads.tiktok.com/marketing_api/docs?id=1737172880570369)) can be used to create ads.
 * @member {Array.<String>} device_model_ids
 */
AdgroupUpdateBody.prototype.device_model_ids = undefined;

/**
 * Targeting device price range. 10000 means 1000+. The numbers must be in multiples of 50. The upper limit you set will be added by 50 and the resulting new number will be used as the actual upper limit for device targeting. The actual upper limit is shown in the ad group settings in TikTok Ads Manager. If you set and get the price range of [0, 250], it actually means [0, 300].
 * @member {Array.<Number>} device_price_ranges
 */
AdgroupUpdateBody.prototype.device_price_ranges = undefined;

/**
 * List of audience ID to be excluded. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746) endpoint.
 * @member {Array.<String>} excluded_audience_ids
 */
AdgroupUpdateBody.prototype.excluded_audience_ids = undefined;

/**
 * @member {module:model/AdgroupcreateExcludedCustomActions} excluded_custom_actions
 */
AdgroupUpdateBody.prototype.excluded_custom_actions = undefined;

/**
 * IDs of the Pangle audiences that you want to exclude. Valid only for Pangle placement. You can get audience IDs (`package_id`) by using the [/pangle_audience_package/get/](https://ads.tiktok.com/marketing_api/docs?id=1740040177229826) endpoint. You need to set `bind_type` to `EXCLUDE`. Do not specify this field and `included_pangle_audience_package_ids` at the same time.
 * @member {Array.<String>} excluded_pangle_audience_package_ids
 */
AdgroupUpdateBody.prototype.excluded_pangle_audience_package_ids = undefined;

/**
 * Frequency, together with `frequency_schedule`, controls how often people see your ad (only available for `REACH` ads). The below conditions should be both met-1 <= `frequency` <= `frequency_schedule` * 3 1 <= `frequency_schedule` <=7 For example, `frequency` = 2 & `frequency_schedule` = 3 means \"show ads no more than twice every 3 day\".
 * @member {Number} frequency
 */
AdgroupUpdateBody.prototype.frequency = undefined;

/**
 * Frequency_schedule`, together with `frequency`, controls how often people see your ad (only available for `REACH` ads). See `frequency` fields for more.
 * @member {Number} frequency_schedule
 */
AdgroupUpdateBody.prototype.frequency_schedule = undefined;

/**
 * Gender that you want to target. Enum values- `GENDER_FEMALE`,`GENDER_MALE`,`GENDER_UNLIMITED`
 * @member {String} gender
 */
AdgroupUpdateBody.prototype.gender = undefined;

/**
 * Household income that you want to target. Enum values- `TOP5`(Top 5% of ZIP codes), `TOP10`(Top 10% of ZIP codes), `TOP10_25`(Top 10% -25% of ZIP codes), `TOP25_50`(Top 25% - 50% of ZIP codes). Note-  It only supports the ad objectives for Auction ads. See [Advertising objectives](https://ads.tiktok.com/marketing_api/docs?id=1737585562434561) for details. It  is only applicable the TikTok Placement in US. If you have specified `special_industries` at the campaign level, then you cannot use the field here. `household_income` is an allowlist-only feature that is only available in US. If you would like to access it, please contact your TikTok representative.
 * @member {Array.<String>} household_income
 */
AdgroupUpdateBody.prototype.household_income = undefined;

/**
 * ID of the Business Center that a TikTok Account User in Business Center identity is associated with. Required when `identity_type` is `BC_AUTH_TT`.
 * @member {String} identity_authorized_bc_id
 */
AdgroupUpdateBody.prototype.identity_authorized_bc_id = undefined;

/**
 * Identity ID. Required and only valid when `objective_type` is `SHOP_PURCHASES` or `PRODUCT_SALES`.
 * @member {String} identity_id
 */
AdgroupUpdateBody.prototype.identity_id = undefined;

/**
 * Identity type. Enum values- `AUTH_CODE` (Authorized Post User), `TT_USER` (TikTok Business Account User), `BC_AUTH_TT`(The TikTok account that a Business Center is authorized to access). Required and only valid when `objective_type` is `SHOP_PURCHASES` or `PRODUCT_SALES`. See [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097) for details.
 * @member {String} identity_type
 */
AdgroupUpdateBody.prototype.identity_type = undefined;

/**
 * @member {module:model/AdgroupcreateIncludedCustomActions} included_custom_actions
 */
AdgroupUpdateBody.prototype.included_custom_actions = undefined;

/**
 * IDs of the Pangle audiences that you want to include. Valid only for Pangle placement. You can get audience IDs (`package_id`) by using the [/pangle_audience_package/get/](https://ads.tiktok.com/marketing_api/docs?id=1740040177229826) endpoint. You need to set `bind_type` to `INCLUDE`.  Do not specify this field and `excluded_pangle_audience_package_ids` at the sa
 * @member {Array.<String>} included_pangle_audience_package_ids
 */
AdgroupUpdateBody.prototype.included_pangle_audience_package_ids = undefined;

/**
 * Interest classification. If the interest is specified, users that do not meet interest target will be excluded during delivery. Do not specify if you wish to target everyone. Use [/tool/target_recommend_tags/](https://ads.tiktok.com/marketing_api/docs?id=1736275204260866) to get a list of recommended interest categories based on your targeting regions and your industries. Use [/tool/interest_category/](https://ads.tiktok.com/marketing_api/docs?id=1737174348712961) endpoint to get the complete list of interest categories.
 * @member {Array.<String>} interest_category_ids
 */
AdgroupUpdateBody.prototype.interest_category_ids = undefined;

/**
 * IDs of interest keywords that you want to use to target audience. You can get recommended interest keywords IDs by using the [/tool/interest_keyword/recommend/](https://ads.tiktok.com/marketing_api/docs?id=1737180852720642) endpoint.
 * @member {Array.<String>} interest_keyword_ids
 */
AdgroupUpdateBody.prototype.interest_keyword_ids = undefined;

/**
 *  Interest Keywords
 * @member {Array.<String>} interest_keywords
 */
AdgroupUpdateBody.prototype.interest_keywords = undefined;

/**
 * The iOS devices that you want to target. When `campaign_type` of the campaign is set as `IOS14_CAMPAIGN`,  `ios14_targeting` is required and must be specified as `IOS14_PLUS`. Enum values-`UNSET`- Devices with iOS 14.4 or earlier versions. The default value for ad groups that were created before the introduction of this field.`IOS14_MINUS`- Devices with versions earlier than iOS 14.0, which are not affected by the iOS 14 privacy update. This is the default value for ad groups that are created after the introduction of this field.`IOS14_PLUS`- Devices with iOS 14.5 and above. The iOS 14 privacy update has been enforced in this group of devices. Specify this value if you want to create an iOS 14 campaign.  Each iOS 14 campaign can have up to 2 active ad groups. <br data-tomark-pass> If `IOS14_PLUS` is specified, this field cannot be updated. If `IOS14_PLUS` is specified for this field, the system will verify if related fields meet the requirements for an iOS 14 campaign. The following fields will be checked. `app_id`- It must not be an ID of an Android app.`operating_systems`- It must not be `ANDROID` or `PC`.`min_ios_version`- You must specify a value for this field, and the the value must not contradict with the selection for `ios14_targeting`.`min_android_version`- Must not be specified.`optimization_goal`- Can only be set to `IN_APP_EVENT`, `INSTALL`, or `CLICK`.`shopping_ads_retargeting_type`- Must not be specified.`shopping_ads_retargeting_actions_days`- Must not be specified. `conversion_window`- Must not be specified.On the Ad level, `deeplink_type` must not be set to `DEFERRED_DEEPLINK`.
 * @member {String} ios14_targeting
 */
AdgroupUpdateBody.prototype.ios14_targeting = undefined;

/**
 * Whether the promoted content is HFSS foods (foods that are high in fat, salt, or sugar).
 * @member {Boolean} is_hfss
 */
AdgroupUpdateBody.prototype.is_hfss = undefined;

/**
 * Codes of the languages that you want to target. For the list of languages codes supported, see [Enumeration - Language Code](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).You can get language codes via [/tool/language/](https://ads.tiktok.com/marketing_api/docs?id=1737188554152962), and if you don't want to limit the languages you target, assign an empty value to this field or do not pass in this field.
 * @member {Array.<String>} languages
 */
AdgroupUpdateBody.prototype.languages = undefined;

/**
 * IDs of the locations that you want to target. To get the available locations and corresponding IDs based on your placement and objective, use the [/tool/region/](https://ads.tiktok.com/marketing_api/docs?id=1737189539571713) endpoint. To get the list of location IDs, see [Location IDs](https://ads.tiktok.com/marketing_api/docs?id=1739311040498689).
 * @member {Array.<String>} location_ids
 */
AdgroupUpdateBody.prototype.location_ids = undefined;

/**
 * Minimum device Android version. For enum values, see [Enumeration - Minimum Android Version](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {String} min_android_version
 */
AdgroupUpdateBody.prototype.min_android_version = undefined;

/**
 * Minimum iOS version. For enum values, see [Enumeration - Minimum iOS Version](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). This field is required when `ios14_targeting` is specified.
 * @member {String} min_ios_version
 */
AdgroupUpdateBody.prototype.min_ios_version = undefined;

/**
 * Device connection types that you want to target. Default- `unlimited`. For enum values, see [Enumeration - Connection Type](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).
 * @member {Array.<String>} network_types
 */
AdgroupUpdateBody.prototype.network_types = undefined;

/**
 * Day 2 retention ratio. Formula- `next_day_retention` = `conversion_bid_price`/`deep_cpa_bid`. Value range is (0,1]. Only valid when `placements` is `PLACEMENT_PANGLE` and `secondary_optimization_event` is `NEXT_DAY_OPEN`. If you want to use this field, please pass in `conversion_bid_price`, `deep_cpa_bid`, and `next_day_retention` at the same time, and make sure the value of them meets the calculation formula. Otherwise there might be unexpected errors.
 * @member {Number} next_day_retention
 */
AdgroupUpdateBody.prototype.next_day_retention = undefined;

/**
 * Device operating systems that you want to target. Only one value is allowed.  Enum values- `ANDROID`, `IOS`. This field is required in two scenarios- `objective_type` = `APP_INSTALL``objective`=`TRAFFIC` and `optimization_event` = `APP_IOS` or `APP_ANDROID`
 * @member {Array.<String>} operating_systems
 */
AdgroupUpdateBody.prototype.operating_systems = undefined;

/**
 * You can choose between `PACING_MODE_SMOOTH` and `PACING_MODE_FAST`. For `PACING_MODE_SMOOTH`, the budget is allocated evenly within the scheduled time. `PACING_MODE_FAST` would consume budget and produce results as soon as possible. When Campaign Budget Optimization (`budget_optimize_on`) is on, your setting will be ignored and it will be set as `PACING_MODE_SMOOTH`. Otherwise, this field is required.
 * @member {String} pacing
 */
AdgroupUpdateBody.prototype.pacing = undefined;

/**
 * IDs of purchase intention keywords that you want to use to target audiences with an interest in purchases related to a content category. To get purchase intention keyword IDs, you need to set `audience_type` as `PURCHASE_INTENTION` when calling [/tool/interest_keyword/recommend/](https://ads.tiktok.com/marketing_api/docs?id=1737180852720642) and then get purchase intention keyword IDs from `keyword_id` in the response. Note-Do not pass in `purchase_intention_keyword_ids` and `interest_keyword_ids` at the same time. Otherwise, keyword conflict will occur.`purchase_intention_keyword_ids` only supports auctions ads with the corresponding advertising objective(`objective_type`) as App promotion (`APP_PROMOTION`), Conversions (`CONVERSIONS` ) ，or Product sales (`PRODUCT_SALES` when the corresponding `promotion_type` = `APP_ANDROID`, `APP_IOS`, or `WEBSITE`）, and the placement setting should include TikTok.
 * @member {Array.<String>} purchase_intention_keyword_ids
 */
AdgroupUpdateBody.prototype.purchase_intention_keyword_ids = undefined;

/**
 * ROAS goal for Value Optimization. Required when `deep_bid_type` is `VO_MIN_ROAS`.
 * @member {Number} roas_bid
 */
AdgroupUpdateBody.prototype.roas_bid = undefined;

/**
 * Schedule end time (UTC+0), in the format of \"YYYY-MM-DD HH-MM-SS\". This field is required when `schedule_type` is `SCHEDULE_START_END` or `budget_mode` is `BUDGET_MODE_TOTAL`
 * @member {String} schedule_end_time
 */
AdgroupUpdateBody.prototype.schedule_end_time = undefined;

/**
 * Schedule start time (UTC+0), in the format of \"YYYY-MM-DD HH-MM-SS\". The start time can be up to 12 hours earlier than the current time.
 * @member {String} schedule_start_time
 */
AdgroupUpdateBody.prototype.schedule_start_time = undefined;

/**
 * The schedule type can be either `SCHEDULE_START_END` or `SCHEDULE_FROM_NOW`. If you choose `SCHEDULE_START_END`, you need to specify a start time and an end time. If you choose `SCHEDULE_FROM_NOW`, you only need to specify a start time and the end time will be automatically set to 10 years later than the start time. If `budget_mode` is `BUDGET_MODE_TOTAL`, this field must be set to `SCHEDULE_START_END`.
 * @member {String} schedule_type
 */
AdgroupUpdateBody.prototype.schedule_type = undefined;

/**
 * The secondary goal when optimization goal (`optimization_goal`) is Install (`INSTALL`) or Value (`VALUE`). For enum values, see [Conversion events - Secondary-goal events](https://ads.tiktok.com/marketing_api/docs?id=1739361474981889).
 * @member {String} secondary_optimization_event
 */
AdgroupUpdateBody.prototype.secondary_optimization_event = undefined;

/**
 * The valid time range for the specified audience action. Audiences who have completed the specified action within the time range will be retargeted by the shopping ads. Required when `shopping_ads_retargeting_type` is `LAB1` or `LAB2`.
 * @member {Number} shopping_ads_retargeting_actions_days
 */
AdgroupUpdateBody.prototype.shopping_ads_retargeting_actions_days = undefined;

/**
 * Valid when the campaign `objective_type` is `PRODUCT_SALES`. The retargeting type of shopping ads. Enum values- `LAB1`- Retargeting audiences who viewed products or added products to cart but didn't purchase products. `LAB2`- Retargeting audiences who added products to cart but didn't purchase products. `LAB3`- Retargeting audiences using custom combination. `OFF`- No retargeting.
 * @member {String} shopping_ads_retargeting_type
 */
AdgroupUpdateBody.prototype.shopping_ads_retargeting_type = undefined;

/**
 * Spending power that you want to target. Enum values- `ALL`, `HIGH`.   If it is set to `HIGH`, you can target high spending users who typically spend more on purchases than average users.  Note-  It is only applicable to the TikTok placement. Your `placements` field must contain the enum value of `PLACEMENT_TIKTOK` . It only supports the ad objectives for Auction ads. See [Advertising objectives](https://ads.tiktok.com/marketing_api/docs?id=1737585562434561) for details.  It cannot be used with special industries targeting at the same time. If you have specified `special_industries` at the campaign level, then you cannot use the field here. When `auto_targeting_enabled` is `True` at the ad group level, then `spending_power`  will be automatically set to `ALL`.  Enum values are `ALL` and `HIGH`. Even if you don't specify this field,  then we will still return `ALL` spending power users.
 * @member {String} spending_power
 */
AdgroupUpdateBody.prototype.spending_power = undefined;

/**
 * @member {module:model/AdgroupcreateTargetingExpansion} targeting_expansion
 */
AdgroupUpdateBody.prototype.targeting_expansion = undefined;

