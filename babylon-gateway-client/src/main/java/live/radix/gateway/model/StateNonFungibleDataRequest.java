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
import java.util.ArrayList;
import java.util.List;
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
 * StateNonFungibleDataRequest
 */
@JsonPropertyOrder({
  StateNonFungibleDataRequest.JSON_PROPERTY_AT_LEDGER_STATE,
  StateNonFungibleDataRequest.JSON_PROPERTY_RESOURCE_ADDRESS,
  StateNonFungibleDataRequest.JSON_PROPERTY_NON_FUNGIBLE_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class StateNonFungibleDataRequest {
  public static final String JSON_PROPERTY_AT_LEDGER_STATE = "at_ledger_state";
  private JsonNullable<LedgerStateSelector> atLedgerState = JsonNullable.<LedgerStateSelector>undefined();

  public static final String JSON_PROPERTY_RESOURCE_ADDRESS = "resource_address";
  private String resourceAddress;

  public static final String JSON_PROPERTY_NON_FUNGIBLE_IDS = "non_fungible_ids";
  private List<String> nonFungibleIds = new ArrayList<>();

  public StateNonFungibleDataRequest() {
  }

  public StateNonFungibleDataRequest atLedgerState(LedgerStateSelector atLedgerState) {
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


  public StateNonFungibleDataRequest resourceAddress(String resourceAddress) {
    
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


  public StateNonFungibleDataRequest nonFungibleIds(List<String> nonFungibleIds) {
    
    this.nonFungibleIds = nonFungibleIds;
    return this;
  }

  public StateNonFungibleDataRequest addNonFungibleIdsItem(String nonFungibleIdsItem) {
    if (this.nonFungibleIds == null) {
      this.nonFungibleIds = new ArrayList<>();
    }
    this.nonFungibleIds.add(nonFungibleIdsItem);
    return this;
  }

   /**
   * Get nonFungibleIds
   * @return nonFungibleIds
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getNonFungibleIds() {
    return nonFungibleIds;
  }


  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNonFungibleIds(List<String> nonFungibleIds) {
    this.nonFungibleIds = nonFungibleIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateNonFungibleDataRequest stateNonFungibleDataRequest = (StateNonFungibleDataRequest) o;
    return equalsNullable(this.atLedgerState, stateNonFungibleDataRequest.atLedgerState) &&
        Objects.equals(this.resourceAddress, stateNonFungibleDataRequest.resourceAddress) &&
        Objects.equals(this.nonFungibleIds, stateNonFungibleDataRequest.nonFungibleIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(atLedgerState), resourceAddress, nonFungibleIds);
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
    sb.append("class StateNonFungibleDataRequest {\n");
    sb.append("    atLedgerState: ").append(toIndentedString(atLedgerState)).append("\n");
    sb.append("    resourceAddress: ").append(toIndentedString(resourceAddress)).append("\n");
    sb.append("    nonFungibleIds: ").append(toIndentedString(nonFungibleIds)).append("\n");
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

    // add `resource_address` to the URL query string
    if (getResourceAddress() != null) {
      try {
        joiner.add(String.format("%sresource_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResourceAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `non_fungible_ids` to the URL query string
    if (getNonFungibleIds() != null) {
      for (int i = 0; i < getNonFungibleIds().size(); i++) {
        try {
          joiner.add(String.format("%snon_fungible_ids%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getNonFungibleIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

