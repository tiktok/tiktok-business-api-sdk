/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {adgroupcreateAudienceRuleExclusionsEventSources} from './adgroupcreateAudienceRuleExclusionsEventSources.js';
import {adgroupcreateAudienceRuleExclusionsFilter} from './adgroupcreateAudienceRuleExclusionsFilter.js';

/**
 * The adgroupcreateAudienceRuleExclusionsRules model module.
 * @module model/adgroupcreateAudienceRuleExclusionsRules
 * @version 0.1.2
 */
export class adgroupcreateAudienceRuleExclusionsRules {
  /**
   * Constructs a new <code>adgroupcreateAudienceRuleExclusionsRules</code>.
   * @alias module:model/adgroupcreateAudienceRuleExclusionsRules
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adgroupcreateAudienceRuleExclusionsRules</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adgroupcreateAudienceRuleExclusionsRules} obj Optional instance to populate.
   * @return {module:model/adgroupcreateAudienceRuleExclusionsRules} The populated <code>adgroupcreateAudienceRuleExclusionsRules</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adgroupcreateAudienceRuleExclusionsRules();
      if (data.hasOwnProperty('event_sources'))
        obj.event_sources = ApiClient.convertToType(data['event_sources'], [adgroupcreateAudienceRuleExclusionsEventSources]);
      if (data.hasOwnProperty('filter'))
        obj.filter = adgroupcreateAudienceRuleExclusionsFilter.constructFromObject(data['filter']);
      if (data.hasOwnProperty('retention'))
        obj.retention = ApiClient.convertToType(data['retention'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/adgroupcreateAudienceRuleExclusionsEventSources>} event_sources
 */
adgroupcreateAudienceRuleExclusionsRules.prototype.event_sources = undefined;

/**
 * @member {module:model/adgroupcreateAudienceRuleExclusionsFilter} filter
 */
adgroupcreateAudienceRuleExclusionsRules.prototype.filter = undefined;

/**
 * @member {String} retention
 */
adgroupcreateAudienceRuleExclusionsRules.prototype.retention = undefined;

