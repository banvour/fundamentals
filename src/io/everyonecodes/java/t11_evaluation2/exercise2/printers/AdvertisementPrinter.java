package io.everyonecodes.java.t11_evaluation2.exercise2.printers;

import io.everyonecodes.java.t11_evaluation2.exercise2.Company;
import io.everyonecodes.java.t11_evaluation2.exercise2.advertisers.CompanyAdvertiser;

import java.util.List;

public interface AdvertisementPrinter {
    void print(List<Company> companies, CompanyAdvertiser advertiser);
}