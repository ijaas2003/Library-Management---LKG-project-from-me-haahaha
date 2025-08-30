package com.library.user;

import java.util.List;
import java.util.Scanner;

import com.library.db.DB;
/*
 * @author - Ijaas
 */
import com.library.errors.UserExceptions;
/*
 * @UserImpl - Which is contains the implementation laryer so it contains all the opeartions which need to 
 * perform all the user related operations it support like getList of userList, add new user in the db, 
 * update a new user in the db. delete a user in the db;
 */
public class UserImpl implements UserAPI {

  public UserUtil userUtil;

  public UserImpl () {
    this.userUtil = new UserUtil();
  }

  public UserImpl (UserUtil userUtil) {
    this.userUtil = userUtil;
  }

  @Override
  public User addNewUser () {

    User.Builder userBuilder = new User.Builder();
  
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your name");
    userBuilder.setName(scan.nextLine());
    System.out.println("Enter Email");
    userBuilder.setEmail(scan.nextLine());
    System.out.println("Enter PhoneNumber");
    userBuilder.setPhoneNumber(scan.nextLine());
    System.out.println("Enter password");
    userBuilder.setPassword(scan.nextLine());
    
    User user = userBuilder.build();
    try {
      userUtil.addUserToDB(user);
      System.out.println("\n \n User added successfully");
    } catch (UserExceptions e) {
      System.out.println("Exception occur while inserting user into db");
      return (User) null;
    }
    return user;
  }

  @Override
  public boolean removeUser (Long userId) {
    return true;
  }

  @Override
  public User updateUser () {
    User user = new User();
    return user;
  }

  @Override
  public List<User> getUserList () {
    return DB.usersDb
            .values()
            .stream()
            .toList();
  }

  @Override
  public User getUserDetailsById(Long userId) {
    return new User();
  }
}
