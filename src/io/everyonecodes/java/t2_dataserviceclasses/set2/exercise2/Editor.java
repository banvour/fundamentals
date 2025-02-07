package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise2;

import io.everyonecodes.java.t2_dataserviceclasses.set2.exercise1.Article;

import java.util.List;

public class Editor {

    public Magazine writeMagazine() {
        Article article1 = new Article("a", "aaaaaa");
        Article article2 = new Article("b", "bbbbbb");
        Article article3 = new Article("c", "cccccc");

        return new Magazine("the magazine title", List.of(article1, article2, article3));
    }
}
