/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {CustomAudienceApplyBody} from '../model/CustomAudienceApplyBody.js';
import {CustomAudienceCreateBody} from '../model/CustomAudienceCreateBody.js';
import {CustomAudienceDeleteBody} from '../model/CustomAudienceDeleteBody.js';
import {CustomAudienceShareBody} from '../model/CustomAudienceShareBody.js';
import {CustomAudienceUpdateBody} from '../model/CustomAudienceUpdateBody.js';
import {DmpcustomAudiencefileuploadContextInfo} from '../model/DmpcustomAudiencefileuploadContextInfo.js';
import {InlineResponse200} from '../model/InlineResponse200.js';
import {LookalikeCreateBody} from '../model/LookalikeCreateBody.js';
import {LookalikeUpdateBody} from '../model/LookalikeUpdateBody.js';
import {RuleCreateBody} from '../model/RuleCreateBody.js';
import {SavedAudienceCreateBody} from '../model/SavedAudienceCreateBody.js';
import {SavedAudienceDeleteBody} from '../model/SavedAudienceDeleteBody.js';
import {ShareCancelBody} from '../model/ShareCancelBody.js';

/**
* Audience service.
* @module api/AudienceApi
* @version 0.1.4
*/
export class AudienceApi {

    /**
    * Constructs a new AudienceApi. 
    * @alias module:api/AudienceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the dmpCustomAudienceApply operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceApplyCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Apply a shared custom audience [Dmp Custom_audience Apply](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/CustomAudienceApplyBody} opts.body 
     * @param {module:api/AudienceApi~dmpCustomAudienceApplyCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceApply(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceApply");
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
        '/open_api/v1.3/dmp/custom_audience/apply/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceApplyLog operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceApplyLogCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the latest application log of custom audiences [Dmp Custom_audience Apply Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758615737388033)
     * @param {String} advertiser_id Advertiser ID.
     * @param {Array.<String>} custom_audience_ids A list of custom audience IDs. Note The advertiser must be the owner of the custom_audience_ids. Otherwise, an error will occur. You can use the is_creator field returned in /dmp/custom_audience/list/ and /dmp/custom_audience/get/ to check whether this advertiser is the owner of this audience.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Number} opts.page Current page number. Default value: 1. (default to <.>)
     * @param {Number} opts.page_size Page size. Default value: 10. (default to <.>)
     * @param {String} opts.timezone The timezone of returned value. For enum values, see Appendix - Time Zone. If not specified, UTC will be used.
     * @param {Object} opts.context_info 
     * @param {module:api/AudienceApi~dmpCustomAudienceApplyLogCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceApplyLog(advertiser_id, custom_audience_ids, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling dmpCustomAudienceApplyLog");
      }
      // verify the required parameter 'custom_audience_ids' is set
      if (custom_audience_ids === undefined || custom_audience_ids === null) {
        throw new Error("Missing the required parameter 'custom_audience_ids' when calling dmpCustomAudienceApplyLog");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceApplyLog");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'custom_audience_ids': this.apiClient.buildCollectionParam(custom_audience_ids, 'multi'),'page': opts['page'],'page_size': opts['page_size'],'timezone': opts['timezone'],'context_info': opts['context_info']
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
        '/open_api/v1.3/dmp/custom_audience/apply/log/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceCreate operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create an audience by file [Dmp Custom_audience Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940570793985)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/CustomAudienceCreateBody} opts.body 
     * @param {module:api/AudienceApi~dmpCustomAudienceCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceCreate");
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
        '/open_api/v1.3/dmp/custom_audience/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceDelete operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete audiences [Dmp Custom_audience Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940539757569)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/CustomAudienceDeleteBody} opts.body 
     * @param {module:api/AudienceApi~dmpCustomAudienceDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceDelete(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceDelete");
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
        '/open_api/v1.3/dmp/custom_audience/delete/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceFileUpload operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceFileUploadCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Upload a data file [Dmp Custom_audience File Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940567842818)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {String} opts.advertiser_id 
     * @param {String} opts.calculate_type 
     * @param {module:model/DmpcustomAudiencefileuploadContextInfo} opts.context_info 
     * @param {Blob} opts.file 
     * @param {String} opts.file_name 
     * @param {String} opts.file_signature 
     * @param {module:api/AudienceApi~dmpCustomAudienceFileUploadCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceFileUpload(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceFileUpload");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        'Access-Token': Access_Token
      };
      let formParams = {
        'advertiser_id': opts['advertiser_id'],'calculate_type': opts['calculate_type'],'context_info': opts['context_info'],'file': opts['file'],'file_name': opts['file_name'],'file_signature': opts['file_signature']
      };

      let authNames = [];
      let contentTypes = ['multipart/form-data'];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/dmp/custom_audience/file/upload/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceGet operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Obtain the details of specified audiences [Dmp Custom_audience Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940507792385)
     * @param {String} advertiser_id Advertiser ID.
     * @param {Array.<String>} custom_audience_ids A list of Audience IDs. Length range is [1, 100] .
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Number} opts.history_size The size of the history data which the user requests.
     * @param {module:api/AudienceApi~dmpCustomAudienceGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceGet(advertiser_id, custom_audience_ids, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling dmpCustomAudienceGet");
      }
      // verify the required parameter 'custom_audience_ids' is set
      if (custom_audience_ids === undefined || custom_audience_ids === null) {
        throw new Error("Missing the required parameter 'custom_audience_ids' when calling dmpCustomAudienceGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'custom_audience_ids': this.apiClient.buildCollectionParam(custom_audience_ids, 'multi'),'history_size': opts['history_size']
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
        '/open_api/v1.3/dmp/custom_audience/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceList operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all audiences [Dmp Custom_audience List](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940506015746)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.custom_audience_ids A list of Audience IDs. Length range is [1, 100].
     * @param {Number} opts.page Current page number. Default value: 1. Value range: ≥ 1. (default to <.>)
     * @param {Number} opts.page_size Page size. Defaults is 10. Value range: 1-100. (default to <.>)
     * @param {module:api/AudienceApi~dmpCustomAudienceListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceList(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling dmpCustomAudienceList");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceList");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'custom_audience_ids': this.apiClient.buildCollectionParam(opts['custom_audience_ids'], 'multi'),'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/dmp/custom_audience/list/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceLookalikeCreate operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceLookalikeCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a lookalike audience [Dmp Custom_audience Lookalike Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940511844353)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/LookalikeCreateBody} opts.body 
     * @param {module:api/AudienceApi~dmpCustomAudienceLookalikeCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceLookalikeCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceLookalikeCreate");
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
        '/open_api/v1.3/dmp/custom_audience/lookalike/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceLookalikeUpdate operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceLookalikeUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Manually refresh a Lookalike Audience [Dmp Custom_audience Lookalike Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758616888158209)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/LookalikeUpdateBody} opts.body 
     * @param {module:api/AudienceApi~dmpCustomAudienceLookalikeUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceLookalikeUpdate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceLookalikeUpdate");
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
        '/open_api/v1.3/dmp/custom_audience/lookalike/update/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceRuleCreate operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceRuleCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create an audience by rules [Dmp Custom_audience Rule Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940509849601)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/RuleCreateBody} opts.body 
     * @param {module:api/AudienceApi~dmpCustomAudienceRuleCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceRuleCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceRuleCreate");
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
        '/open_api/v1.3/dmp/custom_audience/rule/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceShare operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceShareCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Share custom audiences with other advertisers [Dmp Custom_audience Share](https://business-api.tiktok.com/portal/docs?id&#x3D;1740245803888706)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/CustomAudienceShareBody} opts.body 
     * @param {module:api/AudienceApi~dmpCustomAudienceShareCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceShare(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceShare");
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
        '/open_api/v1.3/dmp/custom_audience/share/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceShareCancel operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceShareCancelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Stop sharing custom audiences with other advertisers [Dmp Custom_audience Share Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1740245829978113)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/ShareCancelBody} opts.body 
     * @param {module:api/AudienceApi~dmpCustomAudienceShareCancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceShareCancel(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceShareCancel");
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
        '/open_api/v1.3/dmp/custom_audience/share/cancel/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceShareLog operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceShareLogCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the sharing log of a custom audience [Dmp Custom_audience Share Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} custom_audience_id Custom audiences that you want to get sharing log for.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Object} opts.context_info 
     * @param {module:api/AudienceApi~dmpCustomAudienceShareLogCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceShareLog(advertiser_id, custom_audience_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling dmpCustomAudienceShareLog");
      }
      // verify the required parameter 'custom_audience_id' is set
      if (custom_audience_id === undefined || custom_audience_id === null) {
        throw new Error("Missing the required parameter 'custom_audience_id' when calling dmpCustomAudienceShareLog");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceShareLog");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'custom_audience_id': custom_audience_id,'context_info': opts['context_info']
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
        '/open_api/v1.3/dmp/custom_audience/share/log/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpCustomAudienceUpdate operation.
     * @callback moduleapi/AudienceApi~dmpCustomAudienceUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update the details of an audience [Dmp Custom_audience Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940572667906)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/CustomAudienceUpdateBody} opts.body 
     * @param {module:api/AudienceApi~dmpCustomAudienceUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpCustomAudienceUpdate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpCustomAudienceUpdate");
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
        '/open_api/v1.3/dmp/custom_audience/update/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpSavedAudienceCreate operation.
     * @callback moduleapi/AudienceApi~dmpSavedAudienceCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a Saved Audience [Dmp Saved_audience Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154541898754)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/SavedAudienceCreateBody} opts.body 
     * @param {module:api/AudienceApi~dmpSavedAudienceCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpSavedAudienceCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpSavedAudienceCreate");
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
        '/open_api/v1.3/dmp/saved_audience/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpSavedAudienceDelete operation.
     * @callback moduleapi/AudienceApi~dmpSavedAudienceDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete Saved Audiences [Dmp Saved_audience Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154666312706)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/SavedAudienceDeleteBody} opts.body 
     * @param {module:api/AudienceApi~dmpSavedAudienceDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpSavedAudienceDelete(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpSavedAudienceDelete");
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
        '/open_api/v1.3/dmp/saved_audience/delete/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dmpSavedAudienceList operation.
     * @callback moduleapi/AudienceApi~dmpSavedAudienceListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the details of Saved Audiences [Dmp Saved_audience List](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154619404290)
     * @param {String} advertiser_id Advertiser ID.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.saved_audience_ids IDs of Saved Audiences. Max size: 100. To create Saved Audiences and obtain the Saved Audience IDs, use /dmp/saved_audience/create/.
     * @param {Number} opts.page  (default to <.>)
     * @param {Number} opts.page_size  (default to <.>)
     * @param {module:api/AudienceApi~dmpSavedAudienceListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dmpSavedAudienceList(advertiser_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling dmpSavedAudienceList");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling dmpSavedAudienceList");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'saved_audience_ids': this.apiClient.buildCollectionParam(opts['saved_audience_ids'], 'multi'),'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/dmp/saved_audience/list/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}