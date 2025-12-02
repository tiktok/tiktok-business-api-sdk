/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';

/**
 * The TaskCancelBody model module.
 * @module model/TaskCancelBody
 * @version 0.1.9
 */
export class TaskCancelBody {
  /**
   * Constructs a new <code>TaskCancelBody</code>.
   * @alias module:model/TaskCancelBody
   * @class
   * @param advertiser_id {String} 
   * @param task_id {String} 
   */
  constructor(advertiser_id, task_id) {
    this.advertiser_id = advertiser_id;
    this.task_id = task_id;
  }

  /**
   * Constructs a <code>TaskCancelBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TaskCancelBody} obj Optional instance to populate.
   * @return {module:model/TaskCancelBody} The populated <code>TaskCancelBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new TaskCancelBody();
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('task_id'))
        obj.task_id = ApiClient.convertToType(data['task_id'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} advertiser_id
 */
TaskCancelBody.prototype.advertiser_id = undefined;

/**
 * @member {String} task_id
 */
TaskCancelBody.prototype.task_id = undefined;

