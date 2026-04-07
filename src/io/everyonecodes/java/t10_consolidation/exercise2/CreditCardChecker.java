package io.everyonecodes.java.t10_consolidation.exercise2;

import java.util.List;

public class CreditCardChecker {
    private final List<CreditCard> availableCreditCards = List.of(
            new AmericanExpress(),
            new MasterCard(),
            new Visa()
    );

    public String evaluate(String creditCardNumber) {
        if (!checkWithLuhnsAlgorithm(creditCardNumber)) {
            return "INVALID";
        }
        for (CreditCard creditCard : availableCreditCards) {
            if (creditCard.checkIfCreditCardIsOfThisType(creditCardNumber)) {
                return creditCard.getCreditCardTypeName();
            }
        }
        return "NOT SUPPORTED";

    }

    private boolean checkWithLuhnsAlgorithm(String creditCardNumber) {
        boolean digitAlternator = true;
        int sum = 0;

        if (creditCardNumber.isEmpty()) {
            return false;
        }

        for (int i = creditCardNumber.length() - 1; i >= 0; i--) {
            int currentDigit = Character.getNumericValue(creditCardNumber.charAt(i));
            if (currentDigit < 0) {
                return false;
            }
            if (digitAlternator) {
                sum += currentDigit;
                digitAlternator = false;
            } else {
                int doubledDigit = currentDigit * 2;
                sum += (doubledDigit / 10) + (doubledDigit % 10);
                digitAlternator = true;
            }
        }
        return (sum % 10) == 0;
    }
}