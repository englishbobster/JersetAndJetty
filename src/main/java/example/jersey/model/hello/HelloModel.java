package example.jersey.model.hello;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Created by stos on 19/05/16.
 */
public class HelloModel {
    private String sweGreet = null;
    private String ukGreet = null;
    private String defaultGreet = null;

    public HelloModel sweGreet(String sweGreet) {
        this.sweGreet = sweGreet;
        return this;
    }

    @JsonProperty("sweGreet")
    public String getSweGreet() {
        return sweGreet;
    }

    public void setSweGreet(String sweGreet) {
        this.sweGreet = sweGreet;
    }

    public HelloModel ukGreet(String ukGreet) {
        this.ukGreet = ukGreet;
        return this;
    }

    @JsonProperty("ukGreet")
    public String getukGreet() {
        return ukGreet;
    }

    public void setukGreet(String ukGreet) {
        this.ukGreet = ukGreet;
    }

    public HelloModel defaultGreet(String defaultGreet) {
        this.defaultGreet = defaultGreet;
        return this;
    }

    @JsonProperty("defaultGreet")
    public String getdefaultGreet() {
        return defaultGreet;
    }

    public void setdefaultGreet(String defaultGreet) {
        this.defaultGreet = defaultGreet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HelloModel helloModel = (HelloModel) o;
        return Objects.equals(defaultGreet, helloModel.defaultGreet) &&
                Objects.equals(sweGreet, helloModel.sweGreet) &&
                Objects.equals(ukGreet, helloModel.ukGreet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultGreet, sweGreet, ukGreet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HelloModel{\n");
        sb.append("    defaultGreet: ").append(defaultGreet).append("\n");
        sb.append("    UkGreet: ").append(ukGreet).append("\n");
        sb.append("    SweGreet: ").append(sweGreet).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
