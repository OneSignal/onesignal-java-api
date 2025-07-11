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
import com.onesignal.client.model.FilterExpression;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * Segment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Segment {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<FilterExpression> filters = new ArrayList<>();

  public Segment() { 
  }

  public Segment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * UUID of the segment.  If left empty, it will be assigned automaticaly.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID of the segment.  If left empty, it will be assigned automaticaly.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Segment name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the segment.  You&#39;ll see this name on the Web UI.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the segment.  You'll see this name on the Web UI.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Segment filters(List<FilterExpression> filters) {
    
    this.filters = filters;
    return this;
  }

  public Segment addFiltersItem(FilterExpression filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Filter or operators the segment will have.  For a list of available filters with details, please see Send to Users Based on Filters.
   * @return filters
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Filter or operators the segment will have.  For a list of available filters with details, please see Send to Users Based on Filters.")

  public List<FilterExpression> getFilters() {
    return filters;
  }


  public void setFilters(List<FilterExpression> filters) {
    this.filters = filters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Segment segment = (Segment) o;
    return Objects.equals(this.id, segment.id) &&
        Objects.equals(this.name, segment.name) &&
        Objects.equals(this.filters, segment.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Segment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
    openapiFields.add("filters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("filters");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Segment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Segment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Segment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Segment.class));

       return (TypeAdapter<T>) new TypeAdapter<Segment>() {
           @Override
           public void write(JsonWriter out, Segment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Segment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Segment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Segment
  * @throws IOException if the JSON string is invalid with respect to Segment
  */
  public static Segment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Segment.class);
  }

 /**
  * Convert an instance of Segment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

