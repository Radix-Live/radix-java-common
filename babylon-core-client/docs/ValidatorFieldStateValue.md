

# ValidatorFieldStateValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sortedKey** | [**SubstateKey**](SubstateKey.md) |  |  [optional] |
|**publicKey** | [**EcdsaSecp256k1PublicKey**](EcdsaSecp256k1PublicKey.md) |  |  |
|**isRegistered** | **Boolean** |  |  |
|**acceptsDelegatedStake** | **Boolean** |  |  |
|**validatorFeeFactor** | **String** | A string-encoded fixed-precision decimal to 18 decimal places. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**validatorFeeChangeRequest** | [**ValidatorFeeChangeRequest**](ValidatorFeeChangeRequest.md) |  |  [optional] |
|**stakeUnitResourceAddress** | **String** | The Bech32m-encoded human readable version of the resource address |  |
|**stakeXrdVault** | [**EntityReference**](EntityReference.md) |  |  |
|**claimTokenResourceAddress** | **String** | The Bech32m-encoded human readable version of the resource address |  |
|**pendingXrdWithdrawVault** | [**EntityReference**](EntityReference.md) |  |  |
|**lockedOwnerStakeUnitVault** | [**EntityReference**](EntityReference.md) |  |  |
|**pendingOwnerStakeUnitUnlockVault** | [**EntityReference**](EntityReference.md) |  |  |
|**pendingOwnerStakeUnitWithdrawals** | [**List&lt;PendingOwnerStakeWithdrawal&gt;**](PendingOwnerStakeWithdrawal.md) |  |  |
|**alreadyUnlockedOwnerStakeUnitAmount** | **String** | A string-encoded fixed-precision decimal to 18 decimal places. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |



