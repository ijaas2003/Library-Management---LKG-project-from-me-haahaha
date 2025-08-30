package com.library.db;

import java.util.HashMap;
import java.util.Map;

import com.library.admin.Admin;
import com.library.books.Book;
import com.library.user.User;

public class DB {
  public static Map<Long, User> usersDb = new HashMap<>();
  /**
   *
   */
  public static Map<Long, Book> booksDb = new HashMap<>();
  // TODO make this as Barrow map 
  public static Map<Long, Book> booksDbs = new HashMap<>();
  public static Admin admin;
}
