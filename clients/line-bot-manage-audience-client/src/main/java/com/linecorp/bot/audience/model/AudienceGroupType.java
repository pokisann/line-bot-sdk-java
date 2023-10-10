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


package com.linecorp.bot.audience.model;

import java.time.Instant;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;



import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Audience group type
 */
public enum AudienceGroupType {

    
    @JsonProperty("UPLOAD")
  UPLOAD,
    
    @JsonProperty("CLICK")
  CLICK,
    
    @JsonProperty("IMP")
  IMP,
    
    @JsonProperty("CHAT_TAG")
  CHAT_TAG,
    
    @JsonProperty("FRIEND_PATH")
  FRIEND_PATH,
    
    @JsonProperty("RESERVATION")
  RESERVATION,
    
    @JsonProperty("APP_EVENT")
  APP_EVENT,
    
    @JsonProperty("VIDEO_VIEW")
  VIDEO_VIEW,
    
    @JsonProperty("WEBTRAFFIC")
  WEBTRAFFIC,
    
    @JsonProperty("IMAGE_CLICK")
  IMAGE_CLICK,
    
    @JsonProperty("RICHMENU_IMP")
  RICHMENU_IMP,
    
    @JsonProperty("RICHMENU_CLICK")
  RICHMENU_CLICK,
    

    @JsonEnumDefaultValue
    UNDEFINED
}
