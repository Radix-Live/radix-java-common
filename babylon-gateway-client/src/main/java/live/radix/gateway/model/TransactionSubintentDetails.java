/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.9.2-L
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionSubintentDetails
 */
@JsonPropertyOrder({
  TransactionSubintentDetails.JSON_PROPERTY_SUBINTENT_HASH,
  TransactionSubintentDetails.JSON_PROPERTY_MANIFEST_INSTRUCTIONS,
  TransactionSubintentDetails.JSON_PROPERTY_MESSAGE,
  TransactionSubintentDetails.JSON_PROPERTY_CHILD_SUBINTENT_HASHES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T19:38:04.213407200+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class TransactionSubintentDetails {
  public static final String JSON_PROPERTY_SUBINTENT_HASH = "subintent_hash";
  private String subintentHash;

  public static final String JSON_PROPERTY_MANIFEST_INSTRUCTIONS = "manifest_instructions";
  private String manifestInstructions;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private Object message;

  public static final String JSON_PROPERTY_CHILD_SUBINTENT_HASHES = "child_subintent_hashes";
  private List<String> childSubintentHashes = new ArrayList<>();

  public TransactionSubintentDetails() {
  }

  public TransactionSubintentDetails subintentHash(String subintentHash) {
    
    this.subintentHash = subintentHash;
    return this;
  }

  /**
   * Bech32m-encoded hash.
   * @return subintentHash
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBINTENT_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubintentHash() {
    return subintentHash;
  }


  @JsonProperty(JSON_PROPERTY_SUBINTENT_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubintentHash(String subintentHash) {
    this.subintentHash = subintentHash;
  }

  public TransactionSubintentDetails manifestInstructions(String manifestInstructions) {
    
    this.manifestInstructions = manifestInstructions;
    return this;
  }

  /**
   * A text-representation of a subintent manifest. This field will be present only for user transactions and when explicitly opted-in using the &#x60;manifest_instructions&#x60; flag. 
   * @return manifestInstructions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANIFEST_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManifestInstructions() {
    return manifestInstructions;
  }


  @JsonProperty(JSON_PROPERTY_MANIFEST_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManifestInstructions(String manifestInstructions) {
    this.manifestInstructions = manifestInstructions;
  }

  public TransactionSubintentDetails message(Object message) {
    
    this.message = message;
    return this;
  }

  /**
   * The optional subintent message. This type is defined in the Core API as &#x60;TransactionMessage&#x60;. See the Core API documentation for more details. 
   * @return message
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(Object message) {
    this.message = message;
  }

  public TransactionSubintentDetails childSubintentHashes(List<String> childSubintentHashes) {
    
    this.childSubintentHashes = childSubintentHashes;
    return this;
  }

  public TransactionSubintentDetails addChildSubintentHashesItem(String childSubintentHashesItem) {
    if (this.childSubintentHashes == null) {
      this.childSubintentHashes = new ArrayList<>();
    }
    this.childSubintentHashes.add(childSubintentHashesItem);
    return this;
  }

  /**
   * The subintent hash of each child of the subintent.
   * @return childSubintentHashes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILD_SUBINTENT_HASHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getChildSubintentHashes() {
    return childSubintentHashes;
  }


  @JsonProperty(JSON_PROPERTY_CHILD_SUBINTENT_HASHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildSubintentHashes(List<String> childSubintentHashes) {
    this.childSubintentHashes = childSubintentHashes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSubintentDetails transactionSubintentDetails = (TransactionSubintentDetails) o;
    return Objects.equals(this.subintentHash, transactionSubintentDetails.subintentHash) &&
        Objects.equals(this.manifestInstructions, transactionSubintentDetails.manifestInstructions) &&
        Objects.equals(this.message, transactionSubintentDetails.message) &&
        Objects.equals(this.childSubintentHashes, transactionSubintentDetails.childSubintentHashes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subintentHash, manifestInstructions, message, childSubintentHashes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSubintentDetails {\n");
    sb.append("    subintentHash: ").append(toIndentedString(subintentHash)).append("\n");
    sb.append("    manifestInstructions: ").append(toIndentedString(manifestInstructions)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    childSubintentHashes: ").append(toIndentedString(childSubintentHashes)).append("\n");
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

    // add `subintent_hash` to the URL query string
    if (getSubintentHash() != null) {
      try {
        joiner.add(String.format("%ssubintent_hash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubintentHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `manifest_instructions` to the URL query string
    if (getManifestInstructions() != null) {
      try {
        joiner.add(String.format("%smanifest_instructions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getManifestInstructions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      try {
        joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `child_subintent_hashes` to the URL query string
    if (getChildSubintentHashes() != null) {
      for (int i = 0; i < getChildSubintentHashes().size(); i++) {
        try {
          joiner.add(String.format("%schild_subintent_hashes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getChildSubintentHashes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

