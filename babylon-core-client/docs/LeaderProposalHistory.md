

# LeaderProposalHistory


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gapRoundLeaders** | [**List&lt;ActiveValidatorIndex&gt;**](ActiveValidatorIndex.md) | The validators which were leaders of the \&quot;gap\&quot; rounds (i.e. since the previous &#x60;RoundUpdateValidatorTransaction&#x60; - which means that this list will contain exactly &#x60;current.round - previous.round - 1&#x60; elements). The validators on this list should be penalized during emissions at the end of the epoch. |  |
|**currentLeader** | [**ActiveValidatorIndex**](ActiveValidatorIndex.md) | The leader of the concluded round. |  |
|**isFallback** | **Boolean** | Whether the concluded round was conducted in a \&quot;fallback\&quot; mode (i.e. indicating a fault of the current leader). When &#x60;true&#x60;, the &#x60;current_leader&#x60; should be penalized during emissions in the same way as &#x60;gap_round_leaders&#x60;. When &#x60;false&#x60;, the &#x60;current_leader&#x60; is considered to have made this round&#39;s proposal successfully. |  |



