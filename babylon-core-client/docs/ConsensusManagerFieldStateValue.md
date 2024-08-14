

# ConsensusManagerFieldStateValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**epoch** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the current epoch |  |
|**round** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the current round in an epoch |  |
|**isStarted** | **Boolean** |  |  |
|**effectiveEpochStart** | [**InstantMs**](InstantMs.md) | The effective time the epoch started. A drift-free measure, used to work out when the epoch should ideally end.   Note: in abnormal cases (e.g. Byzantine network quorum), this on-ledger field may be set to an arbitrary, extreme value allowed by 64-bit signed integer. The API will still clamp the timestamp to &#x60;0 &lt;&#x3D; ms &lt;&#x3D; 100000000000000 (&#x3D;&#x3D; 10^14)&#x60;, which translates to &#x60;1970-01-01T00:00:00.000Z &lt;&#x3D; t &lt;&#x3D; 5138-11-16T09:46:40.000Z&#x60;.  |  |
|**actualEpochStart** | [**InstantMs**](InstantMs.md) | The actual time the epoch started. Not used by any logic, but the difference between this and the effective start gives a measure of the time it took for the end-of-epoch to be noticed.  Note: in abnormal cases (e.g. Byzantine network quorum), this on-ledger field may be set to an arbitrary, extreme value allowed by 64-bit signed integer. The API will still clamp the timestamp to &#x60;0 &lt;&#x3D; ms &lt;&#x3D; 100000000000000 (&#x3D;&#x3D; 10^14)&#x60;, which translates to &#x60;1970-01-01T00:00:00.000Z &lt;&#x3D; t &lt;&#x3D; 5138-11-16T09:46:40.000Z&#x60;.  |  |
|**currentLeader** | [**ActiveValidatorIndex**](ActiveValidatorIndex.md) |  |  [optional] |



