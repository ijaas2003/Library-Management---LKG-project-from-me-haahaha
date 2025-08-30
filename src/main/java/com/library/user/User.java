package com.library.user;

public class User {

  private Long userId;
  private String name;
  private String email;
  private String password;
  private String phoneNumber;
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

  @Override
  public String toString() {
    return "\n" + "{" + 
            "userId=" + userId +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}' + "\n";
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

    public User build () {
      return user;
    }
  }
}
