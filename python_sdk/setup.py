# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
from setuptools import setup, find_packages  # noqa: H301

NAME = "tiktok-business-api-sdk-official"
VERSION = "1.0.1"

REQUIRES = ["urllib3 >= 1.15", "six >= 1.10", "certifi", "python-dateutil"]

setup(
    name=NAME,
    version=VERSION,
    description="TikTok Business API SDK",
    author="TikTok Pte. Ltd.",
    author_email="support@tiktok.com",
    url="https://github.com/tiktok/tiktok-business-api-sdk",
    keywords=["Swagger", "TikTok Business API SDK"],
    install_requires=REQUIRES,
    packages=find_packages(),
    include_package_data=True,
    long_description=open('README.md').read(),
    long_description_content_type="text/markdown",
    classifiers=[
        "Programming Language :: Python :: 3",
        "License :: OSI Approved :: MIT License",
        "Operating System :: OS Independent",
    ],
    python_requires='>=3.4',
)
