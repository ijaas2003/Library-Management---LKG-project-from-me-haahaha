package com.library.user;

import java.util.Map;

import com.library.db.DB;
import com.library.errors.UserExceptions;

public class UserUtil {

  public User addUserToDB (User user) throws UserExceptions {
    int previousSize = DB.usersDb.size();
    DB.usersDb.put(user.getEmail(), user);
    if (DB.usersDb.size() > previousSize ) {
      return user;
    }
    throw new UserExceptions(UserExceptions.ErrorType.UNABLE_TO_ADD_SERVER_OPERATION_FAILED, "Unable to add the user in the db");
  }

  public User getUserByEmail (String userEmail) {
    Map<String, User> userMap = DB.usersDb;
    if (userMap.isEmpty()) {
      System.out.println("There is no user exists:::: \n");
    } else if (userEmail != null && userMap.containsKey(userEmail)) {
      return userMap.get(userEmail);
    }
    System.out.println(
      "UserId was wrong so:::: Get the fuckkk out off here"
    );
    return (User) null;
  }

  protected boolean isUserAleadyExist (String email) {
    return DB.usersDb.containsKey(email);
  }
}
