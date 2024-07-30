/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters} from './OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters.js';

/**
 * The OpenApiv13adgroupcreateAudienceRuleExclusionsFilter model module.
 * @module model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilter
 * @version 0.1.1
 */
export class OpenApiv13adgroupcreateAudienceRuleExclusionsFilter {
  /**
   * Constructs a new <code>OpenApiv13adgroupcreateAudienceRuleExclusionsFilter</code>.
   * @alias module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilter
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adgroupcreateAudienceRuleExclusionsFilter</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilter} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilter} The populated <code>OpenApiv13adgroupcreateAudienceRuleExclusionsFilter</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adgroupcreateAudienceRuleExclusionsFilter();
      if (data.hasOwnProperty('filters'))
        obj.filters = ApiClient.convertToType(data['filters'], [OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters]);
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters>} filters
 */
OpenApiv13adgroupcreateAudienceRuleExclusionsFilter.prototype.filters = undefined;

/**
 * @member {String} operator
 */
OpenApiv13adgroupcreateAudienceRuleExclusionsFilter.prototype.operator = undefined;

