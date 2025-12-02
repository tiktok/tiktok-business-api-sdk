/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CampaigngmvMaxupdateCustomAnchorVideoListIdentityInfo} from './CampaigngmvMaxupdateCustomAnchorVideoListIdentityInfo.js';

/**
 * The CampaigngmvMaxupdateCustomAnchorVideoList model module.
 * @module model/CampaigngmvMaxupdateCustomAnchorVideoList
 * @version 0.1.9
 */
export class CampaigngmvMaxupdateCustomAnchorVideoList {
  /**
   * Constructs a new <code>CampaigngmvMaxupdateCustomAnchorVideoList</code>.
   * @alias module:model/CampaigngmvMaxupdateCustomAnchorVideoList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CampaigngmvMaxupdateCustomAnchorVideoList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxupdateCustomAnchorVideoList} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxupdateCustomAnchorVideoList} The populated <code>CampaigngmvMaxupdateCustomAnchorVideoList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxupdateCustomAnchorVideoList();
      if (data.hasOwnProperty('identity_info'))
        obj.identity_info = CampaigngmvMaxupdateCustomAnchorVideoListIdentityInfo.constructFromObject(data['identity_info']);
      if (data.hasOwnProperty('item_id'))
        obj.item_id = ApiClient.convertToType(data['item_id'], 'String');
      if (data.hasOwnProperty('spu_id_list'))
        obj.spu_id_list = ApiClient.convertToType(data['spu_id_list'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {module:model/CampaigngmvMaxupdateCustomAnchorVideoListIdentityInfo} identity_info
 */
CampaigngmvMaxupdateCustomAnchorVideoList.prototype.identity_info = undefined;

/**
 * @member {String} item_id
 */
CampaigngmvMaxupdateCustomAnchorVideoList.prototype.item_id = undefined;

/**
 * @member {Array.<String>} spu_id_list
 */
CampaigngmvMaxupdateCustomAnchorVideoList.prototype.spu_id_list = undefined;

