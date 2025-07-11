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
 * SegmentData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SegmentData {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_READ_ONLY = "read_only";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public SegmentData() { 
  }

  public SegmentData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The segment ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segment ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SegmentData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The segment name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segment name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SegmentData createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date segment created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date segment created")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public SegmentData updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Date segment last updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date segment last updated")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public SegmentData appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * The app id
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The app id")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public SegmentData readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Is the segment read only?
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the segment read only?")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public SegmentData isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Is the segment active?
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the segment active?")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentData segmentData = (SegmentData) o;
    return Objects.equals(this.id, segmentData.id) &&
        Objects.equals(this.name, segmentData.name) &&
        Objects.equals(this.createdAt, segmentData.createdAt) &&
        Objects.equals(this.updatedAt, segmentData.updatedAt) &&
        Objects.equals(this.appId, segmentData.appId) &&
        Objects.equals(this.readOnly, segmentData.readOnly) &&
        Objects.equals(this.isActive, segmentData.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, updatedAt, appId, readOnly, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("app_id");
    openapiFields.add("read_only");
    openapiFields.add("is_active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SegmentData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SegmentData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SegmentData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SegmentData.class));

       return (TypeAdapter<T>) new TypeAdapter<SegmentData>() {
           @Override
           public void write(JsonWriter out, SegmentData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SegmentData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SegmentData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SegmentData
  * @throws IOException if the JSON string is invalid with respect to SegmentData
  */
  public static SegmentData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SegmentData.class);
  }

 /**
  * Convert an instance of SegmentData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

