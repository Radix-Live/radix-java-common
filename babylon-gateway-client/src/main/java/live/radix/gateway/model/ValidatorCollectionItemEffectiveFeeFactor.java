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
import live.radix.gateway.model.ValidatorCollectionItemEffectiveFeeFactorCurrent;
import live.radix.gateway.model.ValidatorCollectionItemEffectiveFeeFactorPending;
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
 * ValidatorCollectionItemEffectiveFeeFactor
 */
@JsonPropertyOrder({
  ValidatorCollectionItemEffectiveFeeFactor.JSON_PROPERTY_CURRENT,
  ValidatorCollectionItemEffectiveFeeFactor.JSON_PROPERTY_PENDING
})
@JsonTypeName("ValidatorCollectionItem_effective_fee_factor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:09:04.159608300+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ValidatorCollectionItemEffectiveFeeFactor {
  public static final String JSON_PROPERTY_CURRENT = "current";
  private ValidatorCollectionItemEffectiveFeeFactorCurrent current;

  public static final String JSON_PROPERTY_PENDING = "pending";
  private JsonNullable<ValidatorCollectionItemEffectiveFeeFactorPending> pending = JsonNullable.<ValidatorCollectionItemEffectiveFeeFactorPending>undefined();

  public ValidatorCollectionItemEffectiveFeeFactor() {
  }

  public ValidatorCollectionItemEffectiveFeeFactor current(ValidatorCollectionItemEffectiveFeeFactorCurrent current) {
    
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ValidatorCollectionItemEffectiveFeeFactorCurrent getCurrent() {
    return current;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrent(ValidatorCollectionItemEffectiveFeeFactorCurrent current) {
    this.current = current;
  }

  public ValidatorCollectionItemEffectiveFeeFactor pending(ValidatorCollectionItemEffectiveFeeFactorPending pending) {
    this.pending = JsonNullable.<ValidatorCollectionItemEffectiveFeeFactorPending>of(pending);
    
    return this;
  }

  /**
   * Get pending
   * @return pending
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public ValidatorCollectionItemEffectiveFeeFactorPending getPending() {
        return pending.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ValidatorCollectionItemEffectiveFeeFactorPending> getPending_JsonNullable() {
    return pending;
  }
  
  @JsonProperty(JSON_PROPERTY_PENDING)
  public void setPending_JsonNullable(JsonNullable<ValidatorCollectionItemEffectiveFeeFactorPending> pending) {
    this.pending = pending;
  }

  public void setPending(ValidatorCollectionItemEffectiveFeeFactorPending pending) {
    this.pending = JsonNullable.<ValidatorCollectionItemEffectiveFeeFactorPending>of(pending);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatorCollectionItemEffectiveFeeFactor validatorCollectionItemEffectiveFeeFactor = (ValidatorCollectionItemEffectiveFeeFactor) o;
    return Objects.equals(this.current, validatorCollectionItemEffectiveFeeFactor.current) &&
        equalsNullable(this.pending, validatorCollectionItemEffectiveFeeFactor.pending);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, hashCodeNullable(pending));
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
    sb.append("class ValidatorCollectionItemEffectiveFeeFactor {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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

    // add `current` to the URL query string
    if (getCurrent() != null) {
      joiner.add(getCurrent().toUrlQueryString(prefix + "current" + suffix));
    }

    // add `pending` to the URL query string
    if (getPending() != null) {
      joiner.add(getPending().toUrlQueryString(prefix + "pending" + suffix));
    }

    return joiner.toString();
  }

}

