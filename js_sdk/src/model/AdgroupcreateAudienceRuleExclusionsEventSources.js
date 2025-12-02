/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupcreateAudienceRuleExclusionsEventSources model module.
 * @module model/AdgroupcreateAudienceRuleExclusionsEventSources
 * @version 0.1.9
 */
export class AdgroupcreateAudienceRuleExclusionsEventSources {
  /**
   * Constructs a new <code>AdgroupcreateAudienceRuleExclusionsEventSources</code>.
   * @alias module:model/AdgroupcreateAudienceRuleExclusionsEventSources
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateAudienceRuleExclusionsEventSources</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateAudienceRuleExclusionsEventSources} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateAudienceRuleExclusionsEventSources} The populated <code>AdgroupcreateAudienceRuleExclusionsEventSources</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateAudienceRuleExclusionsEventSources();
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'String');
      if (data.hasOwnProperty('type'))
        obj.type = ApiClient.convertToType(data['type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} id
 */
AdgroupcreateAudienceRuleExclusionsEventSources.prototype.id = undefined;

/**
 * @member {String} type
 */
AdgroupcreateAudienceRuleExclusionsEventSources.prototype.type = undefined;

