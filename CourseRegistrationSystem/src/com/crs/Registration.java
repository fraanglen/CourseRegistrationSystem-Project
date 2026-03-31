package com.crs;

public class Registration {
    private int regId;
    private int studentId;
    private int courseId;

    // Constructor without regId (for inserting)
    public Registration(int studentId, int courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    // Constructor with regId
    public Registration(int regId, int studentId, int courseId) {
        this.regId = regId;
        this.studentId = studentId;
        this.courseId = courseId;
    }

    // Getters
    public int getRegId() {
        return regId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    @Override
    public String toString() {
        return "Registration ID: " + regId +
               ", Student ID: " + studentId +
               ", Course ID: " + courseId;
    }
}
