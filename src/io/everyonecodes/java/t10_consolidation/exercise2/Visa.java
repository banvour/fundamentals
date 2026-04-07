package io.everyonecodes.java.t10_consolidation.exercise2;

public class Visa implements CreditCard {
    @Override
    public boolean checkIfCreditCardIsOfThisType(String creditCardNumber) {
        return ((creditCardNumber.length() == 13) || (creditCardNumber.length() == 16)) && (creditCardNumber.startsWith("4"));
    }

    @Override
    public String getCreditCardTypeName() {
        return "VISA";
    }
}
