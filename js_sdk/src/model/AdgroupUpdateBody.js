/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdgroupcreateActions} from './AdgroupcreateActions.js';
import {AdgroupcreateExcludedCustomActions} from './AdgroupcreateExcludedCustomActions.js';
import {AdgroupcreateIncludedCustomActions} from './AdgroupcreateIncludedCustomActions.js';
import {AdgroupupdateSearchKeywords} from './AdgroupupdateSearchKeywords.js';
import {AdgroupupdateTargetingExpansion} from './AdgroupupdateTargetingExpansion.js';

/**
 * The AdgroupUpdateBody model module.
 * @module model/AdgroupUpdateBody
 * @version 0.1.9
 */
export class AdgroupUpdateBody {
  /**
   * Constructs a new <code>AdgroupUpdateBody</code>.
   * @alias module:model/AdgroupUpdateBody
   * @class
   * @param adgroup_id {String} 
   * @param advertiser_id {String} 
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
      if (data.hasOwnProperty('audience_ids'))
        obj.audience_ids = ApiClient.convertToType(data['audience_ids'], ['String']);
      if (data.hasOwnProperty('audience_rule'))
        obj.audience_rule = ApiClient.convertToType(data['audience_rule'], Object);
      if (data.hasOwnProperty('audience_type'))
        obj.audience_type = ApiClient.convertToType(data['audience_type'], 'String');
      if (data.hasOwnProperty('auto_targeting_enabled'))
        obj.auto_targeting_enabled = ApiClient.convertToType(data['auto_targeting_enabled'], 'Boolean');
      if (data.hasOwnProperty('automated_keywords_enabled'))
        obj.automated_keywords_enabled = ApiClient.convertToType(data['automated_keywords_enabled'], 'Boolean');
      if (data.hasOwnProperty('bid_price'))
        obj.bid_price = ApiClient.convertToType(data['bid_price'], 'Number');
      if (data.hasOwnProperty('bid_type'))
        obj.bid_type = ApiClient.convertToType(data['bid_type'], 'String');
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
      if (data.hasOwnProperty('category_exclusion_ids'))
        obj.category_exclusion_ids = ApiClient.convertToType(data['category_exclusion_ids'], ['String']);
      if (data.hasOwnProperty('comment_disabled'))
        obj.comment_disabled = ApiClient.convertToType(data['comment_disabled'], 'Boolean');
      if (data.hasOwnProperty('contextual_tag_ids'))
        obj.contextual_tag_ids = ApiClient.convertToType(data['contextual_tag_ids'], ['String']);
      if (data.hasOwnProperty('conversion_bid_price'))
        obj.conversion_bid_price = ApiClient.convertToType(data['conversion_bid_price'], 'Number');
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
      if (data.hasOwnProperty('exclude_age_under_eighteen'))
        obj.exclude_age_under_eighteen = ApiClient.convertToType(data['exclude_age_under_eighteen'], 'Boolean');
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
      if (data.hasOwnProperty('saved_audience_id'))
        obj.saved_audience_id = ApiClient.convertToType(data['saved_audience_id'], 'String');
      if (data.hasOwnProperty('schedule_end_time'))
        obj.schedule_end_time = ApiClient.convertToType(data['schedule_end_time'], 'String');
      if (data.hasOwnProperty('schedule_start_time'))
        obj.schedule_start_time = ApiClient.convertToType(data['schedule_start_time'], 'String');
      if (data.hasOwnProperty('schedule_type'))
        obj.schedule_type = ApiClient.convertToType(data['schedule_type'], 'String');
      if (data.hasOwnProperty('search_keywords'))
        obj.search_keywords = ApiClient.convertToType(data['search_keywords'], [AdgroupupdateSearchKeywords]);
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
      if (data.hasOwnProperty('smart_audience_enabled'))
        obj.smart_audience_enabled = ApiClient.convertToType(data['smart_audience_enabled'], 'Boolean');
      if (data.hasOwnProperty('smart_interest_behavior_enabled'))
        obj.smart_interest_behavior_enabled = ApiClient.convertToType(data['smart_interest_behavior_enabled'], 'Boolean');
      if (data.hasOwnProperty('spending_power'))
        obj.spending_power = ApiClient.convertToType(data['spending_power'], 'String');
      if (data.hasOwnProperty('targeting_expansion'))
        obj.targeting_expansion = AdgroupupdateTargetingExpansion.constructFromObject(data['targeting_expansion']);
      if (data.hasOwnProperty('vertical_sensitivity_id'))
        obj.vertical_sensitivity_id = ApiClient.convertToType(data['vertical_sensitivity_id'], 'String');
      if (data.hasOwnProperty('zipcode_ids'))
        obj.zipcode_ids = ApiClient.convertToType(data['zipcode_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/AdgroupcreateActions>} actions
 */
AdgroupUpdateBody.prototype.actions = undefined;

/**
 * @member {String} adgroup_id
 */
AdgroupUpdateBody.prototype.adgroup_id = undefined;

/**
 * @member {String} adgroup_name
 */
AdgroupUpdateBody.prototype.adgroup_name = undefined;

/**
 * @member {String} advertiser_id
 */
AdgroupUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<String>} age_groups
 */
