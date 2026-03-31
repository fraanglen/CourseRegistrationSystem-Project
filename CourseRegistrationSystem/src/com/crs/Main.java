package com.crs;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        RegistrationDAO regDAO = new RegistrationDAO();

        while (true) {
            System.out.println("\n===== COURSE REGISTRATION SYSTEM =====");
            System.out.println("1. Register Student");
            System.out.println("2. Student Login");
            System.out.println("3. Add Course");
            System.out.println("4. View Courses");
            System.out.println("5. Register for Course");
            System.out.println("6. View Registered Courses");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    studentDAO.registerStudent(new Student(name, email, password));
                }
                case 2 -> {
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    if (studentDAO.login(email, password))
                        System.out.println("✅ Login successful!");
                    else
                        System.out.println("❌ Invalid credentials!");
                }
                case 3 -> {
                    System.out.print("Enter course name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter instructor: ");
                    String instructor = sc.nextLine();
                    System.out.print("Enter capacity: ");
                    int capacity = sc.nextInt();
                    courseDAO.addCourse(new Course(cname, instructor, capacity));
                }
                case 4 -> courseDAO.viewCourses();
                case 5 -> {
                    System.out.print("Enter your student ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Enter course ID to register: ");
                    int cid = sc.nextInt();
                    regDAO.registerCourse(sid, cid);
                }
                case 6 -> {
                    System.out.print("Enter your student ID: ");
                    int sid = sc.nextInt();
                    regDAO.viewRegisteredCourses(sid);
                }
                case 7 -> {
                    System.out.println("👋 Exiting system...");
                    System.exit(0);
                }
                default -> System.out.println("❌ Invalid option!");
            }
        }
    }
}
