/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ResultDetail model module.
 * @module model/ResultDetail
 * @version 1.2.1
 */
export class ResultDetail extends Array {
  /**
   * Constructs a new <code>ResultDetail</code>.
   * @alias module:model/ResultDetail
   * @class
   * @extends Array
   */
  constructor() {
    super();
  }

  /**
   * Constructs a <code>ResultDetail</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ResultDetail} obj Optional instance to populate.
   * @return {module:model/ResultDetail} The populated <code>ResultDetail</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ResultDetail();
      ApiClient.constructFromObject(data, obj, 'ResultDetail');
    }
    return obj;
  }
}
