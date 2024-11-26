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
import java.util.ArrayList;
import java.util.Arrays;
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
 * For &#x60;at_ledger_state&#x60; and &#x60;from_ledger_state&#x60; you can use one of &#x60;state_version&#x60;, &#x60;epoch&#x60;, &#x60;epoch&#x60; and &#x60;round&#x60;, or &#x60;timestamp&#x60;, but then ongoing epoch will be selected and used for querying data. i.e for request with &#x60;{ \&quot;from_state_version\&quot; &#x3D; { \&quot;state_version\&quot; &#x3D; 100 }, \&quot;at_state_version\&quot; &#x3D; { \&quot;state_version\&quot; &#x3D; 300} }&#x60; gateway api will check in which epoch transactions with state version 100 and 300 were and then use that as inclusive boundary for request. 
 */
@JsonPropertyOrder({
  ValidatorsUptimeRequest.JSON_PROPERTY_AT_LEDGER_STATE,
  ValidatorsUptimeRequest.JSON_PROPERTY_FROM_LEDGER_STATE,
  ValidatorsUptimeRequest.JSON_PROPERTY_VALIDATOR_ADDRESSES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:09:04.159608300+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ValidatorsUptimeRequest {
  public static final String JSON_PROPERTY_AT_LEDGER_STATE = "at_ledger_state";
  private JsonNullable<LedgerStateSelector> atLedgerState = JsonNullable.<LedgerStateSelector>undefined();

  public static final String JSON_PROPERTY_FROM_LEDGER_STATE = "from_ledger_state";
  private JsonNullable<LedgerStateSelector> fromLedgerState = JsonNullable.<LedgerStateSelector>undefined();

  public static final String JSON_PROPERTY_VALIDATOR_ADDRESSES = "validator_addresses";
  private List<String> validatorAddresses = new ArrayList<>();

  public ValidatorsUptimeRequest() {
  }

  public ValidatorsUptimeRequest atLedgerState(LedgerStateSelector atLedgerState) {
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

  public ValidatorsUptimeRequest fromLedgerState(LedgerStateSelector fromLedgerState) {
    this.fromLedgerState = JsonNullable.<LedgerStateSelector>of(fromLedgerState);
    
    return this;
  }

  /**
   * Get fromLedgerState
   * @return fromLedgerState
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public LedgerStateSelector getFromLedgerState() {
        return fromLedgerState.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FROM_LEDGER_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LedgerStateSelector> getFromLedgerState_JsonNullable() {
    return fromLedgerState;
  }
  
  @JsonProperty(JSON_PROPERTY_FROM_LEDGER_STATE)
  public void setFromLedgerState_JsonNullable(JsonNullable<LedgerStateSelector> fromLedgerState) {
    this.fromLedgerState = fromLedgerState;
  }

  public void setFromLedgerState(LedgerStateSelector fromLedgerState) {
    this.fromLedgerState = JsonNullable.<LedgerStateSelector>of(fromLedgerState);
  }

  public ValidatorsUptimeRequest validatorAddresses(List<String> validatorAddresses) {
    
    this.validatorAddresses = validatorAddresses;
    return this;
  }

  public ValidatorsUptimeRequest addValidatorAddressesItem(String validatorAddressesItem) {
    if (this.validatorAddresses == null) {
      this.validatorAddresses = new ArrayList<>();
    }
    this.validatorAddresses.add(validatorAddressesItem);
    return this;
  }

  /**
   * Get validatorAddresses
   * @return validatorAddresses
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDATOR_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getValidatorAddresses() {
    return validatorAddresses;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATOR_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidatorAddresses(List<String> validatorAddresses) {
    this.validatorAddresses = validatorAddresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatorsUptimeRequest validatorsUptimeRequest = (ValidatorsUptimeRequest) o;
    return equalsNullable(this.atLedgerState, validatorsUptimeRequest.atLedgerState) &&
        equalsNullable(this.fromLedgerState, validatorsUptimeRequest.fromLedgerState) &&
        Objects.equals(this.validatorAddresses, validatorsUptimeRequest.validatorAddresses);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(atLedgerState), hashCodeNullable(fromLedgerState), validatorAddresses);
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
    sb.append("class ValidatorsUptimeRequest {\n");
    sb.append("    atLedgerState: ").append(toIndentedString(atLedgerState)).append("\n");
    sb.append("    fromLedgerState: ").append(toIndentedString(fromLedgerState)).append("\n");
    sb.append("    validatorAddresses: ").append(toIndentedString(validatorAddresses)).append("\n");
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

    // add `from_ledger_state` to the URL query string
    if (getFromLedgerState() != null) {
      joiner.add(getFromLedgerState().toUrlQueryString(prefix + "from_ledger_state" + suffix));
    }

    // add `validator_addresses` to the URL query string
    if (getValidatorAddresses() != null) {
      for (int i = 0; i < getValidatorAddresses().size(); i++) {
        try {
          joiner.add(String.format("%svalidator_addresses%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getValidatorAddresses().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

