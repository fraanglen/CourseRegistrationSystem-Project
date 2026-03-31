package com.crs;

import java.util.List;

public class TestCourse {
    public static void main(String[] args) {
        CourseDAO dao = new CourseDAO();

        // Add a new course
        Course c1 = new Course("Java Programming", "Dr. Smith", 50);
        dao.addCourse(c1);

        Course c2 = new Course("Database Systems", "Prof. Johnson", 40);
        dao.addCourse(c2);

        // Fetch and display all courses
        List<Course> courseList = dao.getAllCourses();
        System.out.println("\n📚 Available Courses:");
        for (Course c : courseList) {
            System.out.println(c);
        }
    }
}
