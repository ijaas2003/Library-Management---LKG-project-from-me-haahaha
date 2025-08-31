package com.library.user;

import java.util.List;

import com.library.errors.UserExceptions;

public interface  UserAPI {
  public User addNewUser () throws UserExceptions;
  public boolean removeUser (String userId);
  public User updateUser (); 
  public List<User> getUserList ();
  public User getUserDetailsByEmail(String userEmail);
}
