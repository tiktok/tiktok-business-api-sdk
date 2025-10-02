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
/**
 * AdAcoBodyCardList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class AdAcoBodyCardList {
  @JsonProperty("card_id")
  private String cardId = null;

  public AdAcoBodyCardList cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Display Card ID, gift code card ID, premium badge ID, Countdown Sticker ID, or Download Card ID.&lt;ul&gt;&lt;li&gt; To learn about how to get a display card ID or download card ID, please see [Use Cards in Ads](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738963975941122).To learn about how to get a premium badge ID, see [Premium Add-ons](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1749019676181505). Premium badges are only supported in R&amp;F ads.To learn about how to get a Countdown Sticker ID, see [Stickers](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1749019667506177).
   * @return cardId
  **/
  @Schema(description = "Display Card ID, gift code card ID, premium badge ID, Countdown Sticker ID, or Download Card ID.<ul><li> To learn about how to get a display card ID or download card ID, please see [Use Cards in Ads](https://ads.tiktok.com/marketing_api/docs?id=1738963975941122).To learn about how to get a premium badge ID, see [Premium Add-ons](https://ads.tiktok.com/marketing_api/docs?id=1749019676181505). Premium badges are only supported in R&F ads.To learn about how to get a Countdown Sticker ID, see [Stickers](https://ads.tiktok.com/marketing_api/docs?id=1749019667506177).")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAcoBodyCardList adAcoBodyCardList = (AdAcoBodyCardList) o;
    return Objects.equals(this.cardId, adAcoBodyCardList.cardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBodyCardList {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
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
