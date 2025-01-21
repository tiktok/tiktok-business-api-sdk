/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {adgroupcreateAudienceRuleExclusionsRules} from './adgroupcreateAudienceRuleExclusionsRules.js';

/**
 * The adgroupcreateAudienceRuleExclusions model module.
 * @module model/adgroupcreateAudienceRuleExclusions
 * @version 0.1.2
 */
export class adgroupcreateAudienceRuleExclusions {
  /**
   * Constructs a new <code>adgroupcreateAudienceRuleExclusions</code>.
   * A set of exclusion rule object. Quantity range- 0 to 5, without repetition. For the format, see the \&quot;Rule set format\&quot; section below.[Audience Rule]((https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739566532187138)).
   * @alias module:model/adgroupcreateAudienceRuleExclusions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adgroupcreateAudienceRuleExclusions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adgroupcreateAudienceRuleExclusions} obj Optional instance to populate.
   * @return {module:model/adgroupcreateAudienceRuleExclusions} The populated <code>adgroupcreateAudienceRuleExclusions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adgroupcreateAudienceRuleExclusions();
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [adgroupcreateAudienceRuleExclusionsRules]);
    }
    return obj;
  }
}

/**
 * @member {String} operator
 */
adgroupcreateAudienceRuleExclusions.prototype.operator = undefined;

/**
 * @member {Array.<module:model/adgroupcreateAudienceRuleExclusionsRules>} rules
 */
adgroupcreateAudienceRuleExclusions.prototype.rules = undefined;

