package io.everyonecodes.java.t6_evaluation1.reflection;

public class theory {
    public static void main(String[] args) {
        int counter = 0;
        for (int x = 1; x < 5; x += 2) {
            if (x >= 3) {
                counter++;
            }
        }
        System.out.println(counter);


        int number = 10;
        number = (number - 2) * 5 * 5 + 1;
        System.out.println(number);
    }
}
