/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {PixelContextAd} from './PixelContextAd.js';
import {PixelContextPage} from './PixelContextPage.js';
import {PixelContextUser} from './PixelContextUser.js';

/**
 * The PixelContext model module.
 * @module model/PixelContext
 * @version 0.1.3
 */
export class PixelContext {
  /**
   * Constructs a new <code>PixelContext</code>.
   * Required to attribute events to TikTok campaigns. The context object can be removed for testing event fires
   * @alias module:model/PixelContext
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PixelContext</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelContext} obj Optional instance to populate.
   * @return {module:model/PixelContext} The populated <code>PixelContext</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelContext();
      if (data.hasOwnProperty('ad'))
        obj.ad = PixelContextAd.constructFromObject(data['ad']);
      if (data.hasOwnProperty('ip'))
        obj.ip = ApiClient.convertToType(data['ip'], 'String');
      if (data.hasOwnProperty('page'))
        obj.page = PixelContextPage.constructFromObject(data['page']);
      if (data.hasOwnProperty('user'))
        obj.user = PixelContextUser.constructFromObject(data['user']);
      if (data.hasOwnProperty('user_agent'))
        obj.user_agent = ApiClient.convertToType(data['user_agent'], 'String');
    }
    return obj;
  }
}

/**
 * @member {module:model/PixelContextAd} ad
 */
PixelContext.prototype.ad = undefined;

/**
 * Non-hashed public IP address of the browser. To increase the probability of matching website visitor events with TikTok ads, we recommend sending both ip and user_agent.
 * @member {String} ip
 */
PixelContext.prototype.ip = undefined;

/**
 * @member {module:model/PixelContextPage} page
 */
PixelContext.prototype.page = undefined;

/**
 * @member {module:model/PixelContextUser} user
 */
PixelContext.prototype.user = undefined;

/**
 * Non-hashed user agent from the user’s device. To increase the probability of matching website visitor events with TikTok ads, we recommend sending both ip and user_agent.
 * @member {String} user_agent
 */
PixelContext.prototype.user_agent = undefined;

