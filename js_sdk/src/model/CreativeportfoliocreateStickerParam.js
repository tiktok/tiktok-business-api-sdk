/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CreativeportfoliocreateStickerParam model module.
 * @module model/CreativeportfoliocreateStickerParam
 * @version 0.1.7
 */
export class CreativeportfoliocreateStickerParam {
  /**
   * Constructs a new <code>CreativeportfoliocreateStickerParam</code>.
   * @alias module:model/CreativeportfoliocreateStickerParam
   * @class
   * @param color {String} 
   * @param title {String} 
   */
  constructor(color, title) {
    this.color = color;
    this.title = title;
  }

  /**
   * Constructs a <code>CreativeportfoliocreateStickerParam</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreativeportfoliocreateStickerParam} obj Optional instance to populate.
   * @return {module:model/CreativeportfoliocreateStickerParam} The populated <code>CreativeportfoliocreateStickerParam</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreativeportfoliocreateStickerParam();
      if (data.hasOwnProperty('color'))
        obj.color = ApiClient.convertToType(data['color'], 'String');
      if (data.hasOwnProperty('cutoff_time'))
        obj.cutoff_time = ApiClient.convertToType(data['cutoff_time'], 'String');
      if (data.hasOwnProperty('display_angle'))
        obj.display_angle = ApiClient.convertToType(data['display_angle'], 'Number');
      if (data.hasOwnProperty('giftcode'))
        obj.giftcode = ApiClient.convertToType(data['giftcode'], 'String');
      if (data.hasOwnProperty('landing_page_url'))
        obj.landing_page_url = ApiClient.convertToType(data['landing_page_url'], 'String');
      if (data.hasOwnProperty('live_tiktok_user_id'))
        obj.live_tiktok_user_id = ApiClient.convertToType(data['live_tiktok_user_id'], 'String');
      if (data.hasOwnProperty('opacity'))
        obj.opacity = ApiClient.convertToType(data['opacity'], 'String');
      if (data.hasOwnProperty('position_x'))
        obj.position_x = ApiClient.convertToType(data['position_x'], 'Number');
      if (data.hasOwnProperty('position_y'))
        obj.position_y = ApiClient.convertToType(data['position_y'], 'Number');
      if (data.hasOwnProperty('predefined_placement'))
        obj.predefined_placement = ApiClient.convertToType(data['predefined_placement'], 'String');
      if (data.hasOwnProperty('reminder_time'))
        obj.reminder_time = ApiClient.convertToType(data['reminder_time'], 'String');
      if (data.hasOwnProperty('size'))
        obj.size = ApiClient.convertToType(data['size'], 'String');
      if (data.hasOwnProperty('sticker_type'))
        obj.sticker_type = ApiClient.convertToType(data['sticker_type'], 'String');
      if (data.hasOwnProperty('title'))
        obj.title = ApiClient.convertToType(data['title'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} color
 */
CreativeportfoliocreateStickerParam.prototype.color = undefined;

/**
 * @member {String} cutoff_time
 */
CreativeportfoliocreateStickerParam.prototype.cutoff_time = undefined;

/**
 * @member {Number} display_angle
 */
CreativeportfoliocreateStickerParam.prototype.display_angle = undefined;

/**
 * @member {String} giftcode
 */
CreativeportfoliocreateStickerParam.prototype.giftcode = undefined;

/**
 * @member {String} landing_page_url
 */
CreativeportfoliocreateStickerParam.prototype.landing_page_url = undefined;

/**
 * @member {String} live_tiktok_user_id
 */
CreativeportfoliocreateStickerParam.prototype.live_tiktok_user_id = undefined;

/**
 * @member {String} opacity
 */
CreativeportfoliocreateStickerParam.prototype.opacity = undefined;

/**
 * @member {Number} position_x
 */
CreativeportfoliocreateStickerParam.prototype.position_x = undefined;

/**
 * @member {Number} position_y
 */
CreativeportfoliocreateStickerParam.prototype.position_y = undefined;

/**
 * @member {String} predefined_placement
 */
CreativeportfoliocreateStickerParam.prototype.predefined_placement = undefined;

/**
 * @member {String} reminder_time
 */
CreativeportfoliocreateStickerParam.prototype.reminder_time = undefined;

/**
 * @member {String} size
 */
CreativeportfoliocreateStickerParam.prototype.size = undefined;

/**
 * @member {String} sticker_type
 * @default 'COUNTDOWN'
 */
CreativeportfoliocreateStickerParam.prototype.sticker_type = 'COUNTDOWN';

/**
 * @member {String} title
 */
CreativeportfoliocreateStickerParam.prototype.title = undefined;

