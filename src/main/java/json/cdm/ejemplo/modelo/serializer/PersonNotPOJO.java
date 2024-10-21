package json.cdm.ejemplo.modelo.serializer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonNotPOJO {
    
    private final String firstName;
    private final String lastName;
    private final int age;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public PersonNotPOJO(@JsonProperty("first_name") String firstName,
                  @JsonProperty("last_name") String lastName,
                  @JsonProperty("age") int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @JsonProperty("first_name")
    public String firstName() {
        return firstName;
    }

    @JsonProperty("last_name")
    public String lastName() {
        return lastName;
    }

    public int age() {
        return age;
    }
}
