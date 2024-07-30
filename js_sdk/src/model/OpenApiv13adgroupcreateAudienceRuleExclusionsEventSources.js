/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources model module.
 * @module model/OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources
 * @version 0.1.1
 */
export class OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources {
  /**
   * Constructs a new <code>OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources</code>.
   * @alias module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources} The populated <code>OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources();
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
OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources.prototype.id = undefined;

/**
 * @member {String} type
 */
OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources.prototype.type = undefined;

