/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CampaigngmvMaxupdateItemListIdentityInfo} from './CampaigngmvMaxupdateItemListIdentityInfo.js';
import {CampaigngmvMaxupdateVideoInfo} from './CampaigngmvMaxupdateVideoInfo.js';

/**
 * The CampaigngmvMaxupdateItemList model module.
 * @module model/CampaigngmvMaxupdateItemList
 * @version 1.2.1
 */
export class CampaigngmvMaxupdateItemList {
  /**
   * Constructs a new <code>CampaigngmvMaxupdateItemList</code>.
   * @alias module:model/CampaigngmvMaxupdateItemList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CampaigngmvMaxupdateItemList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxupdateItemList} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxupdateItemList} The populated <code>CampaigngmvMaxupdateItemList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxupdateItemList();
      if (data.hasOwnProperty('identity_info'))
        obj.identity_info = CampaigngmvMaxupdateItemListIdentityInfo.constructFromObject(data['identity_info']);
      if (data.hasOwnProperty('item_id'))
        obj.item_id = ApiClient.convertToType(data['item_id'], 'String');
      if (data.hasOwnProperty('spu_id_list'))
        obj.spu_id_list = ApiClient.convertToType(data['spu_id_list'], ['String']);
      if (data.hasOwnProperty('video_info'))
        obj.video_info = CampaigngmvMaxupdateVideoInfo.constructFromObject(data['video_info']);
    }
    return obj;
  }
}

/**
 * @member {module:model/CampaigngmvMaxupdateItemListIdentityInfo} identity_info
 */
CampaigngmvMaxupdateItemList.prototype.identity_info = undefined;

/**
 * @member {String} item_id
 */
CampaigngmvMaxupdateItemList.prototype.item_id = undefined;

/**
 * @member {Array.<String>} spu_id_list
 */
CampaigngmvMaxupdateItemList.prototype.spu_id_list = undefined;

/**
 * @member {module:model/CampaigngmvMaxupdateVideoInfo} video_info
 */
CampaigngmvMaxupdateItemList.prototype.video_info = undefined;

