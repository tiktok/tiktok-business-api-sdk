# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class PlayableUploadBody(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'advertiser_id': 'str',
        'file_id': 'str',
        'playable_package': 'str',
        'upload_type': 'str'
    }

    attribute_map = {
        'advertiser_id': 'advertiser_id',
        'file_id': 'file_id',
        'playable_package': 'playable_package',
        'upload_type': 'upload_type'
    }

    def __init__(self, advertiser_id=None, file_id=None, playable_package=None, upload_type=None):  # noqa: E501
        """PlayableUploadBody - a model defined in Swagger"""  # noqa: E501
        self._advertiser_id = None
        self._file_id = None
        self._playable_package = None
        self._upload_type = None
        self.discriminator = None
        self.advertiser_id = advertiser_id
        if file_id is not None:
            self.file_id = file_id
        if playable_package is not None:
            self.playable_package = playable_package
        if upload_type is not None:
            self.upload_type = upload_type

    @property
    def advertiser_id(self):
        """Gets the advertiser_id of this PlayableUploadBody.  # noqa: E501


        :return: The advertiser_id of this PlayableUploadBody.  # noqa: E501
        :rtype: str
        """
        return self._advertiser_id

    @advertiser_id.setter
    def advertiser_id(self, advertiser_id):
        """Sets the advertiser_id of this PlayableUploadBody.


        :param advertiser_id: The advertiser_id of this PlayableUploadBody.  # noqa: E501
        :type: str
        """
        if advertiser_id is None:
            raise ValueError("Invalid value for `advertiser_id`, must not be `None`")  # noqa: E501

        self._advertiser_id = advertiser_id

    @property
    def file_id(self):
        """Gets the file_id of this PlayableUploadBody.  # noqa: E501


        :return: The file_id of this PlayableUploadBody.  # noqa: E501
        :rtype: str
        """
        return self._file_id

    @file_id.setter
    def file_id(self, file_id):
        """Sets the file_id of this PlayableUploadBody.


        :param file_id: The file_id of this PlayableUploadBody.  # noqa: E501
        :type: str
        """

        self._file_id = file_id

    @property
    def playable_package(self):
        """Gets the playable_package of this PlayableUploadBody.  # noqa: E501


        :return: The playable_package of this PlayableUploadBody.  # noqa: E501
        :rtype: str
        """
        return self._playable_package

    @playable_package.setter
    def playable_package(self, playable_package):
        """Sets the playable_package of this PlayableUploadBody.


        :param playable_package: The playable_package of this PlayableUploadBody.  # noqa: E501
        :type: str
        """

        self._playable_package = playable_package

    @property
    def upload_type(self):
        """Gets the upload_type of this PlayableUploadBody.  # noqa: E501


        :return: The upload_type of this PlayableUploadBody.  # noqa: E501
        :rtype: str
        """
        return self._upload_type

    @upload_type.setter
    def upload_type(self, upload_type):
        """Sets the upload_type of this PlayableUploadBody.


        :param upload_type: The upload_type of this PlayableUploadBody.  # noqa: E501
        :type: str
        """

        self._upload_type = upload_type

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(PlayableUploadBody, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PlayableUploadBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
