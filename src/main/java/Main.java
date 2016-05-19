import example.businesslogic.HelloFetcher;
import example.jersey.serverimpl.JerseyServer;


public class Main {
    private static final int SERVER_PORT_DEFAULT = 8888;


    public static void main(String args[]) throws InterruptedException {
        HelloFetcher fetcher = new HelloFetcher();
        JerseyServer server = new JerseyServer(fetcher);
        server.startTheServer(SERVER_PORT_DEFAULT);
        while (true) {
            Thread.sleep(10000);
            System.out.println("ALIVE");
        }
    }
}
