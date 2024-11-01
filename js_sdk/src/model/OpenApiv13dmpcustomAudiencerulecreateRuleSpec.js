/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet} from './OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.js';
import {OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} from './OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.js';

/**
 * The OpenApiv13dmpcustomAudiencerulecreateRuleSpec model module.
 * @module model/OpenApiv13dmpcustomAudiencerulecreateRuleSpec
 * @version 0.1.2
 */
export class OpenApiv13dmpcustomAudiencerulecreateRuleSpec {
  /**
   * Constructs a new <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpec</code>.
   * Rule of the audience.
   * @alias module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpec
   * @class
   * @param inclusion_rule_set {module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} 
   */
  constructor(inclusion_rule_set) {
    this.inclusion_rule_set = inclusion_rule_set;
  }

  /**
   * Constructs a <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpec</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpec} obj Optional instance to populate.
   * @return {module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpec} The populated <code>OpenApiv13dmpcustomAudiencerulecreateRuleSpec</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13dmpcustomAudiencerulecreateRuleSpec();
      if (data.hasOwnProperty('exclusion_rule_set'))
        obj.exclusion_rule_set = OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.constructFromObject(data['exclusion_rule_set']);
      if (data.hasOwnProperty('inclusion_rule_set'))
        obj.inclusion_rule_set = OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.constructFromObject(data['inclusion_rule_set']);
    }
    return obj;
  }
}

/**
 * @member {module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecExclusionRuleSet} exclusion_rule_set
 */
OpenApiv13dmpcustomAudiencerulecreateRuleSpec.prototype.exclusion_rule_set = undefined;

/**
 * @member {module:model/OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} inclusion_rule_set
 */
OpenApiv13dmpcustomAudiencerulecreateRuleSpec.prototype.inclusion_rule_set = undefined;

