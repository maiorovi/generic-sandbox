package app.csv;

import app.domain.Person;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;

public class CsvParsing {

    public static void main(String[] args) throws IOException {
        final File src = new File("G:\\Projects\\open-source\\generic-sandbox\\yaml-parsing-sandbox\\src\\main\\resources\\person.csv");

        CsvMapper csvMapper = new CsvMapper();
//        final CsvSchema x = csvMapper.schemaFor(Person.class);
//        final Person o = csvMapper.readerFor(Person.class).with(x).readValue(src);
        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        final Person o = csvMapper.readerFor(Person.class).with(schema).readValue("name,age,address\n" +
                "Nathan Sweet,28,4011 16th Ave S,");
        System.out.println(o);

//        System.out.println(x);
    }
}
