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
import live.radix.core.model.ActiveValidatorIndex;
import live.radix.core.model.Instant;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ConsensusManagerFieldStateValue
 */
@JsonPropertyOrder({
  ConsensusManagerFieldStateValue.JSON_PROPERTY_EPOCH,
  ConsensusManagerFieldStateValue.JSON_PROPERTY_ROUND,
  ConsensusManagerFieldStateValue.JSON_PROPERTY_IS_STARTED,
  ConsensusManagerFieldStateValue.JSON_PROPERTY_EFFECTIVE_EPOCH_START,
  ConsensusManagerFieldStateValue.JSON_PROPERTY_ACTUAL_EPOCH_START,
  ConsensusManagerFieldStateValue.JSON_PROPERTY_CURRENT_LEADER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class ConsensusManagerFieldStateValue {
  public static final String JSON_PROPERTY_EPOCH = "epoch";
  private Long epoch;

  public static final String JSON_PROPERTY_ROUND = "round";
  private Long round;

  public static final String JSON_PROPERTY_IS_STARTED = "is_started";
  private Boolean isStarted;

  public static final String JSON_PROPERTY_EFFECTIVE_EPOCH_START = "effective_epoch_start";
  private Instant effectiveEpochStart;

  public static final String JSON_PROPERTY_ACTUAL_EPOCH_START = "actual_epoch_start";
  private Instant actualEpochStart;

  public static final String JSON_PROPERTY_CURRENT_LEADER = "current_leader";
  private ActiveValidatorIndex currentLeader;

  public ConsensusManagerFieldStateValue() {
  }

  public ConsensusManagerFieldStateValue epoch(Long epoch) {
    
    this.epoch = epoch;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the current epoch
   * minimum: 0
   * maximum: 10000000000
   * @return epoch
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EPOCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getEpoch() {
    return epoch;
  }


  @JsonProperty(JSON_PROPERTY_EPOCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEpoch(Long epoch) {
    this.epoch = epoch;
  }


  public ConsensusManagerFieldStateValue round(Long round) {
    
    this.round = round;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the current round in an epoch
   * minimum: 0
   * maximum: 10000000000
   * @return round
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRound() {
    return round;
  }


  @JsonProperty(JSON_PROPERTY_ROUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRound(Long round) {
    this.round = round;
  }


  public ConsensusManagerFieldStateValue isStarted(Boolean isStarted) {
    
    this.isStarted = isStarted;
    return this;
  }

   /**
   * Get isStarted
   * @return isStarted
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_STARTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsStarted() {
    return isStarted;
  }


  @JsonProperty(JSON_PROPERTY_IS_STARTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsStarted(Boolean isStarted) {
    this.isStarted = isStarted;
  }


  public ConsensusManagerFieldStateValue effectiveEpochStart(Instant effectiveEpochStart) {
    
    this.effectiveEpochStart = effectiveEpochStart;
    return this;
  }

   /**
   * Get effectiveEpochStart
   * @return effectiveEpochStart
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_EPOCH_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Instant getEffectiveEpochStart() {
    return effectiveEpochStart;
  }


  @JsonProperty(JSON_PROPERTY_EFFECTIVE_EPOCH_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEffectiveEpochStart(Instant effectiveEpochStart) {
    this.effectiveEpochStart = effectiveEpochStart;
  }


  public ConsensusManagerFieldStateValue actualEpochStart(Instant actualEpochStart) {
    
    this.actualEpochStart = actualEpochStart;
    return this;
  }

   /**
   * Get actualEpochStart
   * @return actualEpochStart
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTUAL_EPOCH_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Instant getActualEpochStart() {
    return actualEpochStart;
  }


  @JsonProperty(JSON_PROPERTY_ACTUAL_EPOCH_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActualEpochStart(Instant actualEpochStart) {
    this.actualEpochStart = actualEpochStart;
  }


  public ConsensusManagerFieldStateValue currentLeader(ActiveValidatorIndex currentLeader) {
    
    this.currentLeader = currentLeader;
    return this;
  }

   /**
   * Get currentLeader
   * @return currentLeader
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_LEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActiveValidatorIndex getCurrentLeader() {
    return currentLeader;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_LEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentLeader(ActiveValidatorIndex currentLeader) {
    this.currentLeader = currentLeader;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsensusManagerFieldStateValue consensusManagerFieldStateValue = (ConsensusManagerFieldStateValue) o;
    return Objects.equals(this.epoch, consensusManagerFieldStateValue.epoch) &&
        Objects.equals(this.round, consensusManagerFieldStateValue.round) &&
        Objects.equals(this.isStarted, consensusManagerFieldStateValue.isStarted) &&
        Objects.equals(this.effectiveEpochStart, consensusManagerFieldStateValue.effectiveEpochStart) &&
        Objects.equals(this.actualEpochStart, consensusManagerFieldStateValue.actualEpochStart) &&
        Objects.equals(this.currentLeader, consensusManagerFieldStateValue.currentLeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epoch, round, isStarted, effectiveEpochStart, actualEpochStart, currentLeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsensusManagerFieldStateValue {\n");
    sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    isStarted: ").append(toIndentedString(isStarted)).append("\n");
    sb.append("    effectiveEpochStart: ").append(toIndentedString(effectiveEpochStart)).append("\n");
    sb.append("    actualEpochStart: ").append(toIndentedString(actualEpochStart)).append("\n");
    sb.append("    currentLeader: ").append(toIndentedString(currentLeader)).append("\n");
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

    // add `epoch` to the URL query string
    if (getEpoch() != null) {
      try {
        joiner.add(String.format("%sepoch%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEpoch()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `round` to the URL query string
    if (getRound() != null) {
      try {
        joiner.add(String.format("%sround%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRound()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `is_started` to the URL query string
    if (isIsStarted() != null) {
      try {
        joiner.add(String.format("%sis_started%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsStarted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `effective_epoch_start` to the URL query string
    if (getEffectiveEpochStart() != null) {
      joiner.add(getEffectiveEpochStart().toUrlQueryString(prefix + "effective_epoch_start" + suffix));
    }

    // add `actual_epoch_start` to the URL query string
    if (getActualEpochStart() != null) {
      joiner.add(getActualEpochStart().toUrlQueryString(prefix + "actual_epoch_start" + suffix));
    }

    // add `current_leader` to the URL query string
    if (getCurrentLeader() != null) {
      joiner.add(getCurrentLeader().toUrlQueryString(prefix + "current_leader" + suffix));
    }

    return joiner.toString();
  }

}
