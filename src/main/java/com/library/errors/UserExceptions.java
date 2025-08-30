package com.library.errors;

public class UserExceptions extends Exception {

  public enum ErrorType {
        USER_NOT_FOUND,
        BOOK_NOT_AVAILABLE,
        INVALID_OPERATION,
        USER_ALREADY_EXIST,
        UNABLE_TO_ADD_SERVER_OPERATION_FAILED;
  }

  private final ErrorType type;

  public UserExceptions(ErrorType type, String message) {
    super(message);
    this.type = type;
  }

  public ErrorType getType() {
    return type;
  }

}
