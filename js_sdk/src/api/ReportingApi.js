/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {ContextInfoGmvMaxReportGet} from '../model/ContextInfoGmvMaxReportGet.js';
import {FilteringGmvMaxReportGet} from '../model/FilteringGmvMaxReportGet.js';
import {FilteringSmartPlusMaterialReportBreakdown} from '../model/FilteringSmartPlusMaterialReportBreakdown.js';
import {FilteringSmartPlusMaterialReportOverview} from '../model/FilteringSmartPlusMaterialReportOverview.js';
import {InlineResponse200} from '../model/InlineResponse200.js';
import {ReportTaskCreateBody} from '../model/ReportTaskCreateBody.js';
import {TaskCancelBody} from '../model/TaskCancelBody.js';

/**
* Reporting service.
* @module api/ReportingApi
* @version 0.1.9
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
     * Callback function to receive the result of the gmvMaxReportGet operation.
     * @callback moduleapi/ReportingApi~gmvMaxReportGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get GMV Max report [Smart Plus GMV Max Report Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1824721673497601)
     * @param {String} advertiser_id 
     * @param {Array.<String>} store_ids 
     * @param {Array.<String>} dimensions 
     * @param {Array.<String>} metrics 
     * @param {String} start_date 
     * @param {String} end_date 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.enable_total_metrics  (default to <.>)
     * @param {module:model/FilteringGmvMaxReportGet} opts.filtering 
     * @param {String} opts.sort_field 
     * @param {String} opts.sort_type  (default to <.>)
     * @param {Number} opts.page  (default to <.>)
     * @param {Number} opts.page_size  (default to <.>)
     * @param {module:model/ContextInfoGmvMaxReportGet} opts.context_info 
     * @param {module:api/ReportingApi~gmvMaxReportGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    gmvMaxReportGet(advertiser_id, store_ids, dimensions, metrics, start_date, end_date, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling gmvMaxReportGet");
      }
      // verify the required parameter 'store_ids' is set
      if (store_ids === undefined || store_ids === null) {
        throw new Error("Missing the required parameter 'store_ids' when calling gmvMaxReportGet");
      }
      // verify the required parameter 'dimensions' is set
      if (dimensions === undefined || dimensions === null) {
        throw new Error("Missing the required parameter 'dimensions' when calling gmvMaxReportGet");
      }
      // verify the required parameter 'metrics' is set
      if (metrics === undefined || metrics === null) {
        throw new Error("Missing the required parameter 'metrics' when calling gmvMaxReportGet");
      }
      // verify the required parameter 'start_date' is set
      if (start_date === undefined || start_date === null) {
        throw new Error("Missing the required parameter 'start_date' when calling gmvMaxReportGet");
      }
      // verify the required parameter 'end_date' is set
      if (end_date === undefined || end_date === null) {
        throw new Error("Missing the required parameter 'end_date' when calling gmvMaxReportGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling gmvMaxReportGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'store_ids': this.apiClient.buildCollectionParam(store_ids, 'multi'),'dimensions': this.apiClient.buildCollectionParam(dimensions, 'multi'),'metrics': this.apiClient.buildCollectionParam(metrics, 'multi'),'enable_total_metrics': opts['enable_total_metrics'],'start_date': start_date,'end_date': end_date,'filtering': opts['filtering'],'sort_field': opts['sort_field'],'sort_type': opts['sort_type'],'page': opts['page'],'page_size': opts['page_size'],'context_info': opts['context_info']
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
        '/open_api/v1.3/gmv_max/report/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
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
     * @param {Array.<Object>} opts.filtering 
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
        'page': opts['page'],'page_size': opts['page_size'],'enable_total_metrics': opts['enable_total_metrics'],'multi_adv_report_in_utc_time': opts['multi_adv_report_in_utc_time'],'query_mode': opts['query_mode'],'advertiser_id': opts['advertiser_id'],'advertiser_ids': this.apiClient.buildCollectionParam(opts['advertiser_ids'], 'multi'),'bc_id': opts['bc_id'],'service_type': opts['service_type'],'report_type': report_type,'data_level': opts['data_level'],'dimensions': this.apiClient.buildCollectionParam(opts['dimensions'], 'multi'),'metrics': this.apiClient.buildCollectionParam(opts['metrics'], 'multi'),'start_date': opts['start_date'],'end_date': opts['end_date'],'query_lifetime': opts['query_lifetime'],'order_field': opts['order_field'],'order_type': opts['order_type'],'filtering': this.apiClient.buildCollectionParam(opts['filtering'], 'multi')
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
     * @param {module:model/ReportTaskCreateBody} opts.body 
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
    /**
     * Callback function to receive the result of the smartPlusMaterialReportBreakdown operation.
     * @callback moduleapi/ReportingApi~smartPlusMaterialReportBreakdownCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get breakdown of material reports [Smart Plus Material Report Breakdown]
     * @param {String} advertiser_id 
     * @param {Array.<String>} dimensions 
     * @param {String} start_date 
     * @param {String} end_date 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.metrics 
     * @param {module:model/FilteringSmartPlusMaterialReportBreakdown} opts.filtering 
     * @param {String} opts.sort_field  (default to <.>)
     * @param {String} opts.sort_type  (default to <.>)
     * @param {Number} opts.page  (default to <.>)
     * @param {Number} opts.page_size  (default to <.>)
     * @param {module:api/ReportingApi~smartPlusMaterialReportBreakdownCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    smartPlusMaterialReportBreakdown(advertiser_id, dimensions, start_date, end_date, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling smartPlusMaterialReportBreakdown");
      }
      // verify the required parameter 'dimensions' is set
      if (dimensions === undefined || dimensions === null) {
        throw new Error("Missing the required parameter 'dimensions' when calling smartPlusMaterialReportBreakdown");
      }
      // verify the required parameter 'start_date' is set
      if (start_date === undefined || start_date === null) {
        throw new Error("Missing the required parameter 'start_date' when calling smartPlusMaterialReportBreakdown");
      }
      // verify the required parameter 'end_date' is set
      if (end_date === undefined || end_date === null) {
        throw new Error("Missing the required parameter 'end_date' when calling smartPlusMaterialReportBreakdown");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling smartPlusMaterialReportBreakdown");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'dimensions': this.apiClient.buildCollectionParam(dimensions, 'multi'),'metrics': this.apiClient.buildCollectionParam(opts['metrics'], 'multi'),'start_date': start_date,'end_date': end_date,'filtering': opts['filtering'],'sort_field': opts['sort_field'],'sort_type': opts['sort_type'],'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/smart_plus/material_report/breakdown/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the smartPlusMaterialReportOverview operation.
     * @callback moduleapi/ReportingApi~smartPlusMaterialReportOverviewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get overview of material reports [Smart Plus Material Report Overview]
     * @param {String} advertiser_id 
     * @param {Array.<String>} dimensions 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.metrics 
     * @param {String} opts.start_date 
     * @param {String} opts.end_date 
     * @param {Boolean} opts.query_lifetime  (default to <.>)
     * @param {module:model/FilteringSmartPlusMaterialReportOverview} opts.filtering 
     * @param {String} opts.sort_field  (default to <.>)
     * @param {String} opts.sort_type  (default to <.>)
     * @param {Number} opts.page  (default to <.>)
     * @param {Number} opts.page_size  (default to <.>)
     * @param {module:api/ReportingApi~smartPlusMaterialReportOverviewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    smartPlusMaterialReportOverview(advertiser_id, dimensions, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling smartPlusMaterialReportOverview");
      }
      // verify the required parameter 'dimensions' is set
      if (dimensions === undefined || dimensions === null) {
        throw new Error("Missing the required parameter 'dimensions' when calling smartPlusMaterialReportOverview");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling smartPlusMaterialReportOverview");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'dimensions': this.apiClient.buildCollectionParam(dimensions, 'multi'),'metrics': this.apiClient.buildCollectionParam(opts['metrics'], 'multi'),'start_date': opts['start_date'],'end_date': opts['end_date'],'query_lifetime': opts['query_lifetime'],'filtering': opts['filtering'],'sort_field': opts['sort_field'],'sort_type': opts['sort_type'],'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/smart_plus/material_report/overview/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}