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
import live.radix.core.model.TransactionSubmitErrorDetails;
import live.radix.core.model.TransactionSubmitErrorDetailsType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionSubmitPriorityThresholdNotMetErrorDetails
 */
@JsonPropertyOrder({
  TransactionSubmitPriorityThresholdNotMetErrorDetails.JSON_PROPERTY_TIP_PERCENTAGE,
  TransactionSubmitPriorityThresholdNotMetErrorDetails.JSON_PROPERTY_MIN_TIP_PERCENTAGE_REQUIRED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class TransactionSubmitPriorityThresholdNotMetErrorDetails extends TransactionSubmitErrorDetails {
  public static final String JSON_PROPERTY_TIP_PERCENTAGE = "tip_percentage";
  private Integer tipPercentage;

  public static final String JSON_PROPERTY_MIN_TIP_PERCENTAGE_REQUIRED = "min_tip_percentage_required";
  private Integer minTipPercentageRequired;

  public TransactionSubmitPriorityThresholdNotMetErrorDetails() {

  }

  public TransactionSubmitPriorityThresholdNotMetErrorDetails tipPercentage(Integer tipPercentage) {
    
    this.tipPercentage = tipPercentage;
    return this;
  }

   /**
   * Tip percentage of the submitted (and rejected) transaction. 
   * minimum: 0
   * maximum: 65535
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


  public TransactionSubmitPriorityThresholdNotMetErrorDetails minTipPercentageRequired(Integer minTipPercentageRequired) {
    
    this.minTipPercentageRequired = minTipPercentageRequired;
    return this;
  }

   /**
   * A lower bound for tip percentage at current mempool state. Anything lower than this will very likely result in a mempool rejection. A missing value means there is no tip that can guarantee submission. 
   * minimum: 0
   * maximum: 65535
   * @return minTipPercentageRequired
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_TIP_PERCENTAGE_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinTipPercentageRequired() {
    return minTipPercentageRequired;
  }


  @JsonProperty(JSON_PROPERTY_MIN_TIP_PERCENTAGE_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinTipPercentageRequired(Integer minTipPercentageRequired) {
    this.minTipPercentageRequired = minTipPercentageRequired;
  }

  @Override
  public TransactionSubmitPriorityThresholdNotMetErrorDetails type(TransactionSubmitErrorDetailsType type) {
    this.setType(type);
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
    TransactionSubmitPriorityThresholdNotMetErrorDetails transactionSubmitPriorityThresholdNotMetErrorDetails = (TransactionSubmitPriorityThresholdNotMetErrorDetails) o;
    return Objects.equals(this.tipPercentage, transactionSubmitPriorityThresholdNotMetErrorDetails.tipPercentage) &&
        Objects.equals(this.minTipPercentageRequired, transactionSubmitPriorityThresholdNotMetErrorDetails.minTipPercentageRequired) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipPercentage, minTipPercentageRequired, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSubmitPriorityThresholdNotMetErrorDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tipPercentage: ").append(toIndentedString(tipPercentage)).append("\n");
    sb.append("    minTipPercentageRequired: ").append(toIndentedString(minTipPercentageRequired)).append("\n");
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

    // add `tip_percentage` to the URL query string
    if (getTipPercentage() != null) {
      try {
        joiner.add(String.format("%stip_percentage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTipPercentage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `min_tip_percentage_required` to the URL query string
    if (getMinTipPercentageRequired() != null) {
      try {
        joiner.add(String.format("%smin_tip_percentage_required%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinTipPercentageRequired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

