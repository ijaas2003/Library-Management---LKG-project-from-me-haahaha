package com.library.admin;

import java.util.Scanner;

public class AdminImpl {
  public Admin updateAdmin () {
    Admin admin = getInput();
    return admin;
  }


  /** 
   * @return This will return the Admin pojo
   */
  public Admin getInput () {
    System.out.println("Here tell me admin credientials::::");
    Admin.Builder builder = new Admin.Builder();
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Enter here admin name");
      String name = scan.nextLine();
      System.out.println("Enter here admin password");
      String password = scan.nextLine();

      builder.setName(name);
      builder.setPassword(password);

      return builder.build();
      
    }
  }

}
