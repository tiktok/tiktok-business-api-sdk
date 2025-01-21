/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {adgroupcreateAudienceRuleExclusions} from './adgroupcreateAudienceRuleExclusions.js';
import {adgroupcreateAudienceRuleInclusions} from './adgroupcreateAudienceRuleInclusions.js';

/**
 * The adgroupcreateAudienceRule model module.
 * @module model/adgroupcreateAudienceRule
 * @version 0.1.2
 */
export class adgroupcreateAudienceRule {
  /**
   * Constructs a new <code>adgroupcreateAudienceRule</code>.
   * List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746) endpoint.
   * @alias module:model/adgroupcreateAudienceRule
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adgroupcreateAudienceRule</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adgroupcreateAudienceRule} obj Optional instance to populate.
   * @return {module:model/adgroupcreateAudienceRule} The populated <code>adgroupcreateAudienceRule</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adgroupcreateAudienceRule();
      if (data.hasOwnProperty('exclusions'))
        obj.exclusions = adgroupcreateAudienceRuleExclusions.constructFromObject(data['exclusions']);
      if (data.hasOwnProperty('inclusions'))
        obj.inclusions = adgroupcreateAudienceRuleInclusions.constructFromObject(data['inclusions']);
    }
    return obj;
  }
}

/**
 * @member {module:model/adgroupcreateAudienceRuleExclusions} exclusions
 */
adgroupcreateAudienceRule.prototype.exclusions = undefined;

/**
 * @member {module:model/adgroupcreateAudienceRuleInclusions} inclusions
 */
adgroupcreateAudienceRule.prototype.inclusions = undefined;

