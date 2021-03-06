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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import live.radix.gateway.model.AccountIdentifier;
import live.radix.gateway.model.Action;
import live.radix.gateway.model.BurnTokens;
import live.radix.gateway.model.CreateTokenDefinition;
import live.radix.gateway.model.MintTokens;
import live.radix.gateway.model.RegisterValidator;
import live.radix.gateway.model.StakeTokens;
import live.radix.gateway.model.StakeTokensAllOf;
import live.radix.gateway.model.TokenAmount;
import live.radix.gateway.model.TransferTokens;
import live.radix.gateway.model.UnregisterValidator;
import live.radix.gateway.model.UnstakeTokens;
import live.radix.gateway.model.ValidatorIdentifier;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StakeTokens
 */
@JsonPropertyOrder({
  StakeTokens.JSON_PROPERTY_FROM_ACCOUNT,
  StakeTokens.JSON_PROPERTY_TO_VALIDATOR,
  StakeTokens.JSON_PROPERTY_AMOUNT
})
@JsonTypeName("StakeTokens")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T00:27:56.028352900+03:00[Europe/Kiev]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = BurnTokens.class, name = "BurnTokens"),
  @JsonSubTypes.Type(value = CreateTokenDefinition.class, name = "CreateTokenDefinition"),
  @JsonSubTypes.Type(value = MintTokens.class, name = "MintTokens"),
  @JsonSubTypes.Type(value = RegisterValidator.class, name = "RegisterValidator"),
  @JsonSubTypes.Type(value = StakeTokens.class, name = "StakeTokens"),
  @JsonSubTypes.Type(value = TransferTokens.class, name = "TransferTokens"),
  @JsonSubTypes.Type(value = UnregisterValidator.class, name = "UnregisterValidator"),
  @JsonSubTypes.Type(value = UnstakeTokens.class, name = "UnstakeTokens"),
})

public class StakeTokens extends Action {
  public static final String JSON_PROPERTY_FROM_ACCOUNT = "from_account";
  private AccountIdentifier fromAccount;

  public static final String JSON_PROPERTY_TO_VALIDATOR = "to_validator";
  private ValidatorIdentifier toValidator;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private TokenAmount amount;

  public StakeTokens() { 
  }

  public StakeTokens fromAccount(AccountIdentifier fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * Get fromAccount
   * @return fromAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountIdentifier getFromAccount() {
    return fromAccount;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromAccount(AccountIdentifier fromAccount) {
    this.fromAccount = fromAccount;
  }


  public StakeTokens toValidator(ValidatorIdentifier toValidator) {
    
    this.toValidator = toValidator;
    return this;
  }

   /**
   * Get toValidator
   * @return toValidator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TO_VALIDATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ValidatorIdentifier getToValidator() {
    return toValidator;
  }


  @JsonProperty(JSON_PROPERTY_TO_VALIDATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToValidator(ValidatorIdentifier toValidator) {
    this.toValidator = toValidator;
  }


  public StakeTokens amount(TokenAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TokenAmount getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(TokenAmount amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StakeTokens stakeTokens = (StakeTokens) o;
    return Objects.equals(this.fromAccount, stakeTokens.fromAccount) &&
        Objects.equals(this.toValidator, stakeTokens.toValidator) &&
        Objects.equals(this.amount, stakeTokens.amount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toValidator, amount, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StakeTokens {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toValidator: ").append(toIndentedString(toValidator)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

