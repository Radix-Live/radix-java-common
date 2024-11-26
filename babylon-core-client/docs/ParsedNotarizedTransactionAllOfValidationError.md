

# ParsedNotarizedTransactionAllOfValidationError

If the transaction is known to not be valid, this gives a reason. Different levels of validation are performed, dependent on the validation mode. Note that, even if validation mode is Static or Full, the transaction may still be rejected or fail due to issues at runtime (e.g. if the loan cannot be repaid). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reason** | **String** | The error message.  |  |
|**isPermanent** | **Boolean** | Whether the error is known to be permanent, or not. This relates to whether the transaction would be rejected permanently or temporarily if submitted.  |  |



