

# TransactionFormatOptions

Requested transaction formats to include in the response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**manifest** | **Boolean** | Whether to return the raw manifest (default true) |  [optional] |
|**blobs** | **Boolean** | Whether to return the hex-encoded blobs (default false) |  [optional] |
|**message** | **Boolean** | Whether to return the transaction message (default true) |  [optional] |
|**balanceChanges** | **Boolean** | Whether to return the transaction balance changes (default false) |  [optional] |
|**rawSystemTransaction** | **Boolean** | Whether to return the raw hex-encoded system transaction bytes (default false) |  [optional] |
|**rawNotarizedTransaction** | **Boolean** | Whether to return the raw hex-encoded notarized transaction bytes (default true) |  [optional] |
|**rawLedgerTransaction** | **Boolean** | Whether to return the raw hex-encoded ledger transaction bytes (default false) |  [optional] |



