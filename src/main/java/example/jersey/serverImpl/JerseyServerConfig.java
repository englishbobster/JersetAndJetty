package example.jersey.serverImpl;

import example.businesslogic.HelloFetcher;
import example.jersey.serviceImpl.HelloAdapter;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

public class JerseyServerConfig extends ResourceConfig {

    private final HelloAdapter helloAdapter;

    public JerseyServerConfig(HelloFetcher helloFetcher) {
        helloAdapter = new HelloAdapter(helloFetcher);

        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(helloAdapter).to(HelloAdapter.class);
            }
        });
        packages("example.jersey.api.hello", "example.jersey.api.serviceImpl");
        property(ServerProperties.MEDIA_TYPE_MAPPINGS, "json : application/json");
    }
}
