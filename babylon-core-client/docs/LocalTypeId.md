

# LocalTypeId


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kind** | [**KindEnum**](#KindEnum) | The location against which to resolve this type reference. |  |
|**id** | **Long** | A reference to a type, interpreted according to &#x60;kind&#x60;: - If &#x60;WellKnown&#x60;, then it is a pointer to a well known scrypto type with that ID, - If &#x60;SchemaLocal&#x60;, then it is an index into the given schema.  |  |
|**asSbor** | [**SborData**](SborData.md) | The SBOR encoding of the LocalTypeId. This is useful for passing to the Radix Engine toolkit along with a schema.  |  |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| WELL_KNOWN | &quot;WellKnown&quot; |
| SCHEMA_LOCAL | &quot;SchemaLocal&quot; |



