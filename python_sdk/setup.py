# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
from setuptools import setup, find_packages  # noqa: H301

NAME = "python_sdk"
VERSION = "1.0.0"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["urllib3 >= 1.15", "six >= 1.10", "certifi", "python-dateutil"]

setup(
    name=NAME,
    version=VERSION,
    description="Tiktok Business API SDK",
    author_email="",
    url="",
    keywords=["Swagger", "Tiktok Business API SDK"],
    install_requires=REQUIRES,
    packages=find_packages(),
    include_package_data=True,
    long_description="""\
    Comprehensive collection of client libraries that enable our developers to build software to integrate with Business API faster and in a more standardized way.  # noqa: E501
    """
)
