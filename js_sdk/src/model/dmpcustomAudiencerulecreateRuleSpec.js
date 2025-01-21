/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet} from './dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.js';
import {dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} from './dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.js';

/**
 * The dmpcustomAudiencerulecreateRuleSpec model module.
 * @module model/dmpcustomAudiencerulecreateRuleSpec
 * @version 0.1.2
 */
export class dmpcustomAudiencerulecreateRuleSpec {
  /**
   * Constructs a new <code>dmpcustomAudiencerulecreateRuleSpec</code>.
   * Rule of the audience.
   * @alias module:model/dmpcustomAudiencerulecreateRuleSpec
   * @class
   * @param inclusion_rule_set {module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} 
   */
  constructor(inclusion_rule_set) {
    this.inclusion_rule_set = inclusion_rule_set;
  }

  /**
   * Constructs a <code>dmpcustomAudiencerulecreateRuleSpec</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/dmpcustomAudiencerulecreateRuleSpec} obj Optional instance to populate.
   * @return {module:model/dmpcustomAudiencerulecreateRuleSpec} The populated <code>dmpcustomAudiencerulecreateRuleSpec</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new dmpcustomAudiencerulecreateRuleSpec();
      if (data.hasOwnProperty('exclusion_rule_set'))
        obj.exclusion_rule_set = dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.constructFromObject(data['exclusion_rule_set']);
      if (data.hasOwnProperty('inclusion_rule_set'))
        obj.inclusion_rule_set = dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.constructFromObject(data['inclusion_rule_set']);
    }
    return obj;
  }
}

/**
 * @member {module:model/dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet} exclusion_rule_set
 */
dmpcustomAudiencerulecreateRuleSpec.prototype.exclusion_rule_set = undefined;

/**
 * @member {module:model/dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} inclusion_rule_set
 */
dmpcustomAudiencerulecreateRuleSpec.prototype.inclusion_rule_set = undefined;

