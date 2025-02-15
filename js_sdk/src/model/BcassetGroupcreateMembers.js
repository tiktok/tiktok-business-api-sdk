/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BcassetGroupcreateMembers model module.
 * @module model/BcassetGroupcreateMembers
 * @version 0.1.4
 */
export class BcassetGroupcreateMembers {
  /**
   * Constructs a new <code>BcassetGroupcreateMembers</code>.
   * @alias module:model/BcassetGroupcreateMembers
   * @class
   * @param member_id {String} 
   */
  constructor(member_id) {
    this.member_id = member_id;
  }

  /**
   * Constructs a <code>BcassetGroupcreateMembers</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BcassetGroupcreateMembers} obj Optional instance to populate.
   * @return {module:model/BcassetGroupcreateMembers} The populated <code>BcassetGroupcreateMembers</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BcassetGroupcreateMembers();
      if (data.hasOwnProperty('asset_roles'))
        obj.asset_roles = ApiClient.convertToType(data['asset_roles'], {'String': 'String'});
      if (data.hasOwnProperty('member_id'))
        obj.member_id = ApiClient.convertToType(data['member_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Object.<String, String>} asset_roles
 */
BcassetGroupcreateMembers.prototype.asset_roles = undefined;

/**
 * @member {String} member_id
 */
BcassetGroupcreateMembers.prototype.member_id = undefined;

