/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from './ApiClient.js';
import {AdAcoBody} from './model/AdAcoBody.js';
import {AdAcoBodyAvatarIcon} from './model/AdAcoBodyAvatarIcon.js';
import {AdAcoBodyAvatarIconList} from './model/AdAcoBodyAvatarIconList.js';
import {AdAcoBodyCallToActionList} from './model/AdAcoBodyCallToActionList.js';
import {AdAcoBodyCardList} from './model/AdAcoBodyCardList.js';
import {AdAcoBodyCommonMaterial} from './model/AdAcoBodyCommonMaterial.js';
import {AdAcoBodyCommonMaterialTrackingInfo} from './model/AdAcoBodyCommonMaterialTrackingInfo.js';
import {AdAcoBodyDeeplinkList} from './model/AdAcoBodyDeeplinkList.js';
import {AdAcoBodyDisplayNameList} from './model/AdAcoBodyDisplayNameList.js';
import {AdAcoBodyLandingPageUrls} from './model/AdAcoBodyLandingPageUrls.js';
import {AdAcoBodyMediaInfo} from './model/AdAcoBodyMediaInfo.js';
import {AdAcoBodyMediaInfoImageInfo} from './model/AdAcoBodyMediaInfoImageInfo.js';
import {AdAcoBodyMediaInfoList} from './model/AdAcoBodyMediaInfoList.js';
import {AdAcoBodyMediaInfoVideoInfo} from './model/AdAcoBodyMediaInfoVideoInfo.js';
import {AdAcoBodyPageList} from './model/AdAcoBodyPageList.js';
import {AdAcoBodyTitleList} from './model/AdAcoBodyTitleList.js';
import {CatalogCapitalizeBody} from './model/CatalogCapitalizeBody.js';
import {CatalogCreateBody} from './model/CatalogCreateBody.js';
import {CatalogDeleteBody} from './model/CatalogDeleteBody.js';
import {CatalogUpdateBody} from './model/CatalogUpdateBody.js';
import {EventsourceBindBody} from './model/EventsourceBindBody.js';
import {EventsourceUnbindBody} from './model/EventsourceUnbindBody.js';
import {FeedDeleteBody} from './model/FeedDeleteBody.js';
import {InlineResponse200} from './model/InlineResponse200.js';
import {catalogcreateCatalogConf} from './model/catalogcreateCatalogConf.js';
import {creativeportfoliocreateAdvancedAudioInfo} from './model/creativeportfoliocreateAdvancedAudioInfo.js';
import {creativeportfoliocreateAdvancedGestureIcon} from './model/creativeportfoliocreateAdvancedGestureIcon.js';
import {creativeportfoliocreateBadgeImageInfo} from './model/creativeportfoliocreateBadgeImageInfo.js';
import {creativeportfoliocreateBadgePosition} from './model/creativeportfoliocreateBadgePosition.js';
import {creativeportfoliocreatePortfolioContent} from './model/creativeportfoliocreatePortfolioContent.js';
import {creativeportfoliocreateStickerParam} from './model/creativeportfoliocreateStickerParam.js';
import {PortfolioCreateBody} from './model/PortfolioCreateBody.js';
import {ProductDeleteBody} from './model/ProductDeleteBody.js';
import {ProductFileBody} from './model/ProductFileBody.js';
import {AdAcoApi} from './api/AdAcoApi.js';
import {CatalogApi} from './api/CatalogApi.js';
import {CreativeAssetApi} from './api/CreativeAssetApi.js';

