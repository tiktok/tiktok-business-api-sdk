# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""

from business_api_client.tiktok_business.tiktok_code import NumericErrorCodes


class TikTokSDKResponse(object):
    def __init__(self, data=None, request_id=None, code=None, message=""):
        self.data = data
        self.request_id = request_id
        self.code = code
        self.message = message

    def data(self):
        return self.data

    def request_id(self):
        return self.request_id

    def code(self):
        return self.code

    def message(self):
        return self.message

    def response(self):
        return {"data": self.data, "request_id": self.request_id}

    def is_success(self):
        if self.code == NumericErrorCodes.ERROR_CODE_OK:
            return True

        return False


class TikTokPixelResponse(TikTokSDKResponse):
    pass
