/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {PixelContext} from './PixelContext.js';
import {PixelProperties} from './PixelProperties.js';

/**
 * The OpenApiv13pixelbatchBatch model module.
 * @module model/OpenApiv13pixelbatchBatch
 * @version 0.1.1
 */
export class OpenApiv13pixelbatchBatch {
  /**
   * Constructs a new <code>OpenApiv13pixelbatchBatch</code>.
   * @alias module:model/OpenApiv13pixelbatchBatch
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OpenApiv13pixelbatchBatch</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OpenApiv13pixelbatchBatch} obj Optional instance to populate.
   * @return {module:model/OpenApiv13pixelbatchBatch} The populated <code>OpenApiv13pixelbatchBatch</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OpenApiv13pixelbatchBatch();
      if (data.hasOwnProperty('context'))
        obj.context = PixelContext.constructFromObject(data['context']);
      if (data.hasOwnProperty('event'))
        obj.event = ApiClient.convertToType(data['event'], 'String');
      if (data.hasOwnProperty('event_id'))
        obj.event_id = ApiClient.convertToType(data['event_id'], 'String');
      if (data.hasOwnProperty('properties'))
        obj.properties = PixelProperties.constructFromObject(data['properties']);
      if (data.hasOwnProperty('timestamp'))
        obj.timestamp = ApiClient.convertToType(data['timestamp'], 'String');
      if (data.hasOwnProperty('type'))
        obj.type = ApiClient.convertToType(data['type'], 'String');
    }
    return obj;
  }
}

/**
 * @member {module:model/PixelContext} context
 */
OpenApiv13pixelbatchBatch.prototype.context = undefined;

/**
 * Conversion event name. Please refer to the above `Supported web events` section for accepted event names.
 * @member {String} event
 */
OpenApiv13pixelbatchBatch.prototype.event = undefined;

/**
 * {Any hashed ID that can identify a unique user/session and do not contain `_`}_RandomNumber. Some examples are: 1. RandomNumber 2. OrderID (for CompletePayment event) 3. SessionID_RandomNumber 4. ExternalID_RandomNumber 5. BrowserID_RandomNumber 
 * @member {String} event_id
 */
OpenApiv13pixelbatchBatch.prototype.event_id = undefined;

/**
 * @member {module:model/PixelProperties} properties
 */
OpenApiv13pixelbatchBatch.prototype.properties = undefined;

/**
 * Timestamp that the event took place. Timestamp with ISO 8601 format. See ISO_8601. Please note, if timestamp is not provided, the time when TikTok receives the event via the server will be used.
 * @member {String} timestamp
 */
OpenApiv13pixelbatchBatch.prototype.timestamp = undefined;

/**
 * Currently only accepting value track
 * @member {String} type
 */
OpenApiv13pixelbatchBatch.prototype.type = undefined;

