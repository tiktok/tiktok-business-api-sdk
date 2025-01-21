/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {adgroupcreateAudienceRuleInclusions} from './adgroupcreateAudienceRuleInclusions.js';
import {adgroupupdateAudienceRuleExclusions} from './adgroupupdateAudienceRuleExclusions.js';

/**
 * The adgroupupdateAudienceRule model module.
 * @module model/adgroupupdateAudienceRule
 * @version 0.1.2
 */
export class adgroupupdateAudienceRule {
  /**
   * Constructs a new <code>adgroupupdateAudienceRule</code>.
   * List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746) endpoint.
   * @alias module:model/adgroupupdateAudienceRule
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adgroupupdateAudienceRule</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adgroupupdateAudienceRule} obj Optional instance to populate.
   * @return {module:model/adgroupupdateAudienceRule} The populated <code>adgroupupdateAudienceRule</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adgroupupdateAudienceRule();
      if (data.hasOwnProperty('exclusions'))
        obj.exclusions = adgroupupdateAudienceRuleExclusions.constructFromObject(data['exclusions']);
      if (data.hasOwnProperty('inclusions'))
        obj.inclusions = adgroupcreateAudienceRuleInclusions.constructFromObject(data['inclusions']);
    }
    return obj;
  }
}

/**
 * @member {module:model/adgroupupdateAudienceRuleExclusions} exclusions
 */
adgroupupdateAudienceRule.prototype.exclusions = undefined;

/**
 * @member {module:model/adgroupcreateAudienceRuleInclusions} inclusions
 */
adgroupupdateAudienceRule.prototype.inclusions = undefined;

