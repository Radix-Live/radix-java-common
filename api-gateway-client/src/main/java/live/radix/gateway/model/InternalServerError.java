/*
 * Radix Gateway API
 * This API is designed to enable clients to efficiently query information on the RadixDLT ledger, and allow clients to simply build and submit transactions to the network.  The API is designed for use by the Radix Foundation's [Desktop Wallet](https://wallet.radixdlt.com/) and [Explorer](https://explorer.radixdlt.com/), and replaces the original Olympia \"Archive Node API\".  # Gateway API Overview  The Gateway API is separated into distinct groupings:  * `/gateway` - Information about the Gateway API status * `/account/_*` - To query account-related information * `/token/_*` - To query token-related information * `/validator/_*` and `/validators` - To query validator-related information * `/transaction/_*` - To build, finalize and submit transactions, and to read the status and content of submitted and on-ledger transactions. * `/custom/_*` - Additional endpoints that are an unofficial extensions to the Gateway API and available only at some API providers (e.g. `https://radix.live`),           or as a custom build from a [forked repository](https://github.com/Radix-Live/radixdlt-network-gateway)  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/radixdlt-network-gateway), which is configured to read from full node/s to extract and index data from the network.  # Gateway API Format  The API is designed in a JSON-RPC style, using HTTP as a transport layer, which means that:  * All requests are POST requests. * Any error is returned with an HTTP status code of 500, with a returned error object.   * The error object contains an HTTP-like `code`   * The error object also contains a structured/typed `details` sub-object, with a `type` discriminator, allowing for structured error interpretation in clients.  # Comparison to other Radix APIs  * [Core API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/core/api.yaml) - The Core API is a low level API exposed by full nodes, and designed for use on internal networks. It is primarily designed for network integrations such as exchanges, ledger analytics providers, or hosted ledger data dashboards. The Core API provides endpoints for reading the mempool, constructing transactions and also exposes a stream of committed transactions.  * [System API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/system/api.yaml) - The System API is a private API exposed by full nodes to read system status.  The Gateway API offers a much wider range of query options and is more performant than the Core API. It is built on top of the Core API, ingesting data via the Core API transaction stream into a relational database.  The Gateway API transaction/construction endpoints operate with the concept of \"actions\" - these are higher-levels of intent compared with the Core API, which makes it easier for clients to use. The Core API should be used if you require more power/flexiblity for managing UTXOs, or submitting transactions which can't be mapped to a Gateway API action. 
 *
 * The version of the OpenAPI document: 1.1.2-L
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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import live.radix.gateway.model.BelowMinimumStakeError;
import live.radix.gateway.model.CannotStakeError;
import live.radix.gateway.model.CouldNotConstructFeesError;
import live.radix.gateway.model.GatewayError;
import live.radix.gateway.model.InternalServerError;
import live.radix.gateway.model.InternalServerErrorAllOf;
import live.radix.gateway.model.InvalidAccountAddressError;
import live.radix.gateway.model.InvalidActionError;
import live.radix.gateway.model.InvalidPublicKeyError;
import live.radix.gateway.model.InvalidRequestError;
import live.radix.gateway.model.InvalidSignatureError;
import live.radix.gateway.model.InvalidTokenRRIError;
import live.radix.gateway.model.InvalidTokenSymbolError;
import live.radix.gateway.model.InvalidTransactionError;
import live.radix.gateway.model.InvalidValidatorAddressError;
import live.radix.gateway.model.MessageTooLongError;
import live.radix.gateway.model.NetworkNotSupportedError;
import live.radix.gateway.model.NotEnoughNativeTokensForFeesError;
import live.radix.gateway.model.NotEnoughTokensForStakeError;
import live.radix.gateway.model.NotEnoughTokensForTransferError;
import live.radix.gateway.model.NotEnoughTokensForUnstakeError;
import live.radix.gateway.model.NotSyncedUpError;
import live.radix.gateway.model.TokenNotFoundError;
import live.radix.gateway.model.TransactionNotFoundError;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InternalServerError
 */
