/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {SmartPlusAdgroupCreateBodyPhoneInfo} from './SmartPlusAdgroupCreateBodyPhoneInfo.js';
import {SmartPlusAdgroupCreateBodyTargetingSpec} from './SmartPlusAdgroupCreateBodyTargetingSpec.js';

/**
 * The SmartPlusAdgroupCreateBody model module.
 * @module model/SmartPlusAdgroupCreateBody
 * @version 0.1.8
 */
export class SmartPlusAdgroupCreateBody {
  /**
   * Constructs a new <code>SmartPlusAdgroupCreateBody</code>.
   * @alias module:model/SmartPlusAdgroupCreateBody
   * @class
   * @param adgroup_name {String} 
   * @param advertiser_id {String} 
   * @param billing_event {String} 
   * @param campaign_id {String} 
   * @param optimization_goal {String} 
   * @param promotion_type {String} 
   * @param request_id {String} 
   * @param schedule_start_time {String} 
   * @param schedule_type {String} 
   * @param targeting_spec {module:model/SmartPlusAdgroupCreateBodyTargetingSpec} 
   */
  constructor(adgroup_name, advertiser_id, billing_event, campaign_id, optimization_goal, promotion_type, request_id, schedule_start_time, schedule_type, targeting_spec) {
    this.adgroup_name = adgroup_name;
    this.advertiser_id = advertiser_id;
    this.billing_event = billing_event;
    this.campaign_id = campaign_id;
    this.optimization_goal = optimization_goal;
    this.promotion_type = promotion_type;
    this.request_id = request_id;
    this.schedule_start_time = schedule_start_time;
    this.schedule_type = schedule_type;
    this.targeting_spec = targeting_spec;
  }

