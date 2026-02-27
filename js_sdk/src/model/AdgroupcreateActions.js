/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupcreateActions model module.
 * @module model/AdgroupcreateActions
 * @version 1.2.1
 */
export class AdgroupcreateActions {
  /**
   * Constructs a new <code>AdgroupcreateActions</code>.
   * @alias module:model/AdgroupcreateActions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateActions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateActions} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateActions} The populated <code>AdgroupcreateActions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateActions();
      if (data.hasOwnProperty('action_category_ids'))
        obj.action_category_ids = ApiClient.convertToType(data['action_category_ids'], ['String']);
      if (data.hasOwnProperty('action_period'))
        obj.action_period = ApiClient.convertToType(data['action_period'], 'Number');
      if (data.hasOwnProperty('action_scene'))
        obj.action_scene = ApiClient.convertToType(data['action_scene'], 'String');
      if (data.hasOwnProperty('video_user_actions'))
        obj.video_user_actions = ApiClient.convertToType(data['video_user_actions'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} action_category_ids
 */
AdgroupcreateActions.prototype.action_category_ids = undefined;

/**
 * @member {Number} action_period
 */
AdgroupcreateActions.prototype.action_period = undefined;

/**
 * @member {String} action_scene
 */
AdgroupcreateActions.prototype.action_scene = undefined;

/**
 * @member {Array.<String>} video_user_actions
 */
AdgroupcreateActions.prototype.video_user_actions = undefined;

