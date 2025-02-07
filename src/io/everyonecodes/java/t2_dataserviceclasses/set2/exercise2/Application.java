package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise2;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazine();

        Printer printer = new Printer();
        printer.print(magazine);
    }
}
