/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdgroupcreateAudienceRuleExclusionsFilterFilters} from './AdgroupcreateAudienceRuleExclusionsFilterFilters.js';

/**
 * The AdgroupcreateAudienceRuleExclusionsFilter model module.
 * @module model/AdgroupcreateAudienceRuleExclusionsFilter
 * @version 0.1.3
 */
export class AdgroupcreateAudienceRuleExclusionsFilter {
  /**
   * Constructs a new <code>AdgroupcreateAudienceRuleExclusionsFilter</code>.
   * @alias module:model/AdgroupcreateAudienceRuleExclusionsFilter
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateAudienceRuleExclusionsFilter</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateAudienceRuleExclusionsFilter} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateAudienceRuleExclusionsFilter} The populated <code>AdgroupcreateAudienceRuleExclusionsFilter</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateAudienceRuleExclusionsFilter();
      if (data.hasOwnProperty('filters'))
        obj.filters = ApiClient.convertToType(data['filters'], [AdgroupcreateAudienceRuleExclusionsFilterFilters]);
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/AdgroupcreateAudienceRuleExclusionsFilterFilters>} filters
 */
AdgroupcreateAudienceRuleExclusionsFilter.prototype.filters = undefined;

/**
 * @member {String} operator
 */
AdgroupcreateAudienceRuleExclusionsFilter.prototype.operator = undefined;

