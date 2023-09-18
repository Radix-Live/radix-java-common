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
import live.radix.core.model.TransactionPayloadStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionPayloadDetails
 */
@JsonPropertyOrder({
  TransactionPayloadDetails.JSON_PROPERTY_PAYLOAD_HASH,
  TransactionPayloadDetails.JSON_PROPERTY_PAYLOAD_HASH_BECH32M,
  TransactionPayloadDetails.JSON_PROPERTY_STATE_VERSION,
  TransactionPayloadDetails.JSON_PROPERTY_STATUS,
  TransactionPayloadDetails.JSON_PROPERTY_ERROR_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class TransactionPayloadDetails {
  public static final String JSON_PROPERTY_PAYLOAD_HASH = "payload_hash";
  private String payloadHash;

  public static final String JSON_PROPERTY_PAYLOAD_HASH_BECH32M = "payload_hash_bech32m";
  private String payloadHashBech32m;

  public static final String JSON_PROPERTY_STATE_VERSION = "state_version";
  private Long stateVersion;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TransactionPayloadStatus status;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public TransactionPayloadDetails() {
  }

  public TransactionPayloadDetails payloadHash(String payloadHash) {
    
    this.payloadHash = payloadHash;
    return this;
  }

   /**
   * The hex-encoded notarized transaction hash for a user transaction. This hash identifies the full submittable notarized transaction - ie the signed intent, plus the notary signature. 
   * @return payloadHash
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYLOAD_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPayloadHash() {
    return payloadHash;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayloadHash(String payloadHash) {
    this.payloadHash = payloadHash;
  }


  public TransactionPayloadDetails payloadHashBech32m(String payloadHashBech32m) {
    
    this.payloadHashBech32m = payloadHashBech32m;
    return this;
  }

   /**
   * The Bech32m-encoded human readable &#x60;NotarizedTransactionHash&#x60;.
   * @return payloadHashBech32m
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYLOAD_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPayloadHashBech32m() {
    return payloadHashBech32m;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayloadHashBech32m(String payloadHashBech32m) {
    this.payloadHashBech32m = payloadHashBech32m;
  }


  public TransactionPayloadDetails stateVersion(Long stateVersion) {
    
    this.stateVersion = stateVersion;
    return this;
  }

   /**
   * Get stateVersion
   * minimum: 1
   * maximum: 100000000000000
   * @return stateVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStateVersion() {
    return stateVersion;
  }


  @JsonProperty(JSON_PROPERTY_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateVersion(Long stateVersion) {
    this.stateVersion = stateVersion;
  }


  public TransactionPayloadDetails status(TransactionPayloadStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TransactionPayloadStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(TransactionPayloadStatus status) {
    this.status = status;
  }


  public TransactionPayloadDetails errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * An explanation for the error, if failed or rejected
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionPayloadDetails transactionPayloadDetails = (TransactionPayloadDetails) o;
    return Objects.equals(this.payloadHash, transactionPayloadDetails.payloadHash) &&
        Objects.equals(this.payloadHashBech32m, transactionPayloadDetails.payloadHashBech32m) &&
        Objects.equals(this.stateVersion, transactionPayloadDetails.stateVersion) &&
        Objects.equals(this.status, transactionPayloadDetails.status) &&
        Objects.equals(this.errorMessage, transactionPayloadDetails.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payloadHash, payloadHashBech32m, stateVersion, status, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionPayloadDetails {\n");
    sb.append("    payloadHash: ").append(toIndentedString(payloadHash)).append("\n");
    sb.append("    payloadHashBech32m: ").append(toIndentedString(payloadHashBech32m)).append("\n");
    sb.append("    stateVersion: ").append(toIndentedString(stateVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

    // add `payload_hash` to the URL query string
    if (getPayloadHash() != null) {
      try {
        joiner.add(String.format("%spayload_hash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPayloadHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payload_hash_bech32m` to the URL query string
    if (getPayloadHashBech32m() != null) {
      try {
        joiner.add(String.format("%spayload_hash_bech32m%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPayloadHashBech32m()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state_version` to the URL query string
    if (getStateVersion() != null) {
      try {
        joiner.add(String.format("%sstate_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error_message` to the URL query string
    if (getErrorMessage() != null) {
      try {
        joiner.add(String.format("%serror_message%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getErrorMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
