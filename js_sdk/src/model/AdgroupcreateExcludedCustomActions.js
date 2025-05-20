/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The AdgroupcreateExcludedCustomActions model module.
 * @module model/AdgroupcreateExcludedCustomActions
 * @version 0.1.7
 */
export class AdgroupcreateExcludedCustomActions {
  /**
   * Constructs a new <code>AdgroupcreateExcludedCustomActions</code>.
   * The custom action that you want to use as \&quot;Exclude\&quot; conditions for filtering out the shopping ads audiences to be retargeted. When &#x60;shopping_ads_retargeting_type&#x60; is &#x60;LAB3&#x60;, you need to pass in either &#x60;included_custom_actions&#x60; or &#x60;excluded_custom_actions&#x60;
   * @alias module:model/AdgroupcreateExcludedCustomActions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdgroupcreateExcludedCustomActions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdgroupcreateExcludedCustomActions} obj Optional instance to populate.
   * @return {module:model/AdgroupcreateExcludedCustomActions} The populated <code>AdgroupcreateExcludedCustomActions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdgroupcreateExcludedCustomActions();
      if (data.hasOwnProperty('code'))
        obj.code = ApiClient.convertToType(data['code'], 'String');
      if (data.hasOwnProperty('days'))
        obj.days = ApiClient.convertToType(data['days'], 'Number');
    }
    return obj;
  }
}

/**
 * The custom action used to filter out the audiences to be retargeted.  Enum values- `VIEW_PRODUCT`- The audience viewed the product. `ADD_TO_CART`- The audience added the product to the cart. `PURCHASE`- The audience purchased the product.
 * @member {String} code
 */
AdgroupcreateExcludedCustomActions.prototype.code = undefined;

/**
 * The time range used to filter out the audiences that completed the specified action.
 * @member {Number} days
 */
AdgroupcreateExcludedCustomActions.prototype.days = undefined;

