package example.jersey.serverImpl;

import example.businesslogic.HelloFetcher;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class JerseyServer {
    private Server server;
    private final ServletContextHandler context;
    private final ServletHolder servlet;

    public JerseyServer(HelloFetcher helloFetcher) {
        ResourceConfig cfg = new JerseyServerConfig(helloFetcher);
        servlet = new ServletHolder(new ServletContainer(cfg));
        servlet.setInitOrder(0);

        context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(servlet, "/*");
    }

    public void startTheServer(int port) {
        server = new Server(port);
        server.setHandler(context);
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            System.out.println("Failed to start jetty server for rest interface");
        } finally {
            server.destroy();
        }
    }

}
