package example.jersey.model.hello;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class HelloListModel {
    private List<HelloModel> hello = new ArrayList<HelloModel>();

    public HelloListModel hello(List<HelloModel> hello) {
        this.hello = hello;
        return this;
    }

    @JsonProperty("Hello")
    public List<HelloModel> getHello() {
        return hello;
    }

    public void setHello(List<HelloModel> greetings) {
        this.hello = greetings;
    }

    @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HelloListModel alarmListSchema = (HelloListModel) o;
    return Objects.equals(hello, alarmListSchema.hello);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hello);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HelloListModel {\n");

    sb.append("    alarm: ").append(hello).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
