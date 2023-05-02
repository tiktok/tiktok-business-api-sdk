# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
class ErrorCodes:
    SUCCESS_CODE = 0


class SDKError(Exception):
    def __init__(self, message, error_code, log_id, data=None):
        # Call the base class constructor with the parameters it needs
        if not data:
            error_message = "Error Code: {}, message: {}, log_id: {}".format(error_code, message, log_id)
        else:
            error_message = "Error Code: {}, message: {}, log_id: {}, data: {}".format(error_code, message, log_id, data)
        super().__init__(error_message)

class SDKResponse():
    def __init__(self, data = None, log_id = None):
        self.data = data
        self.log_id = log_id

    def response(self):
        return {"data": self.data, "log_id": self.log_id}

