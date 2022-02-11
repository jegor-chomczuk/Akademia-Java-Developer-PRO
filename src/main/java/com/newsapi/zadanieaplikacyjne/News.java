package com.newsapi.zadanieaplikacyjne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class News {
    private String title;
    private String description;
    private String author;

    public News(String title, String description, String author) {
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ":" + description + ":" + author + "\n";
    }
}
