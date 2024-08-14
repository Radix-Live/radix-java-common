

# AccountDepositPreValidationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ledgerState** | [**LedgerState**](LedgerState.md) |  |  |
|**allowsTryDepositBatch** | **Boolean** |  |  |
|**resourceSpecificBehaviour** | [**List&lt;AccountDepositPreValidationResourceSpecificBehaviourItem&gt;**](AccountDepositPreValidationResourceSpecificBehaviourItem.md) | The fully resolved try_deposit_* ability of each resource (which takes all the inputs into account, including the authorized depositor badge, the default deposit rule and the resource-specific details). |  [optional] |
|**decidingFactors** | [**AccountDepositPreValidationDecidingFactors**](AccountDepositPreValidationDecidingFactors.md) |  |  |



