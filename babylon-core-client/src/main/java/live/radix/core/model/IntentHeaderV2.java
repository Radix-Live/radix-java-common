/*
 * Radix Core API
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.3.0
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
import live.radix.core.model.ScryptoInstant;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The metadata common to both transaction intents and subintents.  The &#x60;min_proposer_timestamp_inclusive&#x60; and &#x60;max_proposer_timestamp_exclusive&#x60; are both optional. 
 */
@JsonPropertyOrder({
  IntentHeaderV2.JSON_PROPERTY_NETWORK_ID,
  IntentHeaderV2.JSON_PROPERTY_START_EPOCH_INCLUSIVE,
  IntentHeaderV2.JSON_PROPERTY_END_EPOCH_EXCLUSIVE,
  IntentHeaderV2.JSON_PROPERTY_MIN_PROPOSER_TIMESTAMP_INCLUSIVE,
  IntentHeaderV2.JSON_PROPERTY_MAX_PROPOSER_TIMESTAMP_EXCLUSIVE,
  IntentHeaderV2.JSON_PROPERTY_INTENT_DISCRIMINATOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class IntentHeaderV2 {
  public static final String JSON_PROPERTY_NETWORK_ID = "network_id";
  private Integer networkId;

  public static final String JSON_PROPERTY_START_EPOCH_INCLUSIVE = "start_epoch_inclusive";
  private Long startEpochInclusive;

  public static final String JSON_PROPERTY_END_EPOCH_EXCLUSIVE = "end_epoch_exclusive";
  private Long endEpochExclusive;

  public static final String JSON_PROPERTY_MIN_PROPOSER_TIMESTAMP_INCLUSIVE = "min_proposer_timestamp_inclusive";
  private ScryptoInstant minProposerTimestampInclusive;

  public static final String JSON_PROPERTY_MAX_PROPOSER_TIMESTAMP_EXCLUSIVE = "max_proposer_timestamp_exclusive";
  private ScryptoInstant maxProposerTimestampExclusive;

  public static final String JSON_PROPERTY_INTENT_DISCRIMINATOR = "intent_discriminator";
  private String intentDiscriminator;

  public IntentHeaderV2() {
  }

  public IntentHeaderV2 networkId(Integer networkId) {
    
    this.networkId = networkId;
    return this;
  }

  /**
   * The logical id of the network
   * minimum: 0
   * maximum: 255
   * @return networkId
   */
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

  public IntentHeaderV2 startEpochInclusive(Long startEpochInclusive) {
    
    this.startEpochInclusive = startEpochInclusive;
    return this;
  }

  /**
   * An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch from which the transaction can be submitted. In the case of uncommitted transactions, a value of &#x60;10^10&#x60; indicates that the epoch was &gt;&#x3D; &#x60;10^10&#x60;. 
   * minimum: 0
   * maximum: 10000000000
   * @return startEpochInclusive
   */
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

  public IntentHeaderV2 endEpochExclusive(Long endEpochExclusive) {
    
    this.endEpochExclusive = endEpochExclusive;
    return this;
  }

  /**
   * An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch from which the transaction will no longer be valid, and be rejected. In the case of uncommitted transactions, a value of &#x60;10^10&#x60; indicates that the epoch was &gt;&#x3D; &#x60;10^10&#x60;. 
   * minimum: 0
   * maximum: 10000000000
   * @return endEpochExclusive
   */
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

  public IntentHeaderV2 minProposerTimestampInclusive(ScryptoInstant minProposerTimestampInclusive) {
    
    this.minProposerTimestampInclusive = minProposerTimestampInclusive;
    return this;
  }

  /**
   * Get minProposerTimestampInclusive
   * @return minProposerTimestampInclusive
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_PROPOSER_TIMESTAMP_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScryptoInstant getMinProposerTimestampInclusive() {
    return minProposerTimestampInclusive;
  }


  @JsonProperty(JSON_PROPERTY_MIN_PROPOSER_TIMESTAMP_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinProposerTimestampInclusive(ScryptoInstant minProposerTimestampInclusive) {
    this.minProposerTimestampInclusive = minProposerTimestampInclusive;
  }

  public IntentHeaderV2 maxProposerTimestampExclusive(ScryptoInstant maxProposerTimestampExclusive) {
    
    this.maxProposerTimestampExclusive = maxProposerTimestampExclusive;
    return this;
  }

  /**
   * Get maxProposerTimestampExclusive
   * @return maxProposerTimestampExclusive
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_PROPOSER_TIMESTAMP_EXCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScryptoInstant getMaxProposerTimestampExclusive() {
    return maxProposerTimestampExclusive;
  }


  @JsonProperty(JSON_PROPERTY_MAX_PROPOSER_TIMESTAMP_EXCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxProposerTimestampExclusive(ScryptoInstant maxProposerTimestampExclusive) {
    this.maxProposerTimestampExclusive = maxProposerTimestampExclusive;
  }

  public IntentHeaderV2 intentDiscriminator(String intentDiscriminator) {
    
    this.intentDiscriminator = intentDiscriminator;
    return this;
  }

  /**
   * The string representation of an integer between &#x60;0&#x60; and &#x60;2^64 - 1&#x60;, which can be chosen to ensure that a unique intent can be created. It only needs to be unique for a particular intent content and epoch/timestamp, and can be safely selected randomly to very high probability.  This field was called &#x60;nonce&#x60; in the V1 models, but was a misleading name, as it got confused with a cryptographic nonce or an Ethereum-style nonce, and it is neither. 
   * @return intentDiscriminator
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTENT_DISCRIMINATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntentDiscriminator() {
    return intentDiscriminator;
  }


  @JsonProperty(JSON_PROPERTY_INTENT_DISCRIMINATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntentDiscriminator(String intentDiscriminator) {
    this.intentDiscriminator = intentDiscriminator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntentHeaderV2 intentHeaderV2 = (IntentHeaderV2) o;
    return Objects.equals(this.networkId, intentHeaderV2.networkId) &&
        Objects.equals(this.startEpochInclusive, intentHeaderV2.startEpochInclusive) &&
        Objects.equals(this.endEpochExclusive, intentHeaderV2.endEpochExclusive) &&
        Objects.equals(this.minProposerTimestampInclusive, intentHeaderV2.minProposerTimestampInclusive) &&
        Objects.equals(this.maxProposerTimestampExclusive, intentHeaderV2.maxProposerTimestampExclusive) &&
        Objects.equals(this.intentDiscriminator, intentHeaderV2.intentDiscriminator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, startEpochInclusive, endEpochExclusive, minProposerTimestampInclusive, maxProposerTimestampExclusive, intentDiscriminator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentHeaderV2 {\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    startEpochInclusive: ").append(toIndentedString(startEpochInclusive)).append("\n");
    sb.append("    endEpochExclusive: ").append(toIndentedString(endEpochExclusive)).append("\n");
    sb.append("    minProposerTimestampInclusive: ").append(toIndentedString(minProposerTimestampInclusive)).append("\n");
    sb.append("    maxProposerTimestampExclusive: ").append(toIndentedString(maxProposerTimestampExclusive)).append("\n");
    sb.append("    intentDiscriminator: ").append(toIndentedString(intentDiscriminator)).append("\n");
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

    // add `min_proposer_timestamp_inclusive` to the URL query string
    if (getMinProposerTimestampInclusive() != null) {
      joiner.add(getMinProposerTimestampInclusive().toUrlQueryString(prefix + "min_proposer_timestamp_inclusive" + suffix));
    }

    // add `max_proposer_timestamp_exclusive` to the URL query string
    if (getMaxProposerTimestampExclusive() != null) {
      joiner.add(getMaxProposerTimestampExclusive().toUrlQueryString(prefix + "max_proposer_timestamp_exclusive" + suffix));
    }

    // add `intent_discriminator` to the URL query string
    if (getIntentDiscriminator() != null) {
      try {
        joiner.add(String.format("%sintent_discriminator%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntentDiscriminator()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
