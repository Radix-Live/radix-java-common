

# AccountDepositPreValidationDecidingFactors

Deciding factors used to calculate response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isBadgeAuthorizedDepositor** | **Boolean** | Whether the input badge belongs to the account&#39;s set of authorized depositors. This field will only be present if any badge was passed in the request. |  [optional] |
|**defaultDepositRule** | **AccountDefaultDepositRule** |  |  |
|**resourceSpecificDetails** | [**List&lt;AccountDepositPreValidationDecidingFactorsResourceSpecificDetailsItem&gt;**](AccountDepositPreValidationDecidingFactorsResourceSpecificDetailsItem.md) | Returns deciding factors for each resource. Contains only information about resources presented in the request, not all resource preference rules for queried account. |  [optional] |



