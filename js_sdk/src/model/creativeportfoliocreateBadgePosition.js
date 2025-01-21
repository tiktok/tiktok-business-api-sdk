/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The creativeportfoliocreateBadgePosition model module.
 * @module model/creativeportfoliocreateBadgePosition
 * @version 0.1.3
 */
export class creativeportfoliocreateBadgePosition {
  /**
   * Constructs a new <code>creativeportfoliocreateBadgePosition</code>.
   * Badge position information
   * @alias module:model/creativeportfoliocreateBadgePosition
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>creativeportfoliocreateBadgePosition</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/creativeportfoliocreateBadgePosition} obj Optional instance to populate.
   * @return {module:model/creativeportfoliocreateBadgePosition} The populated <code>creativeportfoliocreateBadgePosition</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new creativeportfoliocreateBadgePosition();
      if (data.hasOwnProperty('angle'))
        obj.angle = ApiClient.convertToType(data['angle'], 'Number');
      if (data.hasOwnProperty('position_x'))
        obj.position_x = ApiClient.convertToType(data['position_x'], 'Number');
      if (data.hasOwnProperty('position_y'))
        obj.position_y = ApiClient.convertToType(data['position_y'], 'Number');
    }
    return obj;
  }
}

/**
 * Initial rotation angle when the badge starts to show
 * @member {Number} angle
 */
creativeportfoliocreateBadgePosition.prototype.angle = undefined;

/**
 * Relative x-axis value of the top-left corner of the badge. It is the x coordinate of the top-left corner divided by 720. Range: 0-1
 * @member {Number} position_x
 */
creativeportfoliocreateBadgePosition.prototype.position_x = undefined;

/**
 *  Relative y-axis value of the top-left corner of the badge. It is the y coordinate of the top-left corner divided by 1280. Range: 0-1
 * @member {Number} position_y
 */
creativeportfoliocreateBadgePosition.prototype.position_y = undefined;

