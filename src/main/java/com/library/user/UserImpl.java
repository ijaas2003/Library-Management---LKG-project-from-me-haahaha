package com.library.user;

// import com.library.LibraryConstants;
// import com.library.db.DB;

public class UserImpl implements UserAPI {
  @Override
  public User addNewUser (User user) {
    return user;
  }

  @Override
  public boolean removeUser (Long userId) {
    return true;
  }

  @Override
  public User updateUser (User user) {
    return user;
  }
}
