/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdAcoBodyAvatarIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AdAcoBodyAvatarIconList
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class AdAcoBodyAvatarIconList {
  @JsonProperty("avatar_icon")
  private AdAcoBodyAvatarIcon avatarIcon = null;

  public AdAcoBodyAvatarIconList avatarIcon(AdAcoBodyAvatarIcon avatarIcon) {
    this.avatarIcon = avatarIcon;
    return this;
  }

   /**
   * Get avatarIcon
   * @return avatarIcon
  **/
  @Schema(description = "")
  public AdAcoBodyAvatarIcon getAvatarIcon() {
    return avatarIcon;
  }

  public void setAvatarIcon(AdAcoBodyAvatarIcon avatarIcon) {
    this.avatarIcon = avatarIcon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAcoBodyAvatarIconList adAcoBodyAvatarIconList = (AdAcoBodyAvatarIconList) o;
    return Objects.equals(this.avatarIcon, adAcoBodyAvatarIconList.avatarIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarIcon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBodyAvatarIconList {\n");
    
    sb.append("    avatarIcon: ").append(toIndentedString(avatarIcon)).append("\n");
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
