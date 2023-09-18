/*
 * Babylon Core API - RCnet v3.1
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  It is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  This version of the Core API belongs to the fourth release candidate of the Radix Babylon network (\"RCnet v3.1\").  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` are guaranteed to be forward compatible to Babylon mainnet launch (and beyond). We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code. 
 *
 * The version of the OpenAPI document: 0.5.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.core.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import live.radix.core.model.EncryptedMessageCurveDecryptorSet;
import live.radix.core.model.TransactionMessage;
import live.radix.core.model.TransactionMessageType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * EncryptedTransactionMessage
 */
@JsonPropertyOrder({
  EncryptedTransactionMessage.JSON_PROPERTY_ENCRYPTED_HEX,
  EncryptedTransactionMessage.JSON_PROPERTY_CURVE_DECRYPTOR_SETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class EncryptedTransactionMessage extends TransactionMessage {
  public static final String JSON_PROPERTY_ENCRYPTED_HEX = "encrypted_hex";
  private String encryptedHex;

  public static final String JSON_PROPERTY_CURVE_DECRYPTOR_SETS = "curve_decryptor_sets";
  private List<EncryptedMessageCurveDecryptorSet> curveDecryptorSets = new ArrayList<>();

  public EncryptedTransactionMessage() {

  }

  public EncryptedTransactionMessage encryptedHex(String encryptedHex) {
    
    this.encryptedHex = encryptedHex;
    return this;
  }

   /**
   * The hex-encoded (128-bit) AES-GCM encrypted bytes of an SBOR-encoded &#x60;PlaintextTransactionMessage&#x60;. The bytes are serialized as the concatenation &#x60;Nonce/IV (12 bytes) || Cipher (variable length) || Tag/MAC (16 bytes)&#x60;: 
   * @return encryptedHex
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEncryptedHex() {
    return encryptedHex;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTED_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEncryptedHex(String encryptedHex) {
    this.encryptedHex = encryptedHex;
  }


  public EncryptedTransactionMessage curveDecryptorSets(List<EncryptedMessageCurveDecryptorSet> curveDecryptorSets) {
    
    this.curveDecryptorSets = curveDecryptorSets;
    return this;
  }

  public EncryptedTransactionMessage addCurveDecryptorSetsItem(EncryptedMessageCurveDecryptorSet curveDecryptorSetsItem) {
    if (this.curveDecryptorSets == null) {
      this.curveDecryptorSets = new ArrayList<>();
    }
    this.curveDecryptorSets.add(curveDecryptorSetsItem);
    return this;
  }

   /**
   * Get curveDecryptorSets
   * @return curveDecryptorSets
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURVE_DECRYPTOR_SETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<EncryptedMessageCurveDecryptorSet> getCurveDecryptorSets() {
    return curveDecryptorSets;
  }


  @JsonProperty(JSON_PROPERTY_CURVE_DECRYPTOR_SETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurveDecryptorSets(List<EncryptedMessageCurveDecryptorSet> curveDecryptorSets) {
    this.curveDecryptorSets = curveDecryptorSets;
  }

  @Override
  public EncryptedTransactionMessage type(TransactionMessageType type) {
    this.setType(type);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedTransactionMessage encryptedTransactionMessage = (EncryptedTransactionMessage) o;
    return Objects.equals(this.encryptedHex, encryptedTransactionMessage.encryptedHex) &&
        Objects.equals(this.curveDecryptorSets, encryptedTransactionMessage.curveDecryptorSets) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedHex, curveDecryptorSets, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedTransactionMessage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encryptedHex: ").append(toIndentedString(encryptedHex)).append("\n");
    sb.append("    curveDecryptorSets: ").append(toIndentedString(curveDecryptorSets)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `encrypted_hex` to the URL query string
    if (getEncryptedHex() != null) {
      try {
        joiner.add(String.format("%sencrypted_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEncryptedHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `curve_decryptor_sets` to the URL query string
    if (getCurveDecryptorSets() != null) {
      for (int i = 0; i < getCurveDecryptorSets().size(); i++) {
        if (getCurveDecryptorSets().get(i) != null) {
          joiner.add(getCurveDecryptorSets().get(i).toUrlQueryString(String.format("%scurve_decryptor_sets%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

