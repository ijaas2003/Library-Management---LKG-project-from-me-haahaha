package com.library.user;

public class User {

  public Long userId;
  public String name;
  public String email;
  public String password;
  public String phoneNumber;
  /**
   * @return user Name
   */

  public Long getUserId () {
    return this.userId;
  }
  public String getName () {
    return this.name;
  }

  public String password () {
    return this.password;
  }

  public String getEmail () {
    return this.email;
  }

  public String getPhoneNumber () {
    return this.phoneNumber;
  }

  public static class Builder {

    User user = new User();

    Builder () {
      this.user.userId = System.currentTimeMillis();
    }

    public Builder setName (String name) {
      this.user.name = name;
      return this;
    }
    
    public Builder setEmail (String email) {
      this.user.email = email;
      return this;
    }
    
    public Builder setPhoneNumber (String ph) {
      this.user.phoneNumber = ph;
      return this;
    }

    public Builder setPassword (String pw) {
      this.user.password = pw;
      return this;
    }

    public User getUser() {
      return user;
    }
  }
}
