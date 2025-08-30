package com.library.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.library.db.DB;
import com.library.errors.UserNotFoundException;
/*
 * @UserImpl - Which is contains the implementation laryer so it contains all the opeartions which need to 
 * perform all the user related operations it support like getList of userList, add new user in the db, 
 * update a new user in the db. delete a user in the db;
 */
public class UserImpl implements UserAPI {

  public DB db;

  public UserImpl () {
    this.db = new DB();
  }

  public UserImpl (DB db) {
    this.db = db;
  }

  @Override
  public User addNewUser (User user) {
    int previousSize = db.usersDb.size();
    db.usersDb.put(user.getUserId(), user);
    if (db.usersDb.size() > previousSize ) {
      return user;
    }
    throw new UserNotFoundException("User able to appended")
  }

  @Override
  public boolean removeUser (Long userId) {
    return true;
  }

  @Override
  public User updateUser (User user) {
    return user;
  }

  @Override
  public List<User> getUserList () {
    return db.usersDb
            .values()
            .stream()
            .toList();
  }

  @Override
  public User getUserDetailsById(Long userId) {
    return new User();
  }
}
