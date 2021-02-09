/*
 *  ******************************************************************************
 *  *
 *  *
 *  * This program and the accompanying materials are made available under the
 *  * terms of the Apache License, Version 2.0 which is available at
 *  * https://www.apache.org/licenses/LICENSE-2.0.
 *  *
 *  * See the NOTICE file distributed with this work for additional
 *  * information regarding copyright ownership.
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations
 *  * under the License.
 *  *
 *  * SPDX-License-Identifier: Apache-2.0
 *  *****************************************************************************
 */

package org.nd4j.codegen.api.doc

import org.nd4j.codegen.api.CodeComponent
import org.nd4j.codegen.api.Language


data class DocSection(var scope: DocScope? = null,
                 var language: Language? = null,
                 var text: String? = null) {

    fun applies(language: Language, codeComponent: CodeComponent): Boolean {
        return (this.language === Language.ANY || language === this.language) && scope!!.applies(codeComponent)
    }
}