/**
* Comprehensive_collection_of_client_libraries_that_enable_our_developers_to_build_software_to_integrate_with_Business_API_faster_and_in_a_more_standardized_way_.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var js_sdk = require('index'); // See note below*.
* var xxxSvc = new js_sdk.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new js_sdk.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new js_sdk.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new js_sdk.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 0.1.3
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The AdAcoBody model constructor.
     * @property {module:model/AdAcoBody}
     */
    AdAcoBody,

    /**
     * The AdAcoBodyAvatarIcon model constructor.
     * @property {module:model/AdAcoBodyAvatarIcon}
     */
    AdAcoBodyAvatarIcon,

    /**
     * The AdAcoBodyAvatarIconList model constructor.
     * @property {module:model/AdAcoBodyAvatarIconList}
     */
    AdAcoBodyAvatarIconList,

    /**
     * The AdAcoBodyCallToActionList model constructor.
     * @property {module:model/AdAcoBodyCallToActionList}
     */
    AdAcoBodyCallToActionList,

    /**
     * The AdAcoBodyCardList model constructor.
     * @property {module:model/AdAcoBodyCardList}
     */
    AdAcoBodyCardList,

    /**
     * The AdAcoBodyCommonMaterial model constructor.
     * @property {module:model/AdAcoBodyCommonMaterial}
     */
    AdAcoBodyCommonMaterial,

    /**
     * The AdAcoBodyCommonMaterialTrackingInfo model constructor.
     * @property {module:model/AdAcoBodyCommonMaterialTrackingInfo}
     */
    AdAcoBodyCommonMaterialTrackingInfo,

    /**
     * The AdAcoBodyDeeplinkList model constructor.
     * @property {module:model/AdAcoBodyDeeplinkList}
     */
    AdAcoBodyDeeplinkList,

    /**
     * The AdAcoBodyDisplayNameList model constructor.
     * @property {module:model/AdAcoBodyDisplayNameList}
     */
    AdAcoBodyDisplayNameList,

    /**
     * The AdAcoBodyLandingPageUrls model constructor.
     * @property {module:model/AdAcoBodyLandingPageUrls}
     */
    AdAcoBodyLandingPageUrls,

    /**
     * The AdAcoBodyMediaInfo model constructor.
     * @property {module:model/AdAcoBodyMediaInfo}
     */
    AdAcoBodyMediaInfo,

    /**
     * The AdAcoBodyMediaInfoImageInfo model constructor.
     * @property {module:model/AdAcoBodyMediaInfoImageInfo}
     */
    AdAcoBodyMediaInfoImageInfo,

    /**
     * The AdAcoBodyMediaInfoList model constructor.
     * @property {module:model/AdAcoBodyMediaInfoList}
     */
    AdAcoBodyMediaInfoList,

    /**
     * The AdAcoBodyMediaInfoVideoInfo model constructor.
     * @property {module:model/AdAcoBodyMediaInfoVideoInfo}
     */
    AdAcoBodyMediaInfoVideoInfo,

    /**
     * The AdAcoBodyPageList model constructor.
     * @property {module:model/AdAcoBodyPageList}
     */
    AdAcoBodyPageList,

    /**
     * The AdAcoBodyTitleList model constructor.
     * @property {module:model/AdAcoBodyTitleList}
     */
    AdAcoBodyTitleList,

    /**
     * The CatalogCapitalizeBody model constructor.
     * @property {module:model/CatalogCapitalizeBody}
     */
    CatalogCapitalizeBody,

    /**
     * The CatalogCreateBody model constructor.
     * @property {module:model/CatalogCreateBody}
     */
    CatalogCreateBody,

    /**
     * The CatalogDeleteBody model constructor.
     * @property {module:model/CatalogDeleteBody}
     */
    CatalogDeleteBody,

    /**
     * The CatalogUpdateBody model constructor.
     * @property {module:model/CatalogUpdateBody}
     */
    CatalogUpdateBody,

    /**
     * The EventsourceBindBody model constructor.
     * @property {module:model/EventsourceBindBody}
     */
    EventsourceBindBody,

    /**
     * The EventsourceUnbindBody model constructor.
     * @property {module:model/EventsourceUnbindBody}
     */
    EventsourceUnbindBody,

    /**
     * The FeedDeleteBody model constructor.
     * @property {module:model/FeedDeleteBody}
     */
    FeedDeleteBody,

    /**
     * The InlineResponse200 model constructor.
     * @property {module:model/InlineResponse200}
     */
    InlineResponse200,

    /**
     * The catalogcreateCatalogConf model constructor.
     * @property {module:model/catalogcreateCatalogConf}
     */
    catalogcreateCatalogConf,

    /**
     * The creativeportfoliocreateAdvancedAudioInfo model constructor.
     * @property {module:model/creativeportfoliocreateAdvancedAudioInfo}
     */
    creativeportfoliocreateAdvancedAudioInfo,

    /**
     * The creativeportfoliocreateAdvancedGestureIcon model constructor.
     * @property {module:model/creativeportfoliocreateAdvancedGestureIcon}
     */
    creativeportfoliocreateAdvancedGestureIcon,

    /**
     * The creativeportfoliocreateBadgeImageInfo model constructor.
     * @property {module:model/creativeportfoliocreateBadgeImageInfo}
     */
    creativeportfoliocreateBadgeImageInfo,

    /**
     * The creativeportfoliocreateBadgePosition model constructor.
     * @property {module:model/creativeportfoliocreateBadgePosition}
     */
    creativeportfoliocreateBadgePosition,

    /**
     * The creativeportfoliocreatePortfolioContent model constructor.
     * @property {module:model/creativeportfoliocreatePortfolioContent}
     */
    creativeportfoliocreatePortfolioContent,

    /**
     * The creativeportfoliocreateStickerParam model constructor.
     * @property {module:model/creativeportfoliocreateStickerParam}
     */
    creativeportfoliocreateStickerParam,

    /**
     * The PortfolioCreateBody model constructor.
     * @property {module:model/PortfolioCreateBody}
     */
    PortfolioCreateBody,

    /**
     * The ProductDeleteBody model constructor.
     * @property {module:model/ProductDeleteBody}
     */
    ProductDeleteBody,

    /**
     * The ProductFileBody model constructor.
     * @property {module:model/ProductFileBody}
     */
    ProductFileBody,

    /**
    * The AdAcoApi service constructor.
    * @property {module:api/AdAcoApi}
    */
    AdAcoApi,

    /**
    * The CatalogApi service constructor.
    * @property {module:api/CatalogApi}
    */
    CatalogApi,

    /**
    * The CreativeAssetApi service constructor.
    * @property {module:api/CreativeAssetApi}
    */
    CreativeAssetApi
};
