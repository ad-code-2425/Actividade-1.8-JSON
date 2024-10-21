package json.cdm.ejemplo.modelo.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import json.cdm.ejemplo.modelo.Person;

public class PersonSerializer extends StdSerializer<Person> {
    
    public PersonSerializer() {
        //Empty constructor uses the parameterized constructor below
        this(null);
    }

    public PersonSerializer(Class<Person> t) {
        super(t);
    }

    @Override
    public void serialize(Person value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeStringField("first_name", value.firstName());
        gen.writeStringField("last_name", value.lastName());
        gen.writeNumberField("age", value.age());
        gen.writeEndObject();
    }
}