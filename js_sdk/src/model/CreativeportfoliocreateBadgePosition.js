/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CreativeportfoliocreateBadgePosition model module.
 * @module model/CreativeportfoliocreateBadgePosition
 * @version 1.2.1
 */
export class CreativeportfoliocreateBadgePosition {
  /**
   * Constructs a new <code>CreativeportfoliocreateBadgePosition</code>.
   * @alias module:model/CreativeportfoliocreateBadgePosition
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CreativeportfoliocreateBadgePosition</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreativeportfoliocreateBadgePosition} obj Optional instance to populate.
   * @return {module:model/CreativeportfoliocreateBadgePosition} The populated <code>CreativeportfoliocreateBadgePosition</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreativeportfoliocreateBadgePosition();
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
 * @member {Number} angle
 */
CreativeportfoliocreateBadgePosition.prototype.angle = undefined;

/**
 * @member {Number} position_x
 */
CreativeportfoliocreateBadgePosition.prototype.position_x = undefined;

/**
 * @member {Number} position_y
 */
CreativeportfoliocreateBadgePosition.prototype.position_y = undefined;

