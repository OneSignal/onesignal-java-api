/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.0.1
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
import com.onesignal.client.model.FilterNotificationTarget;
import com.onesignal.client.model.PlayerNotificationTarget;
import com.onesignal.client.model.SegmentNotificationTarget;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-09T17:51:27.173Z[Etc/UTC]")
public class NotificationTarget extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(NotificationTarget.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!NotificationTarget.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'NotificationTarget' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FilterNotificationTarget> adapterFilterNotificationTarget = gson.getDelegateAdapter(this, TypeToken.get(FilterNotificationTarget.class));
            final TypeAdapter<PlayerNotificationTarget> adapterPlayerNotificationTarget = gson.getDelegateAdapter(this, TypeToken.get(PlayerNotificationTarget.class));
            final TypeAdapter<SegmentNotificationTarget> adapterSegmentNotificationTarget = gson.getDelegateAdapter(this, TypeToken.get(SegmentNotificationTarget.class));

            return (TypeAdapter<T>) new TypeAdapter<NotificationTarget>() {
                @Override
                public void write(JsonWriter out, NotificationTarget value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FilterNotificationTarget`
                    if (value.getActualInstance() instanceof FilterNotificationTarget) {
                        JsonObject obj = adapterFilterNotificationTarget.toJsonTree((FilterNotificationTarget)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PlayerNotificationTarget`
                    if (value.getActualInstance() instanceof PlayerNotificationTarget) {
                        JsonObject obj = adapterPlayerNotificationTarget.toJsonTree((PlayerNotificationTarget)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SegmentNotificationTarget`
                    if (value.getActualInstance() instanceof SegmentNotificationTarget) {
                        JsonObject obj = adapterSegmentNotificationTarget.toJsonTree((SegmentNotificationTarget)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: FilterNotificationTarget, PlayerNotificationTarget, SegmentNotificationTarget");
                }

                @Override
                public NotificationTarget read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize FilterNotificationTarget
                    try {
                        // validate the JSON object to see if any exception is thrown
                        log.log(Level.FINER, "Input data matches schema 'FilterNotificationTarget'");
                        NotificationTarget ret = new NotificationTarget();
                        ret.setActualInstance(adapterFilterNotificationTarget.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FilterNotificationTarget'", e);
                    }

                    // deserialize PlayerNotificationTarget
                    try {
                        // validate the JSON object to see if any exception is thrown
                        log.log(Level.FINER, "Input data matches schema 'PlayerNotificationTarget'");
                        NotificationTarget ret = new NotificationTarget();
                        ret.setActualInstance(adapterPlayerNotificationTarget.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PlayerNotificationTarget'", e);
                    }

                    // deserialize SegmentNotificationTarget
                    try {
                        // validate the JSON object to see if any exception is thrown
                        log.log(Level.FINER, "Input data matches schema 'SegmentNotificationTarget'");
                        NotificationTarget ret = new NotificationTarget();
                        ret.setActualInstance(adapterSegmentNotificationTarget.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SegmentNotificationTarget'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for NotificationTarget: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public NotificationTarget() {
        super("anyOf", Boolean.FALSE);
    }

    public NotificationTarget(FilterNotificationTarget o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NotificationTarget(PlayerNotificationTarget o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NotificationTarget(SegmentNotificationTarget o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FilterNotificationTarget", new GenericType<FilterNotificationTarget>() {
        });
        schemas.put("PlayerNotificationTarget", new GenericType<PlayerNotificationTarget>() {
        });
        schemas.put("SegmentNotificationTarget", new GenericType<SegmentNotificationTarget>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return NotificationTarget.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * FilterNotificationTarget, PlayerNotificationTarget, SegmentNotificationTarget
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FilterNotificationTarget) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PlayerNotificationTarget) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SegmentNotificationTarget) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FilterNotificationTarget, PlayerNotificationTarget, SegmentNotificationTarget");
    }

    /**
     * Get the actual instance, which can be the following:
     * FilterNotificationTarget, PlayerNotificationTarget, SegmentNotificationTarget
     *
     * @return The actual instance (FilterNotificationTarget, PlayerNotificationTarget, SegmentNotificationTarget)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FilterNotificationTarget`. If the actual instance is not `FilterNotificationTarget`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FilterNotificationTarget`
     * @throws ClassCastException if the instance is not `FilterNotificationTarget`
     */
    public FilterNotificationTarget getFilterNotificationTarget() throws ClassCastException {
        return (FilterNotificationTarget)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PlayerNotificationTarget`. If the actual instance is not `PlayerNotificationTarget`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PlayerNotificationTarget`
     * @throws ClassCastException if the instance is not `PlayerNotificationTarget`
     */
    public PlayerNotificationTarget getPlayerNotificationTarget() throws ClassCastException {
        return (PlayerNotificationTarget)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SegmentNotificationTarget`. If the actual instance is not `SegmentNotificationTarget`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SegmentNotificationTarget`
     * @throws ClassCastException if the instance is not `SegmentNotificationTarget`
     */
    public SegmentNotificationTarget getSegmentNotificationTarget() throws ClassCastException {
        return (SegmentNotificationTarget)super.getActualInstance();
    }


 /**
  * Create an instance of NotificationTarget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationTarget
  * @throws IOException if the JSON string is invalid with respect to NotificationTarget
  */
  public static NotificationTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationTarget.class);
  }

 /**
  * Convert an instance of NotificationTarget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

