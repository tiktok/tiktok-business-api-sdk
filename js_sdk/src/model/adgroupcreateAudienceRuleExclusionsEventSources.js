/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The adgroupcreateAudienceRuleExclusionsEventSources model module.
 * @module model/adgroupcreateAudienceRuleExclusionsEventSources
 * @version 0.1.2
 */
export class adgroupcreateAudienceRuleExclusionsEventSources {
  /**
   * Constructs a new <code>adgroupcreateAudienceRuleExclusionsEventSources</code>.
   * @alias module:model/adgroupcreateAudienceRuleExclusionsEventSources
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adgroupcreateAudienceRuleExclusionsEventSources</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adgroupcreateAudienceRuleExclusionsEventSources} obj Optional instance to populate.
   * @return {module:model/adgroupcreateAudienceRuleExclusionsEventSources} The populated <code>adgroupcreateAudienceRuleExclusionsEventSources</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adgroupcreateAudienceRuleExclusionsEventSources();
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
adgroupcreateAudienceRuleExclusionsEventSources.prototype.id = undefined;

/**
 * @member {String} type
 */
adgroupcreateAudienceRuleExclusionsEventSources.prototype.type = undefined;

