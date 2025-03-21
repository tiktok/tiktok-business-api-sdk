/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters} from './DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters.js';

/**
 * The DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters model module.
 * @module model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters
 * @version 0.1.5
 */
export class DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters {
  /**
   * Constructs a new <code>DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters</code>.
   * @alias module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters
   * @class
   * @param field {String} Required when exclusion_rule_set is passed. Filter field. Enum value: EVENT: To exclude the people who've carried out a certain action in the past few days as indicated by retention_days.
   * @param operator {String} Required when exclusion_rule_set is passed. Filter operator between filter field and filter value. Enum value: EQ: equals.
   * @param value {String} Required when exclusion_rule_set is passed. Filter value. For enum values, see Enumeration - Filter Value.
   */
  constructor(field, operator, value) {
    this.field = field;
    this.operator = operator;
    this.value = value;
  }

  /**
   * Constructs a <code>DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters} obj Optional instance to populate.
   * @return {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters} The populated <code>DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters();
      if (data.hasOwnProperty('field'))
        obj.field = ApiClient.convertToType(data['field'], 'String');
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('parameter_filters'))
        obj.parameter_filters = ApiClient.convertToType(data['parameter_filters'], [DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters]);
      if (data.hasOwnProperty('value'))
        obj.value = ApiClient.convertToType(data['value'], 'String');
    }
    return obj;
  }
}

/**
 * Required when exclusion_rule_set is passed. Filter field. Enum value: EVENT: To exclude the people who've carried out a certain action in the past few days as indicated by retention_days.
 * @member {String} field
 */
DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters.prototype.field = undefined;

/**
 * Required when exclusion_rule_set is passed. Filter operator between filter field and filter value. Enum value: EQ: equals.
 * @member {String} operator
 */
DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters.prototype.operator = undefined;

/**
 * List of filters on URL keywords or parameters. Within parameter_filters, you can add a maximum of one URL keyword filter (with field set to URL) and 10 parameter filters (with field not set to URL) . If specified, these filters (parameter_filters) are combined with the action filter (as specified by field, operator and value) using default AND logic to form the exclusion rule. For example, if retention_days is 30 and filter_set is set to {\"operator\": \"OR\", \"filters\":[{\"field\":\"EVENT\",\"operator\":\"EQ\", \"value\":\"PIXEL COMPLETE PAYMENT\"},\"parameter_filters\":[{\"field\":\"URL\",\"operator\":\"CONTAINS\",\"value\":\"us\"}]]}, the exclusion rule will create an audience that excludes people who carried out the \"Complete Payment\" action on a webpage with \"us\" included in the page URL within the past 30 days on the website where the Pixel is installed.
 * @member {Array.<module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters>} parameter_filters
 */
DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters.prototype.parameter_filters = undefined;

/**
 * Required when exclusion_rule_set is passed. Filter value. For enum values, see Enumeration - Filter Value.
 * @member {String} value
 */
DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters.prototype.value = undefined;

