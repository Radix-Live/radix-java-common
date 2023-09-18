/*
 * Babylon Gateway API - RCnet V3
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers. For simple use cases, you can typically use the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs-babylon.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  We give no guarantees that other endpoints will not change before Babylon mainnet launch, although changes are expected to be minimal. 
 *
 * The version of the OpenAPI document: 0.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.gateway.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.gateway.model.MetadataTypedValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * EntityMetadataItemValue
 */
@JsonPropertyOrder({
  EntityMetadataItemValue.JSON_PROPERTY_RAW_HEX,
  EntityMetadataItemValue.JSON_PROPERTY_PROGRAMMATIC_JSON,
  EntityMetadataItemValue.JSON_PROPERTY_TYPED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class EntityMetadataItemValue {
  public static final String JSON_PROPERTY_RAW_HEX = "raw_hex";
  private String rawHex;

  public static final String JSON_PROPERTY_PROGRAMMATIC_JSON = "programmatic_json";
  private Object programmaticJson;

  public static final String JSON_PROPERTY_TYPED = "typed";
  private MetadataTypedValue typed;

  public EntityMetadataItemValue() {
  }

  public EntityMetadataItemValue rawHex(String rawHex) {
    
    this.rawHex = rawHex;
    return this;
  }

   /**
   * Get rawHex
   * @return rawHex
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RAW_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRawHex() {
    return rawHex;
  }


  @JsonProperty(JSON_PROPERTY_RAW_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRawHex(String rawHex) {
    this.rawHex = rawHex;
  }


  public EntityMetadataItemValue programmaticJson(Object programmaticJson) {
    
    this.programmaticJson = programmaticJson;
    return this;
  }

   /**
   * Get programmaticJson
   * @return programmaticJson
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROGRAMMATIC_JSON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getProgrammaticJson() {
    return programmaticJson;
  }


  @JsonProperty(JSON_PROPERTY_PROGRAMMATIC_JSON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProgrammaticJson(Object programmaticJson) {
    this.programmaticJson = programmaticJson;
  }


  public EntityMetadataItemValue typed(MetadataTypedValue typed) {
    
    this.typed = typed;
    return this;
  }

   /**
   * Get typed
   * @return typed
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MetadataTypedValue getTyped() {
    return typed;
  }


  @JsonProperty(JSON_PROPERTY_TYPED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTyped(MetadataTypedValue typed) {
    this.typed = typed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityMetadataItemValue entityMetadataItemValue = (EntityMetadataItemValue) o;
    return Objects.equals(this.rawHex, entityMetadataItemValue.rawHex) &&
        Objects.equals(this.programmaticJson, entityMetadataItemValue.programmaticJson) &&
        Objects.equals(this.typed, entityMetadataItemValue.typed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawHex, programmaticJson, typed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityMetadataItemValue {\n");
    sb.append("    rawHex: ").append(toIndentedString(rawHex)).append("\n");
    sb.append("    programmaticJson: ").append(toIndentedString(programmaticJson)).append("\n");
    sb.append("    typed: ").append(toIndentedString(typed)).append("\n");
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

    // add `raw_hex` to the URL query string
    if (getRawHex() != null) {
      try {
        joiner.add(String.format("%sraw_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRawHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `programmatic_json` to the URL query string
    if (getProgrammaticJson() != null) {
      try {
        joiner.add(String.format("%sprogrammatic_json%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProgrammaticJson()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `typed` to the URL query string
    if (getTyped() != null) {
      joiner.add(getTyped().toUrlQueryString(prefix + "typed" + suffix));
    }

    return joiner.toString();
  }

}

