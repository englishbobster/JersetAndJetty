package example.jersey.api.hello;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public abstract class HelloApiService {
    public abstract Response retrieveGreets(SecurityContext securityContext) throws NotFoundException;
}
