/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {CatalogfeedcreateScheduleParamSource} from './CatalogfeedcreateScheduleParamSource.js';

/**
 * The CatalogfeedcreateScheduleParam model module.
 * @module model/CatalogfeedcreateScheduleParam
 * @version 0.1.7
 */
export class CatalogfeedcreateScheduleParam {
  /**
   * Constructs a new <code>CatalogfeedcreateScheduleParam</code>.
   * @alias module:model/CatalogfeedcreateScheduleParam
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CatalogfeedcreateScheduleParam</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CatalogfeedcreateScheduleParam} obj Optional instance to populate.
   * @return {module:model/CatalogfeedcreateScheduleParam} The populated <code>CatalogfeedcreateScheduleParam</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CatalogfeedcreateScheduleParam();
      if (data.hasOwnProperty('day_of_month'))
        obj.day_of_month = ApiClient.convertToType(data['day_of_month'], 'Number');
      if (data.hasOwnProperty('hour'))
        obj.hour = ApiClient.convertToType(data['hour'], 'Number');
      if (data.hasOwnProperty('interval_count'))
        obj.interval_count = ApiClient.convertToType(data['interval_count'], 'Number');
      if (data.hasOwnProperty('interval_type'))
        obj.interval_type = ApiClient.convertToType(data['interval_type'], 'String');
      if (data.hasOwnProperty('minute'))
        obj.minute = ApiClient.convertToType(data['minute'], 'Number');
      if (data.hasOwnProperty('source'))
        obj.source = CatalogfeedcreateScheduleParamSource.constructFromObject(data['source']);
      if (data.hasOwnProperty('timezone'))
        obj.timezone = ApiClient.convertToType(data['timezone'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Number} day_of_month
 */
CatalogfeedcreateScheduleParam.prototype.day_of_month = undefined;

/**
 * @member {Number} hour
 */
CatalogfeedcreateScheduleParam.prototype.hour = undefined;

/**
 * @member {Number} interval_count
 */
CatalogfeedcreateScheduleParam.prototype.interval_count = undefined;

/**
 * @member {String} interval_type
 */
CatalogfeedcreateScheduleParam.prototype.interval_type = undefined;

/**
 * @member {Number} minute
 */
CatalogfeedcreateScheduleParam.prototype.minute = undefined;

/**
 * @member {module:model/CatalogfeedcreateScheduleParamSource} source
 */
CatalogfeedcreateScheduleParam.prototype.source = undefined;

/**
 * @member {String} timezone
 */
CatalogfeedcreateScheduleParam.prototype.timezone = undefined;

