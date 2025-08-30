package com.library.user;

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
    System.out.println("1. available users");
    System.out.println("2. Need UserDetails");
    System.out.println("3. Delete user");
    System.out.println("4. Update user");
    System.out.println("------------------");


  }
}
