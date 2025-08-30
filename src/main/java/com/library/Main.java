package com.library;

import java.util.Scanner;

import com.library.user.User;
import com.library.user.UserAPI;
import com.library.user.UserService;

public class Main {
    public static void main(String[] args) throws Exception {
        int option = 0;
        var scan = new Scanner(System.in);
        do {
            System.out.println("Program starts here:: ");
            System.out.println("----------------" );
            System.out.println("1. User");
            System.out.println("2. Admin" );
            System.out.println("3. Books" );
            System.out.println("4. Barrowed" );
            System.out.println("5. Stopp!!! kiddinng me" );
            System.out.println("----------------" );
    
            System.out.println("Enter some number:  ");
                int s = scan.nextInt();
                option = s;
                switch (s) {
                    case 1:
                        UserService userApi = new UserService();
                        userApi.doProcess();
                        break;
                
                    default:
                        break;
            }
        } while (option != 5);
    }
}