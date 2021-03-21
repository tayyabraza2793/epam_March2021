package com.epam.jwd.model;

public class Student extends Person{
    private int course;
    private String university;

    public void setCourse(int course){
        this.course = course;
    }

    public int getCourse() {
        return this.course;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }
}
