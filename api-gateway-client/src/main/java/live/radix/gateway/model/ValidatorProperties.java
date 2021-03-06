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
import java.math.BigDecimal;
import live.radix.gateway.model.AccountIdentifier;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ValidatorProperties
 */
@JsonPropertyOrder({
  ValidatorProperties.JSON_PROPERTY_URL,
  ValidatorProperties.JSON_PROPERTY_VALIDATOR_FEE_PERCENTAGE,
  ValidatorProperties.JSON_PROPERTY_NAME,
  ValidatorProperties.JSON_PROPERTY_REGISTERED,
  ValidatorProperties.JSON_PROPERTY_OWNER_ACCOUNT_IDENTIFIER,
  ValidatorProperties.JSON_PROPERTY_EXTERNAL_STAKE_ACCEPTED
})
@JsonTypeName("ValidatorProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T00:27:56.028352900+03:00[Europe/Kiev]")
public class ValidatorProperties {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_VALIDATOR_FEE_PERCENTAGE = "validator_fee_percentage";
  private BigDecimal validatorFeePercentage;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REGISTERED = "registered";
  private Boolean registered;

  public static final String JSON_PROPERTY_OWNER_ACCOUNT_IDENTIFIER = "owner_account_identifier";
  private AccountIdentifier ownerAccountIdentifier;

  public static final String JSON_PROPERTY_EXTERNAL_STAKE_ACCEPTED = "external_stake_accepted";
  private Boolean externalStakeAccepted;

  public ValidatorProperties() { 
  }

  public ValidatorProperties url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ValidatorProperties validatorFeePercentage(BigDecimal validatorFeePercentage) {
    
    this.validatorFeePercentage = validatorFeePercentage;
    return this;
  }

   /**
   * Get validatorFeePercentage
   * minimum: 0
   * maximum: 100
   * @return validatorFeePercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VALIDATOR_FEE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getValidatorFeePercentage() {
    return validatorFeePercentage;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATOR_FEE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValidatorFeePercentage(BigDecimal validatorFeePercentage) {
    this.validatorFeePercentage = validatorFeePercentage;
  }


  public ValidatorProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ValidatorProperties registered(Boolean registered) {
    
    this.registered = registered;
    return this;
  }

   /**
   * Get registered
   * @return registered
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isRegistered() {
    return registered;
  }


  @JsonProperty(JSON_PROPERTY_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegistered(Boolean registered) {
    this.registered = registered;
  }


  public ValidatorProperties ownerAccountIdentifier(AccountIdentifier ownerAccountIdentifier) {
    
    this.ownerAccountIdentifier = ownerAccountIdentifier;
    return this;
  }

   /**
   * Get ownerAccountIdentifier
   * @return ownerAccountIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OWNER_ACCOUNT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountIdentifier getOwnerAccountIdentifier() {
    return ownerAccountIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ACCOUNT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwnerAccountIdentifier(AccountIdentifier ownerAccountIdentifier) {
    this.ownerAccountIdentifier = ownerAccountIdentifier;
  }


  public ValidatorProperties externalStakeAccepted(Boolean externalStakeAccepted) {
    
    this.externalStakeAccepted = externalStakeAccepted;
    return this;
  }

   /**
   * Get externalStakeAccepted
   * @return externalStakeAccepted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_STAKE_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isExternalStakeAccepted() {
    return externalStakeAccepted;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_STAKE_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalStakeAccepted(Boolean externalStakeAccepted) {
    this.externalStakeAccepted = externalStakeAccepted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatorProperties validatorProperties = (ValidatorProperties) o;
    return Objects.equals(this.url, validatorProperties.url) &&
        Objects.equals(this.validatorFeePercentage, validatorProperties.validatorFeePercentage) &&
        Objects.equals(this.name, validatorProperties.name) &&
        Objects.equals(this.registered, validatorProperties.registered) &&
        Objects.equals(this.ownerAccountIdentifier, validatorProperties.ownerAccountIdentifier) &&
        Objects.equals(this.externalStakeAccepted, validatorProperties.externalStakeAccepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, validatorFeePercentage, name, registered, ownerAccountIdentifier, externalStakeAccepted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatorProperties {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    validatorFeePercentage: ").append(toIndentedString(validatorFeePercentage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    ownerAccountIdentifier: ").append(toIndentedString(ownerAccountIdentifier)).append("\n");
    sb.append("    externalStakeAccepted: ").append(toIndentedString(externalStakeAccepted)).append("\n");
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

