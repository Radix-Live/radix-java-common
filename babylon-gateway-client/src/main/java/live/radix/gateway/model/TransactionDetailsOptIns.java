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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionDetailsOptIns
 */
@JsonPropertyOrder({
  TransactionDetailsOptIns.JSON_PROPERTY_RAW_HEX,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_STATE_CHANGES,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_FEE_SUMMARY,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_FEE_SOURCE,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_FEE_DESTINATION,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_COSTING_PARAMETERS,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_EVENTS,
  TransactionDetailsOptIns.JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class TransactionDetailsOptIns {
  public static final String JSON_PROPERTY_RAW_HEX = "raw_hex";
  private Boolean rawHex;

  public static final String JSON_PROPERTY_RECEIPT_STATE_CHANGES = "receipt_state_changes";
  private Boolean receiptStateChanges;

  public static final String JSON_PROPERTY_RECEIPT_FEE_SUMMARY = "receipt_fee_summary";
  private Boolean receiptFeeSummary;

  public static final String JSON_PROPERTY_RECEIPT_FEE_SOURCE = "receipt_fee_source";
  private Boolean receiptFeeSource;

  public static final String JSON_PROPERTY_RECEIPT_FEE_DESTINATION = "receipt_fee_destination";
  private Boolean receiptFeeDestination;

  public static final String JSON_PROPERTY_RECEIPT_COSTING_PARAMETERS = "receipt_costing_parameters";
  private Boolean receiptCostingParameters;

  public static final String JSON_PROPERTY_RECEIPT_EVENTS = "receipt_events";
  private Boolean receiptEvents;

  public static final String JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES = "affected_global_entities";
  private Boolean affectedGlobalEntities;

  public TransactionDetailsOptIns() {
  }

  public TransactionDetailsOptIns rawHex(Boolean rawHex) {
    
    this.rawHex = rawHex;
    return this;
  }

   /**
   * Get rawHex
   * @return rawHex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAW_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isRawHex() {
    return rawHex;
  }


  @JsonProperty(JSON_PROPERTY_RAW_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRawHex(Boolean rawHex) {
    this.rawHex = rawHex;
  }


  public TransactionDetailsOptIns receiptStateChanges(Boolean receiptStateChanges) {
    
    this.receiptStateChanges = receiptStateChanges;
    return this;
  }

   /**
   * Get receiptStateChanges
   * @return receiptStateChanges
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_STATE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptStateChanges() {
    return receiptStateChanges;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_STATE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptStateChanges(Boolean receiptStateChanges) {
    this.receiptStateChanges = receiptStateChanges;
  }


  public TransactionDetailsOptIns receiptFeeSummary(Boolean receiptFeeSummary) {
    
    this.receiptFeeSummary = receiptFeeSummary;
    return this;
  }

   /**
   * Get receiptFeeSummary
   * @return receiptFeeSummary
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptFeeSummary() {
    return receiptFeeSummary;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptFeeSummary(Boolean receiptFeeSummary) {
    this.receiptFeeSummary = receiptFeeSummary;
  }


  public TransactionDetailsOptIns receiptFeeSource(Boolean receiptFeeSource) {
    
    this.receiptFeeSource = receiptFeeSource;
    return this;
  }

   /**
   * Get receiptFeeSource
   * @return receiptFeeSource
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptFeeSource() {
    return receiptFeeSource;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptFeeSource(Boolean receiptFeeSource) {
    this.receiptFeeSource = receiptFeeSource;
  }


  public TransactionDetailsOptIns receiptFeeDestination(Boolean receiptFeeDestination) {
    
    this.receiptFeeDestination = receiptFeeDestination;
    return this;
  }

   /**
   * Get receiptFeeDestination
   * @return receiptFeeDestination
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptFeeDestination() {
    return receiptFeeDestination;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptFeeDestination(Boolean receiptFeeDestination) {
    this.receiptFeeDestination = receiptFeeDestination;
  }


  public TransactionDetailsOptIns receiptCostingParameters(Boolean receiptCostingParameters) {
    
    this.receiptCostingParameters = receiptCostingParameters;
    return this;
  }

   /**
   * Get receiptCostingParameters
   * @return receiptCostingParameters
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_COSTING_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptCostingParameters() {
    return receiptCostingParameters;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_COSTING_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptCostingParameters(Boolean receiptCostingParameters) {
    this.receiptCostingParameters = receiptCostingParameters;
  }


  public TransactionDetailsOptIns receiptEvents(Boolean receiptEvents) {
    
    this.receiptEvents = receiptEvents;
    return this;
  }

   /**
   * Get receiptEvents
   * @return receiptEvents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptEvents() {
    return receiptEvents;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptEvents(Boolean receiptEvents) {
    this.receiptEvents = receiptEvents;
  }


  public TransactionDetailsOptIns affectedGlobalEntities(Boolean affectedGlobalEntities) {
    
    this.affectedGlobalEntities = affectedGlobalEntities;
    return this;
  }

   /**
   * Get affectedGlobalEntities
   * @return affectedGlobalEntities
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isAffectedGlobalEntities() {
    return affectedGlobalEntities;
  }


  @JsonProperty(JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedGlobalEntities(Boolean affectedGlobalEntities) {
    this.affectedGlobalEntities = affectedGlobalEntities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetailsOptIns transactionDetailsOptIns = (TransactionDetailsOptIns) o;
    return Objects.equals(this.rawHex, transactionDetailsOptIns.rawHex) &&
        Objects.equals(this.receiptStateChanges, transactionDetailsOptIns.receiptStateChanges) &&
        Objects.equals(this.receiptFeeSummary, transactionDetailsOptIns.receiptFeeSummary) &&
        Objects.equals(this.receiptFeeSource, transactionDetailsOptIns.receiptFeeSource) &&
        Objects.equals(this.receiptFeeDestination, transactionDetailsOptIns.receiptFeeDestination) &&
        Objects.equals(this.receiptCostingParameters, transactionDetailsOptIns.receiptCostingParameters) &&
        Objects.equals(this.receiptEvents, transactionDetailsOptIns.receiptEvents) &&
        Objects.equals(this.affectedGlobalEntities, transactionDetailsOptIns.affectedGlobalEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawHex, receiptStateChanges, receiptFeeSummary, receiptFeeSource, receiptFeeDestination, receiptCostingParameters, receiptEvents, affectedGlobalEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetailsOptIns {\n");
    sb.append("    rawHex: ").append(toIndentedString(rawHex)).append("\n");
    sb.append("    receiptStateChanges: ").append(toIndentedString(receiptStateChanges)).append("\n");
    sb.append("    receiptFeeSummary: ").append(toIndentedString(receiptFeeSummary)).append("\n");
    sb.append("    receiptFeeSource: ").append(toIndentedString(receiptFeeSource)).append("\n");
    sb.append("    receiptFeeDestination: ").append(toIndentedString(receiptFeeDestination)).append("\n");
    sb.append("    receiptCostingParameters: ").append(toIndentedString(receiptCostingParameters)).append("\n");
    sb.append("    receiptEvents: ").append(toIndentedString(receiptEvents)).append("\n");
    sb.append("    affectedGlobalEntities: ").append(toIndentedString(affectedGlobalEntities)).append("\n");
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
    if (isRawHex() != null) {
      try {
        joiner.add(String.format("%sraw_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isRawHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_state_changes` to the URL query string
    if (isReceiptStateChanges() != null) {
      try {
        joiner.add(String.format("%sreceipt_state_changes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptStateChanges()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_fee_summary` to the URL query string
    if (isReceiptFeeSummary() != null) {
      try {
        joiner.add(String.format("%sreceipt_fee_summary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptFeeSummary()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_fee_source` to the URL query string
    if (isReceiptFeeSource() != null) {
      try {
        joiner.add(String.format("%sreceipt_fee_source%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptFeeSource()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_fee_destination` to the URL query string
    if (isReceiptFeeDestination() != null) {
      try {
        joiner.add(String.format("%sreceipt_fee_destination%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptFeeDestination()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_costing_parameters` to the URL query string
    if (isReceiptCostingParameters() != null) {
      try {
        joiner.add(String.format("%sreceipt_costing_parameters%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptCostingParameters()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_events` to the URL query string
    if (isReceiptEvents() != null) {
      try {
        joiner.add(String.format("%sreceipt_events%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptEvents()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `affected_global_entities` to the URL query string
    if (isAffectedGlobalEntities() != null) {
      try {
        joiner.add(String.format("%saffected_global_entities%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isAffectedGlobalEntities()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
