package com.library.user;

import java.util.Scanner;

public class UserService {

  public UserImpl userImpl;

  public UserService() {
    this.userImpl = new UserImpl();
  }

  /**
   * @param userImpl is the instance we can able to cover test cases for this kind of thing....!!!!
   */
  public UserService (UserImpl userImpl) {
    this.userImpl = userImpl;
  }

  /*
   * @doProcess is do the all the operation for the userServices....
   */
  public void doProcess () {

    System.out.println("------------------");
    System.out.println("User Operation starts here");
    System.out.println("1. Show available users");
    System.out.println("2. Add New User");
    System.out.println("3. Need UserDetails");
    System.out.println("4. Delete user");
    System.out.println("5. Update user");
    System.out.println("------------------");

    var scan = new Scanner(System.in);
    try {
      
      int userOptions = scan.nextInt();
      switch (userOptions) {
        case 1:
          System.out.println("-----------SHOW AVAILABLE USER -----------\n \n");
          System.out.println(userImpl.getUserList().toString());
          System.out.println("-----------ENDS AVAILABLE USER -----------");
          break;
        case 2:
          System.out.println("----------ADD USER STARTS------------------\n \n");
          userImpl.addNewUser();
          System.out.println("----------ADD USER ENDS------------------");
          break;
        case 3:
          System.out.println("-----------GET USER DETAILS STARTS-----------\n \n");
          userImpl.getUserDetailsById();
          System.out.println("-----------GET USER DETAILS ENDS-----------");
          break;
        case 4: 
          System.out.println("-----------DELETE USER STARTS-----------\n \n");
          System.out.println("-----------DELETE USER ENDS-----------");
          break;
        case 5:
          System.out.println("-----------UPDATE USER STARTS-----------\n \n");
          System.out.println("-----------UPDATE USER ENDS-----------"); 
          break;
        default:
          break;
      }

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
