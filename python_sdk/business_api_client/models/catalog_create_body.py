# coding: utf-8

"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
import pprint
import re  # noqa: F401

import six

class CatalogCreateBody(object):
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
        'bc_id': 'str',
        'catalog_conf': 'catalogcreateCatalogConf',
        'catalog_type': 'str',
        'creative_asset_type': 'str',
        'name': 'str'
    }

    attribute_map = {
        'bc_id': 'bc_id',
        'catalog_conf': 'catalog_conf',
        'catalog_type': 'catalog_type',
        'creative_asset_type': 'creative_asset_type',
        'name': 'name'
    }

    def __init__(self, bc_id=None, catalog_conf=None, catalog_type=None, creative_asset_type=None, name=None):  # noqa: E501
        """CatalogCreateBody - a model defined in Swagger"""  # noqa: E501
        self._bc_id = None
        self._catalog_conf = None
        self._catalog_type = None
        self._creative_asset_type = None
        self._name = None
        self.discriminator = None
        self.bc_id = bc_id
        self.catalog_conf = catalog_conf
        self.catalog_type = catalog_type
        if creative_asset_type is not None:
            self.creative_asset_type = creative_asset_type
        self.name = name

    @property
    def bc_id(self):
        """Gets the bc_id of this CatalogCreateBody.  # noqa: E501


        :return: The bc_id of this CatalogCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._bc_id

    @bc_id.setter
    def bc_id(self, bc_id):
        """Sets the bc_id of this CatalogCreateBody.


        :param bc_id: The bc_id of this CatalogCreateBody.  # noqa: E501
        :type: str
        """
        if bc_id is None:
            raise ValueError("Invalid value for `bc_id`, must not be `None`")  # noqa: E501

        self._bc_id = bc_id

    @property
    def catalog_conf(self):
        """Gets the catalog_conf of this CatalogCreateBody.  # noqa: E501


        :return: The catalog_conf of this CatalogCreateBody.  # noqa: E501
        :rtype: catalogcreateCatalogConf
        """
        return self._catalog_conf

    @catalog_conf.setter
    def catalog_conf(self, catalog_conf):
        """Sets the catalog_conf of this CatalogCreateBody.


        :param catalog_conf: The catalog_conf of this CatalogCreateBody.  # noqa: E501
        :type: catalogcreateCatalogConf
        """
        if catalog_conf is None:
            raise ValueError("Invalid value for `catalog_conf`, must not be `None`")  # noqa: E501

        self._catalog_conf = catalog_conf

    @property
    def catalog_type(self):
        """Gets the catalog_type of this CatalogCreateBody.  # noqa: E501


        :return: The catalog_type of this CatalogCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._catalog_type

    @catalog_type.setter
    def catalog_type(self, catalog_type):
        """Sets the catalog_type of this CatalogCreateBody.


        :param catalog_type: The catalog_type of this CatalogCreateBody.  # noqa: E501
        :type: str
        """
        if catalog_type is None:
            raise ValueError("Invalid value for `catalog_type`, must not be `None`")  # noqa: E501

        self._catalog_type = catalog_type

    @property
    def creative_asset_type(self):
        """Gets the creative_asset_type of this CatalogCreateBody.  # noqa: E501


        :return: The creative_asset_type of this CatalogCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._creative_asset_type

    @creative_asset_type.setter
    def creative_asset_type(self, creative_asset_type):
        """Sets the creative_asset_type of this CatalogCreateBody.


        :param creative_asset_type: The creative_asset_type of this CatalogCreateBody.  # noqa: E501
        :type: str
        """

        self._creative_asset_type = creative_asset_type

    @property
    def name(self):
        """Gets the name of this CatalogCreateBody.  # noqa: E501


        :return: The name of this CatalogCreateBody.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this CatalogCreateBody.


        :param name: The name of this CatalogCreateBody.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

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
        if issubclass(CatalogCreateBody, dict):
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
        if not isinstance(other, CatalogCreateBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
