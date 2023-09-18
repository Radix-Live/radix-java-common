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
import live.radix.gateway.model.EntityMetadataCollection;
import live.radix.gateway.model.ValidatorCollectionItemActiveInEpoch;
import live.radix.gateway.model.ValidatorVaultItem;
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
 * ValidatorCollectionItem
 */
@JsonPropertyOrder({
  ValidatorCollectionItem.JSON_PROPERTY_ADDRESS,
  ValidatorCollectionItem.JSON_PROPERTY_STAKE_VAULT,
  ValidatorCollectionItem.JSON_PROPERTY_PENDING_XRD_WITHDRAW_VAULT,
  ValidatorCollectionItem.JSON_PROPERTY_LOCKED_OWNER_STAKE_UNIT_VAULT,
  ValidatorCollectionItem.JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_UNLOCK_VAULT,
  ValidatorCollectionItem.JSON_PROPERTY_STATE,
  ValidatorCollectionItem.JSON_PROPERTY_ACTIVE_IN_EPOCH,
  ValidatorCollectionItem.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class ValidatorCollectionItem {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_STAKE_VAULT = "stake_vault";
  private ValidatorVaultItem stakeVault;

  public static final String JSON_PROPERTY_PENDING_XRD_WITHDRAW_VAULT = "pending_xrd_withdraw_vault";
  private ValidatorVaultItem pendingXrdWithdrawVault;

  public static final String JSON_PROPERTY_LOCKED_OWNER_STAKE_UNIT_VAULT = "locked_owner_stake_unit_vault";
  private ValidatorVaultItem lockedOwnerStakeUnitVault;

  public static final String JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_UNLOCK_VAULT = "pending_owner_stake_unit_unlock_vault";
  private ValidatorVaultItem pendingOwnerStakeUnitUnlockVault;

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<Object> state = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_ACTIVE_IN_EPOCH = "active_in_epoch";
  private ValidatorCollectionItemActiveInEpoch activeInEpoch;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private EntityMetadataCollection metadata;

  public ValidatorCollectionItem() {
  }

  public ValidatorCollectionItem address(String address) {
    
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


  public ValidatorCollectionItem stakeVault(ValidatorVaultItem stakeVault) {
    
    this.stakeVault = stakeVault;
    return this;
  }

   /**
   * Get stakeVault
   * @return stakeVault
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STAKE_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ValidatorVaultItem getStakeVault() {
    return stakeVault;
  }


  @JsonProperty(JSON_PROPERTY_STAKE_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStakeVault(ValidatorVaultItem stakeVault) {
    this.stakeVault = stakeVault;
  }


  public ValidatorCollectionItem pendingXrdWithdrawVault(ValidatorVaultItem pendingXrdWithdrawVault) {
    
    this.pendingXrdWithdrawVault = pendingXrdWithdrawVault;
    return this;
  }

   /**
   * Get pendingXrdWithdrawVault
   * @return pendingXrdWithdrawVault
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PENDING_XRD_WITHDRAW_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ValidatorVaultItem getPendingXrdWithdrawVault() {
    return pendingXrdWithdrawVault;
  }


  @JsonProperty(JSON_PROPERTY_PENDING_XRD_WITHDRAW_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPendingXrdWithdrawVault(ValidatorVaultItem pendingXrdWithdrawVault) {
    this.pendingXrdWithdrawVault = pendingXrdWithdrawVault;
  }


  public ValidatorCollectionItem lockedOwnerStakeUnitVault(ValidatorVaultItem lockedOwnerStakeUnitVault) {
    
    this.lockedOwnerStakeUnitVault = lockedOwnerStakeUnitVault;
    return this;
  }

   /**
   * Get lockedOwnerStakeUnitVault
   * @return lockedOwnerStakeUnitVault
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCKED_OWNER_STAKE_UNIT_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ValidatorVaultItem getLockedOwnerStakeUnitVault() {
    return lockedOwnerStakeUnitVault;
  }


  @JsonProperty(JSON_PROPERTY_LOCKED_OWNER_STAKE_UNIT_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLockedOwnerStakeUnitVault(ValidatorVaultItem lockedOwnerStakeUnitVault) {
    this.lockedOwnerStakeUnitVault = lockedOwnerStakeUnitVault;
  }


  public ValidatorCollectionItem pendingOwnerStakeUnitUnlockVault(ValidatorVaultItem pendingOwnerStakeUnitUnlockVault) {
    
    this.pendingOwnerStakeUnitUnlockVault = pendingOwnerStakeUnitUnlockVault;
    return this;
  }

   /**
   * Get pendingOwnerStakeUnitUnlockVault
   * @return pendingOwnerStakeUnitUnlockVault
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_UNLOCK_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ValidatorVaultItem getPendingOwnerStakeUnitUnlockVault() {
    return pendingOwnerStakeUnitUnlockVault;
  }


  @JsonProperty(JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_UNLOCK_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPendingOwnerStakeUnitUnlockVault(ValidatorVaultItem pendingOwnerStakeUnitUnlockVault) {
    this.pendingOwnerStakeUnitUnlockVault = pendingOwnerStakeUnitUnlockVault;
  }


  public ValidatorCollectionItem state(Object state) {
    this.state = JsonNullable.<Object>of(state);
    
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getState() {
        return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getState_JsonNullable() {
    return state;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<Object> state) {
    this.state = state;
  }

  public void setState(Object state) {
    this.state = JsonNullable.<Object>of(state);
  }


  public ValidatorCollectionItem activeInEpoch(ValidatorCollectionItemActiveInEpoch activeInEpoch) {
    
    this.activeInEpoch = activeInEpoch;
    return this;
  }

   /**
   * Get activeInEpoch
   * @return activeInEpoch
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_IN_EPOCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValidatorCollectionItemActiveInEpoch getActiveInEpoch() {
    return activeInEpoch;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_IN_EPOCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveInEpoch(ValidatorCollectionItemActiveInEpoch activeInEpoch) {
    this.activeInEpoch = activeInEpoch;
  }


  public ValidatorCollectionItem metadata(EntityMetadataCollection metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityMetadataCollection getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(EntityMetadataCollection metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatorCollectionItem validatorCollectionItem = (ValidatorCollectionItem) o;
    return Objects.equals(this.address, validatorCollectionItem.address) &&
        Objects.equals(this.stakeVault, validatorCollectionItem.stakeVault) &&
        Objects.equals(this.pendingXrdWithdrawVault, validatorCollectionItem.pendingXrdWithdrawVault) &&
        Objects.equals(this.lockedOwnerStakeUnitVault, validatorCollectionItem.lockedOwnerStakeUnitVault) &&
        Objects.equals(this.pendingOwnerStakeUnitUnlockVault, validatorCollectionItem.pendingOwnerStakeUnitUnlockVault) &&
        equalsNullable(this.state, validatorCollectionItem.state) &&
        Objects.equals(this.activeInEpoch, validatorCollectionItem.activeInEpoch) &&
        Objects.equals(this.metadata, validatorCollectionItem.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, stakeVault, pendingXrdWithdrawVault, lockedOwnerStakeUnitVault, pendingOwnerStakeUnitUnlockVault, hashCodeNullable(state), activeInEpoch, metadata);
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
    sb.append("class ValidatorCollectionItem {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    stakeVault: ").append(toIndentedString(stakeVault)).append("\n");
    sb.append("    pendingXrdWithdrawVault: ").append(toIndentedString(pendingXrdWithdrawVault)).append("\n");
    sb.append("    lockedOwnerStakeUnitVault: ").append(toIndentedString(lockedOwnerStakeUnitVault)).append("\n");
    sb.append("    pendingOwnerStakeUnitUnlockVault: ").append(toIndentedString(pendingOwnerStakeUnitUnlockVault)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    activeInEpoch: ").append(toIndentedString(activeInEpoch)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

    // add `stake_vault` to the URL query string
    if (getStakeVault() != null) {
      joiner.add(getStakeVault().toUrlQueryString(prefix + "stake_vault" + suffix));
    }

    // add `pending_xrd_withdraw_vault` to the URL query string
    if (getPendingXrdWithdrawVault() != null) {
      joiner.add(getPendingXrdWithdrawVault().toUrlQueryString(prefix + "pending_xrd_withdraw_vault" + suffix));
    }

    // add `locked_owner_stake_unit_vault` to the URL query string
    if (getLockedOwnerStakeUnitVault() != null) {
      joiner.add(getLockedOwnerStakeUnitVault().toUrlQueryString(prefix + "locked_owner_stake_unit_vault" + suffix));
    }

    // add `pending_owner_stake_unit_unlock_vault` to the URL query string
    if (getPendingOwnerStakeUnitUnlockVault() != null) {
      joiner.add(getPendingOwnerStakeUnitUnlockVault().toUrlQueryString(prefix + "pending_owner_stake_unit_unlock_vault" + suffix));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `active_in_epoch` to the URL query string
    if (getActiveInEpoch() != null) {
      joiner.add(getActiveInEpoch().toUrlQueryString(prefix + "active_in_epoch" + suffix));
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      joiner.add(getMetadata().toUrlQueryString(prefix + "metadata" + suffix));
    }

    return joiner.toString();
  }

}

