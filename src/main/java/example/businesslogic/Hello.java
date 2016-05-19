package example.businesslogic;

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