AdgroupUpdateBody.prototype.age_groups = undefined;

/**
 * @member {Array.<String>} audience_ids
 */
AdgroupUpdateBody.prototype.audience_ids = undefined;

/**
 * @member {Object} audience_rule
 */
AdgroupUpdateBody.prototype.audience_rule = undefined;

/**
 * @member {String} audience_type
 */
AdgroupUpdateBody.prototype.audience_type = undefined;

/**
 * @member {Boolean} auto_targeting_enabled
 */
AdgroupUpdateBody.prototype.auto_targeting_enabled = undefined;

/**
 * @member {Boolean} automated_keywords_enabled
 * @default false
 */
AdgroupUpdateBody.prototype.automated_keywords_enabled = false;

/**
 * @member {Number} bid_price
 */
AdgroupUpdateBody.prototype.bid_price = undefined;

/**
 * @member {String} bid_type
 */
AdgroupUpdateBody.prototype.bid_type = undefined;

/**
 * @member {Array.<String>} blocked_pangle_app_ids
 */
AdgroupUpdateBody.prototype.blocked_pangle_app_ids = undefined;

/**
 * @member {String} brand_safety_type
 */
AdgroupUpdateBody.prototype.brand_safety_type = undefined;

/**
 * @member {Number} budget
 */
AdgroupUpdateBody.prototype.budget = undefined;

/**
 * @member {Array.<String>} carrier_ids
 */
AdgroupUpdateBody.prototype.carrier_ids = undefined;

/**
 * @member {String} catalog_authorized_bc_id
 */
AdgroupUpdateBody.prototype.catalog_authorized_bc_id = undefined;

/**
 * @member {Array.<String>} category_exclusion_ids
 */
AdgroupUpdateBody.prototype.category_exclusion_ids = undefined;

/**
 * @member {Boolean} comment_disabled
 */
AdgroupUpdateBody.prototype.comment_disabled = undefined;

/**
 * @member {Array.<String>} contextual_tag_ids
 */
AdgroupUpdateBody.prototype.contextual_tag_ids = undefined;

/**
 * @member {Number} conversion_bid_price
 */
AdgroupUpdateBody.prototype.conversion_bid_price = undefined;

/**
 * @member {String} dayparting
 */
AdgroupUpdateBody.prototype.dayparting = undefined;

/**
 * @member {String} deep_bid_type
 */
AdgroupUpdateBody.prototype.deep_bid_type = undefined;

/**
 * @member {Number} deep_cpa_bid
 */
AdgroupUpdateBody.prototype.deep_cpa_bid = undefined;

/**
 * @member {String} deep_funnel_event_source
 */
AdgroupUpdateBody.prototype.deep_funnel_event_source = undefined;

/**
 * @member {String} deep_funnel_event_source_id
 */
AdgroupUpdateBody.prototype.deep_funnel_event_source_id = undefined;

/**
 * @member {String} deep_funnel_optimization_event
 */
AdgroupUpdateBody.prototype.deep_funnel_optimization_event = undefined;

/**
 * @member {String} deep_funnel_optimization_status
 */
AdgroupUpdateBody.prototype.deep_funnel_optimization_status = undefined;

/**
 * @member {Array.<String>} device_model_ids
 */
AdgroupUpdateBody.prototype.device_model_ids = undefined;

/**
 * @member {Array.<Number>} device_price_ranges
 */
AdgroupUpdateBody.prototype.device_price_ranges = undefined;

/**
 * @member {Boolean} exclude_age_under_eighteen
 * @default false
 */
AdgroupUpdateBody.prototype.exclude_age_under_eighteen = false;

/**
 * @member {Array.<String>} excluded_audience_ids
 */
AdgroupUpdateBody.prototype.excluded_audience_ids = undefined;

/**
 * @member {Array.<module:model/AdgroupcreateExcludedCustomActions>} excluded_custom_actions
 */
AdgroupUpdateBody.prototype.excluded_custom_actions = undefined;

/**
 * @member {Array.<String>} excluded_pangle_audience_package_ids
 */
AdgroupUpdateBody.prototype.excluded_pangle_audience_package_ids = undefined;

/**
 * @member {Number} frequency
 */
AdgroupUpdateBody.prototype.frequency = undefined;

/**
 * @member {Number} frequency_schedule
 */
AdgroupUpdateBody.prototype.frequency_schedule = undefined;

/**
 * @member {String} gender
 */
AdgroupUpdateBody.prototype.gender = undefined;

/**
 * @member {Array.<String>} household_income
 */
AdgroupUpdateBody.prototype.household_income = undefined;

