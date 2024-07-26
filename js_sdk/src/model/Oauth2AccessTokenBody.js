/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The Oauth2AccessTokenBody model module.
 * @module model/Oauth2AccessTokenBody
 * @version 0.1.1
 */
export class Oauth2AccessTokenBody {
  /**
   * Constructs a new <code>Oauth2AccessTokenBody</code>.
   * @alias module:model/Oauth2AccessTokenBody
   * @class
   * @param app_id {String} The App ID applied by the developer. It can be found in the Basic Information section for you app under [My Apps](https://ads.tiktok.com/marketing_api/apps/).
   * @param auth_code {String} Authorization code provided once the callback is complete.
   * @param secret {String} The private key of the developer's App. It can be found in the Basic Information section for your app under [My Apps](https://ads.tiktok.com/marketing_api/apps/).
   */
  constructor(app_id, auth_code, secret) {
    this.app_id = app_id;
    this.auth_code = auth_code;
    this.secret = secret;
  }

  /**
   * Constructs a <code>Oauth2AccessTokenBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Oauth2AccessTokenBody} obj Optional instance to populate.
   * @return {module:model/Oauth2AccessTokenBody} The populated <code>Oauth2AccessTokenBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Oauth2AccessTokenBody();
      if (data.hasOwnProperty('app_id'))
        obj.app_id = ApiClient.convertToType(data['app_id'], 'String');
      if (data.hasOwnProperty('auth_code'))
        obj.auth_code = ApiClient.convertToType(data['auth_code'], 'String');
      if (data.hasOwnProperty('secret'))
        obj.secret = ApiClient.convertToType(data['secret'], 'String');
    }
    return obj;
  }
}

/**
 * The App ID applied by the developer. It can be found in the Basic Information section for you app under [My Apps](https://ads.tiktok.com/marketing_api/apps/).
 * @member {String} app_id
 */
Oauth2AccessTokenBody.prototype.app_id = undefined;

/**
 * Authorization code provided once the callback is complete.
 * @member {String} auth_code
 */
Oauth2AccessTokenBody.prototype.auth_code = undefined;

/**
 * The private key of the developer's App. It can be found in the Basic Information section for your app under [My Apps](https://ads.tiktok.com/marketing_api/apps/).
 * @member {String} secret
 */
Oauth2AccessTokenBody.prototype.secret = undefined;

