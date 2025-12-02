/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {SmartPlusAdgroupCreateBodyTargetingSpecActions} from './SmartPlusAdgroupCreateBodyTargetingSpecActions.js';

/**
 * The SmartPlusAdgroupCreateBodyTargetingSpec model module.
 * @module model/SmartPlusAdgroupCreateBodyTargetingSpec
 * @version 0.1.9
 */
export class SmartPlusAdgroupCreateBodyTargetingSpec {
  /**
   * Constructs a new <code>SmartPlusAdgroupCreateBodyTargetingSpec</code>.
   * @alias module:model/SmartPlusAdgroupCreateBodyTargetingSpec
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SmartPlusAdgroupCreateBodyTargetingSpec</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdgroupCreateBodyTargetingSpec} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdgroupCreateBodyTargetingSpec} The populated <code>SmartPlusAdgroupCreateBodyTargetingSpec</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdgroupCreateBodyTargetingSpec();
      if (data.hasOwnProperty('actions'))
        obj.actions = ApiClient.convertToType(data['actions'], [SmartPlusAdgroupCreateBodyTargetingSpecActions]);
      if (data.hasOwnProperty('age_groups'))
        obj.age_groups = ApiClient.convertToType(data['age_groups'], ['String']);
      if (data.hasOwnProperty('audience_ids'))
        obj.audience_ids = ApiClient.convertToType(data['audience_ids'], ['String']);
      if (data.hasOwnProperty('blocked_pangle_app_ids'))
        obj.blocked_pangle_app_ids = ApiClient.convertToType(data['blocked_pangle_app_ids'], ['String']);
      if (data.hasOwnProperty('carrier_ids'))
        obj.carrier_ids = ApiClient.convertToType(data['carrier_ids'], ['String']);
      if (data.hasOwnProperty('device_model_ids'))
        obj.device_model_ids = ApiClient.convertToType(data['device_model_ids'], ['String']);
      if (data.hasOwnProperty('device_price_ranges'))
        obj.device_price_ranges = ApiClient.convertToType(data['device_price_ranges'], ['Number']);
      if (data.hasOwnProperty('excluded_audience_ids'))
        obj.excluded_audience_ids = ApiClient.convertToType(data['excluded_audience_ids'], ['String']);
      if (data.hasOwnProperty('excluded_pangle_audience_package_ids'))
        obj.excluded_pangle_audience_package_ids = ApiClient.convertToType(data['excluded_pangle_audience_package_ids'], ['String']);
      if (data.hasOwnProperty('gender'))
        obj.gender = ApiClient.convertToType(data['gender'], 'String');
      if (data.hasOwnProperty('household_income'))
        obj.household_income = ApiClient.convertToType(data['household_income'], ['String']);
      if (data.hasOwnProperty('included_pangle_audience_package_ids'))
        obj.included_pangle_audience_package_ids = ApiClient.convertToType(data['included_pangle_audience_package_ids'], ['String']);
      if (data.hasOwnProperty('interest_category_ids'))
        obj.interest_category_ids = ApiClient.convertToType(data['interest_category_ids'], ['String']);
      if (data.hasOwnProperty('interest_keyword_ids'))
        obj.interest_keyword_ids = ApiClient.convertToType(data['interest_keyword_ids'], ['String']);
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
      if (data.hasOwnProperty('operating_systems'))
        obj.operating_systems = ApiClient.convertToType(data['operating_systems'], ['String']);
      if (data.hasOwnProperty('purchase_intention_keyword_ids'))
        obj.purchase_intention_keyword_ids = ApiClient.convertToType(data['purchase_intention_keyword_ids'], ['String']);
      if (data.hasOwnProperty('saved_audience_id'))
        obj.saved_audience_id = ApiClient.convertToType(data['saved_audience_id'], 'String');
      if (data.hasOwnProperty('smart_audience_enabled'))
        obj.smart_audience_enabled = ApiClient.convertToType(data['smart_audience_enabled'], 'Boolean');
      if (data.hasOwnProperty('smart_interest_behavior_enabled'))
        obj.smart_interest_behavior_enabled = ApiClient.convertToType(data['smart_interest_behavior_enabled'], 'Boolean');
      if (data.hasOwnProperty('spc_audience_age'))
        obj.spc_audience_age = ApiClient.convertToType(data['spc_audience_age'], 'String');
      if (data.hasOwnProperty('spending_power'))
        obj.spending_power = ApiClient.convertToType(data['spending_power'], 'String');
      if (data.hasOwnProperty('zipcode_ids'))
        obj.zipcode_ids = ApiClient.convertToType(data['zipcode_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/SmartPlusAdgroupCreateBodyTargetingSpecActions>} actions
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.actions = undefined;

/**
 * @member {Array.<String>} age_groups
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.age_groups = undefined;

/**
 * @member {Array.<String>} audience_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.audience_ids = undefined;

/**
 * @member {Array.<String>} blocked_pangle_app_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.blocked_pangle_app_ids = undefined;

/**
 * @member {Array.<String>} carrier_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.carrier_ids = undefined;

/**
 * @member {Array.<String>} device_model_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.device_model_ids = undefined;

/**
 * @member {Array.<Number>} device_price_ranges
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.device_price_ranges = undefined;

/**
 * @member {Array.<String>} excluded_audience_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.excluded_audience_ids = undefined;

/**
 * @member {Array.<String>} excluded_pangle_audience_package_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.excluded_pangle_audience_package_ids = undefined;

/**
 * @member {String} gender
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.gender = undefined;

/**
 * @member {Array.<String>} household_income
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.household_income = undefined;

/**
 * @member {Array.<String>} included_pangle_audience_package_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.included_pangle_audience_package_ids = undefined;

/**
 * @member {Array.<String>} interest_category_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.interest_category_ids = undefined;

/**
 * @member {Array.<String>} interest_keyword_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.interest_keyword_ids = undefined;

/**
 * @member {Array.<String>} isp_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.isp_ids = undefined;

/**
 * @member {Array.<String>} languages
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.languages = undefined;

/**
 * @member {Array.<String>} location_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.location_ids = undefined;

/**
 * @member {String} min_android_version
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.min_android_version = undefined;

/**
 * @member {String} min_ios_version
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.min_ios_version = undefined;

/**
 * @member {Array.<String>} network_types
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.network_types = undefined;

/**
 * @member {Array.<String>} operating_systems
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.operating_systems = undefined;

/**
 * @member {Array.<String>} purchase_intention_keyword_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.purchase_intention_keyword_ids = undefined;

/**
 * @member {String} saved_audience_id
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.saved_audience_id = undefined;

/**
 * @member {Boolean} smart_audience_enabled
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.smart_audience_enabled = undefined;

/**
 * @member {Boolean} smart_interest_behavior_enabled
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.smart_interest_behavior_enabled = undefined;

/**
 * @member {String} spc_audience_age
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.spc_audience_age = undefined;

/**
 * @member {String} spending_power
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.spending_power = undefined;

/**
 * @member {Array.<String>} zipcode_ids
 */
SmartPlusAdgroupCreateBodyTargetingSpec.prototype.zipcode_ids = undefined;

