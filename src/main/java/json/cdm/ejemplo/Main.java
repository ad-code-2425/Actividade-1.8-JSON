package json.cdm.ejemplo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import json.cdm.ejemplo.modelo.AnnotatedPerson;
import json.cdm.ejemplo.modelo.Person;

public class Main {

    //Ejemplos de: https://blogs.oracle.com/javamagazine/post/java-json-serialization-jackson

    public static void main(String[] args) {
        var personEmptyCtror = new Person("Grant", "Hughes", 19);
        testJson(personEmptyCtror);

        var annotatedPersonEmptyCtror = new AnnotatedPerson("Annotated Grant", "Annotated Hughes", 20);
        testJson(annotatedPersonEmptyCtror);

        

       
    }
    
    private static void testJson(Object object) {
        String jsonString = toJSON(object);
        fromJSON(jsonString, object.getClass() );
    }
   

    private static void fromJSON(String jsonString, Class<?> destinationClass) {
        var mapper = new ObjectMapper();
        try {
            var grant = mapper.readValue(jsonString, destinationClass);
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
