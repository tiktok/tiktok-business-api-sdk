/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules} from './dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules.js';

/**
 * The dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet model module.
 * @module model/dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet
 * @version 0.1.2
 */
export class dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet {
  /**
   * Constructs a new <code>dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet</code>.
   * @alias module:model/dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet
   * @class
   * @param operator {String} Required when exclusion_rule_set is passed. Operator between the exclusion rules within the exclusion rule set. Enum value: OR.
   * @param rules {Array.<module:model/dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules>} Required when exclusion_rule_set is passed. A list of exclusion rules within the exclusion rule set.
   */
  constructor(operator, rules) {
    this.operator = operator;
    this.rules = rules;
  }

  /**
   * Constructs a <code>dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet} obj Optional instance to populate.
   * @return {module:model/dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet} The populated <code>dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet();
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules]);
    }
    return obj;
  }
}

/**
 * Required when exclusion_rule_set is passed. Operator between the exclusion rules within the exclusion rule set. Enum value: OR.
 * @member {String} operator
 */
dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.prototype.operator = undefined;

/**
 * Required when exclusion_rule_set is passed. A list of exclusion rules within the exclusion rule set.
 * @member {Array.<module:model/dmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules>} rules
 */
dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.prototype.rules = undefined;

