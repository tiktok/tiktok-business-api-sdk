
package business_api;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

public class Response {
@JsonProperty("data")
private Object data = null;

@JsonProperty("request_id")
private String requestId = null;

public Response data(Object data) {
this.data = data;
return this;
}

/**
* Get data
* @return data
**/
@Schema(description = "")
public Object getData() {
return data;
}

public void setData(Object data) {
this.data = data;
}


public Response requestId(String requestId) {
this.requestId = requestId;
return this;
}

/**
* Get requestId
* @return requestId
**/
@Schema(description = "")
public String getRequestId() {
return requestId;
}

public void setRequestId(String requestId) {
this.requestId = requestId;
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class Response {\n");

sb.append("    data: ").append(toIndentedString(data)).append("\n");
sb.append("    request_id: ").append(toIndentedString(requestId)).append("\n");
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
