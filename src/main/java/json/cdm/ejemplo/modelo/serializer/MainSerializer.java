package json.cdm.ejemplo.modelo.serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import json.cdm.ejemplo.modelo.Person;

public class MainSerializer {

    public static void main(String[] args) {
        var grant = new Person("Grant", "Hughes", 19);

        var mapper = new ObjectMapper()
                .enable(SerializationFeature.INDENT_OUTPUT);

        var module = new SimpleModule();
        module.addSerializer(Person.class, new PersonSerializer());
        mapper.registerModule(module);

        String json;
        try {
            json = mapper.writeValueAsString(grant);
            System.out.println(json);
        } catch (JsonProcessingException e) {
          
            e.printStackTrace();
        }

    }

}