@JsonPropertyOrder({
  InternalServerError.JSON_PROPERTY_EXCEPTION,
  InternalServerError.JSON_PROPERTY_CAUSE
})
@JsonTypeName("InternalServerError")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-21T06:41:39.744899+03:00[Europe/Kiev]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = BelowMinimumStakeError.class, name = "BelowMinimumStakeError"),
  @JsonSubTypes.Type(value = CannotStakeError.class, name = "CannotStakeError"),
  @JsonSubTypes.Type(value = CouldNotConstructFeesError.class, name = "CouldNotConstructFeesError"),
  @JsonSubTypes.Type(value = InternalServerError.class, name = "InternalServerError"),
  @JsonSubTypes.Type(value = InvalidAccountAddressError.class, name = "InvalidAccountAddressError"),
  @JsonSubTypes.Type(value = InvalidActionError.class, name = "InvalidActionError"),
  @JsonSubTypes.Type(value = InvalidPublicKeyError.class, name = "InvalidPublicKeyError"),
  @JsonSubTypes.Type(value = InvalidRequestError.class, name = "InvalidRequestError"),
  @JsonSubTypes.Type(value = InvalidSignatureError.class, name = "InvalidSignatureError"),
  @JsonSubTypes.Type(value = InvalidTokenRRIError.class, name = "InvalidTokenRRIError"),
  @JsonSubTypes.Type(value = InvalidTokenSymbolError.class, name = "InvalidTokenSymbolError"),
  @JsonSubTypes.Type(value = InvalidTransactionError.class, name = "InvalidTransactionError"),
  @JsonSubTypes.Type(value = InvalidValidatorAddressError.class, name = "InvalidValidatorAddressError"),
  @JsonSubTypes.Type(value = MessageTooLongError.class, name = "MessageTooLongError"),
  @JsonSubTypes.Type(value = NetworkNotSupportedError.class, name = "NetworkNotSupportedError"),
  @JsonSubTypes.Type(value = NotEnoughNativeTokensForFeesError.class, name = "NotEnoughNativeTokensForFeesError"),
  @JsonSubTypes.Type(value = NotEnoughTokensForStakeError.class, name = "NotEnoughTokensForStakeError"),
  @JsonSubTypes.Type(value = NotEnoughTokensForTransferError.class, name = "NotEnoughTokensForTransferError"),
  @JsonSubTypes.Type(value = NotEnoughTokensForUnstakeError.class, name = "NotEnoughTokensForUnstakeError"),
  @JsonSubTypes.Type(value = NotSyncedUpError.class, name = "NotSyncedUpError"),
  @JsonSubTypes.Type(value = TokenNotFoundError.class, name = "TokenNotFoundError"),
  @JsonSubTypes.Type(value = TransactionNotFoundError.class, name = "TransactionNotFoundError"),
})

public class InternalServerError extends GatewayError {
  public static final String JSON_PROPERTY_EXCEPTION = "exception";
  private String exception;

  public static final String JSON_PROPERTY_CAUSE = "cause";
  private String cause;

  public InternalServerError() { 
  }

  public InternalServerError exception(String exception) {
    
    this.exception = exception;
    return this;
  }

   /**
   * Gives an error type which occurred within the Gateway API when serving the request.
   * @return exception
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Gives an error type which occurred within the Gateway API when serving the request.")
  @JsonProperty(JSON_PROPERTY_EXCEPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getException() {
    return exception;
  }


  @JsonProperty(JSON_PROPERTY_EXCEPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setException(String exception) {
    this.exception = exception;
  }


  public InternalServerError cause(String cause) {
    
    this.cause = cause;
    return this;
  }

   /**
   * Gives a human readable message - likely just a trace ID for reporting the error.
   * @return cause
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Gives a human readable message - likely just a trace ID for reporting the error.")
  @JsonProperty(JSON_PROPERTY_CAUSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCause() {
    return cause;
  }


  @JsonProperty(JSON_PROPERTY_CAUSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCause(String cause) {
    this.cause = cause;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalServerError internalServerError = (InternalServerError) o;
    return Objects.equals(this.exception, internalServerError.exception) &&
        Objects.equals(this.cause, internalServerError.cause) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, cause, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalServerError {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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

