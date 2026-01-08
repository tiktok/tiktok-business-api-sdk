/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupupdateTargetingExpansion model module.
 * @module model/AdgroupupdateTargetingExpansion
 * @version 0.1.9
 */
export class AdgroupupdateTargetingExpansion {
  /**
   * Constructs a new <code>AdgroupupdateTargetingExpansion</code>.
   * @alias module:model/AdgroupupdateTargetingExpansion
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupupdateTargetingExpansion</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupupdateTargetingExpansion} obj Optional instance to populate.
   * @return {module:model/AdgroupupdateTargetingExpansion} The populated <code>AdgroupupdateTargetingExpansion</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupupdateTargetingExpansion();
      if (data.hasOwnProperty('expansion_enabled'))
        obj.expansion_enabled = ApiClient.convertToType(data['expansion_enabled'], 'Boolean');
      if (data.hasOwnProperty('expansion_types'))
        obj.expansion_types = ApiClient.convertToType(data['expansion_types'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {Boolean} expansion_enabled
 */
AdgroupupdateTargetingExpansion.prototype.expansion_enabled = undefined;

/**
 * @member {Array.<String>} expansion_types
 */
AdgroupupdateTargetingExpansion.prototype.expansion_types = undefined;

