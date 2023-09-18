

# LedgerStateSelector

Optional. This allows for a request to be made against a historic state. If a constraint is specified, the Gateway will resolve the request against the ledger state at that time. If not specified, requests will be made with respect to the top of the committed ledger. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stateVersion** | **Long** | If provided, the latest ledger state lower than or equal to the given state version is returned. |  [optional] |
|**timestamp** | **OffsetDateTime** | If provided, the latest ledger state lower than or equal to the given round timestamp is returned. |  [optional] |
|**epoch** | **Long** | If provided, the ledger state lower than or equal to the given epoch at round 0 is returned. |  [optional] |
|**round** | **Long** | If provided must be accompanied with &#x60;epoch&#x60;, the ledger state lower than or equal to the given epoch and round is returned. |  [optional] |



