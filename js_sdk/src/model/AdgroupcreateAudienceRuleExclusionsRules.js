/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdgroupcreateAudienceRuleExclusionsEventSources} from './AdgroupcreateAudienceRuleExclusionsEventSources.js';
import {AdgroupcreateAudienceRuleExclusionsFilter} from './AdgroupcreateAudienceRuleExclusionsFilter.js';

/**
 * The AdgroupcreateAudienceRuleExclusionsRules model module.
 * @module model/AdgroupcreateAudienceRuleExclusionsRules
 * @version 0.1.5
 */
export class AdgroupcreateAudienceRuleExclusionsRules {
  /**
   * Constructs a new <code>AdgroupcreateAudienceRuleExclusionsRules</code>.
   * @alias module:model/AdgroupcreateAudienceRuleExclusionsRules
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateAudienceRuleExclusionsRules</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateAudienceRuleExclusionsRules} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateAudienceRuleExclusionsRules} The populated <code>AdgroupcreateAudienceRuleExclusionsRules</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateAudienceRuleExclusionsRules();
      if (data.hasOwnProperty('event_sources'))
        obj.event_sources = ApiClient.convertToType(data['event_sources'], [AdgroupcreateAudienceRuleExclusionsEventSources]);
      if (data.hasOwnProperty('filter'))
        obj.filter = AdgroupcreateAudienceRuleExclusionsFilter.constructFromObject(data['filter']);
      if (data.hasOwnProperty('retention'))
        obj.retention = ApiClient.convertToType(data['retention'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/AdgroupcreateAudienceRuleExclusionsEventSources>} event_sources
 */
AdgroupcreateAudienceRuleExclusionsRules.prototype.event_sources = undefined;

/**
 * @member {module:model/AdgroupcreateAudienceRuleExclusionsFilter} filter
 */
AdgroupcreateAudienceRuleExclusionsRules.prototype.filter = undefined;

/**
 * @member {String} retention
 */
AdgroupcreateAudienceRuleExclusionsRules.prototype.retention = undefined;

