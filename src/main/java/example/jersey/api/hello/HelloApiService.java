package example.jersey.api.hello;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 * Created by stos on 19/05/16.
 */
public abstract class HelloApiService {
    public abstract Response retrieveGreets(SecurityContext securityContext) throws NotFoundException;
}
