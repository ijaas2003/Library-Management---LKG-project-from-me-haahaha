package com.library.user;

public class User {

  public String name;
  public String email;
  public String password;
  public String phoneNumber;

  public User () {
  }
  
  /**
   * @return user Name
   */
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
