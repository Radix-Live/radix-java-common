

# NonFungibleVaultContentsIndexEntryValue

This object is empty, and always present on this substate. Note that when a non-fungible is withdrawn from the vault, the full substate is deleted, which is marked by a DeletedSubstate action (rather than deletion of the value property in an UpdateSubstate action). This is because this is an Index entry, not a KeyValueStore entry. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isPresent** | **Boolean** | This is a dummy property which is always set to true and means nothing. It exists just to ensure this object has a well-defined type in OpenAPI schemas.  |  |



