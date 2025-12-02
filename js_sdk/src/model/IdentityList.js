/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The IdentityList model module.
 * @module model/IdentityList
 * @version 0.1.9
 */
export class IdentityList extends Array {
  /**
   * Constructs a new <code>IdentityList</code>.
   * @alias module:model/IdentityList
   * @class
   * @extends Array
   */
  constructor() {
    super();
  }

  /**
   * Constructs a <code>IdentityList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/IdentityList} obj Optional instance to populate.
   * @return {module:model/IdentityList} The populated <code>IdentityList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new IdentityList();
      ApiClient.constructFromObject(data, obj, 'IdentityList');
    }
    return obj;
  }
}
