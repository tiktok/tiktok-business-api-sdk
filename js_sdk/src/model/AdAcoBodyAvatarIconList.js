/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdAcoBodyAvatarIcon} from './AdAcoBodyAvatarIcon.js';

/**
 * The AdAcoBodyAvatarIconList model module.
 * @module model/AdAcoBodyAvatarIconList
 * @version 0.1.7
 */
export class AdAcoBodyAvatarIconList {
  /**
   * Constructs a new <code>AdAcoBodyAvatarIconList</code>.
   * @alias module:model/AdAcoBodyAvatarIconList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdAcoBodyAvatarIconList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoBodyAvatarIconList} obj Optional instance to populate.
   * @return {module:model/AdAcoBodyAvatarIconList} The populated <code>AdAcoBodyAvatarIconList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoBodyAvatarIconList();
      if (data.hasOwnProperty('avatar_icon'))
        obj.avatar_icon = AdAcoBodyAvatarIcon.constructFromObject(data['avatar_icon']);
    }
    return obj;
  }
}

/**
 * @member {module:model/AdAcoBodyAvatarIcon} avatar_icon
 */
AdAcoBodyAvatarIconList.prototype.avatar_icon = undefined;

