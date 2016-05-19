package example.jersey.serverimpl;

import example.businesslogic.HelloFetcher;
import example.jersey.serviceImpl.HelloAdapter;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

/**
 * Created by stos on 19/05/16.
 */
public class JerseyServerConfig extends ResourceConfig {
    public JerseyServerConfig(HelloFetcher helloFetcher) {
        final HelloAdapter helloAdapter = new HelloAdapter(helloFetcher);

        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(helloAdapter).to(HelloAdapter.class);
            }
        });
        packages("example.jersey");
        property(ServerProperties.MEDIA_TYPE_MAPPINGS, "json : application/json");
    }
}
