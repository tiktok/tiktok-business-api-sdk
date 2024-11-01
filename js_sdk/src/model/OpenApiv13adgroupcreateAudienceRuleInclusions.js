/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OpenApiv13adgroupcreateAudienceRuleInclusionsRules} from './OpenApiv13adgroupcreateAudienceRuleInclusionsRules.js';

/**
 * The OpenApiv13adgroupcreateAudienceRuleInclusions model module.
 * @module model/OpenApiv13adgroupcreateAudienceRuleInclusions
 * @version 0.1.2
 */
export class OpenApiv13adgroupcreateAudienceRuleInclusions {
  /**
   * Constructs a new <code>OpenApiv13adgroupcreateAudienceRuleInclusions</code>.
   * A set of inclusion rule object. Quantity range- 1 to 5, without repetition. For the format, see the \&quot;Rule set format\&quot; section below [Audience Rule]((https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739566532187138)).
   * @alias module:model/OpenApiv13adgroupcreateAudienceRuleInclusions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adgroupcreateAudienceRuleInclusions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adgroupcreateAudienceRuleInclusions} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adgroupcreateAudienceRuleInclusions} The populated <code>OpenApiv13adgroupcreateAudienceRuleInclusions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adgroupcreateAudienceRuleInclusions();
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [OpenApiv13adgroupcreateAudienceRuleInclusionsRules]);
    }
    return obj;
  }
}

/**
 * @member {String} operator
 */
OpenApiv13adgroupcreateAudienceRuleInclusions.prototype.operator = undefined;

/**
 * @member {Array.<module:model/OpenApiv13adgroupcreateAudienceRuleInclusionsRules>} rules
 */
OpenApiv13adgroupcreateAudienceRuleInclusions.prototype.rules = undefined;

