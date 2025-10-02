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
 * The PixelbatchBatch model module.
 * @module model/PixelbatchBatch
 * @version 0.1.8
 */
export class PixelbatchBatch {
  /**
   * Constructs a new <code>PixelbatchBatch</code>.
   * @alias module:model/PixelbatchBatch
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PixelbatchBatch</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelbatchBatch} obj Optional instance to populate.
   * @return {module:model/PixelbatchBatch} The populated <code>PixelbatchBatch</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelbatchBatch();
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
PixelbatchBatch.prototype.context = undefined;

/**
 * Conversion event name. Please refer to the above `Supported web events` section for accepted event names.
 * @member {String} event
 */
PixelbatchBatch.prototype.event = undefined;

/**
 * {Any hashed ID that can identify a unique user/session and do not contain `_`}_RandomNumber. Some examples are: 1. RandomNumber 2. OrderID (for CompletePayment event) 3. SessionID_RandomNumber 4. ExternalID_RandomNumber 5. BrowserID_RandomNumber 
 * @member {String} event_id
 */
PixelbatchBatch.prototype.event_id = undefined;

/**
 * @member {module:model/PixelProperties} properties
 */
PixelbatchBatch.prototype.properties = undefined;

/**
 * Timestamp that the event took place. Timestamp with ISO 8601 format. See ISO_8601. Please note, if timestamp is not provided, the time when TikTok receives the event via the server will be used.
 * @member {String} timestamp
 */
PixelbatchBatch.prototype.timestamp = undefined;

/**
 * Currently only accepting value track
 * @member {String} type
 */
PixelbatchBatch.prototype.type = undefined;

