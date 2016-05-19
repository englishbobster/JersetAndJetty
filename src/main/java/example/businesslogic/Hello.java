package example.businesslogic;

/**
 * Created by stos on 19/05/16.
 */
public class Hello {

    private String type;
    private String greeting;


    public Hello(String type, String greeting) {
        this.type = type;
        this.greeting = greeting;
    }

    public String getType() {
        return type;
    }

    public String getGreet() {
        return greeting;
    }

    public void changeGreet(String greet) {
        greeting= greet;
    }

}
