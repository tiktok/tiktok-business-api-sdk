/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';
import {OpenApiv13adgroupcreateAudienceRuleExclusionsRules} from './OpenApiv13adgroupcreateAudienceRuleExclusionsRules';

/**
 * The OpenApiv13adgroupcreateAudienceRuleExclusions model module.
 * @module model/OpenApiv13adgroupcreateAudienceRuleExclusions
 * @version 0.1.1
 */
export class OpenApiv13adgroupcreateAudienceRuleExclusions {
  /**
   * Constructs a new <code>OpenApiv13adgroupcreateAudienceRuleExclusions</code>.
   * A set of exclusion rule object. Quantity range- 0 to 5, without repetition. For the format, see the \&quot;Rule set format\&quot; section below.[Audience Rule]((https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739566532187138)).
   * @alias module:model/OpenApiv13adgroupcreateAudienceRuleExclusions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adgroupcreateAudienceRuleExclusions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adgroupcreateAudienceRuleExclusions} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adgroupcreateAudienceRuleExclusions} The populated <code>OpenApiv13adgroupcreateAudienceRuleExclusions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adgroupcreateAudienceRuleExclusions();
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [OpenApiv13adgroupcreateAudienceRuleExclusionsRules]);
    }
    return obj;
  }
}

/**
 * @member {String} operator
 */
OpenApiv13adgroupcreateAudienceRuleExclusions.prototype.operator = undefined;

/**
 * @member {Array.<module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsRules>} rules
 */
OpenApiv13adgroupcreateAudienceRuleExclusions.prototype.rules = undefined;

