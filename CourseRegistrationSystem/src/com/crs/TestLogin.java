package com.crs;

import java.util.Scanner;

public class TestLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (dao.login(email, password)) {
            System.out.println("✅ Login successful!");
        } else {
            System.out.println("❌ Invalid credentials!");
        }

        sc.close();
    }
}
