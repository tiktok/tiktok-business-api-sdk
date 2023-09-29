# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""

from business_api_client.__init__ import __version__


def get_sdk_version():
    version = __version__

    if not version:
        raise ValueError('Cannot find version information')

    return version
