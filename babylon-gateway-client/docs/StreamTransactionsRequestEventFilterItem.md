

# StreamTransactionsRequestEventFilterItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**event** | [**EventEnum**](#EventEnum) |  |  |
|**emitterAddress** | **String** | Bech32m-encoded human readable version of the address. |  [optional] |
|**resourceAddress** | **String** | Bech32m-encoded human readable version of the address. |  [optional] |
|**quantity** | **String** | String-encoded decimal representing the amount of a related fungible resource. |  [optional] |



## Enum: EventEnum

| Name | Value |
|---- | -----|
| DEPOSIT | &quot;Deposit&quot; |
| WITHDRAWAL | &quot;Withdrawal&quot; |



