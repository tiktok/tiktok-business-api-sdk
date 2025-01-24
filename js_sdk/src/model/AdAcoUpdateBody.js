/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from '../ApiClient.js';
import {AdAcoBodyAvatarIconList} from './AdAcoBodyAvatarIconList.js';
import {AdAcoBodyCallToActionList} from './AdAcoBodyCallToActionList.js';
import {AdAcoBodyCardList} from './AdAcoBodyCardList.js';
import {AdAcoBodyCommonMaterial} from './AdAcoBodyCommonMaterial.js';
import {AdAcoBodyDeeplinkList} from './AdAcoBodyDeeplinkList.js';
import {AdAcoBodyDisplayNameList} from './AdAcoBodyDisplayNameList.js';
import {AdAcoBodyLandingPageUrls} from './AdAcoBodyLandingPageUrls.js';
import {AdAcoBodyMediaInfoList} from './AdAcoBodyMediaInfoList.js';
import {AdAcoBodyPageList} from './AdAcoBodyPageList.js';
import {AdAcoBodyTitleList} from './AdAcoBodyTitleList.js';

/**
 * The AdAcoUpdateBody model module.
 * @module model/AdAcoUpdateBody
 * @version 0.1.3
 */
export class AdAcoUpdateBody {
  /**
   * Constructs a new <code>AdAcoUpdateBody</code>.
   * @alias module:model/AdAcoUpdateBody
   * @class
   * @param advertiser_id {String} Advertiser ID. 
   */
  constructor(advertiser_id) {
    this.advertiser_id = advertiser_id;
  }

  /**
   * Constructs a <code>AdAcoUpdateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdAcoUpdateBody} obj Optional instance to populate.
   * @return {module:model/AdAcoUpdateBody} The populated <code>AdAcoUpdateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdAcoUpdateBody();
      if (data.hasOwnProperty('adgroup_id'))
        obj.adgroup_id = ApiClient.convertToType(data['adgroup_id'], 'String');
      if (data.hasOwnProperty('advertiser_id'))
        obj.advertiser_id = ApiClient.convertToType(data['advertiser_id'], 'String');
      if (data.hasOwnProperty('avatar_icon_list'))
        obj.avatar_icon_list = ApiClient.convertToType(data['avatar_icon_list'], [AdAcoBodyAvatarIconList]);
      if (data.hasOwnProperty('call_to_action_list'))
        obj.call_to_action_list = ApiClient.convertToType(data['call_to_action_list'], [AdAcoBodyCallToActionList]);
      if (data.hasOwnProperty('card_list'))
        obj.card_list = ApiClient.convertToType(data['card_list'], [AdAcoBodyCardList]);
      if (data.hasOwnProperty('common_material'))
        obj.common_material = AdAcoBodyCommonMaterial.constructFromObject(data['common_material']);
      if (data.hasOwnProperty('deeplink_list'))
        obj.deeplink_list = ApiClient.convertToType(data['deeplink_list'], [AdAcoBodyDeeplinkList]);
      if (data.hasOwnProperty('display_name_list'))
        obj.display_name_list = ApiClient.convertToType(data['display_name_list'], [AdAcoBodyDisplayNameList]);
      if (data.hasOwnProperty('landing_page_urls'))
        obj.landing_page_urls = ApiClient.convertToType(data['landing_page_urls'], [AdAcoBodyLandingPageUrls]);
      if (data.hasOwnProperty('media_info_list'))
        obj.media_info_list = ApiClient.convertToType(data['media_info_list'], [AdAcoBodyMediaInfoList]);
      if (data.hasOwnProperty('page_list'))
        obj.page_list = ApiClient.convertToType(data['page_list'], [AdAcoBodyPageList]);
      if (data.hasOwnProperty('title_list'))
        obj.title_list = ApiClient.convertToType(data['title_list'], [AdAcoBodyTitleList]);
    }
    return obj;
  }
}

/**
 * Ad group ID. The ID should be of the ad group that you will enable Automated Creative Optimization for, and `creative_material_mode` for the ad group must be set as `DYNAMIC`.
 * @member {String} adgroup_id
 */
AdAcoUpdateBody.prototype.adgroup_id = undefined;

/**
 * Advertiser ID. 
 * @member {String} advertiser_id
 */
AdAcoUpdateBody.prototype.advertiser_id = undefined;

/**
 * Avatar image list.
 * @member {Array.<module:model/AdAcoBodyAvatarIconList>} avatar_icon_list
 */
AdAcoUpdateBody.prototype.avatar_icon_list = undefined;

/**
 * Call-to-action list. For TikTok ads, either this field or `call_to_action_id` must be specified. If both are specified, this field will be ignored.
 * @member {Array.<module:model/AdAcoBodyCallToActionList>} call_to_action_list
 */
AdAcoUpdateBody.prototype.call_to_action_list = undefined;

/**
 * Card ID list. Length range- [0,1].
 * @member {Array.<module:model/AdAcoBodyCardList>} card_list
 */
AdAcoUpdateBody.prototype.card_list = undefined;

/**
 * @member {module:model/AdAcoBodyCommonMaterial} common_material
 */
AdAcoUpdateBody.prototype.common_material = undefined;

/**
 * List of open URLs. Length range- [0,1]
 * @member {Array.<module:model/AdAcoBodyDeeplinkList>} deeplink_list
 */
AdAcoUpdateBody.prototype.deeplink_list = undefined;

/**
 * Display names.
 * @member {Array.<module:model/AdAcoBodyDisplayNameList>} display_name_list
 */
AdAcoUpdateBody.prototype.display_name_list = undefined;

/**
 * Multiple landing page URLs.
 * @member {Array.<module:model/AdAcoBodyLandingPageUrls>} landing_page_urls
 */
AdAcoUpdateBody.prototype.landing_page_urls = undefined;

/**
 * List of media information.
 * @member {Array.<module:model/AdAcoBodyMediaInfoList>} media_info_list
 */
AdAcoUpdateBody.prototype.media_info_list = undefined;

/**
 * Page ID list.
 * @member {Array.<module:model/AdAcoBodyPageList>} page_list
 */
AdAcoUpdateBody.prototype.page_list = undefined;

/**
 * List of ad titles (also called ad texts). Ad titles are shown to your audience as part of your ad creative, to deliver the message you intend to communicate to them.
 * @member {Array.<module:model/AdAcoBodyTitleList>} title_list
 */
AdAcoUpdateBody.prototype.title_list = undefined;

