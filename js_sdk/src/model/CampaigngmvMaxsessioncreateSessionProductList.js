/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CampaigngmvMaxsessioncreateSessionProductList model module.
 * @module model/CampaigngmvMaxsessioncreateSessionProductList
 * @version 0.1.8
 */
export class CampaigngmvMaxsessioncreateSessionProductList {
  /**
   * Constructs a new <code>CampaigngmvMaxsessioncreateSessionProductList</code>.
   * @alias module:model/CampaigngmvMaxsessioncreateSessionProductList
   * @class
   * @param spu_id {String} 
   */
  constructor(spu_id) {
    this.spu_id = spu_id;
  }

  /**
   * Constructs a <code>CampaigngmvMaxsessioncreateSessionProductList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaigngmvMaxsessioncreateSessionProductList} obj Optional instance to populate.
   * @return {module:model/CampaigngmvMaxsessioncreateSessionProductList} The populated <code>CampaigngmvMaxsessioncreateSessionProductList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CampaigngmvMaxsessioncreateSessionProductList();
      if (data.hasOwnProperty('spu_id'))
        obj.spu_id = ApiClient.convertToType(data['spu_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} spu_id
 */
CampaigngmvMaxsessioncreateSessionProductList.prototype.spu_id = undefined;

