/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {AdAcoBody} from '../model/AdAcoBody.js';
import {AdAcoUpdateBody} from '../model/AdAcoUpdateBody.js';
import {InlineResponse200} from '../model/InlineResponse200.js';
import {MaterialStatusUpdateBody} from '../model/MaterialStatusUpdateBody.js';

/**
* AdAco service.
* @module api/AdAcoApi
* @version 1.2.1
*/
export class AdAcoApi {

    /**
    * Constructs a new AdAcoApi. 
    * @alias module:api/AdAcoApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the adAcoCreate operation.
     * @callback moduleapi/AdAcoApi~adAcoCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create an ACO ad by uploading necessary ad creatives to the library. [Ad Aco Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473063234626)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/AdAcoBody} opts.body Ad Aco update parameters.
     * @param {module:api/AdAcoApi~adAcoCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    adAcoCreate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling adAcoCreate");
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
        '/open_api/v1.3/ad/aco/create/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the adAcoGet operation.
     * @callback moduleapi/AdAcoApi~adAcoGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get creative materials for an ACO ad, including call-to-actions, texts, ad names, images, or video materials. [Ad Aco Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473020978177)
     * @param {String} advertiser_id Advertiser ID.
     * @param {Array.<String>} adgroup_ids A list of ad group IDs. Quantity- 1-100.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.exclude_field_types_in_response The type of fields that you want to remove from the response.
     * @param {module:api/AdAcoApi~adAcoGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    adAcoGet(advertiser_id, adgroup_ids, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'advertiser_id' is set
      if (advertiser_id === undefined || advertiser_id === null) {
        throw new Error("Missing the required parameter 'advertiser_id' when calling adAcoGet");
      }
      // verify the required parameter 'adgroup_ids' is set
      if (adgroup_ids === undefined || adgroup_ids === null) {
        throw new Error("Missing the required parameter 'adgroup_ids' when calling adAcoGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling adAcoGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'advertiser_id': advertiser_id,'exclude_field_types_in_response': this.apiClient.buildCollectionParam(opts['exclude_field_types_in_response'], 'multi'),'adgroup_ids': this.apiClient.buildCollectionParam(adgroup_ids, 'multi')
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
        '/open_api/v1.3/ad/aco/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the adAcoMaterialStatusUpdate operation.
     * @callback moduleapi/AdAcoApi~adAcoMaterialStatusUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update the status of creative materials for an ACO ad, including ad texts, images, and video materials [Update materials](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739506701165570)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/MaterialStatusUpdateBody} opts.body Ad Aco material status body
     * @param {module:api/AdAcoApi~adAcoMaterialStatusUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    adAcoMaterialStatusUpdate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling adAcoMaterialStatusUpdate");
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
        '/open_api/v1.3/ad/aco/material_status/update/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the adAcoUpdate operation.
     * @callback moduleapi/AdAcoApi~adAcoUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Modify ACO ad creatives. [Update ACO](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473077112833)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/AdAcoUpdateBody} opts.body Ad Aco update parameters
     * @param {module:api/AdAcoApi~adAcoUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    adAcoUpdate(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling adAcoUpdate");
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
        '/open_api/v1.3/ad/aco/update/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}