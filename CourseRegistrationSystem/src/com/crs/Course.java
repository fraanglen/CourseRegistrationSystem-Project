package com.crs;

public class Course {
    private int courseId;
    private String courseName;
    private String instructor;
    private int capacity;

    // Constructor (without ID for insertion)
    public Course(String courseName, String instructor, int capacity) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.capacity = capacity;
    }

    // Constructor (with ID)
    public Course(int courseId, String courseName, String instructor, int capacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.capacity = capacity;
    }

    // Getters and setters
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Name: " + courseName +
               ", Instructor: " + instructor + ", Capacity: " + capacity;
    }
}
