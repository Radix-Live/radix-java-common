/*
 * Radix Gateway API
 * This API is designed to enable clients to efficiently query information on the RadixDLT ledger, and allow clients to simply build and submit transactions to the network.  The API is designed for use by the Radix Foundation's [Desktop Wallet](https://wallet.radixdlt.com/) and [Explorer](https://explorer.radixdlt.com/), and replaces the original Olympia \"Archive Node API\".  # Gateway API Overview  The Gateway API is separated into distinct groupings:  * `/gateway` - Information about the Gateway API status * `/account/_*` - To query account-related information * `/token/_*` - To query token-related information * `/validator/_*` and `/validators` - To query validator-related information * `/transaction/_*` - To build, finalize and submit transactions, and to read the status and content of submitted and on-ledger transactions. * `/custom/_*` - Additional endpoints that are an unofficial extensions to the Gateway API and available only at some API providers (e.g. `https://radix.live`),           or as a custom build from a [forked repository](https://github.com/Radix-Live/radixdlt-network-gateway)  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/radixdlt-network-gateway), which is configured to read from full node/s to extract and index data from the network.  # Gateway API Format  The API is designed in a JSON-RPC style, using HTTP as a transport layer, which means that:  * All requests are POST requests. * Any error is returned with an HTTP status code of 500, with a returned error object.   * The error object contains an HTTP-like `code`   * The error object also contains a structured/typed `details` sub-object, with a `type` discriminator, allowing for structured error interpretation in clients.  # Comparison to other Radix APIs  * [Core API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/core/api.yaml) - The Core API is a low level API exposed by full nodes, and designed for use on internal networks. It is primarily designed for network integrations such as exchanges, ledger analytics providers, or hosted ledger data dashboards. The Core API provides endpoints for reading the mempool, constructing transactions and also exposes a stream of committed transactions.  * [System API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/system/api.yaml) - The System API is a private API exposed by full nodes to read system status.  The Gateway API offers a much wider range of query options and is more performant than the Core API. It is built on top of the Core API, ingesting data via the Core API transaction stream into a relational database.  The Gateway API transaction/construction endpoints operate with the concept of \"actions\" - these are higher-levels of intent compared with the Core API, which makes it easier for clients to use. The Core API should be used if you require more power/flexiblity for managing UTXOs, or submitting transactions which can't be mapped to a Gateway API action. 
 *
 * The version of the OpenAPI document: 1.1.4.1-L
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import live.radix.gateway.model.TokenAmount;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NotEnoughNativeTokensForFeesErrorAllOf
 */
@JsonPropertyOrder({
  NotEnoughNativeTokensForFeesErrorAllOf.JSON_PROPERTY_REQUIRED_AMOUNT,
  NotEnoughNativeTokensForFeesErrorAllOf.JSON_PROPERTY_AVAILABLE_AMOUNT
})
@JsonTypeName("NotEnoughNativeTokensForFeesError_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T00:27:56.028352900+03:00[Europe/Kiev]")
public class NotEnoughNativeTokensForFeesErrorAllOf {
  public static final String JSON_PROPERTY_REQUIRED_AMOUNT = "required_amount";
  private TokenAmount requiredAmount;

  public static final String JSON_PROPERTY_AVAILABLE_AMOUNT = "available_amount";
  private TokenAmount availableAmount;

  public NotEnoughNativeTokensForFeesErrorAllOf() { 
  }

  public NotEnoughNativeTokensForFeesErrorAllOf requiredAmount(TokenAmount requiredAmount) {
    
    this.requiredAmount = requiredAmount;
    return this;
  }

   /**
   * Get requiredAmount
   * @return requiredAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REQUIRED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TokenAmount getRequiredAmount() {
    return requiredAmount;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequiredAmount(TokenAmount requiredAmount) {
    this.requiredAmount = requiredAmount;
  }


  public NotEnoughNativeTokensForFeesErrorAllOf availableAmount(TokenAmount availableAmount) {
    
    this.availableAmount = availableAmount;
    return this;
  }

   /**
   * Get availableAmount
   * @return availableAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABLE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TokenAmount getAvailableAmount() {
    return availableAmount;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvailableAmount(TokenAmount availableAmount) {
    this.availableAmount = availableAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotEnoughNativeTokensForFeesErrorAllOf notEnoughNativeTokensForFeesErrorAllOf = (NotEnoughNativeTokensForFeesErrorAllOf) o;
    return Objects.equals(this.requiredAmount, notEnoughNativeTokensForFeesErrorAllOf.requiredAmount) &&
        Objects.equals(this.availableAmount, notEnoughNativeTokensForFeesErrorAllOf.availableAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredAmount, availableAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotEnoughNativeTokensForFeesErrorAllOf {\n");
    sb.append("    requiredAmount: ").append(toIndentedString(requiredAmount)).append("\n");
    sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
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

}

