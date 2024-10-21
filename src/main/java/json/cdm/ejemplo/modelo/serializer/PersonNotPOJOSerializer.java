package json.cdm.ejemplo.modelo.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class PersonNotPOJOSerializer extends StdSerializer<PersonNotPOJO> {
    
    public PersonNotPOJOSerializer() {
        //Empty constructor uses the parameterized constructor below
        this(null);
    }

    public PersonNotPOJOSerializer(Class<PersonNotPOJO> t) {
        super(t);
    }

    @Override
    public void serialize(PersonNotPOJO value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeStringField("first_name", value.firstName());
        gen.writeStringField("last_name", value.lastName());
        gen.writeNumberField("age", value.age());
        gen.writeEndObject();
    }
}