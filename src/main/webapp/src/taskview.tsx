



import * as React from "react";

import { InputText } from "primereact/inputtext";
import { ListBox } from "primereact/listbox";

export interface TaskProps {

    name : string;
}

class TaskState {

}


export default class TaskView extends React.Component<TaskProps, TaskState> {

    constructor (props : TaskProps) {
        super(props);
    }

    render() : any {

        return <div id="planner-taskview">
            <div className="planner-task-title">Task {this.props.name}</div>
            <ListBox/>
        </div>;
    }
}