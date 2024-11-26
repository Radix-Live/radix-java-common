/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.9.0-L
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
 * StateKeyValueStoreKeysRequest
 */
@JsonPropertyOrder({
  StateKeyValueStoreKeysRequest.JSON_PROPERTY_AT_LEDGER_STATE,
  StateKeyValueStoreKeysRequest.JSON_PROPERTY_CURSOR,
  StateKeyValueStoreKeysRequest.JSON_PROPERTY_LIMIT_PER_PAGE,
  StateKeyValueStoreKeysRequest.JSON_PROPERTY_KEY_VALUE_STORE_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:09:04.159608300+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class StateKeyValueStoreKeysRequest {
  public static final String JSON_PROPERTY_AT_LEDGER_STATE = "at_ledger_state";
  private JsonNullable<LedgerStateSelector> atLedgerState = JsonNullable.<LedgerStateSelector>undefined();

  public static final String JSON_PROPERTY_CURSOR = "cursor";
  private JsonNullable<String> cursor = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LIMIT_PER_PAGE = "limit_per_page";
  private JsonNullable<Integer> limitPerPage = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_KEY_VALUE_STORE_ADDRESS = "key_value_store_address";
  private String keyValueStoreAddress;

  public StateKeyValueStoreKeysRequest() {
  }

  public StateKeyValueStoreKeysRequest atLedgerState(LedgerStateSelector atLedgerState) {
    this.atLedgerState = JsonNullable.<LedgerStateSelector>of(atLedgerState);
    
    return this;
  }

  /**
   * Get atLedgerState
   * @return atLedgerState
   */
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

  public StateKeyValueStoreKeysRequest cursor(String cursor) {
    this.cursor = JsonNullable.<String>of(cursor);
    
    return this;
  }

  /**
   * This cursor allows forward pagination, by providing the cursor from the previous request.
   * @return cursor
   */
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

  public StateKeyValueStoreKeysRequest limitPerPage(Integer limitPerPage) {
    this.limitPerPage = JsonNullable.<Integer>of(limitPerPage);
    
    return this;
  }

  /**
   * The page size requested.
   * @return limitPerPage
   */
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

  public StateKeyValueStoreKeysRequest keyValueStoreAddress(String keyValueStoreAddress) {
    
    this.keyValueStoreAddress = keyValueStoreAddress;
    return this;
  }

  /**
   * Bech32m-encoded human readable version of the address.
   * @return keyValueStoreAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KEY_VALUE_STORE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKeyValueStoreAddress() {
    return keyValueStoreAddress;
  }


  @JsonProperty(JSON_PROPERTY_KEY_VALUE_STORE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeyValueStoreAddress(String keyValueStoreAddress) {
    this.keyValueStoreAddress = keyValueStoreAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateKeyValueStoreKeysRequest stateKeyValueStoreKeysRequest = (StateKeyValueStoreKeysRequest) o;
    return equalsNullable(this.atLedgerState, stateKeyValueStoreKeysRequest.atLedgerState) &&
        equalsNullable(this.cursor, stateKeyValueStoreKeysRequest.cursor) &&
        equalsNullable(this.limitPerPage, stateKeyValueStoreKeysRequest.limitPerPage) &&
        Objects.equals(this.keyValueStoreAddress, stateKeyValueStoreKeysRequest.keyValueStoreAddress);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(atLedgerState), hashCodeNullable(cursor), hashCodeNullable(limitPerPage), keyValueStoreAddress);
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
    sb.append("class StateKeyValueStoreKeysRequest {\n");
    sb.append("    atLedgerState: ").append(toIndentedString(atLedgerState)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    limitPerPage: ").append(toIndentedString(limitPerPage)).append("\n");
    sb.append("    keyValueStoreAddress: ").append(toIndentedString(keyValueStoreAddress)).append("\n");
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

    // add `key_value_store_address` to the URL query string
    if (getKeyValueStoreAddress() != null) {
      try {
        joiner.add(String.format("%skey_value_store_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKeyValueStoreAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

