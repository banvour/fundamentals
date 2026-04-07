package io.everyonecodes.java.t11_evaluation2.exercise2;

import io.everyonecodes.java.t11_evaluation2.exercise2.advertisers.CompanyAdvertiser;
import io.everyonecodes.java.t11_evaluation2.exercise2.advertisers.CompanyHorizontalAdvertiser;
import io.everyonecodes.java.t11_evaluation2.exercise2.advertisers.CompanyVerticalAdvertiser;
import io.everyonecodes.java.t11_evaluation2.exercise2.printers.AdvertisementPrinter;
import io.everyonecodes.java.t11_evaluation2.exercise2.printers.AdvertisementRegularPrinter;
import io.everyonecodes.java.t11_evaluation2.exercise2.printers.AdvertisementUppercasePrinter;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Company> companies = List.of(
                new Company("Joe's Bistro", "Come and eat!"),
                new Company("Sally's eatery", "Sally cooks the best!"),
                new Company("FatBurger", "The best burgers in town!")
        );

        List<CompanyAdvertiser> advertisers = List.of(
                new CompanyHorizontalAdvertiser(),
                new CompanyVerticalAdvertiser()
        );

        List<AdvertisementPrinter> printers = List.of(
                new AdvertisementRegularPrinter(),
                new AdvertisementUppercasePrinter()
        );

        for (AdvertisementPrinter printer : printers) {
            for (CompanyAdvertiser advertiser : advertisers) {
                printer.print(companies, advertiser);
            }
        }
    }
}