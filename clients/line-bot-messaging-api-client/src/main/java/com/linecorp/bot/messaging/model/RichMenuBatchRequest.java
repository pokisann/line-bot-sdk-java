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

/** RichMenuBatchRequest */
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record RichMenuBatchRequest(
    /** Array of Rich menu operation object... */
    @JsonProperty("operations") List<RichMenuBatchOperation> operations,
    /** Key for retry. Key value is a string matching the regular expression pattern */
    @JsonProperty("resumeRequestKey") String resumeRequestKey) {

  public static class Builder {
    private List<RichMenuBatchOperation> operations;

    private boolean operations$set;

    private String resumeRequestKey;

    public Builder() {}

    public Builder operations(List<RichMenuBatchOperation> operations) {
      this.operations = operations;

      this.operations$set = true;

      return this;
    }

    public Builder resumeRequestKey(String resumeRequestKey) {
      this.resumeRequestKey = resumeRequestKey;

      return this;
    }

    public RichMenuBatchRequest build() {

      if (!this.operations$set) {
        throw new IllegalStateException("'operations' must be set for RichMenuBatchRequest.");
      }

      return new RichMenuBatchRequest(operations, resumeRequestKey);
    }
  }
}
