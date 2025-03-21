/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The PixelContextUser model module.
 * @module model/PixelContextUser
 * @version 0.1.5
 */
export class PixelContextUser {
  /**
   * Constructs a new <code>PixelContextUser</code>.
   * The personal data of a user.
   * @alias module:model/PixelContextUser
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PixelContextUser</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelContextUser} obj Optional instance to populate.
   * @return {module:model/PixelContextUser} The populated <code>PixelContextUser</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelContextUser();
      if (data.hasOwnProperty('email'))
        obj.email = ApiClient.convertToType(data['email'], 'String');
      if (data.hasOwnProperty('external_id'))
        obj.external_id = ApiClient.convertToType(data['external_id'], 'String');
      if (data.hasOwnProperty('phone_number'))
        obj.phone_number = ApiClient.convertToType(data['phone_number'], 'String');
      if (data.hasOwnProperty('ttp'))
        obj.ttp = ApiClient.convertToType(data['ttp'], 'String');
    }
    return obj;
  }
}

/**
 * The email of the customer if available. It must be hashed with SHA256 on the client side.
 * @member {String} email
 */
PixelContextUser.prototype.email = undefined;

/**
 * Any unique identifier on the advertisers side, such as loyalty membership IDs, user IDs, and external cookie IDs. It must be hashed with SHA256 on the client side.
 * @member {String} external_id
 */
PixelContextUser.prototype.external_id = undefined;

/**
 * The phone number of the customer if available. It must be hashed with SHA256 on the client side.
 * @member {String} phone_number
 */
PixelContextUser.prototype.phone_number = undefined;

/**
 * Cookie ID. If you also use Pixel SDK and enabled cookie, Pixel SDK automatically saves a unique identifier in the _ttp cookie. The value of _ttp is used to match website visitor events with TikTok ads. You can extract the value of _ttp and attach the value here. For details, see [Set up TikTok Click ID and Cookies](https://ads.tiktok.com/marketing_api/docs?id=1739584860883969)
 * @member {String} ttp
 */
PixelContextUser.prototype.ttp = undefined;

