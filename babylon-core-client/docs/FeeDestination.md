

# FeeDestination


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**toProposer** | **String** | The string-encoded decimal representing the amount of fee in XRD paid to the proposer. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**toValidatorSet** | **String** | The string-encoded decimal representing the amount of fee in XRD paid to the validator set. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**toBurn** | **String** | The string-encoded decimal representing the amount of fee burnt, in XRD. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**toRoyaltyRecipients** | [**List&lt;PaymentToRoyaltyRecipient&gt;**](PaymentToRoyaltyRecipient.md) | A breakdown of where the royalties were paid to.  |  |



