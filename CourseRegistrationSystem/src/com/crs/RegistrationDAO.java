package com.crs;
import java.sql.*;

public class RegistrationDAO {

    // Register a student for a course
    public void registerCourse(int studentId, int courseId) {
        String sql = "INSERT INTO registrations(student_id, course_id) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            ps.setInt(2, courseId);
            ps.executeUpdate();
            System.out.println("✅ Student registered for the course successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 🔹 View all courses registered by a student (this is what your Main.java calls)
    public void viewRegisteredCourses(int studentId) {
        String sql = """
            SELECT r.reg_id, c.course_name, c.instructor
            FROM registrations r
            JOIN courses c ON r.course_id = c.course_id
            WHERE r.student_id = ?;
            """;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();
            System.out.println("\n📘 Your Registered Courses:");
            while (rs.next()) {
                System.out.printf("Reg ID: %d | Course: %s | Instructor: %s%n",
                        rs.getInt("reg_id"),
                        rs.getString("course_name"),
                        rs.getString("instructor"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
