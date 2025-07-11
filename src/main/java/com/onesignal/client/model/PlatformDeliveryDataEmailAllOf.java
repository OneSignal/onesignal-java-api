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
 * PlatformDeliveryDataEmailAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatformDeliveryDataEmailAllOf {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_OPENED = "opened";
  @SerializedName(SERIALIZED_NAME_OPENED)
  private Integer opened;

  public static final String SERIALIZED_NAME_UNIQUE_OPENS = "unique_opens";
  @SerializedName(SERIALIZED_NAME_UNIQUE_OPENS)
  private Integer uniqueOpens;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Integer clicks;

  public static final String SERIALIZED_NAME_UNIQUE_CLICKS = "unique_clicks";
  @SerializedName(SERIALIZED_NAME_UNIQUE_CLICKS)
  private Integer uniqueClicks;

  public static final String SERIALIZED_NAME_BOUNCED = "bounced";
  @SerializedName(SERIALIZED_NAME_BOUNCED)
  private Integer bounced;

  public static final String SERIALIZED_NAME_REPORTED_SPAM = "reported_spam";
  @SerializedName(SERIALIZED_NAME_REPORTED_SPAM)
  private Integer reportedSpam;

  public static final String SERIALIZED_NAME_UNSUBSCRIBED = "unsubscribed";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBED)
  private Integer unsubscribed;

  public PlatformDeliveryDataEmailAllOf() { 
  }

  public PlatformDeliveryDataEmailAllOf opened(Integer opened) {
    
    this.opened = opened;
    return this;
  }

   /**
   * Number of times an email has been opened.
   * @return opened
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times an email has been opened.")

  public Integer getOpened() {
    return opened;
  }


  public void setOpened(Integer opened) {
    this.opened = opened;
  }


  public PlatformDeliveryDataEmailAllOf uniqueOpens(Integer uniqueOpens) {
    
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * Number of unique recipients who have opened your email.
   * @return uniqueOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of unique recipients who have opened your email.")

  public Integer getUniqueOpens() {
    return uniqueOpens;
  }


  public void setUniqueOpens(Integer uniqueOpens) {
    this.uniqueOpens = uniqueOpens;
  }


  public PlatformDeliveryDataEmailAllOf clicks(Integer clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * Number of clicked links from your email. This can include the recipient clicking email links multiple times.
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of clicked links from your email. This can include the recipient clicking email links multiple times.")

  public Integer getClicks() {
    return clicks;
  }


  public void setClicks(Integer clicks) {
    this.clicks = clicks;
  }


  public PlatformDeliveryDataEmailAllOf uniqueClicks(Integer uniqueClicks) {
    
    this.uniqueClicks = uniqueClicks;
    return this;
  }

   /**
   * Number of unique clicks that your recipients have made on links from your email.
   * @return uniqueClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of unique clicks that your recipients have made on links from your email.")

  public Integer getUniqueClicks() {
    return uniqueClicks;
  }


  public void setUniqueClicks(Integer uniqueClicks) {
    this.uniqueClicks = uniqueClicks;
  }


  public PlatformDeliveryDataEmailAllOf bounced(Integer bounced) {
    
    this.bounced = bounced;
    return this;
  }

   /**
   * Number of recipients who registered as a hard or soft bounce and didn&#39;t receive your email.
   * @return bounced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of recipients who registered as a hard or soft bounce and didn't receive your email.")

  public Integer getBounced() {
    return bounced;
  }


  public void setBounced(Integer bounced) {
    this.bounced = bounced;
  }


  public PlatformDeliveryDataEmailAllOf reportedSpam(Integer reportedSpam) {
    
    this.reportedSpam = reportedSpam;
    return this;
  }

   /**
   * Number of recipients who reported this email as spam.
   * @return reportedSpam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of recipients who reported this email as spam.")

  public Integer getReportedSpam() {
    return reportedSpam;
  }


  public void setReportedSpam(Integer reportedSpam) {
    this.reportedSpam = reportedSpam;
  }


  public PlatformDeliveryDataEmailAllOf unsubscribed(Integer unsubscribed) {
    
    this.unsubscribed = unsubscribed;
    return this;
  }

   /**
   * Number of recipients who opted out of your emails using the unsubscribe link in this email.
   * @return unsubscribed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of recipients who opted out of your emails using the unsubscribe link in this email.")

  public Integer getUnsubscribed() {
    return unsubscribed;
  }


  public void setUnsubscribed(Integer unsubscribed) {
    this.unsubscribed = unsubscribed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformDeliveryDataEmailAllOf platformDeliveryDataEmailAllOf = (PlatformDeliveryDataEmailAllOf) o;
    return Objects.equals(this.opened, platformDeliveryDataEmailAllOf.opened) &&
        Objects.equals(this.uniqueOpens, platformDeliveryDataEmailAllOf.uniqueOpens) &&
        Objects.equals(this.clicks, platformDeliveryDataEmailAllOf.clicks) &&
        Objects.equals(this.uniqueClicks, platformDeliveryDataEmailAllOf.uniqueClicks) &&
        Objects.equals(this.bounced, platformDeliveryDataEmailAllOf.bounced) &&
        Objects.equals(this.reportedSpam, platformDeliveryDataEmailAllOf.reportedSpam) &&
        Objects.equals(this.unsubscribed, platformDeliveryDataEmailAllOf.unsubscribed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(opened, uniqueOpens, clicks, uniqueClicks, bounced, reportedSpam, unsubscribed);
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
    sb.append("class PlatformDeliveryDataEmailAllOf {\n");
    sb.append("    opened: ").append(toIndentedString(opened)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    uniqueClicks: ").append(toIndentedString(uniqueClicks)).append("\n");
    sb.append("    bounced: ").append(toIndentedString(bounced)).append("\n");
    sb.append("    reportedSpam: ").append(toIndentedString(reportedSpam)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
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
    openapiFields.add("opened");
    openapiFields.add("unique_opens");
    openapiFields.add("clicks");
    openapiFields.add("unique_clicks");
    openapiFields.add("bounced");
    openapiFields.add("reported_spam");
    openapiFields.add("unsubscribed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlatformDeliveryDataEmailAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlatformDeliveryDataEmailAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlatformDeliveryDataEmailAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlatformDeliveryDataEmailAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PlatformDeliveryDataEmailAllOf>() {
           @Override
           public void write(JsonWriter out, PlatformDeliveryDataEmailAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlatformDeliveryDataEmailAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlatformDeliveryDataEmailAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlatformDeliveryDataEmailAllOf
  * @throws IOException if the JSON string is invalid with respect to PlatformDeliveryDataEmailAllOf
  */
  public static PlatformDeliveryDataEmailAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlatformDeliveryDataEmailAllOf.class);
  }

 /**
  * Convert an instance of PlatformDeliveryDataEmailAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

