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

/// <reference path="../typedefs/jquery.d.ts" />
/// <reference path="Style.ts" />
/// <reference path="ComponentType.ts" />


abstract class Component {

    private componentType: ComponentType;

    constructor(componentType: ComponentType){
        this.componentType = componentType;
    }

    public getComponentType(){
        return this.componentType;
    }

    /* Parse the JSON string that represents a component, and build that component
     * Assumption here: the format is like '{"ComponentTable": {...}}' - i.e., as generated by Jackson for the Java objects
     *  */
    public static getComponent(jsonStr: string): Renderable {

        var json: any = JSON.parse(jsonStr);
        var key: string;
        if(json["componentType"]) key = json["componentType"];  //No wrapper object case...
        else key = Object.keys(json)[0];    //Typical wrapper object case



        switch(key){
            case ComponentType[ComponentType.ComponentText]:
                return new ComponentText(jsonStr);

            case ComponentType[ComponentType.ComponentTable]:
                return new ComponentTable(jsonStr);

            case ComponentType[ComponentType.ChartHistogram]:
                return new ChartHistogram(jsonStr);

            case ComponentType[ComponentType.ChartHorizontalBar]:
                throw new Error("Horizontal bar chart: not yet implemented");

            case ComponentType[ComponentType.ChartLine]:
                return new ChartLine(jsonStr);

            case ComponentType[ComponentType.ChartScatter]:
                return new ChartScatter(jsonStr);

            case ComponentType[ComponentType.ChartStackedArea]:
                return new ChartStackedArea(jsonStr);

            case ComponentType[ComponentType.ChartTimeline]:
                return new ChartTimeline(jsonStr);

            case ComponentType[ComponentType.DecoratorAccordion]:
                return new DecoratorAccordion(jsonStr);

            case ComponentType[ComponentType.ComponentDiv]:
                return new ComponentDiv(jsonStr);

            default:
                throw new Error("Unknown component type \"" + key + "\" or invalid JSON: \"" + jsonStr + "\"");
        }
    }
}






