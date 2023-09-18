

# TransactionParseRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**network** | **String** | The logical name of the network |  |
|**payloadHex** | **String** | A hex-encoded payload of a full transaction or a partial transaction - either a notarized transaction, a signed transaction intent an unsigned transaction intent, or a ledger payload.  |  |
|**parseMode** | [**ParseModeEnum**](#ParseModeEnum) | The type of transaction payload that should be assumed. If omitted, \&quot;Any\&quot; is used - where the payload is attempted to be parsed as each of the following in turn: Notarized, Signed, Unsigned, Ledger.  |  [optional] |
|**validationMode** | [**ValidationModeEnum**](#ValidationModeEnum) | The type of validation that should be performed, if the payload correctly decompiles as a Notarized Transaction. This is only relevant for Notarized payloads. If omitted, \&quot;Static\&quot; is used.  |  [optional] |
|**responseMode** | [**ResponseModeEnum**](#ResponseModeEnum) | The amount of information to return in the response. \&quot;Basic\&quot; includes the type, validity information, and any relevant identifiers. \&quot;Full\&quot; also includes the fully parsed information. If omitted, \&quot;Full\&quot; is used.  |  [optional] |
|**transactionFormatOptions** | [**TransactionFormatOptions**](TransactionFormatOptions.md) |  |  [optional] |



## Enum: ParseModeEnum

| Name | Value |
|---- | -----|
| ANY | &quot;Any&quot; |
| NOTARIZED | &quot;Notarized&quot; |
| SIGNED | &quot;Signed&quot; |
| UNSIGNED | &quot;Unsigned&quot; |
| LEDGER | &quot;Ledger&quot; |



## Enum: ValidationModeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| STATIC | &quot;Static&quot; |
| FULL | &quot;Full&quot; |



## Enum: ResponseModeEnum

| Name | Value |
|---- | -----|
| BASIC | &quot;Basic&quot; |
| FULL | &quot;Full&quot; |



