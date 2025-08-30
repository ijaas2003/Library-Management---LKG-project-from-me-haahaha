package com.library.user;

import java.util.List;

public interface  UserAPI {
  public User addNewUser ();
  public boolean removeUser (Long userId);
  public User updateUser (); 
  public List<User> getUserList ();
  public User getUserDetailsById(Long userId);
}
