package org.easyplanner.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.easyplanner.model.Task;
import org.springframework.stereotype.Service;


@Service
@Path("/tasks")
public class TaskResource extends BaseResource<Task>
{
    
    @Override
    Class<Task> getEntityClass() {
        return Task.class;
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Task create(Task task) {
        
        return createInDB(task);
    }
    
    @PUT
    @Path("/tasks/{id}")
    @Consumes("application/json")
    public void update(@PathParam("id") long id, Task task) {

        if (id != task.getId()) {
            throw new IllegalArgumentException();
        }
        
        updateInDB(task);
    }
    
    @GET
    @Path("/tasks/{id}")
    @Produces("application/json")
    public Task get(@PathParam("id") long id) {
        
        return getFromDB(id);
    }
    
    @DELETE
    @Path("/tasks/{id}")
    public void delete(@PathParam("id") long id) {
        markDeleted(id);
    }
}