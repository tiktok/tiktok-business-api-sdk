/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ReportTaskCreateBodyFiltering model module.
 * @module model/ReportTaskCreateBodyFiltering
 * @version 1.2.1
 */
export class ReportTaskCreateBodyFiltering {
  /**
   * Constructs a new <code>ReportTaskCreateBodyFiltering</code>.
   * @alias module:model/ReportTaskCreateBodyFiltering
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ReportTaskCreateBodyFiltering</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ReportTaskCreateBodyFiltering} obj Optional instance to populate.
   * @return {module:model/ReportTaskCreateBodyFiltering} The populated <code>ReportTaskCreateBodyFiltering</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ReportTaskCreateBodyFiltering();
      if (data.hasOwnProperty('field_name'))
        obj.field_name = ApiClient.convertToType(data['field_name'], 'String');
      if (data.hasOwnProperty('filter_type'))
        obj.filter_type = ApiClient.convertToType(data['filter_type'], 'String');
      if (data.hasOwnProperty('filter_value'))
        obj.filter_value = ApiClient.convertToType(data['filter_value'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} field_name
 */
ReportTaskCreateBodyFiltering.prototype.field_name = undefined;

/**
 * @member {String} filter_type
 */
ReportTaskCreateBodyFiltering.prototype.filter_type = undefined;

/**
 * @member {String} filter_value
 */
ReportTaskCreateBodyFiltering.prototype.filter_value = undefined;

