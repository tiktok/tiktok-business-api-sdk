/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CampaigngmvMaxcreateCustomAnchorVideoList} from './CampaigngmvMaxcreateCustomAnchorVideoList.js';
import {CampaigngmvMaxupdateItemList} from './CampaigngmvMaxupdateItemList.js';
import {CampaigngmvMaxupdatePromotionDays} from './CampaigngmvMaxupdatePromotionDays.js';

/**
 * The GmvMaxUpdateBody model module.
 * @module model/GmvMaxUpdateBody
 * @version 0.1.8
 */
export class GmvMaxUpdateBody {
  /**
   * Constructs a new <code>GmvMaxUpdateBody</code>.
   * @alias module:model/GmvMaxUpdateBody
   * @class
   * @param advertiser_id {String} 
   * @param campaign_id {String} 
   */
  constructor(advertiser_id, campaign_id) {
    this.advertiser_id = advertiser_id;
    this.campaign_id = campaign_id;
  }

  /**
   * Constructs a <code>GmvMaxUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/GmvMaxUpdateBody} obj Optional instance to populate.
   * @return {module:model/GmvMaxUpdateBody} The populated <code>GmvMaxUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new GmvMaxUpdateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('affiliate_posts_enabled'))
        obj.affiliate_posts_enabled = ApiClient.convertToType(data['affiliate_posts_enabled'], 'Boolean');
      if (data.hasOwnProperty('auto_budget_enabled'))
        obj.auto_budget_enabled = ApiClient.convertToType(data['auto_budget_enabled'], 'Boolean');
      if (data.hasOwnProperty('budget'))
        obj.budget = ApiClient.convertToType(data['budget'], 'Number');
      if (data.hasOwnProperty('campaign_id'))
        obj.campaign_id = ApiClient.convertToType(data['campaign_id'], 'String');
      if (data.hasOwnProperty('campaign_name'))
        obj.campaign_name = ApiClient.convertToType(data['campaign_name'], 'String');
      if (data.hasOwnProperty('custom_anchor_video_list'))
        obj.custom_anchor_video_list = ApiClient.convertToType(data['custom_anchor_video_list'], [CampaigngmvMaxcreateCustomAnchorVideoList]);
      if (data.hasOwnProperty('item_group_ids'))
        obj.item_group_ids = ApiClient.convertToType(data['item_group_ids'], ['String']);
      if (data.hasOwnProperty('item_list'))
        obj.item_list = ApiClient.convertToType(data['item_list'], [CampaigngmvMaxupdateItemList]);
      if (data.hasOwnProperty('promotion_days'))
        obj.promotion_days = CampaigngmvMaxupdatePromotionDays.constructFromObject(data['promotion_days']);
      if (data.hasOwnProperty('roas_bid'))
        obj.roas_bid = ApiClient.convertToType(data['roas_bid'], 'Number');
      if (data.hasOwnProperty('schedule_end_time'))
        obj.schedule_end_time = ApiClient.convertToType(data['schedule_end_time'], 'String');
      if (data.hasOwnProperty('schedule_type'))
        obj.schedule_type = ApiClient.convertToType(data['schedule_type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
GmvMaxUpdateBody.prototype.advertiser_id = undefined;

/**
 * @member {Boolean} affiliate_posts_enabled
 */
GmvMaxUpdateBody.prototype.affiliate_posts_enabled = undefined;

/**
 * @member {Boolean} auto_budget_enabled
 */
GmvMaxUpdateBody.prototype.auto_budget_enabled = undefined;

/**
 * @member {Number} budget
 */
GmvMaxUpdateBody.prototype.budget = undefined;

/**
 * @member {String} campaign_id
 */
GmvMaxUpdateBody.prototype.campaign_id = undefined;

/**
 * @member {String} campaign_name
 */
GmvMaxUpdateBody.prototype.campaign_name = undefined;

/**
 * @member {Array.<module:model/CampaigngmvMaxcreateCustomAnchorVideoList>} custom_anchor_video_list
 */
GmvMaxUpdateBody.prototype.custom_anchor_video_list = undefined;

/**
 * @member {Array.<String>} item_group_ids
 */
GmvMaxUpdateBody.prototype.item_group_ids = undefined;

/**
 * @member {Array.<module:model/CampaigngmvMaxupdateItemList>} item_list
 */
GmvMaxUpdateBody.prototype.item_list = undefined;

/**
 * @member {module:model/CampaigngmvMaxupdatePromotionDays} promotion_days
 */
GmvMaxUpdateBody.prototype.promotion_days = undefined;

/**
 * @member {Number} roas_bid
 */
GmvMaxUpdateBody.prototype.roas_bid = undefined;

/**
 * @member {String} schedule_end_time
 */
GmvMaxUpdateBody.prototype.schedule_end_time = undefined;

/**
 * @member {String} schedule_type
 */
GmvMaxUpdateBody.prototype.schedule_type = undefined;

