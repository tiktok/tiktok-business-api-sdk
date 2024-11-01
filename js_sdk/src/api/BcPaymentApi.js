/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from "../ApiClient.js";
import {BcTransferBody} from '../model/BcTransferBody.js';
import {FilteringAdvertiserBalanceGet} from '../model/FilteringAdvertiserBalanceGet.js';
import {FilteringAdvertiserTransactionGet} from '../model/FilteringAdvertiserTransactionGet.js';
import {FilteringBCTransactionGet} from '../model/FilteringBCTransactionGet.js';
import {InlineResponse200} from '../model/InlineResponse200.js';

/**
* BcPayment service.
* @module api/BcPaymentApi
* @version 0.1.2
*/
export class BcPaymentApi {

    /**
    * Constructs a new BcPaymentApi. 
    * @alias module:api/BcPaymentApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the advertiserBalanceGet operation.
     * @callback moduleapi/BcPaymentApi~advertiserBalanceGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Obtain the balance of ad accounts in the Business Center. This function only returns the ad accounts that the Business Center has administrator permissions over. [Advertiser balance get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939106470913)
     * @param {String} bc_id Business Center ID.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/FilteringAdvertiserBalanceGet} opts.filtering Filtering conditions.
     * @param {Number} opts.page Current number of page
     * @param {Number} opts.page_size Page size.
     * @param {module:api/BcPaymentApi~advertiserBalanceGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    advertiserBalanceGet(bc_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'bc_id' is set
      if (bc_id === undefined || bc_id === null) {
        throw new Error("Missing the required parameter 'bc_id' when calling advertiserBalanceGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling advertiserBalanceGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'bc_id': bc_id,'filtering': opts['filtering'],'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/advertiser/balance/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the advertiserTransactionGet operation.
     * @callback moduleapi/BcPaymentApi~advertiserTransactionGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the transaction records of ad accounts in the Business Center. This function only returns the transaction records of ad accounts that the Business Center has administrator rights over. [Advertiser transaction Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939116353538)
     * @param {String} bc_id Business Center ID.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/FilteringAdvertiserTransactionGet} opts.filtering Filtering conditions
     * @param {Number} opts.page Current page
     * @param {Number} opts.page_size Page size,
     * @param {module:api/BcPaymentApi~advertiserTransactionGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    advertiserTransactionGet(bc_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'bc_id' is set
      if (bc_id === undefined || bc_id === null) {
        throw new Error("Missing the required parameter 'bc_id' when calling advertiserTransactionGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling advertiserTransactionGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'bc_id': bc_id,'filtering': opts['filtering'],'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/advertiser/transaction/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the bcBalanceGet operation.
     * @callback moduleapi/BcPaymentApi~bcBalanceGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Obtain the balance of a Business Center. [Balance get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939128198145)
     * @param {String} bc_id Business Center ID
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {module:api/BcPaymentApi~bcBalanceGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    bcBalanceGet(bc_id, Access_Token, callback) {
      
      let postBody = null;
      // verify the required parameter 'bc_id' is set
      if (bc_id === undefined || bc_id === null) {
        throw new Error("Missing the required parameter 'bc_id' when calling bcBalanceGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling bcBalanceGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'bc_id': bc_id
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
        '/open_api/v1.3/bc/balance/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the bcTransactionGet operation.
     * @callback moduleapi/BcPaymentApi~bcTransactionGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the transaction records of your Business Centers. [Transaction get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939140408322)
     * @param {String} bc_id Business Center ID.
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/FilteringBCTransactionGet} opts.filtering Filtering conditions
     * @param {String} opts.start_date Start date of transaction records that you want to get, in the format of \&quot;YYYY-MM-DD\&quot;. The default value is the date 90 days earlier.
     * @param {String} opts.end_date End date of transaction records that you want to get, in the format of \&quot;YYYY-MM-DD\&quot;. The default value is the date today.
     * @param {Number} opts.page Page number
     * @param {Number} opts.page_size Page size. Value range- 1-50
     * @param {module:api/BcPaymentApi~bcTransactionGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    bcTransactionGet(bc_id, Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'bc_id' is set
      if (bc_id === undefined || bc_id === null) {
        throw new Error("Missing the required parameter 'bc_id' when calling bcTransactionGet");
      }
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling bcTransactionGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'bc_id': bc_id,'filtering': opts['filtering'],'start_date': opts['start_date'],'end_date': opts['end_date'],'page': opts['page'],'page_size': opts['page_size']
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
        '/open_api/v1.3/bc/transaction/get/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the bcTransfer operation.
     * @callback moduleapi/BcPaymentApi~bcTransferCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Recharge money to or deduct money from an ad account in a Business Center. [BC transfer](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939095321601)
     * @param {String} Access_Token Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162).
     * @param {Object} opts Optional parameters
     * @param {module:model/BcTransferBody} opts.body BC transfer parameters
     * @param {module:api/BcPaymentApi~bcTransferCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    bcTransfer(Access_Token, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'Access_Token' is set
      if (Access_Token === undefined || Access_Token === null) {
        throw new Error("Missing the required parameter 'Access_Token' when calling bcTransfer");
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
        '/open_api/v1.3/bc/transfer/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}