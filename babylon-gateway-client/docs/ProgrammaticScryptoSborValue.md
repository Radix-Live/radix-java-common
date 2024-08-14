

# ProgrammaticScryptoSborValue

Arbitrary SBOR value represented as programmatic JSON with optional property name annotations.  All scalar types (`Bool`, `I*`, `U*`, `String`, `Reference`, `Own`, `Decimal`, `PreciseDecimal`, `NonFungibleLocalId`) convey their value via `value` string property with notable exception of `Bool` type that uses regular JSON boolean type. Numeric values as string-encoded to preserve accuracy and simplify implementation on platforms with no native support for 64-bit long numerical values.  Common properties represented as nullable strings:   * `type_name` is only output when a schema is present and the type has a name,   * `field_name` is only output when the value is a child of a `Tuple` or `Enum`, which has a type with named fields,   * `variant_name` is only output when a schema is present and the type is an `Enum`.  The following is a non-normative example annotated `Tuple` value with `String` and `U32` fields: ``` {   \"kind\": \"Tuple\",   \"type_name\": \"CustomStructure\",   \"fields\": [     {       \"kind\": \"String\",       \"field_name\": \"favorite_color\",       \"value\": \"Blue\"     },     {       \"kind\": \"U32\",       \"field_name\": \"usage_counter\",       \"value\": \"462231\"     }   ] } ``` 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kind** | **ProgrammaticScryptoSborValueKind** |  |  |
|**typeName** | **String** | The name of the type of this value. This is only output when a schema is present and the type has a name. This property is ignored when the value is used as an input to the API.  |  [optional] |
|**fieldName** | **String** | The name of the field which hosts this value. This property is only included if this value is a child of a &#x60;Tuple&#x60; or &#x60;Enum&#x60; with named fields. This property is ignored when the value is used as an input to the API.  |  [optional] |



