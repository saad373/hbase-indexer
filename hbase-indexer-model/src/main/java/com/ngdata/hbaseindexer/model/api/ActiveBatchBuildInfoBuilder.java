/*
 * Copyright 2013 NGDATA nv
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ngdata.hbaseindexer.model.api;

public class ActiveBatchBuildInfoBuilder {
    private String jobId;
    private long submitTime;
    private String trackingUrl;
    private byte[] batchIndexConfiguration;

    public ActiveBatchBuildInfoBuilder jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public ActiveBatchBuildInfoBuilder submitTime(long submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    public ActiveBatchBuildInfoBuilder trackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

    public ActiveBatchBuildInfoBuilder batchIndexConfiguration(byte[] batchIndexConfiguration) {
        this.batchIndexConfiguration = batchIndexConfiguration;
        return this;
    }

    public ActiveBatchBuildInfo build() {
        return new ActiveBatchBuildInfo(jobId, submitTime, trackingUrl, batchIndexConfiguration);
    }
}
