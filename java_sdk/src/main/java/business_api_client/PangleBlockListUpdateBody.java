/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * PangleBlockListUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class PangleBlockListUpdateBody {
  @JsonProperty("add_app_list")
  private List<String> addAppList = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("clear_old_app")
  private Boolean clearOldApp = false;

  @JsonProperty("delete_app_list")
  private List<String> deleteAppList = null;

  public PangleBlockListUpdateBody addAppList(List<String> addAppList) {
    this.addAppList = addAppList;
    return this;
  }

  public PangleBlockListUpdateBody addAddAppListItem(String addAppListItem) {
    if (this.addAppList == null) {
      this.addAppList = new ArrayList<String>();
    }
    this.addAppList.add(addAppListItem);
    return this;
  }

   /**
   * Get addAppList
   * @return addAppList
  **/
  @Schema(description = "")
  public List<String> getAddAppList() {
    return addAppList;
  }

  public void setAddAppList(List<String> addAppList) {
    this.addAppList = addAppList;
  }

  public PangleBlockListUpdateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @Schema(required = true, description = "")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public PangleBlockListUpdateBody clearOldApp(Boolean clearOldApp) {
    this.clearOldApp = clearOldApp;
    return this;
  }

   /**
   * Get clearOldApp
   * @return clearOldApp
  **/
  @Schema(description = "")
  public Boolean isClearOldApp() {
    return clearOldApp;
  }

  public void setClearOldApp(Boolean clearOldApp) {
    this.clearOldApp = clearOldApp;
  }

  public PangleBlockListUpdateBody deleteAppList(List<String> deleteAppList) {
    this.deleteAppList = deleteAppList;
    return this;
  }

  public PangleBlockListUpdateBody addDeleteAppListItem(String deleteAppListItem) {
    if (this.deleteAppList == null) {
      this.deleteAppList = new ArrayList<String>();
    }
    this.deleteAppList.add(deleteAppListItem);
    return this;
  }

   /**
   * Get deleteAppList
   * @return deleteAppList
  **/
  @Schema(description = "")
  public List<String> getDeleteAppList() {
    return deleteAppList;
  }

  public void setDeleteAppList(List<String> deleteAppList) {
    this.deleteAppList = deleteAppList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PangleBlockListUpdateBody pangleBlockListUpdateBody = (PangleBlockListUpdateBody) o;
    return Objects.equals(this.addAppList, pangleBlockListUpdateBody.addAppList) &&
        Objects.equals(this.advertiserId, pangleBlockListUpdateBody.advertiserId) &&
        Objects.equals(this.clearOldApp, pangleBlockListUpdateBody.clearOldApp) &&
        Objects.equals(this.deleteAppList, pangleBlockListUpdateBody.deleteAppList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addAppList, advertiserId, clearOldApp, deleteAppList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PangleBlockListUpdateBody {\n");
    
    sb.append("    addAppList: ").append(toIndentedString(addAppList)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    clearOldApp: ").append(toIndentedString(clearOldApp)).append("\n");
    sb.append("    deleteAppList: ").append(toIndentedString(deleteAppList)).append("\n");
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
