

# NonFungibleLocalId


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**simpleRep** | **String** | The simple string representation of the non-fungible id. * For string ids, this is &#x60;&lt;the-string-id&gt;&#x60; * For integer ids, this is &#x60;#the-integer-id#&#x60; * For bytes ids, this is &#x60;[the-lower-case-hex-representation]&#x60; * For RUID ids, this is &#x60;{...-...-...-...}&#x60; where &#x60;...&#x60; are each 16 hex characters. A given non-fungible resource has a fixed &#x60;NonFungibleIdType&#x60;, so this representation uniquely identifies this non-fungible under the given resource address.  |  |
|**idType** | **NonFungibleIdType** |  |  |
|**sborHex** | **String** | The hex-encoded SBOR-encoded bytes of its non-fungible id |  |



