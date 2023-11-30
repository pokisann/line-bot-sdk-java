/*
 * Copyright 2023 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package com.linecorp.bot.webhook.model;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This event indicates that the LINE Official Account has returned from the suspended state. Sent
 * to the webhook URL server of the module channel.
 */
@JsonTypeName("botResumed")
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record BotResumedEvent(
    /** Get source */
    @JsonProperty("source") Source source,
    /** Time of the event in milliseconds. */
    @JsonProperty("timestamp") Long timestamp,
    /** Get mode */
    @JsonProperty("mode") EventMode mode,
    /**
     * Webhook Event ID. An ID that uniquely identifies a webhook event. This is a string in ULID
     * format.
     */
    @JsonProperty("webhookEventId") String webhookEventId,
    /** Get deliveryContext */
    @JsonProperty("deliveryContext") DeliveryContext deliveryContext)
    implements Event {

  public static class Builder {
    private Source source;
    private Long timestamp;
    private EventMode mode;
    private String webhookEventId;
    private DeliveryContext deliveryContext;

    public Builder(
        Long timestamp, EventMode mode, String webhookEventId, DeliveryContext deliveryContext) {

      this.timestamp = timestamp;

      this.mode = mode;

      this.webhookEventId = webhookEventId;

      this.deliveryContext = deliveryContext;
    }

    public Builder source(Source source) {
      this.source = source;
      return this;
    }

    public BotResumedEvent build() {
      return new BotResumedEvent(source, timestamp, mode, webhookEventId, deliveryContext);
    }
  }
}
