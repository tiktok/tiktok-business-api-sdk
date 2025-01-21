/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {adgroupcreateAudienceRuleInclusionsRules} from './adgroupcreateAudienceRuleInclusionsRules.js';

/**
 * The adgroupcreateAudienceRuleInclusions model module.
 * @module model/adgroupcreateAudienceRuleInclusions
 * @version 0.1.2
 */
export class adgroupcreateAudienceRuleInclusions {
  /**
   * Constructs a new <code>adgroupcreateAudienceRuleInclusions</code>.
   * A set of inclusion rule object. Quantity range- 1 to 5, without repetition. For the format, see the \&quot;Rule set format\&quot; section below [Audience Rule]((https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739566532187138)).
   * @alias module:model/adgroupcreateAudienceRuleInclusions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adgroupcreateAudienceRuleInclusions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adgroupcreateAudienceRuleInclusions} obj Optional instance to populate.
   * @return {module:model/adgroupcreateAudienceRuleInclusions} The populated <code>adgroupcreateAudienceRuleInclusions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adgroupcreateAudienceRuleInclusions();
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
adgroupcreateAudienceRuleInclusions.prototype.operator = undefined;

/**
 * @member {Array.<module:model/adgroupcreateAudienceRuleInclusionsRules>} rules
 */
adgroupcreateAudienceRuleInclusions.prototype.rules = undefined;

