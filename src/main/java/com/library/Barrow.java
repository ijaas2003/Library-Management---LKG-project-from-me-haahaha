package com.library;

import com.library.books.Book;
import com.library.user.User;

public class Barrow {
  public Long barrowId;
  public Book book;
  public User user;

  public Long getBarrowId() {
    return barrowId;
  }
  public User getUser() {
      return user;
  }
  public Book getBook() {
    return book;
  }
  public static class Builder {
    
    Builder () {
      this.barrow.barrowId = System.currentTimeMillis();
    }
    
    Barrow barrow = new Barrow();
    public void setBook(Book book) {
      this.barrow.book = book;
    }
    
    public void setUser(User user) {
      this.barrow.user = user;
    }
  }
}
