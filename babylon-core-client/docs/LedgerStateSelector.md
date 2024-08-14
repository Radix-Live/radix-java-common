

# LedgerStateSelector

An optional specification of a historical ledger state at which to execute the request. The \"historical state\" feature (see the `db.historical_substate_values.enable` flag) must be enabled on the Node, and the requested point in history must be recent enough (in accordance with the Node's configured `state_hash_tree.state_version_history_length`). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **LedgerStateSelectorType** |  |  |



