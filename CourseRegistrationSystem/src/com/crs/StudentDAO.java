package com.crs;
import java.sql.*;

public class StudentDAO {
    public void registerStudent(Student s) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO students(name, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getPassword());
            ps.executeUpdate();
            System.out.println("✅ Student registered successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean login(String email, String password) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM students WHERE email=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
