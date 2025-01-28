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
 * @version 0.1.3
 */
export class CreativeportfoliocreateStickerParam {
  /**
   * Constructs a new <code>CreativeportfoliocreateStickerParam</code>.
   * Details of the Countdown Sticker you want to create. You can see an example of Countdown Sticker in [Countdown Sticker](https://ads.tiktok.com/help/article?aid&#x3D;10007423). Note: You can only create one countdown sticker at a time
   * @alias module:model/CreativeportfoliocreateStickerParam
   * @class
   */
  constructor() {
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
 * Background color of the sticker. Enum values: `ORANGE`(orange), `BLACK`(black), `RED`(red), `BLUE`(blue)
 * @member {String} color
 */
CreativeportfoliocreateStickerParam.prototype.color = undefined;

/**
 * Countdown deadline (when `sticker_type`= `COUNTDOWN` or `REMINDER_COUNTDOWN`) or LIVE start time (when `sticker_type`=`LIVE_REMINDER_COUNTDOWN`) for the Countdown Sticker, in the format of \"2022-10-30 00:00:00\" (UTC+0 Time). Note: The time you pass in via this field is regarded as UTC+0 time by default and you cannot modify the default time zone
 * @member {String} cutoff_time
 */
CreativeportfoliocreateStickerParam.prototype.cutoff_time = undefined;

/**
 * Sticker display angle. Value range: `[-180, +180]`. `+90` means to rotate the sticker clockwise by 90 degrees
 * @member {Number} display_angle
 */
CreativeportfoliocreateStickerParam.prototype.display_angle = undefined;

/**
 * The landing page URL you will be redirected to when you click the reminder after the countdown for an non-LIVE event ends. Required when `sticker_type` is `REMINDER_COUNTDOWN`
 * @member {String} landing_page_url
 */
CreativeportfoliocreateStickerParam.prototype.landing_page_url = undefined;

/**
 * TikTok user ID of the LIVE event host. Required when `sticker_type` is `LIVE_REMINDER_COUNTDOWN`. After specifying this field, you will be redirected to the host LIVE room when you click the reminder for a LIVE event
 * @member {String} live_tiktok_user_id
 */
CreativeportfoliocreateStickerParam.prototype.live_tiktok_user_id = undefined;

/**
 * Sticker opacity. Enum values: `0.7`, `0.8`, `0.9`, `1`. The lower the value, the more transparent the sticker will be
 * @member {String} opacity
 */
CreativeportfoliocreateStickerParam.prototype.opacity = undefined;

/**
 * The x-axis coordinate relative to the top-left corner of the screen. Value range: 50-109
 * @member {Number} position_x
 */
CreativeportfoliocreateStickerParam.prototype.position_x = undefined;

/**
 * The y-axis coordinate relative to the top-left corner of the screen. Value range: 141-506
 * @member {Number} position_y
 */
CreativeportfoliocreateStickerParam.prototype.position_y = undefined;

/**
 * The time set for the reminder. Required when `sticker_type`= `REMINDER_COUNTDOWN` or `LIVE_REMINDER_COUNTDOWN`.For non-LIVE stickers (when `sticker_type`= `REMINDER_COUNTDOWN`), the enum values are:`ONE_MINUTE_EARLIER`: send the reminder one minute before the non-LIVE event.`ONE_HOUR_EARLIER `: send the reminder one hour before the non-LIVE event.`ONE_DAY_EARLIER`: send the reminder one day before the non-LIVE event.For LIVE stickers (when `sticker_type`= `LIVE_REMINDER_COUNTDOWN`), the enum values are: `ONE_MINUTE_AFTER`: send the reminder one minute after the LIVE event starts.`FIVE_MINUTES_AFTER`: send the reminder five minutes after the LIVE event starts.`TEN_MINUTES_AFTER`: send the reminder ten minutes after the LIVE event starts. 
 * @member {String} reminder_time
 */
CreativeportfoliocreateStickerParam.prototype.reminder_time = undefined;

/**
 * @member {String} size
 */
CreativeportfoliocreateStickerParam.prototype.size = undefined;

/**
 * Sticker type. Default value: `COUNTDOWN`. Enum values: `COUNTDOWN`: A Countdown Sticker with no reminder.`REMINDER_COUNTDOWN`: A Countdown Sticker with reminder for a non-LIVE event.`LIVE_REMINDER_COUNTDOWN`: A Countdown Sticker with reminder for a LIVE event.
 * @member {String} sticker_type
 */
CreativeportfoliocreateStickerParam.prototype.sticker_type = undefined;

/**
 * Sticker title. The maximum length is 54, in UTF-8 bytes (54 English letters or 18 Chinese characters), and the hashtag symbol (#) is not supported
 * @member {String} title
 */
CreativeportfoliocreateStickerParam.prototype.title = undefined;

