

# ValidatorStakesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ledgerState** | [**LedgerState**](LedgerState.md) |  | 
**totalCount** | **Long** | The total number of accounts delegating stake to the validator in some state. | 
**nextCursor** | **String** | The cursor to be provided for the next page of results. If missing, this is the last page of results. |  [optional]
**accountStakeDelegations** | [**List&lt;ValidatorAccountStake&gt;**](ValidatorAccountStake.md) | The page of account stake delegations. | 



