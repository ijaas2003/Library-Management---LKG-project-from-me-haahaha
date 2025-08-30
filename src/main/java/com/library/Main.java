package com.library;

import java.util.Scanner;

import com.library.user.User;
import com.library.user.UserAPI;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            "Program starts here:: "
        );
        System.out.println("----------------" );
        System.out.println("1. User");
        System.out.println("2. Admin" );
        System.out.println("3. Books" );
        System.out.println("4. Barrowed" );
        System.out.println("----------------" );

        System.out.println("Enter some number:  ");
        try (Scanner scan = new Scanner(System.in)) {
            int s = scan.nextInt();
            switch (s) {
                case 1:
                    UserI userApi = new UserAPI();
                    break;
            
                default:
                    break;
            }
        }
    }
}