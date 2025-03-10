package io.everyonecodes.java.t6_evaluation1.set1.exercise4;

import io.everyonecodes.java.t6_evaluation1.set1.exercise3.Blog;

import java.util.Objects;
import java.util.Optional;

public class Website {
    private String url;
    private String content;
    private Optional<Blog> blog;

    public Website(String url, String content, Optional<Blog> blog) {
        this.url = url;
        this.content = content;
        this.blog = blog;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }

    public Optional<Blog> getBlog() {
        return blog;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Website website = (Website) o;
        return Objects.equals(url, website.url) && Objects.equals(content, website.content) && Objects.equals(blog, website.blog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, content, blog);
    }
}
