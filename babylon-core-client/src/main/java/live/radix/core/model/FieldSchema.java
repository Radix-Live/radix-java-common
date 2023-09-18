/*
 * Babylon Core API - RCnet v3.1
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  It is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  This version of the Core API belongs to the fourth release candidate of the Radix Babylon network (\"RCnet v3.1\").  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` are guaranteed to be forward compatible to Babylon mainnet launch (and beyond). We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code. 
 *
 * The version of the OpenAPI document: 0.5.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.core.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.core.model.BlueprintPayloadDef;
import live.radix.core.model.FieldSchemaFeatureCondition;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * FieldSchema
 */
@JsonPropertyOrder({
  FieldSchema.JSON_PROPERTY_FIELD_TYPE_REF,
  FieldSchema.JSON_PROPERTY_CONDITION,
  FieldSchema.JSON_PROPERTY_TRANSIENT_DEFAULT_VALUE_HEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class FieldSchema {
  public static final String JSON_PROPERTY_FIELD_TYPE_REF = "field_type_ref";
  private BlueprintPayloadDef fieldTypeRef;

  public static final String JSON_PROPERTY_CONDITION = "condition";
  private FieldSchemaFeatureCondition condition;

  public static final String JSON_PROPERTY_TRANSIENT_DEFAULT_VALUE_HEX = "transient_default_value_hex";
  private String transientDefaultValueHex;

  public FieldSchema() {
  }

  public FieldSchema fieldTypeRef(BlueprintPayloadDef fieldTypeRef) {
    
    this.fieldTypeRef = fieldTypeRef;
    return this;
  }

   /**
   * Get fieldTypeRef
   * @return fieldTypeRef
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE_REF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BlueprintPayloadDef getFieldTypeRef() {
    return fieldTypeRef;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_TYPE_REF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFieldTypeRef(BlueprintPayloadDef fieldTypeRef) {
    this.fieldTypeRef = fieldTypeRef;
  }


  public FieldSchema condition(FieldSchemaFeatureCondition condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FieldSchemaFeatureCondition getCondition() {
    return condition;
  }


  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCondition(FieldSchemaFeatureCondition condition) {
    this.condition = condition;
  }


  public FieldSchema transientDefaultValueHex(String transientDefaultValueHex) {
    
    this.transientDefaultValueHex = transientDefaultValueHex;
    return this;
  }

   /**
   * The hex-encoded default value of this field. Only present if this field is transient.
   * @return transientDefaultValueHex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSIENT_DEFAULT_VALUE_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransientDefaultValueHex() {
    return transientDefaultValueHex;
  }


  @JsonProperty(JSON_PROPERTY_TRANSIENT_DEFAULT_VALUE_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransientDefaultValueHex(String transientDefaultValueHex) {
    this.transientDefaultValueHex = transientDefaultValueHex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldSchema fieldSchema = (FieldSchema) o;
    return Objects.equals(this.fieldTypeRef, fieldSchema.fieldTypeRef) &&
        Objects.equals(this.condition, fieldSchema.condition) &&
        Objects.equals(this.transientDefaultValueHex, fieldSchema.transientDefaultValueHex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldTypeRef, condition, transientDefaultValueHex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldSchema {\n");
    sb.append("    fieldTypeRef: ").append(toIndentedString(fieldTypeRef)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    transientDefaultValueHex: ").append(toIndentedString(transientDefaultValueHex)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `field_type_ref` to the URL query string
    if (getFieldTypeRef() != null) {
      joiner.add(getFieldTypeRef().toUrlQueryString(prefix + "field_type_ref" + suffix));
    }

    // add `condition` to the URL query string
    if (getCondition() != null) {
      joiner.add(getCondition().toUrlQueryString(prefix + "condition" + suffix));
    }

    // add `transient_default_value_hex` to the URL query string
    if (getTransientDefaultValueHex() != null) {
      try {
        joiner.add(String.format("%stransient_default_value_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransientDefaultValueHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
