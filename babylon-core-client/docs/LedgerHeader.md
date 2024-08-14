

# LedgerHeader


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**epoch** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch. |  |
|**round** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the current round in an epoch |  |
|**stateVersion** | **Long** |  |  |
|**hashes** | [**LedgerHashes**](LedgerHashes.md) |  |  |
|**consensusParentRoundTimestampMs** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^14&#x60;, marking the consensus parent round timestamp in ms. |  |
|**proposerTimestampMs** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^14&#x60;, marking the proposer timestamp in ms. |  |
|**nextEpoch** | [**NextEpoch**](NextEpoch.md) |  |  [optional] |
|**nextProtocolVersion** | **String** | If present, indicates that this proof triggers the enactment of the given protocol version. |  [optional] |



