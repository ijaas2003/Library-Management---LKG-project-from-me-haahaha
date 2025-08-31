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
      userBuilder.setPhoneNumber(scan.next());
      System.out.println("Enter password");
      userBuilder.setPassword(scan.next());
    
    
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
  public User updateUser () {
    System.out.println("--------------------");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the email:::");
    String email = scan.next();
    if (!userUtil.isUserAleadyExist(email)) {
      System.out.println("There is no data is present!!! Heyyy are you trying to update a data not even exist are you kidding me bruhhh");
    }
    System.out.println("Enter the field you should update Eg:: name/email/ph");
    String field = scan.next();
    
    if (!field.equals("name") && !field.equals("ph")) {
      System.out.println("Incorrect field - are you blind???!!!!");
      return null;
    }
    System.out.println("Enter the " + field + "updated one");
    String updatedValue = scan.next();
    User user = userUtil.getUserByEmail(email);
    return userUtil.updateUser (user, field, updatedValue);
  }

  @Override
  public List<User> getUserList () {
    return DB.usersDb
            .values()
            .stream()
            .toList();
  }

  public User getUserDetailsByEmail () {
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

  public boolean removeUser () {
    System.out.println("--------------------------");
    System.out.println("Enter your email to delete");
    String email = (String) userUtil.getInput.apply("string");
    return removeUser(email);
  }

  @Override
  public boolean removeUser (String email) {
    if (userUtil.removeUser(email)) {
      System.out.println("Successfully deleted::: thank you buddy!!!");
      return true;
    }
    return false;
  }
}
