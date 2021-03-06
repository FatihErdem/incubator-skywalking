/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.collector.receiver.zipkin.define;

import org.apache.skywalking.apm.collector.core.module.ModuleDefine;

/**
 * Zipkin receiver module provides the HTTP, protoc serve for any SDK or agent by following Zipkin format.
 *
 * At this moment, Zipkin format is not compatible with SkyWalking, especially HEADERs.
 * Please don't consider this as a Zipkin-SkyWalking integration,
 * it is provided for adding analysis, aggregation and visualization capabilities to zipkin backend.
 *
 * @author wusheng
 */
public class ZipkinReceiverModule extends ModuleDefine {
    public static final String NAME = "receiver_zipkin";

    @Override public String name() {
        return NAME;
    }

    @Override public Class[] services() {
        return new Class[0];
    }
}
