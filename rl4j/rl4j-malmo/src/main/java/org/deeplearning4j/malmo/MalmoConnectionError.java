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

package org.deeplearning4j.malmo;

/**
 * Exception thrown when Malmo cannot connect to a client after multiple retries
 * @author howard-abrams (howard.abrams@ca.com) on 1/12/17.
 */
public class MalmoConnectionError extends RuntimeException {
    private static final long serialVersionUID = -9034754802977073358L;

    public MalmoConnectionError(String string) {
        super(string);
    }
}
