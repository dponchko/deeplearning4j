/*******************************************************************************
 * Copyright (c) 2015-2019 Skymind, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package org.deeplearning4j.nn.weights;

import lombok.EqualsAndHashCode;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * Initialize to a constant value (deafult 0).
 *
 * @author Christian Skarby
 */
@EqualsAndHashCode
public class WeightInitConstant implements IWeightInit {

    private final double value;

    public WeightInitConstant() {
        this(0.0);
    }

    public WeightInitConstant(double value) {
        this.value = value;
    }


    @Override
    public INDArray init(double fanIn, double fanOut, long[] shape, char order, INDArray paramView) {
        paramView.assign(value);
        return paramView.reshape(order, shape);
    }
}
