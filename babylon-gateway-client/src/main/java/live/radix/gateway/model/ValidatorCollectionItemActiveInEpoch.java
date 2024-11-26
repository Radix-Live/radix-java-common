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
import live.radix.gateway.model.PublicKey;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ValidatorCollectionItemActiveInEpoch
 */
@JsonPropertyOrder({
  ValidatorCollectionItemActiveInEpoch.JSON_PROPERTY_STAKE,
  ValidatorCollectionItemActiveInEpoch.JSON_PROPERTY_STAKE_PERCENTAGE,
  ValidatorCollectionItemActiveInEpoch.JSON_PROPERTY_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:09:04.159608300+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ValidatorCollectionItemActiveInEpoch {
  public static final String JSON_PROPERTY_STAKE = "stake";
  private String stake;

  public static final String JSON_PROPERTY_STAKE_PERCENTAGE = "stake_percentage";
  private Double stakePercentage;

  public static final String JSON_PROPERTY_KEY = "key";
  private PublicKey key;

  public ValidatorCollectionItemActiveInEpoch() {
  }

  public ValidatorCollectionItemActiveInEpoch stake(String stake) {
    
    this.stake = stake;
    return this;
  }

  /**
   * String-encoded decimal representing the amount of a related fungible resource.
   * @return stake
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STAKE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStake() {
    return stake;
  }


  @JsonProperty(JSON_PROPERTY_STAKE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStake(String stake) {
    this.stake = stake;
  }

  public ValidatorCollectionItemActiveInEpoch stakePercentage(Double stakePercentage) {
    
    this.stakePercentage = stakePercentage;
    return this;
  }

  /**
   * Get stakePercentage
   * @return stakePercentage
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STAKE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getStakePercentage() {
    return stakePercentage;
  }


  @JsonProperty(JSON_PROPERTY_STAKE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStakePercentage(Double stakePercentage) {
    this.stakePercentage = stakePercentage;
  }

  public ValidatorCollectionItemActiveInEpoch key(PublicKey key) {
    
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PublicKey getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(PublicKey key) {
    this.key = key;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatorCollectionItemActiveInEpoch validatorCollectionItemActiveInEpoch = (ValidatorCollectionItemActiveInEpoch) o;
    return Objects.equals(this.stake, validatorCollectionItemActiveInEpoch.stake) &&
        Objects.equals(this.stakePercentage, validatorCollectionItemActiveInEpoch.stakePercentage) &&
        Objects.equals(this.key, validatorCollectionItemActiveInEpoch.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stake, stakePercentage, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatorCollectionItemActiveInEpoch {\n");
    sb.append("    stake: ").append(toIndentedString(stake)).append("\n");
    sb.append("    stakePercentage: ").append(toIndentedString(stakePercentage)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

    // add `stake` to the URL query string
    if (getStake() != null) {
      try {
        joiner.add(String.format("%sstake%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStake()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `stake_percentage` to the URL query string
    if (getStakePercentage() != null) {
      try {
        joiner.add(String.format("%sstake_percentage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStakePercentage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(getKey().toUrlQueryString(prefix + "key" + suffix));
    }

    return joiner.toString();
  }

}

