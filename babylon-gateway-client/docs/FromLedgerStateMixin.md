

# FromLedgerStateMixin

defines lower boundary (inclusive) for queried data. i.e `{ \"from_state_version\" = {\"epoch\" = 10} }`, will return data from epoch 10 till current max ledger tip.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromLedgerState** | [**LedgerStateSelector**](LedgerStateSelector.md) |  |  [optional] |



