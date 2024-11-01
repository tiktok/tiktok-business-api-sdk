/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The OpenApiv13bcadvertisercreateCustomerInfo model module.
 * @module model/OpenApiv13bcadvertisercreateCustomerInfo
 * @version 0.1.2
 */
export class OpenApiv13bcadvertisercreateCustomerInfo {
  /**
   * Constructs a new <code>OpenApiv13bcadvertisercreateCustomerInfo</code>.
   * Business Information
   * @alias module:model/OpenApiv13bcadvertisercreateCustomerInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13bcadvertisercreateCustomerInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13bcadvertisercreateCustomerInfo} obj Optional instance to populate.
   * @return {module:model/OpenApiv13bcadvertisercreateCustomerInfo} The populated <code>OpenApiv13bcadvertisercreateCustomerInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13bcadvertisercreateCustomerInfo();
      if (data.hasOwnProperty('company'))
        obj.company = ApiClient.convertToType(data['company'], 'String');
      if (data.hasOwnProperty('industry'))
        obj.industry = ApiClient.convertToType(data['industry'], 'Number');
      if (data.hasOwnProperty('registered_area'))
        obj.registered_area = ApiClient.convertToType(data['registered_area'], 'String');
    }
    return obj;
  }
}

/**
 * Ad Account company name. Length cannot exceed 255 characters
 * @member {String} company
 */
OpenApiv13bcadvertisercreateCustomerInfo.prototype.company = undefined;

/**
 * Ad Account industry ID. The value range is shown in [Appendix-Industries](https://ads.tiktok.com/marketing_api/docs?id=1739357589575681)
 * @member {Number} industry
 */
OpenApiv13bcadvertisercreateCustomerInfo.prototype.industry = undefined;

/**
 * Ad Account registration code. The value range is shown in [Appendix-Location code](https://ads.tiktok.com/marketing_api/docs?id=1737585867307010)
 * @member {String} registered_area
 */
OpenApiv13bcadvertisercreateCustomerInfo.prototype.registered_area = undefined;

