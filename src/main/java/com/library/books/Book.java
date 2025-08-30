package com.library.books;

public class Book {
  private Long bookId;
  private String name;
  private String Author;

  public Long getBookId () {
    return this.bookId;
  }

  public String getname () {
    return this.name;
  }

  public String getAuthor () {
    return this.Author;
  }

  public static class Builder {
    Book book = new Book();

    public Builder setBookId (Long bookId) {
      this.book.bookId = bookId;
      return this;
    }

    public Builder setName (String name) {
      this.book.name = name;
      return this;
    }

    public Builder setAuthor (String authorName) {
      this.book.Author = authorName;
      return this;
    }

    public Book build() {
      return this.book;
    }
  }
}
