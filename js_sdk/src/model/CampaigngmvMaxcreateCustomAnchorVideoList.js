/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CampaigngmvMaxcreateIdentityInfo} from './CampaigngmvMaxcreateIdentityInfo.js';

/**
 * The CampaigngmvMaxcreateCustomAnchorVideoList model module.
 * @module model/CampaigngmvMaxcreateCustomAnchorVideoList
 * @version 0.1.8
 */
export class CampaigngmvMaxcreateCustomAnchorVideoList {
  /**
   * Constructs a new <code>CampaigngmvMaxcreateCustomAnchorVideoList</code>.
   * @alias module:model/CampaigngmvMaxcreateCustomAnchorVideoList
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CampaigngmvMaxcreateCustomAnchorVideoList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxcreateCustomAnchorVideoList} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxcreateCustomAnchorVideoList} The populated <code>CampaigngmvMaxcreateCustomAnchorVideoList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxcreateCustomAnchorVideoList();
      if (data.hasOwnProperty('identity_info'))
        obj.identity_info = CampaigngmvMaxcreateIdentityInfo.constructFromObject(data['identity_info']);
      if (data.hasOwnProperty('item_id'))
        obj.item_id = ApiClient.convertToType(data['item_id'], 'String');
      if (data.hasOwnProperty('spu_id_list'))
        obj.spu_id_list = ApiClient.convertToType(data['spu_id_list'], ['String']);
    }
    return obj;
  }
}

/**
 * @member {module:model/CampaigngmvMaxcreateIdentityInfo} identity_info
 */
CampaigngmvMaxcreateCustomAnchorVideoList.prototype.identity_info = undefined;

/**
 * @member {String} item_id
 */
CampaigngmvMaxcreateCustomAnchorVideoList.prototype.item_id = undefined;

/**
 * @member {Array.<String>} spu_id_list
 */
CampaigngmvMaxcreateCustomAnchorVideoList.prototype.spu_id_list = undefined;

