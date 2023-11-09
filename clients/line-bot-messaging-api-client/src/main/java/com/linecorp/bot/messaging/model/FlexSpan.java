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
package com.linecorp.bot.messaging.model;



import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** FlexSpan */
@JsonTypeName("span")
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record FlexSpan(
    /** Get text */
    @JsonProperty("text") String text,
    /** Get size */
    @JsonProperty("size") String size,
    /** Get color */
    @JsonProperty("color") String color,
    /** Get weight */
    @JsonProperty("weight") Weight weight,
    /** Get style */
    @JsonProperty("style") Style style,
    /** Get decoration */
    @JsonProperty("decoration") Decoration decoration)
    implements FlexComponent {
  /** Gets or Sets weight */
  public enum Weight {
    @JsonProperty("regular")
    REGULAR,
    @JsonProperty("bold")
    BOLD,

    @JsonEnumDefaultValue
    UNDEFINED;
  }

  /** Gets or Sets style */
  public enum Style {
    @JsonProperty("normal")
    NORMAL,
    @JsonProperty("italic")
    ITALIC,

    @JsonEnumDefaultValue
    UNDEFINED;
  }

  /** Gets or Sets decoration */
  public enum Decoration {
    @JsonProperty("none")
    NONE,
    @JsonProperty("underline")
    UNDERLINE,
    @JsonProperty("line-through")
    LINE_THROUGH,

    @JsonEnumDefaultValue
    UNDEFINED;
  }

  public static class Builder {
    private String text;

    private String size;

    private String color;

    private Weight weight;

    private Style style;

    private Decoration decoration;

    public Builder() {}

    public Builder text(String text) {
      this.text = text;

      return this;
    }

    public Builder size(String size) {
      this.size = size;

      return this;
    }

    public Builder color(String color) {
      this.color = color;

      return this;
    }

    public Builder weight(Weight weight) {
      this.weight = weight;

      return this;
    }

    public Builder style(Style style) {
      this.style = style;

      return this;
    }

    public Builder decoration(Decoration decoration) {
      this.decoration = decoration;

      return this;
    }

    public FlexSpan build() {

      return new FlexSpan(text, size, color, weight, style, decoration);
    }
  }
}
