/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The DateRange model module.
 * @module model/DateRange
 * @version 0.1.8
 */
export class DateRange {
  /**
   * Constructs a new <code>DateRange</code>.
   * @alias module:model/DateRange
   * @class
   * @param end_date {String} 
   * @param start_date {String} 
   */
  constructor(end_date, start_date) {
    this.end_date = end_date;
    this.start_date = start_date;
  }

  /**
   * Constructs a <code>DateRange</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DateRange} obj Optional instance to populate.
   * @return {module:model/DateRange} The populated <code>DateRange</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new DateRange();
      if (data.hasOwnProperty('end_date'))
        obj.end_date = ApiClient.convertToType(data['end_date'], 'String');
      if (data.hasOwnProperty('start_date'))
        obj.start_date = ApiClient.convertToType(data['start_date'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} end_date
 */
DateRange.prototype.end_date = undefined;

/**
 * @member {String} start_date
 */
DateRange.prototype.start_date = undefined;

