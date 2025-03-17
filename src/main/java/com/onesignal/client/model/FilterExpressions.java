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
import com.onesignal.client.model.Filter;
import com.onesignal.client.model.Operator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.onesignal.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T21:54:45.185Z[Etc/UTC]")
public class FilterExpressions extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FilterExpressions.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FilterExpressions.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FilterExpressions' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Filter> adapterFilter = gson.getDelegateAdapter(this, TypeToken.get(Filter.class));
            final TypeAdapter<Operator> adapterOperator = gson.getDelegateAdapter(this, TypeToken.get(Operator.class));

            return (TypeAdapter<T>) new TypeAdapter<FilterExpressions>() {
                @Override
                public void write(JsonWriter out, FilterExpressions value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Filter`
                    if (value.getActualInstance() instanceof Filter) {
                        JsonObject obj = adapterFilter.toJsonTree((Filter)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `Operator`
                    if (value.getActualInstance() instanceof Operator) {
                        JsonObject obj = adapterOperator.toJsonTree((Operator)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: Filter, Operator");
                }

                @Override
                public FilterExpressions read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize Filter
                    try {
                        // validate the JSON object to see if any exception is thrown
                        log.log(Level.FINER, "Input data matches schema 'Filter'");
                        FilterExpressions ret = new FilterExpressions();
                        ret.setActualInstance(adapterFilter.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'Filter'", e);
                    }

                    // deserialize Operator
                    try {
                        // validate the JSON object to see if any exception is thrown
                        log.log(Level.FINER, "Input data matches schema 'Operator'");
                        FilterExpressions ret = new FilterExpressions();
                        ret.setActualInstance(adapterOperator.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'Operator'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for FilterExpressions: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public FilterExpressions() {
        super("anyOf", Boolean.FALSE);
    }

    public FilterExpressions(Filter o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FilterExpressions(Operator o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Filter", new GenericType<Filter>() {
        });
        schemas.put("Operator", new GenericType<Operator>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return FilterExpressions.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * Filter, Operator
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Filter) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Operator) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Filter, Operator");
    }

    /**
     * Get the actual instance, which can be the following:
     * Filter, Operator
     *
     * @return The actual instance (Filter, Operator)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Filter`. If the actual instance is not `Filter`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Filter`
     * @throws ClassCastException if the instance is not `Filter`
     */
    public Filter getFilter() throws ClassCastException {
        return (Filter)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Operator`. If the actual instance is not `Operator`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Operator`
     * @throws ClassCastException if the instance is not `Operator`
     */
    public Operator getOperator() throws ClassCastException {
        return (Operator)super.getActualInstance();
    }


 /**
  * Create an instance of FilterExpressions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilterExpressions
  * @throws IOException if the JSON string is invalid with respect to FilterExpressions
  */
  public static FilterExpressions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilterExpressions.class);
  }

 /**
  * Convert an instance of FilterExpressions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

