package io.everyonecodes.java.t11_evaluation2.review.exercise2.advertisers;

import io.everyonecodes.java.t11_evaluation2.exercise2.Company;
import io.everyonecodes.java.t11_evaluation2.exercise2.advertisers.CompanyAdvertiser;

import java.util.List;
import java.util.stream.Collectors;

public class CompanyVerticalAdvertiser implements CompanyAdvertiser {
    @Override
    public String createAdvertisement(List<Company> companies) {
        return companies.stream()
                .map(c -> c.getName() + ": " + c.getSlogan())
                .collect(Collectors.joining("\n"));
    }
}