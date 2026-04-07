package io.everyonecodes.java.t11_evaluation2.review.exercise2.advertisers;

import io.everyonecodes.java.t11_evaluation2.exercise2.Company;

import java.util.List;

public interface CompanyAdvertiser {
    String createAdvertisement(List<Company> companies);
}