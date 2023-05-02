/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
package business_api;

import java.util.Map;
import java.util.List;

public class SDKException extends Exception {
    private String request_id;
    private long error_code;
    private String message;
    private String error_message;

    public SDKException(String request_id, long error_code, String error_message) {
        this.request_id = request_id;
        this.error_code = error_code;
        this.error_message = message;
        this.message = String.format("request_id : %s, error_code: %d, message: %s", request_id, error_code, error_message);
    }

    public String getRequestId() {
        return request_id;
    }

    public long getErrorCode() {
        return error_code;
    }

    public String getMessage() {
        return message;
    }
}