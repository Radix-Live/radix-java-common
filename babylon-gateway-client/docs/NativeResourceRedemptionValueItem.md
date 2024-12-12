

# NativeResourceRedemptionValueItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceAddress** | **String** | Bech32m-encoded human readable version of the address. |  |
|**amount** | **String** | description: String-encoded decimal representing the amount of a related fungible resource.  This gives the amount of the given resource which will be received for redeeming 1 unit resource (e.g. pool units or validator stake units).  If there is zero supply of the unit resource, then the unit redemption value has no meaning and this field will not be returned. If clients are using this value as a multiplier for calculations, they can substitute any-non zero value such as \&quot;1\&quot; for the multiplier in this case.  |  [optional] |



