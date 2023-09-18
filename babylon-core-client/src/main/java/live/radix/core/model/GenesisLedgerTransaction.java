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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.core.model.LedgerTransaction;
import live.radix.core.model.LedgerTransactionType;
import live.radix.core.model.SystemTransaction;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GenesisLedgerTransaction
 */
@JsonPropertyOrder({
  GenesisLedgerTransaction.JSON_PROPERTY_IS_FLASH,
  GenesisLedgerTransaction.JSON_PROPERTY_SYSTEM_TRANSACTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class GenesisLedgerTransaction extends LedgerTransaction {
  public static final String JSON_PROPERTY_IS_FLASH = "is_flash";
  private Boolean isFlash;

  public static final String JSON_PROPERTY_SYSTEM_TRANSACTION = "system_transaction";
  private SystemTransaction systemTransaction;

  public GenesisLedgerTransaction() {

  }

  public GenesisLedgerTransaction isFlash(Boolean isFlash) {
    
    this.isFlash = isFlash;
    return this;
  }

   /**
   * The first genesis \&quot;transaction\&quot; flashes state into the database to prepare for the bootstrap transaction. Such a transaction does not have an associated &#x60;system_transaction&#x60; 
   * @return isFlash
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_FLASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsFlash() {
    return isFlash;
  }


  @JsonProperty(JSON_PROPERTY_IS_FLASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsFlash(Boolean isFlash) {
    this.isFlash = isFlash;
  }


  public GenesisLedgerTransaction systemTransaction(SystemTransaction systemTransaction) {
    
    this.systemTransaction = systemTransaction;
    return this;
  }

   /**
   * Get systemTransaction
   * @return systemTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SystemTransaction getSystemTransaction() {
    return systemTransaction;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemTransaction(SystemTransaction systemTransaction) {
    this.systemTransaction = systemTransaction;
  }

  @Override
  public GenesisLedgerTransaction type(LedgerTransactionType type) {
    this.setType(type);
    return this;
  }

  @Override
  public GenesisLedgerTransaction payloadHex(String payloadHex) {
    this.setPayloadHex(payloadHex);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenesisLedgerTransaction genesisLedgerTransaction = (GenesisLedgerTransaction) o;
    return Objects.equals(this.isFlash, genesisLedgerTransaction.isFlash) &&
        Objects.equals(this.systemTransaction, genesisLedgerTransaction.systemTransaction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFlash, systemTransaction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenesisLedgerTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isFlash: ").append(toIndentedString(isFlash)).append("\n");
    sb.append("    systemTransaction: ").append(toIndentedString(systemTransaction)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payload_hex` to the URL query string
    if (getPayloadHex() != null) {
      try {
        joiner.add(String.format("%spayload_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPayloadHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `is_flash` to the URL query string
    if (isIsFlash() != null) {
      try {
        joiner.add(String.format("%sis_flash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsFlash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `system_transaction` to the URL query string
    if (getSystemTransaction() != null) {
      joiner.add(getSystemTransaction().toUrlQueryString(prefix + "system_transaction" + suffix));
    }

    return joiner.toString();
  }

}

