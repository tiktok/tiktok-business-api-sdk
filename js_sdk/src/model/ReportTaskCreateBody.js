/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {ReportTaskCreateBodyFiltering} from './ReportTaskCreateBodyFiltering.js';

/**
 * The ReportTaskCreateBody model module.
 * @module model/ReportTaskCreateBody
 * @version 1.2.1
 */
export class ReportTaskCreateBody {
  /**
   * Constructs a new <code>ReportTaskCreateBody</code>.
   * @alias module:model/ReportTaskCreateBody
   * @class
   * @param dimensions {Array.<String>} 
   * @param report_type {String} 
   */
  constructor(dimensions, report_type) {
    this.dimensions = dimensions;
    this.report_type = report_type;
  }

  /**
   * Constructs a <code>ReportTaskCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ReportTaskCreateBody} obj Optional instance to populate.
   * @return {module:model/ReportTaskCreateBody} The populated <code>ReportTaskCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ReportTaskCreateBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('advertiser_ids'))
        obj.advertiser_ids = ApiClient.convertToType(data['advertiser_ids'], ['String']);
      if (data.hasOwnProperty('data_level'))
        obj.data_level = ApiClient.convertToType(data['data_level'], 'String');
      if (data.hasOwnProperty('dimensions'))
        obj.dimensions = ApiClient.convertToType(data['dimensions'], ['String']);
      if (data.hasOwnProperty('enable_report_title_translation'))
        obj.enable_report_title_translation = ApiClient.convertToType(data['enable_report_title_translation'], 'Boolean');
      if (data.hasOwnProperty('end_date'))
        obj.end_date = ApiClient.convertToType(data['end_date'], 'String');
      if (data.hasOwnProperty('file_name'))
        obj.file_name = ApiClient.convertToType(data['file_name'], 'String');
      if (data.hasOwnProperty('filtering'))
        obj.filtering = ApiClient.convertToType(data['filtering'], [ReportTaskCreateBodyFiltering]);
      if (data.hasOwnProperty('metrics'))
        obj.metrics = ApiClient.convertToType(data['metrics'], ['String']);
      if (data.hasOwnProperty('order_field'))
        obj.order_field = ApiClient.convertToType(data['order_field'], 'String');
      if (data.hasOwnProperty('order_type'))
        obj.order_type = ApiClient.convertToType(data['order_type'], 'String');
      if (data.hasOwnProperty('output_format'))
        obj.output_format = ApiClient.convertToType(data['output_format'], 'String');
      if (data.hasOwnProperty('query_lifetime'))
        obj.query_lifetime = ApiClient.convertToType(data['query_lifetime'], 'Boolean');
      if (data.hasOwnProperty('report_type'))
        obj.report_type = ApiClient.convertToType(data['report_type'], 'String');
      if (data.hasOwnProperty('service_type'))
        obj.service_type = ApiClient.convertToType(data['service_type'], 'String');
      if (data.hasOwnProperty('start_date'))
        obj.start_date = ApiClient.convertToType(data['start_date'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
ReportTaskCreateBody.prototype.advertiser_id = undefined;

/**
 * @member {Array.<String>} advertiser_ids
 */
ReportTaskCreateBody.prototype.advertiser_ids = undefined;

/**
 * @member {String} data_level
 */
ReportTaskCreateBody.prototype.data_level = undefined;

/**
 * @member {Array.<String>} dimensions
 */
ReportTaskCreateBody.prototype.dimensions = undefined;

/**
 * @member {Boolean} enable_report_title_translation
 * @default true
 */
ReportTaskCreateBody.prototype.enable_report_title_translation = true;

/**
 * @member {String} end_date
 */
ReportTaskCreateBody.prototype.end_date = undefined;

/**
 * @member {String} file_name
 * @default ' '
 */
ReportTaskCreateBody.prototype.file_name = ' ';

/**
 * @member {Array.<module:model/ReportTaskCreateBodyFiltering>} filtering
 */
ReportTaskCreateBody.prototype.filtering = undefined;

/**
 * @member {Array.<String>} metrics
 */
ReportTaskCreateBody.prototype.metrics = undefined;

/**
 * @member {String} order_field
 */
ReportTaskCreateBody.prototype.order_field = undefined;

/**
 * @member {String} order_type
 * @default 'DESC'
 */
ReportTaskCreateBody.prototype.order_type = 'DESC';

/**
 * @member {String} output_format
 * @default 'CSV_STRING'
 */
ReportTaskCreateBody.prototype.output_format = 'CSV_STRING';

/**
 * @member {Boolean} query_lifetime
 * @default false
 */
ReportTaskCreateBody.prototype.query_lifetime = false;

/**
 * @member {String} report_type
 */
ReportTaskCreateBody.prototype.report_type = undefined;

/**
 * @member {String} service_type
 * @default 'AUCTION'
 */
ReportTaskCreateBody.prototype.service_type = 'AUCTION';

/**
 * @member {String} start_date
 */
ReportTaskCreateBody.prototype.start_date = undefined;

