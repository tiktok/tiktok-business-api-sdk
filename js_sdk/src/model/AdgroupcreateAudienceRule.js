/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdgroupcreateAudienceRuleExclusions} from './AdgroupcreateAudienceRuleExclusions.js';
import {AdgroupcreateAudienceRuleInclusions} from './AdgroupcreateAudienceRuleInclusions.js';

/**
 * The AdgroupcreateAudienceRule model module.
 * @module model/AdgroupcreateAudienceRule
 * @version 0.1.5
 */
export class AdgroupcreateAudienceRule {
  /**
   * Constructs a new <code>AdgroupcreateAudienceRule</code>.
   * List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746) endpoint.
   * @alias module:model/AdgroupcreateAudienceRule
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateAudienceRule</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateAudienceRule} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateAudienceRule} The populated <code>AdgroupcreateAudienceRule</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateAudienceRule();
      if (data.hasOwnProperty('exclusions'))
        obj.exclusions = AdgroupcreateAudienceRuleExclusions.constructFromObject(data['exclusions']);
      if (data.hasOwnProperty('inclusions'))
        obj.inclusions = AdgroupcreateAudienceRuleInclusions.constructFromObject(data['inclusions']);
    }
    return obj;
  }
}

/**
 * @member {module:model/AdgroupcreateAudienceRuleExclusions} exclusions
 */
AdgroupcreateAudienceRule.prototype.exclusions = undefined;

/**
 * @member {module:model/AdgroupcreateAudienceRuleInclusions} inclusions
 */
AdgroupcreateAudienceRule.prototype.inclusions = undefined;

