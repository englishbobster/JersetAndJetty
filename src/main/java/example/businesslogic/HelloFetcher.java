package example.businesslogic;

import java.util.ArrayList;
import java.util.List;

public class HelloFetcher {
   List<Hello> greetings;

    public HelloFetcher(){
        greetings = new ArrayList<>();
        greetings.add(new Hello("Sweden", "Hej"));
        greetings.add(new Hello("UK", "Hiya"));
        greetings.add(new Hello("default", "Tja!"));
    }

    public List<Hello> getAllGreets() {
        return greetings;
    }

}
