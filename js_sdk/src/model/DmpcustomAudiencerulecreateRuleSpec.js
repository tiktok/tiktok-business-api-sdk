/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet} from './DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.js';
import {DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} from './DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.js';

/**
 * The DmpcustomAudiencerulecreateRuleSpec model module.
 * @module model/DmpcustomAudiencerulecreateRuleSpec
 * @version 1.2.1
 */
export class DmpcustomAudiencerulecreateRuleSpec {
  /**
   * Constructs a new <code>DmpcustomAudiencerulecreateRuleSpec</code>.
   * Rule of the audience.
   * @alias module:model/DmpcustomAudiencerulecreateRuleSpec
   * @class
   * @param inclusion_rule_set {module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} 
   */
  constructor(inclusion_rule_set) {
    this.inclusion_rule_set = inclusion_rule_set;
  }

  /**
   * Constructs a <code>DmpcustomAudiencerulecreateRuleSpec</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DmpcustomAudiencerulecreateRuleSpec} obj Optional instance to populate.
   * @return {module:model/DmpcustomAudiencerulecreateRuleSpec} The populated <code>DmpcustomAudiencerulecreateRuleSpec</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new DmpcustomAudiencerulecreateRuleSpec();
      if (data.hasOwnProperty('exclusion_rule_set'))
        obj.exclusion_rule_set = DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.constructFromObject(data['exclusion_rule_set']);
      if (data.hasOwnProperty('inclusion_rule_set'))
        obj.inclusion_rule_set = DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.constructFromObject(data['inclusion_rule_set']);
    }
    return obj;
  }
}

/**
 * @member {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet} exclusion_rule_set
 */
DmpcustomAudiencerulecreateRuleSpec.prototype.exclusion_rule_set = undefined;

/**
 * @member {module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} inclusion_rule_set
 */
DmpcustomAudiencerulecreateRuleSpec.prototype.inclusion_rule_set = undefined;

