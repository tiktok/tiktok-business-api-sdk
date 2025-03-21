/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The BcadvertisercreateCustomerInfo model module.
 * @module model/BcadvertisercreateCustomerInfo
 * @version 0.1.5
 */
export class BcadvertisercreateCustomerInfo {
  /**
   * Constructs a new <code>BcadvertisercreateCustomerInfo</code>.
   * Business Information
   * @alias module:model/BcadvertisercreateCustomerInfo
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>BcadvertisercreateCustomerInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BcadvertisercreateCustomerInfo} obj Optional instance to populate.
   * @return {module:model/BcadvertisercreateCustomerInfo} The populated <code>BcadvertisercreateCustomerInfo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new BcadvertisercreateCustomerInfo();
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
BcadvertisercreateCustomerInfo.prototype.company = undefined;

/**
 * Ad Account industry ID. The value range is shown in [Appendix-Industries](https://ads.tiktok.com/marketing_api/docs?id=1739357589575681)
 * @member {Number} industry
 */
BcadvertisercreateCustomerInfo.prototype.industry = undefined;

/**
 * Ad Account registration code. The value range is shown in [Appendix-Location code](https://ads.tiktok.com/marketing_api/docs?id=1737585867307010)
 * @member {String} registered_area
 */
BcadvertisercreateCustomerInfo.prototype.registered_area = undefined;

