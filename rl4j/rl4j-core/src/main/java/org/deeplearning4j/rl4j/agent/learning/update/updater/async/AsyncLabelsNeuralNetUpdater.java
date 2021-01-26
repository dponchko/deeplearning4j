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
package org.deeplearning4j.rl4j.agent.learning.update.updater.async;

import org.deeplearning4j.rl4j.agent.learning.update.FeaturesLabels;
import org.deeplearning4j.rl4j.agent.learning.update.Gradients;
import org.deeplearning4j.rl4j.agent.learning.update.updater.INeuralNetUpdater;
import org.deeplearning4j.rl4j.network.ITrainableNeuralNet;

/**
 * A {@link INeuralNetUpdater} that updates a neural network and sync a target network at defined intervals
 */
public class AsyncLabelsNeuralNetUpdater extends BaseAsyncNeuralNetUpdater<FeaturesLabels> {

    /**
     * @param threadCurrent The thread-current network
     * @param sharedNetworksUpdateHandler An instance shared among all threads that updates the shared networks
     */
    public AsyncLabelsNeuralNetUpdater(ITrainableNeuralNet threadCurrent,
                                       AsyncSharedNetworksUpdateHandler sharedNetworksUpdateHandler) {
        super(threadCurrent, sharedNetworksUpdateHandler);
    }

    /**
     * Perform the necessary updates to the networks.
     * @param featuresLabels A {@link FeaturesLabels} that will be used to update the network.
     */
    @Override
    public void update(FeaturesLabels featuresLabels) {
        Gradients gradients = threadCurrent.computeGradients(featuresLabels);
        updateAndSync(gradients);
    }
}
