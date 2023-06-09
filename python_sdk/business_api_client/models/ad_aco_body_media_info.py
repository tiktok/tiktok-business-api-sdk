# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class AdAcoBodyMediaInfo(object):
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
        'identity_id': 'str',
        'identity_type': 'str',
        'image_info': 'list[AdAcoBodyMediaInfoImageInfo]',
        'tiktok_item_id': 'str',
        'video_info': 'AdAcoBodyMediaInfoVideoInfo'
    }

    attribute_map = {
        'identity_id': 'identity_id',
        'identity_type': 'identity_type',
        'image_info': 'image_info',
        'tiktok_item_id': 'tiktok_item_id',
        'video_info': 'video_info'
    }

    def __init__(self, identity_id=None, identity_type=None, image_info=None, tiktok_item_id=None, video_info=None):  # noqa: E501
        """AdAcoBodyMediaInfo - a model defined in Swagger"""  # noqa: E501
        self._identity_id = None
        self._identity_type = None
        self._image_info = None
        self._tiktok_item_id = None
        self._video_info = None
        self.discriminator = None
        if identity_id is not None:
            self.identity_id = identity_id
        if identity_type is not None:
            self.identity_type = identity_type
        if image_info is not None:
            self.image_info = image_info
        if tiktok_item_id is not None:
            self.tiktok_item_id = tiktok_item_id
        if video_info is not None:
            self.video_info = video_info

    @property
    def identity_id(self):
        """Gets the identity_id of this AdAcoBodyMediaInfo.  # noqa: E501

        Identity ID. Required when you are not using Spark Ads (`tiktok_item_id`).  # noqa: E501

        :return: The identity_id of this AdAcoBodyMediaInfo.  # noqa: E501
        :rtype: str
        """
        return self._identity_id

    @identity_id.setter
    def identity_id(self, identity_id):
        """Sets the identity_id of this AdAcoBodyMediaInfo.

        Identity ID. Required when you are not using Spark Ads (`tiktok_item_id`).  # noqa: E501

        :param identity_id: The identity_id of this AdAcoBodyMediaInfo.  # noqa: E501
        :type: str
        """

        self._identity_id = identity_id

    @property
    def identity_type(self):
        """Gets the identity_type of this AdAcoBodyMediaInfo.  # noqa: E501

        Identity type. Required when you are not using Spark Ads (`tiktok_item_id`). The only supported value is `CUSTOMIZED_USER`.  # noqa: E501

        :return: The identity_type of this AdAcoBodyMediaInfo.  # noqa: E501
        :rtype: str
        """
        return self._identity_type

    @identity_type.setter
    def identity_type(self, identity_type):
        """Sets the identity_type of this AdAcoBodyMediaInfo.

        Identity type. Required when you are not using Spark Ads (`tiktok_item_id`). The only supported value is `CUSTOMIZED_USER`.  # noqa: E501

        :param identity_type: The identity_type of this AdAcoBodyMediaInfo.  # noqa: E501
        :type: str
        """

        self._identity_type = identity_type

    @property
    def image_info(self):
        """Gets the image_info of this AdAcoBodyMediaInfo.  # noqa: E501

        Image information. When you want to upload image materials (`video_info` is NOT included in the request), this field will be used as image materials. When you want to upload video materials (`video_info` is included in the request), this field will be used as the video cover. Only 1 picture can be submitted in each `image_info` object.  # noqa: E501

        :return: The image_info of this AdAcoBodyMediaInfo.  # noqa: E501
        :rtype: list[AdAcoBodyMediaInfoImageInfo]
        """
        return self._image_info

    @image_info.setter
    def image_info(self, image_info):
        """Sets the image_info of this AdAcoBodyMediaInfo.

        Image information. When you want to upload image materials (`video_info` is NOT included in the request), this field will be used as image materials. When you want to upload video materials (`video_info` is included in the request), this field will be used as the video cover. Only 1 picture can be submitted in each `image_info` object.  # noqa: E501

        :param image_info: The image_info of this AdAcoBodyMediaInfo.  # noqa: E501
        :type: list[AdAcoBodyMediaInfoImageInfo]
        """

        self._image_info = image_info

    @property
    def tiktok_item_id(self):
        """Gets the tiktok_item_id of this AdAcoBodyMediaInfo.  # noqa: E501

        The ID of the TikTok post to be used as an ad (Spark Ad). Pass in the `tiktok_item_id` you get from the response of the [/tt_video/info/](https://ads.tiktok.com/marketing_api/docs?id=1738376324021250) and  [/identity/video/get/](https://ads.tiktok.com/marketing_api/docs?id=1740218475032577) endpoints.  # noqa: E501

        :return: The tiktok_item_id of this AdAcoBodyMediaInfo.  # noqa: E501
        :rtype: str
        """
        return self._tiktok_item_id

    @tiktok_item_id.setter
    def tiktok_item_id(self, tiktok_item_id):
        """Sets the tiktok_item_id of this AdAcoBodyMediaInfo.

        The ID of the TikTok post to be used as an ad (Spark Ad). Pass in the `tiktok_item_id` you get from the response of the [/tt_video/info/](https://ads.tiktok.com/marketing_api/docs?id=1738376324021250) and  [/identity/video/get/](https://ads.tiktok.com/marketing_api/docs?id=1740218475032577) endpoints.  # noqa: E501

        :param tiktok_item_id: The tiktok_item_id of this AdAcoBodyMediaInfo.  # noqa: E501
        :type: str
        """

        self._tiktok_item_id = tiktok_item_id

    @property
    def video_info(self):
        """Gets the video_info of this AdAcoBodyMediaInfo.  # noqa: E501


        :return: The video_info of this AdAcoBodyMediaInfo.  # noqa: E501
        :rtype: AdAcoBodyMediaInfoVideoInfo
        """
        return self._video_info

    @video_info.setter
    def video_info(self, video_info):
        """Sets the video_info of this AdAcoBodyMediaInfo.


        :param video_info: The video_info of this AdAcoBodyMediaInfo.  # noqa: E501
        :type: AdAcoBodyMediaInfoVideoInfo
        """

        self._video_info = video_info

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
        if issubclass(AdAcoBodyMediaInfo, dict):
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
        if not isinstance(other, AdAcoBodyMediaInfo):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
