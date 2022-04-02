package org.easyplanner.rest;

import javax.ws.rs.Path;

import org.easyplanner.model.PlanningSession;

@Path("/planningSession")
public class PlanningSessionResource extends BaseResource<PlanningSession> {

    @Override
    Class<PlanningSession> getEntityClass() {
        return PlanningSession.class;
    }
}
