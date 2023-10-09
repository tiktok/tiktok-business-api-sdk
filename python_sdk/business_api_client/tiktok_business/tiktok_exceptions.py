# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""


class TiktokSDKError(Exception):
    def __init__(self, message, error_code, request_id, data=None):
        # Call the base class constructor with the parameters it needs
        if not data:
            error_message = "Error Code: {}, message: {}, request_id: {}".format(error_code, message, request_id)
        else:
            error_message = "Error Code: {}, message: {}, request_id: {}, data: {}".format(error_code, message,
                                                                                           request_id, data)
        super().__init__(error_message)


class TiktokParameterError(TiktokSDKError):
    """Raised when a parameter or field is set with improper value."""
    pass


class TiktokPermissionError(TiktokSDKError):
    """Raised the request faces a permission limitation."""
    pass

