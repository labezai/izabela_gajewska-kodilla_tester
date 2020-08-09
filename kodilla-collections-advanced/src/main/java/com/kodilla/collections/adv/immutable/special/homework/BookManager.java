package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Objects;

public class BookManager extends Book{

    private String author;
    private String title;

    public BookManager(String author, String title) {
        super(author, title);
    }

    public Book createBook(String author, String title) {
        this.author = author;
        this.title = title;
        return createBook(author, title);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookManager)) return false;
        BookManager that = (BookManager) o;
        return Objects.equals(author, that.author) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}