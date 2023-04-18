/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.2.1
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
import com.onesignal.client.model.CreateUserConflictResponseErrorsItemsMeta;
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
 * CreateUserConflictResponseErrorsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-18T17:19:38.684Z[Etc/UTC]")
public class CreateUserConflictResponseErrorsInner {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private CreateUserConflictResponseErrorsItemsMeta meta;

  public CreateUserConflictResponseErrorsInner() { 
  }

  public CreateUserConflictResponseErrorsInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CreateUserConflictResponseErrorsInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CreateUserConflictResponseErrorsInner meta(CreateUserConflictResponseErrorsItemsMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateUserConflictResponseErrorsItemsMeta getMeta() {
    return meta;
  }


  public void setMeta(CreateUserConflictResponseErrorsItemsMeta meta) {
    this.meta = meta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserConflictResponseErrorsInner createUserConflictResponseErrorsInner = (CreateUserConflictResponseErrorsInner) o;
    return Objects.equals(this.code, createUserConflictResponseErrorsInner.code) &&
        Objects.equals(this.title, createUserConflictResponseErrorsInner.title) &&
        Objects.equals(this.meta, createUserConflictResponseErrorsInner.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserConflictResponseErrorsInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("title");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateUserConflictResponseErrorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateUserConflictResponseErrorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateUserConflictResponseErrorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateUserConflictResponseErrorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateUserConflictResponseErrorsInner>() {
           @Override
           public void write(JsonWriter out, CreateUserConflictResponseErrorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateUserConflictResponseErrorsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateUserConflictResponseErrorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateUserConflictResponseErrorsInner
  * @throws IOException if the JSON string is invalid with respect to CreateUserConflictResponseErrorsInner
  */
  public static CreateUserConflictResponseErrorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateUserConflictResponseErrorsInner.class);
  }

 /**
  * Convert an instance of CreateUserConflictResponseErrorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

