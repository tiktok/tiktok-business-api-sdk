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
import {AssetShareBody} from './model/AssetShareBody.js';
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
import {BlockedwordCreateBody} from './model/BlockedwordCreateBody.js';
import {BlockedwordDeleteBody} from './model/BlockedwordDeleteBody.js';
import {BlockedwordTaskCreateBody} from './model/BlockedwordTaskCreateBody.js';
import {BlockedwordUpdateBody} from './model/BlockedwordUpdateBody.js';
import {CampaignCreateBody} from './model/CampaignCreateBody.js';
import {CampaignStatusUpdateBody} from './model/CampaignStatusUpdateBody.js';
import {CampaignUpdateBody} from './model/CampaignUpdateBody.js';
import {CampaigngmvMaxcreateCustomAnchorVideoList} from './model/CampaigngmvMaxcreateCustomAnchorVideoList.js';
import {CampaigngmvMaxcreateCustomAnchorVideoListIdentityInfo} from './model/CampaigngmvMaxcreateCustomAnchorVideoListIdentityInfo.js';
import {CampaigngmvMaxcreateIdentityList} from './model/CampaigngmvMaxcreateIdentityList.js';
import {CampaigngmvMaxcreateItemList} from './model/CampaigngmvMaxcreateItemList.js';
import {CampaigngmvMaxcreateItemListIdentityInfo} from './model/CampaigngmvMaxcreateItemListIdentityInfo.js';
import {CampaigngmvMaxcreatePromotionDays} from './model/CampaigngmvMaxcreatePromotionDays.js';
import {CampaigngmvMaxcreatePromotionDaysCustomScheduleList} from './model/CampaigngmvMaxcreatePromotionDaysCustomScheduleList.js';
import {CampaigngmvMaxcreateVideoInfo} from './model/CampaigngmvMaxcreateVideoInfo.js';
import {CampaigngmvMaxsessioncreateSession} from './model/CampaigngmvMaxsessioncreateSession.js';
import {CampaigngmvMaxsessioncreateSessionProductList} from './model/CampaigngmvMaxsessioncreateSessionProductList.js';
import {CampaigngmvMaxsessionupdateSession} from './model/CampaigngmvMaxsessionupdateSession.js';
import {CampaigngmvMaxupdateCustomAnchorVideoList} from './model/CampaigngmvMaxupdateCustomAnchorVideoList.js';
import {CampaigngmvMaxupdateCustomAnchorVideoListIdentityInfo} from './model/CampaigngmvMaxupdateCustomAnchorVideoListIdentityInfo.js';
import {CampaigngmvMaxupdateItemList} from './model/CampaigngmvMaxupdateItemList.js';
import {CampaigngmvMaxupdateItemListIdentityInfo} from './model/CampaigngmvMaxupdateItemListIdentityInfo.js';
import {CampaigngmvMaxupdatePromotionDays} from './model/CampaigngmvMaxupdatePromotionDays.js';
import {CampaigngmvMaxupdatePromotionDaysCustomScheduleList} from './model/CampaigngmvMaxupdatePromotionDaysCustomScheduleList.js';
import {CampaigngmvMaxupdateVideoInfo} from './model/CampaigngmvMaxupdateVideoInfo.js';
import {CatalogCapitalizeBody} from './model/CatalogCapitalizeBody.js';
import {CatalogCreateBody} from './model/CatalogCreateBody.js';
import {CatalogDeleteBody} from './model/CatalogDeleteBody.js';
import {CatalogUpdateBody} from './model/CatalogUpdateBody.js';
import {CatalogcreateCatalogConf} from './model/CatalogcreateCatalogConf.js';
import {CatalogfeedcreateScheduleParam} from './model/CatalogfeedcreateScheduleParam.js';
import {CatalogfeedcreateScheduleParamSource} from './model/CatalogfeedcreateScheduleParamSource.js';
import {CatalogsetupdateConditions} from './model/CatalogsetupdateConditions.js';
import {CommentDeleteBody} from './model/CommentDeleteBody.js';
import {CommentPostBody} from './model/CommentPostBody.js';
import {CommentTaskCreateBody} from './model/CommentTaskCreateBody.js';
import {ContextInfoCatalogFeedLog} from './model/ContextInfoCatalogFeedLog.js';
import {ContextInfoCatalogProductLog} from './model/ContextInfoCatalogProductLog.js';
import {ContextInfoGmvMaxReportGet} from './model/ContextInfoGmvMaxReportGet.js';
import {ContextInfoSmartPlusAdReviewInfo} from './model/ContextInfoSmartPlusAdReviewInfo.js';
import {ContextInfoSmartPlusMaterialReviewInfo} from './model/ContextInfoSmartPlusMaterialReviewInfo.js';
import {CreativeAssetDeleteBody} from './model/CreativeAssetDeleteBody.js';
import {CreativeportfoliocreateAdvancedAudioInfo} from './model/CreativeportfoliocreateAdvancedAudioInfo.js';
import {CreativeportfoliocreateAdvancedGestureIcon} from './model/CreativeportfoliocreateAdvancedGestureIcon.js';
import {CreativeportfoliocreateAdvancedGestureImage} from './model/CreativeportfoliocreateAdvancedGestureImage.js';
import {CreativeportfoliocreateBadgeImageInfo} from './model/CreativeportfoliocreateBadgeImageInfo.js';
import {CreativeportfoliocreateBadgePosition} from './model/CreativeportfoliocreateBadgePosition.js';
import {CreativeportfoliocreatePortfolioContent} from './model/CreativeportfoliocreatePortfolioContent.js';
import {CreativeportfoliocreateShowcaseProducts} from './model/CreativeportfoliocreateShowcaseProducts.js';
import {CreativeportfoliocreateSlideDimension} from './model/CreativeportfoliocreateSlideDimension.js';
import {CreativeportfoliocreateStickerParam} from './model/CreativeportfoliocreateStickerParam.js';
import {CreativeshareableLinkcreateSharedAssets} from './model/CreativeshareableLinkcreateSharedAssets.js';
import {CustomAnchorVideoList} from './model/CustomAnchorVideoList.js';
import {CustomAudienceApplyBody} from './model/CustomAudienceApplyBody.js';
import {CustomAudienceCreateBody} from './model/CustomAudienceCreateBody.js';
import {CustomAudienceDeleteBody} from './model/CustomAudienceDeleteBody.js';
import {CustomAudienceShareBody} from './model/CustomAudienceShareBody.js';
import {CustomAudienceUpdateBody} from './model/CustomAudienceUpdateBody.js';
import {DateRange} from './model/DateRange.js';
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
import {EventCreateBody} from './model/EventCreateBody.js';
import {EventDeleteBody} from './model/EventDeleteBody.js';
import {EventUpdateBody} from './model/EventUpdateBody.js';
import {EventsourceBindBody} from './model/EventsourceBindBody.js';
import {EventsourceUnbindBody} from './model/EventsourceUnbindBody.js';
import {ExclusiveAuthorizationCreateBody} from './model/ExclusiveAuthorizationCreateBody.js';
import {ExtraInfoSettingSmartPlusAdReviewInfo} from './model/ExtraInfoSettingSmartPlusAdReviewInfo.js';
import {ExtraInfoSettingSmartPlusMaterialReviewInfo} from './model/ExtraInfoSettingSmartPlusMaterialReviewInfo.js';
import {FeedCreateBody} from './model/FeedCreateBody.js';
import {FeedDeleteBody} from './model/FeedDeleteBody.js';
import {FeedUpdateBody} from './model/FeedUpdateBody.js';
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
import {FilteringCreativePortfolioList} from './model/FilteringCreativePortfolioList.js';
import {FilteringGmvMaxReportGet} from './model/FilteringGmvMaxReportGet.js';
import {FilteringOptimizerRuleList} from './model/FilteringOptimizerRuleList.js';
import {FilteringOptimizerRuleResultList} from './model/FilteringOptimizerRuleResultList.js';
import {FilteringPixelList} from './model/FilteringPixelList.js';
import {FilteringSmartPlusAdGet} from './model/FilteringSmartPlusAdGet.js';
import {FilteringSmartPlusAdgroupGet} from './model/FilteringSmartPlusAdgroupGet.js';
import {FilteringSmartPlusCampaignGet} from './model/FilteringSmartPlusCampaignGet.js';
import {FilteringSmartPlusMaterialReportBreakdown} from './model/FilteringSmartPlusMaterialReportBreakdown.js';
import {FilteringSmartPlusMaterialReportOverview} from './model/FilteringSmartPlusMaterialReportOverview.js';
import {FilteringVideoAdSearch} from './model/FilteringVideoAdSearch.js';
import {GmvMaxCreateBody} from './model/GmvMaxCreateBody.js';
import {GmvMaxUpdateBody} from './model/GmvMaxUpdateBody.js';
import {GmvMaxcustomAnchorVideoListgetIdentityInfo} from './model/GmvMaxcustomAnchorVideoListgetIdentityInfo.js';
import {IdentityCreateBody} from './model/IdentityCreateBody.js';
import {IdentityList} from './model/IdentityList.js';
import {ImageEditBody} from './model/ImageEditBody.js';
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
import {OfflineCreateBody} from './model/OfflineCreateBody.js';
import {OfflineDeleteBody} from './model/OfflineDeleteBody.js';
import {OfflineUpdateBody} from './model/OfflineUpdateBody.js';
import {OptimizerRuleCreateBody} from './model/OptimizerRuleCreateBody.js';
import {OptimizerRuleCreateBodyActions} from './model/OptimizerRuleCreateBodyActions.js';
import {OptimizerRuleCreateBodyApplyObjects} from './model/OptimizerRuleCreateBodyApplyObjects.js';
import {OptimizerRuleCreateBodyConditions} from './model/OptimizerRuleCreateBodyConditions.js';
import {OptimizerRuleCreateBodyFrequencyInfo} from './model/OptimizerRuleCreateBodyFrequencyInfo.js';
import {OptimizerRuleCreateBodyNotification} from './model/OptimizerRuleCreateBodyNotification.js';
import {OptimizerRuleCreateBodyNotificationEmailSetting} from './model/OptimizerRuleCreateBodyNotificationEmailSetting.js';
import {OptimizerRuleCreateBodyRuleExecInfo} from './model/OptimizerRuleCreateBodyRuleExecInfo.js';
import {OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo} from './model/OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo.js';
import {OptimizerRuleCreateBodyRules} from './model/OptimizerRuleCreateBodyRules.js';
import {OptimizerRuleCreateBodyValue} from './model/OptimizerRuleCreateBodyValue.js';
import {OptimizerRuleUpdateBody} from './model/OptimizerRuleUpdateBody.js';
import {OptimizerRuleUpdateBodyRules} from './model/OptimizerRuleUpdateBodyRules.js';
import {OptimizerrulebatchBindBindInfo} from './model/OptimizerrulebatchBindBindInfo.js';
import {PageInfo} from './model/PageInfo.js';
import {PangleBlockListUpdateBody} from './model/PangleBlockListUpdateBody.js';
import {PartnerAddBody} from './model/PartnerAddBody.js';
import {PartnerDeleteBody} from './model/PartnerDeleteBody.js';
import {PixelBatchBody} from './model/PixelBatchBody.js';
import {PixelContent} from './model/PixelContent.js';
import {PixelContext} from './model/PixelContext.js';
import {PixelContextAd} from './model/PixelContextAd.js';
import {PixelContextPage} from './model/PixelContextPage.js';
import {PixelContextUser} from './model/PixelContextUser.js';
import {PixelCreateBody} from './model/PixelCreateBody.js';
import {PixelProperties} from './model/PixelProperties.js';
import {PixelTrackBody} from './model/PixelTrackBody.js';
import {PixelTransferBody} from './model/PixelTransferBody.js';
import {PixelUpdateBody} from './model/PixelUpdateBody.js';
import {PixelbatchBatch} from './model/PixelbatchBatch.js';
import {PixeleventcreatePixelEvents} from './model/PixeleventcreatePixelEvents.js';
import {PixeleventcreateRules} from './model/PixeleventcreateRules.js';
import {PixelupdateAdvancedMatchingFields} from './model/PixelupdateAdvancedMatchingFields.js';
import {PlayableDeleteBody} from './model/PlayableDeleteBody.js';
import {PlayableSaveBody} from './model/PlayableSaveBody.js';
import {PlayableUploadBody} from './model/PlayableUploadBody.js';
import {PortfolioCreateBody} from './model/PortfolioCreateBody.js';
import {ProductDeleteBody} from './model/ProductDeleteBody.js';
import {ProductFileBody} from './model/ProductFileBody.js';
import {ReportTaskCreateBody} from './model/ReportTaskCreateBody.js';
import {ReportTaskCreateBodyFiltering} from './model/ReportTaskCreateBodyFiltering.js';
import {ResultDetail} from './model/ResultDetail.js';
import {RuleBatchBindBody} from './model/RuleBatchBindBody.js';
import {RuleCreateBody} from './model/RuleCreateBody.js';
import {SavedAudienceCreateBody} from './model/SavedAudienceCreateBody.js';
import {SavedAudienceDeleteBody} from './model/SavedAudienceDeleteBody.js';
import {SessionCreateBody} from './model/SessionCreateBody.js';
import {SessionDeleteBody} from './model/SessionDeleteBody.js';
import {SessionUpdateBody} from './model/SessionUpdateBody.js';
import {SetDeleteBody} from './model/SetDeleteBody.js';
import {SetUpdateBody} from './model/SetUpdateBody.js';
import {ShareCancelBody} from './model/ShareCancelBody.js';
import {ShareableLinkCreateBody} from './model/ShareableLinkCreateBody.js';
import {SmartPlusAdAppealBody} from './model/SmartPlusAdAppealBody.js';
import {SmartPlusAdCreateBody} from './model/SmartPlusAdCreateBody.js';
import {SmartPlusAdCreateBodyAdConfiguration} from './model/SmartPlusAdCreateBodyAdConfiguration.js';
import {SmartPlusAdCreateBodyAdConfigurationPhoneInfo} from './model/SmartPlusAdCreateBodyAdConfigurationPhoneInfo.js';
import {SmartPlusAdCreateBodyAdConfigurationTrackingInfo} from './model/SmartPlusAdCreateBodyAdConfigurationTrackingInfo.js';
import {SmartPlusAdCreateBodyAdConfigurationUtmParams} from './model/SmartPlusAdCreateBodyAdConfigurationUtmParams.js';
import {SmartPlusAdCreateBodyAdTextList} from './model/SmartPlusAdCreateBodyAdTextList.js';
import {SmartPlusAdCreateBodyAutoMessageList} from './model/SmartPlusAdCreateBodyAutoMessageList.js';
import {SmartPlusAdCreateBodyCallToActionList} from './model/SmartPlusAdCreateBodyCallToActionList.js';
import {SmartPlusAdCreateBodyCreativeInfo} from './model/SmartPlusAdCreateBodyCreativeInfo.js';
import {SmartPlusAdCreateBodyCreativeInfoImageInfo} from './model/SmartPlusAdCreateBodyCreativeInfoImageInfo.js';
import {SmartPlusAdCreateBodyCreativeInfoMusicInfo} from './model/SmartPlusAdCreateBodyCreativeInfoMusicInfo.js';
import {SmartPlusAdCreateBodyCreativeInfoVideoInfo} from './model/SmartPlusAdCreateBodyCreativeInfoVideoInfo.js';
import {SmartPlusAdCreateBodyCreativeList} from './model/SmartPlusAdCreateBodyCreativeList.js';
import {SmartPlusAdCreateBodyDeeplinkList} from './model/SmartPlusAdCreateBodyDeeplinkList.js';
import {SmartPlusAdCreateBodyInteractiveAddOnList} from './model/SmartPlusAdCreateBodyInteractiveAddOnList.js';
import {SmartPlusAdCreateBodyLandingPageUrlList} from './model/SmartPlusAdCreateBodyLandingPageUrlList.js';
import {SmartPlusAdCreateBodyPageList} from './model/SmartPlusAdCreateBodyPageList.js';
import {SmartPlusAdMaterialStatusUpdateBody} from './model/SmartPlusAdMaterialStatusUpdateBody.js';
import {SmartPlusAdStatusUpdateBody} from './model/SmartPlusAdStatusUpdateBody.js';
import {SmartPlusAdUpdateBody} from './model/SmartPlusAdUpdateBody.js';
import {SmartPlusAdUpdateBodyAdConfiguration} from './model/SmartPlusAdUpdateBodyAdConfiguration.js';
import {SmartPlusAdUpdateBodyAdConfigurationTrackingInfo} from './model/SmartPlusAdUpdateBodyAdConfigurationTrackingInfo.js';
import {SmartPlusAdUpdateBodyAdConfigurationUtmParams} from './model/SmartPlusAdUpdateBodyAdConfigurationUtmParams.js';
import {SmartPlusAdUpdateBodyCreativeInfo} from './model/SmartPlusAdUpdateBodyCreativeInfo.js';
import {SmartPlusAdUpdateBodyCreativeList} from './model/SmartPlusAdUpdateBodyCreativeList.js';
import {SmartPlusAdgroupCreateBody} from './model/SmartPlusAdgroupCreateBody.js';
import {SmartPlusAdgroupCreateBodyPhoneInfo} from './model/SmartPlusAdgroupCreateBodyPhoneInfo.js';
import {SmartPlusAdgroupCreateBodyTargetingSpec} from './model/SmartPlusAdgroupCreateBodyTargetingSpec.js';
import {SmartPlusAdgroupCreateBodyTargetingSpecActions} from './model/SmartPlusAdgroupCreateBodyTargetingSpecActions.js';
import {SmartPlusAdgroupStatusUpdateBody} from './model/SmartPlusAdgroupStatusUpdateBody.js';
import {SmartPlusAdgroupUpdateBody} from './model/SmartPlusAdgroupUpdateBody.js';
import {SmartPlusCampaignCreateBody} from './model/SmartPlusCampaignCreateBody.js';
import {SmartPlusCampaignStatusUpdateBody} from './model/SmartPlusCampaignStatusUpdateBody.js';
import {SmartPlusCampaignUpdateBody} from './model/SmartPlusCampaignUpdateBody.js';
import {SmartTextGenerateBody} from './model/SmartTextGenerateBody.js';
import {StatusUpdateBody} from './model/StatusUpdateBody.js';
import {TargetingCategoryRecommendBody} from './model/TargetingCategoryRecommendBody.js';
import {TargetingInfoBody} from './model/TargetingInfoBody.js';
import {TargetingSearchBody} from './model/TargetingSearchBody.js';
import {TaskCancelBody} from './model/TaskCancelBody.js';
import {TermConfirmBody} from './model/TermConfirmBody.js';
import {VideoDeleteBody} from './model/VideoDeleteBody.js';
import {APPManagementApi} from './api/APPManagementApi.js';
import {AccountManagementApi} from './api/AccountManagementApi.js';
import {AdApi} from './api/AdApi.js';
import {AdAcoApi} from './api/AdAcoApi.js';
import {AdgroupApi} from './api/AdgroupApi.js';
import {AudienceApi} from './api/AudienceApi.js';
import {AuthenticationApi} from './api/AuthenticationApi.js';
import {AutomatedRulesApi} from './api/AutomatedRulesApi.js';
import {BCApi} from './api/BCApi.js';
import {CampaignCreationApi} from './api/CampaignCreationApi.js';
import {CatalogApi} from './api/CatalogApi.js';
import {CommentsApi} from './api/CommentsApi.js';
import {CreativeManagementApi} from './api/CreativeManagementApi.js';
import {EventCallbackApi} from './api/EventCallbackApi.js';
import {FileApi} from './api/FileApi.js';
import {IdentityApi} from './api/IdentityApi.js';
import {MeasurementApi} from './api/MeasurementApi.js';
import {RecommendToolApi} from './api/RecommendToolApi.js';
import {ReportingApi} from './api/ReportingApi.js';
import {StoreApi} from './api/StoreApi.js';
import {ToolApi} from './api/ToolApi.js';
import {VideoApi} from './api/VideoApi.js';

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
* @version 0.1.9
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
     * The AssetShareBody model constructor.
     * @property {module:model/AssetShareBody}
     */
    AssetShareBody,

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
     * The BlockedwordCreateBody model constructor.
     * @property {module:model/BlockedwordCreateBody}
     */
    BlockedwordCreateBody,

    /**
     * The BlockedwordDeleteBody model constructor.
     * @property {module:model/BlockedwordDeleteBody}
     */
    BlockedwordDeleteBody,

    /**
     * The BlockedwordTaskCreateBody model constructor.
     * @property {module:model/BlockedwordTaskCreateBody}
     */
    BlockedwordTaskCreateBody,

    /**
     * The BlockedwordUpdateBody model constructor.
     * @property {module:model/BlockedwordUpdateBody}
     */
    BlockedwordUpdateBody,

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
     * The CampaigngmvMaxcreateCustomAnchorVideoList model constructor.
     * @property {module:model/CampaigngmvMaxcreateCustomAnchorVideoList}
     */
    CampaigngmvMaxcreateCustomAnchorVideoList,

    /**
     * The CampaigngmvMaxcreateCustomAnchorVideoListIdentityInfo model constructor.
     * @property {module:model/CampaigngmvMaxcreateCustomAnchorVideoListIdentityInfo}
     */
    CampaigngmvMaxcreateCustomAnchorVideoListIdentityInfo,

    /**
     * The CampaigngmvMaxcreateIdentityList model constructor.
     * @property {module:model/CampaigngmvMaxcreateIdentityList}
     */
    CampaigngmvMaxcreateIdentityList,

    /**
     * The CampaigngmvMaxcreateItemList model constructor.
     * @property {module:model/CampaigngmvMaxcreateItemList}
     */
    CampaigngmvMaxcreateItemList,

    /**
     * The CampaigngmvMaxcreateItemListIdentityInfo model constructor.
     * @property {module:model/CampaigngmvMaxcreateItemListIdentityInfo}
     */
    CampaigngmvMaxcreateItemListIdentityInfo,

    /**
     * The CampaigngmvMaxcreatePromotionDays model constructor.
     * @property {module:model/CampaigngmvMaxcreatePromotionDays}
     */
    CampaigngmvMaxcreatePromotionDays,

    /**
     * The CampaigngmvMaxcreatePromotionDaysCustomScheduleList model constructor.
     * @property {module:model/CampaigngmvMaxcreatePromotionDaysCustomScheduleList}
     */
    CampaigngmvMaxcreatePromotionDaysCustomScheduleList,

    /**
     * The CampaigngmvMaxcreateVideoInfo model constructor.
     * @property {module:model/CampaigngmvMaxcreateVideoInfo}
     */
    CampaigngmvMaxcreateVideoInfo,

    /**
     * The CampaigngmvMaxsessioncreateSession model constructor.
     * @property {module:model/CampaigngmvMaxsessioncreateSession}
     */
    CampaigngmvMaxsessioncreateSession,

    /**
     * The CampaigngmvMaxsessioncreateSessionProductList model constructor.
     * @property {module:model/CampaigngmvMaxsessioncreateSessionProductList}
     */
    CampaigngmvMaxsessioncreateSessionProductList,

    /**
     * The CampaigngmvMaxsessionupdateSession model constructor.
     * @property {module:model/CampaigngmvMaxsessionupdateSession}
     */
    CampaigngmvMaxsessionupdateSession,

    /**
     * The CampaigngmvMaxupdateCustomAnchorVideoList model constructor.
     * @property {module:model/CampaigngmvMaxupdateCustomAnchorVideoList}
     */
    CampaigngmvMaxupdateCustomAnchorVideoList,

    /**
     * The CampaigngmvMaxupdateCustomAnchorVideoListIdentityInfo model constructor.
     * @property {module:model/CampaigngmvMaxupdateCustomAnchorVideoListIdentityInfo}
     */
    CampaigngmvMaxupdateCustomAnchorVideoListIdentityInfo,

    /**
     * The CampaigngmvMaxupdateItemList model constructor.
     * @property {module:model/CampaigngmvMaxupdateItemList}
     */
    CampaigngmvMaxupdateItemList,

    /**
     * The CampaigngmvMaxupdateItemListIdentityInfo model constructor.
     * @property {module:model/CampaigngmvMaxupdateItemListIdentityInfo}
     */
    CampaigngmvMaxupdateItemListIdentityInfo,

    /**
     * The CampaigngmvMaxupdatePromotionDays model constructor.
     * @property {module:model/CampaigngmvMaxupdatePromotionDays}
     */
    CampaigngmvMaxupdatePromotionDays,

    /**
     * The CampaigngmvMaxupdatePromotionDaysCustomScheduleList model constructor.
     * @property {module:model/CampaigngmvMaxupdatePromotionDaysCustomScheduleList}
     */
    CampaigngmvMaxupdatePromotionDaysCustomScheduleList,

    /**
     * The CampaigngmvMaxupdateVideoInfo model constructor.
     * @property {module:model/CampaigngmvMaxupdateVideoInfo}
     */
    CampaigngmvMaxupdateVideoInfo,

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
     * The CatalogfeedcreateScheduleParam model constructor.
     * @property {module:model/CatalogfeedcreateScheduleParam}
     */
    CatalogfeedcreateScheduleParam,

    /**
     * The CatalogfeedcreateScheduleParamSource model constructor.
     * @property {module:model/CatalogfeedcreateScheduleParamSource}
     */
    CatalogfeedcreateScheduleParamSource,

    /**
     * The CatalogsetupdateConditions model constructor.
     * @property {module:model/CatalogsetupdateConditions}
     */
    CatalogsetupdateConditions,

    /**
     * The CommentDeleteBody model constructor.
     * @property {module:model/CommentDeleteBody}
     */
    CommentDeleteBody,

    /**
     * The CommentPostBody model constructor.
     * @property {module:model/CommentPostBody}
     */
    CommentPostBody,

    /**
     * The CommentTaskCreateBody model constructor.
     * @property {module:model/CommentTaskCreateBody}
     */
    CommentTaskCreateBody,

    /**
     * The ContextInfoCatalogFeedLog model constructor.
     * @property {module:model/ContextInfoCatalogFeedLog}
     */
    ContextInfoCatalogFeedLog,

    /**
     * The ContextInfoCatalogProductLog model constructor.
     * @property {module:model/ContextInfoCatalogProductLog}
     */
    ContextInfoCatalogProductLog,

    /**
     * The ContextInfoGmvMaxReportGet model constructor.
     * @property {module:model/ContextInfoGmvMaxReportGet}
     */
    ContextInfoGmvMaxReportGet,

    /**
     * The ContextInfoSmartPlusAdReviewInfo model constructor.
     * @property {module:model/ContextInfoSmartPlusAdReviewInfo}
     */
    ContextInfoSmartPlusAdReviewInfo,

    /**
     * The ContextInfoSmartPlusMaterialReviewInfo model constructor.
     * @property {module:model/ContextInfoSmartPlusMaterialReviewInfo}
     */
    ContextInfoSmartPlusMaterialReviewInfo,

    /**
     * The CreativeAssetDeleteBody model constructor.
     * @property {module:model/CreativeAssetDeleteBody}
     */
    CreativeAssetDeleteBody,

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
     * The CreativeportfoliocreateAdvancedGestureImage model constructor.
     * @property {module:model/CreativeportfoliocreateAdvancedGestureImage}
     */
    CreativeportfoliocreateAdvancedGestureImage,

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
     * The CreativeportfoliocreateShowcaseProducts model constructor.
     * @property {module:model/CreativeportfoliocreateShowcaseProducts}
     */
    CreativeportfoliocreateShowcaseProducts,

    /**
     * The CreativeportfoliocreateSlideDimension model constructor.
     * @property {module:model/CreativeportfoliocreateSlideDimension}
     */
    CreativeportfoliocreateSlideDimension,

    /**
     * The CreativeportfoliocreateStickerParam model constructor.
     * @property {module:model/CreativeportfoliocreateStickerParam}
     */
    CreativeportfoliocreateStickerParam,

    /**
     * The CreativeshareableLinkcreateSharedAssets model constructor.
     * @property {module:model/CreativeshareableLinkcreateSharedAssets}
     */
    CreativeshareableLinkcreateSharedAssets,

    /**
     * The CustomAnchorVideoList model constructor.
     * @property {module:model/CustomAnchorVideoList}
     */
    CustomAnchorVideoList,

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
     * The DateRange model constructor.
     * @property {module:model/DateRange}
     */
    DateRange,

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
     * The EventCreateBody model constructor.
     * @property {module:model/EventCreateBody}
     */
    EventCreateBody,

    /**
     * The EventDeleteBody model constructor.
     * @property {module:model/EventDeleteBody}
     */
    EventDeleteBody,

    /**
     * The EventUpdateBody model constructor.
     * @property {module:model/EventUpdateBody}
     */
    EventUpdateBody,

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
     * The ExclusiveAuthorizationCreateBody model constructor.
     * @property {module:model/ExclusiveAuthorizationCreateBody}
     */
    ExclusiveAuthorizationCreateBody,

    /**
     * The ExtraInfoSettingSmartPlusAdReviewInfo model constructor.
     * @property {module:model/ExtraInfoSettingSmartPlusAdReviewInfo}
     */
    ExtraInfoSettingSmartPlusAdReviewInfo,

    /**
     * The ExtraInfoSettingSmartPlusMaterialReviewInfo model constructor.
     * @property {module:model/ExtraInfoSettingSmartPlusMaterialReviewInfo}
     */
    ExtraInfoSettingSmartPlusMaterialReviewInfo,

    /**
     * The FeedCreateBody model constructor.
     * @property {module:model/FeedCreateBody}
     */
    FeedCreateBody,

    /**
     * The FeedDeleteBody model constructor.
     * @property {module:model/FeedDeleteBody}
     */
    FeedDeleteBody,

    /**
     * The FeedUpdateBody model constructor.
     * @property {module:model/FeedUpdateBody}
     */
    FeedUpdateBody,

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
     * The FilteringCreativePortfolioList model constructor.
     * @property {module:model/FilteringCreativePortfolioList}
     */
    FilteringCreativePortfolioList,

    /**
     * The FilteringGmvMaxReportGet model constructor.
     * @property {module:model/FilteringGmvMaxReportGet}
     */
    FilteringGmvMaxReportGet,

    /**
     * The FilteringOptimizerRuleList model constructor.
     * @property {module:model/FilteringOptimizerRuleList}
     */
    FilteringOptimizerRuleList,

    /**
     * The FilteringOptimizerRuleResultList model constructor.
     * @property {module:model/FilteringOptimizerRuleResultList}
     */
    FilteringOptimizerRuleResultList,

    /**
     * The FilteringPixelList model constructor.
     * @property {module:model/FilteringPixelList}
     */
    FilteringPixelList,

    /**
     * The FilteringSmartPlusAdGet model constructor.
     * @property {module:model/FilteringSmartPlusAdGet}
     */
    FilteringSmartPlusAdGet,

    /**
     * The FilteringSmartPlusAdgroupGet model constructor.
     * @property {module:model/FilteringSmartPlusAdgroupGet}
     */
    FilteringSmartPlusAdgroupGet,

    /**
     * The FilteringSmartPlusCampaignGet model constructor.
     * @property {module:model/FilteringSmartPlusCampaignGet}
     */
    FilteringSmartPlusCampaignGet,

    /**
     * The FilteringSmartPlusMaterialReportBreakdown model constructor.
     * @property {module:model/FilteringSmartPlusMaterialReportBreakdown}
     */
    FilteringSmartPlusMaterialReportBreakdown,

    /**
     * The FilteringSmartPlusMaterialReportOverview model constructor.
     * @property {module:model/FilteringSmartPlusMaterialReportOverview}
     */
    FilteringSmartPlusMaterialReportOverview,

    /**
     * The FilteringVideoAdSearch model constructor.
     * @property {module:model/FilteringVideoAdSearch}
     */
    FilteringVideoAdSearch,

    /**
     * The GmvMaxCreateBody model constructor.
     * @property {module:model/GmvMaxCreateBody}
     */
    GmvMaxCreateBody,

    /**
     * The GmvMaxUpdateBody model constructor.
     * @property {module:model/GmvMaxUpdateBody}
     */
    GmvMaxUpdateBody,

    /**
     * The GmvMaxcustomAnchorVideoListgetIdentityInfo model constructor.
     * @property {module:model/GmvMaxcustomAnchorVideoListgetIdentityInfo}
     */
    GmvMaxcustomAnchorVideoListgetIdentityInfo,

    /**
     * The IdentityCreateBody model constructor.
     * @property {module:model/IdentityCreateBody}
     */
    IdentityCreateBody,

    /**
     * The IdentityList model constructor.
     * @property {module:model/IdentityList}
     */
    IdentityList,

    /**
     * The ImageEditBody model constructor.
     * @property {module:model/ImageEditBody}
     */
    ImageEditBody,

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
     * The OfflineCreateBody model constructor.
     * @property {module:model/OfflineCreateBody}
     */
    OfflineCreateBody,

    /**
     * The OfflineDeleteBody model constructor.
     * @property {module:model/OfflineDeleteBody}
     */
    OfflineDeleteBody,

    /**
     * The OfflineUpdateBody model constructor.
     * @property {module:model/OfflineUpdateBody}
     */
    OfflineUpdateBody,

    /**
     * The OptimizerRuleCreateBody model constructor.
     * @property {module:model/OptimizerRuleCreateBody}
     */
    OptimizerRuleCreateBody,

    /**
     * The OptimizerRuleCreateBodyActions model constructor.
     * @property {module:model/OptimizerRuleCreateBodyActions}
     */
    OptimizerRuleCreateBodyActions,

    /**
     * The OptimizerRuleCreateBodyApplyObjects model constructor.
     * @property {module:model/OptimizerRuleCreateBodyApplyObjects}
     */
    OptimizerRuleCreateBodyApplyObjects,

    /**
     * The OptimizerRuleCreateBodyConditions model constructor.
     * @property {module:model/OptimizerRuleCreateBodyConditions}
     */
    OptimizerRuleCreateBodyConditions,

    /**
     * The OptimizerRuleCreateBodyFrequencyInfo model constructor.
     * @property {module:model/OptimizerRuleCreateBodyFrequencyInfo}
     */
    OptimizerRuleCreateBodyFrequencyInfo,

    /**
     * The OptimizerRuleCreateBodyNotification model constructor.
     * @property {module:model/OptimizerRuleCreateBodyNotification}
     */
    OptimizerRuleCreateBodyNotification,

    /**
     * The OptimizerRuleCreateBodyNotificationEmailSetting model constructor.
     * @property {module:model/OptimizerRuleCreateBodyNotificationEmailSetting}
     */
    OptimizerRuleCreateBodyNotificationEmailSetting,

    /**
     * The OptimizerRuleCreateBodyRuleExecInfo model constructor.
     * @property {module:model/OptimizerRuleCreateBodyRuleExecInfo}
     */
    OptimizerRuleCreateBodyRuleExecInfo,

    /**
     * The OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo model constructor.
     * @property {module:model/OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo}
     */
    OptimizerRuleCreateBodyRuleExecInfoTimePeriodInfo,

    /**
     * The OptimizerRuleCreateBodyRules model constructor.
     * @property {module:model/OptimizerRuleCreateBodyRules}
     */
    OptimizerRuleCreateBodyRules,

    /**
     * The OptimizerRuleCreateBodyValue model constructor.
     * @property {module:model/OptimizerRuleCreateBodyValue}
     */
    OptimizerRuleCreateBodyValue,

    /**
     * The OptimizerRuleUpdateBody model constructor.
     * @property {module:model/OptimizerRuleUpdateBody}
     */
    OptimizerRuleUpdateBody,

    /**
     * The OptimizerRuleUpdateBodyRules model constructor.
     * @property {module:model/OptimizerRuleUpdateBodyRules}
     */
    OptimizerRuleUpdateBodyRules,

    /**
     * The OptimizerrulebatchBindBindInfo model constructor.
     * @property {module:model/OptimizerrulebatchBindBindInfo}
     */
    OptimizerrulebatchBindBindInfo,

    /**
     * The PageInfo model constructor.
     * @property {module:model/PageInfo}
     */
    PageInfo,

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
     * The PixelCreateBody model constructor.
     * @property {module:model/PixelCreateBody}
     */
    PixelCreateBody,

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
     * The PixelUpdateBody model constructor.
     * @property {module:model/PixelUpdateBody}
     */
    PixelUpdateBody,

    /**
     * The PixelbatchBatch model constructor.
     * @property {module:model/PixelbatchBatch}
     */
    PixelbatchBatch,

    /**
     * The PixeleventcreatePixelEvents model constructor.
     * @property {module:model/PixeleventcreatePixelEvents}
     */
    PixeleventcreatePixelEvents,

    /**
     * The PixeleventcreateRules model constructor.
     * @property {module:model/PixeleventcreateRules}
     */
    PixeleventcreateRules,

    /**
     * The PixelupdateAdvancedMatchingFields model constructor.
     * @property {module:model/PixelupdateAdvancedMatchingFields}
     */
    PixelupdateAdvancedMatchingFields,

    /**
     * The PlayableDeleteBody model constructor.
     * @property {module:model/PlayableDeleteBody}
     */
    PlayableDeleteBody,

    /**
     * The PlayableSaveBody model constructor.
     * @property {module:model/PlayableSaveBody}
     */
    PlayableSaveBody,

    /**
     * The PlayableUploadBody model constructor.
     * @property {module:model/PlayableUploadBody}
     */
    PlayableUploadBody,

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
     * The ReportTaskCreateBody model constructor.
     * @property {module:model/ReportTaskCreateBody}
     */
    ReportTaskCreateBody,

    /**
     * The ReportTaskCreateBodyFiltering model constructor.
     * @property {module:model/ReportTaskCreateBodyFiltering}
     */
    ReportTaskCreateBodyFiltering,

    /**
     * The ResultDetail model constructor.
     * @property {module:model/ResultDetail}
     */
    ResultDetail,

    /**
     * The RuleBatchBindBody model constructor.
     * @property {module:model/RuleBatchBindBody}
     */
    RuleBatchBindBody,

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
     * The SessionCreateBody model constructor.
     * @property {module:model/SessionCreateBody}
     */
    SessionCreateBody,

    /**
     * The SessionDeleteBody model constructor.
     * @property {module:model/SessionDeleteBody}
     */
    SessionDeleteBody,

    /**
     * The SessionUpdateBody model constructor.
     * @property {module:model/SessionUpdateBody}
     */
    SessionUpdateBody,

    /**
     * The SetDeleteBody model constructor.
     * @property {module:model/SetDeleteBody}
     */
    SetDeleteBody,

    /**
     * The SetUpdateBody model constructor.
     * @property {module:model/SetUpdateBody}
     */
    SetUpdateBody,

    /**
     * The ShareCancelBody model constructor.
     * @property {module:model/ShareCancelBody}
     */
    ShareCancelBody,

    /**
     * The ShareableLinkCreateBody model constructor.
     * @property {module:model/ShareableLinkCreateBody}
     */
    ShareableLinkCreateBody,

    /**
     * The SmartPlusAdAppealBody model constructor.
     * @property {module:model/SmartPlusAdAppealBody}
     */
    SmartPlusAdAppealBody,

    /**
     * The SmartPlusAdCreateBody model constructor.
     * @property {module:model/SmartPlusAdCreateBody}
     */
    SmartPlusAdCreateBody,

    /**
     * The SmartPlusAdCreateBodyAdConfiguration model constructor.
     * @property {module:model/SmartPlusAdCreateBodyAdConfiguration}
     */
    SmartPlusAdCreateBodyAdConfiguration,

    /**
     * The SmartPlusAdCreateBodyAdConfigurationPhoneInfo model constructor.
     * @property {module:model/SmartPlusAdCreateBodyAdConfigurationPhoneInfo}
     */
    SmartPlusAdCreateBodyAdConfigurationPhoneInfo,

    /**
     * The SmartPlusAdCreateBodyAdConfigurationTrackingInfo model constructor.
     * @property {module:model/SmartPlusAdCreateBodyAdConfigurationTrackingInfo}
     */
    SmartPlusAdCreateBodyAdConfigurationTrackingInfo,

    /**
     * The SmartPlusAdCreateBodyAdConfigurationUtmParams model constructor.
     * @property {module:model/SmartPlusAdCreateBodyAdConfigurationUtmParams}
     */
    SmartPlusAdCreateBodyAdConfigurationUtmParams,

    /**
     * The SmartPlusAdCreateBodyAdTextList model constructor.
     * @property {module:model/SmartPlusAdCreateBodyAdTextList}
     */
    SmartPlusAdCreateBodyAdTextList,

    /**
     * The SmartPlusAdCreateBodyAutoMessageList model constructor.
     * @property {module:model/SmartPlusAdCreateBodyAutoMessageList}
     */
    SmartPlusAdCreateBodyAutoMessageList,

    /**
     * The SmartPlusAdCreateBodyCallToActionList model constructor.
     * @property {module:model/SmartPlusAdCreateBodyCallToActionList}
     */
    SmartPlusAdCreateBodyCallToActionList,

    /**
     * The SmartPlusAdCreateBodyCreativeInfo model constructor.
     * @property {module:model/SmartPlusAdCreateBodyCreativeInfo}
     */
    SmartPlusAdCreateBodyCreativeInfo,

    /**
     * The SmartPlusAdCreateBodyCreativeInfoImageInfo model constructor.
     * @property {module:model/SmartPlusAdCreateBodyCreativeInfoImageInfo}
     */
    SmartPlusAdCreateBodyCreativeInfoImageInfo,

    /**
     * The SmartPlusAdCreateBodyCreativeInfoMusicInfo model constructor.
     * @property {module:model/SmartPlusAdCreateBodyCreativeInfoMusicInfo}
     */
    SmartPlusAdCreateBodyCreativeInfoMusicInfo,

    /**
     * The SmartPlusAdCreateBodyCreativeInfoVideoInfo model constructor.
     * @property {module:model/SmartPlusAdCreateBodyCreativeInfoVideoInfo}
     */
    SmartPlusAdCreateBodyCreativeInfoVideoInfo,

    /**
     * The SmartPlusAdCreateBodyCreativeList model constructor.
     * @property {module:model/SmartPlusAdCreateBodyCreativeList}
     */
    SmartPlusAdCreateBodyCreativeList,

    /**
     * The SmartPlusAdCreateBodyDeeplinkList model constructor.
     * @property {module:model/SmartPlusAdCreateBodyDeeplinkList}
     */
    SmartPlusAdCreateBodyDeeplinkList,

    /**
     * The SmartPlusAdCreateBodyInteractiveAddOnList model constructor.
     * @property {module:model/SmartPlusAdCreateBodyInteractiveAddOnList}
     */
    SmartPlusAdCreateBodyInteractiveAddOnList,

    /**
     * The SmartPlusAdCreateBodyLandingPageUrlList model constructor.
     * @property {module:model/SmartPlusAdCreateBodyLandingPageUrlList}
     */
    SmartPlusAdCreateBodyLandingPageUrlList,

    /**
     * The SmartPlusAdCreateBodyPageList model constructor.
     * @property {module:model/SmartPlusAdCreateBodyPageList}
     */
    SmartPlusAdCreateBodyPageList,

    /**
     * The SmartPlusAdMaterialStatusUpdateBody model constructor.
     * @property {module:model/SmartPlusAdMaterialStatusUpdateBody}
     */
    SmartPlusAdMaterialStatusUpdateBody,

    /**
     * The SmartPlusAdStatusUpdateBody model constructor.
     * @property {module:model/SmartPlusAdStatusUpdateBody}
     */
    SmartPlusAdStatusUpdateBody,

    /**
     * The SmartPlusAdUpdateBody model constructor.
     * @property {module:model/SmartPlusAdUpdateBody}
     */
    SmartPlusAdUpdateBody,

    /**
     * The SmartPlusAdUpdateBodyAdConfiguration model constructor.
     * @property {module:model/SmartPlusAdUpdateBodyAdConfiguration}
     */
    SmartPlusAdUpdateBodyAdConfiguration,

    /**
     * The SmartPlusAdUpdateBodyAdConfigurationTrackingInfo model constructor.
     * @property {module:model/SmartPlusAdUpdateBodyAdConfigurationTrackingInfo}
     */
    SmartPlusAdUpdateBodyAdConfigurationTrackingInfo,

    /**
     * The SmartPlusAdUpdateBodyAdConfigurationUtmParams model constructor.
     * @property {module:model/SmartPlusAdUpdateBodyAdConfigurationUtmParams}
     */
    SmartPlusAdUpdateBodyAdConfigurationUtmParams,

    /**
     * The SmartPlusAdUpdateBodyCreativeInfo model constructor.
     * @property {module:model/SmartPlusAdUpdateBodyCreativeInfo}
     */
    SmartPlusAdUpdateBodyCreativeInfo,

    /**
     * The SmartPlusAdUpdateBodyCreativeList model constructor.
     * @property {module:model/SmartPlusAdUpdateBodyCreativeList}
     */
    SmartPlusAdUpdateBodyCreativeList,

    /**
     * The SmartPlusAdgroupCreateBody model constructor.
     * @property {module:model/SmartPlusAdgroupCreateBody}
     */
    SmartPlusAdgroupCreateBody,

    /**
     * The SmartPlusAdgroupCreateBodyPhoneInfo model constructor.
     * @property {module:model/SmartPlusAdgroupCreateBodyPhoneInfo}
     */
    SmartPlusAdgroupCreateBodyPhoneInfo,

    /**
     * The SmartPlusAdgroupCreateBodyTargetingSpec model constructor.
     * @property {module:model/SmartPlusAdgroupCreateBodyTargetingSpec}
     */
    SmartPlusAdgroupCreateBodyTargetingSpec,

    /**
     * The SmartPlusAdgroupCreateBodyTargetingSpecActions model constructor.
     * @property {module:model/SmartPlusAdgroupCreateBodyTargetingSpecActions}
     */
    SmartPlusAdgroupCreateBodyTargetingSpecActions,

    /**
     * The SmartPlusAdgroupStatusUpdateBody model constructor.
     * @property {module:model/SmartPlusAdgroupStatusUpdateBody}
     */
    SmartPlusAdgroupStatusUpdateBody,

    /**
     * The SmartPlusAdgroupUpdateBody model constructor.
     * @property {module:model/SmartPlusAdgroupUpdateBody}
     */
    SmartPlusAdgroupUpdateBody,

    /**
     * The SmartPlusCampaignCreateBody model constructor.
     * @property {module:model/SmartPlusCampaignCreateBody}
     */
    SmartPlusCampaignCreateBody,

    /**
     * The SmartPlusCampaignStatusUpdateBody model constructor.
     * @property {module:model/SmartPlusCampaignStatusUpdateBody}
     */
    SmartPlusCampaignStatusUpdateBody,

    /**
     * The SmartPlusCampaignUpdateBody model constructor.
     * @property {module:model/SmartPlusCampaignUpdateBody}
     */
    SmartPlusCampaignUpdateBody,

    /**
     * The SmartTextGenerateBody model constructor.
     * @property {module:model/SmartTextGenerateBody}
     */
    SmartTextGenerateBody,

    /**
     * The StatusUpdateBody model constructor.
     * @property {module:model/StatusUpdateBody}
     */
    StatusUpdateBody,

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
     * The TermConfirmBody model constructor.
     * @property {module:model/TermConfirmBody}
     */
    TermConfirmBody,

    /**
     * The VideoDeleteBody model constructor.
     * @property {module:model/VideoDeleteBody}
     */
    VideoDeleteBody,

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
    * The AutomatedRulesApi service constructor.
    * @property {module:api/AutomatedRulesApi}
    */
    AutomatedRulesApi,

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
    * The CommentsApi service constructor.
    * @property {module:api/CommentsApi}
    */
    CommentsApi,

    /**
    * The CreativeManagementApi service constructor.
    * @property {module:api/CreativeManagementApi}
    */
    CreativeManagementApi,

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
    * The StoreApi service constructor.
    * @property {module:api/StoreApi}
    */
    StoreApi,

    /**
    * The ToolApi service constructor.
    * @property {module:api/ToolApi}
    */
    ToolApi,

    /**
    * The VideoApi service constructor.
    * @property {module:api/VideoApi}
    */
    VideoApi
};
