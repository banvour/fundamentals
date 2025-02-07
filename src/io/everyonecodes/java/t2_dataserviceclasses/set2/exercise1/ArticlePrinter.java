package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise1;

public class ArticlePrinter {
    public void print(Article article) {
        System.out.println(article.getTitle()
                + "\n" + article.getText());
    }
}
