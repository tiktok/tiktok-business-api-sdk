/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {OpenApiv13adgroupcreateAudienceRuleExclusions} from './OpenApiv13adgroupcreateAudienceRuleExclusions.js';
import {OpenApiv13adgroupcreateAudienceRuleInclusions} from './OpenApiv13adgroupcreateAudienceRuleInclusions.js';

/**
 * The OpenApiv13adgroupcreateAudienceRule model module.
 * @module model/OpenApiv13adgroupcreateAudienceRule
 * @version 0.1.1
 */
export class OpenApiv13adgroupcreateAudienceRule {
  /**
   * Constructs a new <code>OpenApiv13adgroupcreateAudienceRule</code>.
   * List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746) endpoint.
   * @alias module:model/OpenApiv13adgroupcreateAudienceRule
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adgroupcreateAudienceRule</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adgroupcreateAudienceRule} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adgroupcreateAudienceRule} The populated <code>OpenApiv13adgroupcreateAudienceRule</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adgroupcreateAudienceRule();
      if (data.hasOwnProperty('exclusions'))
        obj.exclusions = OpenApiv13adgroupcreateAudienceRuleExclusions.constructFromObject(data['exclusions']);
      if (data.hasOwnProperty('inclusions'))
        obj.inclusions = OpenApiv13adgroupcreateAudienceRuleInclusions.constructFromObject(data['inclusions']);
    }
    return obj;
  }
}

/**
 * @member {module:model/OpenApiv13adgroupcreateAudienceRuleExclusions} exclusions
 */
OpenApiv13adgroupcreateAudienceRule.prototype.exclusions = undefined;

/**
 * @member {module:model/OpenApiv13adgroupcreateAudienceRuleInclusions} inclusions
 */
OpenApiv13adgroupcreateAudienceRule.prototype.inclusions = undefined;

