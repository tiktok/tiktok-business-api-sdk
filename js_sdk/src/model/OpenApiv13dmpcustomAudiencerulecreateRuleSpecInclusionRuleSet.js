/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules} from './OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules.js';

/**
 * The OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet model module.
 * @module model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet
 * @version 0.1.2
 */
export class OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet {
  /**
   * Constructs a new <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet</code>.
   * Details of the inclusion rule set.
   * @alias module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet
   * @class
   * @param operator {String} Operator between the inclusion rules within the inclusion rule set. Enum value: OR. If you provide more than one inclusion rule, the inclusion rules will be combined using OR logic to broaden the audience.
   * @param rules {Array.<module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules>} A list of inclusion rules within the inclusion rule set.
   */
  constructor(operator, rules) {
    this.operator = operator;
    this.rules = rules;
  }

  /**
   * Constructs a <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} obj Optional instance to populate.
   * @return {module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} The populated <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet();
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules]);
    }
    return obj;
  }
}

/**
 * Operator between the inclusion rules within the inclusion rule set. Enum value: OR. If you provide more than one inclusion rule, the inclusion rules will be combined using OR logic to broaden the audience.
 * @member {String} operator
 */
OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.prototype.operator = undefined;

/**
 * A list of inclusion rules within the inclusion rule set.
 * @member {Array.<module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules>} rules
 */
OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.prototype.rules = undefined;

