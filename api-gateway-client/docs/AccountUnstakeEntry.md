

# AccountUnstakeEntry


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**validatorIdentifier** | [**ValidatorIdentifier**](ValidatorIdentifier.md) |  | 
**unstakingAmount** | [**TokenAmount**](TokenAmount.md) |  | 
**epochsUntilUnlocked** | **Long** | The number of epochs until the XRD in this unstake will be released back to the account. This delay is to enable stake to be slashed, if the validator misbehaves.  | 



