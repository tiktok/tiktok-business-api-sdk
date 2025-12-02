/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OptimizerRuleCreateBodyNotificationEmailSetting;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OptimizerRuleCreateBodyNotification
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class OptimizerRuleCreateBodyNotification {
  @JsonProperty("email_setting")
  private OptimizerRuleCreateBodyNotificationEmailSetting emailSetting = null;

  @JsonProperty("notification_type")
  private String notificationType = null;

  public OptimizerRuleCreateBodyNotification emailSetting(OptimizerRuleCreateBodyNotificationEmailSetting emailSetting) {
    this.emailSetting = emailSetting;
    return this;
  }

   /**
   * Get emailSetting
   * @return emailSetting
  **/
  @Schema(description = "")
  public OptimizerRuleCreateBodyNotificationEmailSetting getEmailSetting() {
    return emailSetting;
  }

  public void setEmailSetting(OptimizerRuleCreateBodyNotificationEmailSetting emailSetting) {
    this.emailSetting = emailSetting;
  }

  public OptimizerRuleCreateBodyNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Get notificationType
   * @return notificationType
  **/
  @Schema(required = true, description = "")
  public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerRuleCreateBodyNotification optimizerRuleCreateBodyNotification = (OptimizerRuleCreateBodyNotification) o;
    return Objects.equals(this.emailSetting, optimizerRuleCreateBodyNotification.emailSetting) &&
        Objects.equals(this.notificationType, optimizerRuleCreateBodyNotification.notificationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSetting, notificationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerRuleCreateBodyNotification {\n");
    
    sb.append("    emailSetting: ").append(toIndentedString(emailSetting)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
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
