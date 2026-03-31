package com.crs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/course_db";
            String user = "root";  // your MySQL username
            String password = "1225"; // your MySQL password
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to MySQL successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
