/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 5.2.0
 * Contact: devrel@onesignal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onesignal.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.onesignal.client.JSON;

/**
 * SubscriptionNotificationTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionNotificationTarget {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INCLUDE_SUBSCRIPTION_IDS = "include_subscription_ids";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SUBSCRIPTION_IDS)
  private List<String> includeSubscriptionIds = null;

  public static final String SERIALIZED_NAME_INCLUDE_EMAIL_TOKENS = "include_email_tokens";
  @SerializedName(SERIALIZED_NAME_INCLUDE_EMAIL_TOKENS)
  private List<String> includeEmailTokens = null;

  public static final String SERIALIZED_NAME_INCLUDE_PHONE_NUMBERS = "include_phone_numbers";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PHONE_NUMBERS)
  private List<String> includePhoneNumbers = null;

  public static final String SERIALIZED_NAME_INCLUDE_IOS_TOKENS = "include_ios_tokens";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IOS_TOKENS)
  private List<String> includeIosTokens = null;

  public static final String SERIALIZED_NAME_INCLUDE_WP_WNS_URIS = "include_wp_wns_uris";
  @SerializedName(SERIALIZED_NAME_INCLUDE_WP_WNS_URIS)
  private List<String> includeWpWnsUris = null;

  public static final String SERIALIZED_NAME_INCLUDE_AMAZON_REG_IDS = "include_amazon_reg_ids";
  @SerializedName(SERIALIZED_NAME_INCLUDE_AMAZON_REG_IDS)
  private List<String> includeAmazonRegIds = null;

  public static final String SERIALIZED_NAME_INCLUDE_CHROME_REG_IDS = "include_chrome_reg_ids";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CHROME_REG_IDS)
  private List<String> includeChromeRegIds = null;

  public static final String SERIALIZED_NAME_INCLUDE_CHROME_WEB_REG_IDS = "include_chrome_web_reg_ids";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CHROME_WEB_REG_IDS)
  private List<String> includeChromeWebRegIds = null;

  public static final String SERIALIZED_NAME_INCLUDE_ANDROID_REG_IDS = "include_android_reg_ids";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ANDROID_REG_IDS)
  private List<String> includeAndroidRegIds = null;

  public static final String SERIALIZED_NAME_INCLUDE_ALIASES = "include_aliases";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ALIASES)
  private Map<String, List<String>> includeAliases = null;

  /**
   * Gets or Sets targetChannel
   */
  @JsonAdapter(TargetChannelEnum.Adapter.class)
  public enum TargetChannelEnum {
    PUSH("push"),
    
    EMAIL("email"),
    
    SMS("sms");

    private String value;

    TargetChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetChannelEnum fromValue(String value) {
      for (TargetChannelEnum b : TargetChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TargetChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TargetChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TargetChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TargetChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TARGET_CHANNEL = "target_channel";
  @SerializedName(SERIALIZED_NAME_TARGET_CHANNEL)
  private TargetChannelEnum targetChannel;

  public SubscriptionNotificationTarget() { 
  }

  public SubscriptionNotificationTarget includeSubscriptionIds(List<String> includeSubscriptionIds) {
    
    this.includeSubscriptionIds = includeSubscriptionIds;
    return this;
  }

  public SubscriptionNotificationTarget addIncludeSubscriptionIdsItem(String includeSubscriptionIdsItem) {
    if (this.includeSubscriptionIds == null) {
      this.includeSubscriptionIds = new ArrayList<>();
    }
    this.includeSubscriptionIds.add(includeSubscriptionIdsItem);
    return this;
  }

   /**
   * Specific subscription ids to send your notification to. _Does not require API Auth Key._ Not compatible with any other targeting parameters. Example: [\&quot;1dd608f2-c6a1-11e3-851d-000c2940e62c\&quot;] Limit of 2,000 entries per REST API call 
   * @return includeSubscriptionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specific subscription ids to send your notification to. _Does not require API Auth Key._ Not compatible with any other targeting parameters. Example: [\"1dd608f2-c6a1-11e3-851d-000c2940e62c\"] Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeSubscriptionIds() {
    return includeSubscriptionIds;
  }


  public void setIncludeSubscriptionIds(List<String> includeSubscriptionIds) {
    this.includeSubscriptionIds = includeSubscriptionIds;
  }


  public SubscriptionNotificationTarget includeEmailTokens(List<String> includeEmailTokens) {
    
    this.includeEmailTokens = includeEmailTokens;
    return this;
  }

  public SubscriptionNotificationTarget addIncludeEmailTokensItem(String includeEmailTokensItem) {
    if (this.includeEmailTokens == null) {
      this.includeEmailTokens = new ArrayList<>();
    }
    this.includeEmailTokens.add(includeEmailTokensItem);
    return this;
  }

   /**
   * Recommended for Sending Emails - Target specific email addresses. If an email does not correspond to an existing user, a new user will be created. Example: nick@catfac.ts Limit of 2,000 entries per REST API call 
   * @return includeEmailTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recommended for Sending Emails - Target specific email addresses. If an email does not correspond to an existing user, a new user will be created. Example: nick@catfac.ts Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeEmailTokens() {
    return includeEmailTokens;
  }


  public void setIncludeEmailTokens(List<String> includeEmailTokens) {
    this.includeEmailTokens = includeEmailTokens;
  }


  public SubscriptionNotificationTarget includePhoneNumbers(List<String> includePhoneNumbers) {
    
    this.includePhoneNumbers = includePhoneNumbers;
    return this;
  }

  public SubscriptionNotificationTarget addIncludePhoneNumbersItem(String includePhoneNumbersItem) {
    if (this.includePhoneNumbers == null) {
      this.includePhoneNumbers = new ArrayList<>();
    }
    this.includePhoneNumbers.add(includePhoneNumbersItem);
    return this;
  }

   /**
   * Recommended for Sending SMS - Target specific phone numbers. The phone number should be in the E.164 format. Phone number should be an existing subscriber on OneSignal. Refer our docs to learn how to add phone numbers to OneSignal. Example phone number: +1999999999 Limit of 2,000 entries per REST API call 
   * @return includePhoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recommended for Sending SMS - Target specific phone numbers. The phone number should be in the E.164 format. Phone number should be an existing subscriber on OneSignal. Refer our docs to learn how to add phone numbers to OneSignal. Example phone number: +1999999999 Limit of 2,000 entries per REST API call ")

  public List<String> getIncludePhoneNumbers() {
    return includePhoneNumbers;
  }


  public void setIncludePhoneNumbers(List<String> includePhoneNumbers) {
    this.includePhoneNumbers = includePhoneNumbers;
  }


  public SubscriptionNotificationTarget includeIosTokens(List<String> includeIosTokens) {
    
    this.includeIosTokens = includeIosTokens;
    return this;
  }

  public SubscriptionNotificationTarget addIncludeIosTokensItem(String includeIosTokensItem) {
    if (this.includeIosTokens == null) {
      this.includeIosTokens = new ArrayList<>();
    }
    this.includeIosTokens.add(includeIosTokensItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using iOS device tokens. Warning: Only works with Production tokens. All non-alphanumeric characters must be removed from each token. If a token does not correspond to an existing user, a new user will be created. Example: ce777617da7f548fe7a9ab6febb56cf39fba6d38203... Limit of 2,000 entries per REST API call 
   * @return includeIosTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using iOS device tokens. Warning: Only works with Production tokens. All non-alphanumeric characters must be removed from each token. If a token does not correspond to an existing user, a new user will be created. Example: ce777617da7f548fe7a9ab6febb56cf39fba6d38203... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeIosTokens() {
    return includeIosTokens;
  }


  public void setIncludeIosTokens(List<String> includeIosTokens) {
    this.includeIosTokens = includeIosTokens;
  }


  public SubscriptionNotificationTarget includeWpWnsUris(List<String> includeWpWnsUris) {
    
    this.includeWpWnsUris = includeWpWnsUris;
    return this;
  }

  public SubscriptionNotificationTarget addIncludeWpWnsUrisItem(String includeWpWnsUrisItem) {
    if (this.includeWpWnsUris == null) {
      this.includeWpWnsUris = new ArrayList<>();
    }
    this.includeWpWnsUris.add(includeWpWnsUrisItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using Windows URIs. If a token does not correspond to an existing user, a new user will be created. Example: http://s.notify.live.net/u/1/bn1/HmQAAACPaLDr-... Limit of 2,000 entries per REST API call 
   * @return includeWpWnsUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using Windows URIs. If a token does not correspond to an existing user, a new user will be created. Example: http://s.notify.live.net/u/1/bn1/HmQAAACPaLDr-... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeWpWnsUris() {
    return includeWpWnsUris;
  }


  public void setIncludeWpWnsUris(List<String> includeWpWnsUris) {
    this.includeWpWnsUris = includeWpWnsUris;
  }


  public SubscriptionNotificationTarget includeAmazonRegIds(List<String> includeAmazonRegIds) {
    
    this.includeAmazonRegIds = includeAmazonRegIds;
    return this;
  }

  public SubscriptionNotificationTarget addIncludeAmazonRegIdsItem(String includeAmazonRegIdsItem) {
    if (this.includeAmazonRegIds == null) {
      this.includeAmazonRegIds = new ArrayList<>();
    }
    this.includeAmazonRegIds.add(includeAmazonRegIdsItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using Amazon ADM registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: amzn1.adm-registration.v1.XpvSSUk0Rc3hTVVV... Limit of 2,000 entries per REST API call 
   * @return includeAmazonRegIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using Amazon ADM registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: amzn1.adm-registration.v1.XpvSSUk0Rc3hTVVV... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeAmazonRegIds() {
    return includeAmazonRegIds;
  }


  public void setIncludeAmazonRegIds(List<String> includeAmazonRegIds) {
    this.includeAmazonRegIds = includeAmazonRegIds;
  }


  public SubscriptionNotificationTarget includeChromeRegIds(List<String> includeChromeRegIds) {
    
    this.includeChromeRegIds = includeChromeRegIds;
    return this;
  }

  public SubscriptionNotificationTarget addIncludeChromeRegIdsItem(String includeChromeRegIdsItem) {
    if (this.includeChromeRegIds == null) {
      this.includeChromeRegIds = new ArrayList<>();
    }
    this.includeChromeRegIds.add(includeChromeRegIdsItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using Chrome App registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call 
   * @return includeChromeRegIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using Chrome App registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeChromeRegIds() {
    return includeChromeRegIds;
  }


  public void setIncludeChromeRegIds(List<String> includeChromeRegIds) {
    this.includeChromeRegIds = includeChromeRegIds;
  }


  public SubscriptionNotificationTarget includeChromeWebRegIds(List<String> includeChromeWebRegIds) {
    
    this.includeChromeWebRegIds = includeChromeWebRegIds;
    return this;
  }

  public SubscriptionNotificationTarget addIncludeChromeWebRegIdsItem(String includeChromeWebRegIdsItem) {
    if (this.includeChromeWebRegIds == null) {
      this.includeChromeWebRegIds = new ArrayList<>();
    }
    this.includeChromeWebRegIds.add(includeChromeWebRegIdsItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using Chrome Web Push registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call 
   * @return includeChromeWebRegIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using Chrome Web Push registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeChromeWebRegIds() {
    return includeChromeWebRegIds;
  }


  public void setIncludeChromeWebRegIds(List<String> includeChromeWebRegIds) {
    this.includeChromeWebRegIds = includeChromeWebRegIds;
  }


  public SubscriptionNotificationTarget includeAndroidRegIds(List<String> includeAndroidRegIds) {
    
    this.includeAndroidRegIds = includeAndroidRegIds;
    return this;
  }

  public SubscriptionNotificationTarget addIncludeAndroidRegIdsItem(String includeAndroidRegIdsItem) {
    if (this.includeAndroidRegIds == null) {
      this.includeAndroidRegIds = new ArrayList<>();
    }
    this.includeAndroidRegIds.add(includeAndroidRegIdsItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using Android device registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call 
   * @return includeAndroidRegIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_subscription_ids or include_aliases instead. Target using Android device registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeAndroidRegIds() {
    return includeAndroidRegIds;
  }


  public void setIncludeAndroidRegIds(List<String> includeAndroidRegIds) {
    this.includeAndroidRegIds = includeAndroidRegIds;
  }


  public SubscriptionNotificationTarget includeAliases(Map<String, List<String>> includeAliases) {
    
    this.includeAliases = includeAliases;
    return this;
  }

  public SubscriptionNotificationTarget putIncludeAliasesItem(String key, List<String> includeAliasesItem) {
    if (this.includeAliases == null) {
      this.includeAliases = new HashMap<>();
    }
    this.includeAliases.put(key, includeAliasesItem);
    return this;
  }

   /**
   * Target specific users by aliases assigned via API. An alias can be an external_id, onesignal_id, or a custom alias. Accepts an object where keys are alias labels and values are arrays of alias IDs to include Example usage: { \&quot;external_id\&quot;: [\&quot;exId1\&quot;, \&quot;extId2\&quot;], \&quot;internal_label\&quot;: [\&quot;id1\&quot;, \&quot;id2\&quot;] } Not compatible with any other targeting parameters. REQUIRED: REST API Key Authentication Limit of 2,000 entries per REST API call Note: If targeting push, email, or sms subscribers with same ids, use with target_channel to indicate you are sending a push or email or sms.
   * @return includeAliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target specific users by aliases assigned via API. An alias can be an external_id, onesignal_id, or a custom alias. Accepts an object where keys are alias labels and values are arrays of alias IDs to include Example usage: { \"external_id\": [\"exId1\", \"extId2\"], \"internal_label\": [\"id1\", \"id2\"] } Not compatible with any other targeting parameters. REQUIRED: REST API Key Authentication Limit of 2,000 entries per REST API call Note: If targeting push, email, or sms subscribers with same ids, use with target_channel to indicate you are sending a push or email or sms.")

  public Map<String, List<String>> getIncludeAliases() {
    return includeAliases;
  }


  public void setIncludeAliases(Map<String, List<String>> includeAliases) {
    this.includeAliases = includeAliases;
  }


  public SubscriptionNotificationTarget targetChannel(TargetChannelEnum targetChannel) {
    
    this.targetChannel = targetChannel;
    return this;
  }

   /**
   * Get targetChannel
   * @return targetChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TargetChannelEnum getTargetChannel() {
    return targetChannel;
  }


  public void setTargetChannel(TargetChannelEnum targetChannel) {
    this.targetChannel = targetChannel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionNotificationTarget subscriptionNotificationTarget = (SubscriptionNotificationTarget) o;
    return Objects.equals(this.includeSubscriptionIds, subscriptionNotificationTarget.includeSubscriptionIds) &&
        Objects.equals(this.includeEmailTokens, subscriptionNotificationTarget.includeEmailTokens) &&
        Objects.equals(this.includePhoneNumbers, subscriptionNotificationTarget.includePhoneNumbers) &&
        Objects.equals(this.includeIosTokens, subscriptionNotificationTarget.includeIosTokens) &&
        Objects.equals(this.includeWpWnsUris, subscriptionNotificationTarget.includeWpWnsUris) &&
        Objects.equals(this.includeAmazonRegIds, subscriptionNotificationTarget.includeAmazonRegIds) &&
        Objects.equals(this.includeChromeRegIds, subscriptionNotificationTarget.includeChromeRegIds) &&
        Objects.equals(this.includeChromeWebRegIds, subscriptionNotificationTarget.includeChromeWebRegIds) &&
        Objects.equals(this.includeAndroidRegIds, subscriptionNotificationTarget.includeAndroidRegIds) &&
        Objects.equals(this.includeAliases, subscriptionNotificationTarget.includeAliases) &&
        Objects.equals(this.targetChannel, subscriptionNotificationTarget.targetChannel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSubscriptionIds, includeEmailTokens, includePhoneNumbers, includeIosTokens, includeWpWnsUris, includeAmazonRegIds, includeChromeRegIds, includeChromeWebRegIds, includeAndroidRegIds, includeAliases, targetChannel);
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
    sb.append("class SubscriptionNotificationTarget {\n");
    sb.append("    includeSubscriptionIds: ").append(toIndentedString(includeSubscriptionIds)).append("\n");
    sb.append("    includeEmailTokens: ").append(toIndentedString(includeEmailTokens)).append("\n");
    sb.append("    includePhoneNumbers: ").append(toIndentedString(includePhoneNumbers)).append("\n");
    sb.append("    includeIosTokens: ").append(toIndentedString(includeIosTokens)).append("\n");
    sb.append("    includeWpWnsUris: ").append(toIndentedString(includeWpWnsUris)).append("\n");
    sb.append("    includeAmazonRegIds: ").append(toIndentedString(includeAmazonRegIds)).append("\n");
    sb.append("    includeChromeRegIds: ").append(toIndentedString(includeChromeRegIds)).append("\n");
    sb.append("    includeChromeWebRegIds: ").append(toIndentedString(includeChromeWebRegIds)).append("\n");
    sb.append("    includeAndroidRegIds: ").append(toIndentedString(includeAndroidRegIds)).append("\n");
    sb.append("    includeAliases: ").append(toIndentedString(includeAliases)).append("\n");
    sb.append("    targetChannel: ").append(toIndentedString(targetChannel)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("include_subscription_ids");
    openapiFields.add("include_email_tokens");
    openapiFields.add("include_phone_numbers");
    openapiFields.add("include_ios_tokens");
    openapiFields.add("include_wp_wns_uris");
    openapiFields.add("include_amazon_reg_ids");
    openapiFields.add("include_chrome_reg_ids");
    openapiFields.add("include_chrome_web_reg_ids");
    openapiFields.add("include_android_reg_ids");
    openapiFields.add("include_aliases");
    openapiFields.add("target_channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionNotificationTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionNotificationTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionNotificationTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionNotificationTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionNotificationTarget>() {
           @Override
           public void write(JsonWriter out, SubscriptionNotificationTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionNotificationTarget read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionNotificationTarget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionNotificationTarget
  * @throws IOException if the JSON string is invalid with respect to SubscriptionNotificationTarget
  */
  public static SubscriptionNotificationTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionNotificationTarget.class);
  }

 /**
  * Convert an instance of SubscriptionNotificationTarget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

