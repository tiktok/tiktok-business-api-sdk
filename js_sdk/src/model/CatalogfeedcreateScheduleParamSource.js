/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The CatalogfeedcreateScheduleParamSource model module.
 * @module model/CatalogfeedcreateScheduleParamSource
 * @version 1.2.1
 */
export class CatalogfeedcreateScheduleParamSource {
  /**
   * Constructs a new <code>CatalogfeedcreateScheduleParamSource</code>.
   * @alias module:model/CatalogfeedcreateScheduleParamSource
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CatalogfeedcreateScheduleParamSource</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CatalogfeedcreateScheduleParamSource} obj Optional instance to populate.
   * @return {module:model/CatalogfeedcreateScheduleParamSource} The populated <code>CatalogfeedcreateScheduleParamSource</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CatalogfeedcreateScheduleParamSource();
      if (data.hasOwnProperty('password'))
        obj.password = ApiClient.convertToType(data['password'], 'String');
      if (data.hasOwnProperty('uri'))
        obj.uri = ApiClient.convertToType(data['uri'], 'String');
      if (data.hasOwnProperty('username'))
        obj.username = ApiClient.convertToType(data['username'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} password
 */
CatalogfeedcreateScheduleParamSource.prototype.password = undefined;

/**
 * @member {String} uri
 */
CatalogfeedcreateScheduleParamSource.prototype.uri = undefined;

/**
 * @member {String} username
 */
CatalogfeedcreateScheduleParamSource.prototype.username = undefined;

