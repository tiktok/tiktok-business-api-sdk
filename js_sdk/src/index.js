/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
import {ApiClient} from './ApiClient';
import {AdAcoBody} from './model/AdAcoBody';
import {AdAcoBodyAvatarIcon} from './model/AdAcoBodyAvatarIcon';
import {AdAcoBodyAvatarIconList} from './model/AdAcoBodyAvatarIconList';
import {AdAcoBodyCallToActionList} from './model/AdAcoBodyCallToActionList';
import {AdAcoBodyCardList} from './model/AdAcoBodyCardList';
import {AdAcoBodyCommonMaterial} from './model/AdAcoBodyCommonMaterial';
import {AdAcoBodyCommonMaterialTrackingInfo} from './model/AdAcoBodyCommonMaterialTrackingInfo';
import {AdAcoBodyDeeplinkList} from './model/AdAcoBodyDeeplinkList';
import {AdAcoBodyDisplayNameList} from './model/AdAcoBodyDisplayNameList';
import {AdAcoBodyLandingPageUrls} from './model/AdAcoBodyLandingPageUrls';
import {AdAcoBodyMediaInfo} from './model/AdAcoBodyMediaInfo';
import {AdAcoBodyMediaInfoImageInfo} from './model/AdAcoBodyMediaInfoImageInfo';
import {AdAcoBodyMediaInfoList} from './model/AdAcoBodyMediaInfoList';
import {AdAcoBodyMediaInfoVideoInfo} from './model/AdAcoBodyMediaInfoVideoInfo';
import {AdAcoBodyPageList} from './model/AdAcoBodyPageList';
import {AdAcoBodyTitleList} from './model/AdAcoBodyTitleList';
import {AdAcoUpdateBody} from './model/AdAcoUpdateBody';
import {AdCreateBody} from './model/AdCreateBody';
import {AdStatusUpdateBody} from './model/AdStatusUpdateBody';
import {AdUpdateBody} from './model/AdUpdateBody';
import {AdUploadBody} from './model/AdUploadBody';
import {AdgroupCreateBody} from './model/AdgroupCreateBody';
import {AdgroupStatusUpdateBody} from './model/AdgroupStatusUpdateBody';
import {AdgroupUpdateBody} from './model/AdgroupUpdateBody';
import {AdvertiserCreateBody} from './model/AdvertiserCreateBody';
import {AdvertiserUpdateBody} from './model/AdvertiserUpdateBody';
import {BcTransferBody} from './model/BcTransferBody';
import {CampaignCreateBody} from './model/CampaignCreateBody';
import {CampaignStatusUpdateBody} from './model/CampaignStatusUpdateBody';
import {CampaignUpdateBody} from './model/CampaignUpdateBody';
import {FileImageAdUpload} from './model/FileImageAdUpload';
import {Filtering} from './model/Filtering';
import {FilteringAdGet} from './model/FilteringAdGet';
import {FilteringAdgroupGet} from './model/FilteringAdgroupGet';
import {FilteringAdvertiserBalanceGet} from './model/FilteringAdvertiserBalanceGet';
import {FilteringAdvertiserTransactionGet} from './model/FilteringAdvertiserTransactionGet';
import {FilteringBCTransactionGet} from './model/FilteringBCTransactionGet';
import {FilteringCampaignGet} from './model/FilteringCampaignGet';
import {FilteringReportIntegratedGet} from './model/FilteringReportIntegratedGet';
import {FilteringVideoAdSearch} from './model/FilteringVideoAdSearch';
import {IdentityCreateBody} from './model/IdentityCreateBody';
import {ImageUploadBody} from './model/ImageUploadBody';
import {InlineResponse200} from './model/InlineResponse200';
import {MaterialStatusUpdateBody} from './model/MaterialStatusUpdateBody';
import {Oauth2AccessTokenBody} from './model/Oauth2AccessTokenBody';
import {OpenApiv13adcreateCreatives} from './model/OpenApiv13adcreateCreatives';
import {OpenApiv13adcreateDisclaimerClickableTexts} from './model/OpenApiv13adcreateDisclaimerClickableTexts';
import {OpenApiv13adcreateDisclaimerText} from './model/OpenApiv13adcreateDisclaimerText';
import {OpenApiv13adgroupcreateActions} from './model/OpenApiv13adgroupcreateActions';
import {OpenApiv13adgroupcreateAudienceRule} from './model/OpenApiv13adgroupcreateAudienceRule';
import {OpenApiv13adgroupcreateAudienceRuleExclusions} from './model/OpenApiv13adgroupcreateAudienceRuleExclusions';
import {OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources} from './model/OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources';
import {OpenApiv13adgroupcreateAudienceRuleExclusionsFilter} from './model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilter';
import {OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters} from './model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters';
import {OpenApiv13adgroupcreateAudienceRuleExclusionsRules} from './model/OpenApiv13adgroupcreateAudienceRuleExclusionsRules';
import {OpenApiv13adgroupcreateAudienceRuleInclusions} from './model/OpenApiv13adgroupcreateAudienceRuleInclusions';
import {OpenApiv13adgroupcreateAudienceRuleInclusionsRules} from './model/OpenApiv13adgroupcreateAudienceRuleInclusionsRules';
import {OpenApiv13adgroupcreateExcludedCustomActions} from './model/OpenApiv13adgroupcreateExcludedCustomActions';
import {OpenApiv13adgroupcreateIncludedCustomActions} from './model/OpenApiv13adgroupcreateIncludedCustomActions';
import {OpenApiv13adgroupcreateTargetingExpansion} from './model/OpenApiv13adgroupcreateTargetingExpansion';
import {OpenApiv13adgroupupdateAudienceRule} from './model/OpenApiv13adgroupupdateAudienceRule';
import {OpenApiv13adgroupupdateAudienceRuleExclusions} from './model/OpenApiv13adgroupupdateAudienceRuleExclusions';
import {OpenApiv13adupdateCreatives} from './model/OpenApiv13adupdateCreatives';
import {OpenApiv13advertiserupdateQualificationImages} from './model/OpenApiv13advertiserupdateQualificationImages';
import {OpenApiv13bcadvertisercreateAdvertiserInfo} from './model/OpenApiv13bcadvertisercreateAdvertiserInfo';
import {OpenApiv13bcadvertisercreateBillingGroupInfo} from './model/OpenApiv13bcadvertisercreateBillingGroupInfo';
import {OpenApiv13bcadvertisercreateBillingInfo} from './model/OpenApiv13bcadvertisercreateBillingInfo';
import {OpenApiv13bcadvertisercreateContactInfo} from './model/OpenApiv13bcadvertisercreateContactInfo';
import {OpenApiv13bcadvertisercreateCustomerInfo} from './model/OpenApiv13bcadvertisercreateCustomerInfo';
import {OpenApiv13bcadvertisercreateQualificationInfo} from './model/OpenApiv13bcadvertisercreateQualificationInfo';
import {OpenApiv13creativeportfoliocreateAdvancedAudioInfo} from './model/OpenApiv13creativeportfoliocreateAdvancedAudioInfo';
import {OpenApiv13creativeportfoliocreateAdvancedGestureIcon} from './model/OpenApiv13creativeportfoliocreateAdvancedGestureIcon';
import {OpenApiv13creativeportfoliocreateBadgeImageInfo} from './model/OpenApiv13creativeportfoliocreateBadgeImageInfo';
import {OpenApiv13creativeportfoliocreateBadgePosition} from './model/OpenApiv13creativeportfoliocreateBadgePosition';
import {OpenApiv13creativeportfoliocreatePortfolioContent} from './model/OpenApiv13creativeportfoliocreatePortfolioContent';
import {OpenApiv13creativeportfoliocreateStickerParam} from './model/OpenApiv13creativeportfoliocreateStickerParam';
import {OpenApiv13pixelbatchBatch} from './model/OpenApiv13pixelbatchBatch';
import {PixelBatchBody} from './model/PixelBatchBody';
import {PixelContent} from './model/PixelContent';
import {PixelContext} from './model/PixelContext';
import {PixelContextAd} from './model/PixelContextAd';
import {PixelContextPage} from './model/PixelContextPage';
import {PixelContextUser} from './model/PixelContextUser';
import {PixelProperties} from './model/PixelProperties';
import {PixelTrackBody} from './model/PixelTrackBody';
import {PortfolioCreateBody} from './model/PortfolioCreateBody';
import {TargetingCategoryRecommendBody} from './model/TargetingCategoryRecommendBody';
import {AccountApi} from './api/AccountApi';
import {AdApi} from './api/AdApi';
import {AdAcoApi} from './api/AdAcoApi';
import {AdgroupApi} from './api/AdgroupApi';
import {AudienceApi} from './api/AudienceApi';
import {AuthenticationApi} from './api/AuthenticationApi';
import {BCApi} from './api/BCApi';
import {BcPaymentApi} from './api/BcPaymentApi';
import {CampaignCreationApi} from './api/CampaignCreationApi';
import {CreativeAssetApi} from './api/CreativeAssetApi';
import {EventCallbackApi} from './api/EventCallbackApi';
import {FileApi} from './api/FileApi';
import {IdentityApi} from './api/IdentityApi';
import {MeasurementApi} from './api/MeasurementApi';
import {RecommendToolApi} from './api/RecommendToolApi';
import {ReportingApi} from './api/ReportingApi';
import {ToolApi} from './api/ToolApi';

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
* @version 0.1.1
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
     * The AdAcoUpdateBody model constructor.
     * @property {module:model/AdAcoUpdateBody}
     */
    AdAcoUpdateBody,

    /**
     * The AdCreateBody model constructor.
     * @property {module:model/AdCreateBody}
     */
    AdCreateBody,

    /**
     * The AdStatusUpdateBody model constructor.
     * @property {module:model/AdStatusUpdateBody}
     */
    AdStatusUpdateBody,

    /**
     * The AdUpdateBody model constructor.
     * @property {module:model/AdUpdateBody}
     */
    AdUpdateBody,

    /**
     * The AdUploadBody model constructor.
     * @property {module:model/AdUploadBody}
     */
    AdUploadBody,

    /**
     * The AdgroupCreateBody model constructor.
     * @property {module:model/AdgroupCreateBody}
     */
    AdgroupCreateBody,

    /**
     * The AdgroupStatusUpdateBody model constructor.
     * @property {module:model/AdgroupStatusUpdateBody}
     */
    AdgroupStatusUpdateBody,

    /**
     * The AdgroupUpdateBody model constructor.
     * @property {module:model/AdgroupUpdateBody}
     */
    AdgroupUpdateBody,

    /**
     * The AdvertiserCreateBody model constructor.
     * @property {module:model/AdvertiserCreateBody}
     */
    AdvertiserCreateBody,

    /**
     * The AdvertiserUpdateBody model constructor.
     * @property {module:model/AdvertiserUpdateBody}
     */
    AdvertiserUpdateBody,

    /**
     * The BcTransferBody model constructor.
     * @property {module:model/BcTransferBody}
     */
    BcTransferBody,

    /**
     * The CampaignCreateBody model constructor.
     * @property {module:model/CampaignCreateBody}
     */
    CampaignCreateBody,

    /**
     * The CampaignStatusUpdateBody model constructor.
     * @property {module:model/CampaignStatusUpdateBody}
     */
    CampaignStatusUpdateBody,

    /**
     * The CampaignUpdateBody model constructor.
     * @property {module:model/CampaignUpdateBody}
     */
    CampaignUpdateBody,

    /**
     * The FileImageAdUpload model constructor.
     * @property {module:model/FileImageAdUpload}
     */
    FileImageAdUpload,

    /**
     * The Filtering model constructor.
     * @property {module:model/Filtering}
     */
    Filtering,

    /**
     * The FilteringAdGet model constructor.
     * @property {module:model/FilteringAdGet}
     */
    FilteringAdGet,

    /**
     * The FilteringAdgroupGet model constructor.
     * @property {module:model/FilteringAdgroupGet}
     */
    FilteringAdgroupGet,

    /**
     * The FilteringAdvertiserBalanceGet model constructor.
     * @property {module:model/FilteringAdvertiserBalanceGet}
     */
    FilteringAdvertiserBalanceGet,

    /**
     * The FilteringAdvertiserTransactionGet model constructor.
     * @property {module:model/FilteringAdvertiserTransactionGet}
     */
    FilteringAdvertiserTransactionGet,

    /**
     * The FilteringBCTransactionGet model constructor.
     * @property {module:model/FilteringBCTransactionGet}
     */
    FilteringBCTransactionGet,

    /**
     * The FilteringCampaignGet model constructor.
     * @property {module:model/FilteringCampaignGet}
     */
    FilteringCampaignGet,

    /**
     * The FilteringReportIntegratedGet model constructor.
     * @property {module:model/FilteringReportIntegratedGet}
     */
    FilteringReportIntegratedGet,

    /**
     * The FilteringVideoAdSearch model constructor.
     * @property {module:model/FilteringVideoAdSearch}
     */
    FilteringVideoAdSearch,

    /**
     * The IdentityCreateBody model constructor.
     * @property {module:model/IdentityCreateBody}
     */
    IdentityCreateBody,

    /**
     * The ImageUploadBody model constructor.
     * @property {module:model/ImageUploadBody}
     */
    ImageUploadBody,

    /**
     * The InlineResponse200 model constructor.
     * @property {module:model/InlineResponse200}
     */
    InlineResponse200,

    /**
     * The MaterialStatusUpdateBody model constructor.
     * @property {module:model/MaterialStatusUpdateBody}
     */
    MaterialStatusUpdateBody,

    /**
     * The Oauth2AccessTokenBody model constructor.
     * @property {module:model/Oauth2AccessTokenBody}
     */
    Oauth2AccessTokenBody,

    /**
     * The OpenApiv13adcreateCreatives model constructor.
     * @property {module:model/OpenApiv13adcreateCreatives}
     */
    OpenApiv13adcreateCreatives,

    /**
     * The OpenApiv13adcreateDisclaimerClickableTexts model constructor.
     * @property {module:model/OpenApiv13adcreateDisclaimerClickableTexts}
     */
    OpenApiv13adcreateDisclaimerClickableTexts,

    /**
     * The OpenApiv13adcreateDisclaimerText model constructor.
     * @property {module:model/OpenApiv13adcreateDisclaimerText}
     */
    OpenApiv13adcreateDisclaimerText,

    /**
     * The OpenApiv13adgroupcreateActions model constructor.
     * @property {module:model/OpenApiv13adgroupcreateActions}
     */
    OpenApiv13adgroupcreateActions,

    /**
     * The OpenApiv13adgroupcreateAudienceRule model constructor.
     * @property {module:model/OpenApiv13adgroupcreateAudienceRule}
     */
    OpenApiv13adgroupcreateAudienceRule,

    /**
     * The OpenApiv13adgroupcreateAudienceRuleExclusions model constructor.
     * @property {module:model/OpenApiv13adgroupcreateAudienceRuleExclusions}
     */
    OpenApiv13adgroupcreateAudienceRuleExclusions,

    /**
     * The OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources model constructor.
     * @property {module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources}
     */
    OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources,

    /**
     * The OpenApiv13adgroupcreateAudienceRuleExclusionsFilter model constructor.
     * @property {module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilter}
     */
    OpenApiv13adgroupcreateAudienceRuleExclusionsFilter,

    /**
     * The OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters model constructor.
     * @property {module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters}
     */
    OpenApiv13adgroupcreateAudienceRuleExclusionsFilterFilters,

    /**
     * The OpenApiv13adgroupcreateAudienceRuleExclusionsRules model constructor.
     * @property {module:model/OpenApiv13adgroupcreateAudienceRuleExclusionsRules}
     */
    OpenApiv13adgroupcreateAudienceRuleExclusionsRules,

    /**
     * The OpenApiv13adgroupcreateAudienceRuleInclusions model constructor.
     * @property {module:model/OpenApiv13adgroupcreateAudienceRuleInclusions}
     */
    OpenApiv13adgroupcreateAudienceRuleInclusions,

    /**
     * The OpenApiv13adgroupcreateAudienceRuleInclusionsRules model constructor.
     * @property {module:model/OpenApiv13adgroupcreateAudienceRuleInclusionsRules}
     */
    OpenApiv13adgroupcreateAudienceRuleInclusionsRules,

    /**
     * The OpenApiv13adgroupcreateExcludedCustomActions model constructor.
     * @property {module:model/OpenApiv13adgroupcreateExcludedCustomActions}
     */
    OpenApiv13adgroupcreateExcludedCustomActions,

    /**
     * The OpenApiv13adgroupcreateIncludedCustomActions model constructor.
     * @property {module:model/OpenApiv13adgroupcreateIncludedCustomActions}
     */
    OpenApiv13adgroupcreateIncludedCustomActions,

    /**
     * The OpenApiv13adgroupcreateTargetingExpansion model constructor.
     * @property {module:model/OpenApiv13adgroupcreateTargetingExpansion}
     */
    OpenApiv13adgroupcreateTargetingExpansion,

    /**
     * The OpenApiv13adgroupupdateAudienceRule model constructor.
     * @property {module:model/OpenApiv13adgroupupdateAudienceRule}
     */
    OpenApiv13adgroupupdateAudienceRule,

    /**
     * The OpenApiv13adgroupupdateAudienceRuleExclusions model constructor.
     * @property {module:model/OpenApiv13adgroupupdateAudienceRuleExclusions}
     */
    OpenApiv13adgroupupdateAudienceRuleExclusions,

    /**
     * The OpenApiv13adupdateCreatives model constructor.
     * @property {module:model/OpenApiv13adupdateCreatives}
     */
    OpenApiv13adupdateCreatives,

    /**
     * The OpenApiv13advertiserupdateQualificationImages model constructor.
     * @property {module:model/OpenApiv13advertiserupdateQualificationImages}
     */
    OpenApiv13advertiserupdateQualificationImages,

    /**
     * The OpenApiv13bcadvertisercreateAdvertiserInfo model constructor.
     * @property {module:model/OpenApiv13bcadvertisercreateAdvertiserInfo}
     */
    OpenApiv13bcadvertisercreateAdvertiserInfo,

    /**
     * The OpenApiv13bcadvertisercreateBillingGroupInfo model constructor.
     * @property {module:model/OpenApiv13bcadvertisercreateBillingGroupInfo}
     */
    OpenApiv13bcadvertisercreateBillingGroupInfo,

    /**
     * The OpenApiv13bcadvertisercreateBillingInfo model constructor.
     * @property {module:model/OpenApiv13bcadvertisercreateBillingInfo}
     */
    OpenApiv13bcadvertisercreateBillingInfo,

    /**
     * The OpenApiv13bcadvertisercreateContactInfo model constructor.
     * @property {module:model/OpenApiv13bcadvertisercreateContactInfo}
     */
    OpenApiv13bcadvertisercreateContactInfo,

    /**
     * The OpenApiv13bcadvertisercreateCustomerInfo model constructor.
     * @property {module:model/OpenApiv13bcadvertisercreateCustomerInfo}
     */
    OpenApiv13bcadvertisercreateCustomerInfo,

    /**
     * The OpenApiv13bcadvertisercreateQualificationInfo model constructor.
     * @property {module:model/OpenApiv13bcadvertisercreateQualificationInfo}
     */
    OpenApiv13bcadvertisercreateQualificationInfo,

    /**
     * The OpenApiv13creativeportfoliocreateAdvancedAudioInfo model constructor.
     * @property {module:model/OpenApiv13creativeportfoliocreateAdvancedAudioInfo}
     */
    OpenApiv13creativeportfoliocreateAdvancedAudioInfo,

    /**
     * The OpenApiv13creativeportfoliocreateAdvancedGestureIcon model constructor.
     * @property {module:model/OpenApiv13creativeportfoliocreateAdvancedGestureIcon}
     */
    OpenApiv13creativeportfoliocreateAdvancedGestureIcon,

    /**
     * The OpenApiv13creativeportfoliocreateBadgeImageInfo model constructor.
     * @property {module:model/OpenApiv13creativeportfoliocreateBadgeImageInfo}
     */
    OpenApiv13creativeportfoliocreateBadgeImageInfo,

    /**
     * The OpenApiv13creativeportfoliocreateBadgePosition model constructor.
     * @property {module:model/OpenApiv13creativeportfoliocreateBadgePosition}
     */
    OpenApiv13creativeportfoliocreateBadgePosition,

    /**
     * The OpenApiv13creativeportfoliocreatePortfolioContent model constructor.
     * @property {module:model/OpenApiv13creativeportfoliocreatePortfolioContent}
     */
    OpenApiv13creativeportfoliocreatePortfolioContent,

    /**
     * The OpenApiv13creativeportfoliocreateStickerParam model constructor.
     * @property {module:model/OpenApiv13creativeportfoliocreateStickerParam}
     */
    OpenApiv13creativeportfoliocreateStickerParam,

    /**
     * The OpenApiv13pixelbatchBatch model constructor.
     * @property {module:model/OpenApiv13pixelbatchBatch}
     */
    OpenApiv13pixelbatchBatch,

    /**
     * The PixelBatchBody model constructor.
     * @property {module:model/PixelBatchBody}
     */
    PixelBatchBody,

    /**
     * The PixelContent model constructor.
     * @property {module:model/PixelContent}
     */
    PixelContent,

    /**
     * The PixelContext model constructor.
     * @property {module:model/PixelContext}
     */
    PixelContext,

    /**
     * The PixelContextAd model constructor.
     * @property {module:model/PixelContextAd}
     */
    PixelContextAd,

    /**
     * The PixelContextPage model constructor.
     * @property {module:model/PixelContextPage}
     */
    PixelContextPage,

    /**
     * The PixelContextUser model constructor.
     * @property {module:model/PixelContextUser}
     */
    PixelContextUser,

    /**
     * The PixelProperties model constructor.
     * @property {module:model/PixelProperties}
     */
    PixelProperties,

    /**
     * The PixelTrackBody model constructor.
     * @property {module:model/PixelTrackBody}
     */
    PixelTrackBody,

    /**
     * The PortfolioCreateBody model constructor.
     * @property {module:model/PortfolioCreateBody}
     */
    PortfolioCreateBody,

    /**
     * The TargetingCategoryRecommendBody model constructor.
     * @property {module:model/TargetingCategoryRecommendBody}
     */
    TargetingCategoryRecommendBody,

    /**
    * The AccountApi service constructor.
    * @property {module:api/AccountApi}
    */
    AccountApi,

    /**
    * The AdApi service constructor.
    * @property {module:api/AdApi}
    */
    AdApi,

    /**
    * The AdAcoApi service constructor.
    * @property {module:api/AdAcoApi}
    */
    AdAcoApi,

    /**
    * The AdgroupApi service constructor.
    * @property {module:api/AdgroupApi}
    */
    AdgroupApi,

    /**
    * The AudienceApi service constructor.
    * @property {module:api/AudienceApi}
    */
    AudienceApi,

    /**
    * The AuthenticationApi service constructor.
    * @property {module:api/AuthenticationApi}
    */
    AuthenticationApi,

    /**
    * The BCApi service constructor.
    * @property {module:api/BCApi}
    */
    BCApi,

    /**
    * The BcPaymentApi service constructor.
    * @property {module:api/BcPaymentApi}
    */
    BcPaymentApi,

    /**
    * The CampaignCreationApi service constructor.
    * @property {module:api/CampaignCreationApi}
    */
    CampaignCreationApi,

    /**
    * The CreativeAssetApi service constructor.
    * @property {module:api/CreativeAssetApi}
    */
    CreativeAssetApi,

    /**
    * The EventCallbackApi service constructor.
    * @property {module:api/EventCallbackApi}
    */
    EventCallbackApi,

    /**
    * The FileApi service constructor.
    * @property {module:api/FileApi}
    */
    FileApi,

    /**
    * The IdentityApi service constructor.
    * @property {module:api/IdentityApi}
    */
    IdentityApi,

    /**
    * The MeasurementApi service constructor.
    * @property {module:api/MeasurementApi}
    */
    MeasurementApi,

    /**
    * The RecommendToolApi service constructor.
    * @property {module:api/RecommendToolApi}
    */
    RecommendToolApi,

    /**
    * The ReportingApi service constructor.
    * @property {module:api/ReportingApi}
    */
    ReportingApi,

    /**
    * The ToolApi service constructor.
    * @property {module:api/ToolApi}
    */
    ToolApi
};
