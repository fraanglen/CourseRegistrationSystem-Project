package com.crs;
import java.sql.*;

public class CourseDAO {

    // Add a course
    public void addCourse(Course c) {
        String sql = "INSERT INTO courses(course_name, instructor, capacity) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, c.getCourseName());
            ps.setString(2, c.getInstructor());
            ps.setInt(3, c.getCapacity());
            ps.executeUpdate();
            System.out.println("✅ Course added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 🔹 View all courses (this is what your Main.java calls)
    public void viewCourses() {
        String sql = "SELECT * FROM courses";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n📚 Available Courses:");
            while (rs.next()) {
                System.out.printf("ID: %d | Name: %s | Instructor: %s | Capacity: %d%n",
                        rs.getInt("course_id"),
                        rs.getString("course_name"),
                        rs.getString("instructor"),
                        rs.getInt("capacity"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
