# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class CommentTaskCreateBody(object):
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
        'comment_ids': 'list[str]',
        'comment_status': 'list[str]',
        'comment_type': 'list[str]',
        'end_time': 'str',
        'lang': 'str',
        'search_field': 'str',
        'search_value': 'str',
        'sort_field': 'str',
        'sort_type': 'str',
        'start_time': 'str'
    }

    attribute_map = {
        'advertiser_id': 'advertiser_id',
        'comment_ids': 'comment_ids',
        'comment_status': 'comment_status',
        'comment_type': 'comment_type',
        'end_time': 'end_time',
        'lang': 'lang',
        'search_field': 'search_field',
        'search_value': 'search_value',
        'sort_field': 'sort_field',
        'sort_type': 'sort_type',
        'start_time': 'start_time'
    }

    def __init__(self, advertiser_id=None, comment_ids=None, comment_status=None, comment_type=None, end_time=None, lang='EN', search_field=None, search_value=None, sort_field='CREATE_TIME', sort_type='DESC', start_time=None):  # noqa: E501
        """CommentTaskCreateBody - a model defined in Swagger"""  # noqa: E501
        self._advertiser_id = None
        self._comment_ids = None
        self._comment_status = None
        self._comment_type = None
        self._end_time = None
        self._lang = None
        self._search_field = None
        self._search_value = None
        self._sort_field = None
        self._sort_type = None
        self._start_time = None
        self.discriminator = None
        self.advertiser_id = advertiser_id
        if comment_ids is not None:
            self.comment_ids = comment_ids
        if comment_status is not None:
            self.comment_status = comment_status
        if comment_type is not None:
            self.comment_type = comment_type
        self.end_time = end_time
        if lang is not None:
            self.lang = lang
        self.search_field = search_field
        self.search_value = search_value
        if sort_field is not None:
            self.sort_field = sort_field
        if sort_type is not None:
            self.sort_type = sort_type
        self.start_time = start_time

    @property
    def advertiser_id(self):
        """Gets the advertiser_id of this CommentTaskCreateBody.  # noqa: E501


        :return: The advertiser_id of this CommentTaskCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._advertiser_id

    @advertiser_id.setter
    def advertiser_id(self, advertiser_id):
        """Sets the advertiser_id of this CommentTaskCreateBody.


        :param advertiser_id: The advertiser_id of this CommentTaskCreateBody.  # noqa: E501
        :type: str
        """
        if advertiser_id is None:
            raise ValueError("Invalid value for `advertiser_id`, must not be `None`")  # noqa: E501

        self._advertiser_id = advertiser_id

    @property
    def comment_ids(self):
        """Gets the comment_ids of this CommentTaskCreateBody.  # noqa: E501


        :return: The comment_ids of this CommentTaskCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._comment_ids

    @comment_ids.setter
    def comment_ids(self, comment_ids):
        """Sets the comment_ids of this CommentTaskCreateBody.


        :param comment_ids: The comment_ids of this CommentTaskCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._comment_ids = comment_ids

    @property
    def comment_status(self):
        """Gets the comment_status of this CommentTaskCreateBody.  # noqa: E501


        :return: The comment_status of this CommentTaskCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._comment_status

    @comment_status.setter
    def comment_status(self, comment_status):
        """Sets the comment_status of this CommentTaskCreateBody.


        :param comment_status: The comment_status of this CommentTaskCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._comment_status = comment_status

    @property
    def comment_type(self):
        """Gets the comment_type of this CommentTaskCreateBody.  # noqa: E501


        :return: The comment_type of this CommentTaskCreateBody.  # noqa: E501
        :rtype: list[str]
        """
        return self._comment_type

    @comment_type.setter
    def comment_type(self, comment_type):
        """Sets the comment_type of this CommentTaskCreateBody.


        :param comment_type: The comment_type of this CommentTaskCreateBody.  # noqa: E501
        :type: list[str]
        """

        self._comment_type = comment_type

    @property
    def end_time(self):
        """Gets the end_time of this CommentTaskCreateBody.  # noqa: E501


        :return: The end_time of this CommentTaskCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """Sets the end_time of this CommentTaskCreateBody.


        :param end_time: The end_time of this CommentTaskCreateBody.  # noqa: E501
        :type: str
        """
        if end_time is None:
            raise ValueError("Invalid value for `end_time`, must not be `None`")  # noqa: E501

        self._end_time = end_time

    @property
    def lang(self):
        """Gets the lang of this CommentTaskCreateBody.  # noqa: E501


        :return: The lang of this CommentTaskCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._lang

    @lang.setter
    def lang(self, lang):
        """Sets the lang of this CommentTaskCreateBody.


        :param lang: The lang of this CommentTaskCreateBody.  # noqa: E501
        :type: str
        """

        self._lang = lang

    @property
    def search_field(self):
        """Gets the search_field of this CommentTaskCreateBody.  # noqa: E501


        :return: The search_field of this CommentTaskCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._search_field

    @search_field.setter
    def search_field(self, search_field):
        """Sets the search_field of this CommentTaskCreateBody.


        :param search_field: The search_field of this CommentTaskCreateBody.  # noqa: E501
        :type: str
        """
        if search_field is None:
            raise ValueError("Invalid value for `search_field`, must not be `None`")  # noqa: E501

        self._search_field = search_field

    @property
    def search_value(self):
        """Gets the search_value of this CommentTaskCreateBody.  # noqa: E501


        :return: The search_value of this CommentTaskCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._search_value

    @search_value.setter
    def search_value(self, search_value):
        """Sets the search_value of this CommentTaskCreateBody.


        :param search_value: The search_value of this CommentTaskCreateBody.  # noqa: E501
        :type: str
        """
        if search_value is None:
            raise ValueError("Invalid value for `search_value`, must not be `None`")  # noqa: E501

        self._search_value = search_value

    @property
    def sort_field(self):
        """Gets the sort_field of this CommentTaskCreateBody.  # noqa: E501


        :return: The sort_field of this CommentTaskCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._sort_field

    @sort_field.setter
    def sort_field(self, sort_field):
        """Sets the sort_field of this CommentTaskCreateBody.


        :param sort_field: The sort_field of this CommentTaskCreateBody.  # noqa: E501
        :type: str
        """

        self._sort_field = sort_field

    @property
    def sort_type(self):
        """Gets the sort_type of this CommentTaskCreateBody.  # noqa: E501


        :return: The sort_type of this CommentTaskCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._sort_type

    @sort_type.setter
    def sort_type(self, sort_type):
        """Sets the sort_type of this CommentTaskCreateBody.


        :param sort_type: The sort_type of this CommentTaskCreateBody.  # noqa: E501
        :type: str
        """

        self._sort_type = sort_type

    @property
    def start_time(self):
        """Gets the start_time of this CommentTaskCreateBody.  # noqa: E501


        :return: The start_time of this CommentTaskCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """Sets the start_time of this CommentTaskCreateBody.


        :param start_time: The start_time of this CommentTaskCreateBody.  # noqa: E501
        :type: str
        """
        if start_time is None:
            raise ValueError("Invalid value for `start_time`, must not be `None`")  # noqa: E501

        self._start_time = start_time

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
        if issubclass(CommentTaskCreateBody, dict):
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
        if not isinstance(other, CommentTaskCreateBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
