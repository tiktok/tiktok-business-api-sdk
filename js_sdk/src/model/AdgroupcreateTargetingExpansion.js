/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupcreateTargetingExpansion model module.
 * @module model/AdgroupcreateTargetingExpansion
 * @version 0.1.3
 */
export class AdgroupcreateTargetingExpansion {
  /**
   * Constructs a new <code>AdgroupcreateTargetingExpansion</code>.
   * Settings about targeting expansion
   * @alias module:model/AdgroupcreateTargetingExpansion
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateTargetingExpansion</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateTargetingExpansion} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateTargetingExpansion} The populated <code>AdgroupcreateTargetingExpansion</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateTargetingExpansion();
      if (data.hasOwnProperty('expansion_enabled'))
        obj.expansion_enabled = ApiClient.convertToType(data['expansion_enabled'], 'Boolean');
      if (data.hasOwnProperty('expansion_types'))
        obj.expansion_types = ApiClient.convertToType(data['expansion_types'], ['String']);
    }
    return obj;
  }
}

/**
 * Whether to enable targeting expansion
 * @member {Boolean} expansion_enabled
 */
AdgroupcreateTargetingExpansion.prototype.expansion_enabled = undefined;

/**
 * The target audience types that you want to expand. Required when `expansion_enabled` is `true`. Target audience types that are eligible for expanding must already have a value or selection. Enum values- `AGE``GENDER``INTEREST_AND_BEHAVIOR`- This type includes `ad_tag_v2`, `video_action`,  `action_categories`, and `action_scene`. `CUSTOM_AUDIENCE`- This type includes `retargeting_tags` and `retargeting_tags_exclude`.
 * @member {Array.<String>} expansion_types
 */
AdgroupcreateTargetingExpansion.prototype.expansion_types = undefined;

