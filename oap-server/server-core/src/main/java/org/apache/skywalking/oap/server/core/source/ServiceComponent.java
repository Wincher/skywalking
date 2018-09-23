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

package org.apache.skywalking.oap.server.core.source;

import lombok.*;
import org.apache.skywalking.oap.server.core.UnexpectedException;
import org.apache.skywalking.oap.server.core.source.annotation.SourceType;

/**
 * @author peng-yongsheng
 */
@SourceType
public class ServiceComponent extends Source {

    @Override public Scope scope() {
        return Scope.ServiceComponent;
    }


    @Override public String getEntityId() {
        throw new UnexpectedException("ServiceMapping doesn't support getEntityId");
    }


    @Getter @Setter private int serviceId;
    @Getter @Setter private int componentId;
}