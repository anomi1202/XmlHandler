# XmlHandler

1. For replace param - replaceTagName = tagName
	- Example: setParamToXml(tagName, newValue) - do replace value of "tagName" to "newValue"
		* \<tagName>oldValue\</tagName> => \<tagName>newValue\</tagName>

2. For replace attribute - replaceTagName = tagName::arrtName
	- Example: setParamToXml(tagAndAttrName, newValue) - do replace attribute of "tagName" to "newValue"
		* \<tagName attributeName = oldValue >\</tagName> => \<tagName attributeName = newValue >\</tagName>
