package json.cdm.ejemplo.modelo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AnnotatedPerson {

    private String firstName;
    private String lastName;
    private int age;

    //para ver las explicación de estas anotaciones, podéis consultar
    //    //Ejemplos de: https://blogs.oracle.com/javamagazine/post/java-json-serialization-jackson
    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public AnnotatedPerson(@JsonProperty("first_name") String firstName, @JsonProperty("last_name") String lastName,
            @JsonProperty("age") int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

 
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "AnnotatedPerson [firs_name=" + firstName + ", last_name=" + lastName + ", age=" + age + "]";
    }

}