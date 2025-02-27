package io.everyonecodes.java.t5b_files.set1.exercise1;

import java.util.List;
import java.util.Optional;

public class HappinessDataParser {

    public Optional<HappinessRecord> parseLine(String LineOfData) {

        try {
            List<String> data = List.of(LineOfData.split(";"));

            String country = data.get(0);
            int rank = Integer.parseInt(data.get(1));
            double score = Double.parseDouble(data.get(2));
            return Optional.of(new HappinessRecord(country, rank, score));

        } catch (IndexOutOfBoundsException e) {
            return Optional.empty();
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
