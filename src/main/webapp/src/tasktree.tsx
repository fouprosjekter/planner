

import * as React from "react";

import { InputText } from "primereact/inputtext";
import { Tree } from "primereact/tree";

export default class TaskTree extends React.Component<{}> {

    render() : any {

        return
            <div id="planner-tasktree">
                <div id="planner-task-filter-wrapper">
                    <span className="p-input-icon-left">
                        <i className="pi pi-search" />
                        <InputText id="planner-task-filter"></InputText>
                        <label htmlFor="planner-task-filter">Filter tasks</label>
                    </span>
                </div>
                <div id="planner-tasktree-wrapper">
                    <Tree></Tree>
                </div>
            </div>;
    }
}