

# ValidatorFeeChangeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**epochEffective** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch at which the fee change becomes effective.  |  |
|**newFeeFactor** | **String** | A string-encoded fixed-precision decimal to 18 decimal places. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |



