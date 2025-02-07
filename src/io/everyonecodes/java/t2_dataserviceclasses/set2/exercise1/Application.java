package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise1;

public class Application {
    public static void main(String[] args) {
        Article article = new Article("taitel", "texxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxt much text");

        ArticlePrinter printer = new ArticlePrinter();

        printer.print(article);
    }
}
