/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CustomAnchorVideoList model module.
 * @module model/CustomAnchorVideoList
 * @version 0.1.9
 */
export class CustomAnchorVideoList extends Array {
  /**
   * Constructs a new <code>CustomAnchorVideoList</code>.
   * @alias module:model/CustomAnchorVideoList
   * @class
   * @extends Array
   */
  constructor() {
    super();
  }

  /**
   * Constructs a <code>CustomAnchorVideoList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CustomAnchorVideoList} obj Optional instance to populate.
   * @return {module:model/CustomAnchorVideoList} The populated <code>CustomAnchorVideoList</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CustomAnchorVideoList();
      ApiClient.constructFromObject(data, obj, 'CustomAnchorVideoList');
    }
    return obj;
  }
}
