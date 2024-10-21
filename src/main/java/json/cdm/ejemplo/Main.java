package json.cdm.ejemplo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import json.cdm.ejemplo.modelo.AnnotatedPersonEmptyCtror;
import json.cdm.ejemplo.modelo.Person;
import json.cdm.ejemplo.modelo.PersonEmptyCtror;

public class Main {

    //Ejemplos de: https://blogs.oracle.com/javamagazine/post/java-json-serialization-jackson

    public static void main(String[] args) {
        var personEmptyCtror = new PersonEmptyCtror("Grant", "Hughes", 19);
        testJson(personEmptyCtror);

        var annotatedPersonEmptyCtror = new AnnotatedPersonEmptyCtror("Annotated Grant", "Annotated Hughes", 20);
        testJson(annotatedPersonEmptyCtror);

        var person = new Person("final Grant", "final Hughes", 21);
        testJson(person);

       
    }
    
    private static void testJson(Object object) {
        String jsonString = toJSON(object);
        fromJSON(jsonString);
    }
   

    private static void fromJSON(String jsonString) {
        var mapper = new ObjectMapper();
        try {
            var grant = mapper.readValue(jsonString, PersonEmptyCtror.class);
            System.out.println(grant);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    private static String toJSON(Object person) {
          // Sin indentación
        // var mapper = new ObjectMapper();
        // Con indentación
        var mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        try {
            var json = mapper.writeValueAsString(person);
            System.out.println(json);
            return json;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
