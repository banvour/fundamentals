package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise2;

import io.everyonecodes.java.t2_dataserviceclasses.set2.exercise1.Article;

import java.util.List;

public class Magazine {
    private String title;
    private List<Article> articles;

    public Magazine(String title, List<Article> articles) {
        this.title = title;
        this.articles = articles;
    }

    public String getTitle() {
        return title;
    }

    public List<Article> getArticles() {
        return articles;
    }
}
