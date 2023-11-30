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
package com.linecorp.bot.audience.model;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Create audience for impression-based retargeting
 *
 * @see <a href="https://developers.line.biz/en/reference/messaging-api/#create-imp-audience-group">
 *     Documentation</a>
 */
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record CreateImpBasedAudienceGroupRequest(
    /**
     * The audience&#39;s name. This is case-insensitive, meaning &#x60;AUDIENCE&#x60; and
     * &#x60;audience&#x60; are considered identical. Max character limit: 120
     */
    @JsonProperty("description") String description,
    /**
     * The request ID of a broadcast or narrowcast message sent in the past 60 days. Each Messaging
     * API request has a request ID.
     */
    @JsonProperty("requestId") String requestId) {

  public static class Builder {
    private String description;
    private String requestId;

    public Builder() {}

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder requestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public CreateImpBasedAudienceGroupRequest build() {
      return new CreateImpBasedAudienceGroupRequest(description, requestId);
    }
  }
}
