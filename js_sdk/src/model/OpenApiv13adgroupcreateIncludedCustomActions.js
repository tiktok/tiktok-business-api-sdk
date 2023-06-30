/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The OpenApiv13adgroupcreateIncludedCustomActions model module.
 * @module model/OpenApiv13adgroupcreateIncludedCustomActions
 * @version 0.1.1
 */
export class OpenApiv13adgroupcreateIncludedCustomActions {
  /**
   * Constructs a new <code>OpenApiv13adgroupcreateIncludedCustomActions</code>.
   * The custom action that you want to use as \&quot;Include\&quot; conditions for filtering out the shopping ads audiences to be retargeted. When &#x60;shopping_ads_retargeting_type&#x60; is &#x60;LAB3&#x60;, you need to pass in either &#x60;included_custom_actions&#x60; or &#x60;excluded_custom_actions&#x60;.
   * @alias module:model/OpenApiv13adgroupcreateIncludedCustomActions
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13adgroupcreateIncludedCustomActions</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13adgroupcreateIncludedCustomActions} obj Optional instance to populate.
   * @return {module:model/OpenApiv13adgroupcreateIncludedCustomActions} The populated <code>OpenApiv13adgroupcreateIncludedCustomActions</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13adgroupcreateIncludedCustomActions();
      if (data.hasOwnProperty('code'))
        obj.code = ApiClient.convertToType(data['code'], 'String');
      if (data.hasOwnProperty('days'))
        obj.days = ApiClient.convertToType(data['days'], 'Number');
    }
    return obj;
  }
}

/**
 * The custom action used to filter out the audiences to be retargeted. Enum values- `VIEW_PRODUCT`- The audience viewed the product. `ADD_TO_CART`- The audience added the product to the cart. `PURCHASE`- The audience purchased the product.
 * @member {String} code
 */
OpenApiv13adgroupcreateIncludedCustomActions.prototype.code = undefined;

/**
 * The time range used to filter out the audiences that completed the specified action.
 * @member {Number} days
 */
OpenApiv13adgroupcreateIncludedCustomActions.prototype.days = undefined;

