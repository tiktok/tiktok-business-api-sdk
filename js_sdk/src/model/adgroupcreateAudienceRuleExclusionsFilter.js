/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {adgroupcreateAudienceRuleExclusionsFilterFilters} from './adgroupcreateAudienceRuleExclusionsFilterFilters.js';

/**
 * The adgroupcreateAudienceRuleExclusionsFilter model module.
 * @module model/adgroupcreateAudienceRuleExclusionsFilter
 * @version 0.1.2
 */
export class adgroupcreateAudienceRuleExclusionsFilter {
  /**
   * Constructs a new <code>adgroupcreateAudienceRuleExclusionsFilter</code>.
   * @alias module:model/adgroupcreateAudienceRuleExclusionsFilter
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adgroupcreateAudienceRuleExclusionsFilter</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adgroupcreateAudienceRuleExclusionsFilter} obj Optional instance to populate.
   * @return {module:model/adgroupcreateAudienceRuleExclusionsFilter} The populated <code>adgroupcreateAudienceRuleExclusionsFilter</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adgroupcreateAudienceRuleExclusionsFilter();
      if (data.hasOwnProperty('filters'))
        obj.filters = ApiClient.convertToType(data['filters'], [adgroupcreateAudienceRuleExclusionsFilterFilters]);
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/adgroupcreateAudienceRuleExclusionsFilterFilters>} filters
 */
adgroupcreateAudienceRuleExclusionsFilter.prototype.filters = undefined;

/**
 * @member {String} operator
 */
adgroupcreateAudienceRuleExclusionsFilter.prototype.operator = undefined;

