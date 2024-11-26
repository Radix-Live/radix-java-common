

# StateEntityDetailsResponsePackageDetails

vm_type, code_hash_hex and code_hex are always going to be empty, use `codes` property which will return collection (it's possible after protocol update that package might have multiple codes)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**codes** | [**PackageCodeCollection**](PackageCodeCollection.md) |  |  |
|**vmType** | **PackageVmType** |  |  |
|**codeHashHex** | **String** | Hex-encoded binary blob. |  |
|**codeHex** | **String** | Hex-encoded binary blob. |  |
|**royaltyVaultBalance** | **String** | String-encoded decimal representing the amount of a related fungible resource. |  [optional] |
|**blueprints** | [**PackageBlueprintCollection**](PackageBlueprintCollection.md) |  |  [optional] |
|**schemas** | [**EntitySchemaCollection**](EntitySchemaCollection.md) |  |  [optional] |
|**roleAssignments** | [**ComponentEntityRoleAssignments**](ComponentEntityRoleAssignments.md) |  |  [optional] |
|**twoWayLinkedDappAddress** | **String** | Bech32m-encoded human readable version of the address. |  [optional] |



