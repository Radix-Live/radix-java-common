

# ValidatorCollectionItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | Bech32m-encoded human readable version of the address. |  |
|**stakeVault** | [**ValidatorVaultItem**](ValidatorVaultItem.md) |  |  |
|**pendingXrdWithdrawVault** | [**ValidatorVaultItem**](ValidatorVaultItem.md) |  |  |
|**lockedOwnerStakeUnitVault** | [**ValidatorVaultItem**](ValidatorVaultItem.md) |  |  |
|**pendingOwnerStakeUnitUnlockVault** | [**ValidatorVaultItem**](ValidatorVaultItem.md) |  |  |
|**state** | **Object** | Validator inner state representation. This type is defined in the Core API as &#x60;ValidatorFieldStateValue&#x60;. See the Core API documentation for more details.  |  [optional] |
|**activeInEpoch** | [**ValidatorCollectionItemActiveInEpoch**](ValidatorCollectionItemActiveInEpoch.md) |  |  [optional] |
|**metadata** | [**EntityMetadataCollection**](EntityMetadataCollection.md) |  |  |



