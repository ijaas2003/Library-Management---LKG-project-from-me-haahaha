package com.library.user;

import com.library.db.DB;
import com.library.errors.UserExceptions;

public class UserUtil {
  
  public User addUserToDB (User user) throws UserExceptions {
    int previousSize = DB.usersDb.size();
    DB.usersDb.put(user.getUserId(), user);
    if (DB.usersDb.size() > previousSize ) {
      return user;
    }
    throw new UserExceptions(UserExceptions.ErrorType.UNABLE_TO_ADD_SERVER_OPERATION_FAILED, "Unable to add the user in the db");
  }
}
