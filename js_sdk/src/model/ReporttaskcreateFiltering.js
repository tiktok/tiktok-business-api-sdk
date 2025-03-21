/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The ReporttaskcreateFiltering model module.
 * @module model/ReporttaskcreateFiltering
 * @version 0.1.5
 */
export class ReporttaskcreateFiltering {
  /**
   * Constructs a new <code>ReporttaskcreateFiltering</code>.
   * @alias module:model/ReporttaskcreateFiltering
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ReporttaskcreateFiltering</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ReporttaskcreateFiltering} obj Optional instance to populate.
   * @return {module:model/ReporttaskcreateFiltering} The populated <code>ReporttaskcreateFiltering</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ReporttaskcreateFiltering();
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
ReporttaskcreateFiltering.prototype.field_name = undefined;

/**
 * @member {String} filter_type
 */
ReporttaskcreateFiltering.prototype.filter_type = undefined;

/**
 * @member {String} filter_value
 */
ReporttaskcreateFiltering.prototype.filter_value = undefined;

