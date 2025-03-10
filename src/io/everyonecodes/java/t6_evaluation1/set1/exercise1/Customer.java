package io.everyonecodes.java.t6_evaluation1.set1.exercise1;

import java.util.Objects;

public class Customer {
    private String name;
    private String customerClass;

    public Customer(String name, String customerClass) {
        this.name = name;
        this.customerClass = customerClass;
    }

    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }

    public String getName() {
        return name;
    }

    public String getCustomerClass() {
        return customerClass;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(customerClass, customer.customerClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, customerClass);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerClass='" + customerClass + '\'' +
                '}';
    }
}
