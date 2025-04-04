package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class DataReader {
    private static final DataParser dataParser = new DataParser();

    public List<Customer> readCustomerFile(String filePath) throws IOException {
        List<Customer> records = new ArrayList<>();
        List<String> lines = Files.readAllLines(Path.of(filePath));

        for (int i = 1; i < lines.size(); i++) {
            Optional<Customer> recordOpt = dataParser.parseCustomerLine(lines.get(i));
            if (recordOpt.isPresent()) {
                records.add(recordOpt.get());
            }
        }
        return records;
    }

    public List<Product> readProductFile(String filePath) throws IOException {
        List<Product> records = new ArrayList<>();
        List<String> lines = Files.readAllLines(Path.of(filePath));

        for (int i = 1; i < lines.size(); i++) {
            Optional<Product> recordOpt = dataParser.parseProductLine(lines.get(i));
            if (recordOpt.isPresent()) {
                records.add(recordOpt.get());
            }
        }
        return records;
    }
}