  /**
   * Constructs a <code>SmartPlusAdgroupCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SmartPlusAdgroupCreateBody} obj Optional instance to populate.
   * @return {module:model/SmartPlusAdgroupCreateBody} The populated <code>SmartPlusAdgroupCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SmartPlusAdgroupCreateBody();
      if (data.hasOwnProperty('adgroup_name'))
        obj.adgroup_name = ApiClient.convertToType(data['adgroup_name'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('attribution_event_count'))
        obj.attribution_event_count = ApiClient.convertToType(data['attribution_event_count'], 'String');
      if (data.hasOwnProperty('bid_price'))
        obj.bid_price = ApiClient.convertToType(data['bid_price'], 'Number');
      if (data.hasOwnProperty('bid_type'))
        obj.bid_type = ApiClient.convertToType(data['bid_type'], 'String');
      if (data.hasOwnProperty('billing_event'))
        obj.billing_event = ApiClient.convertToType(data['billing_event'], 'String');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('budget_mode'))
        obj.budget_mode = ApiClient.convertToType(data['budget_mode'], 'String');
      if (data.hasOwnProperty('campaign_id'))
        obj.campaign_id = ApiClient.convertToType(data['campaign_id'], 'String');
      if (data.hasOwnProperty('catalog_authorized_bc_id'))
        obj.catalog_authorized_bc_id = ApiClient.convertToType(data['catalog_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('catalog_id'))
        obj.catalog_id = ApiClient.convertToType(data['catalog_id'], 'String');
      if (data.hasOwnProperty('click_attribution_window'))
        obj.click_attribution_window = ApiClient.convertToType(data['click_attribution_window'], 'String');
      if (data.hasOwnProperty('comment_disabled'))
        obj.comment_disabled = ApiClient.convertToType(data['comment_disabled'], 'Boolean');
      if (data.hasOwnProperty('conversion_bid_price'))
        obj.conversion_bid_price = ApiClient.convertToType(data['conversion_bid_price'], 'Number');
      if (data.hasOwnProperty('custom_conversion_id'))
        obj.custom_conversion_id = ApiClient.convertToType(data['custom_conversion_id'], 'String');
      if (data.hasOwnProperty('dayparting'))
        obj.dayparting = ApiClient.convertToType(data['dayparting'], 'String');
      if (data.hasOwnProperty('deep_bid_type'))
        obj.deep_bid_type = ApiClient.convertToType(data['deep_bid_type'], 'String');
      if (data.hasOwnProperty('deep_cpabid'))
        obj.deep_cpabid = ApiClient.convertToType(data['deep_cpabid'], 'Number');
      if (data.hasOwnProperty('deep_funnel_event_source'))
        obj.deep_funnel_event_source = ApiClient.convertToType(data['deep_funnel_event_source'], 'String');
      if (data.hasOwnProperty('deep_funnel_event_source_id'))
        obj.deep_funnel_event_source_id = ApiClient.convertToType(data['deep_funnel_event_source_id'], 'String');
      if (data.hasOwnProperty('deep_funnel_optimization_event'))
        obj.deep_funnel_optimization_event = ApiClient.convertToType(data['deep_funnel_optimization_event'], 'String');
      if (data.hasOwnProperty('deep_funnel_optimization_status'))
        obj.deep_funnel_optimization_status = ApiClient.convertToType(data['deep_funnel_optimization_status'], 'String');
      if (data.hasOwnProperty('engaged_view_attribution_window'))
        obj.engaged_view_attribution_window = ApiClient.convertToType(data['engaged_view_attribution_window'], 'String');
      if (data.hasOwnProperty('identity_authorized_bc_id'))
        obj.identity_authorized_bc_id = ApiClient.convertToType(data['identity_authorized_bc_id'], 'String');
      if (data.hasOwnProperty('identity_id'))
        obj.identity_id = ApiClient.convertToType(data['identity_id'], 'String');
      if (data.hasOwnProperty('identity_type'))
        obj.identity_type = ApiClient.convertToType(data['identity_type'], 'String');
      if (data.hasOwnProperty('message_event_set_id'))
        obj.message_event_set_id = ApiClient.convertToType(data['message_event_set_id'], 'String');
      if (data.hasOwnProperty('messaging_app_account_id'))
        obj.messaging_app_account_id = ApiClient.convertToType(data['messaging_app_account_id'], 'String');
      if (data.hasOwnProperty('messaging_app_type'))
        obj.messaging_app_type = ApiClient.convertToType(data['messaging_app_type'], 'String');
      if (data.hasOwnProperty('min_budget'))
        obj.min_budget = ApiClient.convertToType(data['min_budget'], 'Number');
      if (data.hasOwnProperty('movie_premiere_date'))
        obj.movie_premiere_date = ApiClient.convertToType(data['movie_premiere_date'], 'String');
      if (data.hasOwnProperty('open_api_partner'))
        obj.open_api_partner = ApiClient.convertToType(data['open_api_partner'], 'String');
      if (data.hasOwnProperty('operation_status'))
        obj.operation_status = ApiClient.convertToType(data['operation_status'], 'String');
      if (data.hasOwnProperty('optimization_event'))
        obj.optimization_event = ApiClient.convertToType(data['optimization_event'], 'String');
      if (data.hasOwnProperty('optimization_goal'))
        obj.optimization_goal = ApiClient.convertToType(data['optimization_goal'], 'String');
      if (data.hasOwnProperty('phone_info'))
        obj.phone_info = SmartPlusAdgroupCreateBodyPhoneInfo.constructFromObject(data['phone_info']);
      if (data.hasOwnProperty('pixel_id'))
        obj.pixel_id = ApiClient.convertToType(data['pixel_id'], 'String');
      if (data.hasOwnProperty('placement_type'))
        obj.placement_type = ApiClient.convertToType(data['placement_type'], 'String');
      if (data.hasOwnProperty('placements'))
        obj.placements = ApiClient.convertToType(data['placements'], ['String']);
      if (data.hasOwnProperty('product_source'))
        obj.product_source = ApiClient.convertToType(data['product_source'], 'String');
      if (data.hasOwnProperty('promotion_target_type'))
        obj.promotion_target_type = ApiClient.convertToType(data['promotion_target_type'], 'String');
      if (data.hasOwnProperty('promotion_type'))
        obj.promotion_type = ApiClient.convertToType(data['promotion_type'], 'String');
      if (data.hasOwnProperty('promotion_website_type'))
        obj.promotion_website_type = ApiClient.convertToType(data['promotion_website_type'], 'String');
      if (data.hasOwnProperty('request_id'))
        obj.request_id = ApiClient.convertToType(data['request_id'], 'String');
      if (data.hasOwnProperty('roas_bid'))
        obj.roas_bid = ApiClient.convertToType(data['roas_bid'], 'Number');
      if (data.hasOwnProperty('schedule_end_time'))
        obj.schedule_end_time = ApiClient.convertToType(data['schedule_end_time'], 'String');
      if (data.hasOwnProperty('schedule_start_time'))
        obj.schedule_start_time = ApiClient.convertToType(data['schedule_start_time'], 'String');
      if (data.hasOwnProperty('schedule_type'))
        obj.schedule_type = ApiClient.convertToType(data['schedule_type'], 'String');
      if (data.hasOwnProperty('share_disabled'))
        obj.share_disabled = ApiClient.convertToType(data['share_disabled'], 'Boolean');
      if (data.hasOwnProperty('suggestion_audience_enabled'))
        obj.suggestion_audience_enabled = ApiClient.convertToType(data['suggestion_audience_enabled'], 'Boolean');
      if (data.hasOwnProperty('targeting_optimization_mode'))
        obj.targeting_optimization_mode = ApiClient.convertToType(data['targeting_optimization_mode'], 'String');
      if (data.hasOwnProperty('targeting_spec'))
        obj.targeting_spec = SmartPlusAdgroupCreateBodyTargetingSpec.constructFromObject(data['targeting_spec']);
      if (data.hasOwnProperty('vbo_window'))
        obj.vbo_window = ApiClient.convertToType(data['vbo_window'], 'String');
      if (data.hasOwnProperty('video_download_disabled'))
        obj.video_download_disabled = ApiClient.convertToType(data['video_download_disabled'], 'Boolean');
      if (data.hasOwnProperty('view_attribution_window'))
        obj.view_attribution_window = ApiClient.convertToType(data['view_attribution_window'], 'String');
      if (data.hasOwnProperty('zalo_id_type'))
        obj.zalo_id_type = ApiClient.convertToType(data['zalo_id_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} adgroup_name
 */
SmartPlusAdgroupCreateBody.prototype.adgroup_name = undefined;

/**
 * @member {String} advertiser_id
 */
SmartPlusAdgroupCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {String} app_id
 */
SmartPlusAdgroupCreateBody.prototype.app_id = undefined;

/**
 * @member {String} attribution_event_count
 */
SmartPlusAdgroupCreateBody.prototype.attribution_event_count = undefined;

/**
 * @member {Number} bid_price
 */
SmartPlusAdgroupCreateBody.prototype.bid_price = undefined;

/**
 * @member {String} bid_type
 */
SmartPlusAdgroupCreateBody.prototype.bid_type = undefined;

/**
 * @member {String} billing_event
 */
SmartPlusAdgroupCreateBody.prototype.billing_event = undefined;

/**
 * @member {Number} budget
 */
SmartPlusAdgroupCreateBody.prototype.budget = undefined;

/**
 * @member {String} budget_mode
 */
SmartPlusAdgroupCreateBody.prototype.budget_mode = undefined;

/**
 * @member {String} campaign_id
 */
SmartPlusAdgroupCreateBody.prototype.campaign_id = undefined;

/**
 * @member {String} catalog_authorized_bc_id
 */
SmartPlusAdgroupCreateBody.prototype.catalog_authorized_bc_id = undefined;

/**
 * @member {String} catalog_id
 */
SmartPlusAdgroupCreateBody.prototype.catalog_id = undefined;

/**
 * @member {String} click_attribution_window
 */
SmartPlusAdgroupCreateBody.prototype.click_attribution_window = undefined;

/**
 * @member {Boolean} comment_disabled
 * @default false
 */
SmartPlusAdgroupCreateBody.prototype.comment_disabled = false;

/**
 * @member {Number} conversion_bid_price
 */
SmartPlusAdgroupCreateBody.prototype.conversion_bid_price = undefined;

/**
 * @member {String} custom_conversion_id
 */
SmartPlusAdgroupCreateBody.prototype.custom_conversion_id = undefined;

/**
 * @member {String} dayparting
 */
SmartPlusAdgroupCreateBody.prototype.dayparting = undefined;

/**
 * @member {String} deep_bid_type
 */
SmartPlusAdgroupCreateBody.prototype.deep_bid_type = undefined;

/**
 * @member {Number} deep_cpabid
 */
SmartPlusAdgroupCreateBody.prototype.deep_cpabid = undefined;

/**
 * @member {String} deep_funnel_event_source
 */
SmartPlusAdgroupCreateBody.prototype.deep_funnel_event_source = undefined;

/**
 * @member {String} deep_funnel_event_source_id
 */
SmartPlusAdgroupCreateBody.prototype.deep_funnel_event_source_id = undefined;

/**
 * @member {String} deep_funnel_optimization_event
 */
SmartPlusAdgroupCreateBody.prototype.deep_funnel_optimization_event = undefined;

/**
 * @member {String} deep_funnel_optimization_status
 */
SmartPlusAdgroupCreateBody.prototype.deep_funnel_optimization_status = undefined;

/**
 * @member {String} engaged_view_attribution_window
 */
SmartPlusAdgroupCreateBody.prototype.engaged_view_attribution_window = undefined;

/**
 * @member {String} identity_authorized_bc_id
 */
SmartPlusAdgroupCreateBody.prototype.identity_authorized_bc_id = undefined;

/**
 * @member {String} identity_id
 */
SmartPlusAdgroupCreateBody.prototype.identity_id = undefined;

/**
 * @member {String} identity_type
 */
SmartPlusAdgroupCreateBody.prototype.identity_type = undefined;

/**
 * @member {String} message_event_set_id
 */
SmartPlusAdgroupCreateBody.prototype.message_event_set_id = undefined;

/**
 * @member {String} messaging_app_account_id
 */
SmartPlusAdgroupCreateBody.prototype.messaging_app_account_id = undefined;

/**
 * @member {String} messaging_app_type
 */
SmartPlusAdgroupCreateBody.prototype.messaging_app_type = undefined;

/**
 * @member {Number} min_budget
 */
SmartPlusAdgroupCreateBody.prototype.min_budget = undefined;

/**
 * @member {String} movie_premiere_date
 */
SmartPlusAdgroupCreateBody.prototype.movie_premiere_date = undefined;

/**
 * @member {String} open_api_partner
 */
SmartPlusAdgroupCreateBody.prototype.open_api_partner = undefined;

/**
 * @member {String} operation_status
 */
SmartPlusAdgroupCreateBody.prototype.operation_status = undefined;

/**
 * @member {String} optimization_event
 */
SmartPlusAdgroupCreateBody.prototype.optimization_event = undefined;

/**
 * @member {String} optimization_goal
 */
SmartPlusAdgroupCreateBody.prototype.optimization_goal = undefined;

/**
 * @member {module:model/SmartPlusAdgroupCreateBodyPhoneInfo} phone_info
 */
SmartPlusAdgroupCreateBody.prototype.phone_info = undefined;

/**
 * @member {String} pixel_id
 */
SmartPlusAdgroupCreateBody.prototype.pixel_id = undefined;

/**
 * @member {String} placement_type
 */
SmartPlusAdgroupCreateBody.prototype.placement_type = undefined;

/**
 * @member {Array.<String>} placements
 */
SmartPlusAdgroupCreateBody.prototype.placements = undefined;

/**
 * @member {String} product_source
 */
SmartPlusAdgroupCreateBody.prototype.product_source = undefined;

/**
 * @member {String} promotion_target_type
 */
SmartPlusAdgroupCreateBody.prototype.promotion_target_type = undefined;

/**
 * @member {String} promotion_type
 */
SmartPlusAdgroupCreateBody.prototype.promotion_type = undefined;

/**
 * @member {String} promotion_website_type
 */
SmartPlusAdgroupCreateBody.prototype.promotion_website_type = undefined;

/**
 * @member {String} request_id
 */
SmartPlusAdgroupCreateBody.prototype.request_id = undefined;

/**
 * @member {Number} roas_bid
 */
SmartPlusAdgroupCreateBody.prototype.roas_bid = undefined;

/**
 * @member {String} schedule_end_time
 */
SmartPlusAdgroupCreateBody.prototype.schedule_end_time = undefined;

/**
 * @member {String} schedule_start_time
 */
SmartPlusAdgroupCreateBody.prototype.schedule_start_time = undefined;

/**
 * @member {String} schedule_type
 */
SmartPlusAdgroupCreateBody.prototype.schedule_type = undefined;

/**
 * @member {Boolean} share_disabled
 */
SmartPlusAdgroupCreateBody.prototype.share_disabled = undefined;

/**
 * @member {Boolean} suggestion_audience_enabled
 */
SmartPlusAdgroupCreateBody.prototype.suggestion_audience_enabled = undefined;

/**
 * @member {String} targeting_optimization_mode
 */
SmartPlusAdgroupCreateBody.prototype.targeting_optimization_mode = undefined;

/**
 * @member {module:model/SmartPlusAdgroupCreateBodyTargetingSpec} targeting_spec
 */
SmartPlusAdgroupCreateBody.prototype.targeting_spec = undefined;

/**
 * @member {String} vbo_window
 */
SmartPlusAdgroupCreateBody.prototype.vbo_window = undefined;

/**
 * @member {Boolean} video_download_disabled
 */
SmartPlusAdgroupCreateBody.prototype.video_download_disabled = undefined;

/**
 * @member {String} view_attribution_window
 */
SmartPlusAdgroupCreateBody.prototype.view_attribution_window = undefined;

/**
 * @member {String} zalo_id_type
 */
SmartPlusAdgroupCreateBody.prototype.zalo_id_type = undefined;

