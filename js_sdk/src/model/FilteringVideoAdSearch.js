/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The FilteringVideoAdSearch model module.
 * @module model/FilteringVideoAdSearch
 * @version 0.1.2
 */
export class FilteringVideoAdSearch {
  /**
   * Constructs a new <code>FilteringVideoAdSearch</code>.
   * @alias module:model/FilteringVideoAdSearch
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>FilteringVideoAdSearch</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FilteringVideoAdSearch} obj Optional instance to populate.
   * @return {module:model/FilteringVideoAdSearch} The populated <code>FilteringVideoAdSearch</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new FilteringVideoAdSearch();
      if (data.hasOwnProperty('displayable'))
        obj.displayable = ApiClient.convertToType(data['displayable'], 'Boolean');
      if (data.hasOwnProperty('height'))
        obj.height = ApiClient.convertToType(data['height'], 'Number');
      if (data.hasOwnProperty('material_ids'))
        obj.material_ids = ApiClient.convertToType(data['material_ids'], ['String']);
      if (data.hasOwnProperty('ratio'))
        obj.ratio = ApiClient.convertToType(data['ratio'], ['Number']);
      if (data.hasOwnProperty('video_ids'))
        obj.video_ids = ApiClient.convertToType(data['video_ids'], ['String']);
      if (data.hasOwnProperty('width'))
        obj.width = ApiClient.convertToType(data['width'], 'Number');
    }
    return obj;
  }
}

/**
 * Enum values: \\n False(default value): Search in all materials \\n True: Search in the materials displayed on the platform.
 * @member {Boolean} displayable
 */
FilteringVideoAdSearch.prototype.displayable = undefined;

/**
 * Video height.
 * @member {Number} height
 */
FilteringVideoAdSearch.prototype.height = undefined;

/**
 * A list of material IDs. At most 100 IDs can be included in the list.
 * @member {Array.<String>} material_ids
 */
FilteringVideoAdSearch.prototype.material_ids = undefined;

/**
 * Video aspect ratio, e.g.: [1.7, 2.5]. Use 1.7 to search for videos with aspect ratio between 1.65-1.75, i.e. the precision floating point is 0.05.
 * @member {Array.<Number>} ratio
 */
FilteringVideoAdSearch.prototype.ratio = undefined;

/**
 * A list of video IDs. At most 100 IDs can be included in the list.
 * @member {Array.<String>} video_ids
 */
FilteringVideoAdSearch.prototype.video_ids = undefined;

/**
 * Video width.
 * @member {Number} width
 */
FilteringVideoAdSearch.prototype.width = undefined;

