/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {adgroupcreateAudienceRuleInclusionsRules} from './adgroupcreateAudienceRuleInclusionsRules.js';

/**
 * The adgroupupdateAudienceRuleExclusions model module.
 * @module model/adgroupupdateAudienceRuleExclusions
 * @version 0.1.2
 */
export class adgroupupdateAudienceRuleExclusions {
  /**
   * Constructs a new <code>adgroupupdateAudienceRuleExclusions</code>.
   * A set of exclusion rule object. Quantity range- 0 to 5, without repetition. For the format, see the \&quot;Rule set format\&quot; section below.[Audience Rule]((https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739566532187138)).
   * @alias module:model/adgroupupdateAudienceRuleExclusions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adgroupupdateAudienceRuleExclusions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adgroupupdateAudienceRuleExclusions} obj Optional instance to populate.
   * @return {module:model/adgroupupdateAudienceRuleExclusions} The populated <code>adgroupupdateAudienceRuleExclusions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adgroupupdateAudienceRuleExclusions();
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('rules'))
        obj.rules = ApiClient.convertToType(data['rules'], [adgroupcreateAudienceRuleInclusionsRules]);
    }
    return obj;
  }
}

/**
 * @member {String} operator
 */
adgroupupdateAudienceRuleExclusions.prototype.operator = undefined;

/**
 * @member {Array.<module:model/adgroupcreateAudienceRuleInclusionsRules>} rules
 */
adgroupupdateAudienceRuleExclusions.prototype.rules = undefined;

