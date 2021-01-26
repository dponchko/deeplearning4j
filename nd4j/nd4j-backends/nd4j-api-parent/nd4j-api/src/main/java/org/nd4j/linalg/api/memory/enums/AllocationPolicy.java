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

package org.nd4j.linalg.api.memory.enums;

/**
 * @author raver119@gmail.com
 */
public enum AllocationPolicy {
    /**
     * This policy means - we're allocating exact values we specify for WorkspaceConfiguration.initialSize, or learn during loops
     */
    STRICT,

    /**
     * This policy means - we'll be overallocating memory, following WorkspaceConfiguration.overallocationLimit
     */
    OVERALLOCATE,
}
