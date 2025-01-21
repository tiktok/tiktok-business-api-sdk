/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters} from './dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters.js';

/**
 * The dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet model module.
 * @module model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet
 * @version 0.1.2
 */
export class dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet {
  /**
   * Constructs a new <code>dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet</code>.
   * The set of filters for each inclusion rule.
   * @alias module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet
   * @class
   * @param filters {Array.<module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters>} An array of filters on previous audience actions and optionally also on URL keywords or parameters. Max size: 1.
   * @param operator {String} Operator between filters in the filters object array. Enum value: OR. Within each inclusion rule, you can only specify one object in filters.
   */
  constructor(filters, operator) {
    this.filters = filters;
    this.operator = operator;
  }

  /**
   * Constructs a <code>dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet} obj Optional instance to populate.
   * @return {module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet} The populated <code>dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet();
      if (data.hasOwnProperty('filters'))
        obj.filters = ApiClient.convertToType(data['filters'], [dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters]);
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
    }
    return obj;
  }
}

/**
 * An array of filters on previous audience actions and optionally also on URL keywords or parameters. Max size: 1.
 * @member {Array.<module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters>} filters
 */
dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet.prototype.filters = undefined;

/**
 * Operator between filters in the filters object array. Enum value: OR. Within each inclusion rule, you can only specify one object in filters.
 * @member {String} operator
 */
dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet.prototype.operator = undefined;

