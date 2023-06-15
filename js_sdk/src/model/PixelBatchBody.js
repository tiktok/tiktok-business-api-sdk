/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient';
import {OpenApiv13pixelbatchBatch} from './OpenApiv13pixelbatchBatch';

/**
 * The PixelBatchBody model module.
 * @module model/PixelBatchBody
 * @version 0.1.1
 */
export class PixelBatchBody {
  /**
   * Constructs a new <code>PixelBatchBody</code>.
   * @alias module:model/PixelBatchBody
   * @class
   * @param batch {Array.<module:model/OpenApiv13pixelbatchBatch>} A list of web events
   * @param pixel_code {String} Pixel ID that can be found in events manager of the TikTok ads platform. For details, see the [Where to Find pixel_code](https://ads.tiktok.com/marketing_api/docs?id=1739584855420929) section
   */
  constructor(batch, pixel_code) {
    this.batch = batch;
    this.pixel_code = pixel_code;
  }

  /**
   * Constructs a <code>PixelBatchBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PixelBatchBody} obj Optional instance to populate.
   * @return {module:model/PixelBatchBody} The populated <code>PixelBatchBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PixelBatchBody();
      if (data.hasOwnProperty('batch'))
        obj.batch = ApiClient.convertToType(data['batch'], [OpenApiv13pixelbatchBatch]);
      if (data.hasOwnProperty('pixel_code'))
        obj.pixel_code = ApiClient.convertToType(data['pixel_code'], 'String');
    }
    return obj;
  }
}

/**
 * A list of web events
 * @member {Array.<module:model/OpenApiv13pixelbatchBatch>} batch
 */
PixelBatchBody.prototype.batch = undefined;

/**
 * Pixel ID that can be found in events manager of the TikTok ads platform. For details, see the [Where to Find pixel_code](https://ads.tiktok.com/marketing_api/docs?id=1739584855420929) section
 * @member {String} pixel_code
 */
PixelBatchBody.prototype.pixel_code = undefined;

