/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources} from './OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources.js';
import {OpenApiv13adgroupcreateAudienceRuleExclusionsFilter} from './OpenApiv13adgroupcreateAudienceRuleExclusionsFilter.js';

/**
 * The OpenApiv13adgroupcreateAudienceRuleInclusionsRules model module.
 * @module model/OpenApiv13adgroupcreateAudienceRuleInclusionsRules
 * @version 0.1.1
 */
export class OpenApiv13adgroupcreateAudienceRuleInclusionsRules {
  /**
   * Constructs a new <code>OpenApiv13adgroupcreateAudienceRuleInclusionsRules</code>.
   * @alias module:model/OpenApiv13adgroupcreateAudienceRuleInclusionsRules
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adgroupcreateAudienceRuleInclusionsRules</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adgroupcreateAudienceRuleInclusionsRules} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adgroupcreateAudienceRuleInclusionsRules} The populated <code>OpenApiv13adgroupcreateAudienceRuleInclusionsRules</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adgroupcreateAudienceRuleInclusionsRules();
      if (data.hasOwnProperty('event_sources'))
        obj.event_sources = ApiClient.convertToType(data['event_sources'], [OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources]);
      if (data.hasOwnProperty('filter'))
        obj.filter = OpenApiv13adgroupcreateAudienceRuleExclusionsFilter.constructFromObject(data['filter']);
      if (data.hasOwnProperty('retention'))
        obj.retention = ApiClient.convertToType(data['retention'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources>} event_sources
 */
OpenApiv13adgroupcreateAudienceRuleInclusionsRules.prototype.event_sources = undefined;

/**
 * @member {module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilter} filter
 */
OpenApiv13adgroupcreateAudienceRuleInclusionsRules.prototype.filter = undefined;

/**
 * @member {String} retention
 */
OpenApiv13adgroupcreateAudienceRuleInclusionsRules.prototype.retention = undefined;

