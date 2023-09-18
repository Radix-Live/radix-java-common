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
import live.radix.core.model.PublicKey;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionHeader
 */
@JsonPropertyOrder({
  TransactionHeader.JSON_PROPERTY_NETWORK_ID,
  TransactionHeader.JSON_PROPERTY_START_EPOCH_INCLUSIVE,
  TransactionHeader.JSON_PROPERTY_END_EPOCH_EXCLUSIVE,
  TransactionHeader.JSON_PROPERTY_NONCE,
  TransactionHeader.JSON_PROPERTY_NOTARY_PUBLIC_KEY,
  TransactionHeader.JSON_PROPERTY_NOTARY_IS_SIGNATORY,
  TransactionHeader.JSON_PROPERTY_TIP_PERCENTAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class TransactionHeader {
  public static final String JSON_PROPERTY_NETWORK_ID = "network_id";
  private Integer networkId;

  public static final String JSON_PROPERTY_START_EPOCH_INCLUSIVE = "start_epoch_inclusive";
  private Long startEpochInclusive;

  public static final String JSON_PROPERTY_END_EPOCH_EXCLUSIVE = "end_epoch_exclusive";
  private Long endEpochExclusive;

  public static final String JSON_PROPERTY_NONCE = "nonce";
  private Long nonce;

  public static final String JSON_PROPERTY_NOTARY_PUBLIC_KEY = "notary_public_key";
  private PublicKey notaryPublicKey;

  public static final String JSON_PROPERTY_NOTARY_IS_SIGNATORY = "notary_is_signatory";
  private Boolean notaryIsSignatory;

  public static final String JSON_PROPERTY_TIP_PERCENTAGE = "tip_percentage";
  private Integer tipPercentage;

  public TransactionHeader() {
  }

  public TransactionHeader networkId(Integer networkId) {
    
    this.networkId = networkId;
    return this;
  }

   /**
   * The logical id of the network
   * minimum: 0
   * maximum: 255
   * @return networkId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNetworkId() {
    return networkId;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetworkId(Integer networkId) {
    this.networkId = networkId;
  }


  public TransactionHeader startEpochInclusive(Long startEpochInclusive) {
    
    this.startEpochInclusive = startEpochInclusive;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch from which the transaction can be submitted. In the case of uncommitted transactions, a value of &#x60;10^10&#x60; indicates that the epoch was &gt;&#x3D; &#x60;10^10&#x60;. 
   * minimum: 0
   * maximum: 10000000000
   * @return startEpochInclusive
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_EPOCH_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getStartEpochInclusive() {
    return startEpochInclusive;
  }


  @JsonProperty(JSON_PROPERTY_START_EPOCH_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartEpochInclusive(Long startEpochInclusive) {
    this.startEpochInclusive = startEpochInclusive;
  }


  public TransactionHeader endEpochExclusive(Long endEpochExclusive) {
    
    this.endEpochExclusive = endEpochExclusive;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch from which the transaction will no longer be valid, and be rejected. In the case of uncommitted transactions, a value of &#x60;10^10&#x60; indicates that the epoch was &gt;&#x3D; &#x60;10^10&#x60;. 
   * minimum: 0
   * maximum: 10000000000
   * @return endEpochExclusive
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END_EPOCH_EXCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getEndEpochExclusive() {
    return endEpochExclusive;
  }


  @JsonProperty(JSON_PROPERTY_END_EPOCH_EXCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndEpochExclusive(Long endEpochExclusive) {
    this.endEpochExclusive = endEpochExclusive;
  }


  public TransactionHeader nonce(Long nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, chosen to allow a unique intent to be created (to enable submitting an otherwise identical/duplicate intent). 
   * minimum: 0
   * maximum: 4294967295
   * @return nonce
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NONCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getNonce() {
    return nonce;
  }


  @JsonProperty(JSON_PROPERTY_NONCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNonce(Long nonce) {
    this.nonce = nonce;
  }


  public TransactionHeader notaryPublicKey(PublicKey notaryPublicKey) {
    
    this.notaryPublicKey = notaryPublicKey;
    return this;
  }

   /**
   * Get notaryPublicKey
   * @return notaryPublicKey
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NOTARY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PublicKey getNotaryPublicKey() {
    return notaryPublicKey;
  }


  @JsonProperty(JSON_PROPERTY_NOTARY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotaryPublicKey(PublicKey notaryPublicKey) {
    this.notaryPublicKey = notaryPublicKey;
  }


  public TransactionHeader notaryIsSignatory(Boolean notaryIsSignatory) {
    
    this.notaryIsSignatory = notaryIsSignatory;
    return this;
  }

   /**
   * Specifies whether the notary public key should be included in the transaction signers list
   * @return notaryIsSignatory
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NOTARY_IS_SIGNATORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isNotaryIsSignatory() {
    return notaryIsSignatory;
  }


  @JsonProperty(JSON_PROPERTY_NOTARY_IS_SIGNATORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotaryIsSignatory(Boolean notaryIsSignatory) {
    this.notaryIsSignatory = notaryIsSignatory;
  }


  public TransactionHeader tipPercentage(Integer tipPercentage) {
    
    this.tipPercentage = tipPercentage;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;255&#x60;, giving the validator tip as a percentage amount. A value of &#x60;1&#x60; corresponds to 1% of the fee.
   * minimum: 0
   * maximum: 255
   * @return tipPercentage
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIP_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTipPercentage() {
    return tipPercentage;
  }


  @JsonProperty(JSON_PROPERTY_TIP_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTipPercentage(Integer tipPercentage) {
    this.tipPercentage = tipPercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionHeader transactionHeader = (TransactionHeader) o;
    return Objects.equals(this.networkId, transactionHeader.networkId) &&
        Objects.equals(this.startEpochInclusive, transactionHeader.startEpochInclusive) &&
        Objects.equals(this.endEpochExclusive, transactionHeader.endEpochExclusive) &&
        Objects.equals(this.nonce, transactionHeader.nonce) &&
        Objects.equals(this.notaryPublicKey, transactionHeader.notaryPublicKey) &&
        Objects.equals(this.notaryIsSignatory, transactionHeader.notaryIsSignatory) &&
        Objects.equals(this.tipPercentage, transactionHeader.tipPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, startEpochInclusive, endEpochExclusive, nonce, notaryPublicKey, notaryIsSignatory, tipPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionHeader {\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    startEpochInclusive: ").append(toIndentedString(startEpochInclusive)).append("\n");
    sb.append("    endEpochExclusive: ").append(toIndentedString(endEpochExclusive)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    notaryPublicKey: ").append(toIndentedString(notaryPublicKey)).append("\n");
    sb.append("    notaryIsSignatory: ").append(toIndentedString(notaryIsSignatory)).append("\n");
    sb.append("    tipPercentage: ").append(toIndentedString(tipPercentage)).append("\n");
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

    // add `network_id` to the URL query string
    if (getNetworkId() != null) {
      try {
        joiner.add(String.format("%snetwork_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNetworkId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `start_epoch_inclusive` to the URL query string
    if (getStartEpochInclusive() != null) {
      try {
        joiner.add(String.format("%sstart_epoch_inclusive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartEpochInclusive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `end_epoch_exclusive` to the URL query string
    if (getEndEpochExclusive() != null) {
      try {
        joiner.add(String.format("%send_epoch_exclusive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndEpochExclusive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `nonce` to the URL query string
    if (getNonce() != null) {
      try {
        joiner.add(String.format("%snonce%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNonce()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `notary_public_key` to the URL query string
    if (getNotaryPublicKey() != null) {
      joiner.add(getNotaryPublicKey().toUrlQueryString(prefix + "notary_public_key" + suffix));
    }

    // add `notary_is_signatory` to the URL query string
    if (isNotaryIsSignatory() != null) {
      try {
        joiner.add(String.format("%snotary_is_signatory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isNotaryIsSignatory()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tip_percentage` to the URL query string
    if (getTipPercentage() != null) {
      try {
        joiner.add(String.format("%stip_percentage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTipPercentage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

