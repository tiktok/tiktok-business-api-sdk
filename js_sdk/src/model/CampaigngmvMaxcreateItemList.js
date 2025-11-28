/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CampaigngmvMaxcreateIdentityInfo1} from './CampaigngmvMaxcreateIdentityInfo1.js';
import {CampaigngmvMaxcreateVideoInfo} from './CampaigngmvMaxcreateVideoInfo.js';

/**
 * The CampaigngmvMaxcreateItemList model module.
 * @module model/CampaigngmvMaxcreateItemList
 * @version 0.1.8
 */
export class CampaigngmvMaxcreateItemList {
  /**
   * Constructs a new <code>CampaigngmvMaxcreateItemList</code>.
   * @alias module:model/CampaigngmvMaxcreateItemList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CampaigngmvMaxcreateItemList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxcreateItemList} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxcreateItemList} The populated <code>CampaigngmvMaxcreateItemList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxcreateItemList();
      if (data.hasOwnProperty('identity_info'))
        obj.identity_info = CampaigngmvMaxcreateIdentityInfo1.constructFromObject(data['identity_info']);
      if (data.hasOwnProperty('item_id'))
        obj.item_id = ApiClient.convertToType(data['item_id'], 'String');
      if (data.hasOwnProperty('spu_id_list'))
        obj.spu_id_list = ApiClient.convertToType(data['spu_id_list'], ['String']);
      if (data.hasOwnProperty('video_info'))
        obj.video_info = CampaigngmvMaxcreateVideoInfo.constructFromObject(data['video_info']);
    }
    return obj;
  }
}

/**
 * @member {module:model/CampaigngmvMaxcreateIdentityInfo1} identity_info
 */
CampaigngmvMaxcreateItemList.prototype.identity_info = undefined;

/**
 * @member {String} item_id
 */
CampaigngmvMaxcreateItemList.prototype.item_id = undefined;

/**
 * @member {Array.<String>} spu_id_list
 */
CampaigngmvMaxcreateItemList.prototype.spu_id_list = undefined;

/**
 * @member {module:model/CampaigngmvMaxcreateVideoInfo} video_info
 */
CampaigngmvMaxcreateItemList.prototype.video_info = undefined;

