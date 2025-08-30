package com.library.user;

import java.util.List;

public interface  UserAPI {
  public User addNewUser (User user);
  public boolean removeUser (Long userId);
  public User updateUser (User user); 
  public List<User> getUserList ();
  public User getUserDetailsById(Long userId);
}
