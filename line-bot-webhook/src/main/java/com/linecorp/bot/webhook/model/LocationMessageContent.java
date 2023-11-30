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

/** LocationMessageContent */
@JsonTypeName("location")
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record LocationMessageContent(
    /** Message ID */
    @JsonProperty("id") String id,
    /** Title */
    @JsonProperty("title") String title,
    /** Address */
    @JsonProperty("address") String address,
    /** Latitude */
    @JsonProperty("latitude") Double latitude,
    /** Longitude */
    @JsonProperty("longitude") Double longitude)
    implements MessageContent {

  public static class Builder {
    private String id;
    private String title;
    private String address;
    private Double latitude;
    private Double longitude;

    public Builder(String id, Double latitude, Double longitude) {

      this.id = id;

      this.latitude = latitude;

      this.longitude = longitude;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public LocationMessageContent build() {
      return new LocationMessageContent(id, title, address, latitude, longitude);
    }
  }
}
