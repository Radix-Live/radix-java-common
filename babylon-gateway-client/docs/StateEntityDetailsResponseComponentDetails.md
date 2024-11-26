

# StateEntityDetailsResponseComponentDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**packageAddress** | **String** | Bech32m-encoded human readable version of the address. |  [optional] |
|**blueprintName** | **String** |  |  |
|**blueprintVersion** | **String** |  |  |
|**state** | **Object** | A representation of a component&#39;s inner state. If this entity is a &#x60;GenericComponent&#x60;, this field will be in a programmatic JSON structure (you can deserialize it as a &#x60;ProgrammaticScryptoSborValue&#x60;). Otherwise, for \&quot;native\&quot; components such as &#x60;Account&#x60;, &#x60;Validator&#x60;, &#x60;AccessController&#x60;, &#x60;OneResourcePool&#x60;, &#x60;TwoResourcePool&#x60;, and &#x60;MultiResourcePool&#x60;, this field will be a custom JSON model defined in the Core API schema.  |  [optional] |
|**roleAssignments** | [**ComponentEntityRoleAssignments**](ComponentEntityRoleAssignments.md) |  |  [optional] |
|**royaltyVaultBalance** | **String** | String-encoded decimal representing the amount of a related fungible resource. |  [optional] |
|**royaltyConfig** | [**ComponentRoyaltyConfig**](ComponentRoyaltyConfig.md) |  |  [optional] |
|**twoWayLinkedDappAddress** | **String** | Bech32m-encoded human readable version of the address. |  [optional] |
|**twoWayLinkedDappDetails** | [**TwoWayLinkedDappOnLedgerDetails**](TwoWayLinkedDappOnLedgerDetails.md) |  |  [optional] |
|**nativeResourceDetails** | [**NativeResourceDetails**](NativeResourceDetails.md) |  |  [optional] |



