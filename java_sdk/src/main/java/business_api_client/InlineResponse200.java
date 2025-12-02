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
 * InlineResponse200
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class InlineResponse200 {
  @JsonProperty("code")
  private Long code = null;

  @JsonProperty("data")
  private Object data = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("request_id")
  private String requestId = null;

  public InlineResponse200 code(Long code) {
    this.code = code;
    return this;
  }

   /**
   * Response code. For the complete list of response codes and descriptions, see [Appendix - Return Codes](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737172488964097). Will be shown only if it is an error request.
   * @return code
  **/
  @Schema(description = "Response code. For the complete list of response codes and descriptions, see [Appendix - Return Codes](https://ads.tiktok.com/marketing_api/docs?id=1737172488964097). Will be shown only if it is an error request.")
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public InlineResponse200 data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Returned data. The response for the SDK can be checked in the document for the API given in the description.
   * @return data
  **/
  @Schema(description = "Returned data. The response for the SDK can be checked in the document for the API given in the description.")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public InlineResponse200 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Response message. For details, see [Appendix - Return Codes](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737172488964097).
   * @return message
  **/
  @Schema(description = "Response message. For details, see [Appendix - Return Codes](https://ads.tiktok.com/marketing_api/docs?id=1737172488964097).")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse200 requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The log ID of a request, which uniquely identifies the request.
   * @return requestId
  **/
  @Schema(description = "The log ID of a request, which uniquely identifies the request.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.code, inlineResponse200.code) &&
        Objects.equals(this.data, inlineResponse200.data) &&
        Objects.equals(this.message, inlineResponse200.message) &&
        Objects.equals(this.requestId, inlineResponse200.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, message, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
