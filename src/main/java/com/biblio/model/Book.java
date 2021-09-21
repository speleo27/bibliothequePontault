package com.biblio.model;

import java.util.Date;

public class Book {
    private String title;
    private String isbn;
    private Date publishDate;

    public Book(String title, String isbn, Date publishDate) {
        this.title = title;
        this.isbn = isbn;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
