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
 * ValidatorUptimeCollectionItem
 */
@JsonPropertyOrder({
  ValidatorUptimeCollectionItem.JSON_PROPERTY_ADDRESS,
  ValidatorUptimeCollectionItem.JSON_PROPERTY_PROPOSALS_MADE,
  ValidatorUptimeCollectionItem.JSON_PROPERTY_PROPOSALS_MISSED,
  ValidatorUptimeCollectionItem.JSON_PROPERTY_EPOCHS_ACTIVE_IN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:09:04.159608300+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ValidatorUptimeCollectionItem {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_PROPOSALS_MADE = "proposals_made";
  private JsonNullable<Long> proposalsMade = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_PROPOSALS_MISSED = "proposals_missed";
  private JsonNullable<Long> proposalsMissed = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_EPOCHS_ACTIVE_IN = "epochs_active_in";
  private Long epochsActiveIn;

  public ValidatorUptimeCollectionItem() {
  }

  public ValidatorUptimeCollectionItem address(String address) {
    
    this.address = address;
    return this;
  }

  /**
   * Bech32m-encoded human readable version of the address.
   * @return address
   */
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

  public ValidatorUptimeCollectionItem proposalsMade(Long proposalsMade) {
    this.proposalsMade = JsonNullable.<Long>of(proposalsMade);
    
    return this;
  }

  /**
   * number of proposals made.
   * @return proposalsMade
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getProposalsMade() {
        return proposalsMade.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROPOSALS_MADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getProposalsMade_JsonNullable() {
    return proposalsMade;
  }
  
  @JsonProperty(JSON_PROPERTY_PROPOSALS_MADE)
  public void setProposalsMade_JsonNullable(JsonNullable<Long> proposalsMade) {
    this.proposalsMade = proposalsMade;
  }

  public void setProposalsMade(Long proposalsMade) {
    this.proposalsMade = JsonNullable.<Long>of(proposalsMade);
  }

  public ValidatorUptimeCollectionItem proposalsMissed(Long proposalsMissed) {
    this.proposalsMissed = JsonNullable.<Long>of(proposalsMissed);
    
    return this;
  }

  /**
   * number of proposals missed.
   * @return proposalsMissed
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getProposalsMissed() {
        return proposalsMissed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROPOSALS_MISSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getProposalsMissed_JsonNullable() {
    return proposalsMissed;
  }
  
  @JsonProperty(JSON_PROPERTY_PROPOSALS_MISSED)
  public void setProposalsMissed_JsonNullable(JsonNullable<Long> proposalsMissed) {
    this.proposalsMissed = proposalsMissed;
  }

  public void setProposalsMissed(Long proposalsMissed) {
    this.proposalsMissed = JsonNullable.<Long>of(proposalsMissed);
  }

  public ValidatorUptimeCollectionItem epochsActiveIn(Long epochsActiveIn) {
    
    this.epochsActiveIn = epochsActiveIn;
    return this;
  }

  /**
   * number of epochs validator was active in.
   * @return epochsActiveIn
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EPOCHS_ACTIVE_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getEpochsActiveIn() {
    return epochsActiveIn;
  }


  @JsonProperty(JSON_PROPERTY_EPOCHS_ACTIVE_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEpochsActiveIn(Long epochsActiveIn) {
    this.epochsActiveIn = epochsActiveIn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatorUptimeCollectionItem validatorUptimeCollectionItem = (ValidatorUptimeCollectionItem) o;
    return Objects.equals(this.address, validatorUptimeCollectionItem.address) &&
        equalsNullable(this.proposalsMade, validatorUptimeCollectionItem.proposalsMade) &&
        equalsNullable(this.proposalsMissed, validatorUptimeCollectionItem.proposalsMissed) &&
        Objects.equals(this.epochsActiveIn, validatorUptimeCollectionItem.epochsActiveIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, hashCodeNullable(proposalsMade), hashCodeNullable(proposalsMissed), epochsActiveIn);
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
    sb.append("class ValidatorUptimeCollectionItem {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    proposalsMade: ").append(toIndentedString(proposalsMade)).append("\n");
    sb.append("    proposalsMissed: ").append(toIndentedString(proposalsMissed)).append("\n");
    sb.append("    epochsActiveIn: ").append(toIndentedString(epochsActiveIn)).append("\n");
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

    // add `address` to the URL query string
    if (getAddress() != null) {
      try {
        joiner.add(String.format("%saddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `proposals_made` to the URL query string
    if (getProposalsMade() != null) {
      try {
        joiner.add(String.format("%sproposals_made%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProposalsMade()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `proposals_missed` to the URL query string
    if (getProposalsMissed() != null) {
      try {
        joiner.add(String.format("%sproposals_missed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProposalsMissed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `epochs_active_in` to the URL query string
    if (getEpochsActiveIn() != null) {
      try {
        joiner.add(String.format("%sepochs_active_in%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEpochsActiveIn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

