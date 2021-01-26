/*
 *  ******************************************************************************
 *  * Copyright (c) 2021 Deeplearning4j Contributors
 *  *
 *  * This program and the accompanying materials are made available under the
 *  * terms of the Apache License, Version 2.0 which is available at
 *  * https://www.apache.org/licenses/LICENSE-2.0.
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations
 *  * under the License.
 *  *
 *  * SPDX-License-Identifier: Apache-2.0
 *  *****************************************************************************
 */

package org.nd4j.remote.clients.serde.impl;

import lombok.NonNull;

/**
 * This class provides JSON ser/de for Java Float. Single value only.
 */
public class FloatSerde extends AbstractSerDe<Float> {
    @Override
    public Float deserialize(@NonNull String json) {
        return deserializeClass(json, Float.class);
    }

    @Override
    public String serialize(@NonNull Float o) {
        return serializeClass(o);
    }
}
