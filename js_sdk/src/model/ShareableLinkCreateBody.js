/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CreativeshareableLinkcreateSharedAssets} from './CreativeshareableLinkcreateSharedAssets.js';

/**
 * The ShareableLinkCreateBody model module.
 * @module model/ShareableLinkCreateBody
 * @version 0.1.7
 */
export class ShareableLinkCreateBody {
  /**
   * Constructs a new <code>ShareableLinkCreateBody</code>.
   * @alias module:model/ShareableLinkCreateBody
   * @class
   * @param shared_assets {Array.<module:model/CreativeshareableLinkcreateSharedAssets>} 
   * @param sharer {String} 
   */
  constructor(shared_assets, sharer) {
    this.shared_assets = shared_assets;
    this.sharer = sharer;
  }

  /**
   * Constructs a <code>ShareableLinkCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ShareableLinkCreateBody} obj Optional instance to populate.
   * @return {module:model/ShareableLinkCreateBody} The populated <code>ShareableLinkCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ShareableLinkCreateBody();
      if (data.hasOwnProperty('shared_assets'))
        obj.shared_assets = ApiClient.convertToType(data['shared_assets'], [CreativeshareableLinkcreateSharedAssets]);
      if (data.hasOwnProperty('sharer'))
        obj.sharer = ApiClient.convertToType(data['sharer'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/CreativeshareableLinkcreateSharedAssets>} shared_assets
 */
ShareableLinkCreateBody.prototype.shared_assets = undefined;

/**
 * @member {String} sharer
 */
ShareableLinkCreateBody.prototype.sharer = undefined;

