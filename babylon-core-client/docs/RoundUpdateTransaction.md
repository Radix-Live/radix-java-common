

# RoundUpdateTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**proposerTimestamp** | [**InstantMs**](InstantMs.md) | The round proposer&#39;s timestamp.  Note: in abnormal cases (e.g. Byzantine network quorum), this on-ledger field may be set to an arbitrary, extreme value allowed by 64-bit signed integer. The API will still clamp the timestamp to &#x60;0 &lt;&#x3D; ms &lt;&#x3D; 100000000000000 (&#x3D;&#x3D; 10^14)&#x60;, which translates to &#x60;1970-01-01T00:00:00.000Z &lt;&#x3D; t &lt;&#x3D; 5138-11-16T09:46:40.000Z&#x60;.  |  |
|**epoch** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch.  |  |
|**roundInEpoch** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the consensus round in the epoch |  |
|**leaderProposalHistory** | [**LeaderProposalHistory**](LeaderProposalHistory.md) | A recent history (i.e. since the previous &#x60;RoundUpdateValidatorTransaction&#x60;) of consensus round leaders&#39; reliability. Used for validator emissions calculation. |  |



