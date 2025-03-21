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
import {AdAcoUpdateBody} from './model/AdAcoUpdateBody.js';
import {AdCreateBody} from './model/AdCreateBody.js';
import {AdStatusUpdateBody} from './model/AdStatusUpdateBody.js';
import {AdUpdateBody} from './model/AdUpdateBody.js';
import {AdUploadBody} from './model/AdUploadBody.js';
import {AdcreateCreatives} from './model/AdcreateCreatives.js';
import {AdcreateDisclaimerClickableTexts} from './model/AdcreateDisclaimerClickableTexts.js';
import {AdcreateDisclaimerText} from './model/AdcreateDisclaimerText.js';
import {AdgroupCreateBody} from './model/AdgroupCreateBody.js';
import {AdgroupStatusUpdateBody} from './model/AdgroupStatusUpdateBody.js';
import {AdgroupUpdateBody} from './model/AdgroupUpdateBody.js';
import {AdgroupcreateActions} from './model/AdgroupcreateActions.js';
import {AdgroupcreateAudienceRule} from './model/AdgroupcreateAudienceRule.js';
import {AdgroupcreateAudienceRuleExclusions} from './model/AdgroupcreateAudienceRuleExclusions.js';
import {AdgroupcreateAudienceRuleExclusionsEventSources} from './model/AdgroupcreateAudienceRuleExclusionsEventSources.js';
import {AdgroupcreateAudienceRuleExclusionsFilter} from './model/AdgroupcreateAudienceRuleExclusionsFilter.js';
import {AdgroupcreateAudienceRuleExclusionsFilterFilters} from './model/AdgroupcreateAudienceRuleExclusionsFilterFilters.js';
import {AdgroupcreateAudienceRuleExclusionsRules} from './model/AdgroupcreateAudienceRuleExclusionsRules.js';
import {AdgroupcreateAudienceRuleInclusions} from './model/AdgroupcreateAudienceRuleInclusions.js';
import {AdgroupcreateExcludedCustomActions} from './model/AdgroupcreateExcludedCustomActions.js';
import {AdgroupcreateIncludedCustomActions} from './model/AdgroupcreateIncludedCustomActions.js';
import {AdgroupcreateTargetingExpansion} from './model/AdgroupcreateTargetingExpansion.js';
import {AdminDeleteBody} from './model/AdminDeleteBody.js';
import {AdupdateCreatives} from './model/AdupdateCreatives.js';
import {AdvertiserCreateBody} from './model/AdvertiserCreateBody.js';
import {AdvertiserUpdateBody} from './model/AdvertiserUpdateBody.js';
import {AdvertiserupdateAdvertiserBudgets} from './model/AdvertiserupdateAdvertiserBudgets.js';
import {AdvertiserupdateQualificationImages} from './model/AdvertiserupdateQualificationImages.js';
import {AppCreateBody} from './model/AppCreateBody.js';
import {AppUpdateBody} from './model/AppUpdateBody.js';
import {AppcreateTrackingUrl} from './model/AppcreateTrackingUrl.js';
import {AppupdateTrackingUrl} from './model/AppupdateTrackingUrl.js';
import {AssetAssignBody} from './model/AssetAssignBody.js';
import {AssetDeleteBody} from './model/AssetDeleteBody.js';
import {AssetGroupCreateBody} from './model/AssetGroupCreateBody.js';
import {AssetGroupDeleteBody} from './model/AssetGroupDeleteBody.js';
import {AssetGroupUpdateBody} from './model/AssetGroupUpdateBody.js';
import {AssetUnassignBody} from './model/AssetUnassignBody.js';
import {BcTransferBody} from './model/BcTransferBody.js';
import {BcadvertisercreateAdvertiserInfo} from './model/BcadvertisercreateAdvertiserInfo.js';
import {BcadvertisercreateBillingGroupInfo} from './model/BcadvertisercreateBillingGroupInfo.js';
import {BcadvertisercreateBillingInfo} from './model/BcadvertisercreateBillingInfo.js';
import {BcadvertisercreateContactInfo} from './model/BcadvertisercreateContactInfo.js';
import {BcadvertisercreateCustomerInfo} from './model/BcadvertisercreateCustomerInfo.js';
import {BcadvertisercreateQualificationInfo} from './model/BcadvertisercreateQualificationInfo.js';
import {BcassetGroupcreateAssets} from './model/BcassetGroupcreateAssets.js';
import {BcassetGroupcreateMembers} from './model/BcassetGroupcreateMembers.js';
import {BcmemberinviteExtUserRole} from './model/BcmemberinviteExtUserRole.js';
import {BidRecommendBody} from './model/BidRecommendBody.js';
import {BillingGroupCreateBody} from './model/BillingGroupCreateBody.js';
import {BillingGroupUpdateBody} from './model/BillingGroupUpdateBody.js';
import {CampaignCreateBody} from './model/CampaignCreateBody.js';
import {CampaignStatusUpdateBody} from './model/CampaignStatusUpdateBody.js';
import {CampaignUpdateBody} from './model/CampaignUpdateBody.js';
import {CatalogCapitalizeBody} from './model/CatalogCapitalizeBody.js';
import {CatalogCreateBody} from './model/CatalogCreateBody.js';
import {CatalogDeleteBody} from './model/CatalogDeleteBody.js';
import {CatalogUpdateBody} from './model/CatalogUpdateBody.js';
import {CatalogcreateCatalogConf} from './model/CatalogcreateCatalogConf.js';
import {CreativeportfoliocreateAdvancedAudioInfo} from './model/CreativeportfoliocreateAdvancedAudioInfo.js';
import {CreativeportfoliocreateAdvancedGestureIcon} from './model/CreativeportfoliocreateAdvancedGestureIcon.js';
import {CreativeportfoliocreateBadgeImageInfo} from './model/CreativeportfoliocreateBadgeImageInfo.js';
import {CreativeportfoliocreateBadgePosition} from './model/CreativeportfoliocreateBadgePosition.js';
import {CreativeportfoliocreatePortfolioContent} from './model/CreativeportfoliocreatePortfolioContent.js';
import {CreativeportfoliocreateStickerParam} from './model/CreativeportfoliocreateStickerParam.js';
import {CustomAudienceApplyBody} from './model/CustomAudienceApplyBody.js';
import {CustomAudienceCreateBody} from './model/CustomAudienceCreateBody.js';
import {CustomAudienceDeleteBody} from './model/CustomAudienceDeleteBody.js';
import {CustomAudienceShareBody} from './model/CustomAudienceShareBody.js';
import {CustomAudienceUpdateBody} from './model/CustomAudienceUpdateBody.js';
import {DmpcustomAudienceapplyContextInfo} from './model/DmpcustomAudienceapplyContextInfo.js';
import {DmpcustomAudiencefileuploadContextInfo} from './model/DmpcustomAudiencefileuploadContextInfo.js';
import {DmpcustomAudiencelookalikecreateContextInfo} from './model/DmpcustomAudiencelookalikecreateContextInfo.js';
import {DmpcustomAudiencelookalikecreateLookalikeSpec} from './model/DmpcustomAudiencelookalikecreateLookalikeSpec.js';
import {DmpcustomAudiencerulecreateRuleSpec} from './model/DmpcustomAudiencerulecreateRuleSpec.js';
import {DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet} from './model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet.js';
import {DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet} from './model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet.js';
import {DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters} from './model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters.js';
import {DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters} from './model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters.js';
import {DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules} from './model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules.js';
import {DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet} from './model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet.js';
import {DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet} from './model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet.js';
import {DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters} from './model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters.js';
import {DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters} from './model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters.js';
import {DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules} from './model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules.js';
import {DmpsavedAudiencecreateActions} from './model/DmpsavedAudiencecreateActions.js';
import {EventsourceBindBody} from './model/EventsourceBindBody.js';
import {EventsourceUnbindBody} from './model/EventsourceUnbindBody.js';
import {FeedDeleteBody} from './model/FeedDeleteBody.js';
import {FileImageAdUpload} from './model/FileImageAdUpload.js';
import {FileUploadBody} from './model/FileUploadBody.js';
import {FilteringAdGet} from './model/FilteringAdGet.js';
import {FilteringAdgroupGet} from './model/FilteringAdgroupGet.js';
import {FilteringAdvertiserBalanceGet} from './model/FilteringAdvertiserBalanceGet.js';
import {FilteringAdvertiserTransactionGet} from './model/FilteringAdvertiserTransactionGet.js';
import {FilteringBcAccountTransactionGet} from './model/FilteringBcAccountTransactionGet.js';
import {FilteringBcAssetAdminGet} from './model/FilteringBcAssetAdminGet.js';
import {FilteringBcAssetGet} from './model/FilteringBcAssetGet.js';
import {FilteringBcAssetGroupGet} from './model/FilteringBcAssetGroupGet.js';
import {FilteringBcAssetGroupList} from './model/FilteringBcAssetGroupList.js';
import {FilteringBcAssetMemberGet} from './model/FilteringBcAssetMemberGet.js';
import {FilteringBcBillingGroupGet} from './model/FilteringBcBillingGroupGet.js';
import {FilteringBcGet} from './model/FilteringBcGet.js';
import {FilteringBcMemberGet} from './model/FilteringBcMemberGet.js';
import {FilteringBcPartnerAssetGet} from './model/FilteringBcPartnerAssetGet.js';
import {FilteringBcPartnerGet} from './model/FilteringBcPartnerGet.js';
import {FilteringBcTransactionGet} from './model/FilteringBcTransactionGet.js';
import {FilteringCampaignGet} from './model/FilteringCampaignGet.js';
import {FilteringReportIntegratedGet} from './model/FilteringReportIntegratedGet.js';
import {FilteringVideoAdSearch} from './model/FilteringVideoAdSearch.js';
import {IdentityCreateBody} from './model/IdentityCreateBody.js';
import {ImageUploadBody} from './model/ImageUploadBody.js';
import {InlineResponse200} from './model/InlineResponse200.js';
import {LinkUpdateBody} from './model/LinkUpdateBody.js';
import {LookalikeCreateBody} from './model/LookalikeCreateBody.js';
import {LookalikeUpdateBody} from './model/LookalikeUpdateBody.js';
import {MaterialStatusUpdateBody} from './model/MaterialStatusUpdateBody.js';
import {MemberDeleteBody} from './model/MemberDeleteBody.js';
import {MemberInviteBody} from './model/MemberInviteBody.js';
import {MemberUpdateBody} from './model/MemberUpdateBody.js';
import {Oauth2AccessTokenBody} from './model/Oauth2AccessTokenBody.js';
import {PangleBlockListUpdateBody} from './model/PangleBlockListUpdateBody.js';
import {PartnerAddBody} from './model/PartnerAddBody.js';
import {PartnerDeleteBody} from './model/PartnerDeleteBody.js';
import {PixelBatchBody} from './model/PixelBatchBody.js';
import {PixelContent} from './model/PixelContent.js';
import {PixelContext} from './model/PixelContext.js';
import {PixelContextAd} from './model/PixelContextAd.js';
import {PixelContextPage} from './model/PixelContextPage.js';
import {PixelContextUser} from './model/PixelContextUser.js';
import {PixelProperties} from './model/PixelProperties.js';
import {PixelTrackBody} from './model/PixelTrackBody.js';
import {PixelTransferBody} from './model/PixelTransferBody.js';
import {PixelbatchBatch} from './model/PixelbatchBatch.js';
import {PortfolioCreateBody} from './model/PortfolioCreateBody.js';
import {ProductDeleteBody} from './model/ProductDeleteBody.js';
import {ProductFileBody} from './model/ProductFileBody.js';
import {ReporttaskcreateFiltering} from './model/ReporttaskcreateFiltering.js';
import {RuleCreateBody} from './model/RuleCreateBody.js';
import {SavedAudienceCreateBody} from './model/SavedAudienceCreateBody.js';
import {SavedAudienceDeleteBody} from './model/SavedAudienceDeleteBody.js';
import {ShareCancelBody} from './model/ShareCancelBody.js';
import {TargetingCategoryRecommendBody} from './model/TargetingCategoryRecommendBody.js';
import {TargetingInfoBody} from './model/TargetingInfoBody.js';
import {TargetingSearchBody} from './model/TargetingSearchBody.js';
import {TaskCancelBody} from './model/TaskCancelBody.js';
import {TaskCreateBody} from './model/TaskCreateBody.js';
import {TermConfirmBody} from './model/TermConfirmBody.js';
import {APPManagementApi} from './api/APPManagementApi.js';
import {AccountManagementApi} from './api/AccountManagementApi.js';
import {AdApi} from './api/AdApi.js';
import {AdAcoApi} from './api/AdAcoApi.js';
import {AdgroupApi} from './api/AdgroupApi.js';
import {AudienceApi} from './api/AudienceApi.js';
import {AuthenticationApi} from './api/AuthenticationApi.js';
import {BCApi} from './api/BCApi.js';
import {CampaignCreationApi} from './api/CampaignCreationApi.js';
import {CatalogApi} from './api/CatalogApi.js';
import {CreativeAssetApi} from './api/CreativeAssetApi.js';
import {EventCallbackApi} from './api/EventCallbackApi.js';
import {FileApi} from './api/FileApi.js';
import {IdentityApi} from './api/IdentityApi.js';
import {RecommendToolApi} from './api/RecommendToolApi.js';
import {ReportingApi} from './api/ReportingApi.js';
import {ToolApi} from './api/ToolApi.js';

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
* @version 0.1.5
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
     * The AdcreateCreatives model constructor.
     * @property {module:model/AdcreateCreatives}
     */
    AdcreateCreatives,

    /**
     * The AdcreateDisclaimerClickableTexts model constructor.
     * @property {module:model/AdcreateDisclaimerClickableTexts}
     */
    AdcreateDisclaimerClickableTexts,

    /**
     * The AdcreateDisclaimerText model constructor.
     * @property {module:model/AdcreateDisclaimerText}
     */
    AdcreateDisclaimerText,

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
     * The AdgroupcreateActions model constructor.
     * @property {module:model/AdgroupcreateActions}
     */
    AdgroupcreateActions,

    /**
     * The AdgroupcreateAudienceRule model constructor.
     * @property {module:model/AdgroupcreateAudienceRule}
     */
    AdgroupcreateAudienceRule,

    /**
     * The AdgroupcreateAudienceRuleExclusions model constructor.
     * @property {module:model/AdgroupcreateAudienceRuleExclusions}
     */
    AdgroupcreateAudienceRuleExclusions,

    /**
     * The AdgroupcreateAudienceRuleExclusionsEventSources model constructor.
     * @property {module:model/AdgroupcreateAudienceRuleExclusionsEventSources}
     */
    AdgroupcreateAudienceRuleExclusionsEventSources,

    /**
     * The AdgroupcreateAudienceRuleExclusionsFilter model constructor.
     * @property {module:model/AdgroupcreateAudienceRuleExclusionsFilter}
     */
    AdgroupcreateAudienceRuleExclusionsFilter,

    /**
     * The AdgroupcreateAudienceRuleExclusionsFilterFilters model constructor.
     * @property {module:model/AdgroupcreateAudienceRuleExclusionsFilterFilters}
     */
    AdgroupcreateAudienceRuleExclusionsFilterFilters,

    /**
     * The AdgroupcreateAudienceRuleExclusionsRules model constructor.
     * @property {module:model/AdgroupcreateAudienceRuleExclusionsRules}
     */
    AdgroupcreateAudienceRuleExclusionsRules,

    /**
     * The AdgroupcreateAudienceRuleInclusions model constructor.
     * @property {module:model/AdgroupcreateAudienceRuleInclusions}
     */
    AdgroupcreateAudienceRuleInclusions,

    /**
     * The AdgroupcreateExcludedCustomActions model constructor.
     * @property {module:model/AdgroupcreateExcludedCustomActions}
     */
    AdgroupcreateExcludedCustomActions,

    /**
     * The AdgroupcreateIncludedCustomActions model constructor.
     * @property {module:model/AdgroupcreateIncludedCustomActions}
     */
    AdgroupcreateIncludedCustomActions,

    /**
     * The AdgroupcreateTargetingExpansion model constructor.
     * @property {module:model/AdgroupcreateTargetingExpansion}
     */
    AdgroupcreateTargetingExpansion,

    /**
     * The AdminDeleteBody model constructor.
     * @property {module:model/AdminDeleteBody}
     */
    AdminDeleteBody,

    /**
     * The AdupdateCreatives model constructor.
     * @property {module:model/AdupdateCreatives}
     */
    AdupdateCreatives,

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
     * The AdvertiserupdateAdvertiserBudgets model constructor.
     * @property {module:model/AdvertiserupdateAdvertiserBudgets}
     */
    AdvertiserupdateAdvertiserBudgets,

    /**
     * The AdvertiserupdateQualificationImages model constructor.
     * @property {module:model/AdvertiserupdateQualificationImages}
     */
    AdvertiserupdateQualificationImages,

    /**
     * The AppCreateBody model constructor.
     * @property {module:model/AppCreateBody}
     */
    AppCreateBody,

    /**
     * The AppUpdateBody model constructor.
     * @property {module:model/AppUpdateBody}
     */
    AppUpdateBody,

    /**
     * The AppcreateTrackingUrl model constructor.
     * @property {module:model/AppcreateTrackingUrl}
     */
    AppcreateTrackingUrl,

    /**
     * The AppupdateTrackingUrl model constructor.
     * @property {module:model/AppupdateTrackingUrl}
     */
    AppupdateTrackingUrl,

    /**
     * The AssetAssignBody model constructor.
     * @property {module:model/AssetAssignBody}
     */
    AssetAssignBody,

    /**
     * The AssetDeleteBody model constructor.
     * @property {module:model/AssetDeleteBody}
     */
    AssetDeleteBody,

    /**
     * The AssetGroupCreateBody model constructor.
     * @property {module:model/AssetGroupCreateBody}
     */
    AssetGroupCreateBody,

    /**
     * The AssetGroupDeleteBody model constructor.
     * @property {module:model/AssetGroupDeleteBody}
     */
    AssetGroupDeleteBody,

    /**
     * The AssetGroupUpdateBody model constructor.
     * @property {module:model/AssetGroupUpdateBody}
     */
    AssetGroupUpdateBody,

    /**
     * The AssetUnassignBody model constructor.
     * @property {module:model/AssetUnassignBody}
     */
    AssetUnassignBody,

    /**
     * The BcTransferBody model constructor.
     * @property {module:model/BcTransferBody}
     */
    BcTransferBody,

    /**
     * The BcadvertisercreateAdvertiserInfo model constructor.
     * @property {module:model/BcadvertisercreateAdvertiserInfo}
     */
    BcadvertisercreateAdvertiserInfo,

    /**
     * The BcadvertisercreateBillingGroupInfo model constructor.
     * @property {module:model/BcadvertisercreateBillingGroupInfo}
     */
    BcadvertisercreateBillingGroupInfo,

    /**
     * The BcadvertisercreateBillingInfo model constructor.
     * @property {module:model/BcadvertisercreateBillingInfo}
     */
    BcadvertisercreateBillingInfo,

    /**
     * The BcadvertisercreateContactInfo model constructor.
     * @property {module:model/BcadvertisercreateContactInfo}
     */
    BcadvertisercreateContactInfo,

    /**
     * The BcadvertisercreateCustomerInfo model constructor.
     * @property {module:model/BcadvertisercreateCustomerInfo}
     */
    BcadvertisercreateCustomerInfo,

    /**
     * The BcadvertisercreateQualificationInfo model constructor.
     * @property {module:model/BcadvertisercreateQualificationInfo}
     */
    BcadvertisercreateQualificationInfo,

    /**
     * The BcassetGroupcreateAssets model constructor.
     * @property {module:model/BcassetGroupcreateAssets}
     */
    BcassetGroupcreateAssets,

    /**
     * The BcassetGroupcreateMembers model constructor.
     * @property {module:model/BcassetGroupcreateMembers}
     */
    BcassetGroupcreateMembers,

    /**
     * The BcmemberinviteExtUserRole model constructor.
     * @property {module:model/BcmemberinviteExtUserRole}
     */
    BcmemberinviteExtUserRole,

    /**
     * The BidRecommendBody model constructor.
     * @property {module:model/BidRecommendBody}
     */
    BidRecommendBody,

    /**
     * The BillingGroupCreateBody model constructor.
     * @property {module:model/BillingGroupCreateBody}
     */
    BillingGroupCreateBody,

    /**
     * The BillingGroupUpdateBody model constructor.
     * @property {module:model/BillingGroupUpdateBody}
     */
    BillingGroupUpdateBody,

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
     * The CatalogcreateCatalogConf model constructor.
     * @property {module:model/CatalogcreateCatalogConf}
     */
    CatalogcreateCatalogConf,

    /**
     * The CreativeportfoliocreateAdvancedAudioInfo model constructor.
     * @property {module:model/CreativeportfoliocreateAdvancedAudioInfo}
     */
    CreativeportfoliocreateAdvancedAudioInfo,

    /**
     * The CreativeportfoliocreateAdvancedGestureIcon model constructor.
     * @property {module:model/CreativeportfoliocreateAdvancedGestureIcon}
     */
    CreativeportfoliocreateAdvancedGestureIcon,

    /**
     * The CreativeportfoliocreateBadgeImageInfo model constructor.
     * @property {module:model/CreativeportfoliocreateBadgeImageInfo}
     */
    CreativeportfoliocreateBadgeImageInfo,

    /**
     * The CreativeportfoliocreateBadgePosition model constructor.
     * @property {module:model/CreativeportfoliocreateBadgePosition}
     */
    CreativeportfoliocreateBadgePosition,

    /**
     * The CreativeportfoliocreatePortfolioContent model constructor.
     * @property {module:model/CreativeportfoliocreatePortfolioContent}
     */
    CreativeportfoliocreatePortfolioContent,

    /**
     * The CreativeportfoliocreateStickerParam model constructor.
     * @property {module:model/CreativeportfoliocreateStickerParam}
     */
    CreativeportfoliocreateStickerParam,

    /**
     * The CustomAudienceApplyBody model constructor.
     * @property {module:model/CustomAudienceApplyBody}
     */
    CustomAudienceApplyBody,

    /**
     * The CustomAudienceCreateBody model constructor.
     * @property {module:model/CustomAudienceCreateBody}
     */
    CustomAudienceCreateBody,

    /**
     * The CustomAudienceDeleteBody model constructor.
     * @property {module:model/CustomAudienceDeleteBody}
     */
    CustomAudienceDeleteBody,

    /**
     * The CustomAudienceShareBody model constructor.
     * @property {module:model/CustomAudienceShareBody}
     */
    CustomAudienceShareBody,

    /**
     * The CustomAudienceUpdateBody model constructor.
     * @property {module:model/CustomAudienceUpdateBody}
     */
    CustomAudienceUpdateBody,

    /**
     * The DmpcustomAudienceapplyContextInfo model constructor.
     * @property {module:model/DmpcustomAudienceapplyContextInfo}
     */
    DmpcustomAudienceapplyContextInfo,

    /**
     * The DmpcustomAudiencefileuploadContextInfo model constructor.
     * @property {module:model/DmpcustomAudiencefileuploadContextInfo}
     */
    DmpcustomAudiencefileuploadContextInfo,

    /**
     * The DmpcustomAudiencelookalikecreateContextInfo model constructor.
     * @property {module:model/DmpcustomAudiencelookalikecreateContextInfo}
     */
    DmpcustomAudiencelookalikecreateContextInfo,

    /**
     * The DmpcustomAudiencelookalikecreateLookalikeSpec model constructor.
     * @property {module:model/DmpcustomAudiencelookalikecreateLookalikeSpec}
     */
    DmpcustomAudiencelookalikecreateLookalikeSpec,

    /**
     * The DmpcustomAudiencerulecreateRuleSpec model constructor.
     * @property {module:model/DmpcustomAudiencerulecreateRuleSpec}
     */
    DmpcustomAudiencerulecreateRuleSpec,

    /**
     * The DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet model constructor.
     * @property {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet}
     */
    DmpcustomAudiencerulecreateRuleSpecExclusionRuleSet,

    /**
     * The DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet model constructor.
     * @property {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet}
     */
    DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSet,

    /**
     * The DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters model constructor.
     * @property {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters}
     */
    DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetFilters,

    /**
     * The DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters model constructor.
     * @property {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters}
     */
    DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetFilterSetParameterFilters,

    /**
     * The DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules model constructor.
     * @property {module:model/DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules}
     */
    DmpcustomAudiencerulecreateRuleSpecExclusionRuleSetRules,

    /**
     * The DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet model constructor.
     * @property {module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet}
     */
    DmpcustomAudiencerulecreateRuleSpecInclusionRuleSet,

    /**
     * The DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet model constructor.
     * @property {module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet}
     */
    DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet,

    /**
     * The DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters model constructor.
     * @property {module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters}
     */
    DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetFilters,

    /**
     * The DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters model constructor.
     * @property {module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters}
     */
    DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSetParameterFilters,

    /**
     * The DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules model constructor.
     * @property {module:model/DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules}
     */
    DmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules,

    /**
     * The DmpsavedAudiencecreateActions model constructor.
     * @property {module:model/DmpsavedAudiencecreateActions}
     */
    DmpsavedAudiencecreateActions,

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
     * The FileImageAdUpload model constructor.
     * @property {module:model/FileImageAdUpload}
     */
    FileImageAdUpload,

    /**
     * The FileUploadBody model constructor.
     * @property {module:model/FileUploadBody}
     */
    FileUploadBody,

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
     * The FilteringBcAccountTransactionGet model constructor.
     * @property {module:model/FilteringBcAccountTransactionGet}
     */
    FilteringBcAccountTransactionGet,

    /**
     * The FilteringBcAssetAdminGet model constructor.
     * @property {module:model/FilteringBcAssetAdminGet}
     */
    FilteringBcAssetAdminGet,

    /**
     * The FilteringBcAssetGet model constructor.
     * @property {module:model/FilteringBcAssetGet}
     */
    FilteringBcAssetGet,

    /**
     * The FilteringBcAssetGroupGet model constructor.
     * @property {module:model/FilteringBcAssetGroupGet}
     */
    FilteringBcAssetGroupGet,

    /**
     * The FilteringBcAssetGroupList model constructor.
     * @property {module:model/FilteringBcAssetGroupList}
     */
    FilteringBcAssetGroupList,

    /**
     * The FilteringBcAssetMemberGet model constructor.
     * @property {module:model/FilteringBcAssetMemberGet}
     */
    FilteringBcAssetMemberGet,

    /**
     * The FilteringBcBillingGroupGet model constructor.
     * @property {module:model/FilteringBcBillingGroupGet}
     */
    FilteringBcBillingGroupGet,

    /**
     * The FilteringBcGet model constructor.
     * @property {module:model/FilteringBcGet}
     */
    FilteringBcGet,

    /**
     * The FilteringBcMemberGet model constructor.
     * @property {module:model/FilteringBcMemberGet}
     */
    FilteringBcMemberGet,

    /**
     * The FilteringBcPartnerAssetGet model constructor.
     * @property {module:model/FilteringBcPartnerAssetGet}
     */
    FilteringBcPartnerAssetGet,

    /**
     * The FilteringBcPartnerGet model constructor.
     * @property {module:model/FilteringBcPartnerGet}
     */
    FilteringBcPartnerGet,

    /**
     * The FilteringBcTransactionGet model constructor.
     * @property {module:model/FilteringBcTransactionGet}
     */
    FilteringBcTransactionGet,

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
     * The LinkUpdateBody model constructor.
     * @property {module:model/LinkUpdateBody}
     */
    LinkUpdateBody,

    /**
     * The LookalikeCreateBody model constructor.
     * @property {module:model/LookalikeCreateBody}
     */
    LookalikeCreateBody,

    /**
     * The LookalikeUpdateBody model constructor.
     * @property {module:model/LookalikeUpdateBody}
     */
    LookalikeUpdateBody,

    /**
     * The MaterialStatusUpdateBody model constructor.
     * @property {module:model/MaterialStatusUpdateBody}
     */
    MaterialStatusUpdateBody,

    /**
     * The MemberDeleteBody model constructor.
     * @property {module:model/MemberDeleteBody}
     */
    MemberDeleteBody,

    /**
     * The MemberInviteBody model constructor.
     * @property {module:model/MemberInviteBody}
     */
    MemberInviteBody,

    /**
     * The MemberUpdateBody model constructor.
     * @property {module:model/MemberUpdateBody}
     */
    MemberUpdateBody,

    /**
     * The Oauth2AccessTokenBody model constructor.
     * @property {module:model/Oauth2AccessTokenBody}
     */
    Oauth2AccessTokenBody,

    /**
     * The PangleBlockListUpdateBody model constructor.
     * @property {module:model/PangleBlockListUpdateBody}
     */
    PangleBlockListUpdateBody,

    /**
     * The PartnerAddBody model constructor.
     * @property {module:model/PartnerAddBody}
     */
    PartnerAddBody,

    /**
     * The PartnerDeleteBody model constructor.
     * @property {module:model/PartnerDeleteBody}
     */
    PartnerDeleteBody,

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
     * The PixelTransferBody model constructor.
     * @property {module:model/PixelTransferBody}
     */
    PixelTransferBody,

    /**
     * The PixelbatchBatch model constructor.
     * @property {module:model/PixelbatchBatch}
     */
    PixelbatchBatch,

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
     * The ReporttaskcreateFiltering model constructor.
     * @property {module:model/ReporttaskcreateFiltering}
     */
    ReporttaskcreateFiltering,

    /**
     * The RuleCreateBody model constructor.
     * @property {module:model/RuleCreateBody}
     */
    RuleCreateBody,

    /**
     * The SavedAudienceCreateBody model constructor.
     * @property {module:model/SavedAudienceCreateBody}
     */
    SavedAudienceCreateBody,

    /**
     * The SavedAudienceDeleteBody model constructor.
     * @property {module:model/SavedAudienceDeleteBody}
     */
    SavedAudienceDeleteBody,

    /**
     * The ShareCancelBody model constructor.
     * @property {module:model/ShareCancelBody}
     */
    ShareCancelBody,

    /**
     * The TargetingCategoryRecommendBody model constructor.
     * @property {module:model/TargetingCategoryRecommendBody}
     */
    TargetingCategoryRecommendBody,

    /**
     * The TargetingInfoBody model constructor.
     * @property {module:model/TargetingInfoBody}
     */
    TargetingInfoBody,

    /**
     * The TargetingSearchBody model constructor.
     * @property {module:model/TargetingSearchBody}
     */
    TargetingSearchBody,

    /**
     * The TaskCancelBody model constructor.
     * @property {module:model/TaskCancelBody}
     */
    TaskCancelBody,

    /**
     * The TaskCreateBody model constructor.
     * @property {module:model/TaskCreateBody}
     */
    TaskCreateBody,

    /**
     * The TermConfirmBody model constructor.
     * @property {module:model/TermConfirmBody}
     */
    TermConfirmBody,

    /**
    * The APPManagementApi service constructor.
    * @property {module:api/APPManagementApi}
    */
    APPManagementApi,

    /**
    * The AccountManagementApi service constructor.
    * @property {module:api/AccountManagementApi}
    */
    AccountManagementApi,

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
    * The CampaignCreationApi service constructor.
    * @property {module:api/CampaignCreationApi}
    */
    CampaignCreationApi,

    /**
    * The CatalogApi service constructor.
    * @property {module:api/CatalogApi}
    */
    CatalogApi,

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
