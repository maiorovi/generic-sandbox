package app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.List;

public class Person {
    private String name;
    private String homeAddress;
    private String age;

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", address='").append(getHomeAddress()).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    @JsonProperty("address")
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
