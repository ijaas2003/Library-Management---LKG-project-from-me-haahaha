package com.library.user;

public class User {

  private String name;
  private String email;
  private String phoneNumber;

  public User () {
  }

  public static class Builder {
    User user = new User();

    public Builder setName (String name) {
      this.user.name = name;
      return this;
    }
    
    public Builder setEmail (String email) {
      this.user.email = email;
      return this;
    }
  }
}
