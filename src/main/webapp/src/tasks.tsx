

import * as React from "react";

import { Splitter, SplitterPanel } from "primereact/splitter";

import TaskTree from "./tasktree";
import TaskView from "./taskview";

export default class Tasks extends React.Component<{}> {

    render() : any {

        return <div id="planner-tasks">
            <Splitter id="planner-tasks-splitter">
                <SplitterPanel size={20}>
                    <TaskTree/>
                </SplitterPanel>
                <SplitterPanel size={80}>
                    <TaskView name="Test Task"/>
                </SplitterPanel>
            </Splitter>
        </div>;
    }
}