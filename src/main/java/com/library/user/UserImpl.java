package com.library.user;

import com.library.LibraryConstants;
import com.library.persistance.Persistance;

public class UserImpl implements UserAPI {
  @Override
  public User addNewUser (User user) {
    Persistance persistance = new Persistance(LibraryConstants.USER);
    persistance.add(user);
  }

  @Override
  public boolean removeUser (Long userId) {
  }

  @Override
  public User updateUser (User user) {
  }
}
