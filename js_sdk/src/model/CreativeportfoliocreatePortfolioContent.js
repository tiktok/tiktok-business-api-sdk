/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CreativeportfoliocreateAdvancedAudioInfo} from './CreativeportfoliocreateAdvancedAudioInfo.js';
import {CreativeportfoliocreateAdvancedGestureIcon} from './CreativeportfoliocreateAdvancedGestureIcon.js';
import {CreativeportfoliocreateAdvancedGestureImage} from './CreativeportfoliocreateAdvancedGestureImage.js';
import {CreativeportfoliocreateBadgeImageInfo} from './CreativeportfoliocreateBadgeImageInfo.js';
import {CreativeportfoliocreateBadgePosition} from './CreativeportfoliocreateBadgePosition.js';
import {CreativeportfoliocreateShowcaseProducts} from './CreativeportfoliocreateShowcaseProducts.js';
import {CreativeportfoliocreateSlideDimension} from './CreativeportfoliocreateSlideDimension.js';
import {CreativeportfoliocreateStickerParam} from './CreativeportfoliocreateStickerParam.js';

/**
 * The CreativeportfoliocreatePortfolioContent model module.
 * @module model/CreativeportfoliocreatePortfolioContent
 * @version 1.2.1
 */
export class CreativeportfoliocreatePortfolioContent {
  /**
   * Constructs a new <code>CreativeportfoliocreatePortfolioContent</code>.
   * @alias module:model/CreativeportfoliocreatePortfolioContent
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CreativeportfoliocreatePortfolioContent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreativeportfoliocreatePortfolioContent} obj Optional instance to populate.
   * @return {module:model/CreativeportfoliocreatePortfolioContent} The populated <code>CreativeportfoliocreatePortfolioContent</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreativeportfoliocreatePortfolioContent();
      if (data.hasOwnProperty('ad_text'))
        obj.ad_text = ApiClient.convertToType(data['ad_text'], 'String');
      if (data.hasOwnProperty('advanced_audio_info'))
        obj.advanced_audio_info = CreativeportfoliocreateAdvancedAudioInfo.constructFromObject(data['advanced_audio_info']);
      if (data.hasOwnProperty('advanced_gesture_icon'))
        obj.advanced_gesture_icon = CreativeportfoliocreateAdvancedGestureIcon.constructFromObject(data['advanced_gesture_icon']);
      if (data.hasOwnProperty('advanced_gesture_image'))
        obj.advanced_gesture_image = CreativeportfoliocreateAdvancedGestureImage.constructFromObject(data['advanced_gesture_image']);
      if (data.hasOwnProperty('advanced_interact_shape'))
        obj.advanced_interact_shape = ApiClient.convertToType(data['advanced_interact_shape'], 'String');
      if (data.hasOwnProperty('advanced_interact_type'))
        obj.advanced_interact_type = ApiClient.convertToType(data['advanced_interact_type'], 'String');
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('asset_content'))
        obj.asset_content = ApiClient.convertToType(data['asset_content'], 'String');
      if (data.hasOwnProperty('asset_ids'))
        obj.asset_ids = ApiClient.convertToType(data['asset_ids'], ['String']);
      if (data.hasOwnProperty('badge_image_info'))
        obj.badge_image_info = CreativeportfoliocreateBadgeImageInfo.constructFromObject(data['badge_image_info']);
      if (data.hasOwnProperty('badge_position'))
        obj.badge_position = CreativeportfoliocreateBadgePosition.constructFromObject(data['badge_position']);
      if (data.hasOwnProperty('badge_show_time'))
        obj.badge_show_time = ApiClient.convertToType(data['badge_show_time'], 'Number');
      if (data.hasOwnProperty('call_to_action'))
        obj.call_to_action = ApiClient.convertToType(data['call_to_action'], 'String');
      if (data.hasOwnProperty('call_to_action_text'))
        obj.call_to_action_text = ApiClient.convertToType(data['call_to_action_text'], 'String');
      if (data.hasOwnProperty('card_image_index'))
        obj.card_image_index = ApiClient.convertToType(data['card_image_index'], 'Number');
      if (data.hasOwnProperty('card_show_price'))
        obj.card_show_price = ApiClient.convertToType(data['card_show_price'], 'Boolean');
      if (data.hasOwnProperty('card_tags'))
        obj.card_tags = ApiClient.convertToType(data['card_tags'], ['String']);
      if (data.hasOwnProperty('card_type'))
        obj.card_type = ApiClient.convertToType(data['card_type'], 'String');
      if (data.hasOwnProperty('catalog_authorized_bc_id'))
        obj.catalog_authorized_bc_id = ApiClient.convertToType(data['catalog_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('category_label'))
        obj.category_label = ApiClient.convertToType(data['category_label'], 'String');
      if (data.hasOwnProperty('country_code'))
        obj.country_code = ApiClient.convertToType(data['country_code'], ['String']);
      if (data.hasOwnProperty('description'))
        obj.description = ApiClient.convertToType(data['description'], 'String');
      if (data.hasOwnProperty('display_price_enabled'))
        obj.display_price_enabled = ApiClient.convertToType(data['display_price_enabled'], 'Boolean');
      if (data.hasOwnProperty('dynamic_format'))
        obj.dynamic_format = ApiClient.convertToType(data['dynamic_format'], 'String');
      if (data.hasOwnProperty('gesture_type'))
        obj.gesture_type = ApiClient.convertToType(data['gesture_type'], 'String');
      if (data.hasOwnProperty('identity_authorized_bc_id'))
        obj.identity_authorized_bc_id = ApiClient.convertToType(data['identity_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('image_id'))
        obj.image_id = ApiClient.convertToType(data['image_id'], 'String');
      if (data.hasOwnProperty('image_optimization_enabled'))
        obj.image_optimization_enabled = ApiClient.convertToType(data['image_optimization_enabled'], 'Boolean');
      if (data.hasOwnProperty('interactive_music_id'))
        obj.interactive_music_id = ApiClient.convertToType(data['interactive_music_id'], 'String');
      if (data.hasOwnProperty('item_group_ids'))
        obj.item_group_ids = ApiClient.convertToType(data['item_group_ids'], ['String']);
      if (data.hasOwnProperty('layouts'))
        obj.layouts = ApiClient.convertToType(data['layouts'], ['String']);
      if (data.hasOwnProperty('mobile_app_id'))
        obj.mobile_app_id = ApiClient.convertToType(data['mobile_app_id'], 'String');
      if (data.hasOwnProperty('pop_up_window_image_id'))
        obj.pop_up_window_image_id = ApiClient.convertToType(data['pop_up_window_image_id'], 'String');
      if (data.hasOwnProperty('primary_text'))
        obj.primary_text = ApiClient.convertToType(data['primary_text'], 'String');
      if (data.hasOwnProperty('product_set_id'))
        obj.product_set_id = ApiClient.convertToType(data['product_set_id'], 'String');
      if (data.hasOwnProperty('product_source'))
        obj.product_source = ApiClient.convertToType(data['product_source'], 'String');
      if (data.hasOwnProperty('product_specific_type'))
        obj.product_specific_type = ApiClient.convertToType(data['product_specific_type'], 'String');
      if (data.hasOwnProperty('profile_image'))
        obj.profile_image = ApiClient.convertToType(data['profile_image'], 'String');
      if (data.hasOwnProperty('secondary_text'))
        obj.secondary_text = ApiClient.convertToType(data['secondary_text'], 'String');
      if (data.hasOwnProperty('selling_points'))
        obj.selling_points = ApiClient.convertToType(data['selling_points'], ['String']);
      if (data.hasOwnProperty('showcase_products'))
        obj.showcase_products = ApiClient.convertToType(data['showcase_products'], [CreativeportfoliocreateShowcaseProducts]);
      if (data.hasOwnProperty('sku_ids'))
        obj.sku_ids = ApiClient.convertToType(data['sku_ids'], ['String']);
      if (data.hasOwnProperty('slide_dimension'))
        obj.slide_dimension = CreativeportfoliocreateSlideDimension.constructFromObject(data['slide_dimension']);
      if (data.hasOwnProperty('slide_length'))
        obj.slide_length = ApiClient.convertToType(data['slide_length'], 'Number');
      if (data.hasOwnProperty('sticker_param'))
        obj.sticker_param = CreativeportfoliocreateStickerParam.constructFromObject(data['sticker_param']);
      if (data.hasOwnProperty('store_authorized_bc_id'))
        obj.store_authorized_bc_id = ApiClient.convertToType(data['store_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('store_id'))
        obj.store_id = ApiClient.convertToType(data['store_id'], 'String');
      if (data.hasOwnProperty('tags'))
        obj.tags = ApiClient.convertToType(data['tags'], ['String']);
      if (data.hasOwnProperty('title'))
        obj.title = ApiClient.convertToType(data['title'], 'String');
      if (data.hasOwnProperty('vertical_video_strategy'))
        obj.vertical_video_strategy = ApiClient.convertToType(data['vertical_video_strategy'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} ad_text
 */
CreativeportfoliocreatePortfolioContent.prototype.ad_text = undefined;

/**
 * @member {module:model/CreativeportfoliocreateAdvancedAudioInfo} advanced_audio_info
 */
CreativeportfoliocreatePortfolioContent.prototype.advanced_audio_info = undefined;

/**
 * @member {module:model/CreativeportfoliocreateAdvancedGestureIcon} advanced_gesture_icon
 */
CreativeportfoliocreatePortfolioContent.prototype.advanced_gesture_icon = undefined;

/**
 * @member {module:model/CreativeportfoliocreateAdvancedGestureImage} advanced_gesture_image
 */
CreativeportfoliocreatePortfolioContent.prototype.advanced_gesture_image = undefined;

/**
 * @member {String} advanced_interact_shape
 */
CreativeportfoliocreatePortfolioContent.prototype.advanced_interact_shape = undefined;

/**
 * @member {String} advanced_interact_type
 */
CreativeportfoliocreatePortfolioContent.prototype.advanced_interact_type = undefined;

/**
 * @member {String} app_id
 */
CreativeportfoliocreatePortfolioContent.prototype.app_id = undefined;

/**
 * @member {String} asset_content
 */
CreativeportfoliocreatePortfolioContent.prototype.asset_content = undefined;

/**
 * @member {Array.<String>} asset_ids
 */
CreativeportfoliocreatePortfolioContent.prototype.asset_ids = undefined;

/**
 * @member {module:model/CreativeportfoliocreateBadgeImageInfo} badge_image_info
 */
CreativeportfoliocreatePortfolioContent.prototype.badge_image_info = undefined;

/**
 * @member {module:model/CreativeportfoliocreateBadgePosition} badge_position
 */
CreativeportfoliocreatePortfolioContent.prototype.badge_position = undefined;

/**
 * @member {Number} badge_show_time
 */
CreativeportfoliocreatePortfolioContent.prototype.badge_show_time = undefined;

/**
 * @member {String} call_to_action
 */
CreativeportfoliocreatePortfolioContent.prototype.call_to_action = undefined;

/**
 * @member {String} call_to_action_text
 */
CreativeportfoliocreatePortfolioContent.prototype.call_to_action_text = undefined;

/**
 * @member {Number} card_image_index
 */
CreativeportfoliocreatePortfolioContent.prototype.card_image_index = undefined;

/**
 * @member {Boolean} card_show_price
 */
CreativeportfoliocreatePortfolioContent.prototype.card_show_price = undefined;

/**
 * @member {Array.<String>} card_tags
 */
CreativeportfoliocreatePortfolioContent.prototype.card_tags = undefined;

/**
 * @member {String} card_type
 */
CreativeportfoliocreatePortfolioContent.prototype.card_type = undefined;

/**
 * @member {String} catalog_authorized_bc_id
 */
CreativeportfoliocreatePortfolioContent.prototype.catalog_authorized_bc_id = undefined;

/**
 * @member {String} catalog_id
 */
CreativeportfoliocreatePortfolioContent.prototype.catalog_id = undefined;

/**
 * @member {String} category_label
 */
CreativeportfoliocreatePortfolioContent.prototype.category_label = undefined;

/**
 * @member {Array.<String>} country_code
 */
CreativeportfoliocreatePortfolioContent.prototype.country_code = undefined;

/**
 * @member {String} description
 */
CreativeportfoliocreatePortfolioContent.prototype.description = undefined;

/**
 * @member {Boolean} display_price_enabled
 */
CreativeportfoliocreatePortfolioContent.prototype.display_price_enabled = undefined;

/**
 * @member {String} dynamic_format
 * @default 'UNSET'
 */
CreativeportfoliocreatePortfolioContent.prototype.dynamic_format = 'UNSET';

/**
 * @member {String} gesture_type
 */
CreativeportfoliocreatePortfolioContent.prototype.gesture_type = undefined;

/**
 * @member {String} identity_authorized_bc_id
 */
CreativeportfoliocreatePortfolioContent.prototype.identity_authorized_bc_id = undefined;

/**
 * @member {String} identity_id
 */
CreativeportfoliocreatePortfolioContent.prototype.identity_id = undefined;

/**
 * @member {String} identity_type
 */
CreativeportfoliocreatePortfolioContent.prototype.identity_type = undefined;

/**
 * @member {String} image_id
 */
CreativeportfoliocreatePortfolioContent.prototype.image_id = undefined;

/**
 * @member {Boolean} image_optimization_enabled
 */
CreativeportfoliocreatePortfolioContent.prototype.image_optimization_enabled = undefined;

/**
 * @member {String} interactive_music_id
 */
CreativeportfoliocreatePortfolioContent.prototype.interactive_music_id = undefined;

/**
 * @member {Array.<String>} item_group_ids
 */
CreativeportfoliocreatePortfolioContent.prototype.item_group_ids = undefined;

/**
 * @member {Array.<String>} layouts
 */
CreativeportfoliocreatePortfolioContent.prototype.layouts = undefined;

/**
 * @member {String} mobile_app_id
 */
CreativeportfoliocreatePortfolioContent.prototype.mobile_app_id = undefined;

/**
 * @member {String} pop_up_window_image_id
 */
CreativeportfoliocreatePortfolioContent.prototype.pop_up_window_image_id = undefined;

/**
 * @member {String} primary_text
 */
CreativeportfoliocreatePortfolioContent.prototype.primary_text = undefined;

/**
 * @member {String} product_set_id
 */
CreativeportfoliocreatePortfolioContent.prototype.product_set_id = undefined;

/**
 * @member {String} product_source
 */
CreativeportfoliocreatePortfolioContent.prototype.product_source = undefined;

/**
 * @member {String} product_specific_type
 * @default 'UNSET'
 */
CreativeportfoliocreatePortfolioContent.prototype.product_specific_type = 'UNSET';

/**
 * @member {String} profile_image
 */
CreativeportfoliocreatePortfolioContent.prototype.profile_image = undefined;

/**
 * @member {String} secondary_text
 */
CreativeportfoliocreatePortfolioContent.prototype.secondary_text = undefined;

/**
 * @member {Array.<String>} selling_points
 */
CreativeportfoliocreatePortfolioContent.prototype.selling_points = undefined;

/**
 * @member {Array.<module:model/CreativeportfoliocreateShowcaseProducts>} showcase_products
 */
CreativeportfoliocreatePortfolioContent.prototype.showcase_products = undefined;

/**
 * @member {Array.<String>} sku_ids
 */
CreativeportfoliocreatePortfolioContent.prototype.sku_ids = undefined;

/**
 * @member {module:model/CreativeportfoliocreateSlideDimension} slide_dimension
 */
CreativeportfoliocreatePortfolioContent.prototype.slide_dimension = undefined;

/**
 * @member {Number} slide_length
 */
CreativeportfoliocreatePortfolioContent.prototype.slide_length = undefined;

/**
 * @member {module:model/CreativeportfoliocreateStickerParam} sticker_param
 */
CreativeportfoliocreatePortfolioContent.prototype.sticker_param = undefined;

/**
 * @member {String} store_authorized_bc_id
 */
CreativeportfoliocreatePortfolioContent.prototype.store_authorized_bc_id = undefined;

/**
 * @member {String} store_id
 */
CreativeportfoliocreatePortfolioContent.prototype.store_id = undefined;

/**
 * @member {Array.<String>} tags
 */
CreativeportfoliocreatePortfolioContent.prototype.tags = undefined;

/**
 * @member {String} title
 */
CreativeportfoliocreatePortfolioContent.prototype.title = undefined;

/**
 * @member {String} vertical_video_strategy
 */
CreativeportfoliocreatePortfolioContent.prototype.vertical_video_strategy = undefined;

