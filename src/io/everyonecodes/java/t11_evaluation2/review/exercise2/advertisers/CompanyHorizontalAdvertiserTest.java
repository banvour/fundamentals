package io.everyonecodes.java.t11_evaluation2.review.exercise2.advertisers;

import io.everyonecodes.java.t11_evaluation2.exercise2.Company;
import io.everyonecodes.java.t11_evaluation2.exercise2.advertisers.CompanyHorizontalAdvertiser;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompanyHorizontalAdvertiserTest {

    private final io.everyonecodes.java.t11_evaluation2.exercise2.advertisers.CompanyHorizontalAdvertiser advertiser = new CompanyHorizontalAdvertiser();

    @Test
    void createAdvertisement_example() {
        var companies = List.of(
                new Company("Joe's Bistro", "Come and eat!"),
                new Company("Sally's eatery", "Sally cooks the best!"),
                new Company("FatBurger", "The best burgers in town!")
        );
        String expected = "Joe's Bistro    Sally's eatery    FatBurger";
        assertEquals(expected, advertiser.createAdvertisement(companies));
    }
}