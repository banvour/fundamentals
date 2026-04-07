package io.everyonecodes.java.t10_consolidation.exercise2;

public class AmericanExpress implements CreditCard {

    @Override
    public boolean checkIfCreditCardIsOfThisType(String creditCardNumber) {
        return (creditCardNumber.length() == 15) && ((creditCardNumber.startsWith("34")) || (creditCardNumber.startsWith("37")));
    }

    @Override
    public String getCreditCardTypeName() {
        return "AMERICAN EXPRESS";
    }
}