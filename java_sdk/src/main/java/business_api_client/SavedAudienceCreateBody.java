/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.DmpsavedAudiencecreateActions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SavedAudienceCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class SavedAudienceCreateBody {
  @JsonProperty("actions")
  private List<DmpsavedAudiencecreateActions> actions = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("age_groups")
  private List<String> ageGroups = null;

  @JsonProperty("audience_ids")
  private List<String> audienceIds = null;

  @JsonProperty("carrier_ids")
  private List<String> carrierIds = null;

  @JsonProperty("device_model_ids")
  private List<String> deviceModelIds = null;

  @JsonProperty("device_price_ranges")
  private List<Integer> devicePriceRanges = null;

  @JsonProperty("excluded_audience_ids")
  private List<String> excludedAudienceIds = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("interest_category_ids")
  private List<String> interestCategoryIds = null;

  @JsonProperty("interest_keyword_ids")
  private List<String> interestKeywordIds = null;

  @JsonProperty("languages")
  private List<String> languages = null;

  @JsonProperty("location_ids")
  private List<String> locationIds = new ArrayList<String>();

  @JsonProperty("min_android_version")
  private String minAndroidVersion = null;

  @JsonProperty("min_ios_version")
  private String minIosVersion = null;

  @JsonProperty("network_types")
  private List<String> networkTypes = null;

  @JsonProperty("operating_systems")
  private List<String> operatingSystems = null;

  @JsonProperty("saved_audience_name")
  private String savedAudienceName = null;

  public SavedAudienceCreateBody actions(List<DmpsavedAudiencecreateActions> actions) {
    this.actions = actions;
    return this;
  }

  public SavedAudienceCreateBody addActionsItem(DmpsavedAudiencecreateActions actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<DmpsavedAudiencecreateActions>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * A list of action category objects.
   * @return actions
  **/
  @Schema(description = "A list of action category objects.")
  public List<DmpsavedAudiencecreateActions> getActions() {
    return actions;
  }

  public void setActions(List<DmpsavedAudiencecreateActions> actions) {
    this.actions = actions;
  }

  public SavedAudienceCreateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID.
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public SavedAudienceCreateBody ageGroups(List<String> ageGroups) {
    this.ageGroups = ageGroups;
    return this;
  }

  public SavedAudienceCreateBody addAgeGroupsItem(String ageGroupsItem) {
    if (this.ageGroups == null) {
      this.ageGroups = new ArrayList<String>();
    }
    this.ageGroups.add(ageGroupsItem);
    return this;
  }

   /**
   * Age groups you want to target. For enum values, see Enumeration - Targeting Age Group.
   * @return ageGroups
  **/
  @Schema(description = "Age groups you want to target. For enum values, see Enumeration - Targeting Age Group.")
  public List<String> getAgeGroups() {
    return ageGroups;
  }

  public void setAgeGroups(List<String> ageGroups) {
    this.ageGroups = ageGroups;
  }

  public SavedAudienceCreateBody audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  public SavedAudienceCreateBody addAudienceIdsItem(String audienceIdsItem) {
    if (this.audienceIds == null) {
      this.audienceIds = new ArrayList<String>();
    }
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

   /**
   * List of audience IDs. You can get audience IDs via the /dmp/custom_audience/list/ endpoint.
   * @return audienceIds
  **/
  @Schema(description = "List of audience IDs. You can get audience IDs via the /dmp/custom_audience/list/ endpoint.")
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  public SavedAudienceCreateBody carrierIds(List<String> carrierIds) {
    this.carrierIds = carrierIds;
    return this;
  }

  public SavedAudienceCreateBody addCarrierIdsItem(String carrierIdsItem) {
    if (this.carrierIds == null) {
      this.carrierIds = new ArrayList<String>();
    }
    this.carrierIds.add(carrierIdsItem);
    return this;
  }

   /**
   * Carriers that you want to target. Use /tool/carrier/ endpoint to get a list of carriers. A carrier is valid only when the in_use field for the carrier is true. The carriers must be consistent with the location(s) that you want to target.
   * @return carrierIds
  **/
  @Schema(description = "Carriers that you want to target. Use /tool/carrier/ endpoint to get a list of carriers. A carrier is valid only when the in_use field for the carrier is true. The carriers must be consistent with the location(s) that you want to target.")
  public List<String> getCarrierIds() {
    return carrierIds;
  }

  public void setCarrierIds(List<String> carrierIds) {
    this.carrierIds = carrierIds;
  }

  public SavedAudienceCreateBody deviceModelIds(List<String> deviceModelIds) {
    this.deviceModelIds = deviceModelIds;
    return this;
  }

  public SavedAudienceCreateBody addDeviceModelIdsItem(String deviceModelIdsItem) {
    if (this.deviceModelIds == null) {
      this.deviceModelIds = new ArrayList<String>();
    }
    this.deviceModelIds.add(deviceModelIdsItem);
    return this;
  }

   /**
   * IDs of the device models that you want to target. Use /tool/device_model/ to get the complete list of device model IDs and their statuses, and only active devices (is_active &#x3D; true in the response of /tool/device_model/) can be used to create ads. Note: Device model (device_model_ids) and device price (device_price_ranges) cannot be set at the same time.
   * @return deviceModelIds
  **/
  @Schema(description = "IDs of the device models that you want to target. Use /tool/device_model/ to get the complete list of device model IDs and their statuses, and only active devices (is_active = true in the response of /tool/device_model/) can be used to create ads. Note: Device model (device_model_ids) and device price (device_price_ranges) cannot be set at the same time.")
  public List<String> getDeviceModelIds() {
    return deviceModelIds;
  }

  public void setDeviceModelIds(List<String> deviceModelIds) {
    this.deviceModelIds = deviceModelIds;
  }

  public SavedAudienceCreateBody devicePriceRanges(List<Integer> devicePriceRanges) {
    this.devicePriceRanges = devicePriceRanges;
    return this;
  }

  public SavedAudienceCreateBody addDevicePriceRangesItem(Integer devicePriceRangesItem) {
    if (this.devicePriceRanges == null) {
      this.devicePriceRanges = new ArrayList<Integer>();
    }
    this.devicePriceRanges.add(devicePriceRangesItem);
    return this;
  }

   /**
   * Get devicePriceRanges
   * @return devicePriceRanges
  **/
  @Schema(description = "")
  public List<Integer> getDevicePriceRanges() {
    return devicePriceRanges;
  }

  public void setDevicePriceRanges(List<Integer> devicePriceRanges) {
    this.devicePriceRanges = devicePriceRanges;
  }

  public SavedAudienceCreateBody excludedAudienceIds(List<String> excludedAudienceIds) {
    this.excludedAudienceIds = excludedAudienceIds;
    return this;
  }

  public SavedAudienceCreateBody addExcludedAudienceIdsItem(String excludedAudienceIdsItem) {
    if (this.excludedAudienceIds == null) {
      this.excludedAudienceIds = new ArrayList<String>();
    }
    this.excludedAudienceIds.add(excludedAudienceIdsItem);
    return this;
  }

   /**
   * List of audience IDs to be excluded. You can get audience IDs via the /dmp/custom_audience/list/ endpoint.
   * @return excludedAudienceIds
  **/
  @Schema(description = "List of audience IDs to be excluded. You can get audience IDs via the /dmp/custom_audience/list/ endpoint.")
  public List<String> getExcludedAudienceIds() {
    return excludedAudienceIds;
  }

  public void setExcludedAudienceIds(List<String> excludedAudienceIds) {
    this.excludedAudienceIds = excludedAudienceIds;
  }

  public SavedAudienceCreateBody gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Gender that you want to target. Enum values: GENDER_FEMALE,GENDER_MALE,GENDER_UNLIMITED
   * @return gender
  **/
  @Schema(description = "Gender that you want to target. Enum values: GENDER_FEMALE,GENDER_MALE,GENDER_UNLIMITED")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public SavedAudienceCreateBody interestCategoryIds(List<String> interestCategoryIds) {
    this.interestCategoryIds = interestCategoryIds;
    return this;
  }

  public SavedAudienceCreateBody addInterestCategoryIdsItem(String interestCategoryIdsItem) {
    if (this.interestCategoryIds == null) {
      this.interestCategoryIds = new ArrayList<String>();
    }
    this.interestCategoryIds.add(interestCategoryIdsItem);
    return this;
  }

   /**
   * Interest classification. You can use /tool/target_recommend_tags/ to get a list of recommended interest categories based on your targeting regions and your industries, or use /tool/interest_category/ endpoint to get the complete list of interest categories. If the interest is specified, users who do not meet the interest target will be excluded during delivery. Do not specify if you wish to target everyone.
   * @return interestCategoryIds
  **/
  @Schema(description = "Interest classification. You can use /tool/target_recommend_tags/ to get a list of recommended interest categories based on your targeting regions and your industries, or use /tool/interest_category/ endpoint to get the complete list of interest categories. If the interest is specified, users who do not meet the interest target will be excluded during delivery. Do not specify if you wish to target everyone.")
  public List<String> getInterestCategoryIds() {
    return interestCategoryIds;
  }

  public void setInterestCategoryIds(List<String> interestCategoryIds) {
    this.interestCategoryIds = interestCategoryIds;
  }

  public SavedAudienceCreateBody interestKeywordIds(List<String> interestKeywordIds) {
    this.interestKeywordIds = interestKeywordIds;
    return this;
  }

  public SavedAudienceCreateBody addInterestKeywordIdsItem(String interestKeywordIdsItem) {
    if (this.interestKeywordIds == null) {
      this.interestKeywordIds = new ArrayList<String>();
    }
    this.interestKeywordIds.add(interestKeywordIdsItem);
    return this;
  }

   /**
   * IDs of interest keywords that you want to use to target audience. You can use /tool/interest_keyword/recommend/ to get recommended interest keywords.
   * @return interestKeywordIds
  **/
  @Schema(description = "IDs of interest keywords that you want to use to target audience. You can use /tool/interest_keyword/recommend/ to get recommended interest keywords.")
  public List<String> getInterestKeywordIds() {
    return interestKeywordIds;
  }

  public void setInterestKeywordIds(List<String> interestKeywordIds) {
    this.interestKeywordIds = interestKeywordIds;
  }

  public SavedAudienceCreateBody languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public SavedAudienceCreateBody addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<String>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Codes of the languages that you want to target. You can get language codes via /tool/language/, and if you don&#x27;t want to limit the languages you target, assign an empty value to this field or do not pass in this field.
   * @return languages
  **/
  @Schema(description = "Codes of the languages that you want to target. You can get language codes via /tool/language/, and if you don't want to limit the languages you target, assign an empty value to this field or do not pass in this field.")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public SavedAudienceCreateBody locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public SavedAudienceCreateBody addLocationIdsItem(String locationIdsItem) {
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * IDs of the locations that you want to target. To get the available locations and corresponding IDs, use the /tool/region/ or /tool/targeting/search/ endpoint. Note: Overlapping targeted locations are not supported. For instance, you cannot target the U.S. and the state of California at the same time. DMA-level and city-level (or lower) targeting is only available in certain countries, and the access is managed by allowlist. If you would like to access it, please contact your TikTok representative for allowlisting.
   * @return locationIds
  **/
  @Schema(required = true, description = "IDs of the locations that you want to target. To get the available locations and corresponding IDs, use the /tool/region/ or /tool/targeting/search/ endpoint. Note: Overlapping targeted locations are not supported. For instance, you cannot target the U.S. and the state of California at the same time. DMA-level and city-level (or lower) targeting is only available in certain countries, and the access is managed by allowlist. If you would like to access it, please contact your TikTok representative for allowlisting.")
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  public SavedAudienceCreateBody minAndroidVersion(String minAndroidVersion) {
    this.minAndroidVersion = minAndroidVersion;
    return this;
  }

   /**
   * Minimum device Android version. For enum values, see Enumeration - Minimum Android Version.
   * @return minAndroidVersion
  **/
  @Schema(description = "Minimum device Android version. For enum values, see Enumeration - Minimum Android Version.")
  public String getMinAndroidVersion() {
    return minAndroidVersion;
  }

  public void setMinAndroidVersion(String minAndroidVersion) {
    this.minAndroidVersion = minAndroidVersion;
  }

  public SavedAudienceCreateBody minIosVersion(String minIosVersion) {
    this.minIosVersion = minIosVersion;
    return this;
  }

   /**
   * Minimum iOS version. For enum values, see Enumeration - Minimum iOS Version.
   * @return minIosVersion
  **/
  @Schema(description = "Minimum iOS version. For enum values, see Enumeration - Minimum iOS Version.")
  public String getMinIosVersion() {
    return minIosVersion;
  }

  public void setMinIosVersion(String minIosVersion) {
    this.minIosVersion = minIosVersion;
  }

  public SavedAudienceCreateBody networkTypes(List<String> networkTypes) {
    this.networkTypes = networkTypes;
    return this;
  }

  public SavedAudienceCreateBody addNetworkTypesItem(String networkTypesItem) {
    if (this.networkTypes == null) {
      this.networkTypes = new ArrayList<String>();
    }
    this.networkTypes.add(networkTypesItem);
    return this;
  }

   /**
   * Device connection types that you want to target. Default: unlimited. For enum values, see Enumeration - Connection Type.
   * @return networkTypes
  **/
  @Schema(description = "Device connection types that you want to target. Default: unlimited. For enum values, see Enumeration - Connection Type.")
  public List<String> getNetworkTypes() {
    return networkTypes;
  }

  public void setNetworkTypes(List<String> networkTypes) {
    this.networkTypes = networkTypes;
  }

  public SavedAudienceCreateBody operatingSystems(List<String> operatingSystems) {
    this.operatingSystems = operatingSystems;
    return this;
  }

  public SavedAudienceCreateBody addOperatingSystemsItem(String operatingSystemsItem) {
    if (this.operatingSystems == null) {
      this.operatingSystems = new ArrayList<String>();
    }
    this.operatingSystems.add(operatingSystemsItem);
    return this;
  }

   /**
   * Device operating systems that you want to target. Enum values: ANDROID, IOS. Only one value is allowed.
   * @return operatingSystems
  **/
  @Schema(description = "Device operating systems that you want to target. Enum values: ANDROID, IOS. Only one value is allowed.")
  public List<String> getOperatingSystems() {
    return operatingSystems;
  }

  public void setOperatingSystems(List<String> operatingSystems) {
    this.operatingSystems = operatingSystems;
  }

  public SavedAudienceCreateBody savedAudienceName(String savedAudienceName) {
    this.savedAudienceName = savedAudienceName;
    return this;
  }

   /**
   * Saved Audience name. Character limit is 512 and cannot contain emoji.
   * @return savedAudienceName
  **/
  @Schema(required = true, description = "Saved Audience name. Character limit is 512 and cannot contain emoji.")
  public String getSavedAudienceName() {
    return savedAudienceName;
  }

  public void setSavedAudienceName(String savedAudienceName) {
    this.savedAudienceName = savedAudienceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedAudienceCreateBody savedAudienceCreateBody = (SavedAudienceCreateBody) o;
    return Objects.equals(this.actions, savedAudienceCreateBody.actions) &&
        Objects.equals(this.advertiserId, savedAudienceCreateBody.advertiserId) &&
        Objects.equals(this.ageGroups, savedAudienceCreateBody.ageGroups) &&
        Objects.equals(this.audienceIds, savedAudienceCreateBody.audienceIds) &&
        Objects.equals(this.carrierIds, savedAudienceCreateBody.carrierIds) &&
        Objects.equals(this.deviceModelIds, savedAudienceCreateBody.deviceModelIds) &&
        Objects.equals(this.devicePriceRanges, savedAudienceCreateBody.devicePriceRanges) &&
        Objects.equals(this.excludedAudienceIds, savedAudienceCreateBody.excludedAudienceIds) &&
        Objects.equals(this.gender, savedAudienceCreateBody.gender) &&
        Objects.equals(this.interestCategoryIds, savedAudienceCreateBody.interestCategoryIds) &&
        Objects.equals(this.interestKeywordIds, savedAudienceCreateBody.interestKeywordIds) &&
        Objects.equals(this.languages, savedAudienceCreateBody.languages) &&
        Objects.equals(this.locationIds, savedAudienceCreateBody.locationIds) &&
        Objects.equals(this.minAndroidVersion, savedAudienceCreateBody.minAndroidVersion) &&
        Objects.equals(this.minIosVersion, savedAudienceCreateBody.minIosVersion) &&
        Objects.equals(this.networkTypes, savedAudienceCreateBody.networkTypes) &&
        Objects.equals(this.operatingSystems, savedAudienceCreateBody.operatingSystems) &&
        Objects.equals(this.savedAudienceName, savedAudienceCreateBody.savedAudienceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, advertiserId, ageGroups, audienceIds, carrierIds, deviceModelIds, devicePriceRanges, excludedAudienceIds, gender, interestCategoryIds, interestKeywordIds, languages, locationIds, minAndroidVersion, minIosVersion, networkTypes, operatingSystems, savedAudienceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedAudienceCreateBody {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    ageGroups: ").append(toIndentedString(ageGroups)).append("\n");
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
    sb.append("    carrierIds: ").append(toIndentedString(carrierIds)).append("\n");
    sb.append("    deviceModelIds: ").append(toIndentedString(deviceModelIds)).append("\n");
    sb.append("    devicePriceRanges: ").append(toIndentedString(devicePriceRanges)).append("\n");
    sb.append("    excludedAudienceIds: ").append(toIndentedString(excludedAudienceIds)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    interestCategoryIds: ").append(toIndentedString(interestCategoryIds)).append("\n");
    sb.append("    interestKeywordIds: ").append(toIndentedString(interestKeywordIds)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    minAndroidVersion: ").append(toIndentedString(minAndroidVersion)).append("\n");
    sb.append("    minIosVersion: ").append(toIndentedString(minIosVersion)).append("\n");
    sb.append("    networkTypes: ").append(toIndentedString(networkTypes)).append("\n");
    sb.append("    operatingSystems: ").append(toIndentedString(operatingSystems)).append("\n");
    sb.append("    savedAudienceName: ").append(toIndentedString(savedAudienceName)).append("\n");
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
