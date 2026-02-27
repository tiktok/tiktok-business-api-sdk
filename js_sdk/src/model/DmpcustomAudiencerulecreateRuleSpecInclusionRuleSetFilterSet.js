/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters} from './DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters.js';

/**
 * The DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet model module.
 * @module model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet
 * @version 1.2.1
 */
export class DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet {
  /**
   * Constructs a new <code>DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet</code>.
   * The set of filters for each inclusion rule.
   * @alias module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet
   * @class
   * @param filters {Array.<module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters>} An array of filters on previous audience actions and optionally also on URL keywords or parameters. Max size: 1.
   * @param operator {String} Operator between filters in the filters object array. Enum value: OR. Within each inclusion rule, you can only specify one object in filters.
   */
  constructor(filters, operator) {
    this.filters = filters;
    this.operator = operator;
  }

  /**
   * Constructs a <code>DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet} obj Optional instance to populate.
   * @return {module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet} The populated <code>DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet();
      if (data.hasOwnProperty('filters'))
        obj.filters = ApiClient.convertToType(data['filters'], [DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters]);
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
    }
    return obj;
  }
}

/**
 * An array of filters on previous audience actions and optionally also on URL keywords or parameters. Max size: 1.
 * @member {Array.<module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters>} filters
 */
DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet.prototype.filters = undefined;

/**
 * Operator between filters in the filters object array. Enum value: OR. Within each inclusion rule, you can only specify one object in filters.
 * @member {String} operator
 */
DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet.prototype.operator = undefined;

