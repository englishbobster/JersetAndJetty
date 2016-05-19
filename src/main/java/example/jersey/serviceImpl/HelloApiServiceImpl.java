package example.jersey.serviceImpl;

import com.google.common.collect.ImmutableList;
import example.jersey.api.hello.HelloApiService;
import example.jersey.model.hello.HelloModel;

import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.List;

public class HelloApiServiceImpl extends HelloApiService {

    @Inject
    HelloAdapter adapter;

    List<HelloModel> hellos = ImmutableList.of(new HelloModel().sweGreet("Hej"));

    @Override
    public Response retrieveGreets(SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity(adapter.getGreets()).build();
//        return Response.ok().entity(new HelloListModel().hello(hellos)).build();
    }
}
