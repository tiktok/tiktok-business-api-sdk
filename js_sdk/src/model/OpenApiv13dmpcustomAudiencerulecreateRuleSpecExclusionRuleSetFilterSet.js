/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters} from './OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters.js';

/**
 * The OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet model module.
 * @module model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet
 * @version 0.1.2
 */
export class OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet {
  /**
   * Constructs a new <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet</code>.
   * Required when exclusion_rule_set is passed. The set of filters for the exclusion rule.
   * @alias module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet
   * @class
   * @param filters {Array.<module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters>} Required when exclusion_rule_set is passed. An array of filters on previous audience actions and optionally also on URL keywords or parameters. Max size: 1.
   * @param operator {String} Required when exclusion_rule_set is passed. Operator between filters in the filters object array. Enum value: OR. Within each exclusion rule, you can only specify one object in filters.
   */
  constructor(filters, operator) {
    this.filters = filters;
    this.operator = operator;
  }

  /**
   * Constructs a <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet} obj Optional instance to populate.
   * @return {module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet} The populated <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet();
      if (data.hasOwnProperty('filters'))
        obj.filters = ApiClient.convertToType(data['filters'], [OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters]);
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
    }
    return obj;
  }
}

/**
 * Required when exclusion_rule_set is passed. An array of filters on previous audience actions and optionally also on URL keywords or parameters. Max size: 1.
 * @member {Array.<module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters>} filters
 */
OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet.prototype.filters = undefined;

/**
 * Required when exclusion_rule_set is passed. Operator between filters in the filters object array. Enum value: OR. Within each exclusion rule, you can only specify one object in filters.
 * @member {String} operator
 */
OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet.prototype.operator = undefined;

