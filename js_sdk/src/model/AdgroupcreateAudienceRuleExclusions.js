/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdgroupcreateAudienceRuleExclusionsRules} from './AdgroupcreateAudienceRuleExclusionsRules.js';

/**
 * The AdgroupcreateAudienceRuleExclusions model module.
 * @module model/AdgroupcreateAudienceRuleExclusions
 * @version 0.1.7
 */
export class AdgroupcreateAudienceRuleExclusions {
  /**
   * Constructs a new <code>AdgroupcreateAudienceRuleExclusions</code>.
   * A set of exclusion rule object. Quantity range- 0 to 5, without repetition. For the format, see the \&quot;Rule set format\&quot; section below.[Audience Rule]((https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739566532187138)).
   * @alias module:model/AdgroupcreateAudienceRuleExclusions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateAudienceRuleExclusions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateAudienceRuleExclusions} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateAudienceRuleExclusions} The populated <code>AdgroupcreateAudienceRuleExclusions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateAudienceRuleExclusions();
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [AdgroupcreateAudienceRuleExclusionsRules]);
    }
    return obj;
  }
}

/**
 * @member {String} operator
 */
AdgroupcreateAudienceRuleExclusions.prototype.operator = undefined;

/**
 * @member {Array.<module:model/AdgroupcreateAudienceRuleExclusionsRules>} rules
 */
AdgroupcreateAudienceRuleExclusions.prototype.rules = undefined;

