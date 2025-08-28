package com.library.user;

public interface  UserAPI {
  public User addNewUser (User user);
  public boolean removeUser (Long userId);
  public User updateUser (User user); 
}
