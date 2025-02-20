/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.4.0
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
import com.onesignal.client.model.PlayerNotificationTargetIncludeAliases;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * PlayerNotificationTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T21:54:45.185Z[Etc/UTC]")
public class PlayerNotificationTarget {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INCLUDE_PLAYER_IDS = "include_player_ids";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PLAYER_IDS)
  private List<String> includePlayerIds = null;

  public static final String SERIALIZED_NAME_INCLUDE_EXTERNAL_USER_IDS = "include_external_user_ids";
  @SerializedName(SERIALIZED_NAME_INCLUDE_EXTERNAL_USER_IDS)
  private List<String> includeExternalUserIds = null;

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
  private PlayerNotificationTargetIncludeAliases includeAliases;

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

  public PlayerNotificationTarget() { 
  }

  public PlayerNotificationTarget includePlayerIds(List<String> includePlayerIds) {
    
    this.includePlayerIds = includePlayerIds;
    return this;
  }

  public PlayerNotificationTarget addIncludePlayerIdsItem(String includePlayerIdsItem) {
    if (this.includePlayerIds == null) {
      this.includePlayerIds = new ArrayList<>();
    }
    this.includePlayerIds.add(includePlayerIdsItem);
    return this;
  }

   /**
   * Specific playerids to send your notification to. _Does not require API Auth Key. Do not combine with other targeting parameters. Not compatible with any other targeting parameters. Example: [\&quot;1dd608f2-c6a1-11e3-851d-000c2940e62c\&quot;] Limit of 2,000 entries per REST API call 
   * @return includePlayerIds
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specific playerids to send your notification to. _Does not require API Auth Key. Do not combine with other targeting parameters. Not compatible with any other targeting parameters. Example: [\"1dd608f2-c6a1-11e3-851d-000c2940e62c\"] Limit of 2,000 entries per REST API call ")

  public List<String> getIncludePlayerIds() {
    return includePlayerIds;
  }


  public void setIncludePlayerIds(List<String> includePlayerIds) {
    this.includePlayerIds = includePlayerIds;
  }


  public PlayerNotificationTarget includeExternalUserIds(List<String> includeExternalUserIds) {
    
    this.includeExternalUserIds = includeExternalUserIds;
    return this;
  }

  public PlayerNotificationTarget addIncludeExternalUserIdsItem(String includeExternalUserIdsItem) {
    if (this.includeExternalUserIds == null) {
      this.includeExternalUserIds = new ArrayList<>();
    }
    this.includeExternalUserIds.add(includeExternalUserIdsItem);
    return this;
  }

   /**
   * Target specific devices by custom user IDs assigned via API. Not compatible with any other targeting parameters Example: [\&quot;custom-id-assigned-by-api\&quot;] REQUIRED: REST API Key Authentication Limit of 2,000 entries per REST API call. Note: If targeting push, email, or sms subscribers with same ids, use with channel_for_external_user_ids to indicate you are sending a push or email or sms. 
   * @return includeExternalUserIds
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target specific devices by custom user IDs assigned via API. Not compatible with any other targeting parameters Example: [\"custom-id-assigned-by-api\"] REQUIRED: REST API Key Authentication Limit of 2,000 entries per REST API call. Note: If targeting push, email, or sms subscribers with same ids, use with channel_for_external_user_ids to indicate you are sending a push or email or sms. ")

  public List<String> getIncludeExternalUserIds() {
    return includeExternalUserIds;
  }


  public void setIncludeExternalUserIds(List<String> includeExternalUserIds) {
    this.includeExternalUserIds = includeExternalUserIds;
  }


  public PlayerNotificationTarget includeEmailTokens(List<String> includeEmailTokens) {
    
    this.includeEmailTokens = includeEmailTokens;
    return this;
  }

  public PlayerNotificationTarget addIncludeEmailTokensItem(String includeEmailTokensItem) {
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


  public PlayerNotificationTarget includePhoneNumbers(List<String> includePhoneNumbers) {
    
    this.includePhoneNumbers = includePhoneNumbers;
    return this;
  }

  public PlayerNotificationTarget addIncludePhoneNumbersItem(String includePhoneNumbersItem) {
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


  public PlayerNotificationTarget includeIosTokens(List<String> includeIosTokens) {
    
    this.includeIosTokens = includeIosTokens;
    return this;
  }

  public PlayerNotificationTarget addIncludeIosTokensItem(String includeIosTokensItem) {
    if (this.includeIosTokens == null) {
      this.includeIosTokens = new ArrayList<>();
    }
    this.includeIosTokens.add(includeIosTokensItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using iOS device tokens. Warning: Only works with Production tokens. All non-alphanumeric characters must be removed from each token. If a token does not correspond to an existing user, a new user will be created. Example: ce777617da7f548fe7a9ab6febb56cf39fba6d38203... Limit of 2,000 entries per REST API call 
   * @return includeIosTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using iOS device tokens. Warning: Only works with Production tokens. All non-alphanumeric characters must be removed from each token. If a token does not correspond to an existing user, a new user will be created. Example: ce777617da7f548fe7a9ab6febb56cf39fba6d38203... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeIosTokens() {
    return includeIosTokens;
  }


  public void setIncludeIosTokens(List<String> includeIosTokens) {
    this.includeIosTokens = includeIosTokens;
  }


  public PlayerNotificationTarget includeWpWnsUris(List<String> includeWpWnsUris) {
    
    this.includeWpWnsUris = includeWpWnsUris;
    return this;
  }

  public PlayerNotificationTarget addIncludeWpWnsUrisItem(String includeWpWnsUrisItem) {
    if (this.includeWpWnsUris == null) {
      this.includeWpWnsUris = new ArrayList<>();
    }
    this.includeWpWnsUris.add(includeWpWnsUrisItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using Windows URIs. If a token does not correspond to an existing user, a new user will be created. Example: http://s.notify.live.net/u/1/bn1/HmQAAACPaLDr-... Limit of 2,000 entries per REST API call 
   * @return includeWpWnsUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using Windows URIs. If a token does not correspond to an existing user, a new user will be created. Example: http://s.notify.live.net/u/1/bn1/HmQAAACPaLDr-... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeWpWnsUris() {
    return includeWpWnsUris;
  }


  public void setIncludeWpWnsUris(List<String> includeWpWnsUris) {
    this.includeWpWnsUris = includeWpWnsUris;
  }


  public PlayerNotificationTarget includeAmazonRegIds(List<String> includeAmazonRegIds) {
    
    this.includeAmazonRegIds = includeAmazonRegIds;
    return this;
  }

  public PlayerNotificationTarget addIncludeAmazonRegIdsItem(String includeAmazonRegIdsItem) {
    if (this.includeAmazonRegIds == null) {
      this.includeAmazonRegIds = new ArrayList<>();
    }
    this.includeAmazonRegIds.add(includeAmazonRegIdsItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using Amazon ADM registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: amzn1.adm-registration.v1.XpvSSUk0Rc3hTVVV... Limit of 2,000 entries per REST API call 
   * @return includeAmazonRegIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using Amazon ADM registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: amzn1.adm-registration.v1.XpvSSUk0Rc3hTVVV... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeAmazonRegIds() {
    return includeAmazonRegIds;
  }


  public void setIncludeAmazonRegIds(List<String> includeAmazonRegIds) {
    this.includeAmazonRegIds = includeAmazonRegIds;
  }


  public PlayerNotificationTarget includeChromeRegIds(List<String> includeChromeRegIds) {
    
    this.includeChromeRegIds = includeChromeRegIds;
    return this;
  }

  public PlayerNotificationTarget addIncludeChromeRegIdsItem(String includeChromeRegIdsItem) {
    if (this.includeChromeRegIds == null) {
      this.includeChromeRegIds = new ArrayList<>();
    }
    this.includeChromeRegIds.add(includeChromeRegIdsItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using Chrome App registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call 
   * @return includeChromeRegIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using Chrome App registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeChromeRegIds() {
    return includeChromeRegIds;
  }


  public void setIncludeChromeRegIds(List<String> includeChromeRegIds) {
    this.includeChromeRegIds = includeChromeRegIds;
  }


  public PlayerNotificationTarget includeChromeWebRegIds(List<String> includeChromeWebRegIds) {
    
    this.includeChromeWebRegIds = includeChromeWebRegIds;
    return this;
  }

  public PlayerNotificationTarget addIncludeChromeWebRegIdsItem(String includeChromeWebRegIdsItem) {
    if (this.includeChromeWebRegIds == null) {
      this.includeChromeWebRegIds = new ArrayList<>();
    }
    this.includeChromeWebRegIds.add(includeChromeWebRegIdsItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using Chrome Web Push registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call 
   * @return includeChromeWebRegIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using Chrome Web Push registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeChromeWebRegIds() {
    return includeChromeWebRegIds;
  }


  public void setIncludeChromeWebRegIds(List<String> includeChromeWebRegIds) {
    this.includeChromeWebRegIds = includeChromeWebRegIds;
  }


  public PlayerNotificationTarget includeAndroidRegIds(List<String> includeAndroidRegIds) {
    
    this.includeAndroidRegIds = includeAndroidRegIds;
    return this;
  }

  public PlayerNotificationTarget addIncludeAndroidRegIdsItem(String includeAndroidRegIdsItem) {
    if (this.includeAndroidRegIds == null) {
      this.includeAndroidRegIds = new ArrayList<>();
    }
    this.includeAndroidRegIds.add(includeAndroidRegIdsItem);
    return this;
  }

   /**
   * Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using Android device registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call 
   * @return includeAndroidRegIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not Recommended: Please consider using include_player_ids or include_external_user_ids instead. Target using Android device registration IDs. If a token does not correspond to an existing user, a new user will be created. Example: APA91bEeiUeSukAAUdnw3O2RB45FWlSpgJ7Ji_... Limit of 2,000 entries per REST API call ")

  public List<String> getIncludeAndroidRegIds() {
    return includeAndroidRegIds;
  }


  public void setIncludeAndroidRegIds(List<String> includeAndroidRegIds) {
    this.includeAndroidRegIds = includeAndroidRegIds;
  }


  public PlayerNotificationTarget includeAliases(PlayerNotificationTargetIncludeAliases includeAliases) {
    
    this.includeAliases = includeAliases;
    return this;
  }

   /**
   * Get includeAliases
   * @return includeAliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlayerNotificationTargetIncludeAliases getIncludeAliases() {
    return includeAliases;
  }


  public void setIncludeAliases(PlayerNotificationTargetIncludeAliases includeAliases) {
    this.includeAliases = includeAliases;
  }


  public PlayerNotificationTarget targetChannel(TargetChannelEnum targetChannel) {
    
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
    PlayerNotificationTarget playerNotificationTarget = (PlayerNotificationTarget) o;
    return Objects.equals(this.includePlayerIds, playerNotificationTarget.includePlayerIds) &&
        Objects.equals(this.includeExternalUserIds, playerNotificationTarget.includeExternalUserIds) &&
        Objects.equals(this.includeEmailTokens, playerNotificationTarget.includeEmailTokens) &&
        Objects.equals(this.includePhoneNumbers, playerNotificationTarget.includePhoneNumbers) &&
        Objects.equals(this.includeIosTokens, playerNotificationTarget.includeIosTokens) &&
        Objects.equals(this.includeWpWnsUris, playerNotificationTarget.includeWpWnsUris) &&
        Objects.equals(this.includeAmazonRegIds, playerNotificationTarget.includeAmazonRegIds) &&
        Objects.equals(this.includeChromeRegIds, playerNotificationTarget.includeChromeRegIds) &&
        Objects.equals(this.includeChromeWebRegIds, playerNotificationTarget.includeChromeWebRegIds) &&
        Objects.equals(this.includeAndroidRegIds, playerNotificationTarget.includeAndroidRegIds) &&
        Objects.equals(this.includeAliases, playerNotificationTarget.includeAliases) &&
        Objects.equals(this.targetChannel, playerNotificationTarget.targetChannel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(includePlayerIds, includeExternalUserIds, includeEmailTokens, includePhoneNumbers, includeIosTokens, includeWpWnsUris, includeAmazonRegIds, includeChromeRegIds, includeChromeWebRegIds, includeAndroidRegIds, includeAliases, targetChannel);
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
    sb.append("class PlayerNotificationTarget {\n");
    sb.append("    includePlayerIds: ").append(toIndentedString(includePlayerIds)).append("\n");
    sb.append("    includeExternalUserIds: ").append(toIndentedString(includeExternalUserIds)).append("\n");
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
    openapiFields.add("include_player_ids");
    openapiFields.add("include_external_user_ids");
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
       if (!PlayerNotificationTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayerNotificationTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayerNotificationTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayerNotificationTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayerNotificationTarget>() {
           @Override
           public void write(JsonWriter out, PlayerNotificationTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlayerNotificationTarget read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlayerNotificationTarget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayerNotificationTarget
  * @throws IOException if the JSON string is invalid with respect to PlayerNotificationTarget
  */
  public static PlayerNotificationTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayerNotificationTarget.class);
  }

 /**
  * Convert an instance of PlayerNotificationTarget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