/**
 * @member {Array.<module:model/AdgroupcreateIncludedCustomActions>} included_custom_actions
 */
AdgroupUpdateBody.prototype.included_custom_actions = undefined;

/**
 * @member {Array.<String>} included_pangle_audience_package_ids
 */
AdgroupUpdateBody.prototype.included_pangle_audience_package_ids = undefined;

/**
 * @member {Array.<String>} interest_category_ids
 */
AdgroupUpdateBody.prototype.interest_category_ids = undefined;

/**
 * @member {Array.<String>} interest_keyword_ids
 */
AdgroupUpdateBody.prototype.interest_keyword_ids = undefined;

/**
 * @member {String} ios14_targeting
 */
AdgroupUpdateBody.prototype.ios14_targeting = undefined;

/**
 * @member {Boolean} is_hfss
 */
AdgroupUpdateBody.prototype.is_hfss = undefined;

/**
 * @member {Boolean} is_lhf_compliance
 */
AdgroupUpdateBody.prototype.is_lhf_compliance = undefined;

/**
 * @member {Array.<String>} isp_ids
 */
AdgroupUpdateBody.prototype.isp_ids = undefined;

/**
 * @member {Array.<String>} languages
 */
AdgroupUpdateBody.prototype.languages = undefined;

/**
 * @member {Array.<String>} location_ids
 */
AdgroupUpdateBody.prototype.location_ids = undefined;

/**
 * @member {String} min_android_version
 */
AdgroupUpdateBody.prototype.min_android_version = undefined;

/**
 * @member {String} min_ios_version
 */
AdgroupUpdateBody.prototype.min_ios_version = undefined;

/**
 * @member {Array.<String>} network_types
 */
AdgroupUpdateBody.prototype.network_types = undefined;

/**
 * @member {Number} next_day_retention
 */
AdgroupUpdateBody.prototype.next_day_retention = undefined;

/**
 * @member {Array.<String>} operating_systems
 */
AdgroupUpdateBody.prototype.operating_systems = undefined;

/**
 * @member {String} pacing
 */
AdgroupUpdateBody.prototype.pacing = undefined;

/**
 * @member {Array.<String>} purchase_intention_keyword_ids
 */
AdgroupUpdateBody.prototype.purchase_intention_keyword_ids = undefined;

/**
 * @member {Number} roas_bid
 */
AdgroupUpdateBody.prototype.roas_bid = undefined;

/**
 * @member {String} saved_audience_id
 */
AdgroupUpdateBody.prototype.saved_audience_id = undefined;

/**
 * @member {String} schedule_end_time
 */
AdgroupUpdateBody.prototype.schedule_end_time = undefined;

/**
 * @member {String} schedule_start_time
 */
AdgroupUpdateBody.prototype.schedule_start_time = undefined;

/**
 * @member {String} schedule_type
 */
AdgroupUpdateBody.prototype.schedule_type = undefined;

/**
 * @member {Array.<module:model/AdgroupupdateSearchKeywords>} search_keywords
 */
AdgroupUpdateBody.prototype.search_keywords = undefined;

/**
 * @member {Boolean} search_result_enabled
 */
AdgroupUpdateBody.prototype.search_result_enabled = undefined;

/**
 * @member {String} secondary_optimization_event
 */
AdgroupUpdateBody.prototype.secondary_optimization_event = undefined;

/**
 * @member {Boolean} share_disabled
 */
AdgroupUpdateBody.prototype.share_disabled = undefined;

/**
 * @member {Number} shopping_ads_retargeting_actions_days
 */
AdgroupUpdateBody.prototype.shopping_ads_retargeting_actions_days = undefined;

/**
 * @member {String} shopping_ads_retargeting_custom_audience_relation
 */
AdgroupUpdateBody.prototype.shopping_ads_retargeting_custom_audience_relation = undefined;

/**
 * @member {String} shopping_ads_retargeting_type
 */
AdgroupUpdateBody.prototype.shopping_ads_retargeting_type = undefined;

/**
 * @member {Boolean} smart_audience_enabled
 */
AdgroupUpdateBody.prototype.smart_audience_enabled = undefined;

/**
 * @member {Boolean} smart_interest_behavior_enabled
 */
AdgroupUpdateBody.prototype.smart_interest_behavior_enabled = undefined;

/**
 * @member {String} spending_power
 */
AdgroupUpdateBody.prototype.spending_power = undefined;

/**
 * @member {module:model/AdgroupupdateTargetingExpansion} targeting_expansion
 */
AdgroupUpdateBody.prototype.targeting_expansion = undefined;

/**
 * @member {String} vertical_sensitivity_id
 */
AdgroupUpdateBody.prototype.vertical_sensitivity_id = undefined;

/**
 * @member {Array.<String>} zipcode_ids
 */
AdgroupUpdateBody.prototype.zipcode_ids = undefined;

