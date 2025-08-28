package com.library.admin;

public class Admin {
  public Long id;
  public String name;
  public String password;

  public Long getId () {
    return this.id;
  }

  public String getName () {
    return this.name;
  }

  public String getPassword () {
    return this.password;
  }

  public static class Builder {
    Admin admin = new Admin();

    public Builder () {
      this.admin.id = System.currentTimeMillis();
    }

    public Builder setName (String name) {
      this.admin.name = name;
      return this;
    }
    
    public Builder setPassword (String password) {
      this.admin.password = password;
      return this;
    }

    public Admin build () {
      return this.admin;
    }
  }
}
