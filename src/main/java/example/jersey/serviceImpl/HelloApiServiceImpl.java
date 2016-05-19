package example.jersey.serviceImpl;

import example.jersey.api.hello.HelloApiService;

import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public class HelloApiServiceImpl extends HelloApiService {

    @Inject
    private HelloAdapter adapter;


    @Override
    public Response retrieveGreets(SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity(adapter.getGreets()).build();

/*
 Use this to test if everything is working as it should be
        List<HelloModel> hellos = ImmutableList.of(new HelloModel().sweGreet("Hej"));
        return Response.ok().entity(new HelloListModel().hello(hellos)).build();
*/
    }
}
