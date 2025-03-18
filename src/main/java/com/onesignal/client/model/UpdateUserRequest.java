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
import com.onesignal.client.model.PropertiesDeltas;
import com.onesignal.client.model.PropertiesObject;
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
 * UpdateUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:35:25.176Z[Etc/UTC]")
public class UpdateUserRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private PropertiesObject properties;

  public static final String SERIALIZED_NAME_REFRESH_DEVICE_METADATA = "refresh_device_metadata";
  @SerializedName(SERIALIZED_NAME_REFRESH_DEVICE_METADATA)
  private Boolean refreshDeviceMetadata = false;

  public static final String SERIALIZED_NAME_DELTAS = "deltas";
  @SerializedName(SERIALIZED_NAME_DELTAS)
  private PropertiesDeltas deltas;

  public UpdateUserRequest() { 
  }

  public UpdateUserRequest properties(PropertiesObject properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PropertiesObject getProperties() {
    return properties;
  }


  public void setProperties(PropertiesObject properties) {
    this.properties = properties;
  }


  public UpdateUserRequest refreshDeviceMetadata(Boolean refreshDeviceMetadata) {
    
    this.refreshDeviceMetadata = refreshDeviceMetadata;
    return this;
  }

   /**
   * Get refreshDeviceMetadata
   * @return refreshDeviceMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRefreshDeviceMetadata() {
    return refreshDeviceMetadata;
  }


  public void setRefreshDeviceMetadata(Boolean refreshDeviceMetadata) {
    this.refreshDeviceMetadata = refreshDeviceMetadata;
  }


  public UpdateUserRequest deltas(PropertiesDeltas deltas) {
    
    this.deltas = deltas;
    return this;
  }

   /**
   * Get deltas
   * @return deltas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PropertiesDeltas getDeltas() {
    return deltas;
  }


  public void setDeltas(PropertiesDeltas deltas) {
    this.deltas = deltas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.properties, updateUserRequest.properties) &&
        Objects.equals(this.refreshDeviceMetadata, updateUserRequest.refreshDeviceMetadata) &&
        Objects.equals(this.deltas, updateUserRequest.deltas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, refreshDeviceMetadata, deltas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    refreshDeviceMetadata: ").append(toIndentedString(refreshDeviceMetadata)).append("\n");
    sb.append("    deltas: ").append(toIndentedString(deltas)).append("\n");
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
    openapiFields.add("properties");
    openapiFields.add("refresh_device_metadata");
    openapiFields.add("deltas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateUserRequest>() {
           @Override
           public void write(JsonWriter out, UpdateUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateUserRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateUserRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateUserRequest
  */
  public static UpdateUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateUserRequest.class);
  }

 /**
  * Convert an instance of UpdateUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

