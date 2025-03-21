/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The MemberDeleteBody model module.
 * @module model/MemberDeleteBody
 * @version 0.1.5
 */
export class MemberDeleteBody {
  /**
   * Constructs a new <code>MemberDeleteBody</code>.
   * @alias module:model/MemberDeleteBody
   * @class
   * @param bc_id {String} 
   */
  constructor(bc_id) {
    this.bc_id = bc_id;
  }

  /**
   * Constructs a <code>MemberDeleteBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MemberDeleteBody} obj Optional instance to populate.
   * @return {module:model/MemberDeleteBody} The populated <code>MemberDeleteBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MemberDeleteBody();
      if (data.hasOwnProperty('bc_id'))
        obj.bc_id = ApiClient.convertToType(data['bc_id'], 'String');
      if (data.hasOwnProperty('child_bc_id'))
        obj.child_bc_id = ApiClient.convertToType(data['child_bc_id'], 'String');
      if (data.hasOwnProperty('user_email'))
        obj.user_email = ApiClient.convertToType(data['user_email'], 'String');
      if (data.hasOwnProperty('user_id'))
        obj.user_id = ApiClient.convertToType(data['user_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} bc_id
 */
MemberDeleteBody.prototype.bc_id = undefined;

/**
 * @member {String} child_bc_id
 */
MemberDeleteBody.prototype.child_bc_id = undefined;

/**
 * @member {String} user_email
 */
MemberDeleteBody.prototype.user_email = undefined;

/**
 * @member {String} user_id
 */
MemberDeleteBody.prototype.user_id = undefined;

