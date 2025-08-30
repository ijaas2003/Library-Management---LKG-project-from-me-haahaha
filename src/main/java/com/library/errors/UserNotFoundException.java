package com.library.errors;

public class UserNotFoundException extends Exception {
  public UserNotFoundException (String message) {
    super(message);
  }
}
