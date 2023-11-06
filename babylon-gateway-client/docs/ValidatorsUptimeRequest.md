

# ValidatorsUptimeRequest

For `at_ledger_state` and `from_ledger_state` you can use one of `state_version`, `epoch`, `epoch` and `round`, or `timestamp`, but then ongoing epoch will be selected and used for querying data. i.e for request with `{ \"from_state_version\" = { \"state_version\" = 100 }, \"at_state_version\" = { \"state_version\" = 300} }` gateway api will check in which epoch transactions with state version 100 and 300 were and then use that as inclusive boundary for request. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atLedgerState** | [**LedgerStateSelector**](LedgerStateSelector.md) |  |  [optional] |
|**fromLedgerState** | [**LedgerStateSelector**](LedgerStateSelector.md) |  |  [optional] |
|**validatorAddresses** | **List&lt;String&gt;** |  |  [optional] |



