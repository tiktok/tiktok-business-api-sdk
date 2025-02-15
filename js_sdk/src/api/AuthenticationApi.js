/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {InlineResponse200} from '../model/InlineResponse200.js';
import {Oauth2AccessTokenBody} from '../model/Oauth2AccessTokenBody.js';

/**
* Authentication service.
* @module api/AuthenticationApi
* @version 0.1.4
*/
export class AuthenticationApi {

    /**
    * Constructs a new AuthenticationApi. 
    * @alias module:api/AuthenticationApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the oauth2AccessToken operation.
     * @callback moduleapi/AuthenticationApi~oauth2AccessTokenCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get access_token and refresh_token by auth_code. The creator access token is valid for 24 hours and the refresh token is valid for one year. Within one year you will need to refresh the access token with the refresh token on a daily basis. After one year you will need to ask the creator to reauthorize. [Oauth2 Access Token](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739965703387137)
     * @param {Object} opts Optional parameters
     * @param {module:model/Oauth2AccessTokenBody} opts.body Oauth2 Access token Body parameters
     * @param {module:api/AuthenticationApi~oauth2AccessTokenCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    oauth2AccessToken(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/open_api/v1.3/oauth2/access_token/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the oauth2AdvertiserGet operation.
     * @callback moduleapi/AuthenticationApi~oauth2AdvertiserGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get a list of advertisers that have granted you permission to manage their accounts. [Authentication Oauth2 Advertiser Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738455508553729)
     * @param {String} app_id 
     * @param {String} secret 
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/AuthenticationApi~oauth2AdvertiserGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    oauth2AdvertiserGet(app_id, secret, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'app_id' is set
      if (app_id === undefined || app_id === null) {
        throw new Error("Missing the required parameter 'app_id' when calling oauth2AdvertiserGet");
      }
      // verify the required parameter 'secret' is set
      if (secret === undefined || secret === null) {
        throw new Error("Missing the required parameter 'secret' when calling oauth2AdvertiserGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling oauth2AdvertiserGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'app_id': app_id,'secret': secret
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
        '/open_api/v1.3/oauth2/advertiser/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}