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
 * OptimizerRuleCreateBodyNotificationEmailSetting
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class OptimizerRuleCreateBodyNotificationEmailSetting {
  @JsonProperty("email_exec_time")
  private List<String> emailExecTime = null;

  @JsonProperty("mute_option")
  private String muteOption = null;

  @JsonProperty("no_result_notification")
  private Boolean noResultNotification = null;

  @JsonProperty("notification_period")
  private String notificationPeriod = null;

  public OptimizerRuleCreateBodyNotificationEmailSetting emailExecTime(List<String> emailExecTime) {
    this.emailExecTime = emailExecTime;
    return this;
  }

  public OptimizerRuleCreateBodyNotificationEmailSetting addEmailExecTimeItem(String emailExecTimeItem) {
    if (this.emailExecTime == null) {
      this.emailExecTime = new ArrayList<String>();
    }
    this.emailExecTime.add(emailExecTimeItem);
    return this;
  }

   /**
   * Get emailExecTime
   * @return emailExecTime
  **/
  @Schema(description = "")
  public List<String> getEmailExecTime() {
    return emailExecTime;
  }

  public void setEmailExecTime(List<String> emailExecTime) {
    this.emailExecTime = emailExecTime;
  }

  public OptimizerRuleCreateBodyNotificationEmailSetting muteOption(String muteOption) {
    this.muteOption = muteOption;
    return this;
  }

   /**
   * Get muteOption
   * @return muteOption
  **/
  @Schema(description = "")
  public String getMuteOption() {
    return muteOption;
  }

  public void setMuteOption(String muteOption) {
    this.muteOption = muteOption;
  }

  public OptimizerRuleCreateBodyNotificationEmailSetting noResultNotification(Boolean noResultNotification) {
    this.noResultNotification = noResultNotification;
    return this;
  }

   /**
   * Get noResultNotification
   * @return noResultNotification
  **/
  @Schema(description = "")
  public Boolean isNoResultNotification() {
    return noResultNotification;
  }

  public void setNoResultNotification(Boolean noResultNotification) {
    this.noResultNotification = noResultNotification;
  }

  public OptimizerRuleCreateBodyNotificationEmailSetting notificationPeriod(String notificationPeriod) {
    this.notificationPeriod = notificationPeriod;
    return this;
  }

   /**
   * Get notificationPeriod
   * @return notificationPeriod
  **/
  @Schema(description = "")
  public String getNotificationPeriod() {
    return notificationPeriod;
  }

  public void setNotificationPeriod(String notificationPeriod) {
    this.notificationPeriod = notificationPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerRuleCreateBodyNotificationEmailSetting optimizerRuleCreateBodyNotificationEmailSetting = (OptimizerRuleCreateBodyNotificationEmailSetting) o;
    return Objects.equals(this.emailExecTime, optimizerRuleCreateBodyNotificationEmailSetting.emailExecTime) &&
        Objects.equals(this.muteOption, optimizerRuleCreateBodyNotificationEmailSetting.muteOption) &&
        Objects.equals(this.noResultNotification, optimizerRuleCreateBodyNotificationEmailSetting.noResultNotification) &&
        Objects.equals(this.notificationPeriod, optimizerRuleCreateBodyNotificationEmailSetting.notificationPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailExecTime, muteOption, noResultNotification, notificationPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerRuleCreateBodyNotificationEmailSetting {\n");
    
    sb.append("    emailExecTime: ").append(toIndentedString(emailExecTime)).append("\n");
    sb.append("    muteOption: ").append(toIndentedString(muteOption)).append("\n");
    sb.append("    noResultNotification: ").append(toIndentedString(noResultNotification)).append("\n");
    sb.append("    notificationPeriod: ").append(toIndentedString(notificationPeriod)).append("\n");
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
