package com.library.user;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

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

  Function<String, Object> getInput = (data) -> {
    Scanner scan = new Scanner(System.in);
    if (data.equals("string")) {
      return scan.next();
    } else if (data.equals("int")) {
      return scan.nextInt();
    } else {
      return scan.nextLong();
    }
  };

  public boolean removeUser (String email) {
    Map<String, User> userDB = DB.usersDb;
    if (userDB.containsKey(email)) {
      userDB.remove(email);
      return true;
    }
    System.out.println("What the fuckkk broo there is no user like in this email!!!!");
    return false;
  }

  public boolean updateUserInDB (User user, String field) {
    DB.usersDb.put(user.getEmail(), user);
    return true;
  }

  public User updateUser (User user, String field, String value) {
    if (field.equals("name")) {
      return new User.Builder(user).setName(value).build();
    } else if (field.equals("ph")) {
      return new User.Builder(user).setPhoneNumber(value).build();
    }
    updateUserInDB(user, field);
    return null;
  }
}
