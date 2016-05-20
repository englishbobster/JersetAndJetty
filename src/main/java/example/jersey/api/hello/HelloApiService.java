package example.jersey.api.hello;

import example.jersey.serviceImpl.HelloAdapter;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public abstract class HelloApiService {
    public abstract Response retrieveGreets(SecurityContext securityContext, HelloAdapter adapter) throws NotFoundException;
}
