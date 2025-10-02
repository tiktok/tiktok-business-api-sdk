/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringSmartPlusMaterialReportBreakdown model module.
 * @module model/FilteringSmartPlusMaterialReportBreakdown
 * @version 0.1.8
 */
export class FilteringSmartPlusMaterialReportBreakdown {
  /**
   * Constructs a new <code>FilteringSmartPlusMaterialReportBreakdown</code>.
   * @alias module:model/FilteringSmartPlusMaterialReportBreakdown
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringSmartPlusMaterialReportBreakdown</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringSmartPlusMaterialReportBreakdown} obj Optional instance to populate.
   * @return {module:model/FilteringSmartPlusMaterialReportBreakdown} The populated <code>FilteringSmartPlusMaterialReportBreakdown</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringSmartPlusMaterialReportBreakdown();
      if (data.hasOwnProperty('ad_text_entity_ids'))
        obj.ad_text_entity_ids = ApiClient.convertToType(data['ad_text_entity_ids'], ['String']);
      if (data.hasOwnProperty('adgroup_ids'))
        obj.adgroup_ids = ApiClient.convertToType(data['adgroup_ids'], ['String']);
      if (data.hasOwnProperty('call_to_action_entity_ids'))
        obj.call_to_action_entity_ids = ApiClient.convertToType(data['call_to_action_entity_ids'], ['String']);
      if (data.hasOwnProperty('campaign_ids'))
        obj.campaign_ids = ApiClient.convertToType(data['campaign_ids'], ['String']);
      if (data.hasOwnProperty('interactive_add_on_entity_ids'))
        obj.interactive_add_on_entity_ids = ApiClient.convertToType(data['interactive_add_on_entity_ids'], ['String']);
      if (data.hasOwnProperty('main_material_ids'))
        obj.main_material_ids = ApiClient.convertToType(data['main_material_ids'], ['String']);
      if (data.hasOwnProperty('main_material_types'))
        obj.main_material_types = ApiClient.convertToType(data['main_material_types'], ['String']);
      if (data.hasOwnProperty('smart_plus_ad_ids'))
        obj.smart_plus_ad_ids = ApiClient.convertToType(data['smart_plus_ad_ids'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} ad_text_entity_ids
 */
FilteringSmartPlusMaterialReportBreakdown.prototype.ad_text_entity_ids = undefined;

/**
 * @member {Array.<String>} adgroup_ids
 */
FilteringSmartPlusMaterialReportBreakdown.prototype.adgroup_ids = undefined;

/**
 * @member {Array.<String>} call_to_action_entity_ids
 */
FilteringSmartPlusMaterialReportBreakdown.prototype.call_to_action_entity_ids = undefined;

/**
 * @member {Array.<String>} campaign_ids
 */
FilteringSmartPlusMaterialReportBreakdown.prototype.campaign_ids = undefined;

/**
 * @member {Array.<String>} interactive_add_on_entity_ids
 */
FilteringSmartPlusMaterialReportBreakdown.prototype.interactive_add_on_entity_ids = undefined;

/**
 * @member {Array.<String>} main_material_ids
 */
FilteringSmartPlusMaterialReportBreakdown.prototype.main_material_ids = undefined;

/**
 * @member {Array.<String>} main_material_types
 */
FilteringSmartPlusMaterialReportBreakdown.prototype.main_material_types = undefined;

/**
 * @member {Array.<String>} smart_plus_ad_ids
 */
FilteringSmartPlusMaterialReportBreakdown.prototype.smart_plus_ad_ids = undefined;

