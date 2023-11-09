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



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** RichMenuResponse */
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record RichMenuResponse(
    /** ID of a rich menu */
    @JsonProperty("richMenuId") String richMenuId,
    /** Get size */
    @JsonProperty("size") RichMenuSize size,
    /** &#x60;true&#x60; to display the rich menu by default. Otherwise, &#x60;false&#x60;. */
    @JsonProperty("selected") Boolean selected,
    /**
     * Name of the rich menu. This value can be used to help manage your rich menus and is not
     * displayed to users.
     */
    @JsonProperty("name") String name,
    /** Text displayed in the chat bar */
    @JsonProperty("chatBarText") String chatBarText,
    /** Array of area objects which define the coordinates and size of tappable areas */
    @JsonProperty("areas") List<RichMenuArea> areas) {

  public static class Builder {
    private String richMenuId;

    private boolean richMenuId$set;

    private RichMenuSize size;

    private boolean size$set;

    private Boolean selected;

    private boolean selected$set;

    private String name;

    private boolean name$set;

    private String chatBarText;

    private boolean chatBarText$set;

    private List<RichMenuArea> areas;

    private boolean areas$set;

    public Builder() {}

    public Builder richMenuId(String richMenuId) {
      this.richMenuId = richMenuId;

      this.richMenuId$set = true;

      return this;
    }

    public Builder size(RichMenuSize size) {
      this.size = size;

      this.size$set = true;

      return this;
    }

    public Builder selected(Boolean selected) {
      this.selected = selected;

      this.selected$set = true;

      return this;
    }

    public Builder name(String name) {
      this.name = name;

      this.name$set = true;

      return this;
    }

    public Builder chatBarText(String chatBarText) {
      this.chatBarText = chatBarText;

      this.chatBarText$set = true;

      return this;
    }

    public Builder areas(List<RichMenuArea> areas) {
      this.areas = areas;

      this.areas$set = true;

      return this;
    }

    public RichMenuResponse build() {

      if (!this.richMenuId$set) {
        throw new IllegalStateException("'richMenuId' must be set for RichMenuResponse.");
      }

      if (!this.size$set) {
        throw new IllegalStateException("'size' must be set for RichMenuResponse.");
      }

      if (!this.selected$set) {
        throw new IllegalStateException("'selected' must be set for RichMenuResponse.");
      }

      if (!this.name$set) {
        throw new IllegalStateException("'name' must be set for RichMenuResponse.");
      }

      if (!this.chatBarText$set) {
        throw new IllegalStateException("'chatBarText' must be set for RichMenuResponse.");
      }

      if (!this.areas$set) {
        throw new IllegalStateException("'areas' must be set for RichMenuResponse.");
      }

      return new RichMenuResponse(richMenuId, size, selected, name, chatBarText, areas);
    }
  }
}
