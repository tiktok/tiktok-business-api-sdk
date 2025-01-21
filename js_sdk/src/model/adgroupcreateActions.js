/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The adgroupcreateActions model module.
 * @module model/adgroupcreateActions
 * @version 0.1.2
 */
export class adgroupcreateActions {
  /**
   * Constructs a new <code>adgroupcreateActions</code>.
   * @alias module:model/adgroupcreateActions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>adgroupcreateActions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/adgroupcreateActions} obj Optional instance to populate.
   * @return {module:model/adgroupcreateActions} The populated <code>adgroupcreateActions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new adgroupcreateActions();
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
 * IDs of the action categories (behaviors) or hashtags that you want to target. This field is valid only when TikTok placement is the only placement selected.
 * @member {Array.<String>} action_category_ids
 */
adgroupcreateActions.prototype.action_category_ids = undefined;

/**
 * Select a time period to include actions from. Supported values- `0`, `7`, `15`. If `action_scene` is `CREATOR_RELATED` or `HASHTAG_RELATED`, 0 will be used regardless of the value you pass in. `0` means that there is no definite timeframe to select actions from.
 * @member {Number} action_period
 */
adgroupcreateActions.prototype.action_period = undefined;

/**
 * Where you can collect information about user actions. Enum values- `VIDEO_RELATED`, `CREATOR_RELATED`, `HASHTAG_RELATED`.
 * @member {String} action_scene
 */
adgroupcreateActions.prototype.action_scene = undefined;

/**
 * Video-related Actions. If `action_scene` is `VIDEO_RELATED`, the allowed values are- `WATCHED_TO_END`,`LIKED`,`COMMENTED`,`SHARED`. If `action_scene` is `CREATOR_RELATED`, the allowed values are- `FOLLOWING`, `VIEW_HOMEPAGE`. If `action_scene` is `HASHTAG_RELATED`, the allowed value is `VIEW_HASHTAG`.
 * @member {Array.<String>} video_user_actions
 */
adgroupcreateActions.prototype.video_user_actions = undefined;

