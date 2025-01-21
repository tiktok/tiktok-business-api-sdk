/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules} from './dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules.js';

/**
 * The dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet model module.
 * @module model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet
 * @version 0.1.2
 */
export class dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet {
  /**
   * Constructs a new <code>dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet</code>.
   * Details of the inclusion rule set.
   * @alias module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet
   * @class
   * @param operator {String} Operator between the inclusion rules within the inclusion rule set. Enum value: OR. If you provide more than one inclusion rule, the inclusion rules will be combined using OR logic to broaden the audience.
   * @param rules {Array.<module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules>} A list of inclusion rules within the inclusion rule set.
   */
  constructor(operator, rules) {
    this.operator = operator;
    this.rules = rules;
  }

  /**
   * Constructs a <code>dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} obj Optional instance to populate.
   * @return {module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} The populated <code>dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet();
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules]);
    }
    return obj;
  }
}

/**
 * Operator between the inclusion rules within the inclusion rule set. Enum value: OR. If you provide more than one inclusion rule, the inclusion rules will be combined using OR logic to broaden the audience.
 * @member {String} operator
 */
dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.prototype.operator = undefined;

/**
 * A list of inclusion rules within the inclusion rule set.
 * @member {Array.<module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules>} rules
 */
dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.prototype.rules = undefined;

