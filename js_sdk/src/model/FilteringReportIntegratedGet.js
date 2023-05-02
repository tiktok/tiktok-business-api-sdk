/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';

/**
 * The FilteringReportIntegratedGet model module.
 * @module model/FilteringReportIntegratedGet
 * @version 0.1.0
 */
export class FilteringReportIntegratedGet {
  /**
   * Constructs a new <code>FilteringReportIntegratedGet</code>.
   * @alias module:model/FilteringReportIntegratedGet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringReportIntegratedGet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringReportIntegratedGet} obj Optional instance to populate.
   * @return {module:model/FilteringReportIntegratedGet} The populated <code>FilteringReportIntegratedGet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringReportIntegratedGet();
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
 * Filter field name.
 * @member {String} field_name
 */
FilteringReportIntegratedGet.prototype.field_name = undefined;

/**
 * Filter type. Enum values- `IN`- Contains. When the filter type is this item, the filtered value needs to be a valid JSON array character string. `MATCH`- Fuzzy matching, equivalent to `like` operations in MySQL. `GREATER_EQUAL`- Greater than or equal to. `GREATER_THAN`- Greater than. `LOWER_EQUAL`- Less than or equal to.`LOWER_THAN`- Less than. `BETWEEN`- Between. When the filter type is this item, the filtered value needs to be a valid JSON array of 2-element string.
 * @member {String} filter_type
 */
FilteringReportIntegratedGet.prototype.filter_type = undefined;

/**
 * The value to filter. When filter_type is `IN`, filter_value needs to be a valid JSON array character string.
 * @member {String} filter_value
 */
FilteringReportIntegratedGet.prototype.filter_value = undefined;

