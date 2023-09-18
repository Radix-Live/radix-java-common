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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import live.radix.core.model.MethodAccessibility;
import live.radix.core.model.RoleDetails;
import live.radix.core.model.RoleSpecification;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StaticRoleDefinitionAuthTemplate
 */
@JsonPropertyOrder({
  StaticRoleDefinitionAuthTemplate.JSON_PROPERTY_ROLE_SPECIFICATION,
  StaticRoleDefinitionAuthTemplate.JSON_PROPERTY_ROLES,
  StaticRoleDefinitionAuthTemplate.JSON_PROPERTY_METHOD_ACCESSIBILITY_MAP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class StaticRoleDefinitionAuthTemplate {
  public static final String JSON_PROPERTY_ROLE_SPECIFICATION = "role_specification";
  private RoleSpecification roleSpecification;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private Map<String, RoleDetails> roles = new HashMap<>();

  public static final String JSON_PROPERTY_METHOD_ACCESSIBILITY_MAP = "method_accessibility_map";
  private Map<String, MethodAccessibility> methodAccessibilityMap = new HashMap<>();

  public StaticRoleDefinitionAuthTemplate() {
  }

  public StaticRoleDefinitionAuthTemplate roleSpecification(RoleSpecification roleSpecification) {
    
    this.roleSpecification = roleSpecification;
    return this;
  }

   /**
   * Get roleSpecification
   * @return roleSpecification
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE_SPECIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoleSpecification getRoleSpecification() {
    return roleSpecification;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_SPECIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoleSpecification(RoleSpecification roleSpecification) {
    this.roleSpecification = roleSpecification;
  }


  public StaticRoleDefinitionAuthTemplate roles(Map<String, RoleDetails> roles) {
    
    this.roles = roles;
    return this;
  }

  public StaticRoleDefinitionAuthTemplate putRolesItem(String key, RoleDetails rolesItem) {
    if (this.roles == null) {
      this.roles = new HashMap<>();
    }
    this.roles.put(key, rolesItem);
    return this;
  }

   /**
   * A map from role name to role details
   * @return roles
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, RoleDetails> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(Map<String, RoleDetails> roles) {
    this.roles = roles;
  }


  public StaticRoleDefinitionAuthTemplate methodAccessibilityMap(Map<String, MethodAccessibility> methodAccessibilityMap) {
    
    this.methodAccessibilityMap = methodAccessibilityMap;
    return this;
  }

  public StaticRoleDefinitionAuthTemplate putMethodAccessibilityMapItem(String key, MethodAccessibility methodAccessibilityMapItem) {
    this.methodAccessibilityMap.put(key, methodAccessibilityMapItem);
    return this;
  }

   /**
   * A map from a method identifier to MethodAccessibility
   * @return methodAccessibilityMap
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_METHOD_ACCESSIBILITY_MAP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, MethodAccessibility> getMethodAccessibilityMap() {
    return methodAccessibilityMap;
  }


  @JsonProperty(JSON_PROPERTY_METHOD_ACCESSIBILITY_MAP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMethodAccessibilityMap(Map<String, MethodAccessibility> methodAccessibilityMap) {
    this.methodAccessibilityMap = methodAccessibilityMap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticRoleDefinitionAuthTemplate staticRoleDefinitionAuthTemplate = (StaticRoleDefinitionAuthTemplate) o;
    return Objects.equals(this.roleSpecification, staticRoleDefinitionAuthTemplate.roleSpecification) &&
        Objects.equals(this.roles, staticRoleDefinitionAuthTemplate.roles) &&
        Objects.equals(this.methodAccessibilityMap, staticRoleDefinitionAuthTemplate.methodAccessibilityMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleSpecification, roles, methodAccessibilityMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticRoleDefinitionAuthTemplate {\n");
    sb.append("    roleSpecification: ").append(toIndentedString(roleSpecification)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    methodAccessibilityMap: ").append(toIndentedString(methodAccessibilityMap)).append("\n");
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

    // add `role_specification` to the URL query string
    if (getRoleSpecification() != null) {
      try {
        joiner.add(String.format("%srole_specification%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoleSpecification()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `roles` to the URL query string
    if (getRoles() != null) {
      for (String _key : getRoles().keySet()) {
        if (getRoles().get(_key) != null) {
          joiner.add(getRoles().get(_key).toUrlQueryString(String.format("%sroles%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `method_accessibility_map` to the URL query string
    if (getMethodAccessibilityMap() != null) {
      for (String _key : getMethodAccessibilityMap().keySet()) {
        if (getMethodAccessibilityMap().get(_key) != null) {
          joiner.add(getMethodAccessibilityMap().get(_key).toUrlQueryString(String.format("%smethod_accessibility_map%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

