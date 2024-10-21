package json.cdm.ejemplo.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnnotatedPerson {
    @JsonProperty("first_name")
    private String firstName = "";
    @JsonProperty("last_name")
    private String lastName = "";
    private int age = 0;

    public AnnotatedPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Default constructor es necesario
    public AnnotatedPerson() {
    }

    @Override
    public String toString() {
        return "AnnotatedPerson [firs_name=" + firstName + ", last_name=" + lastName + ", age=" + age + "]";
    }

  

}