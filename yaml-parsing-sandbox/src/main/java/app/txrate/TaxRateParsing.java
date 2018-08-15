package app.txrate;

import app.domain.txrate.TaxRate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class TaxRateParsing {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("/app/Projects/open-source/generic-sandbox/yaml-parsing-sandbox/src/main/resources/taxrate.yaml");
        final ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        final List<Map<String, TaxRate>> rate = objectMapper.readValue(path.toFile(), List.class);

        System.out.println(rate);
    }
}
