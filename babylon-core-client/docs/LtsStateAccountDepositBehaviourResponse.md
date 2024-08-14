

# LtsStateAccountDepositBehaviourResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stateVersion** | **Long** |  |  |
|**ledgerHeaderSummary** | [**LedgerHeaderSummary**](LedgerHeaderSummary.md) | The excerpt from the ledger header committed at the &#x60;state_version&#x60;. |  |
|**defaultDepositRule** | **DefaultDepositRule** |  |  |
|**isBadgeAuthorizedDepositor** | **Boolean** | Whether the input &#x60;badge&#x60; belongs to the account&#39;s set of authorized depositors. This field will only be present if any badge was passed in the request.  |  [optional] |
|**resourceSpecificBehaviours** | [**Map&lt;String, ResourceSpecificDepositBehaviour&gt;**](ResourceSpecificDepositBehaviour.md) | A map from one of the input &#x60;resource_addresses&#x60; to its specific deposit behavior configured for this account. This field will only be present if an array of specific resource addresses was passed in the request (even if empty).  |  [optional] |



