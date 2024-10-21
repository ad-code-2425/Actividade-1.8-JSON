package json.cdm.ejemplo.modelo.serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class MainSerializer {

    public static void main(String[] args) {
        var grant = new PersonNotPOJO("Grant", "Hughes", 19);

        var mapper = new ObjectMapper()
                .enable(SerializationFeature.INDENT_OUTPUT);

        var module = new SimpleModule();
        module.addSerializer(PersonNotPOJO.class, new PersonNotPOJOSerializer());
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
