

# ConsensusManagerFieldConfigValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxValidators** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, specifying the maximum number of validators in the active validator set.  |  |
|**epochChangeCondition** | [**EpochChangeCondition**](EpochChangeCondition.md) |  |  |
|**numUnstakeEpochs** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, specifying the minimum number of epochs before an unstaker can withdraw their XRD.  |  |
|**totalEmissionXrdPerEpoch** | **String** | A string-encoded fixed-precision decimal to 18 decimal places. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**minValidatorReliability** | **String** | A string-encoded fixed-precision decimal to 18 decimal places. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**numOwnerStakeUnitsUnlockEpochs** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, specifying the minimum number of epochs before an owner can take their stake units after attempting to withdraw them.  |  |
|**numFeeIncreaseDelayEpochs** | **Long** | An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, specifying the minimum number of epochs before a fee increase takes effect.  |  |
|**validatorCreationUsdEquivalentCost** | **String** | The defining decimal cost of a validator in USD. This is turned into an XRD cost through the current protocol-based USD/XRD multiplier. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**validatorCreationXrdCost** | **String** | The decimal amount of XRD required to be passed in a bucket to create a validator. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |



