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
import live.radix.gateway.model.AccountIdentifier;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TokenProperties
 */
@JsonPropertyOrder({
  TokenProperties.JSON_PROPERTY_NAME,
  TokenProperties.JSON_PROPERTY_DESCRIPTION,
  TokenProperties.JSON_PROPERTY_ICON_URL,
  TokenProperties.JSON_PROPERTY_URL,
  TokenProperties.JSON_PROPERTY_SYMBOL,
  TokenProperties.JSON_PROPERTY_IS_SUPPLY_MUTABLE,
  TokenProperties.JSON_PROPERTY_GRANULARITY,
  TokenProperties.JSON_PROPERTY_OWNER
})
@JsonTypeName("TokenProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T00:27:56.028352900+03:00[Europe/Kiev]")
public class TokenProperties {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ICON_URL = "icon_url";
  private String iconUrl;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_IS_SUPPLY_MUTABLE = "is_supply_mutable";
  private Boolean isSupplyMutable;

  public static final String JSON_PROPERTY_GRANULARITY = "granularity";
  private String granularity;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private AccountIdentifier owner;

  public TokenProperties() { 
  }

  public TokenProperties name(String name) {
    
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


  public TokenProperties description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TokenProperties iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * Get iconUrl
   * @return iconUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIconUrl() {
    return iconUrl;
  }


  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public TokenProperties url(String url) {
    
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


  public TokenProperties symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public TokenProperties isSupplyMutable(Boolean isSupplyMutable) {
    
    this.isSupplyMutable = isSupplyMutable;
    return this;
  }

   /**
   * If true, the token is allowed to be minted/burned by the owner.
   * @return isSupplyMutable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If true, the token is allowed to be minted/burned by the owner.")
  @JsonProperty(JSON_PROPERTY_IS_SUPPLY_MUTABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsSupplyMutable() {
    return isSupplyMutable;
  }


  @JsonProperty(JSON_PROPERTY_IS_SUPPLY_MUTABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsSupplyMutable(Boolean isSupplyMutable) {
    this.isSupplyMutable = isSupplyMutable;
  }


  public TokenProperties granularity(String granularity) {
    
    this.granularity = granularity;
    return this;
  }

   /**
   * Get granularity
   * @return granularity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_GRANULARITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGranularity() {
    return granularity;
  }


  @JsonProperty(JSON_PROPERTY_GRANULARITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGranularity(String granularity) {
    this.granularity = granularity;
  }


  public TokenProperties owner(AccountIdentifier owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountIdentifier getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(AccountIdentifier owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenProperties tokenProperties = (TokenProperties) o;
    return Objects.equals(this.name, tokenProperties.name) &&
        Objects.equals(this.description, tokenProperties.description) &&
        Objects.equals(this.iconUrl, tokenProperties.iconUrl) &&
        Objects.equals(this.url, tokenProperties.url) &&
        Objects.equals(this.symbol, tokenProperties.symbol) &&
        Objects.equals(this.isSupplyMutable, tokenProperties.isSupplyMutable) &&
        Objects.equals(this.granularity, tokenProperties.granularity) &&
        Objects.equals(this.owner, tokenProperties.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, iconUrl, url, symbol, isSupplyMutable, granularity, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    isSupplyMutable: ").append(toIndentedString(isSupplyMutable)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

