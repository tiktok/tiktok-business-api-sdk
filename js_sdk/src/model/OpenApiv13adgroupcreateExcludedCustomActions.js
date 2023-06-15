/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The OpenApiv13adgroupcreateExcludedCustomActions model module.
 * @module model/OpenApiv13adgroupcreateExcludedCustomActions
 * @version 0.1.1
 */
export class OpenApiv13adgroupcreateExcludedCustomActions {
  /**
   * Constructs a new <code>OpenApiv13adgroupcreateExcludedCustomActions</code>.
   * The custom action that you want to use as \&quot;Exclude\&quot; conditions for filtering out the shopping ads audiences to be retargeted. When &#x60;shopping_ads_retargeting_type&#x60; is &#x60;LAB3&#x60;, you need to pass in either &#x60;included_custom_actions&#x60; or &#x60;excluded_custom_actions&#x60;
   * @alias module:model/OpenApiv13adgroupcreateExcludedCustomActions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adgroupcreateExcludedCustomActions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adgroupcreateExcludedCustomActions} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adgroupcreateExcludedCustomActions} The populated <code>OpenApiv13adgroupcreateExcludedCustomActions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adgroupcreateExcludedCustomActions();
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
OpenApiv13adgroupcreateExcludedCustomActions.prototype.code = undefined;

/**
 * The time range used to filter out the audiences that completed the specified action.
 * @member {Number} days
 */
OpenApiv13adgroupcreateExcludedCustomActions.prototype.days = undefined;

