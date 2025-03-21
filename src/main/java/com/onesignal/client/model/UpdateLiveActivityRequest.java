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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
 * UpdateLiveActivityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T21:54:45.185Z[Etc/UTC]")
public class UpdateLiveActivityRequest {
  private static final long serialVersionUID = 1L;

  /**
   * Type of live activity
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    HEADINGS("headings"),
    
    CONTENTS("contents"),
    
    IOS_SOUND("ios_sound"),
    
    PRIORITY_LEVEL("priority_level");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name;

  /**
   * Gets or Sets event
   */
  @JsonAdapter(EventEnum.Adapter.class)
  public enum EventEnum {
    UPDATE("update"),
    
    END("end");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventEnum fromValue(String value) {
      for (EventEnum b : EventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private EventEnum event;

  public static final String SERIALIZED_NAME_EVENT_UPDATES = "event_updates";
  @SerializedName(SERIALIZED_NAME_EVENT_UPDATES)
  private Object eventUpdates;

  public static final String SERIALIZED_NAME_DISMISS_AT = "dismiss_at";
  @SerializedName(SERIALIZED_NAME_DISMISS_AT)
  private BigDecimal dismissAt;

  public UpdateLiveActivityRequest() { 
  }

  public UpdateLiveActivityRequest name(NameEnum name) {
    
    this.name = name;
    return this;
  }

   /**
   * Type of live activity
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of live activity")

  public NameEnum getName() {
    return name;
  }


  public void setName(NameEnum name) {
    this.name = name;
  }


  public UpdateLiveActivityRequest event(EventEnum event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EventEnum getEvent() {
    return event;
  }


  public void setEvent(EventEnum event) {
    this.event = event;
  }


  public UpdateLiveActivityRequest eventUpdates(Object eventUpdates) {
    
    this.eventUpdates = eventUpdates;
    return this;
  }

   /**
   * Get eventUpdates
   * @return eventUpdates
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getEventUpdates() {
    return eventUpdates;
  }


  public void setEventUpdates(Object eventUpdates) {
    this.eventUpdates = eventUpdates;
  }


  public UpdateLiveActivityRequest dismissAt(BigDecimal dismissAt) {
    
    this.dismissAt = dismissAt;
    return this;
  }

   /**
   * Timestamp; only allowed if event is \&quot;end\&quot;
   * @return dismissAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp; only allowed if event is \"end\"")

  public BigDecimal getDismissAt() {
    return dismissAt;
  }


  public void setDismissAt(BigDecimal dismissAt) {
    this.dismissAt = dismissAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLiveActivityRequest updateLiveActivityRequest = (UpdateLiveActivityRequest) o;
    return Objects.equals(this.name, updateLiveActivityRequest.name) &&
        Objects.equals(this.event, updateLiveActivityRequest.event) &&
        Objects.equals(this.eventUpdates, updateLiveActivityRequest.eventUpdates) &&
        Objects.equals(this.dismissAt, updateLiveActivityRequest.dismissAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, event, eventUpdates, dismissAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLiveActivityRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventUpdates: ").append(toIndentedString(eventUpdates)).append("\n");
    sb.append("    dismissAt: ").append(toIndentedString(dismissAt)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("event");
    openapiFields.add("event_updates");
    openapiFields.add("dismiss_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("event");
    openapiRequiredFields.add("event_updates");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateLiveActivityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateLiveActivityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateLiveActivityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateLiveActivityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateLiveActivityRequest>() {
           @Override
           public void write(JsonWriter out, UpdateLiveActivityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateLiveActivityRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateLiveActivityRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateLiveActivityRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateLiveActivityRequest
  */
  public static UpdateLiveActivityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateLiveActivityRequest.class);
  }

 /**
  * Convert an instance of UpdateLiveActivityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

