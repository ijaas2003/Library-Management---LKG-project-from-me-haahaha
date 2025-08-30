package com.library.db;

import java.util.HashMap;
import java.util.Map;

import com.library.admin.Admin;
import com.library.books.Book;
import com.library.user.User;

public class DB {
  public Map<Long, User> usersDb = new HashMap<>();
  /**
   *
   */
  public Map<Long, Book> booksDb = new HashMap<>();
  // TODO make this as Barrow map 
  public Map<Long, Book> booksDbs = new HashMap<>();
  public Admin admin;
}
