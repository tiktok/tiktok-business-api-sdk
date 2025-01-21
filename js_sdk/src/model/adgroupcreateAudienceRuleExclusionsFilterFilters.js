/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The adgroupcreateAudienceRuleExclusionsFilterFilters model module.
 * @module model/adgroupcreateAudienceRuleExclusionsFilterFilters
 * @version 0.1.2
 */
export class adgroupcreateAudienceRuleExclusionsFilterFilters {
  /**
   * Constructs a new <code>adgroupcreateAudienceRuleExclusionsFilterFilters</code>.
   * @alias module:model/adgroupcreateAudienceRuleExclusionsFilterFilters
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adgroupcreateAudienceRuleExclusionsFilterFilters</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adgroupcreateAudienceRuleExclusionsFilterFilters} obj Optional instance to populate.
   * @return {module:model/adgroupcreateAudienceRuleExclusionsFilterFilters} The populated <code>adgroupcreateAudienceRuleExclusionsFilterFilters</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adgroupcreateAudienceRuleExclusionsFilterFilters();
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
adgroupcreateAudienceRuleExclusionsFilterFilters.prototype.field = undefined;

/**
 * @member {String} operator
 */
adgroupcreateAudienceRuleExclusionsFilterFilters.prototype.operator = undefined;

/**
 * @member {String} value
 */
adgroupcreateAudienceRuleExclusionsFilterFilters.prototype.value = undefined;

