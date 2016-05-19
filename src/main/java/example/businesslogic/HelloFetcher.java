package example.businesslogic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stos on 19/05/16.
 */
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
