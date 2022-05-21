

# UnstakeTokensAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromValidator** | [**ValidatorIdentifier**](ValidatorIdentifier.md) |  | 
**toAccount** | [**AccountIdentifier**](AccountIdentifier.md) |  | 
**amount** | [**TokenAmount**](TokenAmount.md) |  |  [optional]
**unstakePercentage** | **BigDecimal** | The percentage of currently staked XRD to unstake, where the proportion is a proportion of the current active stake at the given LedgerState. To be explicit, the referenced active state does not include pending stake, pending unstake or locked unstake.  |  [optional]



