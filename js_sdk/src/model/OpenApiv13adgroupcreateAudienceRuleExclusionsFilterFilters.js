/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters model module.
 * @module model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters
 * @version 0.1.1
 */
export class OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters {
  /**
   * Constructs a new <code>OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters</code>.
   * @alias module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters} The populated <code>OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters();
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
OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters.prototype.field = undefined;

/**
 * @member {String} operator
 */
OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters.prototype.operator = undefined;

/**
 * @member {String} value
 */
OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters.prototype.value = undefined;

