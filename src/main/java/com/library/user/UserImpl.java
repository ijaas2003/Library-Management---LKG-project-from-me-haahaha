package com.library.user;

import java.util.List;
import java.util.Scanner;

import javax.lang.model.type.ErrorType;

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
  public User addNewUser () throws UserExceptions {

    User.Builder userBuilder = new User.Builder();
  
    Scanner scan = new Scanner(System.in);
      System.out.println("Enter your name");
      userBuilder.setName(scan.nextLine());
      System.out.println("Enter Email");
      String email = scan.next();
      if (userUtil.isUserAleadyExist(email)) {
        System.out.println("user already exist ::");
        throw new UserExceptions(com.library.errors.UserExceptions.ErrorType.USER_ALREADY_EXIST, "User Already exist");
      }
      userBuilder.setEmail(email);
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
    System.out.println("--------------------");
    System.out.println("Enter the field you should update Eg:: name/email/ph");
    Scanner scan = new Scanner(System.in);

    String field = scan.next();
    if (!field.equals("name") && !field.equals("email") && !field.equals("ph")) {
      System.out.println("Incorrect field - are you blind???!!!!");
      return null;
    }

    return null;
  }

  @Override
  public List<User> getUserList () {
    return DB.usersDb
            .values()
            .stream()
            .toList();
  }

  public User getUserDetailsById () {
    var scan = new Scanner(System.in);
    System.out.println("Enter the userID:::: ");
    return getUserDetailsByEmail(scan.next()); 
  }

  @Override
  public User getUserDetailsByEmail(String email) {
    User user = userUtil.getUserByEmail(email);
    System.out.println(user);
    return user;
  }
}
