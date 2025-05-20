/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The InlineResponse200 model module.
 * @module model/InlineResponse200
 * @version 0.1.7
 */
export class InlineResponse200 {
  /**
   * Constructs a new <code>InlineResponse200</code>.
   * @alias module:model/InlineResponse200
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>InlineResponse200</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/InlineResponse200} obj Optional instance to populate.
   * @return {module:model/InlineResponse200} The populated <code>InlineResponse200</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new InlineResponse200();
      if (data.hasOwnProperty('code'))
        obj.code = ApiClient.convertToType(data['code'], 'Number');
      if (data.hasOwnProperty('data'))
        obj.data = ApiClient.convertToType(data['data'], Object);
      if (data.hasOwnProperty('message'))
        obj.message = ApiClient.convertToType(data['message'], 'String');
      if (data.hasOwnProperty('request_id'))
        obj.request_id = ApiClient.convertToType(data['request_id'], 'String');
    }
    return obj;
  }
}

/**
 * Response code. For the complete list of response codes and descriptions, see [Appendix - Return Codes](https://ads.tiktok.com/marketing_api/docs?id=1737172488964097). Will be shown only if it is an error request.
 * @member {Number} code
 */
InlineResponse200.prototype.code = undefined;

/**
 * Returned data. The response for the SDK can be checked in the document for the API given in the description.
 * @member {Object} data
 */
InlineResponse200.prototype.data = undefined;

/**
 * Response message. For details, see [Appendix - Return Codes](https://ads.tiktok.com/marketing_api/docs?id=1737172488964097).
 * @member {String} message
 */
InlineResponse200.prototype.message = undefined;

/**
 * The log ID of a request, which uniquely identifies the request.
 * @member {String} request_id
 */
InlineResponse200.prototype.request_id = undefined;

