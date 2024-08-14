

# LedgerHeaderSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**epochRound** | [**EpochRound**](EpochRound.md) |  |  |
|**ledgerHashes** | [**LedgerHashes**](LedgerHashes.md) |  |  |
|**proposerTimestamp** | [**InstantMs**](InstantMs.md) | The time at which the consensus leader created the proposal for extending the ledger to the represented point.  Note: in abnormal cases (e.g. Byzantine network quorum), this on-ledger field may be set to an arbitrary, extreme value allowed by 64-bit signed integer. The API will still clamp the timestamp to &#x60;0 &lt;&#x3D; ms &lt;&#x3D; 100000000000000 (&#x3D;&#x3D; 10^14)&#x60;, which translates to &#x60;1970-01-01T00:00:00.000Z &lt;&#x3D; t &lt;&#x3D; 5138-11-16T09:46:40.000Z&#x60;.  |  |



