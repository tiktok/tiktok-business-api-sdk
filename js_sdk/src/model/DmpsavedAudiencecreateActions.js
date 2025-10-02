/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The DmpsavedAudiencecreateActions model module.
 * @module model/DmpsavedAudiencecreateActions
 * @version 0.1.8
 */
export class DmpsavedAudiencecreateActions {
  /**
   * Constructs a new <code>DmpsavedAudiencecreateActions</code>.
   * @alias module:model/DmpsavedAudiencecreateActions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>DmpsavedAudiencecreateActions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DmpsavedAudiencecreateActions} obj Optional instance to populate.
   * @return {module:model/DmpsavedAudiencecreateActions} The populated <code>DmpsavedAudiencecreateActions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new DmpsavedAudiencecreateActions();
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
DmpsavedAudiencecreateActions.prototype.action_category_ids = undefined;

/**
 * Required when actions has been specified. The time period to include actions from. Enum values: 0, 7, 15. If action_scene is CREATOR_RELATED or HASHTAG_RELATED, 0 will be used regardless of the value you pass in. 0 means that there is no definite timeframe to select actions from.
 * @member {Number} action_period
 */
DmpsavedAudiencecreateActions.prototype.action_period = undefined;

/**
 * Required when actions has been specified. Where you can collect information about user actions. Enum values: VIDEO_RELATED, CREATOR_RELATED, HASHTAG_RELATED.
 * @member {String} action_scene
 */
DmpsavedAudiencecreateActions.prototype.action_scene = undefined;

/**
 * Required when actions has been specified. Video-related Actions. If action_scene is VIDEO_RELATED, the allowed values are: WATCHED_TO_END,LIKED,COMMENTED,SHARED. If action_scene is CREATOR_RELATED, the allowed values are: FOLLOWING, VIEW_HOMEPAGE. If action_scene is HASHTAG_RELATED, the allowed value is VIEW_HASHTAG.
 * @member {Array.<String>} video_user_actions
 */
DmpsavedAudiencecreateActions.prototype.video_user_actions = undefined;

