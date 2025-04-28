package io.everyonecodes.java.t10_consolidation.exercise2;

public class MasterCard implements CreditCard {
    @Override
    public boolean checkIfCreditCardIsOfThisType(String creditCardNumber) {
        return (creditCardNumber.length() == 16) && ((creditCardNumber.startsWith("51")) || (creditCardNumber.startsWith("52")) || (creditCardNumber.startsWith("53")) || (creditCardNumber.startsWith("54")) || (creditCardNumber.startsWith("55")));
    }

    @Override
    public String getCreditCardTypeName() {
        return "MASTERCARD";
    }
}