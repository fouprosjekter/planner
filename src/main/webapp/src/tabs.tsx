
import * as React from "react";

import { TabView, TabPanel } from "primereact/tabview";

import Tasks from "./tasks";

export default class Tabs extends React.Component<{}> {

    render() : any {

        return <div>
            <TabView>
                <TabPanel header="Tasks">
                    <Tasks/>
                </TabPanel>
                <TabPanel header="Planning Sessions"></TabPanel>
                <TabPanel header="Prioritization"></TabPanel>
            </TabView>


        </div>;
    }
}