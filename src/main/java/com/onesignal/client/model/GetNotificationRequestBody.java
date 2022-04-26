/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.0.2
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
 * GetNotificationRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T05:37:43.612Z[Etc/UTC]")
public class GetNotificationRequestBody {
  private static final long serialVersionUID = 1L;

  /**
   * -&gt; \&quot;sent\&quot; - All the devices by player_id that were sent the specified notification_id.  Notifications targeting under 1000 recipients will not have \&quot;sent\&quot; events recorded, but will show \&quot;clicked\&quot; events. \&quot;clicked\&quot; - All the devices by &#x60;player_id&#x60; that clicked the specified notification_id.
   */
  @JsonAdapter(EventsEnum.Adapter.class)
  public enum EventsEnum {
    SENT("sent"),
    
    CLICKED("clicked");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventsEnum fromValue(String value) {
      for (EventsEnum b : EventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private EventsEnum events;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public GetNotificationRequestBody() { 
  }

  public GetNotificationRequestBody events(EventsEnum events) {
    
    this.events = events;
    return this;
  }

   /**
   * -&gt; \&quot;sent\&quot; - All the devices by player_id that were sent the specified notification_id.  Notifications targeting under 1000 recipients will not have \&quot;sent\&quot; events recorded, but will show \&quot;clicked\&quot; events. \&quot;clicked\&quot; - All the devices by &#x60;player_id&#x60; that clicked the specified notification_id.
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "-> \"sent\" - All the devices by player_id that were sent the specified notification_id.  Notifications targeting under 1000 recipients will not have \"sent\" events recorded, but will show \"clicked\" events. \"clicked\" - All the devices by `player_id` that clicked the specified notification_id.")

  public EventsEnum getEvents() {
    return events;
  }


  public void setEvents(EventsEnum events) {
    this.events = events;
  }


  public GetNotificationRequestBody email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address you would like the report sent.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address you would like the report sent.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public GetNotificationRequestBody appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNotificationRequestBody getNotificationRequestBody = (GetNotificationRequestBody) o;
    return Objects.equals(this.events, getNotificationRequestBody.events) &&
        Objects.equals(this.email, getNotificationRequestBody.email) &&
        Objects.equals(this.appId, getNotificationRequestBody.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, email, appId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNotificationRequestBody {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
    openapiFields.add("events");
    openapiFields.add("email");
    openapiFields.add("app_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetNotificationRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetNotificationRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetNotificationRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetNotificationRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<GetNotificationRequestBody>() {
           @Override
           public void write(JsonWriter out, GetNotificationRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetNotificationRequestBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetNotificationRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetNotificationRequestBody
  * @throws IOException if the JSON string is invalid with respect to GetNotificationRequestBody
  */
  public static GetNotificationRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetNotificationRequestBody.class);
  }

 /**
  * Convert an instance of GetNotificationRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

