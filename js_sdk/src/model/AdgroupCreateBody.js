/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdgroupcreateActions} from './AdgroupcreateActions.js';
import {AdgroupcreateAppConfig} from './AdgroupcreateAppConfig.js';
import {AdgroupcreateExcludedCustomActions} from './AdgroupcreateExcludedCustomActions.js';
import {AdgroupcreateIncludedCustomActions} from './AdgroupcreateIncludedCustomActions.js';
import {AdgroupcreateSearchKeywords} from './AdgroupcreateSearchKeywords.js';

/**
 * The AdgroupCreateBody model module.
 * @module model/AdgroupCreateBody
 * @version 0.1.9
 */
export class AdgroupCreateBody {
  /**
   * Constructs a new <code>AdgroupCreateBody</code>.
   * @alias module:model/AdgroupCreateBody
   * @class
   * @param adgroup_name {String} 
   * @param advertiser_id {String} 
   * @param billing_event {String} 
   * @param budget {Number} 
   * @param budget_mode {String} 
   * @param campaign_id {String} 
   * @param optimization_goal {String} 
   * @param pacing {String} 
   * @param schedule_start_time {String} 
   * @param schedule_type {String} 
   */
  constructor(adgroup_name, advertiser_id, billing_event, budget, budget_mode, campaign_id, optimization_goal, pacing, schedule_start_time, schedule_type) {
    this.adgroup_name = adgroup_name;
    this.advertiser_id = advertiser_id;
    this.billing_event = billing_event;
    this.budget = budget;
    this.budget_mode = budget_mode;
    this.campaign_id = campaign_id;
    this.optimization_goal = optimization_goal;
    this.pacing = pacing;
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
      if (data.hasOwnProperty('app_config'))
        obj.app_config = ApiClient.convertToType(data['app_config'], [AdgroupcreateAppConfig]);
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('attribution_event_count'))
        obj.attribution_event_count = ApiClient.convertToType(data['attribution_event_count'], 'String');
      if (data.hasOwnProperty('audience_ids'))
        obj.audience_ids = ApiClient.convertToType(data['audience_ids'], ['String']);
      if (data.hasOwnProperty('audience_rule'))
        obj.audience_rule = ApiClient.convertToType(data['audience_rule'], Object);
      if (data.hasOwnProperty('audience_type'))
        obj.audience_type = ApiClient.convertToType(data['audience_type'], 'String');
      if (data.hasOwnProperty('automated_keywords_enabled'))
        obj.automated_keywords_enabled = ApiClient.convertToType(data['automated_keywords_enabled'], 'Boolean');
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
      if (data.hasOwnProperty('campaign_id'))
        obj.campaign_id = ApiClient.convertToType(data['campaign_id'], 'String');
      if (data.hasOwnProperty('carrier_ids'))
        obj.carrier_ids = ApiClient.convertToType(data['carrier_ids'], ['String']);
      if (data.hasOwnProperty('catalog_authorized_bc_id'))
        obj.catalog_authorized_bc_id = ApiClient.convertToType(data['catalog_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('category_exclusion_ids'))
        obj.category_exclusion_ids = ApiClient.convertToType(data['category_exclusion_ids'], ['String']);
      if (data.hasOwnProperty('click_attribution_window'))
        obj.click_attribution_window = ApiClient.convertToType(data['click_attribution_window'], 'String');
      if (data.hasOwnProperty('comment_disabled'))
        obj.comment_disabled = ApiClient.convertToType(data['comment_disabled'], 'Boolean');
      if (data.hasOwnProperty('contextual_tag_ids'))
        obj.contextual_tag_ids = ApiClient.convertToType(data['contextual_tag_ids'], ['String']);
      if (data.hasOwnProperty('conversion_bid_price'))
        obj.conversion_bid_price = ApiClient.convertToType(data['conversion_bid_price'], 'Number');
      if (data.hasOwnProperty('creative_material_mode'))
        obj.creative_material_mode = ApiClient.convertToType(data['creative_material_mode'], 'String');
      if (data.hasOwnProperty('custom_conversion_id'))
        obj.custom_conversion_id = ApiClient.convertToType(data['custom_conversion_id'], 'String');
      if (data.hasOwnProperty('dayparting'))
        obj.dayparting = ApiClient.convertToType(data['dayparting'], 'String');
      if (data.hasOwnProperty('deep_bid_type'))
        obj.deep_bid_type = ApiClient.convertToType(data['deep_bid_type'], 'String');
      if (data.hasOwnProperty('deep_cpa_bid'))
        obj.deep_cpa_bid = ApiClient.convertToType(data['deep_cpa_bid'], 'Number');
      if (data.hasOwnProperty('deep_funnel_event_source'))
        obj.deep_funnel_event_source = ApiClient.convertToType(data['deep_funnel_event_source'], 'String');
      if (data.hasOwnProperty('deep_funnel_event_source_id'))
        obj.deep_funnel_event_source_id = ApiClient.convertToType(data['deep_funnel_event_source_id'], 'String');
      if (data.hasOwnProperty('deep_funnel_optimization_event'))
        obj.deep_funnel_optimization_event = ApiClient.convertToType(data['deep_funnel_optimization_event'], 'String');
      if (data.hasOwnProperty('deep_funnel_optimization_status'))
        obj.deep_funnel_optimization_status = ApiClient.convertToType(data['deep_funnel_optimization_status'], 'String');
      if (data.hasOwnProperty('device_model_ids'))
        obj.device_model_ids = ApiClient.convertToType(data['device_model_ids'], ['String']);
      if (data.hasOwnProperty('device_price_ranges'))
        obj.device_price_ranges = ApiClient.convertToType(data['device_price_ranges'], ['Number']);
      if (data.hasOwnProperty('engaged_view_attribution_window'))
        obj.engaged_view_attribution_window = ApiClient.convertToType(data['engaged_view_attribution_window'], 'String');
      if (data.hasOwnProperty('excluded_audience_ids'))
        obj.excluded_audience_ids = ApiClient.convertToType(data['excluded_audience_ids'], ['String']);
      if (data.hasOwnProperty('excluded_custom_actions'))
        obj.excluded_custom_actions = ApiClient.convertToType(data['excluded_custom_actions'], [AdgroupcreateExcludedCustomActions]);
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
        obj.included_custom_actions = ApiClient.convertToType(data['included_custom_actions'], [AdgroupcreateIncludedCustomActions]);
      if (data.hasOwnProperty('included_pangle_audience_package_ids'))
        obj.included_pangle_audience_package_ids = ApiClient.convertToType(data['included_pangle_audience_package_ids'], ['String']);
      if (data.hasOwnProperty('interest_category_ids'))
        obj.interest_category_ids = ApiClient.convertToType(data['interest_category_ids'], ['String']);
      if (data.hasOwnProperty('interest_keyword_ids'))
        obj.interest_keyword_ids = ApiClient.convertToType(data['interest_keyword_ids'], ['String']);
      if (data.hasOwnProperty('ios14_targeting'))
        obj.ios14_targeting = ApiClient.convertToType(data['ios14_targeting'], 'String');
      if (data.hasOwnProperty('is_hfss'))
        obj.is_hfss = ApiClient.convertToType(data['is_hfss'], 'Boolean');
      if (data.hasOwnProperty('is_lhf_compliance'))
        obj.is_lhf_compliance = ApiClient.convertToType(data['is_lhf_compliance'], 'Boolean');
      if (data.hasOwnProperty('isp_ids'))
        obj.isp_ids = ApiClient.convertToType(data['isp_ids'], ['String']);
      if (data.hasOwnProperty('languages'))
        obj.languages = ApiClient.convertToType(data['languages'], ['String']);
      if (data.hasOwnProperty('location_ids'))
        obj.location_ids = ApiClient.convertToType(data['location_ids'], ['String']);
      if (data.hasOwnProperty('message_event_set_id'))
        obj.message_event_set_id = ApiClient.convertToType(data['message_event_set_id'], 'String');
      if (data.hasOwnProperty('messaging_app_account_id'))
        obj.messaging_app_account_id = ApiClient.convertToType(data['messaging_app_account_id'], 'String');
      if (data.hasOwnProperty('messaging_app_type'))
        obj.messaging_app_type = ApiClient.convertToType(data['messaging_app_type'], 'String');
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
      if (data.hasOwnProperty('phone_number'))
        obj.phone_number = ApiClient.convertToType(data['phone_number'], 'String');
      if (data.hasOwnProperty('phone_region_calling_code'))
        obj.phone_region_calling_code = ApiClient.convertToType(data['phone_region_calling_code'], 'String');
      if (data.hasOwnProperty('phone_region_code'))
        obj.phone_region_code = ApiClient.convertToType(data['phone_region_code'], 'String');
      if (data.hasOwnProperty('pixel_id'))
        obj.pixel_id = ApiClient.convertToType(data['pixel_id'], 'String');
      if (data.hasOwnProperty('placement_type'))
        obj.placement_type = ApiClient.convertToType(data['placement_type'], 'String');
      if (data.hasOwnProperty('placements'))
        obj.placements = ApiClient.convertToType(data['placements'], ['String']);
      if (data.hasOwnProperty('product_source'))
        obj.product_source = ApiClient.convertToType(data['product_source'], 'String');
      if (data.hasOwnProperty('promotion_target_type'))
        obj.promotion_target_type = ApiClient.convertToType(data['promotion_target_type'], 'String');
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
      if (data.hasOwnProperty('saved_audience_id'))
        obj.saved_audience_id = ApiClient.convertToType(data['saved_audience_id'], 'String');
      if (data.hasOwnProperty('schedule_end_time'))
        obj.schedule_end_time = ApiClient.convertToType(data['schedule_end_time'], 'String');
      if (data.hasOwnProperty('schedule_start_time'))
        obj.schedule_start_time = ApiClient.convertToType(data['schedule_start_time'], 'String');
      if (data.hasOwnProperty('schedule_type'))
        obj.schedule_type = ApiClient.convertToType(data['schedule_type'], 'String');
      if (data.hasOwnProperty('search_keywords'))
        obj.search_keywords = ApiClient.convertToType(data['search_keywords'], [AdgroupcreateSearchKeywords]);
      if (data.hasOwnProperty('search_result_enabled'))
        obj.search_result_enabled = ApiClient.convertToType(data['search_result_enabled'], 'Boolean');
      if (data.hasOwnProperty('secondary_optimization_event'))
        obj.secondary_optimization_event = ApiClient.convertToType(data['secondary_optimization_event'], 'String');
      if (data.hasOwnProperty('share_disabled'))
        obj.share_disabled = ApiClient.convertToType(data['share_disabled'], 'Boolean');
      if (data.hasOwnProperty('shopping_ads_retargeting_actions_days'))
        obj.shopping_ads_retargeting_actions_days = ApiClient.convertToType(data['shopping_ads_retargeting_actions_days'], 'Number');
      if (data.hasOwnProperty('shopping_ads_retargeting_custom_audience_relation'))
        obj.shopping_ads_retargeting_custom_audience_relation = ApiClient.convertToType(data['shopping_ads_retargeting_custom_audience_relation'], 'String');
      if (data.hasOwnProperty('shopping_ads_retargeting_type'))
        obj.shopping_ads_retargeting_type = ApiClient.convertToType(data['shopping_ads_retargeting_type'], 'String');
      if (data.hasOwnProperty('shopping_ads_type'))
        obj.shopping_ads_type = ApiClient.convertToType(data['shopping_ads_type'], 'String');
      if (data.hasOwnProperty('skip_learning_phase'))
        obj.skip_learning_phase = ApiClient.convertToType(data['skip_learning_phase'], 'Boolean');
      if (data.hasOwnProperty('smart_audience_enabled'))
        obj.smart_audience_enabled = ApiClient.convertToType(data['smart_audience_enabled'], 'Boolean');
      if (data.hasOwnProperty('smart_interest_behavior_enabled'))
        obj.smart_interest_behavior_enabled = ApiClient.convertToType(data['smart_interest_behavior_enabled'], 'Boolean');
      if (data.hasOwnProperty('spending_power'))
        obj.spending_power = ApiClient.convertToType(data['spending_power'], 'String');
      if (data.hasOwnProperty('statistic_type'))
        obj.statistic_type = ApiClient.convertToType(data['statistic_type'], 'String');
      if (data.hasOwnProperty('store_authorized_bc_id'))
        obj.store_authorized_bc_id = ApiClient.convertToType(data['store_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('store_id'))
        obj.store_id = ApiClient.convertToType(data['store_id'], 'String');
      if (data.hasOwnProperty('tiktok_subplacements'))
        obj.tiktok_subplacements = ApiClient.convertToType(data['tiktok_subplacements'], ['String']);
      if (data.hasOwnProperty('vbo_window'))
        obj.vbo_window = ApiClient.convertToType(data['vbo_window'], 'String');
      if (data.hasOwnProperty('vertical_sensitivity_id'))
        obj.vertical_sensitivity_id = ApiClient.convertToType(data['vertical_sensitivity_id'], 'String');
      if (data.hasOwnProperty('video_download_disabled'))
        obj.video_download_disabled = ApiClient.convertToType(data['video_download_disabled'], 'Boolean');
      if (data.hasOwnProperty('view_attribution_window'))
        obj.view_attribution_window = ApiClient.convertToType(data['view_attribution_window'], 'String');
      if (data.hasOwnProperty('zipcode_ids'))
        obj.zipcode_ids = ApiClient.convertToType(data['zipcode_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/AdgroupcreateActions>} actions
 */
AdgroupCreateBody.prototype.actions = undefined;

/**
 * @member {String} adgroup_app_profile_page_state
 */
AdgroupCreateBody.prototype.adgroup_app_profile_page_state = undefined;

/**
 * @member {String} adgroup_name
 */
AdgroupCreateBody.prototype.adgroup_name = undefined;

/**
 * @member {String} advertiser_id
 */
AdgroupCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<String>} age_groups
 */
AdgroupCreateBody.prototype.age_groups = undefined;

/**
 * @member {Array.<module:model/AdgroupcreateAppConfig>} app_config
 */
AdgroupCreateBody.prototype.app_config = undefined;

/**
 * @member {String} app_id
 */
AdgroupCreateBody.prototype.app_id = undefined;

/**
 * @member {String} attribution_event_count
 */
AdgroupCreateBody.prototype.attribution_event_count = undefined;

/**
 * @member {Array.<String>} audience_ids
 */
AdgroupCreateBody.prototype.audience_ids = undefined;

/**
 * @member {Object} audience_rule
 */
AdgroupCreateBody.prototype.audience_rule = undefined;

/**
 * @member {String} audience_type
 */
AdgroupCreateBody.prototype.audience_type = undefined;

/**
 * @member {Boolean} automated_keywords_enabled
 * @default false
 */
AdgroupCreateBody.prototype.automated_keywords_enabled = false;

/**
 * @member {String} bid_display_mode
 */
AdgroupCreateBody.prototype.bid_display_mode = undefined;

/**
 * @member {Number} bid_price
 */
AdgroupCreateBody.prototype.bid_price = undefined;

/**
 * @member {String} bid_type
 */
AdgroupCreateBody.prototype.bid_type = undefined;

/**
 * @member {String} billing_event
 */
AdgroupCreateBody.prototype.billing_event = undefined;

/**
 * @member {Array.<String>} blocked_pangle_app_ids
 */
AdgroupCreateBody.prototype.blocked_pangle_app_ids = undefined;

/**
 * @member {String} brand_safety_partner
 */
AdgroupCreateBody.prototype.brand_safety_partner = undefined;

/**
 * @member {String} brand_safety_type
 * @default 'NO_BRAND_SAFETY'
 */
AdgroupCreateBody.prototype.brand_safety_type = 'NO_BRAND_SAFETY';

/**
 * @member {Number} budget
 */
AdgroupCreateBody.prototype.budget = undefined;

/**
 * @member {String} budget_mode
 */
AdgroupCreateBody.prototype.budget_mode = undefined;

/**
 * @member {String} campaign_id
 */
AdgroupCreateBody.prototype.campaign_id = undefined;

/**
 * @member {Array.<String>} carrier_ids
 */
AdgroupCreateBody.prototype.carrier_ids = undefined;

/**
 * @member {String} catalog_authorized_bc_id
 */
AdgroupCreateBody.prototype.catalog_authorized_bc_id = undefined;

/**
 * @member {String} catalog_id
 */
AdgroupCreateBody.prototype.catalog_id = undefined;

/**
 * @member {Array.<String>} category_exclusion_ids
 */
AdgroupCreateBody.prototype.category_exclusion_ids = undefined;

/**
 * @member {String} click_attribution_window
 */
AdgroupCreateBody.prototype.click_attribution_window = undefined;

/**
 * @member {Boolean} comment_disabled
 */
AdgroupCreateBody.prototype.comment_disabled = undefined;

/**
 * @member {Array.<String>} contextual_tag_ids
 */
AdgroupCreateBody.prototype.contextual_tag_ids = undefined;

/**
 * @member {Number} conversion_bid_price
 */
AdgroupCreateBody.prototype.conversion_bid_price = undefined;

/**
 * @member {String} creative_material_mode
 * @default 'CUSTOM'
 */
AdgroupCreateBody.prototype.creative_material_mode = 'CUSTOM';

/**
 * @member {String} custom_conversion_id
 */
AdgroupCreateBody.prototype.custom_conversion_id = undefined;

/**
 * @member {String} dayparting
 */
AdgroupCreateBody.prototype.dayparting = undefined;

/**
 * @member {String} deep_bid_type
 */
AdgroupCreateBody.prototype.deep_bid_type = undefined;

/**
 * @member {Number} deep_cpa_bid
 */
AdgroupCreateBody.prototype.deep_cpa_bid = undefined;

/**
 * @member {String} deep_funnel_event_source
 */
AdgroupCreateBody.prototype.deep_funnel_event_source = undefined;

/**
 * @member {String} deep_funnel_event_source_id
 */
AdgroupCreateBody.prototype.deep_funnel_event_source_id = undefined;

/**
 * @member {String} deep_funnel_optimization_event
 */
AdgroupCreateBody.prototype.deep_funnel_optimization_event = undefined;

/**
 * @member {String} deep_funnel_optimization_status
 */
AdgroupCreateBody.prototype.deep_funnel_optimization_status = undefined;

/**
 * @member {Array.<String>} device_model_ids
 */
AdgroupCreateBody.prototype.device_model_ids = undefined;

/**
 * @member {Array.<Number>} device_price_ranges
 */
AdgroupCreateBody.prototype.device_price_ranges = undefined;

/**
 * @member {String} engaged_view_attribution_window
 */
AdgroupCreateBody.prototype.engaged_view_attribution_window = undefined;

/**
 * @member {Array.<String>} excluded_audience_ids
 */
AdgroupCreateBody.prototype.excluded_audience_ids = undefined;

/**
 * @member {Array.<module:model/AdgroupcreateExcludedCustomActions>} excluded_custom_actions
 */
AdgroupCreateBody.prototype.excluded_custom_actions = undefined;

/**
 * @member {Array.<String>} excluded_pangle_audience_package_ids
 */
AdgroupCreateBody.prototype.excluded_pangle_audience_package_ids = undefined;

/**
 * @member {Number} frequency
 */
AdgroupCreateBody.prototype.frequency = undefined;

/**
 * @member {Number} frequency_schedule
 */
AdgroupCreateBody.prototype.frequency_schedule = undefined;

/**
 * @member {String} gender
 */
AdgroupCreateBody.prototype.gender = undefined;

/**
 * @member {Array.<String>} household_income
 */
AdgroupCreateBody.prototype.household_income = undefined;

/**
 * @member {String} identity_authorized_bc_id
 */
AdgroupCreateBody.prototype.identity_authorized_bc_id = undefined;

/**
 * @member {String} identity_id
 */
AdgroupCreateBody.prototype.identity_id = undefined;

/**
 * @member {String} identity_type
 */
AdgroupCreateBody.prototype.identity_type = undefined;

/**
 * @member {Array.<module:model/AdgroupcreateIncludedCustomActions>} included_custom_actions
 */
AdgroupCreateBody.prototype.included_custom_actions = undefined;

/**
 * @member {Array.<String>} included_pangle_audience_package_ids
 */
AdgroupCreateBody.prototype.included_pangle_audience_package_ids = undefined;

/**
 * @member {Array.<String>} interest_category_ids
 */
AdgroupCreateBody.prototype.interest_category_ids = undefined;

/**
 * @member {Array.<String>} interest_keyword_ids
 */
AdgroupCreateBody.prototype.interest_keyword_ids = undefined;

/**
 * @member {String} ios14_targeting
 * @default 'UNSET'
 */
AdgroupCreateBody.prototype.ios14_targeting = 'UNSET';

/**
 * @member {Boolean} is_hfss
 * @default false
 */
AdgroupCreateBody.prototype.is_hfss = false;

/**
 * @member {Boolean} is_lhf_compliance
 * @default false
 */
AdgroupCreateBody.prototype.is_lhf_compliance = false;

/**
 * @member {Array.<String>} isp_ids
 */
AdgroupCreateBody.prototype.isp_ids = undefined;

/**
 * @member {Array.<String>} languages
 */
AdgroupCreateBody.prototype.languages = undefined;

/**
 * @member {Array.<String>} location_ids
 */
AdgroupCreateBody.prototype.location_ids = undefined;

/**
 * @member {String} message_event_set_id
 */
AdgroupCreateBody.prototype.message_event_set_id = undefined;

/**
 * @member {String} messaging_app_account_id
 */
AdgroupCreateBody.prototype.messaging_app_account_id = undefined;

/**
 * @member {String} messaging_app_type
 */
AdgroupCreateBody.prototype.messaging_app_type = undefined;

/**
 * @member {String} min_android_version
 */
AdgroupCreateBody.prototype.min_android_version = undefined;

/**
 * @member {String} min_ios_version
 */
AdgroupCreateBody.prototype.min_ios_version = undefined;

/**
 * @member {Array.<String>} network_types
 */
AdgroupCreateBody.prototype.network_types = undefined;

/**
 * @member {Number} next_day_retention
 */
AdgroupCreateBody.prototype.next_day_retention = undefined;

/**
 * @member {Array.<String>} operating_systems
 */
AdgroupCreateBody.prototype.operating_systems = undefined;

/**
 * @member {String} operation_status
 * @default 'ENABLE'
 */
AdgroupCreateBody.prototype.operation_status = 'ENABLE';

/**
 * @member {String} optimization_event
 */
AdgroupCreateBody.prototype.optimization_event = undefined;

/**
 * @member {String} optimization_goal
 */
AdgroupCreateBody.prototype.optimization_goal = undefined;

/**
 * @member {String} pacing
 */
AdgroupCreateBody.prototype.pacing = undefined;

/**
 * @member {String} phone_number
 */
AdgroupCreateBody.prototype.phone_number = undefined;

/**
 * @member {String} phone_region_calling_code
 */
AdgroupCreateBody.prototype.phone_region_calling_code = undefined;

/**
 * @member {String} phone_region_code
 */
AdgroupCreateBody.prototype.phone_region_code = undefined;

/**
 * @member {String} pixel_id
 */
AdgroupCreateBody.prototype.pixel_id = undefined;

/**
 * @member {String} placement_type
 * @default 'PLACEMENT_TYPE_NORMAL'
 */
AdgroupCreateBody.prototype.placement_type = 'PLACEMENT_TYPE_NORMAL';

/**
 * @member {Array.<String>} placements
 */
AdgroupCreateBody.prototype.placements = undefined;

/**
 * @member {String} product_source
 */
AdgroupCreateBody.prototype.product_source = undefined;

/**
 * @member {String} promotion_target_type
 */
AdgroupCreateBody.prototype.promotion_target_type = undefined;

/**
 * @member {String} promotion_type
 */
AdgroupCreateBody.prototype.promotion_type = undefined;

/**
 * @member {String} promotion_website_type
 */
AdgroupCreateBody.prototype.promotion_website_type = undefined;

/**
 * @member {Array.<String>} purchase_intention_keyword_ids
 */
AdgroupCreateBody.prototype.purchase_intention_keyword_ids = undefined;

/**
 * @member {String} request_id
 */
AdgroupCreateBody.prototype.request_id = undefined;

/**
 * @member {Number} roas_bid
 */
AdgroupCreateBody.prototype.roas_bid = undefined;

/**
 * @member {String} saved_audience_id
 */
AdgroupCreateBody.prototype.saved_audience_id = undefined;

/**
 * @member {String} schedule_end_time
 */
AdgroupCreateBody.prototype.schedule_end_time = undefined;

/**
 * @member {String} schedule_start_time
 */
AdgroupCreateBody.prototype.schedule_start_time = undefined;

/**
 * @member {String} schedule_type
 */
AdgroupCreateBody.prototype.schedule_type = undefined;

/**
 * @member {Array.<module:model/AdgroupcreateSearchKeywords>} search_keywords
 */
AdgroupCreateBody.prototype.search_keywords = undefined;

/**
 * @member {Boolean} search_result_enabled
 */
AdgroupCreateBody.prototype.search_result_enabled = undefined;

/**
 * @member {String} secondary_optimization_event
 */
AdgroupCreateBody.prototype.secondary_optimization_event = undefined;

/**
 * @member {Boolean} share_disabled
 * @default false
 */
AdgroupCreateBody.prototype.share_disabled = false;

/**
 * @member {Number} shopping_ads_retargeting_actions_days
 */
AdgroupCreateBody.prototype.shopping_ads_retargeting_actions_days = undefined;

/**
 * @member {String} shopping_ads_retargeting_custom_audience_relation
 */
AdgroupCreateBody.prototype.shopping_ads_retargeting_custom_audience_relation = undefined;

/**
 * @member {String} shopping_ads_retargeting_type
 */
AdgroupCreateBody.prototype.shopping_ads_retargeting_type = undefined;

/**
 * @member {String} shopping_ads_type
 */
AdgroupCreateBody.prototype.shopping_ads_type = undefined;

/**
 * @member {Boolean} skip_learning_phase
 */
AdgroupCreateBody.prototype.skip_learning_phase = undefined;

/**
 * @member {Boolean} smart_audience_enabled
 */
AdgroupCreateBody.prototype.smart_audience_enabled = undefined;

/**
 * @member {Boolean} smart_interest_behavior_enabled
 */
AdgroupCreateBody.prototype.smart_interest_behavior_enabled = undefined;

/**
 * @member {String} spending_power
 */
AdgroupCreateBody.prototype.spending_power = undefined;

/**
 * @member {String} statistic_type
 */
AdgroupCreateBody.prototype.statistic_type = undefined;

/**
 * @member {String} store_authorized_bc_id
 */
AdgroupCreateBody.prototype.store_authorized_bc_id = undefined;

/**
 * @member {String} store_id
 */
AdgroupCreateBody.prototype.store_id = undefined;

/**
 * @member {Array.<String>} tiktok_subplacements
 */
AdgroupCreateBody.prototype.tiktok_subplacements = undefined;

/**
 * @member {String} vbo_window
 * @default 'SEVEN_DAYS'
 */
AdgroupCreateBody.prototype.vbo_window = 'SEVEN_DAYS';

/**
 * @member {String} vertical_sensitivity_id
 */
AdgroupCreateBody.prototype.vertical_sensitivity_id = undefined;

/**
 * @member {Boolean} video_download_disabled
 */
AdgroupCreateBody.prototype.video_download_disabled = undefined;

/**
 * @member {String} view_attribution_window
 */
AdgroupCreateBody.prototype.view_attribution_window = undefined;

/**
 * @member {Array.<String>} zipcode_ids
 */
AdgroupCreateBody.prototype.zipcode_ids = undefined;

