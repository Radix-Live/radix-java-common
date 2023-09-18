

# StateNonFungibleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**network** | **String** | The logical name of the network |  |
|**resourceAddress** | **String** | The Bech32m-encoded human readable version of the resource&#39;s global address |  |
|**nonFungibleId** | **String** | The simple string representation of the non-fungible id. For string id types, this is simply the string itself; for integer types, this is the integer as a decimal; and for the bytes id type, this is the lower case hex representation. A non-fungible resource has a fixed &#x60;NonFungibleIdType&#x60;, so this representation uniquely identifies this non-fungible under the given resource address.  |  |



