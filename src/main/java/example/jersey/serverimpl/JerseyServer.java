package example.jersey.serverimpl;

import example.businesslogic.HelloFetcher;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

/**
 * Created by stos on 19/05/16.
 */
public class JerseyServer {
    private static final int LOAD_ON_STARTUP = 1;
    private Server server;
    private final ServletContextHandler context;
    private final ServletHolder servlet;

    public JerseyServer(HelloFetcher helloFetcher) {
        ResourceConfig cfg = new JerseyServerConfig(helloFetcher);
        servlet = new ServletHolder(new ServletContainer(cfg));
        servlet.setInitOrder(LOAD_ON_STARTUP);

        context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(servlet, "/*");
    }

    private void startServlet() {
        try {
            servlet.start();
            servlet.initialize();
        } catch (Exception e) {
            System.out.printf("Failed to start the server.");
        }
    }

    public void startTheServer(int port) {
        server = new Server(port);
        server.setHandler(context);
        try {
            server.start();
            server.join();
            startServlet();
        } catch (Exception e) {
            System.out.println("Failed to start jetty server for rest interface");
        } finally {
            server.destroy();
        }
    }

}
