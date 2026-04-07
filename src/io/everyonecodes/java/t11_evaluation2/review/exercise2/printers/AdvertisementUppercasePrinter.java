package io.everyonecodes.java.t11_evaluation2.review.exercise2.printers;

import io.everyonecodes.java.t11_evaluation2.exercise2.Company;
import io.everyonecodes.java.t11_evaluation2.exercise2.advertisers.CompanyAdvertiser;
import io.everyonecodes.java.t11_evaluation2.exercise2.printers.AdvertisementPrinter;

import java.util.List;

public class AdvertisementUppercasePrinter implements AdvertisementPrinter {
    @Override
    public void print(List<Company> companies, CompanyAdvertiser advertiser) {
        String ad = advertiser.createAdvertisement(companies).toUpperCase();
        System.out.println(ad);
    }
}