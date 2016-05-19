package example.jersey.serviceImpl;

import example.businesslogic.Hello;
import example.businesslogic.HelloFetcher;
import example.jersey.model.hello.HelloListModel;
import example.jersey.model.hello.HelloModel;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by stos on 19/05/16.
 */
public class HelloAdapter {
    private final HelloFetcher helloFetcher;

    public HelloAdapter(HelloFetcher helloFetcher) {
        this.helloFetcher = helloFetcher;
    }

    public HelloListModel getGreets() {
        List<HelloModel> collect = helloFetcher.getAllGreets().stream()
                .map(greet -> transform(greet)).collect(Collectors.toList());
        return new HelloListModel().hello(collect);
    }

    private HelloModel transform(Hello hello) {
        HelloModel model = new HelloModel();
        if (hello.getType().equalsIgnoreCase("Sweden")){
            model.setSweGreet(hello.getGreet());
        }else if (hello.getType().equalsIgnoreCase("UK")){
            model.setukGreet(hello.getGreet());
        } else {
            model.setdefaultGreet(hello.getGreet());
        }
        return model;
    }


}
