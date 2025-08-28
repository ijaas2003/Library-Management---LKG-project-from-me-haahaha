package com.library.persistance;

import java.util.ArrayList;
import java.util.List;

import com.library.LibraryConstants;
import com.library.admin.Admin;
import com.library.user.User;

public class Persistance implements PersistanceAPI {
  
  List<User> userList = new ArrayList<>();
  Admin admin;
  Object obj;
  public Persistance (String entity) {
    if (entity.equals(LibraryConstants.USER)) {
      obj = this.userList;
    } else if (entity.equals(LibraryConstants.ADMIN)) {
      obj = this.admin;
    }
  }

  @Override
  public boolean add() {
    return true;
  }

  @Override
  public boolean delete () {
    return true;
  }

  @Override
  public boolean update() {
    return true;
  }

  @Override
  public <T> T get () {
    return (T) obj;
  }
}
