/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdminDeleteBody model module.
 * @module model/AdminDeleteBody
 * @version 1.2.1
 */
export class AdminDeleteBody {
  /**
   * Constructs a new <code>AdminDeleteBody</code>.
   * @alias module:model/AdminDeleteBody
   * @class
   * @param asset_ids {Array.<String>} 
   * @param asset_type {String} 
   * @param bc_id {String} 
   */
  constructor(asset_ids, asset_type, bc_id) {
    this.asset_ids = asset_ids;
    this.asset_type = asset_type;
    this.bc_id = bc_id;
  }

  /**
   * Constructs a <code>AdminDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdminDeleteBody} obj Optional instance to populate.
   * @return {module:model/AdminDeleteBody} The populated <code>AdminDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdminDeleteBody();
      if (data.hasOwnProperty('asset_ids'))
        obj.asset_ids = ApiClient.convertToType(data['asset_ids'], ['String']);
      if (data.hasOwnProperty('asset_type'))
        obj.asset_type = ApiClient.convertToType(data['asset_type'], 'String');
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('child_bc_id'))
        obj.child_bc_id = ApiClient.convertToType(data['child_bc_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<String>} asset_ids
 */
AdminDeleteBody.prototype.asset_ids = undefined;

/**
 * @member {String} asset_type
 */
AdminDeleteBody.prototype.asset_type = undefined;

/**
 * @member {String} bc_id
 */
AdminDeleteBody.prototype.bc_id = undefined;

/**
 * @member {String} child_bc_id
 */
AdminDeleteBody.prototype.child_bc_id = undefined;

