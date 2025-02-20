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
import com.onesignal.client.model.InvalidIdentifierError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
public class Notification200Errors extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Notification200Errors.class.getName());
    public static interface ListString extends List<String> {}

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Notification200Errors.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Notification200Errors' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            final TypeAdapter<InvalidIdentifierError> adapterInvalidIdentifierError = gson.getDelegateAdapter(this, TypeToken.get(InvalidIdentifierError.class));
            final TypeAdapter<ListString> adapterListString = gson.getDelegateAdapter(this, TypeToken.get(ListString.class));

            return (TypeAdapter<T>) new TypeAdapter<Notification200Errors>() {
                @Override
                public void write(JsonWriter out, Notification200Errors value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidIdentifierError`
                    if (value.getActualInstance() instanceof InvalidIdentifierError) {
                        JsonObject obj = adapterInvalidIdentifierError.toJsonTree((InvalidIdentifierError)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListString`
                    if (value.getActualInstance() instanceof ListString) {
                        JsonObject obj = adapterListString.toJsonTree((ListString)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: InvalidIdentifierError, ListString");
                }

                @Override
                public Notification200Errors read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    TypeAdapter actualAdapter = adapterInvalidIdentifierError;
                    Notification200Errors ret = new Notification200Errors();
                    ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                    return ret;
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public Notification200Errors() {
        super("oneOf", Boolean.FALSE);
    }

    public Notification200Errors(InvalidIdentifierError o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Notification200Errors(ListString o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("InvalidIdentifierError", new GenericType<InvalidIdentifierError>() {
        });
        schemas.put("ListString", new GenericType<ListString>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return Notification200Errors.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * InvalidIdentifierError, ListString
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof InvalidIdentifierError) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListString) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be InvalidIdentifierError, ListString");
    }

    /**
     * Get the actual instance, which can be the following:
     * InvalidIdentifierError, ListString
     *
     * @return The actual instance (InvalidIdentifierError, ListString)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvalidIdentifierError`. If the actual instance is not `InvalidIdentifierError`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvalidIdentifierError`
     * @throws ClassCastException if the instance is not `InvalidIdentifierError`
     */
    public InvalidIdentifierError getInvalidIdentifierError() throws ClassCastException {
        return (InvalidIdentifierError)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListString`. If the actual instance is not `ListString`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListString`
     * @throws ClassCastException if the instance is not `ListString`
     */
    public ListString getListString() throws ClassCastException {
        return (ListString)super.getActualInstance();
    }


 /**
  * Create an instance of Notification200Errors given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notification200Errors
  * @throws IOException if the JSON string is invalid with respect to Notification200Errors
  */
  public static Notification200Errors fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notification200Errors.class);
  }

 /**
  * Convert an instance of Notification200Errors to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

