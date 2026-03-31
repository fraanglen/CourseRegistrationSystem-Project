package com.crs;

import java.util.List;

public class TestRegistration {
    public static void main(String[] args) {
        RegistrationDAO dao = new RegistrationDAO();

        // Example: student with ID 1 registers for course ID 2
        dao.registerCourse(1, 2);

        // Display all registered courses for that student
        List<Registration> regList = dao.getRegistrationsByStudent(1);

        System.out.println("\n📘 Courses registered by student ID 1:");
        for (Registration r : regList) {
            System.out.println(r);
        }
    }
}
