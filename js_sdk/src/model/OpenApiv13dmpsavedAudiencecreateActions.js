/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13dmpsavedAudiencecreateActions model module.
 * @module model/OpenApiv13dmpsavedAudiencecreateActions
 * @version 0.1.2
 */
export class OpenApiv13dmpsavedAudiencecreateActions {
  /**
   * Constructs a new <code>OpenApiv13dmpsavedAudiencecreateActions</code>.
   * @alias module:model/OpenApiv13dmpsavedAudiencecreateActions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13dmpsavedAudiencecreateActions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13dmpsavedAudiencecreateActions} obj Optional instance to populate.
   * @return {module:model/OpenApiv13dmpsavedAudiencecreateActions} The populated <code>OpenApiv13dmpsavedAudiencecreateActions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13dmpsavedAudiencecreateActions();
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
 * Required when actions has been specified and valid only when TikTok placement is the only placement selected in your ad group. IDs of the action categories (behaviors) or hashtags that you want to target. You can get action category IDs via /tool/action_category/.
 * @member {Array.<String>} action_category_ids
 */
OpenApiv13dmpsavedAudiencecreateActions.prototype.action_category_ids = undefined;

/**
 * Required when actions has been specified. The time period to include actions from. Enum values: 0, 7, 15. If action_scene is CREATOR_RELATED or HASHTAG_RELATED, 0 will be used regardless of the value you pass in. 0 means that there is no definite timeframe to select actions from.
 * @member {Number} action_period
 */
OpenApiv13dmpsavedAudiencecreateActions.prototype.action_period = undefined;

/**
 * Required when actions has been specified. Where you can collect information about user actions. Enum values: VIDEO_RELATED, CREATOR_RELATED, HASHTAG_RELATED.
 * @member {String} action_scene
 */
OpenApiv13dmpsavedAudiencecreateActions.prototype.action_scene = undefined;

/**
 * Required when actions has been specified. Video-related Actions. If action_scene is VIDEO_RELATED, the allowed values are: WATCHED_TO_END,LIKED,COMMENTED,SHARED. If action_scene is CREATOR_RELATED, the allowed values are: FOLLOWING, VIEW_HOMEPAGE. If action_scene is HASHTAG_RELATED, the allowed value is VIEW_HASHTAG.
 * @member {Array.<String>} video_user_actions
 */
OpenApiv13dmpsavedAudiencecreateActions.prototype.video_user_actions = undefined;

