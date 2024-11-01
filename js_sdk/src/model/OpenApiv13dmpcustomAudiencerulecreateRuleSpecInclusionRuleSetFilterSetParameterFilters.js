/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters model module.
 * @module model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters
 * @version 0.1.2
 */
export class OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters {
  /**
   * Constructs a new <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters</code>.
   * @alias module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters
   * @class
   * @param field {String} Required when parameter_filters within inclusion_rule_set is passed. Filter condition. Use this field to specify whether to filter URL keywords, or Web Event parameters reported via the Pixel. Enum value: URL: URL keywords. CONTENT_TYPE: the parameter content_type. PRICE: the parameter price. VALUE: the parameter value. CONTENT_ID: the parameter content_id. CONTENT_CATEGORY: the parameter content_category.
   * @param operator {String} Required when parameter_filters within inclusion_rule_set is passed. Filter operator between filter condition and filter value. Enum value: CONTAINS: contains. DOES_NOT_CONTAIN: doesn't contain. EQ: equals. IS_LESS_THAN: is less than. IS_GREATER_THAN: is greater than. IS_LESS_THAN_OR_EQUAL_TO: is less than or equal to. IS_GRETER_THAN_OR_EQUAL_TO: is greater than or equal to. The allowed values vary based on the field value: If field is set to URL, operator can only be set to CONTAINS, DOES_NOT_CONTAIN, or EQ. If field is not set to URL, operator can be set to CONTAINS, DOES_NOT_CONTAINS, EQ, IS_LESS_THAN, IS_GREATER_THAN, IS_LESS_THAN_OR_EQUAL_TO, or IS_GREATER_THAN_OR_EQUAL_TO.
   * @param values {Array.<String>} Required when parameter_filters within inclusion_rule_set is passed. A list of filter values. Max size: 10. Length limit for each value: 100 characters. If you specify multiple values, the values will be combined using OR logic.
   */
  constructor(field, operator, values) {
    this.field = field;
    this.operator = operator;
    this.values = values;
  }

  /**
   * Constructs a <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters} obj Optional instance to populate.
   * @return {module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters} The populated <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters();
      if (data.hasOwnProperty('field'))
        obj.field = ApiClient.convertToType(data['field'], 'String');
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('values'))
        obj.values = ApiClient.convertToType(data['values'], ['String']);
    }
    return obj;
  }
}

/**
 * Required when parameter_filters within inclusion_rule_set is passed. Filter condition. Use this field to specify whether to filter URL keywords, or Web Event parameters reported via the Pixel. Enum value: URL: URL keywords. CONTENT_TYPE: the parameter content_type. PRICE: the parameter price. VALUE: the parameter value. CONTENT_ID: the parameter content_id. CONTENT_CATEGORY: the parameter content_category.
 * @member {String} field
 */
OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters.prototype.field = undefined;

/**
 * Required when parameter_filters within inclusion_rule_set is passed. Filter operator between filter condition and filter value. Enum value: CONTAINS: contains. DOES_NOT_CONTAIN: doesn't contain. EQ: equals. IS_LESS_THAN: is less than. IS_GREATER_THAN: is greater than. IS_LESS_THAN_OR_EQUAL_TO: is less than or equal to. IS_GRETER_THAN_OR_EQUAL_TO: is greater than or equal to. The allowed values vary based on the field value: If field is set to URL, operator can only be set to CONTAINS, DOES_NOT_CONTAIN, or EQ. If field is not set to URL, operator can be set to CONTAINS, DOES_NOT_CONTAINS, EQ, IS_LESS_THAN, IS_GREATER_THAN, IS_LESS_THAN_OR_EQUAL_TO, or IS_GREATER_THAN_OR_EQUAL_TO.
 * @member {String} operator
 */
OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters.prototype.operator = undefined;

/**
 * Required when parameter_filters within inclusion_rule_set is passed. A list of filter values. Max size: 10. Length limit for each value: 100 characters. If you specify multiple values, the values will be combined using OR logic.
 * @member {Array.<String>} values
 */
OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters.prototype.values = undefined;

