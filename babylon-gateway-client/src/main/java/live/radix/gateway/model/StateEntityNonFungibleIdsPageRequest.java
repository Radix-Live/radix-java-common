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
import live.radix.gateway.model.LedgerStateSelector;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StateEntityNonFungibleIdsPageRequest
 */
@JsonPropertyOrder({
  StateEntityNonFungibleIdsPageRequest.JSON_PROPERTY_AT_LEDGER_STATE,
  StateEntityNonFungibleIdsPageRequest.JSON_PROPERTY_CURSOR,
  StateEntityNonFungibleIdsPageRequest.JSON_PROPERTY_LIMIT_PER_PAGE,
  StateEntityNonFungibleIdsPageRequest.JSON_PROPERTY_ADDRESS,
  StateEntityNonFungibleIdsPageRequest.JSON_PROPERTY_VAULT_ADDRESS,
  StateEntityNonFungibleIdsPageRequest.JSON_PROPERTY_RESOURCE_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class StateEntityNonFungibleIdsPageRequest {
  public static final String JSON_PROPERTY_AT_LEDGER_STATE = "at_ledger_state";
  private JsonNullable<LedgerStateSelector> atLedgerState = JsonNullable.<LedgerStateSelector>undefined();

  public static final String JSON_PROPERTY_CURSOR = "cursor";
  private JsonNullable<String> cursor = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LIMIT_PER_PAGE = "limit_per_page";
  private JsonNullable<Integer> limitPerPage = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_VAULT_ADDRESS = "vault_address";
  private String vaultAddress;

  public static final String JSON_PROPERTY_RESOURCE_ADDRESS = "resource_address";
  private String resourceAddress;

  public StateEntityNonFungibleIdsPageRequest() {
  }

  public StateEntityNonFungibleIdsPageRequest atLedgerState(LedgerStateSelector atLedgerState) {
    this.atLedgerState = JsonNullable.<LedgerStateSelector>of(atLedgerState);
    
    return this;
  }

   /**
   * Get atLedgerState
   * @return atLedgerState
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public LedgerStateSelector getAtLedgerState() {
        return atLedgerState.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AT_LEDGER_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LedgerStateSelector> getAtLedgerState_JsonNullable() {
    return atLedgerState;
  }
  
  @JsonProperty(JSON_PROPERTY_AT_LEDGER_STATE)
  public void setAtLedgerState_JsonNullable(JsonNullable<LedgerStateSelector> atLedgerState) {
    this.atLedgerState = atLedgerState;
  }

  public void setAtLedgerState(LedgerStateSelector atLedgerState) {
    this.atLedgerState = JsonNullable.<LedgerStateSelector>of(atLedgerState);
  }


  public StateEntityNonFungibleIdsPageRequest cursor(String cursor) {
    this.cursor = JsonNullable.<String>of(cursor);
    
    return this;
  }

   /**
   * This cursor allows forward pagination, by providing the cursor from the previous request.
   * @return cursor
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCursor() {
        return cursor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCursor_JsonNullable() {
    return cursor;
  }
  
  @JsonProperty(JSON_PROPERTY_CURSOR)
  public void setCursor_JsonNullable(JsonNullable<String> cursor) {
    this.cursor = cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = JsonNullable.<String>of(cursor);
  }


  public StateEntityNonFungibleIdsPageRequest limitPerPage(Integer limitPerPage) {
    this.limitPerPage = JsonNullable.<Integer>of(limitPerPage);
    
    return this;
  }

   /**
   * The page size requested.
   * @return limitPerPage
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getLimitPerPage() {
        return limitPerPage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMIT_PER_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getLimitPerPage_JsonNullable() {
    return limitPerPage;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMIT_PER_PAGE)
  public void setLimitPerPage_JsonNullable(JsonNullable<Integer> limitPerPage) {
    this.limitPerPage = limitPerPage;
  }

  public void setLimitPerPage(Integer limitPerPage) {
    this.limitPerPage = JsonNullable.<Integer>of(limitPerPage);
  }


  public StateEntityNonFungibleIdsPageRequest address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Bech32m-encoded human readable version of the address.
   * @return address
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(String address) {
    this.address = address;
  }


  public StateEntityNonFungibleIdsPageRequest vaultAddress(String vaultAddress) {
    
    this.vaultAddress = vaultAddress;
    return this;
  }

   /**
   * Bech32m-encoded human readable version of the address.
   * @return vaultAddress
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VAULT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVaultAddress() {
    return vaultAddress;
  }


  @JsonProperty(JSON_PROPERTY_VAULT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVaultAddress(String vaultAddress) {
    this.vaultAddress = vaultAddress;
  }


  public StateEntityNonFungibleIdsPageRequest resourceAddress(String resourceAddress) {
    
    this.resourceAddress = resourceAddress;
    return this;
  }

   /**
   * Bech32m-encoded human readable version of the address.
   * @return resourceAddress
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResourceAddress() {
    return resourceAddress;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceAddress(String resourceAddress) {
    this.resourceAddress = resourceAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateEntityNonFungibleIdsPageRequest stateEntityNonFungibleIdsPageRequest = (StateEntityNonFungibleIdsPageRequest) o;
    return equalsNullable(this.atLedgerState, stateEntityNonFungibleIdsPageRequest.atLedgerState) &&
        equalsNullable(this.cursor, stateEntityNonFungibleIdsPageRequest.cursor) &&
        equalsNullable(this.limitPerPage, stateEntityNonFungibleIdsPageRequest.limitPerPage) &&
        Objects.equals(this.address, stateEntityNonFungibleIdsPageRequest.address) &&
        Objects.equals(this.vaultAddress, stateEntityNonFungibleIdsPageRequest.vaultAddress) &&
        Objects.equals(this.resourceAddress, stateEntityNonFungibleIdsPageRequest.resourceAddress);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(atLedgerState), hashCodeNullable(cursor), hashCodeNullable(limitPerPage), address, vaultAddress, resourceAddress);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateEntityNonFungibleIdsPageRequest {\n");
    sb.append("    atLedgerState: ").append(toIndentedString(atLedgerState)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    limitPerPage: ").append(toIndentedString(limitPerPage)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    vaultAddress: ").append(toIndentedString(vaultAddress)).append("\n");
    sb.append("    resourceAddress: ").append(toIndentedString(resourceAddress)).append("\n");
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

    // add `at_ledger_state` to the URL query string
    if (getAtLedgerState() != null) {
      joiner.add(getAtLedgerState().toUrlQueryString(prefix + "at_ledger_state" + suffix));
    }

    // add `cursor` to the URL query string
    if (getCursor() != null) {
      try {
        joiner.add(String.format("%scursor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCursor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `limit_per_page` to the URL query string
    if (getLimitPerPage() != null) {
      try {
        joiner.add(String.format("%slimit_per_page%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimitPerPage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      try {
        joiner.add(String.format("%saddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `vault_address` to the URL query string
    if (getVaultAddress() != null) {
      try {
        joiner.add(String.format("%svault_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVaultAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resource_address` to the URL query string
    if (getResourceAddress() != null) {
      try {
        joiner.add(String.format("%sresource_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResourceAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

