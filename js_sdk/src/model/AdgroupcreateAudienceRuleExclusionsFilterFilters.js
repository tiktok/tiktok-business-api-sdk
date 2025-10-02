/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupcreateAudienceRuleExclusionsFilterFilters model module.
 * @module model/AdgroupcreateAudienceRuleExclusionsFilterFilters
 * @version 0.1.8
 */
export class AdgroupcreateAudienceRuleExclusionsFilterFilters {
  /**
   * Constructs a new <code>AdgroupcreateAudienceRuleExclusionsFilterFilters</code>.
   * @alias module:model/AdgroupcreateAudienceRuleExclusionsFilterFilters
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateAudienceRuleExclusionsFilterFilters</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateAudienceRuleExclusionsFilterFilters} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateAudienceRuleExclusionsFilterFilters} The populated <code>AdgroupcreateAudienceRuleExclusionsFilterFilters</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateAudienceRuleExclusionsFilterFilters();
      if (data.hasOwnProperty('field'))
        obj.field = ApiClient.convertToType(data['field'], 'String');
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('value'))
        obj.value = ApiClient.convertToType(data['value'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} field
 */
AdgroupcreateAudienceRuleExclusionsFilterFilters.prototype.field = undefined;

/**
 * @member {String} operator
 */
AdgroupcreateAudienceRuleExclusionsFilterFilters.prototype.operator = undefined;

/**
 * @member {String} value
 */
AdgroupcreateAudienceRuleExclusionsFilterFilters.prototype.value = undefined;

