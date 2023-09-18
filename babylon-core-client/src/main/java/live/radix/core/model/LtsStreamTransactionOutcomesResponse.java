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
import java.util.ArrayList;
import java.util.List;
import live.radix.core.model.LtsCommittedTransactionOutcome;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * LtsStreamTransactionOutcomesResponse
 */
@JsonPropertyOrder({
  LtsStreamTransactionOutcomesResponse.JSON_PROPERTY_FROM_STATE_VERSION,
  LtsStreamTransactionOutcomesResponse.JSON_PROPERTY_COUNT,
  LtsStreamTransactionOutcomesResponse.JSON_PROPERTY_MAX_LEDGER_STATE_VERSION,
  LtsStreamTransactionOutcomesResponse.JSON_PROPERTY_COMMITTED_TRANSACTION_OUTCOMES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class LtsStreamTransactionOutcomesResponse {
  public static final String JSON_PROPERTY_FROM_STATE_VERSION = "from_state_version";
  private Long fromStateVersion;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_MAX_LEDGER_STATE_VERSION = "max_ledger_state_version";
  private Long maxLedgerStateVersion;

  public static final String JSON_PROPERTY_COMMITTED_TRANSACTION_OUTCOMES = "committed_transaction_outcomes";
  private List<LtsCommittedTransactionOutcome> committedTransactionOutcomes = new ArrayList<>();

  public LtsStreamTransactionOutcomesResponse() {
  }

  public LtsStreamTransactionOutcomesResponse fromStateVersion(Long fromStateVersion) {
    
    this.fromStateVersion = fromStateVersion;
    return this;
  }

   /**
   * Get fromStateVersion
   * minimum: 1
   * maximum: 100000000000000
   * @return fromStateVersion
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getFromStateVersion() {
    return fromStateVersion;
  }


  @JsonProperty(JSON_PROPERTY_FROM_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromStateVersion(Long fromStateVersion) {
    this.fromStateVersion = fromStateVersion;
  }


  public LtsStreamTransactionOutcomesResponse count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;10000&#x60;, giving the total count of transactions in the returned response
   * minimum: 0
   * maximum: 10000
   * @return count
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCount(Integer count) {
    this.count = count;
  }


  public LtsStreamTransactionOutcomesResponse maxLedgerStateVersion(Long maxLedgerStateVersion) {
    
    this.maxLedgerStateVersion = maxLedgerStateVersion;
    return this;
  }

   /**
   * Get maxLedgerStateVersion
   * minimum: 1
   * maximum: 100000000000000
   * @return maxLedgerStateVersion
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_LEDGER_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getMaxLedgerStateVersion() {
    return maxLedgerStateVersion;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LEDGER_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxLedgerStateVersion(Long maxLedgerStateVersion) {
    this.maxLedgerStateVersion = maxLedgerStateVersion;
  }


  public LtsStreamTransactionOutcomesResponse committedTransactionOutcomes(List<LtsCommittedTransactionOutcome> committedTransactionOutcomes) {
    
    this.committedTransactionOutcomes = committedTransactionOutcomes;
    return this;
  }

  public LtsStreamTransactionOutcomesResponse addCommittedTransactionOutcomesItem(LtsCommittedTransactionOutcome committedTransactionOutcomesItem) {
    if (this.committedTransactionOutcomes == null) {
      this.committedTransactionOutcomes = new ArrayList<>();
    }
    this.committedTransactionOutcomes.add(committedTransactionOutcomesItem);
    return this;
  }

   /**
   * A committed transaction outcomes list starting from the &#x60;from_state_version&#x60; (inclusive).
   * @return committedTransactionOutcomes
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMMITTED_TRANSACTION_OUTCOMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LtsCommittedTransactionOutcome> getCommittedTransactionOutcomes() {
    return committedTransactionOutcomes;
  }


  @JsonProperty(JSON_PROPERTY_COMMITTED_TRANSACTION_OUTCOMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommittedTransactionOutcomes(List<LtsCommittedTransactionOutcome> committedTransactionOutcomes) {
    this.committedTransactionOutcomes = committedTransactionOutcomes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtsStreamTransactionOutcomesResponse ltsStreamTransactionOutcomesResponse = (LtsStreamTransactionOutcomesResponse) o;
    return Objects.equals(this.fromStateVersion, ltsStreamTransactionOutcomesResponse.fromStateVersion) &&
        Objects.equals(this.count, ltsStreamTransactionOutcomesResponse.count) &&
        Objects.equals(this.maxLedgerStateVersion, ltsStreamTransactionOutcomesResponse.maxLedgerStateVersion) &&
        Objects.equals(this.committedTransactionOutcomes, ltsStreamTransactionOutcomesResponse.committedTransactionOutcomes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromStateVersion, count, maxLedgerStateVersion, committedTransactionOutcomes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtsStreamTransactionOutcomesResponse {\n");
    sb.append("    fromStateVersion: ").append(toIndentedString(fromStateVersion)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    maxLedgerStateVersion: ").append(toIndentedString(maxLedgerStateVersion)).append("\n");
    sb.append("    committedTransactionOutcomes: ").append(toIndentedString(committedTransactionOutcomes)).append("\n");
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

    // add `from_state_version` to the URL query string
    if (getFromStateVersion() != null) {
      try {
        joiner.add(String.format("%sfrom_state_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFromStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `count` to the URL query string
    if (getCount() != null) {
      try {
        joiner.add(String.format("%scount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_ledger_state_version` to the URL query string
    if (getMaxLedgerStateVersion() != null) {
      try {
        joiner.add(String.format("%smax_ledger_state_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxLedgerStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `committed_transaction_outcomes` to the URL query string
    if (getCommittedTransactionOutcomes() != null) {
      for (int i = 0; i < getCommittedTransactionOutcomes().size(); i++) {
        if (getCommittedTransactionOutcomes().get(i) != null) {
          joiner.add(getCommittedTransactionOutcomes().get(i).toUrlQueryString(String.format("%scommitted_transaction_outcomes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

