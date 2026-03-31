package com.crs;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student("Frank", "frank@example.com", "1234");
        StudentDAO dao = new StudentDAO();
        dao.registerStudent(s);
    }
}
