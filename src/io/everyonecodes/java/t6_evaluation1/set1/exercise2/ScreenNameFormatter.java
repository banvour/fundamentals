package io.everyonecodes.java.t6_evaluation1.set1.exercise2;

import io.everyonecodes.java.t6_evaluation1.set1.exercise1.Customer;

public class ScreenNameFormatter {

    public String create(Customer customer) {
        if (customer.getCustomerClass().equalsIgnoreCase("business")) {
            return customer.getName().toUpperCase();
        } else if (customer.getCustomerClass().equalsIgnoreCase("economy")) {
            return customer.getName().toLowerCase();
        } else return "wrong value";
    }
}
