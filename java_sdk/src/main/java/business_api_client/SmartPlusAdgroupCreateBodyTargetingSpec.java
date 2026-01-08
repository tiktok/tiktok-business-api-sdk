/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.SmartPlusAdgroupCreateBodyTargetingSpecActions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SmartPlusAdgroupCreateBodyTargetingSpec
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class SmartPlusAdgroupCreateBodyTargetingSpec {
  @JsonProperty("actions")
  private List<SmartPlusAdgroupCreateBodyTargetingSpecActions> actions = null;

  @JsonProperty("age_groups")
  private List<String> ageGroups = null;

  @JsonProperty("audience_ids")
  private List<String> audienceIds = null;

  @JsonProperty("blocked_pangle_app_ids")
  private List<String> blockedPangleAppIds = null;

  @JsonProperty("carrier_ids")
  private List<String> carrierIds = null;

  @JsonProperty("device_model_ids")
  private List<String> deviceModelIds = null;

  @JsonProperty("device_price_ranges")
  private List<Long> devicePriceRanges = null;

  @JsonProperty("excluded_audience_ids")
  private List<String> excludedAudienceIds = null;

  @JsonProperty("excluded_pangle_audience_package_ids")
  private List<String> excludedPangleAudiencePackageIds = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("household_income")
  private List<String> householdIncome = null;

  @JsonProperty("included_pangle_audience_package_ids")
  private List<String> includedPangleAudiencePackageIds = null;

  @JsonProperty("interest_category_ids")
  private List<String> interestCategoryIds = null;

  @JsonProperty("interest_keyword_ids")
  private List<String> interestKeywordIds = null;

  @JsonProperty("isp_ids")
  private List<String> ispIds = null;

  @JsonProperty("languages")
  private List<String> languages = null;

  @JsonProperty("location_ids")
  private List<String> locationIds = null;

  @JsonProperty("min_android_version")
  private String minAndroidVersion = null;

  @JsonProperty("min_ios_version")
  private String minIosVersion = null;

  @JsonProperty("network_types")
  private List<String> networkTypes = null;

  @JsonProperty("operating_systems")
  private List<String> operatingSystems = null;

  @JsonProperty("purchase_intention_keyword_ids")
  private List<String> purchaseIntentionKeywordIds = null;

  @JsonProperty("saved_audience_id")
  private String savedAudienceId = null;

  @JsonProperty("smart_audience_enabled")
  private Boolean smartAudienceEnabled = null;

  @JsonProperty("smart_interest_behavior_enabled")
  private Boolean smartInterestBehaviorEnabled = null;

  @JsonProperty("spc_audience_age")
  private String spcAudienceAge = null;

  @JsonProperty("spending_power")
  private String spendingPower = null;

  @JsonProperty("zipcode_ids")
  private List<String> zipcodeIds = null;

  public SmartPlusAdgroupCreateBodyTargetingSpec actions(List<SmartPlusAdgroupCreateBodyTargetingSpecActions> actions) {
    this.actions = actions;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addActionsItem(SmartPlusAdgroupCreateBodyTargetingSpecActions actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<SmartPlusAdgroupCreateBodyTargetingSpecActions>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @Schema(description = "")
  public List<SmartPlusAdgroupCreateBodyTargetingSpecActions> getActions() {
    return actions;
  }

  public void setActions(List<SmartPlusAdgroupCreateBodyTargetingSpecActions> actions) {
    this.actions = actions;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec ageGroups(List<String> ageGroups) {
    this.ageGroups = ageGroups;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addAgeGroupsItem(String ageGroupsItem) {
    if (this.ageGroups == null) {
      this.ageGroups = new ArrayList<String>();
    }
    this.ageGroups.add(ageGroupsItem);
    return this;
  }

   /**
   * Get ageGroups
   * @return ageGroups
  **/
  @Schema(description = "")
  public List<String> getAgeGroups() {
    return ageGroups;
  }

  public void setAgeGroups(List<String> ageGroups) {
    this.ageGroups = ageGroups;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addAudienceIdsItem(String audienceIdsItem) {
    if (this.audienceIds == null) {
      this.audienceIds = new ArrayList<String>();
    }
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

   /**
   * Get audienceIds
   * @return audienceIds
  **/
  @Schema(description = "")
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec blockedPangleAppIds(List<String> blockedPangleAppIds) {
    this.blockedPangleAppIds = blockedPangleAppIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addBlockedPangleAppIdsItem(String blockedPangleAppIdsItem) {
    if (this.blockedPangleAppIds == null) {
      this.blockedPangleAppIds = new ArrayList<String>();
    }
    this.blockedPangleAppIds.add(blockedPangleAppIdsItem);
    return this;
  }

   /**
   * Get blockedPangleAppIds
   * @return blockedPangleAppIds
  **/
  @Schema(description = "")
  public List<String> getBlockedPangleAppIds() {
    return blockedPangleAppIds;
  }

  public void setBlockedPangleAppIds(List<String> blockedPangleAppIds) {
    this.blockedPangleAppIds = blockedPangleAppIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec carrierIds(List<String> carrierIds) {
    this.carrierIds = carrierIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addCarrierIdsItem(String carrierIdsItem) {
    if (this.carrierIds == null) {
      this.carrierIds = new ArrayList<String>();
    }
    this.carrierIds.add(carrierIdsItem);
    return this;
  }

   /**
   * Get carrierIds
   * @return carrierIds
  **/
  @Schema(description = "")
  public List<String> getCarrierIds() {
    return carrierIds;
  }

  public void setCarrierIds(List<String> carrierIds) {
    this.carrierIds = carrierIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec deviceModelIds(List<String> deviceModelIds) {
    this.deviceModelIds = deviceModelIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addDeviceModelIdsItem(String deviceModelIdsItem) {
    if (this.deviceModelIds == null) {
      this.deviceModelIds = new ArrayList<String>();
    }
    this.deviceModelIds.add(deviceModelIdsItem);
    return this;
  }

   /**
   * Get deviceModelIds
   * @return deviceModelIds
  **/
  @Schema(description = "")
  public List<String> getDeviceModelIds() {
    return deviceModelIds;
  }

  public void setDeviceModelIds(List<String> deviceModelIds) {
    this.deviceModelIds = deviceModelIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec devicePriceRanges(List<Long> devicePriceRanges) {
    this.devicePriceRanges = devicePriceRanges;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addDevicePriceRangesItem(Long devicePriceRangesItem) {
    if (this.devicePriceRanges == null) {
      this.devicePriceRanges = new ArrayList<Long>();
    }
    this.devicePriceRanges.add(devicePriceRangesItem);
    return this;
  }

   /**
   * Get devicePriceRanges
   * @return devicePriceRanges
  **/
  @Schema(description = "")
  public List<Long> getDevicePriceRanges() {
    return devicePriceRanges;
  }

  public void setDevicePriceRanges(List<Long> devicePriceRanges) {
    this.devicePriceRanges = devicePriceRanges;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec excludedAudienceIds(List<String> excludedAudienceIds) {
    this.excludedAudienceIds = excludedAudienceIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addExcludedAudienceIdsItem(String excludedAudienceIdsItem) {
    if (this.excludedAudienceIds == null) {
      this.excludedAudienceIds = new ArrayList<String>();
    }
    this.excludedAudienceIds.add(excludedAudienceIdsItem);
    return this;
  }

   /**
   * Get excludedAudienceIds
   * @return excludedAudienceIds
  **/
  @Schema(description = "")
  public List<String> getExcludedAudienceIds() {
    return excludedAudienceIds;
  }

  public void setExcludedAudienceIds(List<String> excludedAudienceIds) {
    this.excludedAudienceIds = excludedAudienceIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec excludedPangleAudiencePackageIds(List<String> excludedPangleAudiencePackageIds) {
    this.excludedPangleAudiencePackageIds = excludedPangleAudiencePackageIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addExcludedPangleAudiencePackageIdsItem(String excludedPangleAudiencePackageIdsItem) {
    if (this.excludedPangleAudiencePackageIds == null) {
      this.excludedPangleAudiencePackageIds = new ArrayList<String>();
    }
    this.excludedPangleAudiencePackageIds.add(excludedPangleAudiencePackageIdsItem);
    return this;
  }

   /**
   * Get excludedPangleAudiencePackageIds
   * @return excludedPangleAudiencePackageIds
  **/
  @Schema(description = "")
  public List<String> getExcludedPangleAudiencePackageIds() {
    return excludedPangleAudiencePackageIds;
  }

  public void setExcludedPangleAudiencePackageIds(List<String> excludedPangleAudiencePackageIds) {
    this.excludedPangleAudiencePackageIds = excludedPangleAudiencePackageIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @Schema(description = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec householdIncome(List<String> householdIncome) {
    this.householdIncome = householdIncome;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addHouseholdIncomeItem(String householdIncomeItem) {
    if (this.householdIncome == null) {
      this.householdIncome = new ArrayList<String>();
    }
    this.householdIncome.add(householdIncomeItem);
    return this;
  }

   /**
   * Get householdIncome
   * @return householdIncome
  **/
  @Schema(description = "")
  public List<String> getHouseholdIncome() {
    return householdIncome;
  }

  public void setHouseholdIncome(List<String> householdIncome) {
    this.householdIncome = householdIncome;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec includedPangleAudiencePackageIds(List<String> includedPangleAudiencePackageIds) {
    this.includedPangleAudiencePackageIds = includedPangleAudiencePackageIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addIncludedPangleAudiencePackageIdsItem(String includedPangleAudiencePackageIdsItem) {
    if (this.includedPangleAudiencePackageIds == null) {
      this.includedPangleAudiencePackageIds = new ArrayList<String>();
    }
    this.includedPangleAudiencePackageIds.add(includedPangleAudiencePackageIdsItem);
    return this;
  }

   /**
   * Get includedPangleAudiencePackageIds
   * @return includedPangleAudiencePackageIds
  **/
  @Schema(description = "")
  public List<String> getIncludedPangleAudiencePackageIds() {
    return includedPangleAudiencePackageIds;
  }

  public void setIncludedPangleAudiencePackageIds(List<String> includedPangleAudiencePackageIds) {
    this.includedPangleAudiencePackageIds = includedPangleAudiencePackageIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec interestCategoryIds(List<String> interestCategoryIds) {
    this.interestCategoryIds = interestCategoryIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addInterestCategoryIdsItem(String interestCategoryIdsItem) {
    if (this.interestCategoryIds == null) {
      this.interestCategoryIds = new ArrayList<String>();
    }
    this.interestCategoryIds.add(interestCategoryIdsItem);
    return this;
  }

   /**
   * Get interestCategoryIds
   * @return interestCategoryIds
  **/
  @Schema(description = "")
  public List<String> getInterestCategoryIds() {
    return interestCategoryIds;
  }

  public void setInterestCategoryIds(List<String> interestCategoryIds) {
    this.interestCategoryIds = interestCategoryIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec interestKeywordIds(List<String> interestKeywordIds) {
    this.interestKeywordIds = interestKeywordIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addInterestKeywordIdsItem(String interestKeywordIdsItem) {
    if (this.interestKeywordIds == null) {
      this.interestKeywordIds = new ArrayList<String>();
    }
    this.interestKeywordIds.add(interestKeywordIdsItem);
    return this;
  }

   /**
   * Get interestKeywordIds
   * @return interestKeywordIds
  **/
  @Schema(description = "")
  public List<String> getInterestKeywordIds() {
    return interestKeywordIds;
  }

  public void setInterestKeywordIds(List<String> interestKeywordIds) {
    this.interestKeywordIds = interestKeywordIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec ispIds(List<String> ispIds) {
    this.ispIds = ispIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addIspIdsItem(String ispIdsItem) {
    if (this.ispIds == null) {
      this.ispIds = new ArrayList<String>();
    }
    this.ispIds.add(ispIdsItem);
    return this;
  }

   /**
   * Get ispIds
   * @return ispIds
  **/
  @Schema(description = "")
  public List<String> getIspIds() {
    return ispIds;
  }

  public void setIspIds(List<String> ispIds) {
    this.ispIds = ispIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<String>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @Schema(description = "")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addLocationIdsItem(String locationIdsItem) {
    if (this.locationIds == null) {
      this.locationIds = new ArrayList<String>();
    }
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * Get locationIds
   * @return locationIds
  **/
  @Schema(description = "")
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec minAndroidVersion(String minAndroidVersion) {
    this.minAndroidVersion = minAndroidVersion;
    return this;
  }

   /**
   * Get minAndroidVersion
   * @return minAndroidVersion
  **/
  @Schema(description = "")
  public String getMinAndroidVersion() {
    return minAndroidVersion;
  }

  public void setMinAndroidVersion(String minAndroidVersion) {
    this.minAndroidVersion = minAndroidVersion;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec minIosVersion(String minIosVersion) {
    this.minIosVersion = minIosVersion;
    return this;
  }

   /**
   * Get minIosVersion
   * @return minIosVersion
  **/
  @Schema(description = "")
  public String getMinIosVersion() {
    return minIosVersion;
  }

  public void setMinIosVersion(String minIosVersion) {
    this.minIosVersion = minIosVersion;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec networkTypes(List<String> networkTypes) {
    this.networkTypes = networkTypes;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addNetworkTypesItem(String networkTypesItem) {
    if (this.networkTypes == null) {
      this.networkTypes = new ArrayList<String>();
    }
    this.networkTypes.add(networkTypesItem);
    return this;
  }

   /**
   * Get networkTypes
   * @return networkTypes
  **/
  @Schema(description = "")
  public List<String> getNetworkTypes() {
    return networkTypes;
  }

  public void setNetworkTypes(List<String> networkTypes) {
    this.networkTypes = networkTypes;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec operatingSystems(List<String> operatingSystems) {
    this.operatingSystems = operatingSystems;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addOperatingSystemsItem(String operatingSystemsItem) {
    if (this.operatingSystems == null) {
      this.operatingSystems = new ArrayList<String>();
    }
    this.operatingSystems.add(operatingSystemsItem);
    return this;
  }

   /**
   * Get operatingSystems
   * @return operatingSystems
  **/
  @Schema(description = "")
  public List<String> getOperatingSystems() {
    return operatingSystems;
  }

  public void setOperatingSystems(List<String> operatingSystems) {
    this.operatingSystems = operatingSystems;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec purchaseIntentionKeywordIds(List<String> purchaseIntentionKeywordIds) {
    this.purchaseIntentionKeywordIds = purchaseIntentionKeywordIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addPurchaseIntentionKeywordIdsItem(String purchaseIntentionKeywordIdsItem) {
    if (this.purchaseIntentionKeywordIds == null) {
      this.purchaseIntentionKeywordIds = new ArrayList<String>();
    }
    this.purchaseIntentionKeywordIds.add(purchaseIntentionKeywordIdsItem);
    return this;
  }

   /**
   * Get purchaseIntentionKeywordIds
   * @return purchaseIntentionKeywordIds
  **/
  @Schema(description = "")
  public List<String> getPurchaseIntentionKeywordIds() {
    return purchaseIntentionKeywordIds;
  }

  public void setPurchaseIntentionKeywordIds(List<String> purchaseIntentionKeywordIds) {
    this.purchaseIntentionKeywordIds = purchaseIntentionKeywordIds;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec savedAudienceId(String savedAudienceId) {
    this.savedAudienceId = savedAudienceId;
    return this;
  }

   /**
   * Get savedAudienceId
   * @return savedAudienceId
  **/
  @Schema(description = "")
  public String getSavedAudienceId() {
    return savedAudienceId;
  }

  public void setSavedAudienceId(String savedAudienceId) {
    this.savedAudienceId = savedAudienceId;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec smartAudienceEnabled(Boolean smartAudienceEnabled) {
    this.smartAudienceEnabled = smartAudienceEnabled;
    return this;
  }

   /**
   * Get smartAudienceEnabled
   * @return smartAudienceEnabled
  **/
  @Schema(description = "")
  public Boolean isSmartAudienceEnabled() {
    return smartAudienceEnabled;
  }

  public void setSmartAudienceEnabled(Boolean smartAudienceEnabled) {
    this.smartAudienceEnabled = smartAudienceEnabled;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec smartInterestBehaviorEnabled(Boolean smartInterestBehaviorEnabled) {
    this.smartInterestBehaviorEnabled = smartInterestBehaviorEnabled;
    return this;
  }

   /**
   * Get smartInterestBehaviorEnabled
   * @return smartInterestBehaviorEnabled
  **/
  @Schema(description = "")
  public Boolean isSmartInterestBehaviorEnabled() {
    return smartInterestBehaviorEnabled;
  }

  public void setSmartInterestBehaviorEnabled(Boolean smartInterestBehaviorEnabled) {
    this.smartInterestBehaviorEnabled = smartInterestBehaviorEnabled;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec spcAudienceAge(String spcAudienceAge) {
    this.spcAudienceAge = spcAudienceAge;
    return this;
  }

   /**
   * Get spcAudienceAge
   * @return spcAudienceAge
  **/
  @Schema(description = "")
  public String getSpcAudienceAge() {
    return spcAudienceAge;
  }

  public void setSpcAudienceAge(String spcAudienceAge) {
    this.spcAudienceAge = spcAudienceAge;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec spendingPower(String spendingPower) {
    this.spendingPower = spendingPower;
    return this;
  }

   /**
   * Get spendingPower
   * @return spendingPower
  **/
  @Schema(description = "")
  public String getSpendingPower() {
    return spendingPower;
  }

  public void setSpendingPower(String spendingPower) {
    this.spendingPower = spendingPower;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec zipcodeIds(List<String> zipcodeIds) {
    this.zipcodeIds = zipcodeIds;
    return this;
  }

  public SmartPlusAdgroupCreateBodyTargetingSpec addZipcodeIdsItem(String zipcodeIdsItem) {
    if (this.zipcodeIds == null) {
      this.zipcodeIds = new ArrayList<String>();
    }
    this.zipcodeIds.add(zipcodeIdsItem);
    return this;
  }

   /**
   * Get zipcodeIds
   * @return zipcodeIds
  **/
  @Schema(description = "")
  public List<String> getZipcodeIds() {
    return zipcodeIds;
  }

  public void setZipcodeIds(List<String> zipcodeIds) {
    this.zipcodeIds = zipcodeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdgroupCreateBodyTargetingSpec smartPlusAdgroupCreateBodyTargetingSpec = (SmartPlusAdgroupCreateBodyTargetingSpec) o;
    return Objects.equals(this.actions, smartPlusAdgroupCreateBodyTargetingSpec.actions) &&
        Objects.equals(this.ageGroups, smartPlusAdgroupCreateBodyTargetingSpec.ageGroups) &&
        Objects.equals(this.audienceIds, smartPlusAdgroupCreateBodyTargetingSpec.audienceIds) &&
        Objects.equals(this.blockedPangleAppIds, smartPlusAdgroupCreateBodyTargetingSpec.blockedPangleAppIds) &&
        Objects.equals(this.carrierIds, smartPlusAdgroupCreateBodyTargetingSpec.carrierIds) &&
        Objects.equals(this.deviceModelIds, smartPlusAdgroupCreateBodyTargetingSpec.deviceModelIds) &&
        Objects.equals(this.devicePriceRanges, smartPlusAdgroupCreateBodyTargetingSpec.devicePriceRanges) &&
        Objects.equals(this.excludedAudienceIds, smartPlusAdgroupCreateBodyTargetingSpec.excludedAudienceIds) &&
        Objects.equals(this.excludedPangleAudiencePackageIds, smartPlusAdgroupCreateBodyTargetingSpec.excludedPangleAudiencePackageIds) &&
        Objects.equals(this.gender, smartPlusAdgroupCreateBodyTargetingSpec.gender) &&
        Objects.equals(this.householdIncome, smartPlusAdgroupCreateBodyTargetingSpec.householdIncome) &&
        Objects.equals(this.includedPangleAudiencePackageIds, smartPlusAdgroupCreateBodyTargetingSpec.includedPangleAudiencePackageIds) &&
        Objects.equals(this.interestCategoryIds, smartPlusAdgroupCreateBodyTargetingSpec.interestCategoryIds) &&
        Objects.equals(this.interestKeywordIds, smartPlusAdgroupCreateBodyTargetingSpec.interestKeywordIds) &&
        Objects.equals(this.ispIds, smartPlusAdgroupCreateBodyTargetingSpec.ispIds) &&
        Objects.equals(this.languages, smartPlusAdgroupCreateBodyTargetingSpec.languages) &&
        Objects.equals(this.locationIds, smartPlusAdgroupCreateBodyTargetingSpec.locationIds) &&
        Objects.equals(this.minAndroidVersion, smartPlusAdgroupCreateBodyTargetingSpec.minAndroidVersion) &&
        Objects.equals(this.minIosVersion, smartPlusAdgroupCreateBodyTargetingSpec.minIosVersion) &&
        Objects.equals(this.networkTypes, smartPlusAdgroupCreateBodyTargetingSpec.networkTypes) &&
        Objects.equals(this.operatingSystems, smartPlusAdgroupCreateBodyTargetingSpec.operatingSystems) &&
        Objects.equals(this.purchaseIntentionKeywordIds, smartPlusAdgroupCreateBodyTargetingSpec.purchaseIntentionKeywordIds) &&
        Objects.equals(this.savedAudienceId, smartPlusAdgroupCreateBodyTargetingSpec.savedAudienceId) &&
        Objects.equals(this.smartAudienceEnabled, smartPlusAdgroupCreateBodyTargetingSpec.smartAudienceEnabled) &&
        Objects.equals(this.smartInterestBehaviorEnabled, smartPlusAdgroupCreateBodyTargetingSpec.smartInterestBehaviorEnabled) &&
        Objects.equals(this.spcAudienceAge, smartPlusAdgroupCreateBodyTargetingSpec.spcAudienceAge) &&
        Objects.equals(this.spendingPower, smartPlusAdgroupCreateBodyTargetingSpec.spendingPower) &&
        Objects.equals(this.zipcodeIds, smartPlusAdgroupCreateBodyTargetingSpec.zipcodeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, ageGroups, audienceIds, blockedPangleAppIds, carrierIds, deviceModelIds, devicePriceRanges, excludedAudienceIds, excludedPangleAudiencePackageIds, gender, householdIncome, includedPangleAudiencePackageIds, interestCategoryIds, interestKeywordIds, ispIds, languages, locationIds, minAndroidVersion, minIosVersion, networkTypes, operatingSystems, purchaseIntentionKeywordIds, savedAudienceId, smartAudienceEnabled, smartInterestBehaviorEnabled, spcAudienceAge, spendingPower, zipcodeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdgroupCreateBodyTargetingSpec {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    ageGroups: ").append(toIndentedString(ageGroups)).append("\n");
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
    sb.append("    blockedPangleAppIds: ").append(toIndentedString(blockedPangleAppIds)).append("\n");
    sb.append("    carrierIds: ").append(toIndentedString(carrierIds)).append("\n");
    sb.append("    deviceModelIds: ").append(toIndentedString(deviceModelIds)).append("\n");
    sb.append("    devicePriceRanges: ").append(toIndentedString(devicePriceRanges)).append("\n");
    sb.append("    excludedAudienceIds: ").append(toIndentedString(excludedAudienceIds)).append("\n");
    sb.append("    excludedPangleAudiencePackageIds: ").append(toIndentedString(excludedPangleAudiencePackageIds)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    householdIncome: ").append(toIndentedString(householdIncome)).append("\n");
    sb.append("    includedPangleAudiencePackageIds: ").append(toIndentedString(includedPangleAudiencePackageIds)).append("\n");
    sb.append("    interestCategoryIds: ").append(toIndentedString(interestCategoryIds)).append("\n");
    sb.append("    interestKeywordIds: ").append(toIndentedString(interestKeywordIds)).append("\n");
    sb.append("    ispIds: ").append(toIndentedString(ispIds)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    minAndroidVersion: ").append(toIndentedString(minAndroidVersion)).append("\n");
    sb.append("    minIosVersion: ").append(toIndentedString(minIosVersion)).append("\n");
    sb.append("    networkTypes: ").append(toIndentedString(networkTypes)).append("\n");
    sb.append("    operatingSystems: ").append(toIndentedString(operatingSystems)).append("\n");
    sb.append("    purchaseIntentionKeywordIds: ").append(toIndentedString(purchaseIntentionKeywordIds)).append("\n");
    sb.append("    savedAudienceId: ").append(toIndentedString(savedAudienceId)).append("\n");
    sb.append("    smartAudienceEnabled: ").append(toIndentedString(smartAudienceEnabled)).append("\n");
    sb.append("    smartInterestBehaviorEnabled: ").append(toIndentedString(smartInterestBehaviorEnabled)).append("\n");
    sb.append("    spcAudienceAge: ").append(toIndentedString(spcAudienceAge)).append("\n");
    sb.append("    spendingPower: ").append(toIndentedString(spendingPower)).append("\n");
    sb.append("    zipcodeIds: ").append(toIndentedString(zipcodeIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
