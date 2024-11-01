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
 * The PixelTrackBody model module.
 * @module model/PixelTrackBody
 * @version 0.1.2
 */
export class PixelTrackBody {
  /**
   * Constructs a new <code>PixelTrackBody</code>.
   * @alias module:model/PixelTrackBody
   * @class
   * @param event {String} Conversion event name. Please refer to the above `Supported web events section` for accepted event names.
   * @param pixel_code {String} Pixel ID that can be found in events manager of the TikTok ads platform. For details, see the [Where to Find pixel_code](https://ads.tiktok.com/marketing_api/docs?id=1739584855420929) section
   */
  constructor(event, pixel_code) {
    this.event = event;
    this.pixel_code = pixel_code;
  }

  /**
   * Constructs a <code>PixelTrackBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelTrackBody} obj Optional instance to populate.
   * @return {module:model/PixelTrackBody} The populated <code>PixelTrackBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelTrackBody();
      if (data.hasOwnProperty('context'))
        obj.context = PixelContext.constructFromObject(data['context']);
      if (data.hasOwnProperty('event'))
        obj.event = ApiClient.convertToType(data['event'], 'String');
      if (data.hasOwnProperty('event_id'))
        obj.event_id = ApiClient.convertToType(data['event_id'], 'String');
      if (data.hasOwnProperty('pixel_code'))
        obj.pixel_code = ApiClient.convertToType(data['pixel_code'], 'String');
      if (data.hasOwnProperty('properties'))
        obj.properties = PixelProperties.constructFromObject(data['properties']);
      if (data.hasOwnProperty('timestamp'))
        obj.timestamp = ApiClient.convertToType(data['timestamp'], 'String');
    }
    return obj;
  }
}

/**
 * @member {module:model/PixelContext} context
 */
PixelTrackBody.prototype.context = undefined;

/**
 * Conversion event name. Please refer to the above `Supported web events section` for accepted event names.
 * @member {String} event
 */
PixelTrackBody.prototype.event = undefined;

/**
 * Any string or hashed ID that can identify a unique event. This is required if you are sending overlapping events from both TikTok Pixel and Events API.  Please check the [deduplication](https://ads.tiktok.com/marketing_api/docs?id=1739584864945154) subsection for details and complete the setup. Some examples are: 1. RandomNumber 2. OrderID (for CompletePayment event) 3. SessionID_RandomNumber 4. ExternalID_RandomNumber 5. BrowserID_RandomNumber 
 * @member {String} event_id
 */
PixelTrackBody.prototype.event_id = undefined;

/**
 * Pixel ID that can be found in events manager of the TikTok ads platform. For details, see the [Where to Find pixel_code](https://ads.tiktok.com/marketing_api/docs?id=1739584855420929) section
 * @member {String} pixel_code
 */
PixelTrackBody.prototype.pixel_code = undefined;

/**
 * @member {module:model/PixelProperties} properties
 */
PixelTrackBody.prototype.properties = undefined;

/**
 * Timestamp that the event took place. Timestamp with ISO 8601 format. See ISO_8601. Please note, if timestamp is not provided, the time when TikTok receives the event via the server will be used.
 * @member {String} timestamp
 */
PixelTrackBody.prototype.timestamp = undefined;

