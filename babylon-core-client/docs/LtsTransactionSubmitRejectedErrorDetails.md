

# LtsTransactionSubmitRejectedErrorDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorMessage** | **String** | An explanation of the error |  |
|**isFresh** | **Boolean** | Whether (true) this rejected status has just been calculated fresh, or (false) the status is from the pending transaction result cache.  |  |
|**isPayloadRejectionPermanent** | **Boolean** | Whether the rejection of this payload is known to be permanent.  |  |
|**isIntentRejectionPermanent** | **Boolean** | Whether the rejection of this intent is known to be permanent - this is a stronger statement than the payload rejection being permanent, as it implies any payloads containing the intent will also be permanently rejected.  |  |
|**retryFromTimestamp** | [**InstantMs**](InstantMs.md) | The time after which the node will consider recalculating the validity of the transaction. Only present if the rejection is temporary, and not due to the header specifying a \&quot;from epoch\&quot; in the future.  |  [optional] |
|**retryFromEpoch** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch after which the node will consider recalculating the validity of the transaction. Only present if the rejection is temporary due to a header specifying a \&quot;from epoch\&quot; in the future.  |  [optional] |
|**invalidFromEpoch** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch from which the transaction will no longer be valid, and be permanently rejected. Only present if the rejection isn&#39;t permanent.  |  [optional] |



