/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringSmartPlusMaterialReportOverview model module.
 * @module model/FilteringSmartPlusMaterialReportOverview
 * @version 1.2.1
 */
export class FilteringSmartPlusMaterialReportOverview {
  /**
   * Constructs a new <code>FilteringSmartPlusMaterialReportOverview</code>.
   * @alias module:model/FilteringSmartPlusMaterialReportOverview
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringSmartPlusMaterialReportOverview</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringSmartPlusMaterialReportOverview} obj Optional instance to populate.
   * @return {module:model/FilteringSmartPlusMaterialReportOverview} The populated <code>FilteringSmartPlusMaterialReportOverview</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringSmartPlusMaterialReportOverview();
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
FilteringSmartPlusMaterialReportOverview.prototype.ad_text_entity_ids = undefined;

/**
 * @member {Array.<String>} adgroup_ids
 */
FilteringSmartPlusMaterialReportOverview.prototype.adgroup_ids = undefined;

/**
 * @member {Array.<String>} call_to_action_entity_ids
 */
FilteringSmartPlusMaterialReportOverview.prototype.call_to_action_entity_ids = undefined;

/**
 * @member {Array.<String>} campaign_ids
 */
FilteringSmartPlusMaterialReportOverview.prototype.campaign_ids = undefined;

/**
 * @member {Array.<String>} interactive_add_on_entity_ids
 */
FilteringSmartPlusMaterialReportOverview.prototype.interactive_add_on_entity_ids = undefined;

/**
 * @member {Array.<String>} main_material_ids
 */
FilteringSmartPlusMaterialReportOverview.prototype.main_material_ids = undefined;

/**
 * @member {Array.<String>} main_material_types
 */
FilteringSmartPlusMaterialReportOverview.prototype.main_material_types = undefined;

/**
 * @member {Array.<String>} smart_plus_ad_ids
 */
FilteringSmartPlusMaterialReportOverview.prototype.smart_plus_ad_ids = undefined;

