import example.businesslogic.HelloFetcher;
import example.jersey.serverimpl.JerseyServer;

/**
 * Created by stos on 19/05/16.
 */
public class Main {
    private static final String SERVER_PORT_DEFAULT = "8888";


    public static void main(String args[]) throws InterruptedException {
        HelloFetcher fetcher = new HelloFetcher();
        JerseyServer server = new JerseyServer(fetcher);
        server.startTheServer(8888);
        while (true) {
            Thread.sleep(10000);
            System.out.printf("ALIVE");
        }

    }
}
