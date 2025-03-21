/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {FilteringReportIntegratedGet} from '../model/FilteringReportIntegratedGet.js';
import {InlineResponse200} from '../model/InlineResponse200.js';
import {TaskCancelBody} from '../model/TaskCancelBody.js';
import {TaskCreateBody} from '../model/TaskCreateBody.js';

/**
* Reporting service.
* @module api/ReportingApi
* @version 0.1.5
*/
export class ReportingApi {

    /**
    * Constructs a new ReportingApi. 
    * @alias module:api/ReportingApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the reportIntegratedGet operation.
     * @callback moduleapi/ReportingApi~reportIntegratedGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Run a synchronous report. [Report Integrated Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302848100353)
     * @param {String} report_type 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Number} opts.page  (default to <.>)
     * @param {Number} opts.page_size  (default to <.>)
     * @param {Boolean} opts.enable_total_metrics  (default to <.>)
     * @param {Boolean} opts.multi_adv_report_in_utc_time  (default to <.>)
     * @param {String} opts.query_mode 
     * @param {String} opts.advertiser_id 
     * @param {Array.<String>} opts.advertiser_ids 
     * @param {String} opts.bc_id 
     * @param {String} opts.service_type 
     * @param {String} opts.data_level 
     * @param {Array.<String>} opts.dimensions 
     * @param {Array.<String>} opts.metrics 
     * @param {String} opts.start_date 
     * @param {String} opts.end_date 
     * @param {Boolean} opts.query_lifetime 
     * @param {String} opts.order_field 
     * @param {String} opts.order_type 
     * @param {module:model/FilteringReportIntegratedGet} opts.filtering 
     * @param {module:api/ReportingApi~reportIntegratedGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    reportIntegratedGet(report_type, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'report_type' is set
      if (report_type === undefined || report_type === null) {
        throw new Error("Missing the required parameter 'report_type' when calling reportIntegratedGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling reportIntegratedGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'page': opts['page'],'page_size': opts['page_size'],'enable_total_metrics': opts['enable_total_metrics'],'multi_adv_report_in_utc_time': opts['multi_adv_report_in_utc_time'],'query_mode': opts['query_mode'],'advertiser_id': opts['advertiser_id'],'advertiser_ids': this.apiClient.buildCollectionParam(opts['advertiser_ids'], 'multi'),'bc_id': opts['bc_id'],'service_type': opts['service_type'],'report_type': report_type,'data_level': opts['data_level'],'dimensions': this.apiClient.buildCollectionParam(opts['dimensions'], 'multi'),'metrics': this.apiClient.buildCollectionParam(opts['metrics'], 'multi'),'start_date': opts['start_date'],'end_date': opts['end_date'],'query_lifetime': opts['query_lifetime'],'order_field': opts['order_field'],'order_type': opts['order_type'],'filtering': opts['filtering']
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/report/integrated/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the reportTaskCancel operation.
     * @callback moduleapi/ReportingApi~reportTaskCancelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel an asynchronous report task. [Report Task Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1803615367145537)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/TaskCancelBody} opts.body 
     * @param {module:api/ReportingApi~reportTaskCancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    reportTaskCancel(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling reportTaskCancel");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/report/task/cancel/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the reportTaskCheck operation.
     * @callback moduleapi/ReportingApi~reportTaskCheckCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the status of an async report task. [Report Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302781443073)
     * @param {String} task_id 
     * @param {String} advertiser_id 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/ReportingApi~reportTaskCheckCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    reportTaskCheck(task_id, advertiser_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'task_id' is set
      if (task_id === undefined || task_id === null) {
        throw new Error("Missing the required parameter 'task_id' when calling reportTaskCheck");
      }
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling reportTaskCheck");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling reportTaskCheck");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'task_id': task_id,'advertiser_id': advertiser_id
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/report/task/check/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the reportTaskCreate operation.
     * @callback moduleapi/ReportingApi~reportTaskCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/TaskCreateBody} opts.body 
     * @param {module:api/ReportingApi~reportTaskCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    reportTaskCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling reportTaskCreate");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/report/task/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}