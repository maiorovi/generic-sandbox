package app;

import app.domain.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Period;

public class YamlParsing {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("G:\\Projects\\open-source\\generic-sandbox\\yaml-parsing-sandbox\\src\\main\\resources\\person.yaml");
        final ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        final Person person = objectMapper.readValue(path.toFile(), Person.class);

        System.out.println(person);
    }
}
