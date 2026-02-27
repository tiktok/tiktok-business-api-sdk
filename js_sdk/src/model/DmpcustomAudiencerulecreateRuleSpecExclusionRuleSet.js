/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules} from './DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules.js';

/**
 * The DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet model module.
 * @module model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet
 * @version 1.2.1
 */
export class DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet {
  /**
   * Constructs a new <code>DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet</code>.
   * @alias module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet
   * @class
   * @param operator {String} Required when exclusion_rule_set is passed. Operator between the exclusion rules within the exclusion rule set. Enum value: OR.
   * @param rules {Array.<module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules>} Required when exclusion_rule_set is passed. A list of exclusion rules within the exclusion rule set.
   */
  constructor(operator, rules) {
    this.operator = operator;
    this.rules = rules;
  }

  /**
   * Constructs a <code>DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet} obj Optional instance to populate.
   * @return {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet} The populated <code>DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet();
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules]);
    }
    return obj;
  }
}

/**
 * Required when exclusion_rule_set is passed. Operator between the exclusion rules within the exclusion rule set. Enum value: OR.
 * @member {String} operator
 */
DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.prototype.operator = undefined;

/**
 * Required when exclusion_rule_set is passed. A list of exclusion rules within the exclusion rule set.
 * @member {Array.<module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules>} rules
 */
DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.prototype.rules = undefined;

